#include <iostream>
#include <math.h>
using namespace std;

bool drone(double x,double y,double R) {
if(pow(x,2) + pow(y,2) > pow(R,2))return false;
if(y > x/2) return false;
return true;
}

int main ()
{
    int x = 0;
    int y = 0;
    int R = 0;
    cout<< "Enter x";
    cin >> x;
    cout<< "Enter y";
    cin >> y;
    cout<<"Enter R";
    cin >> R;
  cout << drone (x,y,R); // write numbers for x,y,R
  return 0;
}