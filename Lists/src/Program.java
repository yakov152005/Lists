import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        System.out.println("List 1 -->");
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Yakov");
        strings.add("Amit");
        System.out.println("Size: " + strings.size());
        System.out.println(strings);
        strings.add(0,"ido");
        System.out.println("Yakov in the list? " +strings.contains("Yakov"));
        System.out.println(strings);
        strings.clear();
        System.out.println("After clear: " + strings);

        System.out.println();
        System.out.println("List 2 -->");
        List<String> strings2 = new ArrayList<>(Arrays.asList("Peter", "Sam", "Greg", "Rayn"));

        System.out.println(strings2);
        System.out.println(strings2.get(2));
        strings2.remove("Peter");
        strings2.remove(1);



        for (String names : strings2){
            System.out.print(names.toLowerCase() +" ");
        }
        System.out.println();
        System.out.println(strings.hashCode());
        System.out.println(strings2.hashCode());

        System.out.println();
        System.out.println();
        System.out.println("Numbers -->");
        ArrayList<Integer> numbers = new ArrayList<>();
        List<Integer> numbers2 = new ArrayList<>(Arrays.asList(1,3,4,5,6,7));
        System.out.println("List number 1: " + numbers);
        System.out.println("List number 2: " +numbers2);
        numbers2.remove(1);
        numbers2.remove(0);
        numbers.add(1);
        System.out.println("List number 1: " + numbers);
        System.out.println("List number 2: " +numbers2);



    }
}
