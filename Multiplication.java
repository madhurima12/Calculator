package multiply_1;
import calc.Calculator;
interface Maths_operation
{
 public abstract int multiply();
}
public class Multiplication extends Calculator implements Maths_operation
{
public int val1,val2;
public Multiplication(int val1,int val2)
{
this.val1=val1;
this.val2=val2;
}

public int multiply()
{
int multiply1=val1*val2;
return multiply1;
}
}