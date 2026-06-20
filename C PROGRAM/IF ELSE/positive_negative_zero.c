#include<stdio.h>
int main() {
	// check positive negative and zero
	int no;
	printf("Enter your no: ");
	scanf("%d",&no);

	if(no==0) {
		printf("no is zero");
	} else if(no>0) {
		printf("no is positive");
	} else {
		printf("no is negative");
	}
	return 0;
}