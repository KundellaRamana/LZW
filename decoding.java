import java.util.*;
import java.io.*;
public class HelloWorld  {


 public static void main(String []args)  throws Exception{
             int HVALUE = 27,l=0,m=0,z=0,g=0,i=0,j=0,k,c=0,p=2,alt=0;
         String st;
          
  //       File file = new File("D:\\testing2.txt");
     //    file.createNewFile();
         
         
        
         BufferedReader br;
         BufferedWriter writer;
         br = new BufferedReader(new FileReader("D:\\testing.txt"));
         writer = new BufferedWriter(new FileWriter("D:\\testing2.txt"));

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
            writer.write(w[j].s+" "+w[j].value);
            writer.newLine();
        
             HVALUE++;
         }
          writer.write(w[0].s.substring(0,1));
          for(i=0;i<20;i++)
          {
        	  
        	  writer.write(w[i].s.substring(1,w[i].s.length()));
        	  System.out.print(w[i].s.substring(1,w[i].s.length()));
        	  alt++;
        	  if(alt==2)
        	  {
        		  alt = 0;
        	  }
        	  
          }          
         
}
            writer.close();
}
}
 class word{
    String s = new String();           
    int value;
    }