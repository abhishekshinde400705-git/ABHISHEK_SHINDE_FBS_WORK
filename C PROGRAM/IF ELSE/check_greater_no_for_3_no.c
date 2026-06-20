#include<stdio.h>
int main() {
	// check greater no form three no
	int num1,num2,num3;
	printf("Enter you first no: ");
	scanf("%d",&num1);
	printf("Enter you second no: ");
	scanf("%d",&num2);
	printf("Enter you third no: ");
	scanf("%d",&num3);

	if(num1==num2&&num2==num3) {
		printf("all three no is same");
	} else if(num1==num2||num3==num1||num2==num3) {
		printf("two no is same");
	} else if(num1>num2&&num1>num3) {
		printf("first no is greater");
	} else if(num2>num1&&num2>num3) {
		printf("second no is greater");
	} else {
		printf("third no is greater");
	}
	return 0;
}