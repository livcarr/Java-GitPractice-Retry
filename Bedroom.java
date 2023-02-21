class Bedroom extends Room
{
  public void printSqFt()
    {
      int size = 1500;
      System.out.println("Size: " + size + " sqFt.");
    }

    public void printColorScheme()
    {
      String color = "blue";
      System.out.print("Color: ");
      System.out.println(color);
    }

    public void pickUp()
    {}
}
