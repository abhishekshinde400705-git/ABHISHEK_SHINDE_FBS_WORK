#include<stdio.h>
int main() {
	// print last two digits
	int no,digit;
	printf("Enter your no to print last two digit: ");
	scanf("%d",&no);

	digit=no%100;
	printf(" last two digit:%d",digit);
	return 0;
}