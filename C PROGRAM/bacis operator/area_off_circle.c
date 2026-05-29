#include<stdio.h>
int main()
{
	// area off circle 
	float area,radius,pi=3.14;
	printf("Enter you radius to calculate area off circle: ");
	scanf("%f",&radius);
	area=pi*radius*radius;
	printf("area off circle is:%f",area);
	return 0;
}