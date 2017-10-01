public class BeerSong {
	
	public static void main(String[] args) {
		int beeNum = 99;
		String word = " бутылок (бутылки )";

		while (beeNum > 0) {

			if (beeNum == 1 || (beeNum % 10 == 1 && beeNum != 11)) {
				word = " бутылка";
			}

			else if ((beeNum > 1) && (beeNum < 5)) {
				word = " бутылки";	
			}
			
			else if ((beeNum % 10 > 1) && (beeNum % 10 < 5) && (beeNum > 20)) {
				word = " бутылки";
			} else {
				word = " бутылок";
			}

			System.out.println(beeNum + " " + word + " пива на стене");
			System.out.println(beeNum + " " + word + " пива.");
			System.out.println("¬озьми одну.");
			System.out.println("ѕусти по кругу.");
			beeNum = beeNum - 1;
			if (beeNum > 0) {
				if (beeNum == 1 || (beeNum % 10 == 1 && beeNum != 11)) {
					word = " бутылка";
				}

				else if ((beeNum > 1) && (beeNum < 5)) {
					word = " бутылки";	
				}
			
				else if ((beeNum % 10 > 1) && (beeNum % 10 < 5) && (beeNum > 20)) {
					word = " бутылки";
				} else {
					word = " бутылок";
				}
			   	System.out.println(beeNum + " " + word + " пива на стене");
			} else {
				System.out.println("Ќет бутылок пива на стене");
			}
		}
	}
}