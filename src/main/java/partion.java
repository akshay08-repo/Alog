import org.apache.commons.collections.ListUtils;
import java.util.*;
public class partion {
    public static void main(String[] args) {
        List<Integer> li =  new ArrayList<>();
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        li.add(5);
        li.add(6);
        li.add(7);
        li.add(8);
        li.add(9);
        li.add(10);
        li.add(11);
        li.add(12);
        li.add(13);
        li.add(14);


        int psize = li.size()/3;
        List<List<Integer>> part = new ArrayList<>();
        int k =0;
        int l=0;
        for(int i=0;i<li.size();i+=psize){
            List<Integer> small = new ArrayList<>();
            while(k-l+1<psize&&k<li.size()){
                small.add(li.get(k));
                k++;
            }
            l=k;
            part.add(small);
        }
        int rem= li.size()-k;
        List<Integer> remianing = new ArrayList<>(li.subList(li.size()-rem,li.size()));

        part.add(remianing);
        System.out.println(part);
    }
}
