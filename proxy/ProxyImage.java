// Класс ProxyImage, который будет замещать реальное изображение
public class ProxyImage implements Image {
    private RealImage realImage;
    private String filename;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    // Метод отображения изображения
    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(filename); // Загружаем изображение, если его еще нет
        }
        realImage.display(); // Отображаем изображение
    }
}
