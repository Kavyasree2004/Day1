// A java program can have more than one main method

class Main
{
public static void main()
{
System.out.println("Main method without argument called.");
}
public static void main(int x)
{
System.out.println("Main method with argument called " +x*2);
}
public static void main(String s)
{
System.out.println("WELCOME " +s);
}
public static void main(String args[])
{
System.out.println("World of JAVA");
main();
main(35);
main("AMMU");
}
}
