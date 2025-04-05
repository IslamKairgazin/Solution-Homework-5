// Демонстрация работы Proxy Pattern
public class MainProxyDemo {
    public static void main(String[] args) {
        // Прокси для изображения
        Image image1 = new ProxyImage("house1_high_res.jpg");
        image1.display(); // Загружается изображение только при вызове display()

        // Второе изображение
        Image image2 = new ProxyImage("house2_high_res.jpg");
        image2.display(); // Загружается изображение только при вызове display()
    }
}
