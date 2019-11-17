//Jacob Gaylord
//jigaylord16@ole.augie.edu
//RealApp.java
//Description: This client program throughly tests class Real. Each method is
//             tested. First, an example is printed with hardwired variable.
//             Second, the user is prompted for two doubles. The sum and their
//             inequality or equality is then printed on the screen.
//Input:       Two doubles entered via the keyboard.
//Output:      The sum of the two doubles, and which double is greater or if the
//             doubles are equal.
import java.util.Scanner;
public class RealApp
{
  public static void main(String[] args)
  {
    double value1;
    double value2;
    double value3;
    double value4;
    System.out.println("***Example***");
    Real r1=new Real(99.9);
    Real r2=new Real(55.5);
    r2.set(66.6);
    value1 = r1.doubleValue();
    value2 = r2.doubleValue();
    double sum=value1+value2;
    System.out.println(value1+" + "+value2+" = "+sum);
    int result1=r1.compareTo(r2);
    if(result1>0) System.out.println(value1+" > "+value2);
    else if(result1<0) System.out.println(value1+" < "+value2);
    else System.out.println(value1+" = "+value2);
    Scanner input=new Scanner(System.in);
    System.out.print("Insert a double: ");
    value3 = input.nextDouble();
    System.out.print("Insert another double: ");
    value4 = input.nextDouble();
    Real r3=new Real(value3);
    Real r4=new Real(value4);
    double sum2=value3+value4;
    System.out.println(value3+" + "+value4+" = "+sum);
    if(value3>value4) System.out.println(value3+" > "+value4);
    else if(value3<value4) System.out.println(value3+" < "+value4);
    else System.out.println(value3+" = "+value4);
  }
}
