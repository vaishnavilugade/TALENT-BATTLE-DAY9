import java.util.*;
class Fact{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n,k=1;
		System.out.println("Enter number:");
		n=sc.nextInt();
		for(int i=1;i<=n;i++){
			k=k*i;
			
		}
		System.out.println(n+"!= "+k);
	}
}

			