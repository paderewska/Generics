package samouczekprogramisty;

public class FancyBox<T> extends StandardBox {

    public FancyBox(Object object) {
        super(object);
    }

    public void saySomethingFancy() {
        System.out.println("our " + object + " is cool!");
    }
}
