class DigitPateern3
{
	public static void main(String[] args) {
		int num=0;

		for(int i=1;i<=5;i++)
		{
			//num=num+i; 
			num=num+i;
			for(int j=1;j<=i;j++)
			{
				System.out.print(num-- +" ");	
			}
			System.out.println(" ");
			num=num+i;
		}
	}
}