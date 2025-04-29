import java.util.*;

public class Strings{


    public static boolean palindrome(String str){
        int n=str.length();
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }


    public static float shortestPath(String path){
        int x=0;
        int y=0;


        //change acc to direction 
        
        for(int i=0;i<path.length();i++){
            char dir=path.charAt(i);

            //South 
            if(dir=='S'){
                y--;
            }

            //North
            else if(dir=='N'){
                y++;
            }

            // East
            else if(dir=='E'){
                x++;
            }

            // West 
            else if(dir=='W'){
                x--;
            }


            int X2=x*x;
            int Y2=y*y;

            return (float)Math.sqrt(X2 + Y2);
        }
        
    }

    // Substring - giving the asked string from starting index(si) to ending index(ei)
    public static String subString(String mainstring, int si, int ei){
        String substr="";
        for(int i=si;i<ei;i++){
            substr += mainstring.charAt(i);
        }
        return substr;
    }


    //First letter to uppercase
     public static String ToUppercase(String str){
        StringBuilder sb = new StringBuilder();

        char ch = Character.toUpperCase(str.charAt(0));

        for(int i=1;i<str.length()-1;i++){
            if(str.charAt(i)=" " && i<str.length()-1){
                sb.append(i);
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
     }



    //  Compression string 
    public static String StringCompress(String str3){
        String newStr="";
        
        for(int i=0;i<str3.length();i++){
            Integer count=1;
            while(i<str3.length()-1 && str3.charAt(i)== str3.charAt(i+1)){
                count++;
                i++;
            }
            newStr += str3.charAt(i);
            if(count>1){
                newStr +=count.toString();
            }
        }
        return newStr;
    } 




    public static void main(String args[]){
        char arr[]={'a','b','c','d'};
        String str="Hi my name is Sarthak from g15";
        String str2= new String("xyz"); //Strings are immutable
        String str3="aaaabbbbbbbbbccccccddd";

        Scanner sc= new Scanner(System.in); 
        String name;
        name=sc.nextLine();
        sc.close();
        System.out.print(name);

        String work="Teacher";
        System.out.print(work.length());   // To get the length of the string 


        //String concetination joining of two strings 
        String firstname="vivek";
        String lastname="Doggy";
        String Fullname=firstname+ " " + lastname;
        System.out.println(Fullname.charAt(1));  
        

        System.out.print(shortestPath(Fullname));   // Calling the shortestpath function
        System.out.print(subString(str2, 1, 4));


        String kallu[]={"Shubham", "Naman","Tayal"};     
        String largest= kallu[0];
        
        for(int x=0; x<kallu.length;x++){
            if(largest.compareTo(kallu[x])<0){   //  if str1.compareto(str2)<0  "Str1 is large"
                largest= kallu[x];               //  if       ""    ""      =0   'Equal'
            }
        }
        System.out.println(largest);
        System.out.print(ToUppercase(str));


        // String builders 
        StringBuilder sb= new StringBuilder("");
        for(char ch='a'; ch<='z';ch++){
            sb.append(ch);      
        }


       
    }
}