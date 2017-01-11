import java.util.*;
import java.io.*;
public class HelloWorld  {


     public static void main(String []args) throws Exception {
             int HVALUE = 27,l=0,m=0,z=0,g=0,i,j=0,k,c=0,p=2;;
         String st;
         //char [] 
         
         String sCurrentLine; 
         BufferedReader br;
         br = new BufferedReader(new FileReader("D:\\testing.txt"));

         while ((st = br.readLine()) != null) {
           System.out.println(st);
         
         word[] w = new word[20];
         k=j+1;
              
         for(j=0;j<20;j+=(p-1))
         {
             w[j] = new word();                    //reading values to objects of word.
             w[j].s = st.substring(j,j+2);
         }
         
         
         p=2;
         
         do
         {
            
        	 for(j=2;j<20;j+=(p-1))
         {
             
             for(i=0;i<j;i++)        // checks for repetition in the assigned dictionary
             {
              
             if((w[i].s).equals(w[j].s)) // condition succeeds if repetition occurs
               {
                                    
                 w[j].s = st.substring(j+g,j+(p+1+g)); // assigns new value for repetition
               w[j].value = HVALUE;
               m = j+1;
               l=j+p+g;
          
               for(z=(j+1);z<20;z++)
               {
            	 w[z].s=st.substring(l,l+2); // assigns new value to the right of repetition
            	   
            	   l++;
               }
               
     
              
               g++;
             }
             }
             }
         p++;
          }while(p<5);
          
          
          
          
          
          
          for(j=0;j<20;j++)
         {
             System.out.println("");
           System.out.print(w[j].s);
             System.out.print(" ");
              w[j].value=HVALUE;              // assigns numerical value to objects
            System.out.println(w[j].value);   
             HVALUE++;
         }
         
         
}
}
}
 class word{
    String s = new String();           
    int value;
    }