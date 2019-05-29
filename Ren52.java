class Main52{
  public static void email(String title,String address, String text){
    System.out.println(address+"に、以下のメールを送りました");
    System.out.println("件名:"+title);
    System.out.println("本文:"+text);
  }
  public static void main(String[] args){
   email("はじめまして","xxxx@gmail.com","あああああああああ");
  }
}
