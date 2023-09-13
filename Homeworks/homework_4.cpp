#include <iostream>
#include <math.h>
using namespace std;

int main(){
    int rows = 5;
    int columns = 5;
    int value = 1;
    int array[rows][columns];
    int finalArray[rows][columns];
    cout<< "Original matrix:" << endl;
    for(int i = 0; i < rows;i++){
        for(int j = 0;j < columns;j++){
            array[i][j] = value;
            value++;
        }
    }
     for(int i = 0; i < rows;i++){
        for(int j = 0;j < columns;j++){
            cout<< array[i][j] << " ";
        }
        cout<< endl;
    }
    cout<< "Transponed matrix:\n";
    for(int i = 0; i < rows;i++){
        for(int j = 0;j < columns;j++){
            finalArray[i][j] = array[j][i];
        }
    }
     for(int i = 0; i < rows;i++){
        for(int j = 0;j < columns;j++){
            cout<< finalArray[i][j] << " ";
        }
        cout<< endl;
    }
    return 0;
}