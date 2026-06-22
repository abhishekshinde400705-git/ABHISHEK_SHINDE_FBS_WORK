#include<iostream>
using namespace std;
int main() {
	int c,cpp,html,css,javascript;
	int total_Mark,average_Mark;
	cout<<"Enter your c mark:";
	cin>>c;
	cout<<"Enter your cpp mark:";
	cin>>cpp;
	cout<<"Enter your css mark:";
	cin>>css;
	cout<<"Enter your html mark:";
	cin>>html;
	cout<<"Enter your javascript mark:";
	cin>>javascript;

	total_Mark=javascript+c+cpp+css+html;
	average_Mark=total_Mark/5;
	cout<<"total mark:"<<total_Mark;
	cout<<"\naverage mark:"<<average_Mark;
	return 0;
}