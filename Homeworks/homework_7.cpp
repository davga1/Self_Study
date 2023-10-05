
#include <iostream>
#include <math.h>
using namespace std;
int n;
double sum = 0;

int factorial(int number){
    if(number == 0 || number == 1)return 1;
    return number * factorial(number - 1);
}

int main()
{
   cin>> n;
   for(int k = 1;k <=n;k++){
       sum+= ((pow(-1,k)* (k + 1))/factorial(k));
   }
   cout<< sum;
    return 0;
}