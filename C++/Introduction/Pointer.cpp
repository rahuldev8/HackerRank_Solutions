/*
Function Description

Complete the update function in the editor below.

update has the following parameters:

int *a: an integer
int *b: an integer
Returns

The function is declared with a void return type, so there is no value to return. Modify the values in memory so that  contains their sum and  contains their absoluted difference.


Input Format

Input will contain two integers,  and , separated by a newline.*/

#include <stdio.h>

void update(int *a,int *b) {
    // Complete this function    
    *a = *a+*b;
    *b = (*a - *b) - *b;
    if(*b<0) 
    *b *= -1;
}

int main() {
    int a, b;
    int *pa = &a, *pb = &b;
    
    scanf("%d %d", &a, &b);
    update(pa, pb);
    printf("%d\n%d", a, b);

    return 0;
}
