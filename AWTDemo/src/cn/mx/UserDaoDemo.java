package cn.mx;

public class UserDaoDemo {
	public static void main(String[] args) {
		UserDao ud = new UserDaoImpl();
		ud.add();
		// ��û��˵������Ҫ���ֹ��ܶ�ʵ�ְ���
		UserDao ud2 = new UserDaoImpl2();
		ud2.add();
	}
}
