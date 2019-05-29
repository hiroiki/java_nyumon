public class Main513{
  public static void incArray(int[] array){
    for (int i=0;i<array.length;i++){
      array[i]++;
    }
  }
  public static void main(String[] args){
    int[] Array = {1,2,3};
    incArray(Array);
    for (int i:Array){
      System.out.println(i);
    }
  }
}
