package fibonacciteoremi;

import java.util.ArrayList;

public class FibonacciTeoremi {


       public static void main(String[] args) {
              
              ArrayList<Integer> liste=new ArrayList <> ();
              
              //1, 1, 2, 3, 5, 8, 13, 21, 34.......
              
              int iki_önce=1;
              int bir_önce=1;
              
              for(int i=0; i<10; i++)
              {
                     int yeni_sayi=iki_önce+bir_önce;
                     iki_önce=bir_önce;
                     bir_önce=yeni_sayi;
                     
                     if(yeni_sayi%2==0)
                            liste.add(yeni_sayi);
              }
              System.out.println(liste);
              
              
              
      
              
              
              
       }
       
}
