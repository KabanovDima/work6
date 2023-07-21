package work1;

// Квадрат
public class Square implements Area {
    private int side;

    public int getSide() {
        return side;
    }

    public Square (int side) {
        this.side = side;
    }

    @Override
    public int findArea() {
        return side * side;
    }

//    public void setHeight(int height) {
//        this.height = height;
//        this.width = height;
//    }
//
//    @Override
//    public void setWidth(int width) {
//        this.width = width;
//        this.height = width;
//    }
}
