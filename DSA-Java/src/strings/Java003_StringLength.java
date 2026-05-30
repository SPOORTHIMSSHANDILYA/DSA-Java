package strings;

import java.util.Scanner;

public class Java003_StringLength {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count = 0;
        for(char ch : str.toCharArray()){
            count++;
        }
        System.out.println("Length of the string: " + count);
    }
}
