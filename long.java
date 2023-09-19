public class LongMethodExample {

    public static void main(String[] args) {
        LongMethodExample example = new LongMethodExample();
        int result = example.calculateTotal(10, 20, 30, 40, 50);
        System.out.println("Total: " + result);
    }

    public int calculateTotal(int a, int b, int c, int d, int e) {
        int sum = a + b + c + d + e;
        int product = a * b * c * d * e;
        int difference = a - b - c - d - e;
        int quotient = a / b / c / d / e;

        int total = sum + product + difference + quotient;

        // Imaginez que cette méthode continue avec plus de calculs...
        // ...

        return total;
    }
}
