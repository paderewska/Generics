package simple;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class UseALisst {


    public static void breakAList(List l) {  // "raw type"
        l.add(0, LocalDate.now());
    }

    public static void main(String[] args) {

        List<LocalDate> dates = new ArrayList();
        dates.add(LocalDate.now());

        //java.lang.class obtain from .class "static pseudonumber"
        //or
        Class<String> cString = (Class<String>)"".getClass();
        List<String> names = Collections.checkedList(
                new ArrayList<>(Arrays.asList("Albert"/*, LocalDate.now()*/)),
                cString
//                String.class //compile time equivalent to "".getClass()
        );

        // Map<String, List<Map.Entry<String, Long>>> not all generic types are simple
        names.add("Fred");
        names.add("Jim");
        names.add("Sheila");
        breakAList(names);
//        names.add(LocalDate.now());

        String s = names.get(0);  // CAST IS IMPLICIT
        System.out.println(("Item 0 is " + s));

        for (String o : names) {
            System.out.println(o);
        }
    }
}
