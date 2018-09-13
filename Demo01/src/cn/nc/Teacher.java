package cn.nc;

public class Teacher {
	private String name;
	private int age;
	private String ID;
	//无参构造方法
	public Teacher(){}
	//有参构造方法
	public Teacher(String name,int age,String ID){
		this.name=name;
		this.age=age;
		this.ID=ID;
	}
	//获取姓名
	public String getName(){
		return name;
	}
	//获取年龄
	public int getAge(){
		return age;
	}
	//获取ID号码
	public String getID(){
		return ID;
	}

}

