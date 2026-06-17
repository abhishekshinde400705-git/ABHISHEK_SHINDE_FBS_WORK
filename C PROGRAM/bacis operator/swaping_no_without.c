#include<stdio.h>
int main() {
	// swaping two no without using temp variable
	int num1,num2;
	printf("Enter you first no: ");
	scanf("%d",&num1);
	printf("Enter you second no: ");
	scanf("%d",&num2);

	printf("before swaping a=%d and b=%d \n",num1,num2);

	num1=num1+num2;
	num2=num1-num2;
	num1=num1-num2;

	printf("after swaping a=%d and b=%d \n",num1,num2);
}