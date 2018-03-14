//Largest Square of 1's in A Matrix
public class largest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	int mn=0;
	int mx=0;
	int aa[][]={{1,1,0,1,0},{0,1,1,1,0},{1,1,1,1,0},{0,1,1,1,1}};
	for(int i=0;i<4;i++)
	{
		for(int j=0;j<5;j++)
		{
			if(i==0 || j==0)
			{
				
			}
			else if(aa[i][j]>0)
			{
			mn=Math.min(aa[i][j-1],Math.min(aa[i-1][j],aa[i-1][j-1]));
			aa[i][j]=1+mn;
			}
      mx=Math.max(aa[i][j],mx);
		}
	}
	System.out.println(mx);
	}
}
