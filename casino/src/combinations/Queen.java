package combinations;

public class Queen {
	
	private final int twoSame = 2;
	private final int threeSame = 20;
	private final int twoSamePlusWild = 4;
	private final String queen = "Queen";
	private final String wild = "Wild";
	
	public int checkPrize(String result1, String result2, String result3) {
		
		int prize = 0;
		boolean prized = false;
		if (result1.equalsIgnoreCase(queen) && result2.equalsIgnoreCase(queen) && result3.equalsIgnoreCase(queen)) {
			prize = threeSame;
			prized = true;
		}
		if (prized == false && result1.equalsIgnoreCase(queen) && result2.equalsIgnoreCase(queen)) {
			prize = twoSame;
			prized = true;
		}
		if (prized == false && result1.equalsIgnoreCase(queen) && result3.equalsIgnoreCase(queen)) {
			prize = twoSame;
			prized = true;
		}
		if (prized == false && result2.equalsIgnoreCase(queen) && result3.equalsIgnoreCase(queen)) {
			prize = twoSame;
			prized = true;
		}
		if (prized == false && result1.equalsIgnoreCase(wild) && result2.equalsIgnoreCase(queen) && result3.equalsIgnoreCase(queen)) {
			prize = twoSamePlusWild;
			prized = true;
		}
		if (prized == false && result1.equalsIgnoreCase(queen) && result2.equalsIgnoreCase(wild) && result3.equalsIgnoreCase(queen)) {
			prize = twoSamePlusWild;
			prized = true;
		}
		if (prized == false && result1.equalsIgnoreCase(queen) && result2.equalsIgnoreCase(queen) && result3.equalsIgnoreCase(wild)) {
			prize = twoSamePlusWild;
			prized = true;
		}
		return prize;
		
	}

}