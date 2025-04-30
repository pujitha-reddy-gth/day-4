public class BillCalculator{
public static double calculatorTotalWithTax(double amount,  double taxPercent){
return (amount+(amount*taxPercent/100));
}
public static void main(String args[]){
System.out.println(BillCalculator.calculatorTotalWithTax(1000,18));
}
}