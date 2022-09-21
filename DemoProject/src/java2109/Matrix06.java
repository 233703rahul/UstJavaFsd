package java2109;

public class Matrix06 {

}
public class matrix{
    public static void main(String args[])
    {
        
        int arr[][] = {{9,5,2},{4,5,6},{7,2,6}}, res[][] = new int[3][3];
        int row, col ;
        
        System.out.print("The matrix elements are:");
        printMatrix(arr);
       
        for(row=0;row<3;row++)
            for(col=0;col<3;col++)
            {   
                if(row>col)
                    res[row][col]=0;
                else
                    res[row][col]= arr[row][col];
            }   
        System.out.print("\n\nThe upper triangular matrix:");
        printMatrix(res);
    }
   
    static void printMatrix(int arr[][])
    {
        int row, col;
       
        for(row=0;row<3;row++)
        {
           
            System.out.print("\n");
            for(col=0;col<3;col++)
            {
                System.out.print(arr[row][col]+" ");
            }
        }
    }
}