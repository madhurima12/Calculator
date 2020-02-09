package add_1;
import calc.Calculator;
interface Maths_operation
{
 public abstract int add();
}
public class Addition extends Calculator implements Maths_operation
{
public int val1,val2;
public Addition(int val1,int val2)
{
this.val1=val1;
this.val2=val2;
}
public int add()
{
int add1=val1+val2;
return add1;

}
}