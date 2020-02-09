package substract_1;
import calc.Calculator;
interface Maths_operation
{
 public abstract int substract();

}
public class Substraction extends Calculator implements Maths_operation
{
public int val1,val2;
public Substraction(int val1,int val2)
{
this.val1=val1;
this.val2=val2;
}
public int substract()
{
int substract1=val1-val2;
return substract1;
}
}