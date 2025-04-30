public class ShapeCalculator{
public static  double calculatorPerimeter(double length,double width){
return 2*(length + width);
}
public static void main(String args[]){
System.out.println( ShapeCalculator.calculatorPerimeter(5.0,3.0));
}
}