// Класс для маркера, использующего стиль
public class LocationMarker {
    private MarkerStyle style;
    private String location;

    public LocationMarker(MarkerStyle style, String location) {
        this.style = style;
        this.location = location;
    }

    // Метод для отображения маркера
    public void display() {
        System.out.println("Маркер: " + location + ", Стиль: " + style.getIcon() + ", Цвет: " + style.getColor());
    }
}
