import java.util.Scanner;
public class method{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter a  string:");
	String str=sc.nextLine();
	System.out.println("Operations:");
	System.out.println("1.Length:"+str.length());
        System.out.println("2.Uppercase:"+str.toUpperCase());
	System.out.println("3.Lowercase:"+str.toLowerCase());
	System.out.println("4.Character at index 2:"+str.charAt(2));
	System.out.println("5.Replace 'a'with'k':"+str.replace('a','k'));
	System.out.println("6.Substring (0 to 4):"+str.substring(0,4));
	System.out.println("7.trimmed string:"+str.trim());
        System.out.println("8.Contains java:"+str.contains("java"));
	System.out.println("9.Concatenation:"+str.concat("java"));
	}
}
