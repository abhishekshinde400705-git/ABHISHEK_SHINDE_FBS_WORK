#include<stdio.h>
int main() {
	// area off rectangle
	float area,lenght,breath;
	printf("Enter you lenght: ");
	scanf("%f",&lenght);
	printf("Enter you breath: ");
	scanf("%f",&breath);

	area=breath*lenght;
	printf("area off rectangle is:%f",area);
	return 0;
}