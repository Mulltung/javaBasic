package e_oop.score;

public class gg {
	
	//학생 점수 합계
	double test1(double a, double b, double c){
		return a + b + c;
	}
	
	//학생 점수 평균 
	double test2(double a){
		return Math.round((double) a / 3.0 * 100) / 100.0;
	}

			
	//석차
	Student[] tset4(Student[] students){
		for (int i = 0; i < students.length; i++) {
			for (int j = 0; j < students.length; j++) {
				if (students[i].sum < students[j].sum) {
					students[i].rank++;
				}
			}
		}
		return students;
	}
}