#include<stdio.h>
int main()
{
	int num,second_last;
	printf("Enter your no to print second last digits:");
	scanf("%d",&num);
	
	second_last=(num/10)%10;
	
	printf("second_last is:%d",second_last);
	return 0;
	
}