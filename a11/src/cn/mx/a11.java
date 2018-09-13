package cn.mx;

public class a11 {
	public static void main(String args[]){
		//System.out.println(Math.abs(-33));
		/*System.out.println("hello"+'a'+3);
		System.out.println('a'+2+"hello");
		System.out.println("5+5="+5+5);
		System.out.println(5+5+"=5+5");
		System.out.println('a');
		System.out.println('a' + 1);
		byte b1 = 3;
		byte b2 = 4;
		//byte b3 = b1 + b2;
		byte b4 = 3 + 4;
		System.out.println(b4);
		byte b = (byte)1;
		System.out.println(b);
		*/
		//定义一个byte类型，一个int类型，做加法
				byte a = 3;
				int b = 422222;
				System.out.println(a + b);
				
				//可能损失精度
				int c = (int)( a + b);
				byte d=(byte)c;
				System.out.println(d);
				
				//int c = a + b;
				System.out.println(c);
				double dd = 12.345;
				float f =(float) dd;
				System.out.println(f);
				float f1 = (float)12.345;
				float f2 = 12.345F;
				System.out.println(f1);
				System.out.println(f2);
	}

}
