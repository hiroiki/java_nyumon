public class Main416{
	public static void main(String[] args){
    int[][] scores = {{10,20,30},{30,40,50}};
    for(int[] ar:scores){
      for(int val:ar){
        System.out.println(val);
      }
    }
    System.out.println(scores.length);
    System.out.println(scores[0].length);
	}
}
