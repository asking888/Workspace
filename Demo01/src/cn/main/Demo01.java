package cn.main;

import cn.nc.Teacher;
import cn.nx.Student;

//import package ;
public class Demo01 {
public static void main(String args[]){
Student st=new Student("JACK",23,"5242878282");
System.out.println("姓名是"+st.getName()+" 年龄是"+st.getAge()+" ID号码是"+st.getID());
Teacher t=new Teacher("ee",33,"dd");
System.out.println("姓名是"+t.getName()+" 年龄是"+t.getAge()+" ID号码是"+t.getID());
}
}
