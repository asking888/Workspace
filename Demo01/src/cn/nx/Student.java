package cn.nx;

public class Student {
	private String name;
	private int age;
	private String ID;
	//�޲ι��췽��
	public Student(){}
	//�вι��췽��
	public	Student(String name,int age,String ID){
		this.name=name;
		this.age=age;
		this.ID=ID;
	}
	//��ȡ����
	public	String getName(){
		return name;
	}
	//��ȡ����
	public	int getAge(){
		return age;
	}
	//��ȡID����
	public	String getID(){
		return ID;
	}

}