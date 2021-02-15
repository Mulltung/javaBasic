package d_array;

import java.util.Arrays;


public class Array {

	public static void main(String[] args) {
		/*
		 * 배열
		 * - 여러개의 값을 하나의 변수에 저장해서 사용하는 것이다.
		 * - 참조형 타입이다.
		 * - 인덱스로 값을 구분한다.
		 * - 길이를 변경 할 수 있다.
		 */
		
		int[] array; //배열의 주소를 저장할 공간이 만들어진다.
		array = new int [5]; //배열이 생성되고 그 주소가 저장된다. int 5개를 저장할 공간을 만들겠다. 5개라고 배열의 길이를 지정해준다.
		//배열 초기화시 기본값이 저장된다. 
		/*
		 * 기본값 : 개가 저장하지 않았을때 저정되는 값
		 * byte, short, int, long : 0
		 * float, double : 0.0
		 * chrt :' '(0)
		 * boolean : false
		 * 참조형 : null
		 */
		
		/*
		 * 변수 = 주소
		 * 주소{0, 0, 0, 0, 0}
		 */
		
		array = new int[]{1, 2, 3, 4, 5};
		
		// array = {1, 2, 3, 4, 5}; //선언과 초기화를 동시에 해야한다. (에러)
		
		int[] array1 = {1, 2, 3, 4, 5}; //선언과 초기화를 동시에 진행함
		
		System.out.println(array1[0]);  //0이 써있는 자리를 인덱스라고 한다.
		System.out.println(array1[1]);
		System.out.println(array1[2]);
		System.out.println(array1[3]);
		System.out.println(array1[4]);
		
		array1[0] = 10;
		array1[1] = 20;
		array1[2] = 30;
		array1[3] = 40;
		array1[4] = 50;
		
		for(int i =0; i < array1.length; i++){
			System.out.println(array1[i]);
			}
		
		for(int i =0; i < array1.length; i++){
			array1[i] = (i + 1) * 10;
			System.out.println(array1[i]);
			}
		System.out.println("=======================");
		
		//10개의 정수를 저장할 수 있는 배열을 선언 및 초기화 해주세요
		
		int[] aa = new int[10];
		
		//배열의 모든 인덱스에 1~100사이의 랜덤한 갑을 저장해주세요
		
		for(int i =0 ; i < aa.length; i++){
			aa[i] = (int) (Math.random() * 100) + 1;
			System.out.println(aa[i]);
		}
		
		//배열에 저장된 모든 값의 합계와 평균을 구해주세요.
		int sum=0;
//		int count=0;
//		for(int i =0 ; i < aa.length; i++){
//			sum += aa[i];
//			count += 1;
//		}
//		System.out.println("합계 : " + sum);
//		System.out.println("평균 : " + sum/count);
//		
//		
		for(int i =0 ; i < aa.length; i++){
			sum += aa[i];
		}
		double avg = Math.round((double)sum/ aa.length * 10)/ 10.0;
		for(int i =0 ; i < aa.length; i++){		
			
		}
		System.out.println("sum : " + sum + " / avg : " + avg);
		
		//배열에 저장된 값을 중 최소값과 최대값을 출력해주세요
		int max = aa[0];
		int min = aa[0];
		
		for(int i = 0 ; i < aa.length; i++){
			if (max < aa[i]){
				max = aa[i];}
			if (min > aa[i]){
				min = aa[i];}
}
		System.out.println("최솟값 : " + min + " / 최대값 : " + max);		
//////////////////////////////////////////////////////////////////////////////////
	
	int[] shuffle = new int [10];
	for (int i = 0;  i < shuffle.length; i++){
		 shuffle[i] = i + 1;
	}
	System.out.println(Arrays.toString(shuffle));
	
	//배열의 값을 섞어주세요.
	//랜덤 인덱스와 0번 인덱스의 자리를 바꿔주세요.(여러번 반복)
	
//	for (int i = 0;  i < shuffle.length * 10; i++){
//	int random = (int) (Math.random() * shuffle.length);
//	int temp = shuffle[0];
//	shuffle[0] = shuffle[random];
//	shuffle[random] = shuffle[0];
//	}
//	System.out.println(Arrays.toString(shuffle));
//	
	// 1 ~ 10 사이의 랜덤값을 500번 생성하고, 각 숫자가 생성된 회수를 출력해주세요.
	
		int[] counts = new int[10];

		for (int i = 0; i < 500; i++) {
			int random = (int) (Math.random() * 10) + 1;
			// 1 -> counts[0]
			// 2 -> counts[1]
			// 3 -> counts[2]
			// ...
			counts[random - 1]++;
		}
		System.out.println(Arrays.toString(counts));
	
	
	
	
	
	
	
	}
}
