// Фабрика для создания маркеров с повторяющимися стилями
import java.util.HashMap;
import java.util.Map;

public class MarkerFactory {
    private static final Map<String, MarkerStyle> styles = new HashMap<>();

    // Метод для получения стиля
    public static MarkerStyle getStyle(String icon, String color) {
        String key = icon + color;
        if (!styles.containsKey(key)) {
            styles.put(key, new MarkerStyle(icon, color)); // Если такого стиля нет, создаем его
        }
        return styles.get(key);
    }
}
