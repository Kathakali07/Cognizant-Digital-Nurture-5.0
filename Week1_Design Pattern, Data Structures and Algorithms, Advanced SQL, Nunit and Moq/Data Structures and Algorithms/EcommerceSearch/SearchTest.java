public class SearchTest {

    public static Product linearSearch(Product[] products, int id) {

        for (Product p : products) {

            if (p.productId == id) {
                return p;
            }
        }

        return null;
    }

    public static Product binarySearch(Product[] products, int id) {

        int left = 0;
        int right = products.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (products[mid].productId == id) {

                return products[mid];

            } else if (products[mid].productId < id) {

                left = mid + 1;

            } else {

                right = mid - 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        Product[] products = {

            new Product(101, "iPhone", "Electronics"),

            new Product(102, "Laptop", "Electronics"),

            new Product(103, "Shoes", "Fashion"),

            new Product(104, "Watch", "Accessories"),

            new Product(105, "Book", "Education")
        };

        Product result1 = linearSearch(products, 104);

        Product result2 = binarySearch(products, 104);

        System.out.println("Linear Search:");

        if (result1 != null) {

            System.out.println(result1.productName);

        } else {

            System.out.println("Not Found");
        }

        System.out.println();

        System.out.println("Binary Search:");

        if (result2 != null) {

            System.out.println(result2.productName);

        } else {

            System.out.println("Not Found");
        }
    }
}