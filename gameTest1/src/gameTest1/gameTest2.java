package gameTest1;

import java.util.Scanner;

public class gameTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double random = ((int) Math.random() * 3) + 1;
		String user1 = null; 
		int user1_use=0,count1 = 0, count2 = 0,user2 =0;
		String name = null;

		System.out.println("���� ���� �� ������ �����մϴ�");
		System.out.println("�̸��� �����ּ���");
		name = sc.nextLine();
		
		for (;;) {
			if (count1 == 3 || count2 == 3) {
				if (count1 > count2) {
					System.out.println(name + "���� �̰���ϴ�");
				} else {
					System.out.println("��ǻ�Ͱ� �̰���ϴ�");
				}
				break;
			}
			System.out.println("����, ���� , ��, �� �Է��ϼ���");
			user1 = sc.nextLine();
			if (user1.equals("��")) {
				user1_use = 3;
			}else if (user1.equals("����")) {
				user1_use=1;
			}else if (user1.equals("����")) {
				user1_use =2;
			}else {
				System.out.println("�ٸ����� �Է��߽��ϴ� �ٽ� �Է����ּ���");
				continue;
			}
			user2 = (int) (Math.random() * 3) + 1;
			if(user2>0) {
				if(user2 == 1) {
					System.out.println("��ǻ�Ͱ� �� �� : ����");
				} else if (user2 == 2) {
					System.out.println("��ǻ�Ͱ� �� �� : ����");
				}else {
					System.out.println("��ǻ�Ͱ� �� �� : ��");
				}
			}
			
			if (user1_use == 1) {
				if (user2 == 1) {
					System.out.println("�����ϴ�");
				} else if (user2 == 2) {
					System.out.println("��ǻ�Ͱ� �̰���ϴ�");
					count2++;
				} else if (user2 == 3) {
					System.out.println("�̰���ϴ�");
					count1++;
				}
			}
			if (user1_use == 2) {
				if (user2 == 1) {
					System.out.println("�̱�̽��ϴ�");
					count1++;
				} else if (user2 == 2) {
					System.out.println("�����ϴ�");
				} else {
					System.out.println("���̽��ϴ�");
					count2++;
				}
			}
			if (user1_use == 3) {
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
