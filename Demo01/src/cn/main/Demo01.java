package cn.main;

import cn.nc.Teacher;
import cn.nx.Student;

//import package ;
public class Demo01 {
public static void main(String args[]){
Student st=new Student("JACK",23,"5242878282");
System.out.println("������"+st.getName()+" ������"+st.getAge()+" ID������"+st.getID());
Teacher t=new Teacher("ee",33,"dd");
System.out.println("������"+t.getName()+" ������"+t.getAge()+" ID������"+t.getID());
}
}
