package PracticeClass;

public class StringManipluation {
public static void main(String[] args) {
	String s="abcdefg";
	System.out.println(evenodd(s));
	System.out.println(uppercase(s));
	System.out.println(isvowel(s));
	System.out.println(isprimeposition(s));
}









public static String isprimeposition(String s) {
	String prime="";
	String constant="";
	int i=1;
	int n=i,c=0;
	while(i<=n){
	if(n%i==0){
	c++;
	}
	i++;
	}
	if(c==2) {
	prime=prime+s.charAt(i);
	}
	else {
		constant=constant+s.charAt(i);
	}

		return prime+constant;
}


public static String isvowel(String s) {
	String vowel ="";
	String consonant="";
	
	for (int i = 0; i < s.length(); i++) {
		if (s.charAt(i)== 'a'||s.charAt(i)== 'e'||s.charAt(i)== 'i'||s.charAt(i)== 'o'||s.charAt(i)== 'u' ) {
			vowel=vowel+s.charAt(i);
		}
		else {
			consonant=consonant+s.charAt(i);
		}
	}
	return vowel+consonant;
}




public static String uppercase(String s) {
	String up="";
	for (int i = 0; i < s.length(); i++) {
		if (i%2==0) {
			 up= up+ ((char)(s.charAt(i)-32));
		}
		else {
			up= up+(s.charAt(i));
		}
	}
	return up;
}




public static String evenodd(String s) {
	String even="";
	String odd="";
	for (int i = 0; i < s.length(); i++) {
		if (i%2==0) {
			even= even+s.charAt(i);
		}
		else {
			odd=odd+s.charAt(i);
		}
	}
		return even+odd;
}

}
