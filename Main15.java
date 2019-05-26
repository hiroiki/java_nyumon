public class Main15 { 
  	public static void main(String[] args){
		final double tax = 1.08;
		int fax = 5;
		System.out.println("５万円から４万円に値下げします。");
		tax =4; //final宣言の後の再代入はエラーを出力
		System.out.println("FAXの新価格(税込み)");
		System.out.println(fax*tax+"万円");
	}
}
