package com.baobaotao.test;

import java.lang.reflect.Method;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import com.baobaotao.test.aspect.Waitrees;
import com.baobaotao.test.autotest.Animal;
import com.baobaotao.test.autotest.Animals;
import com.baobaotao.test.autotest.Bird;
import com.baobaotao.test.conftest.AnimalConfig;
import com.baobaotao.test.proxy.UpdateServiceImpl;
import com.baobaotao.test.springadvice.Waiter;

public class BeanFactoryTest {
	public static void main(String[] args) throws Exception {
		new BeanFactoryTest().method17();
	}
	public void originMethod1(){
		Resource resource=new PathMatchingResourcePatternResolver().getResource("classpath:applicationContext.xml");
		BeanFactory beanFactory=new XmlBeanFactory(resource);
		Car car=beanFactory.getBean("car1", Car.class);
		System.out.println(car.getBrand());
	}
	public void method2(){
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Car car=context.getBean("car1", Car.class);
		System.out.println(car.getBrand());
	}
	public void method3(){
		ApplicationContext context=new AnnotationConfigApplicationContext(Beans.class);
		Car car=context.getBean("car", Car.class);
		System.out.println(car.getBrand());
	}
	public void method4(){
		BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("applicationcontext.xml"));
		((ConfigurableBeanFactory)beanFactory).addBeanPostProcessor(new MyBeanPostProcessor());
		((ConfigurableBeanFactory)beanFactory).addBeanPostProcessor(new MyInstantiationAwarebeanPostProcessor());
		Car car1=beanFactory.getBean("car", Car.class);
		System.out.println(car1);
		//
		Car car2=beanFactory.getBean("car",Car.class);
		System.out.println("car1==car2:"+(car1==car2));
		((XmlBeanFactory)beanFactory).destroySingletons();
	}
	public void method5(){
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
		Tree tree=context.getBean("tree", Tree.class);
		System.out.println(tree.getiDCode());
	}
	
	public  void method6(){
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
		Car car=context.getBean("car3", Car.class);
		System.out.println(car.getColor());
		System.out.println(car.getBrand());
	}
	public void method7(){
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
		Car car=context.getBean("car",Car.class);
		System.out.println(car.getBrand()==null);
	}
	//级联
	public void method8(){
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
		Tree tree=context.getBean("tree2", Tree.class);
		System.out.println(tree.getCar().getBrand());
		System.out.println(tree.getCar().getMaxSpeed());
	}
	public void method9(){
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
		Boss boss=context.getBean("boss", Boss.class);
		Map<String,Car> map=boss.getMap();
		for(String key:map.keySet()){
			System.out.println("key:"+map.get(key).getBrand());
		}
	}
	public void method10(){
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
		MagicBoss boss=context.getBean("magicBoss", MagicBoss.class);
		Car car=boss.getCar();
		System.out.println(car.getBrand());
	}
	
	public void method11(){
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
		Animals animals=context.getBean("animals",Animals.class);
		List<Animal> list=animals.getAnimalList();
		for(int i=0;i<list.size();i++){
			list.get(i).move();
		}
	}
	public void method12(){
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
		AnimalConfig animalConfig=context.getBean("animalConfig", AnimalConfig.class);
		Car car=animalConfig.getCar();
		Car car2=animalConfig.getCar();
		System.out.println(car==car2);
	}
	public void method13(){
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
		Car car=context.getBean("car4", Car.class);
		System.out.println(car.getColor());	
	}
	public void method14(){
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
		Bird bird=context.getBean("bird", Bird.class);
		System.out.println(bird.getName());
	}
	public void method15(){
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
		Car car=context.getBean("car4", Car.class);
		System.out.println(car.getBrand());
	}
	public void aopTest(){
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
		Waiter waiter=context.getBean("proxy",Waiter.class);
		waiter.greetTo("miss li");
		waiter.serviceTo("miss to");
	}
	public void method16() {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
		UpdateServiceImpl service=context.getBean("updateProxy",UpdateServiceImpl.class);
		try {
			service.save(123);
		} catch (Exception e) {
			System.out.println("-------");
		}
		service.update(123);
	}
	public void method17() throws Exception{
		//applicationcontext.xml
		//com.baobaotao.test.aspect.WaitreesgreetTo
		//com/baobaotao/test/aspect/bean1.xml
		ApplicationContext context=new ClassPathXmlApplicationContext("com/baobaotao/test/aspect/bean1.xml");
		Waitrees waiter=context.getBean("waitrees", Waitrees.class);
		//Seller seller=context.getBean("seller", Seller.class);
		waiter.greetTo("miss li");
		waiter.greetTo("mayun");
		//seller.greetTo("miss li");
	}
	
}
