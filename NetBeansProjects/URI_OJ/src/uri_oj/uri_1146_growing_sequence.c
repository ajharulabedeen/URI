#include <stdio.h>

int main()
{
    int n, count=0;
    for (;;)
    {
        scanf("%d",&n);
        if (n == 0)
        {
            break;
        }
        else
        {
            count=0;
            for (int j = 1; j <= n; j++)
            {
                count++;
                if (count != n)
                {
                    printf("%d ", j);
                }
                else
                {
                    printf("%d", j);
                }
            }
        }
        printf("\n");
    }//for(;;)
    return 0;
}
