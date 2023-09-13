/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/
// Online C++ compiler to run C++ program online
#include <iostream>
#include <math.h>
using namespace std;

double func(int n){
double sum = 1;
int num = 1;
for(int i = n;i > 0;i--){
    sum *= sin(i);
}
return sum;
}

double mainFunc(int n){
    double sum = 0;
    for(int i = n;i > 0;i--){
        sum += func(i);
    }
    return sum;
}

int main() {
    cout << mainFunc(10);
    return 0;
}
