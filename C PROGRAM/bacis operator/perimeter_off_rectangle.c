#include<stdio.h>
int main() {
	// perimeter of rectangle
	int perimeter,lenght,breath;
	printf("Enter you lenght: ");
	scanf("%d",&lenght);
	printf("Enter you breath: ");
	scanf("%d",&breath);

	perimeter=2*(lenght+breath);
	printf("perimeter of rectangle is:%d",perimeter);
	return 0;
}