import java.lang.Thread;

class Clean extends Room
{
  public void pickUp()
  {
    int sqFt = 500;
    System.out.println("Cleaning the room. We will let you know when we are done.");
      for(int i = 1; i < 11; i++)
      {
        int percentageComplete = 1;
        int increasePercentage = 10*i;
        //Thread.sleep(1000);
        percentageComplete = percentageComplete*increasePercentage;
        System.out.println("Cleaning percentage: " + percentageComplete + "%");
      }
      
    System.out.println("All done!");
  }

  public void printSqFt(int i)
  {}

  public void printColorScheme(String s)
  {}
}
