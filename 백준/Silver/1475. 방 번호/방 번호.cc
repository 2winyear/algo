#include <iostream>

using namespace std;

int main()
{
	int N, a[10] = {}, answer = 0;

	cin >> N;

	while (N) {
		a[N % 10]++;
		N = N / 10;
	}

	for (int i = 0; i < 10; i++)
	{
		if (i == 6 || i == 9)
			continue;

		if (answer < a[i])
		{
			answer = a[i];
		}
	}

	if (answer < ((a[6] + a[9] + 1) / 2))
		answer = (a[6] + a[9] + 1) / 2;

	cout << answer << endl;

	return 0;
}