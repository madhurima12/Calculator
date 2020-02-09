package divide_1;
import calc.Calculator;
interface Maths_operation
{
 public abstract int divide();
}
public class Division implements Maths_operation
{
public int val1,val2;
public Division(int val1,int val2)
{
this.val1=val1;
this.val2=val2;
}
public int divide()
{
int divide1=val1/val2;
return divide1;
}
}