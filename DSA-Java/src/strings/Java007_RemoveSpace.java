package strings;

import java.util.Scanner;

public class Java007_RemoveSpace {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        for(char ch : str.toCharArray()){
            if(ch == ' '){
                continue;
            }
            sb.append(ch);
        }
        System.out.println("Final String: " + sb);
    }
}
