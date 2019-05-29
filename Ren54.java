class Ren54{
  public static double calcTriangleArea(double bottom,double height){
    return bottom * height /2;   
  }
  public static double calcCircleArea(double radius){
    return 3.14 * radius * radius; 
  }
  public static void main(String[] args){
   double S1 = calcTriangleArea(10,5);
   double S2 = calcCircleArea(5);
   System.out.println(S1);
   System.out.println(S2);
  }
}
