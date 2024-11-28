package string;

public class Reverse_a_String {
	public static void main (String[] args) {
	       
        String str= "Nishok", empty="";
        char ch;
       
      System.out.print("Original word: ");
      System.out.println("Nishok"); //Example word
       
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); //extracts each character
        
        empty= ch+empty; //adds each character in front of the existing string
      }
      System.out.println("Reversed word: "+ empty);
    }
}
