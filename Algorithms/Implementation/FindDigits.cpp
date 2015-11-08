#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <math.h>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int numLines;
    cin >> numLines;
    vector<int> recordedDivisors;

    for (int i = 0; i < numLines; i++) {
        int numGiven;
        char s[32];
        
        cin >> numGiven;
        int len = sprintf(s, "%d", numGiven);
        int numDivisors = 0;
        
        for (int j = 1; j <= len; j++) {
            int currentDigit;
            int powj = pow (10, j);
            int adjNum = numGiven / powj;
            adjNum = adjNum * powj;
            
            //cout << adjNum << endl;
            int adjGiven = numGiven - adjNum;
            
            //cout << adjGiven << endl;
            currentDigit = adjGiven / (powj / 10);
            
            for (int k = 1; k < 10; k++) {
                if (currentDigit == k) {
                    if (numGiven % k == 0) {
                        numDivisors++;
                    }
                }
            }
        }
        recordedDivisors.push_back(numDivisors);
    }
    
    for (int i = 0; i < recordedDivisors.size(); i++) {
        cout << recordedDivisors.at(i) << endl;
    }
    return 0;
}
