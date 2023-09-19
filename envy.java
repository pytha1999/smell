class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Customer {
    private String name;
    private Product favoriteProduct;

    public Customer(String name, Product favoriteProduct) {
        this.name = name;
        this.favoriteProduct = favoriteProduct;
    }

    public String getName() {
        return name;
    }

    // Méthode qui semble avoir de l'envie de fonctionnalité pour les données de Product
    public String getFavoriteProductName() {
        // Au lieu d'utiliser directement favoriteProduct.getName(),
        // nous accédons aux données de Product via une méthode.
        return favoriteProduct.getName();
    }
}

public class FeatureEnvyExample {
    public static void main(String[] args) {
        Product product = new Product("Smartphone", 599.99);
        Customer customer = new Customer("Alice", product);

        // La méthode de Customer semble montrer de l'envie de fonctionnalité
        // en accédant aux données de Product plutôt que d'utiliser les données de Customer.
        String favoriteProductName = customer.getFavoriteProductName();

        System.out.println(customer.getName() + "'s favorite product is " + favoriteProductName);
    }
}
