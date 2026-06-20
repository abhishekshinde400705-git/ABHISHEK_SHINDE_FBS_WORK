#include<stdio.h>
int main() {
	// check user are eligible for vot or note
	int age;
	printf("Enter your age: ");
	scanf("%d",&age);

	if(age>=18) {
		printf("you are eligible for voting");
	} else {
		printf("you are not eligible for voting");
	}
	return 0;
}