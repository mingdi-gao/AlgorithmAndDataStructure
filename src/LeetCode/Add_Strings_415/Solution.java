package LeetCode.Add_Strings_415;

import java.util.Stack;

public class Solution {
    public String addStrings(String num1, String num2) {
        int sizeNum1 = num1.length();
        int sizeNum2 = num2.length();
        int carryOver = 0;
        Stack<Integer> stack = new Stack<>();
        while (sizeNum1 > 0 || sizeNum2 > 0) {
            int digit1 = sizeNum1 > 0 ? num1.charAt(sizeNum1 - 1) - '0' : 0;
            int digit2 = sizeNum2 > 0 ? num2.charAt(sizeNum2 - 1) - '0' : 0;
            int temp = digit1 + digit2 + carryOver;
            if (temp >= 10) {
                temp = temp % 10;
                carryOver = 1;
            } else {
                carryOver = 0;
            }
            stack.push(temp);
            sizeNum1--;
            sizeNum2--;
        }
        if (carryOver > 0) {
            stack.push(1);
        }
        StringBuilder sb = new StringBuilder();

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}