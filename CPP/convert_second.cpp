#include<iostream>
using namespace std;
int main() {
	int total_Scond,hr,min,sec;
	cout<<"Enter your total second:";
	cin>>total_Scond;

	hr=total_Scond/3600;
	total_Scond=total_Scond%3600;
	min=total_Scond/60;
	sec=total_Scond%60;

	cout<<"total hr:"<<hr;
	cout<<"\ntotal min:"<<min;
	cout<<"\ntotal sec:"<<sec;
	return 0;
}