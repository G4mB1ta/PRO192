#include <iostream>

using namespace std;
const long long MOD = 1000000007;
int main() {
    long n, countEven=0, countOdd=0;
    cin >> n;
    long x;
    long sumOdd=0, sumEven=0;
    for (int i = 0; i < n; i ++) {
        cin >> x;
        if (x % 2 == 0) {
            sumEven = (sumEven + x)% MOD;
            countEven ++;
        } else {
            sumOdd = (sumOdd + x)% MOD;
            countOdd ++;
        }
    }
    long long prod1 = (sumOdd * countEven) % MOD;
    long long prod2 = (countOdd * sumEven) % MOD;
    cout << (prod1 + prod2) % MOD;

    return 0;
}