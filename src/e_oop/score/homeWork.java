package e_oop.score;

public class homeWork {

	public static void main(String[] args) {
		gg kk = new gg();
		
		Student[] students = new Student[10];  //단순 배열 10개를 만든다.

		String[] subjects = { "국어", "영어", "수학", };

		for (int i = 0; i < students.length; i++) {
			Student student = new Student();   //객체생성을한다. 학생 10명을 만든다. 학생 10명이 다른 class를 사용하기위해 써준다.

			student.name = "학생" + (i + 1);
			student.rank = 1;
			student.kor = (int) (Math.random() * 101);
			student.eng = (int) (Math.random() * 101);
			student.math = (int) (Math.random() * 101);

			student.sum = (int) kk.test1(student.kor, student.eng, student.math);
			student.avg = kk.test2(student.sum);

			students[i] = student;
		}

		//석차 호출
		kk.tset4(students);
			

		// 석차순으로 정렬

		for (int i = 0; i < students.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < students.length; j++) {
				if (students[j].sum > students[min].sum) {
					min = j;
				}
			}
			
			Student temp = students[i];
			students[i] = students[min];
			students[min]= temp;
		}
		
		
//			int temp = students[i].kor;
//			students[i].kor = students[min].kor;
//			students[min].kor = temp;
//
//			int temp2 = students[i].eng;
//			students[i].eng = students[min].eng;
//			students[min].eng = temp2;
//
//			int temp3 = students[i].math;
//			students[i].math = students[min].math;
//			students[min].math = temp3;
//
//			int temp4 = students[i].sum;
//			students[i].sum = students[min].sum;
//			students[min].sum = temp4;
//
//			double temp5 = students[i].avg;
//			students[i].avg = students[min].avg;
//			students[min].avg = temp5;
//
//			int temp6 = students[i].rank;
//			students[i].rank = students[min].rank;
//			students[min].rank = temp6;
//
//			String temp7 = students[i].name;
//			students[i].name = students[min].name;
//			students[min].name = temp7;
		

		int korSum = 0;
		int engSum = 0;
		int mathSum = 0;
		//int[] subSum = new int[subjects.length]

		for (int i = 0; i < students.length; i++) {
			korSum += students[i].kor;    //subSum[0]
			engSum += students[i].eng;    //subSum[0]
			mathSum += students[i].math;  //subSum[0]
		}

		// 과목평균
		double korAvg = 0;
		double engAvg = 0;
		double mathAvg = 0;
		//double[] subAvg = new double[subjects.length]
		
		
		korAvg = Math.round((double) korSum / students.length * 100) / 100.0;
		engAvg = Math.round((double) engSum / students.length * 100) / 100.0;
		mathAvg = Math.round((double) mathSum / students.length * 100) / 100.0;
		// 출력

		for (int i = 0; i < subjects.length; i++) {
			System.out.print("\t" + subjects[i]);
		}
		System.out.println("\t" + "합계" + "\t" + "평균" + "\t" + "석차");

		for (int i = 0; i < students.length; i++) {
			System.out.print(students[i].name + "\t" + students[i].kor + "\t"
					+ students[i].eng + "\t" + students[i].math + "\t"
					+ students[i].sum + "\t" + students[i].avg + "\t"
					+ students[i].rank);
			System.out.println();
		}

		System.out.print("과목합계\t");
		System.out.print(korSum + "\t" + engSum + "\t" + mathSum);

		System.out.println();

		System.out.print("과목평균\t");
		System.out.print(korAvg + "\t" + mathAvg + "\t" + engAvg);

	}
		
	}

