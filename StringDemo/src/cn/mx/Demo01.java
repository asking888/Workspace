package cn.mx;

import java.util.Scanner;

public class Demo01 {
	public static void main(String[] args) {
		//�����û�������
		String usrnane="admin";
		String passworld="admin";
		for(int i=3;i>0;i--){
		//����¼���û�������
		Scanner sc=new Scanner(System.in);
		System.out.println("�������û���");
		String name=sc.nextLine();
		System.out.println("����������");
		String pwd=sc.nextLine();
		//�Ƚ��û�������
		if(name.equals(usrnane)&&pwd.equals(passworld)){
			System.out.println("��½�ɹ�");
			break;
		}else{
			System.out.println("��½ʧ���㻹��"+(i-1)+"�λ���");
			if(i==1){
				System.out.println("�˺�����");}
		}
		}
				
	}

}
