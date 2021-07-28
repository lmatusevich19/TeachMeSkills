package homework9;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Application {
    private final String initMenu = "------------------------------------------------------------------------\n" +
            "Выберите действие:\n" +
            "1. Вывод всех товаров.\n" +
            "2. Добавление товара.\n" +
            "3. Удаление товара.\n" +
            "4. Редактирование товара.\n" +
            "Press any key to exit...\n" +
            "------------------------------------------------------------------------";
    private final String getAllProducts = "------------------------------------------------------------------------\n" +
            "Выберите сортировку:\n" +
            "1. по цене(возрастание)\n" +
            "2. по цене(убывание)\n" +
            "3. по добавлению\n" +
            "Press any key to exit...\n" +
            "------------------------------------------------------------------------";
    private final Scanner scanner = new Scanner(System.in);

    public void initMenu() {
        Market market = new Market();
        while (true) {
            System.out.println(initMenu);
            String command = scanner.nextLine();
            switch (command) {
                case "1": {
                    System.out.println(getAllProducts);
                    String commandOne = scanner.nextLine();
                    initSortMenu(market, commandOne);
                    break;
                }
                case "2": {
                    Product newProduct = scannerFieldsProduct();
                    if (newProduct != null) {
                        market.addProduct(newProduct);
                        System.out.println("Товар добавлен.");
                    }
                    break;
                }
                case "3": {
                    System.out.print("Введите id товара: ");
                    String id = scanner.nextLine();
                    market.deleteProduct(Integer.parseInt(id));
                    System.out.println("Товар удален.");
                    break;
                }
                case "4": {
                    System.out.print("Введите id товара: ");
                    String id = scanner.nextLine();
                    System.out.println("Введите новые значения полей товара:");
                    Product newProduct = scannerFieldsProduct();
                    Product oldProduct = searchOldProductById(market, id);
                    if (newProduct != null) {
                        market.editProduct(oldProduct, newProduct);
                        System.out.println("Товар изменен.");
                    }
                    break;
                }
                default: {
                    return;
                }
            }
        }
    }

    private void initSortMenu(Market market, String commandOne) {
        switch (commandOne) {
            case "1": {
                getListProduct(market, Comparator.comparing(Product::getPrice));
                break;
            }
            case "2": {
                getListProductReverse(market, Comparator.comparing(Product::getPrice));
                break;
            }
            case "3": {
                getListProductReverse(market, Comparator.comparing(Product::getId));
                break;
            }
            default: {
                return;
            }
        }
    }

    private void getListProductReverse(Market market, Comparator<Product> comparing) {
        List<Product> products = market.getAllProducts();
        if (products != null) {
            products.sort(comparing.reversed());
            for (Product tmp : products) {
                System.out.println(tmp);
            }
        } else {
            System.out.println("Склад пуст.");
        }
    }

    private void getListProduct(Market market, Comparator<Product> comparing) {
        List<Product> products = market.getAllProducts();
        if (products != null) {
            products.sort(comparing);
            for (Product tmp : products) {
                System.out.println(tmp);
            }
        } else {
            System.out.println("Склад пуст.");
        }
    }

    private Product scannerFieldsProduct() {
        System.out.print("Введите id товара: ");
        String id = scanner.nextLine();
        System.out.print("Введите наименование товара: ");
        String name = scanner.nextLine();
        System.out.print("Введите цену товара: ");
        String price = scanner.nextLine();
        try {
            return new Product(Integer.parseInt(id), name, Integer.parseInt(price));
        } catch (NumberFormatException message) {
            System.out.println("EXCEPT: Вы ввели некорректные данные. Поле id, price должны быть числовыми.");
            return null;
        }
    }

    private Product searchOldProductById(Market market, String id) {
        return market.getAllProducts()
                .stream()
                .filter(prod -> prod.getId() == Integer.parseInt(id))
                .findFirst()
                .get();
    }
}
