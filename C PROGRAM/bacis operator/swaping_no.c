#include<stdio.h>
int main() {
	//swaping two no using temp variable
	int num1,num2,temp;
	printf("Enter you first no: ");
	scanf("%d",&num1);
	printf("Enter you second no: ");
	scanf("%d",&num2);

	printf("before swaping a=%d and b=%d \n",num1,num2);

	temp=num1;
	num1=num2;
	num2=temp;

	printf("after swaping a=%d and b=%d",num1,num2);
	return 0;
}