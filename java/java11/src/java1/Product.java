package java1;
import java.util.Map;
class Product {
    private String name;
    private double costPrice;
    private Map<String, Double> taxes;
    private double profitMargin;

    public Product(String name, double costPrice, Map<String, Double> taxes, double profitMargin) {
        this.name = name;
        this.costPrice = costPrice;
        this.taxes = taxes;
        this.profitMargin = profitMargin;
    }

    public double calculateFinalPrice() {
        double totalTaxes = 0;
        for (Map.Entry<String, Double> entry : taxes.entrySet()) {
            totalTaxes += costPrice * entry.getValue();
        }
        double totalCost = costPrice + totalTaxes;
        double profitAmount = totalCost * (profitMargin / 100);
        double finalPrice = totalCost + profitAmount;
        return finalPrice;
    }

    public String getName() {
        return name;
    }

    public double getCostPrice() {
        return costPrice;
    }

}