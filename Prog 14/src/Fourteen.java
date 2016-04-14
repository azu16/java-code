// String and its method
public class Fourteen {
   
	public static void main(String[] args) {
		/* when you want to print only few characters of a string
	     char arr[] = {'a','z','a','m'};
	     String s = new String(arr);
	    s = new String(arr,  1,2);
	     System.out.println(s);*/
		
		/*to find string length
		String s1 = "AzamAli";
		System.out.println(s1.length());*/
		 
		/*to compare strings
		String s1 = "Azam Ali";
		String s2 = "Azam Ali";
		System.out.println(s1.compareTo(s2));*/
		
		/*to find a particular char in string
		String s3 = "AzamAli";
		System.out.println(s3.charAt(3));*/
		
		/*to comapre string ignoring case
		String s4 = "Azam";
		String s5 = "azam";
		System.out.println(s4.compareToIgnoreCase(s5));*/
		
		/*to compare a string in terms of true or false
		String s1 = "Azam";
		String s2 = "Ali";
		System.out.println(s1.equals(s2));*/
		
		/*to compare a string in terms of true or false by ignoring case
		String s1 = "Azam";
		String s2 = "azam";
		System.out.println(s1.equalsIgnoreCase(s2));*/
		
		/*to find the location of a particular string in other
		String s1 = "th is azam";
		String s2 = "is";
		System.out.println(s1.indexOf(s2));*/
		
		/*to find the location of a particular string in other from last
		String s1 = "this is goa not is gao";
		String s2 = "is";
		System.out.println(s1.lastIndexOf(s2));*/
		
		/*to replace a char within the string
		String s1 = "azam ali";
		System.out.println(s1.replace('a', 'i'));*/
		
		/*to cut a string from a particular position
		String s1 = "Azam Ali";
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(1 , 5 ));*/
		
		/*to lower and upper case
		String s1 = "AZAM";
		String s2 = "azam";
		System.out.println(s1.toLowerCase());
		System.out.println(s2.toUpperCase());*/
		
		/*to trim extra space in the string
		String s1 = " Azam Ali ";
		System.out.println(s1.trim());*/
		
		/* for spliting a string using a delimiter
		String s1 = "Azam Ali is a good learner";
		String s[];
		s = s1.split(" ");
	   for(int i = 0; i < s1.length(); i++){
		   System.out.println(s[i]);*/
		
		/*for checking start and ending chararcterof the string
		String s1 = "Azam Ali";
		String s2 = "A";
		String s3 = "i";
		System.out.println(s1.startsWith(s2));
		System.out.println(s1.endsWith(s3));*/
		 
		/*use of getchar to cut a particular part of string and to store in an array  
		String s1 = "My name is azam";
		char arr[] = new char[20];
		s1.getChars(4, 9, arr, 9);
		System.out.println(arr); */
	}
				
				
				
		
		

	}


