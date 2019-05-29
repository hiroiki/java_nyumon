public class Main53{
	\\最初は必ずmainから呼び出す。
	public static void main(String[] args){
	  methodA();
	}
	public static void methodA(){
	  System.out.println("methodA");
	  methodB();
	}
	public static void methodB(){
	  System.out.println("methodB");
	}
}
