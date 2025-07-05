package baekjoon;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int h, m, c;
        h = s.nextInt();
        m = s.nextInt();
        c = s.nextInt();

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
                    System.out.println(h + " " + m);
                }
                else
                {
                    System.out.println(h + " " + m);
                }
            }
        }
    }
}