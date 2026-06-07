package strings;

import java.util.Scanner;

public class Java006_UpperToLower {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        StringBuilder sb = new StringBuilder();

        for(char ch : str.toCharArray()){
            if(ch >= 'A' && ch <= 'Z'){
                sb.append((char)(ch+32));
            }
            else{
                sb.append(ch);
            }
        }
        System.out.println("Final String: " + sb);
    }
}
