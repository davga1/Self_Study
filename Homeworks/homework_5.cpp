#include <iostream>
#include <math.h>
#include <list>
using namespace std;

int rows;
int columns;

int
main ()
{
  list < int >numbers;

  int temp = 0;
  cin >> rows;
  cin >> columns;
  int matrix[rows][columns];
  for (int i = 0; i < rows; i++)
    {
      for (int j = 0; j < columns; j++)
	{
	  matrix[i][j] = rand () % 100;
	}
    }

  for (int i = 0; i <= rows / 2; i++)
    {
      for (int j = 0; j <= i; j++)
	{
	  numbers.push_back (matrix[i][j]);
	  numbers.push_back (matrix[i][columns - 1 - j]);
	}
    }
  for (int i = rows / 2; i < rows; i++)
    {
      for (int j = 0; j < rows - i; j++)
	{
	  numbers.push_back (matrix[i][j]);
	  numbers.push_back (matrix[i][columns - 1 - j]);
	}
    }
  numbers.sort ();

  cout << "Matrix:\n";
  for (int i = 0; i < rows; i++)
    {
      for (int j = 0; j < columns; j++)
	{
	  cout << matrix[i][j] << ' ';
	}
      cout << endl;
    }
  cout << endl;

  cout << "Biggest number in the area:";

  cout << numbers.back ();
  return 0;
}
