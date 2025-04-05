// Реализация класса для реального изображения
public class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadImageFromDisk(); // Загружаем изображение с диска
    }

    // Метод для загрузки изображения
    private void loadImageFromDisk() {
        System.out.println("Загрузка изображения: " + filename);
    }

    @Override
    public void display() {
        System.out.println("Отображение изображения: " + filename);
    }
}
