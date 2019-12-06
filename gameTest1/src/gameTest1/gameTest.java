package gameTest1;

import java.util.Scanner;

public class gameTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double random = ((int)Math.random() * 3)+1 ;
		int user1 = 0, user2 = 0, count1 = 0, count2 = 0;
		String name = null;

		System.out.println("가위 바위 보 게임을 시작합니다");
		System.out.println("이름을 적어주세요");
		name = sc.nextLine();

		/*
		 * for (;;) { if (count1 == 3 || count2 == 3) { if (count1 > count2) {
		 * System.out.println(name + "님이 이겼습니다"); } else {
		 * System.out.println("컴퓨터가 이겼습니다"); } break; }
		 * System.out.println("가위 : 1, 바위 : 2, 보:3"); user1 = sc.nextInt(); user2 =
		 * (int) (Math.random() * 3) + 1; System.out.println(user2 + "컴퓨터가 낸 숫자"); if
		 * (user1 == 1) {
		 * 
		 * if (user2 == 1) { System.out.println("비겼습니다"); } else if (user2 == 2) {
		 * System.out.println("컴퓨터가 이겼습니다"); count2++; } else if (user2 == 3) {
		 * System.out.println("이겼습니다"); count1++; } } if (user1 == 2) { if (user2 == 1)
		 * { System.out.println("이기셨습니다"); count1++; } else if (user2 == 2) {
		 * System.out.println("비겼습니다"); } else { System.out.println("지셨습니다"); count2++;
		 * } } if (user1 == 3) { if (user2 == 1) { System.out.println("컴퓨터가 이겼습니다");
		 * count2++; } else if (user2 == 2) { System.out.println("이기셨습니다"); count1++; }
		 * else { System.out.println("비기셨습니다"); } }
		 * 
		 * }
		 */
		while (true) {
			if (count1 == 3 || count2 == 3) {
				if (count1 > count2) {
					System.out.println(name + "님이 이겼습니다");
				} else {
					System.out.println("컴퓨터가 이겼습니다");
				}
				break;
			}
			System.out.println("가위 : 1, 바위 : 2, 보:3");
			user1 = sc.nextInt();
			user2 = (int) (Math.random() * 3) + 1;
			System.out.println("컴퓨터가 낸 숫자"+user2);
			switch (user1) {
			case 1:
				if (user2 == 1) {
					System.out.println("비겼습니다");
				} else if (user2 == 2) {
					System.out.println("컴퓨터가 이겼습니다");
					count2++;
				} else if (user2 == 3) {
					System.out.println("이겼습니다");
					count1++;
				}
				break;
			case 2:
				if (user2 == 1) {
					System.out.println("이기셨습니다");
					count1++;
				} else if (user2 == 2) {
					System.out.println("비겼습니다");
				} else {
					System.out.println("컴퓨터가 이겼습니다");
					count2++;
				}
				break;
			case 3:
				if (user2 == 1) {
					System.out.println("컴퓨터가 이겼습니다");
					count2++;
				} else if (user2 == 2) {
					System.out.println("이기셨습니다");
					count1++;
				} else {
					System.out.println("비기셨습니다");
				}
			}
		}

	}

}
