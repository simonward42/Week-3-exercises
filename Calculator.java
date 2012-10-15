public class Calculator {

    public void print2() {
        System.out.println("Test");
    }
    
    public int add(Integer x, Integer y){
        return x + y;
    }
    
    public int subtract(int x, int y){
        return x - y;
    }
    
    public int multiply(int x, int y){
        return x * y;
    }
    
    public double divide(int x, int y){
        return (double) x / (double) y;
    }
    
    public int modulus(int x, int y){
        return x % y;
    }

}