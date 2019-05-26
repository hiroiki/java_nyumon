public class Main32{
	public static void main(String[] args){
		boolean doorClose = true;
		while (doorClose==true){
			System.out.println("kon kon nock");
			int time = 3;
			System.out.printf("Wait for %d second\n",time);
			
			try{
				Thread.sleep(time * 1000);
        		}
			catch(InterruptedException e) {
            		e.printStackTrace();
        		}
		}


	}
}


