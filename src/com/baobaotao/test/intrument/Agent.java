package com.baobaotao.test.intrument;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.Instrumentation;

public class Agent {
	public static void premain(String agentArgs,Instrumentation inst){
		ClassFileTransformer ts=new TransFormer();
		inst.addTransformer(ts);
	}
}
