import static java.lang.Integer.parseInt;

public class FilterSystem {
    private static final String[] DATABASE = {
            "Product A: Price $100, Category Electronics",
            "Product B: Price $50, Category Books",
            "Product C: Price $150, Category Electronics",
            "Product D: Price $30, Category Apparel",
    };
    private static void filterByPriceRange(int min, int max){
        for (String entry : FilterSystem.DATABASE) {
            String[] splitEntry = entry.split("");
            int price = Integer.parseInt(splitEntry[3].substring(1));
            if (price >= min && price <= max) {
                System.out.println(entry);
            }
        }
    }
    public static void main(String[] args) {

            filterByPriceRange(50, 150);

    }



}
