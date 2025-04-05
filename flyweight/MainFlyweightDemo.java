// Демонстрация работы Flyweight Pattern
public class MainFlyweightDemo {
    public static void main(String[] args) {
        // Получение и использование общих стилей для маркеров
        MarkerStyle hospitalStyle = MarkerFactory.getStyle("hospital_icon", "red");
        MarkerStyle restaurantStyle = MarkerFactory.getStyle("restaurant_icon", "green");

        // Создание маркеров с одинаковыми стилями
        LocationMarker hospital = new LocationMarker(hospitalStyle, "Hospital");
        LocationMarker restaurant = new LocationMarker(restaurantStyle, "Restaurant");

        // Отображение маркеров
        hospital.display();
        restaurant.display();
    }
}
