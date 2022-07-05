import java.util.HashSet;
import java.util.Iterator;
public class Hashset {
    public static void main(String args[]){
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        if(set.contains(1)){
            System.out.println("contains 1");
        }
        if(!set.contains(5)){
            System.out.println("Doesnot conatins");
        }
        System.out.println("size"+set.size());
        System.out.println(set);

        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
