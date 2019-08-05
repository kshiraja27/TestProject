
public class Test  {
	
	
	public static void main(String[] args) {
		/*int[] a= {0,0,0,1,3,6,0,3,5,0,0};
		int fIndex=0,lIndex=0;
		for(int i=0; i<a.length;i++) {
			if(a[i]>0) {
				fIndex=i;
				
				break;
			}
		}
		for(int j=a.length-1; j>=0;j--) {
			if(a[j]>0) {
				lIndex=j;
				break;
			}
		}
		int[] lastest= new int[lIndex-fIndex+1];
		int m=0;
		for(int k=fIndex;k!=lIndex+1;k++) {
			
			lastest[m]=a[k];
			m++;
		}
		for(int n=0;n<lastest.length; n++) {
			System.out.print(lastest[n]);
		}
	}
*/
		int a[][] = { { 0, 1, 2, 3 }, { 4, 5, 6, 7 }, { 8, 9, 2, 1} };
		int k = 0;
		int temp2 = 0;
		for (int i = 0; i < a.length; i++) {

			//for (k = 0; k <= a.length; k++) {
				temp2 = a[i][k]; // first
				if (i == 0 && k == 0) {
					a[i][k] =  a[a.length - 1][a.length];
					a[a.length - 1][a.length] = temp2;
				}
				//System.out.print(a[i][k]);
			//}
			//System.out.println();
		}
		
		for(int n=0;n<a.length;n++) {
			for(int m=0;m<=a.length;m++) {
				System.out.print(a[n][m]);
			}
			System.out.println();
		}

		
	}
}
