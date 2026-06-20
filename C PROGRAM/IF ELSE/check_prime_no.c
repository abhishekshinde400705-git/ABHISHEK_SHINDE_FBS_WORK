#include<stdio.h>
int main() {
	// check no is prime or not
	int no;
	printf("Enter your no to check it is prime or not: ");
	scanf("%d",&no);

	if(no<2) {
		printf("no is not prime");
		return 0;
	} else {
		for(int i=2; i<=no-1; i++) {
			if(no%i==0) {
				printf("no is not prime");
				return 0;
			}
		}
		printf("no is prime");
	}
	return 0;
}