package lists.converting.task2;

import java.util.ArrayList;
import java.util.List;

/**
 * The list of GreekLetter objects is given.

 ﻿List<GreekLetter> letterList = new ArrayList<>();

 Convert it to the object array by name objArray.
 */
public class Main {
    public static void main(String[] args) {

        List<GreekLetter> letterList = new ArrayList<>();
        letterList.add(new GreekLetter("Gamma",  3));
        letterList.add(new GreekLetter("Omega", 24));
        letterList.add(new GreekLetter("Alpha",  1));

        Object[] objArray = new Object[letterList.size()];
        letterList.toArray(objArray);

        for (Object anObjArray : objArray) {
            System.out.println(anObjArray);
        }
    }

    static class GreekLetter {

        private String letter;
        private Integer position;

        public GreekLetter(String letter, Integer position) {
            this.letter = letter;
            this.position = position;
        }

        @Override
        public String toString() {
            return "{" +
                    "letter='" + letter + '\'' +
                    ", position=" + position +
                    '}';
        }
    }
}
