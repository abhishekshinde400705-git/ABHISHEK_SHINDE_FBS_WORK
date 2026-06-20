#include<stdio.h>
int main() {
	// check greater no
	int num1,num2;
	printf("Enter you first no: ");
	scanf("%d",&num1);
	printf("Enter you second no: ");
	scanf("%d",&num2);

	if(num1==num2) {
		printf("both are same no");
	} else if(num1>num2) {
		printf("first no is greater");
	} else {
		printf("second no is greater");
	}
	return 0;
}