import java.util.Scanner;
import java.util.Random;
class Game
{
static long WinC=0;
static long WinP=0;
static long Games=0;
static Scanner in = new Scanner(System.in);
static Random move = new Random();
    public static void main(String[] args)
    {
        /**
         *  Make the player aware of all the terms
         */
        System.out.println("                                                                Welcome to,Stone,Paper,Scissor                                                            ");
        System.out.println("                                                                ------------------------------                                                            ");
        System.out.println("======================================================");
        System.out.println("Enter \"Stone\" to play stone");
        System.out.println("Enter \"Paper\" to play Paper");
        System.out.println("Enter \"Scissor\" to play Scissor");
        System.out.println("Enter \"ESC\" to end the Program");
        System.out.println("If you want to know your score in between the game enter \"Scoreboard\"");
        System.out.println("Enjoy");
        System.out.println("======================================================");
        game();
}
public static void game()
    {
        /**
         * A vey simple program for a game with simple and basic knowledge of Java Programing
         * All the steps are cleared using comments infront of them
         */
        // For scanner class
        System.out.println("________________________");
        System.out.println("Enter your move");
        String input = in.nextLine();
        //For Random Class
        int play = move.nextInt(3)+1;
        //Puting condition for Computer's understanding
        // For invalid Input
         if (!input.equalsIgnoreCase("Stone") && !input.equalsIgnoreCase("Paper") && !input.equalsIgnoreCase("Scissor") && !input.equalsIgnoreCase("Esc")
             && 
             !input.equalsIgnoreCase("Scoreboard"))
        {
                Invalid();
            
        }
        // Conditiion to show the scoreboard
        if (input.equalsIgnoreCase("Scoreboard"))
        {
            Scoreboard();
            game();
            return;
        }
        //Conditions to end the game
        if (input.equalsIgnoreCase("ESC")){
            if (Games % 5==0 || Games==30){
            System.out.println("____________________________");
            System.out.println("You choose to end");
            End();
            return;
            }  
            else {
            System.out.println("You can only end it only at multiples of five and before 30 and !Continue the game!  \"Total Game:\" "+Games);
            game();
            return;
                 }
        }
        // To completly end the game
        if (Games==30)
        {
            System.out.println("Congratulations! You completed the game");
            End();
        }
        // Computers move
        if (play==1){
               System.out.println("Computer move: Stone"); 
        }
        else if (play==2){
                System.out.println("Computer move: Paper");
        }
        else if (play==3){
                System.out.println("Computer move: Scissor");
        }
        //Putting condition for players move
        //Puting condition for stone
        if (input.equalsIgnoreCase("Stone")&&play==1)
        {
            Games++;
            System.out.println("Its a tie");
        }
        else if (input.equalsIgnoreCase("Stone") && play==2)
        {
            Games++;
            WinC++;
            System.out.println("Computer wins");
        }
        else if (input.equalsIgnoreCase("Stone") && play==3)
        {
            Games++;
            WinP++;
            System.out.println("Player Wins");
        }
        //Putting condition for Paper
        else if (input.equalsIgnoreCase("Paper") && play==1)
        {
            Games++;
            WinP++;
            System.out.println("Player Wins");
        }
        else if (input.equalsIgnoreCase("Paper") && play==2)
        {
            Games++;
            System.out.println("Its a Tie");
        }
        else if(input.equalsIgnoreCase("Paper") && play==3)
        {
            Games++;
            WinC++;
            System.out.println("Computer Wins");
        }
        //Putting condition for Scissor
        else if (input.equalsIgnoreCase("Scissor") && play==1)
        {
            Games++;
            WinC++;
            System.out.println("Computer Wins");
        }
        else if (input.equalsIgnoreCase("Scissor") && play==2)
        {
            Games++;
            WinP++;
            System.out.println("Player Wins");
        }
        else if (input.equalsIgnoreCase("Scissor") && play==3)
        {
            Games++;
            System.out.println("Its a Tie");
        }
         /**
         * To repeat the conditions
         */
        Again();
 }
public static void Again ()
    {
        game();
    }
public static void Scoreboard()
    {
       System.out.println("===============================");
       System.out.println("Total games played: " +Games);
       System.out.println("Your score: " +WinP);
       System.out.println("Computer Score: " +WinC);
       System.out.println("===============================");
       long x =  WinC-WinP;
       if (WinP==WinC){
           System.out.println("Games is still a Tie");
       }
       else if (WinP>WinC){
           System.out.println("You are ahead.Keep it up :)" );
       }
       else if (WinP<WinC){
           System.out.println("You are behind by just: " +x);
       }
       System.out.println("Press enter to contunue");
       in.nextLine();
    }
public static void End()
    {
       System.out.println("================================");
       System.out.println("Total games played: " +Games);
       System.out.println("Your score: " +WinP);
       System.out.println("Computer Score: " +WinC);
       System.out.println("================================");
       
       if (WinP==WinC){
           System.out.println("Its a tie");
       }
       else if (WinP>WinC){
           System.out.println("You Win :)" );
       }
       else if (WinP<WinC)
       {
           System.out.println("You lose :(");
       } 
       System.out.println("--------------------------------------------------------------------------------The End-----------------------------------------------------------------------------------");
        System.exit(0); 
    }
public static void Invalid()
    {
       System.out.println("Invalid Input");
       game();
    }
}
