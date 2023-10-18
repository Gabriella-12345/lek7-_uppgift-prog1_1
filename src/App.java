import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Välkommen till gabbis frågesport!");
        Scanner tb = new Scanner (System.in);

      double svar = 0;
      int point = 0;
      System.out.println("Fråga 1: Vad är 3*4?" );
      svar = tb.nextDouble();

      if(svar == 12)
      {
        System.out.println("Rätt\n" );
        System.out.println(point++ );
      }
      else 
      {
        System.out.println("Fel\n");
      }

        
      System.out.println("Fråga 2: Vad är 14-4*3?");
      svar = tb.nextDouble();

      if (svar == 2)
      {
        System.out.println("Rätt\n"); 
        System.out.println(point++ );
      }
      else
      {
        System.out.println("Fel\n"); 
        
      }
      
      
      System.out.println("Fråga 3: Vad är 2-1?");
      svar = tb.nextDouble();

      if (svar == 1)
      {
        System.out.println("Rätt\n"); 
        System.out.println(point++ );
      }
      else
      {
        System.out.println("Fel\n"); 
      }


      System.out.println("Fråga 4: Vad är 12-3?");
      svar = tb.nextDouble();

      if (svar == 9)
      {
        System.out.println("Rätt\n"); 
        System.out.println(point++ );
      }
      else
      {
        System.out.println("Fel\n"); 
      }


      System.out.println("Fråga 5: Vad är 7*6?");
      svar = tb.nextDouble();

      if (svar == 42)
      {
        System.out.println("Rätt\n"); 
        System.out.println(point++ );
      }
      else
      {
        System.out.println("Fel\n"); 
      }

      System.out.println("Grattis du fick " + point+ "/5" + " rätt");

            
      

            


    }
}
