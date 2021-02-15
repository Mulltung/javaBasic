package d_array;
import java.util.Arrays;


public class Sort {

	public static void main(String[] args) {
		/*
		 * 정렬
		 * - 석차구하기 : 점수를 비교해 작은 정수의 등수를 증가시키는 방식
		 * - 선택정렬 : 가장 작은 숫자를 찾아서 앞을 보내는 방식
		 * - 버블정렬 : 바로 뒤의 숫자와 비교해서 큰 수를 뒤로 보내는 방식
		 * - 삽입정렬 : 두번째 숫자부터 앞의 숫자들과 비교해서 큰수는 뒤로 밀고 중간에 삽입하는 방식
		 * 많이 사용하지 않음
		 */
//
//		int[] arr = new int[10];
//		for(int i = 0 ; i < arr.length; i++){
//			arr[i] = (int)(Math.random() * 100) +1;
//		}
//		System.out.println(Arrays.toString(arr));
//		
//		//석차구하기
//		int[] rank = new int [arr.length];
//		
//		for(int i = 0; i < rank.length; i++){
//			rank[i] = 1 ;
//		}
//		
//		for(int i = 0; i < rank.length; i++){
//			for(int j = 0; j < rank.length; j++){
//				if(arr[i] < arr[j]){
//					rank[i]++;
//				}
//					
//			}
//		}
//		System.out.println(Arrays.toString(rank));
		
		
		
		//선택정렬                                                                               //이해부족
//		int[] arr = new int[10];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = (int) (Math.random() * 100) + 1;
//		}
//		System.out.println(Arrays.toString(arr));
//
//		for (int i = 0; i < arr.length - 1; i++) {
//			int min = i;
//			for (int j = i + 1; j < arr.length ; j++) {
//				if (arr[j] < arr[min]) {
//					min = j;
//				}
//			}
//			int temp = arr[i];
//			arr[i] = arr[min];
//			arr[min] = temp;
//		}
//		System.out.println(Arrays.toString(arr));
		
//		
//		//버블정렬
//		int[] arr = new int[10];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = (int) (Math.random() * 100) + 1;
//		}
//		System.out.println(Arrays.toString(arr));
//
//		for (int i = 0; i < arr.length - 1; i++) { // i는 반복횟수 방이 10개니까 9번 돌아간다.
//			boolean flag = false;        //if문장이 돌아가는지 안돌아가느지 확인
//			for (int j = 0; j < arr.length - i - 1; j++) { // j는 점점 돌는 횟수가 줄기
//															// 때문에 증가하는 수 i를 빼는데
//															// 8까지만 돌기 때문에 1을 더
//															// 뺀다
//				if (arr[j] > arr[j + 1]) {
//					int temp = arr[j];
//					arr[j] = arr[j + 1];
//					arr[j + 1] = temp;
//					flag = true;                 
//				}
//			}
//			if(flag == false ){                //만약 if가 안돌아가고  그대로 false가 나온다면 break로 나온다
//				break;                         //if(!flag)로 사용할 수 있다.
//			}
//		}
//		System.out.println(Arrays.toString(arr));
		
		
		
		//삽입정렬
		/*
		 * i,j
		 * 1,0 
 		 * 2,1 2,0
		 * 3,2 3,1 3,0
		 * 4,3 4,2 4,1 4,0 
		 * 5,4 5,3 5,2 5,1 5,0
		 * 6,5 6,4 6,3 6,2 6,1 6,0
		 * 7,6 7,5 7,4 7,3 7,2 7,1 7,0
		 * 8,7 8,6 8,5 8,4 8,3 8,2 8,1 8,0
		 * 9,8 9,7 9,6 9,5 9,4 9,3 9,2 9,1 9,0
		 */
		
		int[] arr = new int[10];
	    for (int i = 0; i < arr.length; i++) {
		arr[i] = (int) (Math.random() * 100) + 1;
		}
		System.out.println(Arrays.toString(arr));
		
	
		for (int i = 1; i < arr.length; i++) {
			 int temp = arr[i];
		     int j = 0;
		for (j = i - 1 ; j >=0 ; j--){
			if(temp < arr[j]){
				arr[j+1]= arr[j];
			}
			else{
				break;
			}
		
		 arr[j +1] = temp;
	}
	System.out.println(Arrays.toString(arr));
}
		

		
		
		
		
		
		
		
		
		
		
		
		
		
}
}
