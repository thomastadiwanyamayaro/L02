import java.math.BigDecimal;
import java.math.RoundingMode;


public class tax {

    public static void main(String[] args) {
        BigDecimal price = new BigDecimal("9.99");
        BigDecimal vat = new BigDecimal("0.23");

        BigDecimal grossPrice = price.multiply(BigDecimal.ONE.add(vat));
        BigDecimal grossInLargeQuantities = grossPrice.multiply(new BigDecimal("10000"));

        BigDecimal netLargeQuantities = grossInLargeQuantities.divide(BigDecimal.ONE.add(vat), 2, RoundingMode.HALF_UP);

        // Print the result
        System.out.println("Gross Price: " + grossPrice);
        System.out.println("Net Price: " + price);
        System.out.println("Gross Value When Sold In Large Quantities: " + grossInLargeQuantities);
        System.out.println("Net Value When Sold In Large Quantities: " + netLargeQuantities);
    }
    }

