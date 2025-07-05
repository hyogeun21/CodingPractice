package baekjoon;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int h, m;
        h = s.nextInt();
        m = s.nextInt();
        s.close();

        if ((h >= 0 && h <= 24) && (m >= 0 && m <= 59))
        {
            if (m >= 45 && m <= 59)
            {
                m -= 45;
                System.out.println(h + " " + m);
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
                System.out.println(h + " " + m);
            }
        }
    }
}