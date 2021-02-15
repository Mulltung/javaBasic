package c_statement;

import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {

		// int q1 = (int) (Math.random() * 9) + 1;
		// int q2 = (int) (Math.random() * 9) + 1;
		// int q3 = (int) (Math.random() * 9) + 1;

		//
		// while (true) {
		// if (q1 == q2) {
		// q1 = (int) (Math.random() * 9) + 1;
		// q2 = (int) (Math.random() * 9) + 1;
		// q3 = (int) (Math.random() * 9) + 1;
		// } else if (q1 == q3) {
		// q1 = (int) (Math.random() * 9) + 1;
		// q2 = (int) (Math.random() * 9) + 1;
		// q3 = (int) (Math.random() * 9) + 1;
		// } else if (q2 == q3) {
		// q1 = (int) (Math.random() * 9) + 1;
		// q2 = (int) (Math.random() * 9) + 1;
		// q3 = (int) (Math.random() * 9) + 1;
		// } else
		// break;

		int q1 = 0;
		int q2 = 0;
		int q3 = 0;
		int S = 0;
		int B = 0;
		int O = 0;

		while (true) {
			q1 = (int) (Math.random() * 9) + 1;
			q2 = (int) (Math.random() * 9) + 1;
			q3 = (int) (Math.random() * 9) + 1;
			if (q1 != q2 && q1 != q3 && q2 != q3) {
				break;
			}

		}

		System.out.println(q1 + "   " + q2 + "   " + q3);

		Scanner s = new Scanner(System.in);
		System.out.println("랜덤수를 맞춰보세요 : ");
		int a1 = Integer.parseInt(s.nextLine());
		System.out.println("랜덤수를 맞춰보세요 : ");
		int a2 = Integer.parseInt(s.nextLine());
		System.out.println("랜덤수를 맞춰보세요 : ");
		int a3 = Integer.parseInt(s.nextLine());

		// ===============================
		if (q1 == a1) {
			S += 1;
		} else if (q1 == a2 || q1 == a3) {
			B += 1;
		} else {
			O += 1;
		}
		// ==============================
		if (q2 == a2) {
			S += 1;
		} else if (q2 == a1 || q2 == a3) {
			B += 1;
		} else {
			O += 1;
		}
		// ==============================
		if (q3 == a3) {
			S += 1;
		} else if (q3 == a1 || q3 == a2) {
			B += 1;
		} else {
			O += 1;
		}

		System.out.println("S :" + S + " B :" + B + " O: " + O);

		
	}

}
