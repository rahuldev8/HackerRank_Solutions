/*
This challenge will help you to learn how to take a character, a string and a sentence as input in C.

To take a single character  as input, you can use scanf("%c", &ch ); and printf("%c", ch) writes a character specified by the argument char to stdout*/

#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() 
{
    char ch1;
    char s[100];
    char sen[150];
    
    scanf("%c",&ch1); 

    scanf("%s%*c",s);

    scanf("%[^\n]%*c", &sen);
    
    printf("%c\n",ch1);
    printf("%s\n",s);
    printf("%s\n",sen);
    return 0;
}
