package d_array;

import java.util.Arrays;

public class dsf {

	public static void main(String[] args) {
		
		int[][] arr = new int[2][3];
//		arr[0] = 10; //값을 저장할 수 없다.
		arr[0] = new int[5]; //배열을 저장해야 한다.
		arr[0][0] = 10; //2차원에 값을 저장할 수 있다.
		arr[0][1] = 20;
		arr[1][0] = 100;
	
		System.out.println(arr.length);    //1차원 배열의 길이
		System.out.println(arr[0].length);
		System.out.println(arr[1].length); //2차원 배열의 길이
	
		
		
		}
	}

	

