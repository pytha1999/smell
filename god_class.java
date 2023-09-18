public class GodClassExample {
    private String data;
    private int value;

    public GodClassExample(String data, int value) {
        this.data = data;
        this.value = value;
    }

    // Méthode qui effectue de nombreuses opérations différentes
    public void process() {
        // Opération 1 : Manipuler la chaîne de caractères
        data = data.toUpperCase();

        // Opération 2 : Calculer une nouvelle valeur
        value = value * 2;

        // Opération 3 : Appeler une méthode externe
        DatabaseManager.saveData(data);

        // Opération 4 : Effectuer une opération de traitement longue
        for (int i = 0; i < 10000; i++) {
            // Traitement long
        }

        // Opération 5 : Effectuer une opération de communication réseau
        NetworkManager.sendData(data);
    }
}
