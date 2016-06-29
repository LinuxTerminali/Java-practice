import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Kangaroo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        boolean meet= true;
        while(meet){
            if((x1<x2)&&(v1<=v2)||(x1>x2)&&(v1>=v2)){
                System.out.println("NO");
                meet=false; 
            }
               else if(x1==x2){
                   System.out.println("YES");
                   meet=false;
            }
            else if(x1!=x2){
                x1+=v1;
                x2+=v2;
            }
               /*else{
                  System.out.println("YES");
               break;
            }*/
        }
    }
}