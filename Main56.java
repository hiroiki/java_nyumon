public class Main{
	public static void main(String[] args){
    int x = 10;
    int y = 100;
    add();
	}
	//変数の型と引数の型を合わせる。(int x,String yを入れ替えるとだめ)
	public static void add(){
	  int ans = x+y; //コンパイルエラー→local変数
	}
}
