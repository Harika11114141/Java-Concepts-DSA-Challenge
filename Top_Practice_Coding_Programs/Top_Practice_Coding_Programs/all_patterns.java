import java.util.Scanner;

public class all_patterns {
    public static void printPattern(int n)
    {
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
    public static void printPattern1(int n)
    {
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
    public static void printPattern2(int n)
    {
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println("");
        }

    }
    public static void printPattern3(int n)
    {
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(i+" "); 
            }
            System.out.println("");
        }

    }
    public static void printPattern4(int n)
    {
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n-i+1; j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
    public static void printPattern5(int n)
    {
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n-i+1; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println("");
        }

    }
    public static void printPattern6(int n)
    {
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n-i-1; j++)
            {
                System.out.print(" ");
            }
            for(int j = 0; j < 2*i+1; j++)
            {
                System.out.print("*");
            }
            for(int j = 0; j < n-i-1; j++)
            {
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
    public static void printPattern7(int n)
    {
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < i; j++)
            {
                System.out.print(" ");
            }
            for(int j = 0; j < 2*n-(2*i + 1); j++)
            {
                System.out.print("*");
            }
            for(int j = 0; j < i; j++)
            {
                System.out.print(" ");
            }
            System.out.println("");
        }

    }
    // here print 6 and 7 is one pattern
    public static void printPattern8(int n)
    {
        for(int i = 1; i <= 2*n -1; i++)
        {
            int stars = i;
            if(i > n)
            {
                stars = 2*n - i;
            }
            for(int j = 1; j <= stars; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void printPattern9(int n)
    {
        int space = 2 * (n-1);
        for(int i = 1; i <= n; i++)
        {
            //nums
            for(int j = 1; j <= i; j++)
            {
                System.out.print(j+" ");
            }
            //spaces
            for(int j = 1; j <= space; j++)
            {
                System.out.print("  ");
            }
            //nums
            for(int j = i; j >= 1; j--)
            {
                System.out.print(j+" ");
            }
            System.out.println("");
            space = space - 2;
        }
    }
    public static void printPattern10(int n)
    {
        int num=0;
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                num += 1;
                System.out.print(num+" ");
            }
            System.out.println("");
        }
    }
    public static void printPattern11(int n)
    {
        for(int i = 1; i <= n; i++)
        {
            for(char j = 65; j< 65+i; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
    public static void printPattern12(int n)
    {
        for(int i = 1; i <= n; i++)
        {
            for(char j = 65; j < 65 + (n-i+1); j++)
            {
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }
    public static void printPattern13(int n) {
        for(int i = 0; i < n; i++)
        {
            char ch = (char)('A' + i);
            for(int j = 0; j <= i; j++)
            {
                System.out.print(ch+" ");
            }
            System.out.println("");
        }
    }
    public static void printPattern14(int n)
    {
        for(int i = 0; i < n; i++)
        {
            //spaces
            for(int j = 0; j < n-i-1; j++)
            {
                System.out.print(" ");
            }
            //alpha
            char ch = 'A';
            int breakpoint = (2*i+1) / 2;
            for(int j = 0; j < 2*i+1; j++)
            {
                System.out.print(ch+"");
                if(j < breakpoint)
                {
                    ch++;
                }
                else
                {
                    ch--;
                }
            }
            //spaces
            for(int j = 0; j < n-i-1; j++)
            {
                System.out.print(" ");
            }
            System.out.println("");


        }
    }
    public static void printPattern15(int n)
    {
        for(int i = 0; i < n; i++)
        {
            char ch = (char)('E'- i);
            for(char j = ch; j <= 'E'; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
    public static void printPattern16(int n)
    {
        for(int i = 1; i <= n; i++)
        {
            for(int j = n; j >= n-i+1; j--)
            {
                char ch = (char)('A' + j - 1);
                System.out.print(ch+"");
            }
            System.out.println("");
        }
    }
    public static void printPattern17(int n)
    {
        int space = 0;
        for(int i = 0; i < n; i++)
        {
            //stars
            for(int j = 0; j < n-i; j++)
            {
                System.out.print("*");
            }
            //space
            for(int j = 1; j <= space; j++)
            {
                System.out.print(" ");
            }
            //stars
            for(int j = 0; j < n-i; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
            space += 2;

        }
        space = 2*n-1;
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            for(int j = 1; j < space; j++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
            space -= 2;
        }
    }
    public static void printPattern18(int n)
    {
        int spaces = 2*n-2;
        for(int i = 1; i <= 2*n-1; i++)
        {
            int Stars = i;
            if(i > n)
            {
                Stars = 2*n-i;
            }
            //stars
            for(int j = 1; j <= Stars; j++)
            {
                System.out.print("*");
            }
            // spaces
            for(int j = 1; j <= spaces; j++)
            {
                System.out.print(" ");
            }
            // stars
            for(int j = 1; j <= Stars; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
            if(i < n)
            {
                spaces -= 2;
            }
            else
            {
                spaces += 2;
            }
        }
    }
    public static void printPattern20(int n)
    {
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(i == 0 || j == 0 ||  i == n-1|| j == n-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    public static void printPattern21(int n)
    {
        for(int i = 0; i < 2*n-1; i++)
        {
            for(int j = 0; j < 2*n-1; j++)
            {
                int top = i;
                int bottom = (2*n-2)-i;
                int left = j;
                int right = (2*n-2) - j;
                System.out.print(""+(n-Math.min(Math.min(top,bottom), Math.min(left,right))));
            }
            System.out.println("");
        }
    }
        

    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the how many times u want: ");
        int times = sc.nextInt();
        for(int i = 0; i < times; i++)
        {
            System.out.println("enter the n value: ");
            int n = sc.nextInt();
            printPattern1(n);
            printPattern2(n);
            printPattern3(n);
            printPattern4(n);
            printPattern4(n);
            printPattern5(n);
            printPattern6(n);
            printPattern7(n);
            printPattern8(n);
            printPattern9(n);
            printPattern9(n);
            printPattern10(n);
            printPattern11(n);
            printPattern12(n);
            printPattern13(n);
            printPattern14(n);
            printPattern15(n);
            printPattern16(n);
            printPattern17(n);
            printPattern18(n);
            printPattern20(n);
            printPattern21(n);

        }

    }
}
