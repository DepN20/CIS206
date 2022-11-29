import java.lang.reflect.Array;
import java.util.*;

public class Main {


    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String a = s.nextLine(); //Domain
        String b = s.nextLine(); //Codomain
        String c = s.nextLine();
        String[] domain = a.split(" ");
        String[] codomain = b.split(" ");
        String[] relation = c.split(" ");
        List<String> dom = new ArrayList<>();
        List<String> cod = new ArrayList<>();
        List<String> rel = new ArrayList<>();
        List<String> x = new ArrayList<>();
        List<String> y = new ArrayList<>();

        Collections.addAll(dom, domain);
        Collections.addAll(cod, codomain);
        Collections.addAll(rel,relation);
        //DOMAIN AND CODOMAIN + RELATION
        System.out.println("DOMAIN: {" +  String.join(", ", dom) + "}");
        System.out.println("CODOMAIN: {" + String. join (", ", cod) + "}");
        System.out.print("RELATION: {" );
        for(int i = 0; i <rel.size(); i++) {
            if (i % 2 == 0) {
                System.out.print("(" + relation[i] + ", ");
                Collections.addAll(x,relation[i]);
            } else {
                if (i == rel.size() -1 ){
                    System.out.print(relation[i] + ")");
                }
                else{
                    System.out.print(relation[i] +"), ");
                }
                Collections.addAll(y,relation[i]);
            }

        }
        System.out.println("}");
        HashSet<String> y1 = new HashSet<>(y);
        List<String> y2 = new ArrayList<>(y1);

        //Function
        boolean function = x.size()==dom.size();
        if (function){
            System.out.println("It is a function.");
            //ONTO
            boolean onto = y2.size() == cod.size();
            if (onto){
                System.out.println("It is onto.");
            }
            else{
                System.out.println("It is *not* onto.");
            }
            //ONETOONE
            boolean one = y2.size() == y.size();
            if(one){
                System.out.println("It is one-to-one.");
            }
            else{
                System.out.println("It is *not* one-to-one.");
            }
            //BIJECTION
            boolean bijection = onto && one;
            if(bijection){
                System.out.println("It is a bijection.");
            }
            else{
                System.out.println("It is *not* a bijection.");
            }
        }
        else{
            System.out.println("It is *not* function.");
        }







    }
}
