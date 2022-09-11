/*
We use the integers , , and  to create the following series:

You are given  queries in the form of , , and . For each query, print the series corresponding to the given , , and  values as a single line of  space-separated integers.

Input Format

The first line contains an integer, , denoting the number of queries.
Each line  of the  subsequent lines contains three space-separated integers describing the respective , , and  values for that query.

Constraints

Output Format

For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of  space-separated integers.
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws java.lang.Exception
    {
        try
        {
           Scanner sc = new Scanner(System.in);
           int test = sc.nextInt();
           while(test-->0)
           {
               int a = sc.nextInt();
               int b = sc.nextInt();
               int n = sc.nextInt();
               for(int i=0;i<n; i++)
               {
                   a = a + (int)Math.pow(2,i) * b;
                   System.out.print(a + " ");
               }
               System.out.println();
           } 
        }catch(Exception e)
        {
            return;
        }
        
    }
}
