package AssignmentFirst;

public class lowertoupperrr {
	
	public static void main(String[] args) {
		String s="srinivas";
		String temp="";
		for(int i=0;i<s.length();i++) {
			temp=temp+((char)(s.charAt(i)-32));
		}
		System.out.println(temp);

	}
	}
