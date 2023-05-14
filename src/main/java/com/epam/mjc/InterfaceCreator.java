package com.epam.mjc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class InterfaceCreator {

    public Predicate<List<String>> isValuesStartWithUpperCase() {
        return x ->{
            for (String a: x) {
                if (!Character.isUpperCase(a.charAt(0))) {
                    return false;
                }
            }
            return true;
        };

        }


    public Consumer<List<Integer>> addEvenValuesAtTheEnd() {
        return x ->{
            List<Integer> nw = new ArrayList<>();
            for (Integer a: x) {
                if (a % 2 == 0) {
                    nw.add(a);

                }

            }
            for (Integer a: nw) {
                x.add(a);
            }

        };
    }

    public Supplier<List<String>> filterCollection(List<String> values) {
        return () -> {
            List<String> filtervalues = new ArrayList<>();
            for (String a: values) {
                if (a.charAt(a.length() - 1) != '.' || !Character.isUpperCase(a.charAt(0))
                        || a.split(" ").length < 4) {
                    continue;

                }else {
                    filtervalues.add(a);
                }
            }
            return filtervalues;
        };
            }



    public Function<List<String>, Map<String, Integer>> stringSize() {
       return x -> {
           Map<String, Integer> dict = new HashMap<>();
           for (String a: x) {
               dict.put(a, a.length());

           }
           return dict;
       };
    }

    public BiFunction<List<Integer>, List<Integer>, List<Integer>> concatList() {
        return (list1, list2) -> {
            List<Integer> ar = new ArrayList<>();
            for (Integer a: list1) {
                ar.add(a);

            }
            for (Integer a: list2) {
                ar.add(a);
            }
            return ar;
        };
    }
}
