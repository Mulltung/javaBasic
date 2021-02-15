package j_collection;

import java.util.ArrayList;

public class Score {

	public static void main(String[] args) {
		/*
		 * 우리반 모두의 국어, 영어, 수학, 사회, 과학, Oracle, Java 점수를
		 * 0 ~ 100까지 랜덤으로 생성해주시고, 아래와 같이 출력해주세요.
		 * 
		 * 			국어		영어		수학		사회		과학		Oracle	Java	합계		평균		석차
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 과목합계	450		450		450		450		450		450		450
		 * 과목평균	90.00	90.00	90.00	90.00	90.00	90.00	90.00
		 */
		String[] names1 = {"허지영", "김민지", "김동민", "배현태", "여인욱", "김동희", "김인혁", "이영섭", "정선영", "이지향", "김용진"};
		String[] subjects1 = {"국어", "영어", "수학", "사회", "과학", "Oracle", "Java"};
		
		
		//학생
		ArrayList<String>names = new ArrayList<>();
		for (int i = 0; i < names1.length; i++) {
			names.add(names1[i]);
		} 
		
		//과목
		ArrayList<String>subjects = new ArrayList<>();
		for (int i = 0; i <subjects1.length; i++) {
			subjects.add(subjects1[i]);
		} 
		
		
		//랜덤점수 넣기
		ArrayList<ArrayList<Integer>>score2 = new ArrayList<>();
		for(int i = 0; i < names.size(); i++){
			ArrayList<Integer> score = new ArrayList<>();
			for(int j = 0; j < subjects.size(); j++){
				score.add((int)(Math.random() * 101)) ;
			}
			score2.add(score);
		}
		
		//학생의 합계,평균
		ArrayList<Integer> nameSum = new ArrayList<>();
		ArrayList<Double> nameAvg = new ArrayList<>();
		for(int i = 0; i < score2.size(); i++){
			int sum = 0;
			for(int j = 0; j < score2.get(i).size(); j++){
				sum += score2.get(i).get(j);
			}
			nameSum.add(sum);
			nameAvg.add( Math.round((double)nameSum.get(i) / subjects.size() * 100) / 100.0); 
		}
		
		//과목별 합계,평균
		ArrayList<Integer> subSum = new ArrayList<>();
		ArrayList<Double> subAvg = new ArrayList<>();
		for(int i = 0; i < subjects.size(); i++){
			int sum =0;
			for(int j = 0; j < names.size(); j++){
				sum += score2.get(j).get(i);
			}
			subSum.add(sum);
			subAvg.add( Math.round((double)subSum.get(i) / score2.size() * 100) / 100.0);
		}
		
		//석차구하기
		ArrayList<Integer> rank1 = new ArrayList<>();
		for(int i = 0; i < nameSum.size(); i++){
			rank1.add(1);
			for(int j = 0; j < nameSum.size(); j++){
				if(nameSum.get(i) < nameSum.get(j)) {
					rank1.set(i, rank1.get(i) +1);
				}
			}
		}
		
		
		//석차순으로 정렬(시험에서 출제되지 않음)
		for(int i = 0; i < nameSum.size() - 1; i++){
			int min = i;
			for(int j = i + 1; j < rank1.size(); j++){
				if(rank1.get(j) > rank1.get(min)){
					min = j;
				}
			}
			
			String tempStudent = names.get(i);
			names.set(i, names.get(min));
			names.set(min, tempStudent);
			
			ArrayList<Integer> tempScore = score2.get(i);
			score2.set(i, score2.get(min));
			score2.set(min, tempScore);
			
			Integer tempSum = nameSum.get(i);
			nameSum.set(i , nameSum.get(min));
			nameSum.set(min, tempSum);
			
			double tempAvg = nameAvg.get(i);
			nameAvg.set(i ,nameAvg.get(min));
			nameAvg.set(min, tempAvg);
			
			Integer tempRank = rank1.get(i);
			rank1.set(i, rank1.get(min));
			rank1.set(min, tempRank);
		
		}
		
		
		
		
		for(int i = 0; i < subjects.size(); i++){
			System.out.print("\t" + subjects.get(i));
		}
		System.out.println("\t합계\t평균\t석차");
		for(int i = 0; i < score2.size(); i++){
			System.out.print(names.get(i) + "\t");
			for(int j = 0; j < score2.get(i).size(); j++){
				System.out.print( score2.get(i).get(j) + "\t");
			}
			System.out.println(nameSum.get(i) + "\t" + nameAvg.get(i) + "\t" + rank1.get(i));
		}
		
		System.out.print("과목합계\t");
		for(int i = 0; i < subSum.size(); i++){
			System.out.print(subSum.get(i) + "\t");
		}
		System.out.println();
		
		System.out.print("과목평균\t");
		for(int i = 0; i < subAvg.size(); i++){
			System.out.print(subAvg.get(i) + "\t");
		}
	}

}