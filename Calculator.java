package calc;
import add_1.Addition;
import substract_1.Substraction;
import multiply_1.Multiplication;
import divide_1.Division;
import java.util.*;
public class Calculator
{
public static void display(int v)
{
System.out.println(v);
}
public static void main(String args[])
{
int val1,val2,ch,co=1,c;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value 1");
val1=sc.nextInt();
System.out.println("Enter the value 2");
val2=sc.nextInt();
Addition a=new Addition(val1,val2);
Substraction b=new Substraction(val1,val2);
Multiplication m=new Multiplication(val1,val2);
Division d=new Division(val1,val2);
while(co==1)
{

System.out.println("Enter which operation to perform");
System.out.println("1.Add");
System.out.println("2.Substract");
System.out.println("3.Multiply");
System.out.println("4.Divide");
System.out.println("5.Display");
System.out.println("Enter your choice");
ch=sc.nextInt();/*Value of operation will only be displayed when you enter option 5*/

if(ch==1)
{

a.add();
}
else if(ch==2)
{

b.substract();
}
else if(ch==3)
{

m.multiply();
}
else if(ch==4)
{

d.divide();
}
else if(ch==5)
{
System.out.println("Operation result of which operator you want to see");
System.out.println("1.Add");
System.out.println("2.Substract");
System.out.println("3.Multiply");
System.out.println("4.Divide");
c=sc.nextInt();
if(c==1)
{
System.out.println("Value after Addition");
display(a.add());
}
else if(c==2)
{
System.out.println("Value after Substraction");
 display(b.substract());
}
else if(c==3)
{
System.out.println("Value after Multiplication");
 display(m.multiply());
}
else if(c==4)
{
System.out.println("Value after Division");
 display(d.divide());
}
else
{
System.out.println("Wrong input");
}
}
System.out.println("Do you want to continue. 1 for Yes, 0 for No");
co=sc.nextInt();
}
}
}




