public class Main511{
	public static int add(int x, int y){
	  return x + y;
	}
	public static double add(double x, double y, double z){
	  return x + y + z;
	}
	public static String add(String x, String y){
	  return x + y;
	}
	public static void main(String[] args){
    System.out.println(add(10,20));
    System.out.println(add(2.8,10,1.5));
    System.out.println(add("Hello","World"));
  }
}
