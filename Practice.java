public class Practice {
    public static void main(String args[]) {
        System.out.println("Hello world");
        calculate();
    }
    
    static void calculate() {
    	System.out.println("Calculation done");
    }

    public static void calculate(int a, int b) {
        System.out.println(a * b);
    }
}
