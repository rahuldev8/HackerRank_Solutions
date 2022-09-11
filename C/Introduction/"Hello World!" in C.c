/*
Objective

In this challenge, we will learn some basic concepts of C that will get you started with the language. You will need to use the same syntax to read input and write output in many C challenges. As you work through these problems, review the code stubs to learn about reading from stdin and writing to stdout.

Task

This challenge requires you to print  on a single line, and then print the already provided input string to stdout. If you are not familiar with C, you may want to read about the printf() command.
*/

#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() 
{
	
    char sen[100];
    scanf("%[^\n]%*c", &sen);
    printf("Hello, World!\n");
    printf("%s\n",sen);
  	
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */    
    return 0;
}



