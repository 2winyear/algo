#include <iostream>
#include <list>

using namespace std;

int main()
{
	ios::sync_with_stdio(0);
	cin.tie(0);
	
	int N = 0;
	string input;
	list<char>::iterator cursor;

	cin >> N;

	for (int i = 0; i < N; i++)
	{
		cin >> input;
		list<char> L = {};

		cursor = L.begin();

		for (int j = 0; j < input.size(); j++)
		{
			char c = input[j];

			if (c == '<')
			{
				if (cursor != L.begin())
					cursor--;
			}
			else if (c == '>')
			{
				if (cursor != L.end())
					cursor++;
			}
			else if (c == '-')
			{
				if (cursor != L.begin())
				{
					cursor--;
					cursor = L.erase(cursor);

				}
			}
			else
			{
				L.insert(cursor, c);
			}
		}

		
		for (cursor = L.begin(); cursor != L.end(); cursor++)
		{
			cout << *cursor;
		}
		cout << "\n";
	}

	return 0;
}