package Homework1;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Chips", 250));
        productList.add(new Product("Snickers", 100));
        productList.add(new Drink("Coca-cola", 120, 350));
        productList.add(new HotDrink("Cappuchino", 120, 250, 90));
        productList.add(new HotDrink("Tea", 80, 300,100));

        VendingMashine mashine = new VendingMashine();
        DrinkVendingMashine drMashine = new DrinkVendingMashine();
        HotDrinkVendingMashine hotMashine = new HotDrinkVendingMashine();
        mashine.initProducts(productList); //загрузка продуктов в автомат
        mashine.getProduct("Snickers"); //попросили выдать шоколад
        mashine.getProduct("Mars");
        drMashine.initProducts(productList);//загрузили напитки
        drMashine.getProduct("Coca-cola");
        drMashine.getProduct("Vodka");
        hotMashine.initProducts(productList);
        hotMashine.getProduct("Cappuchino", 200, 50);
        hotMashine.getProduct("Cappuchino", 250, 90);
    }
}