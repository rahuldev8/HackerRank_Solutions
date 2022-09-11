/*
Task
In this challenge, you must read  integers from stdin and then print them to stdout. Each integer must be printed on a new line. To make the problem a little easier, a portion of the code is provided for you in the editor below.

Input Format

There are  lines of input, and each line contains a single integer.

Sample Input

42
100
125
Sample Output

42
100
125*/

import java.util.*;

class Solution
{
    public static void main(String[] args) throws java.lang.Exception
    {
        try
        {
           Scanner sc = new Scanner(System.in);
           int A = sc.nextInt();
           int B = sc.nextInt();
           int C = sc.nextInt();
           System.out.println(A);
           System.out.println(B);
           System.out.println(C); 
        }catch(Exception e)
        {
            return;
        }
    }
}
