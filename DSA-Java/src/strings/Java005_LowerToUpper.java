package strings;
import java.util.Scanner;

public class Java005_LowerToUpper {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        StringBuilder sb = new StringBuilder();

        for(char ch : str.toCharArray()){
            if(ch >= 'a' && ch <= 'z'){
                sb.append((char)(ch-32));
            }
            else{
                sb.append(ch);
            }
        }
        System.out.println("Final String: " + sb);
    }
}
// A- 65  a-97   ||  diff = 97-65 = 32