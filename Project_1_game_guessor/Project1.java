//package Project_1_game_guessor;
package Project_1_game_guessor;

//import java.util.Random;
import java.util.Scanner;

//guessor class
class Guessor{

   //private int GuessorNum...
   private int GuessorNum;

   //public GuessorNumber method...
   public int GuessorNumber(){
   Scanner sc = new Scanner(System.in);

   //ask gussor to give a number...
    System.out.println("Dear Guessor, Please Give a Number: ");
    int GuessorNum = sc.nextInt();

    //return the number...
    return GuessorNum;
   }
}

//umpire class
class Umpire{
    //private properties...
    private int NumFromG;
    private int NumFromP;

    //public methods...
    public void result(){

        //create objects...of Guessor and Players class...
        Guessor G = new Guessor();
        Players P = new Players();
     
        //call methods...of Guessor and Players class...
        NumFromG = G.GuessorNumber();
        NumFromP = P.PlayerGuessNum();
    }

    //compare method...return true or false...
    public boolean compare(){
        if(NumFromG==NumFromP)
         return true;
        else
         return false;
    }
}

//players class...
class Players{

    //private properties...
    private int playerNum;

    //public methods...
    public int PlayerGuessNum(){

    //ask player to guess a number...    
    Scanner sc = new Scanner(System.in);
    System.out.println("Dear Player, Please guess a Number: ");
    int playerNum = sc.nextInt();

    //return the number...
    return playerNum;
   }
}

//main class...
public class Project1 {
    public static void main(String[] args){

        //set flag to 0...to count the number of chances...
          int flag = 0;

          //while loop...to give 3 chances to the player...
          while(flag<3){

          //create object of Umpire class...  
          Umpire U = new Umpire();

          //call result methods of Umpire class...
          U.result();

          //if else condition...to check the result...

          //if result return true...print congratulations...
          if(U.compare())
          System.out.println("Congratulations Dude You Guessed correct !!!");
          //else print sorry...
          else
          System.out.println("Sorry Dude You Guessed Wrong !!!");

          //User has attempted one chance...
          flag++;
          
          //if else condition...to check the number of chances left...
          if(flag<3)
          System.out.println("You have "+(3-flag-1)+" chances left");
          //
            else
            System.out.println("Try again dude !!!");
          }
    }
}
