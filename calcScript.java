public class calcScript {
   public static void main(String[] args) {
    System.out.println( "Let's test out Calculator.class using integers x=5 and y=2...\n" );
    int x = 5;
    int y = 2;

    Calculator calc = new Calculator();

    System.out.println( "x + y = " + calc.add(x,y) );
    System.out.println( "x - y = " + calc.subtract(x,y) );
    System.out.println( "x * y = " + calc.multiply(x,y) );
    System.out.println( "x / y = " + calc.divide(x,y) );
    System.out.println( "x % y = " + calc.modulus(x,y) ); 

   }
}