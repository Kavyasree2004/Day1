import java.util.Scanner;
class Demo{
public static int add(int a,int b){
return a+b;
}
public static void printTable(int a){
for(int i=0;i<=10;i++)
System.out.println(a+"*"+i+"="+a*i);
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter first number :");
int n1=sc.nextInt();
System.out.println("Enter second number :");
int n2=sc.nextInt();
int res=Demo.add(n1,n2);
System.out.println("Sum ="+res);
Demo.printTable(n1);
Demo.printTable(n2);
}
}

