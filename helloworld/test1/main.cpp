#include <iostream> //need this for cout function
#include <iomanip> // need this for setprecision, showpoint, and fixed.
#include <string> // need this for string input
#include <cmath> //need this for pow function
#include <cstdlib> // this is used for rand() and exit() function
#include <ctime> //this is used for the time function
#include <fstream> // This is used for ofstream and ifstream function
#include <vector> // This is used for vector data type.

using namespace std;

int linearsearch(const int[], int, int);

int main()
{
    const int SIZE = 5;
    int test[SIZE] = {87, 75, 98, 100, 92};
    int results;
    results = linearsearch(test, SIZE, 100);
    if(results == -1)
    {
        cout << "You did not recieve a 100." << endl;
    }
    else
    {
        cout << "you recieved a 100 on test ";
        cout << (results + 1) << endl;
    }
    return 0;
    
}

int linearsearch(const int nums[], int size, int value)
{
    int index = 0; 
    int position = -1;
    bool found = false;
    while(index < size && !found)
    {
        if(nums[index] == value)
        {
            found = true;
            position = index;
        }
        index++;
    }
    return position;
}

