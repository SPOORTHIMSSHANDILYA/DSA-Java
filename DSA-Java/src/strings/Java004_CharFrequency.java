package strings;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Java004_CharFrequency {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        Map<Character, Integer> freq = new HashMap<>();
        // for order maintenance - use LinkedHashMap

        for(char ch : str.toCharArray()){
            freq.put(ch, freq.getOrDefault(ch,0)+1);
        }

        for(Map.Entry<Character,Integer> entry: freq.entrySet())
        {
            System.out.println(entry.getKey() +" ---> "+ entry.getValue());
        }
    }
}