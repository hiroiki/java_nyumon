import java.io.BufferedReader; 
import java.io.FileNotFoundException; 
import java.io.FileReader; 
import java.io.IOException;

public class DAO{
	public void DAO(String fName){
        //配列の要素を５件で宣言します。 
	FileReader fr		= new FileReader("sample.csv");
	BufferedReader br	= new BufferedReader(fr);
        
	String seitoArray[] 	= new String[20];
  String tokutenArray[] 	= new String[20];
	
	int i = 0; 
	//ファイルの件数分ループして配列に格納します。 
	while (br.ready()){ 
		if(i==0){
			continue;
		}
		
		String line 		= br.readLine(); 
		String lineArray[] 	= line.split(",");

		seitoArray[i] 	= lineArray[1];
		tokutenArray[i] = lineArray[3];
		
		i++;

	} 
	/*
	if i == 1;
		System.out.println("no data error");
	*/
	//配列の要素分処理を繰り返し表示する。 
	for(int j =0 ; j<seitoArray.length ; j++){ 
		System.out.printf("%sは%sです。\n",seitoArray[j],tokutenArray[j]); 
	} 
	}
}
