package lists.converting.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * The list of strings is given.

 List<String> nameList = new ArrayList<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));

 Convert it to the string array by name strArray.
 */
public class Main {
    public static void main(String[] args) {

        List<String> nameList = new ArrayList<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));
        String[] strArray = new String[nameList.size()];
        nameList.toArray(strArray);


        for (String aStrArray : strArray) {
            System.out.println(aStrArray);
        }

    }
}
