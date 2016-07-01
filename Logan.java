import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
       // ArrayList<Integer> P= new ArrayList<Integer>();
        int N=scan.nextInt();
        scan.nextLine();
        int[] P = new int[N];
        for(int i=0 ;i<=N;i++){
            if(scan.hasNext()){
                P[i]=scan.nextInt();
                //P.add(q);
                     }
                }
        Arrays.sort(P);
   
        
        
        
        
        
        int count=1;
        
   Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < P.length; i++) {
            int key = P[i];
            if (map.containsKey(key)) {
                int occurrence = map.get(key);
                occurrence++;
                map.put(key, occurrence);
            } else {
                map.put(key, 1);
            }
        }
        ArrayList<Integer>counting=new ArrayList<Integer>();
        Iterator iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            int key = (Integer) iterator.next();
            int occurrence = map.get(key);
             counting.add(occurrence);
           // }
            //temp=key;
            //System.out.println("value of temp is "+ temp);
            //System.out.println(key + " occur " + occurrence + " time(s).");
        }
        int sizeCounting=counting.size();
        int z=0;
        
       while(sizeCounting!=0){
           int countFact=1;
           int value=counting.get(z);
           //System.out.println("for element "+value);
       for(int j=1; j<=value;j++){
           
             countFact=countFact*j;
           //System.out.println("countFact "+countFact);
           
            }
           
           count=count*countFact;
           z++;
           sizeCounting--;
       }
      //System.out.println(count); 
        
        
        
        
        
        
        
        
        /*factorial of numbers*/
        
        double factorial=1.000000;
for(int i=1; i<=N;i++){
        factorial=factorial*i;
   // System.out.println("i  "+i);
  //System.out.println(factorial);
}
        double result=factorial/count;
        System.out.println(result);
        
        
        }

        
        
        
       }
