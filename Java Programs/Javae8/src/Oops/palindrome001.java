package Oops;

public class palindrome001 {
public static void main(String[] args) {
	String s="madam";
	String r="";
for (int i = s.length(); i <=0; i--) {
	r=r+s.charAt(i);
	
}
if (s.equalsIgnoreCase(r)) {
	System.out.println("Given string is palindrome");
}
}
	
	
}
