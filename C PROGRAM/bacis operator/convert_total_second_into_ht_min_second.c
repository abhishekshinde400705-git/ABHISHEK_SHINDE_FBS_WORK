#include<stdio.h>
int main() {
	// convert total second in to hr,min and secong
	int total_second,hr,min,second;
	printf("Enter you total second:");
	scanf("%d",&total_second);

	hr=total_second/3600;
	total_second=total_second%3600;
	min=total_second/60;
	second=total_second%60;

	printf("hr=%d \n",hr);
	printf("min=%d \n",min);
	printf("day=%d",second);

	return 0;
}