package work1;

// Прямоугольник
public class Rectangle implements Area{
    private int height;
    private int weight;

    public Rectangle(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public int findArea() {
        return weight + height;
    }

//    int height;
//    int width;
//
//    public void setHeight(int height) {
//        this.height = height;
//    }
//
//    public void setWidth(int width) {
//        this.width = width;
//    }
}
