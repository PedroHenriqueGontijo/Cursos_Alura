package java1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductPricing {
    public static void main(String[] args) {
        // Define tax rates
        Map<String, Double> taxRates = new HashMap<>();
        taxRates.put("Cofins", 0.12);
        taxRates.put("ICMS", 0.07);
        taxRates.put("ISS", 0.05);

        // Create product instances
        List<Product> products = new ArrayList<>();
        products.add(new Product("Arroz", 7.00, new HashMap<>(taxRates), 20));

        // Calculate and display final prices
        System.out.println("Product\t\tCost Price\tFinal Price");
        System.out.println("---------------------------------------");
        for (Product product : products) {
            double finalPrice = product.calculateFinalPrice();
            System.out.printf("%s\t\tR$%.2f\t\tR$%.2f%n", product.getName(), product.getCostPrice(), finalPrice);
        }
    }
}