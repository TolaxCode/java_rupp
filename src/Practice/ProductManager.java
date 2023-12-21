package Practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ProductManager {
    ArrayList<Products> lstProducts = new ArrayList<>();
    String[] options = {"Add", "View", "Update", "Remove", "Exit"};
    public Scanner cin = new Scanner(System.in);

    void display() {
        System.out.println("=========Options==========");
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + "." + options[i]);
        }
        System.out.println("==========================");
    }

    void addProducts() {
        System.out.print("Add products : ");
        String newProducts = cin.next();
        System.out.print("Add stocks : ");
        int newStocks = cin.nextInt();
        lstProducts.add(new Products(newProducts, newStocks));
    }

    void viewProduct() {
        if (lstProducts.isEmpty()) {
            System.out.println("Products is empty.");
        } else {
            System.out.println("===========================");
            System.out.println("No\tProducts\tStocks");
            System.out.println("===========================");
            for (int i = 0; i < lstProducts.size(); i++) {
                Products product = lstProducts.get(i);
                System.out.println((i + 1) + "\t" + product.getPro_names() + "\t" + product.getPro_stocks());
            }
            System.out.println("===========================\n");
        }
    }

    void updateProducts() {
        boolean isSearch = false;
        if (lstProducts.isEmpty()) {
            System.out.println("Products is empty.");
        } else {
            System.out.print("Search for update : ");
            String search = cin.next();
            for (Products products : lstProducts) {
                if (products.getPro_names().equalsIgnoreCase(search)) {
                    System.out.println("Search is found.");
                    System.out.println("Name: " + products.getPro_names());
                    System.out.println("Stocks: " + products.getPro_stocks());
                    System.out.print("Update new products : ");
                    String newName = cin.next();
                    System.out.print("Update new stocks : ");
                    int newStock = cin.nextInt();
                    products.setPro_names(newName);
                    products.setPro_stocks(newStock);
                    System.out.println("Update Success.");
                    isSearch = true;
                }
            }
            if (!isSearch) {
                System.out.println("Search not found.");
            }
        }
    }

    void removeProducts() {
        boolean isSearch = false;
        if (lstProducts.isEmpty()) {
            System.out.println("Products is empty.");
        } else {
            System.out.print("Search for update : ");
            String search = cin.next();
            Iterator<Products> iterator = lstProducts.iterator();
            while (iterator.hasNext()) {
                Products products = iterator.next();
                if (products.getPro_names().equalsIgnoreCase(search)) {
                    System.out.println("Search is found.");
                    System.out.println("Name: " + products.getPro_names());
                    System.out.println("Stocks: " + products.getPro_stocks());
                    iterator.remove();
                    System.out.println("Remove success.");
                    isSearch = true;
                }
            }
            if (!isSearch) {
                System.out.println("Search not found.");
            }
        }
    }

    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        int op;
        while (true) {
            productManager.display();
            System.out.print("Choose options : ");
            op = productManager.cin.nextInt();
            switch (op) {
                case 1: {
                    productManager.addProducts();
                    continue;
                }
                case 2: {
                    productManager.viewProduct();
                    continue;
                }
                case 3: {
                    productManager.updateProducts();
                    continue;
                }
                case 4: {
                    productManager.removeProducts();
                    continue;
                }
                case 5: {
                    break;
                }
                default: {
                    System.out.println("Invalid.");
                }
            }
        }
    }
}

class Products {
    private String pro_names;
    private int pro_stocks;

    public String getPro_names() {
        return pro_names;
    }

    public int getPro_stocks() {
        return pro_stocks;
    }

    void setPro_names(String pro_names) {
        this.pro_names = pro_names;
    }

    void setPro_stocks(int pro_stocks) {
        this.pro_stocks = pro_stocks;
    }

    Products(String pro_names, int pro_stocks) {
        this.pro_names = pro_names;
        this.pro_stocks = pro_stocks;
    }


}
