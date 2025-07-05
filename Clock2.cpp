#include <iostream>
using namespace std;

int main()
{
	int h, m, c;
	cin >> h >> m;
	cin >> c;
	
	if ((h >= 0 && h <= 23) && (m >= 0 && m <= 59))
	{
		if (c >= 0 && c <= 1000)
		{
			m += c;
			if (m / 60 != 0)
			{
				h += m / 60;
				m %= 60;
				if (h >= 24)
				{
					h -= 24;
				}
				cout << h << " " << m << endl;
			}
			else
			{
				cout << h << " " << m << endl;
			}
		}
	}
}