#include<stdio.h>
void triangle()
{
	double base,height,area;
	printf("Enter your base: ");
	scanf("%lf",&base);
	printf("Enter your height: ");
	scanf("%lf",&height);
	area=0.5*base*height;
	printf("%lf",area);
	
}
void rectangle()
{
	double lenght,breath,area;
	printf("Enter your lenght: ");
	scanf("%lf",&lenght);
	printf("Enter your breath: ");
	scanf("%lf",&breath);
	area=lenght*breath;
	printf("%lf",area);
}
void square()
{
	double side,area;
	printf("Enter your side: ");
	scanf("%lf",&side);
	area=side*side;
	printf("%lf",area);
}
void circle()
{
	double pi=3.14,radius,area;
	printf("Enter your radius: ");
	scanf("%lf",&radius);
	area=pi*radius*radius;
	printf("%lf",area);
}
int main()
{
	printf("...area of triangle...");
	printf("\n");
	triangle();
	printf("\n");
	printf("...area of rectangle...");
	printf("\n");
	rectangle();
	printf("\n");
	printf("...area of square...");
	printf("\n");
	square();
	printf("\n");
	printf("...area of circle...");
	printf("\n");
	circle();
	
	return 0;
	
}