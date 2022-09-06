package aa;

public class DownPyramid {
	public static void main(String[]args)
	{
		int rows = 6;
		for (int i=rows;i>0;i--)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("*"+"");
			}
			System.out.println();
		}
	}

}
