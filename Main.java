import java.util.Scanner;
import java.lang.*;
import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Wprowadzaj kolejne znaki, aby zakończyć wciśnij \"Q\"");
      
     List<String> list= new ArrayList<>();
        
      String znak = "";
      boolean warunek = false;
      while(warunek != true ){
        list.add(znak);
        znak=scan.nextLine();
        if(znak.equals("Q")||znak.equals("q")){warunek = true;}
        //warunek = znak.equals("Q");
        
        
        }
        System.out.println("koniec");

        for (String elementy : list) {
        System.out.print(elementy);
        }
  }
}