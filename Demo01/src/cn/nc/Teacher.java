package cn.nc;

public class Teacher {
	private String name;
	private int age;
	private String ID;
	//�޲ι��췽��
	public Teacher(){}
	//�вι��췽��
	public Teacher(String name,int age,String ID){
		this.name=name;
		this.age=age;
		this.ID=ID;
	}
	//��ȡ����
	public String getName(){
		return name;
	}
	//��ȡ����
	public int getAge(){
		return age;
	}
	//��ȡID����
	public String getID(){
		return ID;
	}

}

