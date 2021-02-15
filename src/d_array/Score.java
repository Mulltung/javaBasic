package d_array;

import java.util.Arrays;

public class Score {

	public static void main(String[] args) {
		/*
		 * 우리반 모두의 국어, 영어, 수학, 사회, 과학, Oracle, Java 점수를
		 * 0~100까지 랜던으로 생성해주시고, 아래와 같이 출력해주세요.
		 * 
		 *  		국어		영어		수학		사회		과학		Oracle	 Java		합계			평균			석차
		 * 홍길동		90		90		90		90		90		90		  90	    630		    90.00		 1
		 * 홍길동		90		90		90		90		90		90		  90	    630		    90.00		 1
		 * 홍길동		90		90		90		90		90		90		  90	    630		    90.00		 1
		 * 홍길동		90		90		90		90		90		90		  90	    630		    90.00		 1
		 * 홍길동		90		90		90		90		90		90		  90	    630		    90.00		 1
		 * 홍길동		90		90		90		90		90		90		  90	    630		    90.00		 1
		 * 홍길동		90		90		90		90		90		90		  90	    630		    90.00		 1
		 * 홍길동		90		90		90		90		90		90		  90	    630		    90.00		 1
		 * 홍길동		90		90		90		90		90		90		  90	    630		    90.00		 1
		 * 홍길동		90		90		90		90		90		90		  90	    630		    90.00		 1
		 * 과목평균      90.00   90.00	90.00	90.00	90.00	90.00	  90.00		
		 * 
		 */

	
		// 방들
		int[][] scores = new int[22][7]; // int[학생수][과목수]
		int[] sum = new int[scores.length]; // 합계
		double[] avg = new double[scores.length]; // 평균

		// 점수 넣기
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				scores[i][j] = (int) (Math.random() * 101);
			}
			System.out.println(Arrays.toString(scores[i]));
		}

		// 합계, 평균 구하기
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				sum[i] += scores[i][j];
				;
			}

			avg[i] = Math.round((double) sum[i] / scores[i].length * 10) / 10.0;
		}

		// 합계 , 평균, 석차 한 줄로 쓰기
		System.out.println("  합계   " + "             평균   "
				+ "                 석차    ");

		// 석차구하기
		int[] rank = new int[sum.length];

		for (int i = 0; i < rank.length; i++) {
			rank[i] = 1;
		}

		for (int i = 0; i < rank.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				if (sum[i] < sum[j]) {
					rank[i]++;
				}
			}

			// 합계 평균 석차 한줄로 쓰기
			System.out.print(" " + sum[i]);
			System.out.print("        " + avg[i]);
			System.out.println("          " + rank[i]);
		}

		// 과목의 합계, 평균
		int[] subsum = new int[scores.length]; // 합계
	//	double[] subavg = new double[scores[].length]; // 합계
		for (int i = 0; i < scores[i].length; i++) {
			for (int j = 0; j < scores.length; j++) {
				subsum[i] += scores[j][i];
				

			}

		//	subavg[i] = Math.round((double) subsum[i] / scores[i].length * 10) / 10.0;

			// System.out.println("과목합계 : " + Arrays.toString(subsum[i]));
			// System.out.println("과목합계 : " + Arrays.toString(avg[i]));
			System.out.print(subsum[i] + "\t");

		
		}
   System.out.println();
//		for (int i = 0; i < subavg.length; i++) {
		
			
	//	System.out.print(subavg[i] + "\t");}
	}
}
