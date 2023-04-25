package com.gl.balancestring;

import java.util.*;

public class BalanceBrackets {
	
	public static void main(String[] args) {
		
		String s = "(([{}]))()()";
		
		System.out.println(s);
		
		if(isbalanced(s)) {
			System.out.println("The entered String has Balanced Brackets");
		} else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}
		
	}

	private static boolean isbalanced(String s) {
		
		
		 Stack<Character> stack = new Stack<>(); 
		 char[] brackets = s.toCharArray();
	        for (char c : brackets) {
	            if (c == '(' || c == '{' || c == '[') {
	                stack.push(c);
	            } else if (c == ')' || c == '}' || c == ']') {
	                if (stack.isEmpty()) {
	                    return false;
	                }
	                char top = stack.pop();
	                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
	                    return false;
	                }
	            }
	        }
	        return stack.isEmpty();
		
	
	}

}
