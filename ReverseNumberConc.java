import  java.util.Scanner;
class ReverseNumberConc
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter a nuumber");
		int num=sc.nextInt();
		String rev="";
		while(num>0)
		{
			int rem =num%10;
			rev = rev +rem;
			num=num/10;
		}
		System.out.println(rev);
	}
}