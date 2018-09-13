package cn.mx;

import java.util.Scanner;

public class Demo01 {
	public static void main(String[] args) {
		//定义用户名密码
		String usrnane="admin";
		String passworld="admin";
		for(int i=3;i>0;i--){
		//键盘录入用户名密码
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入用户名");
		String name=sc.nextLine();
		System.out.println("请输入密码");
		String pwd=sc.nextLine();
		//比较用户名密码
		if(name.equals(usrnane)&&pwd.equals(passworld)){
			System.out.println("登陆成功");
			break;
		}else{
			System.out.println("登陆失败你还有"+(i-1)+"次机会");
			if(i==1){
				System.out.println("账号锁定");}
		}
		}
				
	}

}
