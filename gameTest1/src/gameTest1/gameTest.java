package gameTest1;

import java.util.Scanner;

public class gameTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double random = ((int)Math.random() * 3)+1 ;
		int user1 = 0, user2 = 0, count1 = 0, count2 = 0;
		String name = null;

		System.out.println("���� ���� �� ������ �����մϴ�");
		System.out.println("�̸��� �����ּ���");
		name = sc.nextLine();

		/*
		 * for (;;) { if (count1 == 3 || count2 == 3) { if (count1 > count2) {
		 * System.out.println(name + "���� �̰���ϴ�"); } else {
		 * System.out.println("��ǻ�Ͱ� �̰���ϴ�"); } break; }
		 * System.out.println("���� : 1, ���� : 2, ��:3"); user1 = sc.nextInt(); user2 =
		 * (int) (Math.random() * 3) + 1; System.out.println(user2 + "��ǻ�Ͱ� �� ����"); if
		 * (user1 == 1) {
		 * 
		 * if (user2 == 1) { System.out.println("�����ϴ�"); } else if (user2 == 2) {
		 * System.out.println("��ǻ�Ͱ� �̰���ϴ�"); count2++; } else if (user2 == 3) {
		 * System.out.println("�̰���ϴ�"); count1++; } } if (user1 == 2) { if (user2 == 1)
		 * { System.out.println("�̱�̽��ϴ�"); count1++; } else if (user2 == 2) {
		 * System.out.println("�����ϴ�"); } else { System.out.println("���̽��ϴ�"); count2++;
		 * } } if (user1 == 3) { if (user2 == 1) { System.out.println("��ǻ�Ͱ� �̰���ϴ�");
		 * count2++; } else if (user2 == 2) { System.out.println("�̱�̽��ϴ�"); count1++; }
		 * else { System.out.println("���̽��ϴ�"); } }
		 * 
		 * }
		 */
		while (true) {
			if (count1 == 3 || count2 == 3) {
				if (count1 > count2) {
					System.out.println(name + "���� �̰���ϴ�");
				} else {
					System.out.println("��ǻ�Ͱ� �̰���ϴ�");
				}
				break;
			}
			System.out.println("���� : 1, ���� : 2, ��:3");
			user1 = sc.nextInt();
			user2 = (int) (Math.random() * 3) + 1;
			System.out.println("��ǻ�Ͱ� �� ����"+user2);
			switch (user1) {
			case 1:
				if (user2 == 1) {
					System.out.println("�����ϴ�");
				} else if (user2 == 2) {
					System.out.println("��ǻ�Ͱ� �̰���ϴ�");
					count2++;
				} else if (user2 == 3) {
					System.out.println("�̰���ϴ�");
					count1++;
				}
				break;
			case 2:
				if (user2 == 1) {
					System.out.println("�̱�̽��ϴ�");
					count1++;
				} else if (user2 == 2) {
					System.out.println("�����ϴ�");
				} else {
					System.out.println("��ǻ�Ͱ� �̰���ϴ�");
					count2++;
				}
				break;
			case 3:
				if (user2 == 1) {
					System.out.println("��ǻ�Ͱ� �̰���ϴ�");
					count2++;
				} else if (user2 == 2) {
					System.out.println("�̱�̽��ϴ�");
					count1++;
				} else {
					System.out.println("���̽��ϴ�");
				}
			}
		}

	}

}
