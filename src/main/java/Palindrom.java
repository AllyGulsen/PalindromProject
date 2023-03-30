public class Palindrom {
    public static void main(String[] args) {



      String duzSayi;
      String tersSayi;
      //1.for loop içinde duz sayıyı Stringe çevirdim
        //1.loop'un içinde yeni bir loop açtım, sondaki sayının başa eklendiği negatif bir loop kurdum.
        //En sonunda duz ve ters sayıya ait Stringler eşitse print et komutu verdim

      for(int i=1; i<=1000000; i++){
          duzSayi= Integer.toString(i);
          tersSayi="";

          for(int j=duzSayi.length()-1; j>=0; j--){
              tersSayi=tersSayi+duzSayi.charAt(j);
          }
          if(duzSayi.equals(tersSayi)){
              System.out.print(i + " -  ");
          }
      }

    }
}

