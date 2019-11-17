//Jacob Gaylord
//jigaylord16@ole.augie.edu
//Real.java
//Description: The Real class wraps a double in an object. An object of type
//             Real contains a single field whose type is double.
public class Real
{
  private double value;
  //Post: The newly allocated Real object initialized to d.
  public Real(double d)
  {
    this.value = d;
  }
  //Post: The double value of the Real object set to d.
  public void set(double d)
  {
    value = d;
  }
  //Return: The double value of the Real object.
  public double doubleValue()
  {
    return value;
  }
  //Return: A String that represents the double value of the Real object.
  public String toString()
  {
    return String.valueOf(doubleValue());
  }
  //Return: 1 if the wrapped double of this Real object is > the wrapped double
  //        of r. 0 if the wrapped double of this Real object is == the wrapped
  //        double of r. -1 if the wrapped double of this Real object is < the
  //        wrapped double of r.
  public int compareTo(Real r)
  {
    if (value > r.value) return 1;
    else if (value > r.value) return -1;
    else return 0;
  }
}
