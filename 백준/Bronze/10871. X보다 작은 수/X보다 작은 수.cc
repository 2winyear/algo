#include <iostream>

using namespace std;

int main()
{
	ios::sync_with_stdio(false);
	cin.tie(nullptr);


	int  N, X;
	int temp = 0;

	cin >> N;
	cin >> X;
	for (int i = 0; i < N; i++)
	{
		cin >> temp;
		if (X > temp)
			cout << temp << " ";
	}
	return 0;
}