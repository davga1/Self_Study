#include <iostream>
#include <math.h>
using namespace std;

double sum = 1;
double func (int x, int n)
{
  for (int i = 1; i <= n; i++)
    {
      sum *= (1 + (pow (x, i)) / (pow (i, 2)));
    } return sum;
}

int
main ()
{
    int x;
    int n;
    cout<< "Enter x\n";
    cin>>x;
    cout<<"Enter n\n";
    cin>>n;
  cout << func (x, n);//Write numbers for x and n
  return 0;
}