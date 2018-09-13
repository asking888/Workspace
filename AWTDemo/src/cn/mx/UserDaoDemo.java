package cn.mx;

public class UserDaoDemo {
	public static void main(String[] args) {
		UserDao ud = new UserDaoImpl();
		ud.add();
		// 我没有说我们需要四种功能都实现啊。
		UserDao ud2 = new UserDaoImpl2();
		ud2.add();
	}
}
