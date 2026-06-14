#include<stdio.h>
int main() {
	// find out total mark and average mark
	int c,cpp,html,css,java;
	int total_mark,average_mark;

	printf("Enter you c subjet mark:");
	scanf("%d",&c);
	printf("Enter you cpp subjet mark:");
	scanf("%d",&cpp);
	printf("Enter you html subjet mark:");
	scanf("%d",&html);
	printf("Enter you css subjet mark:");
	scanf("%d",&css);
	printf("Enter you java subjet mark:");
	scanf("%d",&java);

	total_mark=c+cpp+html+css+java;
	average_mark=total_mark/5;

	printf("total mark of subject:%d \n",total_mark);
	printf("average mark of subject:%d",average_mark);
}