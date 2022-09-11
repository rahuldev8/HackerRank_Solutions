/*
Input Format

The first line contains an integer, , denoting the number of test cases.
Each test case, , is comprised of a single line with an integer, , which can be arbitrarily large or small.

Output Format

For each input variable  and appropriate primitive , you must determine if the given primitives are capable of storing it. If yes, then print:*/

import java.util.*;
import java.io.*;

class Solution
{
    public static void main(String[] argh) 
    {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int i=0;i<test;i++)
        {
            try
            {
                long num = sc.nextLong();
                System.out.println(num + " can be fitted in:");
                if(-128 <= num && num <= 127)
                {
                    System.out.println("* byte");
                }
                if(-32768 <= num && num <= 32767)
                {
                    System.out.println("* short");
                }
                if(-Math.pow(2,31) <= num && num <= Math.pow(2,31)-1)
                {
                    System.out.println("* int");
                }
                if(-Math.pow(2,63) <= num && num <= Math.pow(2,63)-1)
                {
                    System.out.println("* long");
                }
            }
            catch(Exception e)
                {
                    System.out.println(sc.next()+" can't be fitted anywhere.");
                }
        }
    }
}
