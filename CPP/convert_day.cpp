#include<iostream>
using namespace std;
int main() {
	int total_Day,year,month,week,day;
	cout<<"Enter your your total day: ";
	cin>>total_Day;

	year=total_Day/365;
	total_Day=total_Day%365;
	month=total_Day/30;
	total_Day=total_Day%30;
	week=total_Day/7;
	day=total_Day%7;

	cout<<"total year:"<<year;
	cout<<"\ntotal month:"<<month;
	cout<<"\ntotal week:"<<week;
	cout<<"\ntotal day:"<<day;
}