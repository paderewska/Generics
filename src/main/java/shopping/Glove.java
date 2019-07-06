package shopping;

public class Glove implements Sized, Colored, Clothing{
    private int size;
    private String color;

    public Glove(int size, String color) {
        this.size = size;
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Glove{" +
                "size=" + size +
                ", color='" + color + '\'' +
                '}';
    }


    @Override
    public String getColored() {
        return null;
    }


    @Override
    public int price() {
        return 10;
    }
}
