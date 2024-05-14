
import java.util.ArrayList;

public class Colors {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>(3);

        colors.add("do");
        colors.add("vang");
        colors.add("hong");
        System.out.println(colors.get(1));
        System.out.println(colors.contains("xanh"));
        System.out.println(colors.size());
        System.out.println(colors);
    }
}
