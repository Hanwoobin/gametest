package gameTest1;

import java.util.Scanner;

public class gameTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double random = ((int) Math.random() * 3) + 1;
		String user1 = null; 
		int user1_use=0,count1 = 0, count2 = 0,user2 =0;
		String name = null;

		System.out.println("가위 바위 보 게임을 시작합니다");
		System.out.println("이름을 적어주세요");
		name = sc.nextLine();
		
		for (;;) {
			if (count1 == 3 || count2 == 3) {
				if (count1 > count2) {
					System.out.println(name + "님이 이겼습니다");
				} else {
					System.out.println("컴퓨터가 이겼습니다");
				}
				break;
			}
			System.out.println("가위, 바위 , 보, 중 입력하세요");
			user1 = sc.nextLine();
			if (user1.equals("보")) {
				user1_use = 3;
			}else if (user1.equals("가위")) {
				user1_use=1;
			}else if (user1.equals("바위")) {
				user1_use =2;
			}else {
				System.out.println("다른것을 입력했습니다 다시 입력해주세요");
				continue;
			}
			user2 = (int) (Math.random() * 3) + 1;
			if(user2>0) {
				if(user2 == 1) {
					System.out.println("컴퓨터가 낸 것 : 가위");
				} else if (user2 == 2) {
					System.out.println("컴퓨터가 낸 것 : 바위");
				}else {
					System.out.println("컴퓨터가 낸 것 : 보");
				}
			}
			
			if (user1_use == 1) {
				if (user2 == 1) {
					System.out.println("비겼습니다");
				} else if (user2 == 2) {
					System.out.println("컴퓨터가 이겼습니다");
					count2++;
				} else if (user2 == 3) {
					System.out.println("이겼습니다");
					count1++;
				}
			}
			if (user1_use == 2) {
				if (user2 == 1) {
					System.out.println("이기셨습니다");
					count1++;
				} else if (user2 == 2) {
					System.out.println("비겼습니다");
				} else {
					System.out.println("지셨습니다");
					count2++;
				}
			}
			if (user1_use == 3) {
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
