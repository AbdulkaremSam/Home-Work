
import java.util.ArrayList;

public class h4 {
    public static void main(String[] args) {
        ArrayList<String> a=new ArrayList<>();
        ArrayList<String> b=new ArrayList<>();
        a.add("abdo");
        b.add("abdo");
        if (a.equals(b))
            System.out.println("Thy are Equivalence");
        else
            System.out.println("Thy are not Equivalence");
    }
}