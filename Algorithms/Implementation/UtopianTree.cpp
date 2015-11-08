#include <iostream>
using namespace std;

int height(int n) {
    
    int start = 1;
    for (int i = 0; i < n; i++) {
        if (i % 2 == 0) {
            start *= 2;
        } else {
            start++;
        }
    }
    return start;
}
int main() {
    int T;
    cin >> T;
    while (T--) {
        int n;
        cin >> n;
        cout << height(n) << endl;
    }
}
