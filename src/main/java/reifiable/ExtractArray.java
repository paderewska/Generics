package reifiable;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class ExtractArray {

    // Heap pollution... type of ... is array, but this has to be array of Object
    public static <E> void varArgs(E ... args) {}

//  public static <E> E[] extractArray(List<E> le) {
//    // E[] is "non-reifiable" type (because an array needs to know its
//    // base type, but E is erased (type-erasure) during compilation
//    E[] res = (E[])new Object[le.size()]; // Heap pollution
//    for (int i = 0; i < res.length; i++) {
//      res[i] = le.get(i);
//    }
//    return res;
//  }

    public static <E> E[] extractArray(List<E> le, Class<E> clazz) {
        E[] res = (E[]) Array.newInstance(clazz, le.size());
        for (int i = 0; i < res.length; i++) {
            res[i] = le.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        List<String> ls = Arrays.asList("Fred", "Jim", "Sheila");
        String [] arr = extractArray(ls, String.class);
        for (String s : arr) {
            System.out.println("> " + s + " class of item is "
                    + s.getClass().getName());
        }

        System.out.println("Class of arr " + arr.getClass().getName());
        Object [] oa = new Object[0];
        System.out.println("Class of oa " + oa.getClass().getName());
    }
}
