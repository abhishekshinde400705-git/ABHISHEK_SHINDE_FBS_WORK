#include<stdio.h>
int main() {
	// check upper case, lower case, digit and symol
	char ch;
	printf("Enter your charater to check: ");
	scanf("%c",&ch);

	if(ch>='a'&&ch<='z') {
		printf("lower case");
	} else if(ch>='A'&&ch<='Z') {
		printf("upper case");
	} else if(ch>='0'&&ch<='9') {
		printf("digit");
	} else {
		printf("symboll");
	}
	return 0;
}