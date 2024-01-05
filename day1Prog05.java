// +-*/% commandLineArgument

class Operations{
public static int add(int a,int b){
return a+b;
}
public static int sub(int p,int q){
return p-q;
}
public static int mul(int m, int n){
return m*n;
}
public static int div(int r, int s){
return r/s;
}
public static int modulo(int i,int j){
return i%j;
}
public static void main(String args[]){
int x=Integer.parseInt(args[0]);
int y=Integer.parseInt(args[1]);
int a=Operations.add(x,y);
System.out.println(a);
int b=Operations.sub(x,y);
System.out.println(b);
int c=Operations.mul(x,y);
System.out.println(c);
int d=Operations.div(x,y);
System.out.println(d);
int e=Operations.modulo(x,y);
System.out.println(e);
}
} 