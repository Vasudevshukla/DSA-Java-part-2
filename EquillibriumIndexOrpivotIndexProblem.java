package ARRAYS;

public class EquillibriumIndexOrpivotIndexProblem {
	
	
	
	public static int[] suffixsum(int arr[])
	{
		int n=arr.length;
		int rightsum[]= new int[n];
		rightsum[n-1]=arr[n-1];
		for(int i=n-2;i>=0;i--)
		{
			rightsum[i]=arr[i]+rightsum[i+1];
		}
		return rightsum;
	}
	public static int[] prefixsum(int arr[])
	{
		int leftsum[]= new int[arr.length];
		leftsum[0]=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			leftsum[i]=arr[i]+leftsum[i-1];
		}
		return leftsum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("hello");
		int arr[]= {0,0,0,0,2};
		int leftsum[]=prefixsum(arr);
		int rightsum[]=suffixsum(arr);
		for(int i=0;i<arr.length;i++)
		{
			if(leftsum[i]== rightsum[i])
			{
				System.out.println(i);
			}
		}
		
		
		
	}

}
