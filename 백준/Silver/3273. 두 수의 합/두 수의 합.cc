#include <iostream>

using namespace std;

int main()
{
	ios::sync_with_stdio(false);
	cin.tie(nullptr);

	int N = 0;
	int arr[100001] = {};
	bool result[2000001] = {};
	int X = 0;
	int ans = 0;

	cin >> N;

	for (int i = 0; i < N; i++)
	{
		cin >> arr[i];
	}

	cin >> X;

	for (int i = 0; i < N; i++)
	{
		if (result[(X - arr[i])] > 0 && X - arr[i] > 0)
		{
			result[(X - arr[i])] = false;
			ans++;
		}
		else
			result[arr[i]] = true;
	}

	cout << ans;
	return 0;
}