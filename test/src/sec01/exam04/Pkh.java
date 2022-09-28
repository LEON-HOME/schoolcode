package sec01.exam04;

import java.util.Scanner;

public class Pkh {
	public static void main(String[] args)throws Exception {
		boolean run = true;
		Scanner scanner =new Scanner(System.in);
		
		long um = 0;
		
		while(run)
		{
			System.out.print("\n\n");
			System.out.println("------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("------------------------------");
			System.out.print("선택");
			
			int ch = scanner.nextInt();
			switch(ch)
			{
			case 1:
				System.out.print("예금액");
				long ba = scanner.nextLong();
				um = um + ba;
				System.out.print("완료");
				continue;
			case 2:
				System.out.print("출금액");
				long om = scanner.nextLong();
				if(0 <= um - om)
				{
					um = um-om;
					System.out.print("출금완료");
				}
				else 
				{
					System.out.print("금액부족");
				}
			case 3:
				System.out.print("잔고>" +um);
				continue;
			case 4:
				System.out.print("종료");
				run = false;
				break;
			default:
				continue;
			}

		}
	}
}