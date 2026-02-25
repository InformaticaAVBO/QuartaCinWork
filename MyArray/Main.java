import java.util.Iterator;

public class Main {


public static void main() {

    MyArray<String> città = new MyArray<>(100, 50);

    città.add("Bologna");
    città.add("Milano");
    città.add("Roma");

    System.out.println(città);

    // uso di iterator per stampare tutti gli elementi di città
    System.out.println("Stampo tutti gli elementi di città usando un iteratore:");
    Iterator<String> it = città.iterator();
    while (it.hasNext()) {
        System.out.println(it.next());
    }
    
}


}
