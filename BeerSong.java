public class BeerSong {
	
	public static void main(String[] args) {
		int beeNum = 99;
		String word = " ������� (������� )";

		while (beeNum > 0) {

			if (beeNum == 1 || (beeNum % 10 == 1 && beeNum != 11)) {
				word = " �������";
			}

			else if ((beeNum > 1) && (beeNum < 5)) {
				word = " �������";	
			}
			
			else if ((beeNum % 10 > 1) && (beeNum % 10 < 5) && (beeNum > 20)) {
				word = " �������";
			} else {
				word = " �������";
			}

			System.out.println(beeNum + " " + word + " ���� �� �����");
			System.out.println(beeNum + " " + word + " ����.");
			System.out.println("������ ����.");
			System.out.println("����� �� �����.");
			beeNum = beeNum - 1;
			if (beeNum > 0) {
				if (beeNum == 1 || (beeNum % 10 == 1 && beeNum != 11)) {
					word = " �������";
				}

				else if ((beeNum > 1) && (beeNum < 5)) {
					word = " �������";	
				}
			
				else if ((beeNum % 10 > 1) && (beeNum % 10 < 5) && (beeNum > 20)) {
					word = " �������";
				} else {
					word = " �������";
				}
			   	System.out.println(beeNum + " " + word + " ���� �� �����");
			} else {
				System.out.println("��� ������� ���� �� �����");
			}
		}
	}
}