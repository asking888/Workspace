package cn.mx;

import java.util.ArrayList;
import java.util.Collection;

public class Demo1 {
	public static void main(String[] args) {
		Collection col1=new ArrayList();
		Collection col2=new ArrayList();
		col1.add("asss");
		col2.add("qqq");
		col2.addAll(col1);
		System.out.println(col2);
		
	}

}
