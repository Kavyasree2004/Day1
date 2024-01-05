import java.util.Scanner;
class Add{
public int add(int a, int b){
return a+b;
}
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter value of n1 : ");
int n1 = sc.nextInt();
System.out.println("Enter value of n2 : ");
int n2 = sc.nextInt();
int res = Demo.add(n1, n2);
System.out.println("Sum of n1+n2 = "+res);
}
}