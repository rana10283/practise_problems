public class ProductFilter {

    public void filterProducts(String category) {
        System.out.println("Searching products in category: " + category);
    }

    public void filterProducts(double minPrice, double maxPrice) {
        System.out.println("Searching products between $" +
                           minPrice + " and $" + maxPrice);
    }

    public void filterProducts(String brand, boolean isBrand) {
        System.out.println("Searching products of brand: " + brand);
    }

    public void filterProducts(String category,
                               double minPrice,
                               double maxPrice) {
        System.out.println("Searching " + category +
                           " products between $" +
                           minPrice + " and $" + maxPrice);
    }

    public void filterProducts(String category,
                               double minPrice,
                               double maxPrice,
                               String brand) {
        System.out.println("Searching " + category +
                           " products between $" +
                           minPrice + " and $" + maxPrice +
                           " of brand " + brand);
    }

    public static void main(String[] args) {
        ProductFilter pf = new ProductFilter();

        pf.filterProducts("Electronics");
        pf.filterProducts(100, 500);
        pf.filterProducts("Apple", true);
        pf.filterProducts("Electronics", 100, 500);
        pf.filterProducts("Electronics", 100, 500, "Apple");
    }
}