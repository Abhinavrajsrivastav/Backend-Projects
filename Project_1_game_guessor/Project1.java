package Project_1_game_guessor;

import java.util.Scanner;

class Guessor{
   private int GuessorNum;

   public int GuessorNumber(){
    Scanner sc = new Scanner(System.in);

    System.out.println("Dear Guessor, Please Give a Number: ");
    int GuessorNum = sc.nextInt();

    return GuessorNum;
   }
}

class Umpire{
    private int NumFromG;
    private int NumFromP;

    public void result(){
        Guessor G = new Guessor();
        Players P = new Players();
     
        NumFromG = G.GuessorNumber();
        NumFromP = P.PlayerGuessNum();
    }

    public boolean compare(){
        if(NumFromG==NumFromP)
         return true;
        else
         return false;
    }
}

class Players{
    private int playerNum;

    public int PlayerGuessNum(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Dear Player, Please guess a Number: ");
    int playerNum = sc.nextInt();
    return playerNum;
   }
}

public class Project1 {
    public static void main(String[] args){
          int flag = 0;
          while(flag<3){
          Umpire U = new Umpire();
          U.result();
          if(U.compare())
          System.out.println("Congratulations Dude You Guessed correct !!!");
          else
          System.out.println("Sorry Dude You Guessed Wrong !!!");
          flag++;
          
          if(flag<3)
          System.out.println("You have "+(3-flag-1)+" chances left");
            else
            System.out.println("Try again dude !!!");
          }
    }
}
