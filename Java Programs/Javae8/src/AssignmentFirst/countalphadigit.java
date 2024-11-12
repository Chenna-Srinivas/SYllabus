package AssignmentFirst;

public class countalphadigit {
	public static void main(String[] args) {
		String s="QSP@12k#b";
		int a=0,d=0,sp=0;
		for(int i=0;i<s.length();i++){
			if((s.charAt(i)>='A'&&s.charAt(i)<='Z')||(s.charAt(i)>='a'&&s.charAt(i)<='z')){
				a++;
			}
			else if(s.charAt(i)>='0'&&s.charAt(i)<='9') {
				d++;
			}
			else {
				sp++;
			}
		}
		System.out.println(a);
		System.out.println(d);
		System.out.println(sp);
	}
	}
