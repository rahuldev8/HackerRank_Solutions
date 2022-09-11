/*
Objective
In this challenge, we're going to use loops to help us do some simple math.

Task
Given an integer, , print its first  multiples. Each multiple  (where ) should be printed on a new line in the form: N x i = result.

Input Format

A single integer, .

Constraints

Output Format

Print  lines of output; each line  (where ) contains the  of  in the form:
N x i = result.*/

import java.util.*;

class Solution
{
    public static void main(String[] args) throws java.lang.Exception
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for (int i=1;i<11;i++)
            {
                System.out.println(n +" x "+ i + " = " + n*i);
            }
        }catch(Exception e)
        {
            return;
        }
    }
}
