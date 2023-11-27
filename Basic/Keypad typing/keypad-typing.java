//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
		    String s=sc.nextLine();
		    
		    System.out.println(printNumber(s,s.length()));
		}
		
	}

// } Driver Code Ends
//User function Template for Java


//Function to find matching decimal representation of a string as on the keypad.



//Function to find matching decimal representation of a string as on the keypad.
public static String printNumber(String s, int n) 
{
    //Your code here
    
    String value = "";

        String temp = "";

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'a'|| s.charAt(i) == 'b'||s.charAt(i) == 'c'){

                value += "2";

                // System.out.print(value);

            }

            else if(s.charAt(i) == 'd'|| s.charAt(i) == 'e'||s.charAt(i) == 'f'){

               value += "3";

                // System.out.print(value);

//                System.out.print("3");

            }

            else if(s.charAt(i) == 'g'|| s.charAt(i) == 'h'||s.charAt(i) == 'i'){

               value += "4";

                // System.out.print(value);

//                System.out.print("4");

            }
            else if(s.charAt(i) == 'j'|| s.charAt(i) == 'k'||s.charAt(i) == 'l'){

               value += "5";

                // System.out.print(value);

//                System.out.print("5");

            }

            else if(s.charAt(i) == 'm'|| s.charAt(i) == 'n'||s.charAt(i) == 'o'){

               value += "6";

                // System.out.print(value);

//                System.out.print("6");

            }

            else if(s.charAt(i) == 'p'|| s.charAt(i) == 'q'||s.charAt(i) == 'r' || s.charAt(i) == 's'){

               value += "7";

//                System.out.print(value);

                // System.out.print("7");

            }
            else if( s.charAt(i) == 't'||s.charAt(i) == 'u'|| s.charAt(i) == 'v'){

                value += "8";

                // System.out.print(value);

//                System.out.print("8");

            }

            else if(s.charAt(i) == 'w'||s.charAt(i) == 'x'||s.charAt(i) == 'y'||s.charAt(i) == 'z'){

                value += "9";

            }

            // return value;

            // if(Character.isDigit(s.charAt(i))){

            //     temp = temp+s.charAt(i);

            // }

        }

             return value;
    
}


//{ Driver Code Starts.

}

// } Driver Code Ends