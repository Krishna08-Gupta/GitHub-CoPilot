
import java.util.ArrayList;

public class first {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(); // Generic
        names.add("Java");
        
        names.add("Python");
        // No casting needed
        String lang = names.get(0);
        System.out.println(lang);
    }
}
