import java.util.Scanner;
class Demo extends Room
{
 //@override
  public static void main(String[] args)
  {
    System.out.println("Please choose if you'd like to inspect your room or if you'd like to clean it.");
    System.out.println("Inspect: 'i' , or , Clean: 'c'.");
    Scanner keyboard = new Scanner(System.in);
    Clean c1 = new Clean();
    Bedroom b1 = new Bedroom();
  
    char input = keyboard.next().charAt(0);
    System.out.println("You chose " + input + ". We will now be go to that room.");
  
    if(input == 'I' || input == 'i')
    {
      b1.printSqFt();
      b1.printColorScheme();
      keyboard.close();
      System.exit(1);
    }
    else if(input == 'c' || input == 'C')
    {
      c1.pickUp();
      keyboard.close();
      System.exit(1);
    }
  }
}
