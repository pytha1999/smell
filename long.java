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
public class FanOutExample {

    // Méthode principale (Fan-out élevé : elle appelle plusieurs autres méthodes)
    public void processOrder() {
        validateOrder();   // Appel à une méthode
        calculateTotal();  // Appel à une méthode
        applyDiscount();   // Appel à une méthode
        sendConfirmation(); // Appel à une méthode
    }

    // Méthode avec un fan-out de 1 (un seul appel)
    private void validateOrder() {
        System.out.println("Validating the order...");
    }

    // Méthode avec un fan-out de 2 (elle appelle deux méthodes)
    private void calculateTotal() {
        addTaxes();        // Appel à une méthode
        addShippingCost(); // Appel à une méthode
        System.out.println("Calculating the total amount...");
    }

    // Méthode simple (Fan-out = 0)
    private void applyDiscount() {
        System.out.println("Applying discount...");
    }

    // Méthode simple (Fan-out = 0)
    private void sendConfirmation() {
        System.out.println("Sending order confirmation...");
    }

    // Méthode avec un fan-out de 0
    private void addTaxes() {
        System.out.println("Adding taxes...");
    }

    // Méthode avec un fan-out de 0
    private void addShippingCost() {
        System.out.println("Adding shipping cost...");
    }

    // Main pour exécuter le code
    public static void main(String[] args) {
        FanOutExample example = new FanOutExample();
        example.processOrder(); // Appel de la méthode principale
    }
}
