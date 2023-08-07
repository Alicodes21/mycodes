package Day5;

import java.util.Scanner;

class Product {
    private Long id;
    private String productName;
    private String supplierName;

    public Product() {
        this.id = 0L;
        this.productName = "";
        this.supplierName = "Nivas";
    }

    public Product(Long id, String productName) {
        this.id = id;
        this.productName = productName;
        this.supplierName = "Nivas";
    }

    public Product(Long id, String productName, String supplierName) {
        this.id = id;
        this.productName = productName;
        this.supplierName = supplierName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public void display() {
        System.out.println("Product Id is " + id);
        System.out.println("Product Name is " + productName);
        System.out.println("Supplier Name is " + supplierName);
    }
}

public class Private_Member_Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the product id");
        Long productId = scanner.nextLong();
        scanner.nextLine();

        System.out.println("Enter the product name");
        String productName = scanner.nextLine();

        System.out.println("Is the product supplied by Nivas Suppliers? Type \"yes\" or \"no\" (not case sensitive)");
        String supplierAnswer = scanner.nextLine();

        if (supplierAnswer.equalsIgnoreCase("no")) {
            System.out.println("Enter the supplier name");
            String supplierName = scanner.nextLine();

            Product product = new Product(productId, productName, supplierName);
            product.display();
        } else {
            Product product = new Product(productId, productName);
            product.display();
        }

        scanner.close();
    }
}
