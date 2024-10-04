#include<iostream>
#include <unordered_set>

using namespace std;

unsigned long long ucln(unsigned long long a, unsigned long long b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}

unsigned long long bcnn(unsigned long long a, unsigned long long b) {
    return (a * b) / ucln(a, b);
}

int main() {
	unsigned long long N, A, B ,C ,AnB, AnC, BnC;
	unordered_set<unsigned long long> tempSet;
	cin >> N >> A >> B >> C;
	AnB = bcnn(A, B);
	AnC = bcnn(A, C);
	BnC = bcnn(B, C);
	
	unsigned long long x = AnB;
	while (x <= N) {
		if (N % x == 0)
			tempSet.insert(x);
		x += AnB;
	}
	x = AnC;
	while (x <= N) {
		if (N % x == 0)
			tempSet.insert(x);
		x += AnC;
	}
	x = BnC;
	while (x <= N) {
		if (N % x == 0)
			tempSet.insert(x);
		x += BnC;
	}
	
//	for (unsigned long long element : tempSet) {
//        std::cout << element << " ";
//    }
    cout << endl <<tempSet.size();
	return 0;
}