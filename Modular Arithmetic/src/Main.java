import java.util.*;

public class Main {
    public static String a;
    public static int b;
    public static String type;
    public static int ans;
    public static int answer;
    public static List<String> value = new ArrayList<>();
    public static HashMap<Integer, Character> order = new HashMap<>();
    public static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

//    Encode
    public static void encode(){
        System.out.println("plaintext : " + a);
        System.out.println("Key : " + b);
        System.out.print("Ciphertext : ");
        for (int i = 0; i < alphabet.length(); i++) {
            order.put(i, alphabet.charAt(i));
        }
        for (int i = 0; i < a.length(); i++){
            if ((int) a.charAt(i) == 32){
                System.out.print(" ");
            }
            else {
                ans = ((int) a.charAt(i) - 65) + b;
                answer = Math.floorMod(ans, 26);
                System.out.print(order.get(answer));
            }
        }

    }
//    Decode
    public static void decode(){
        System.out.println("plaintext : " + a);
        System.out.println("Key : " + b);
        System.out.print("Ciphertext : ");
        for (int i = 0; i < alphabet.length(); i++) {
            order.put(i, alphabet.charAt(i));
        }
        for (int i = 0; i < a.length(); i++){
            if ((int) a.charAt(i) == 32){
                System.out.print(" ");
            }
            else {
                ans = ((int) a.charAt(i) - 65) - b;
                answer = Math.floorMod(ans, 26);
                System.out.print(order.get(answer));
            }
        }
    }
//All KEY FUNCTION
    public static void allkeys(){
        System.out.println("plaintext : " + a);
        for (int i = 0; i < alphabet.length(); i++) {
            order.put(i, alphabet.charAt(i));
        }
        for (int key = 0; key<26; key++){
            for (int i = 0; i < a.length(); i++) {
                if ((int) a.charAt(i) == 32) {
                    value.add(" ");
                } else {
                    ans = ((int) a.charAt(i) - 65) - key;
                    answer = Math.floorMod(ans, 26);
                    value.add(String.valueOf(order.get(answer)));
                }
            }
            String[] str= new String[value.size()];
            for (int i=0; i<value.size(); i++){
                str[i] = value.get(i);
            }
            String output = "";
            for (String k :str){
                output+= k;
            }
            System.out.println("Key : " + key + " decodes to : " + output );
            value.clear();
        }


    }
//    ACCORDING TO INPUT, DIFFERENT FUNCTION
    public static void main(String[] args) {
        System.out.println("(Encode / Decode / All Keys)");
        Scanner s = new Scanner(System.in);
        type = s.nextLine();
        if (type.equals("Encode")){
            System.out.println("Insert input");
            a = s.nextLine(); //plaintext
            b = s.nextInt(); //key value
            encode();
        }
        else if(type.equals("Decode")){
            System.out.println("Insert input");
            a = s.nextLine(); //plaintext
            b = s.nextInt(); //key value
            decode();
        }
        else if(type.equals("All Keys")){
            System.out.println("Insert input");
            a = s.nextLine();
            allkeys();
        }
        else{
            System.out.println("Wrong type! Please try it again.");
        }

    }
}


