package com.ecp.test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class FiletTest {
	public static void main(String[] args) {
		try(
				BufferedReader br1=new BufferedReader(new InputStreamReader(new FileInputStream("F:/1.txt")));
				BufferedReader br2=new BufferedReader(new InputStreamReader(new FileInputStream("F:/2.txt")));
			){
			Set<String> set1=new HashSet<>();
			Set<String> set2=new HashSet<>();
			String line=null;
			while((line=br1.readLine())!=null){
				set1.add(line.trim());
			}
			while((line=br2.readLine())!=null){
				set2.add(line.trim());
			}
			System.out.println(set1.size()+":"+set2.size());
			set2.removeAll(set1);
			for(String msg:set2){
				System.out.println(msg);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
