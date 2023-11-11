//package slp;
//
//import java.util.List;
//
//public class Main {
//    //Service Layer Pattern
//    public static void main(String[] args) {
//        slp.ProductService productService = new slp.ProductService();
//
//        Product product1 = new slp.Product(1, "Laptop");
//        Product product2 = new uwp.Product(2, "");
//
//        // Добавляем продукты с бизнес-логикой через сервисный слой
//        productService.addProductWithLogic(product1);
//        productService.addProductWithLogic(product2);
//
//        // Получаем все продукты через сервисный слой
//        List<Product> products = productService.getAllProducts();
//
//        System.out.println("All Products: " + products);
//    }
//}