package shopping;

import java.util.function.BiPredicate;

// "constraint" on E, not "statement" about E
//String following comma is a "type parameter"!!! NOT java.lang.String
//public class ClothingPair<E extends Sized, String> extends Pair<E> implements Sized {
public class ClothingPair<E extends Sized & Colored> extends Pair<E> implements Sized {

//    private String s = "Hello";

    public ClothingPair(E left, E right) {
        super(left, right);
//        if (!match(left, right)) throw new Exception...
    }


    //declare type variable for use in the invocation of this method...
    public static <E extends Sized & Colored> boolean match(E left, E right) {
        return left.getSize() == right.getSize()
                && left.getColored().equals(right.getColored());
    }


    public boolean isMatched() {
        //can, in extreme need, use instanceof and casts...
        return left.getSize() == right.getSize()
                && left.getColored().equals(right.getColored());
    }

    // Contra-variance - almost always, function args are contra-variant
    public boolean matchesBy(BiPredicate<? super E, ? super E> test) {
        return test.test(left, right);
    }

    public int getSize() {
        return left.getSize(); //hope thery are matched
    }
}
