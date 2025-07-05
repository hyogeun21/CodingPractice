#include <iostream>
using namespace std;

int main()
{
	int h, m;
	cin >> h >> m;
	if ((h >= 0 && h <= 24) && (m >= 0 && m <= 59))
	{
		if (m >= 45 && m <= 59)
		{
			m -= 45;
			cout << h << " " << m << endl;
		}
		else if (m >= 0 && m <= 44)
		{
			m -=45;
			m +=60;
			if (h == 0)
			{
				h -= 1;
				h +=24;
			}
			else
			{
				h -= 1;
			}
			cout << h << " " << m << endl;
		}
	}
}