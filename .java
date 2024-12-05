public class Arraysample2 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String str1 = "Hello";
			str1 = "World";
			/*System.out.println("String sr1 is pointing to "+str1);
			String str2 = "World";
			String str3 = "World";
			System.out.println("str2.equals(str3) :"+str2.equals(str3)); // true
			System.out.println("str2== str3"+(str2==str3)); //true
			String str4 = new String("New World");
			String str5 = new String("New World");
			System.out.println("str4.equals(str5) :"+str4.equals(str5));//TRUE
			System.out.println("str4== str5 : "+str4==str5);//FALSE*/
		/*	String stra = "World is peaceful";
			System.out.println("The length is "+stra.length());
			System.out.println("The string in Upper case is "+stra.toUpperCase());
			String strb = "WORLD IS VERY NOISY";
			System.out.println(" The string in lower case"+strb.toLowerCase());
			String strc = "Hello";
			String strd = "Hello";
			System.out.println("Hello comparedTo Hello :"+strc.compareTo(strd));
			System.out.println("------------------");
			String stre = "Hello";//72
			String strf = "hello";//104
			System.out.println("Hello comparedTo Hello :"+stre.compareTo(strf));
			System.out.println("Ascii value of h :"+strf.codePointAt(0));//asci value of char at position
			System.out.println("charAt method "+strb.charAt(6)); */
			StringBuilder sbr = new StringBuilder("World is Good");
			StringBuffer sfr = new StringBuffer("Earth Environment is Degrading");
			System.out.println("Mutable string StrBuilder :"+sbr);
			System.out.println("Mutable String synchronized :"+sfr);
			sbr.append("But Environment - Degrading");
			System.out.println("Appended String sbr "+sbr);
			sbr.insert(8, "Very ");
			System.out.println(sbr);
		
			
			
			
			
			
			
			
			
			
			
			

		}

	}




