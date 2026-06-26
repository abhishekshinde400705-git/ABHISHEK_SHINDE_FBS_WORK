#include<stdio.h>
void add()
{
	double num1,num2,add;
	printf("Enter your first no:");
	scanf("%lf",&num1);
	printf("Enter your second no:");
	scanf("%lf",&num2);
	add=num1+num2;
	printf("addition off two no is:%lf",add);
}
void sub()
{
	double num1,num2,sub;
	printf("Enter your first no:");
	scanf("%lf",&num1);
	printf("Enter your second no:");
	scanf("%lf",&num2);
	sub=num1-num2;
	printf("addition off two no is:%if",sub);
}
void mul()
{
	double num1,num2,mul;
	printf("Enter your first no:");
	scanf("%lf",&num1);
	printf("Enter your second no:");
	scanf("%lf",&num2);
	mul=num1*num2;
	printf("addition off two no is:%lf",mul);
}
void div()
{
	double num1,num2,div;
	printf("Enter your first no:");
	scanf("%lf",&num1);
	printf("Enter your second no:");
	scanf("%lf",&num2);
	
	if(num2==0)
	{
		printf("division is not possible");
	}
	else 
	{
	div=num1/num2;
	printf("addition off two no is:%lf",div);
	}
	
}
int main()
{
	printf("...addition of two no....");
	printf("\n");
	add();
	printf("\n");
	printf("...substraction of two no....");
	printf("\n");
	sub();
	printf("\n");
	printf("...multiplication of two no....");
	printf("\n");
	mul();
	printf("\n");
	printf("...division of two no....");
	printf("\n");
	div();
	
	return 0;
	
}