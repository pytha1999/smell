public class LongMethodExample {

    public static void main(String[] args) {
        LongMethodExample example = new LongMethodExample();
        int result = example.calculateTotal(10, 20, 30, 40, 50);
        System.out.println("Total: " + result);
    }

    public int calculateTotal(int a, int b, int c, int d, int e) {
        int sum3 = a + b + c + d + e;
        int product3 = a * b * c * d * e;
        int difference3 = a - b - c - d - e;
        int quotient3 = a / b / c / d / e;

        int total3 = sum + product + difference + quotient;

        // Imaginez que cette méthode continue avec plus de calculs...
        // ...
         int sum2 = a + b + c + d + e;
        int product2 = a * b * c * d * e;
        int difference2 = a - b - c - d - e;
        int quotient2 = a / b / c / d / e;

        int total2 = sum + product + difference + quotient;

        // Imaginez que cette méthode continue avec plus de calculs...
        // ...
         int sum4 = a + b + c + d + e;
        int product4 = a * b * c * d * e;
        int difference4 = a - b - c - d - e;
        int quotient4 = a / b / c / d / e;

        int total4 = sum + product + difference + quotient;

        // Imaginez que cette méthode continue avec plus de calculs...
        // ...

        return total;
    }
}
