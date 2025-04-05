// Класс для описания стиля маркера
public class MarkerStyle {
    private String icon;
    private String color;

    public MarkerStyle(String icon, String color) {
        this.icon = icon;
        this.color = color;
    }

    public String getIcon() {
        return icon;
    }

    public String getColor() {
        return color;
    }
}
