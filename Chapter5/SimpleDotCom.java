public class SimpleDotCom {

	private int[] locations;
	private int numOfHits;
	public void setLocationCells(int[] locations) {
		this.locations = locations;
	}
	public String checkYourself(String stringGuess) {
		int guess = Integer.parseInt(stringGuess);
		String result = "Fail";
		for (int cell : locations) {
			if (guess == cell) {
				result = "Caught";
				numOfHits++;
				break;
			}
		}
		if (numOfHits == locations.length) {
			result = "Crash";
		}
		System.out.println(result);
		return result;
	}
}

class SimpleDotComTestDrive {

	public static void main(String[] args) {
		SimpleDotCom dot = new SimpleDotCom();
		int []locations = {1, 2, 3};
		dot.setLocationCells(locations); 
		
		String userGuess = "2";
		String result = dot.checkYourself(userGuess);
		String testResult = "Fail";
		if (result.equals("Caught")) {
			testResult = "Done";
		}
		System.out.println(testResult);
	}
}

class SimpleDotComGame {

	public static void main(String[] args) {
		int numOfGuesses = 0;
		GameHelper helper = new GameHelper();
		SimpleDotCom theDotCom = new SimpleDotCom();
		int randomNum = (int) (Math.random() * 5);
		int[] locations = {randomNum, randomNum + 1, randomNum + 2};
		theDotCom.setLocationCells(locations);
		boolean isAlive = true;
		while (isAlive ==true) {
			String guess = helper.getUserInput("Enter number");
			String result = theDotCom.checkYourself(guess);
			numOfGuesses++;
			if (result.equals("Crash")) {
				isAlive = false;
				System.out.println("We need " + numOfGuesses + " attempts");
			}
		}
	}
}