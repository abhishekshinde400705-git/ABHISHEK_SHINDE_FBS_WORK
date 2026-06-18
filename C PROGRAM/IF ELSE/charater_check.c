#include<stdio.h>
int main() {
	// check charater is upper case or lower case
	char ch;
	printf("Enter your character to check it is upper or lower: ");
	scanf("%c",&ch);

	if(ch>='a'&& ch<='z') {
		printf("lower case");
	} else if(ch>='A'&&ch<='Z') {
		printf("upper case");
	} else {
		printf("invailid charater");
	}
	return 0;
}