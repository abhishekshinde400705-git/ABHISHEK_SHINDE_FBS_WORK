#include<stdio.h>
int main() {
	// convert total days into the year,month,week and day
	int total_days,year,month,week,day;
	printf("Enter you days: ");
	scanf("%d",&total_days);

	year=total_days/365;
	total_days=total_days%356;
	month=total_days/30;
	total_days=total_days%30;
	week=total_days/7;
	day=total_days%7;

	printf("year=%d \n",year);
	printf("month=%d \n",month);
	printf("week=%d \n",week);
	printf("day=%d",day);
	return 0;
}