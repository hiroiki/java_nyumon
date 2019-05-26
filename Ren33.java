public class Ren33{
	public static void main(String[] args){
		int seibetsu = new java.util.Random().nextInt(2);
		if (seibetsu==0){
			System.out.println("私は男です");
		}else if (seibetsu==1){
			System.out.println("私は女です");
		}

		int age	= new java.util.Random().nextInt(130);
		System.out.printf("私は%d歳です\n",age);
		System.out.println("よろしく");
		}
	}


