#include<stdio.h>
int main() {
	// to perform operation
	int num1,num2;
	char ch;
	printf("Enter you first no: ");
	scanf("%d",&num1);

	printf("Enter you second no: ");
	scanf("%d",&num2);

	printf("Enter your opretor(+,-,*,/):");
	scanf(" %c",&ch);

	if(ch=='+') {
		printf("addition of num1 and num2is:%d",num1+num2);
	} else if(ch=='-') {
		printf("substraction of num1 and num2is:%d",num1-num2);
	} else if(ch=='*') {
		printf("multiplication of num1 and num2is:%d",num1*num2);
	} else if(ch=='/') {
		if(num2==0) {
			printf(" occur divided by zero error ");
		} else {
			printf("division of num1 and num2is:%d",num1/num2);
		}

	} else {
		printf("enter invailid operator");
	}
	return 0;

}