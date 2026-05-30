package strings;

import java.util.Scanner;

public class Java001_Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int left = 0 , right = str.length() -1;
        boolean isPalindrome = true;

        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                System.out.println("Not a palindrome");
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        if(isPalindrome){
            System.out.println("Yes Its a Palindrome");
        }
    }
}