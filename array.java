import java.util.Scanner;
class array{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array size:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter array elements:");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter elements to search:");
		int search=sc.nextInt();
		int position=-1;
		for(int i=0;i<n;i++){
			if(arr[i]==search){
				position=i+1;
				break;
			}
		}
		if(position!=-1){
			System.out.println("Element found at position:"+position);
		}else{
			System.out.println("Element not found");
		}
	}
}



