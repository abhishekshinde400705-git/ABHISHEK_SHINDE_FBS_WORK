#include<stdio.h>
int main() {
	// area off triangle
	float height,base,area;
	printf("Enter you height: ");
	scanf("%f",&height);
	printf("Enter you base: ");
	scanf("%f",&base);

	area=0.5*height*base;
	printf("area off triangle is:%f",area);
	return 0;
}