package homework9;

import java.util.ArrayList;
import java.util.List;

public class Market {
    private List<Product> products;

    {
        products = new ArrayList<>();
        products.add(new Product(1, "Cheese", 10));
        products.add(new Product(2, "Wine", 20));
        products.add(new Product(3, "Mango", 5));
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product) {
        if (products != null) {
            for (Product tmp : products) {
                if (tmp.getId() == product.getId()) {
                    System.out.println("Товар с таким id уже существует");
                    return;
                }
            }
            products.add(product);
        }
    }

    public List<Product> getAllProducts() {
        if (products != null) {
            return products;
        }
        return null;
    }

    public void deleteProduct(int id) {
        for (Product tmp : products) {
            if (tmp.getId() == id) {
                products.remove(tmp);
                return;
            }
        }
        System.out.println("Товара с таким id не существует");
    }

    public void editProduct(Product oldProduct, Product newProduct) {
        int indexOf = products.indexOf(oldProduct);
        products.set(indexOf, newProduct);
    }
}
