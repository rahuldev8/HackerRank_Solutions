/*
Task
Given an integer, , perform the following conditional actions:

If  is odd, print Weird
If  is even and in the inclusive range of  to , print Not Weird
If  is even and in the inclusive range of  to , print Weird
If  is even and greater than , print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.

Input Format

A single line containing a positive integer, .

Constraints

Output Format

Print Weird if the number is weird; otherwise, print Not Weird.*/

import java.util.*;

public class Solution
{
    public static void main(String[] args) throws java.lang.Exception
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int odd = n%2;
            if(odd == 1)
            {
                System.out.println("Weird");
            }
            else
            {
                if(odd == 0 && (5>= n && n >=2))
                {
                    System.out.println("Not Weird");
                }
                else if(odd == 0 && (20>= n&& n >=6))
                {
                    System.out.println("Weird");
                }
                else if(odd == 0 && (n>=20))
                {
                    System.out.println("Not Weird");
                }
            }
        }catch(Exception e)
        {
            return;
        }
    }
}
