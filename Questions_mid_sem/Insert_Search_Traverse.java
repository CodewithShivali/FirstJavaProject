/*
* Create two dimensional integer array and insert, search and traverse this array.
Note: Use Scanner class to insert data.

* */

package Questions_Mid_Sem;

import java.util.Scanner;

public class Insert_Search_Traverse {
    public static void main(String[]args)
    {
        Scanner scn = new Scanner(System.in);
        int [][] arr = new int [3][3];

        System.out.println("Enter the elements");

        //Inserting the elenets in the array
        for(int i=0;i<3;++i)
        {
            for(int j=0;j<3;++j)
            {
                arr[i][j] = scn.nextInt();
            }
        }

        //Traversing the array
        for(int i=0;i<3;++i)
        {
            for(int j=0;j<3;++j)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        //Finding the key
        System.out.println("Enter the key element");

        int key = scn.nextInt();

        for(int i=0;i<3;++i)
        {
            for(int j=0;j<3;++j)
            {
                if(arr[i][j] == key)
                {
                    System.out.println("Element found in row: " + i + " column: " + j);
                }
            }
        }
    }
}
