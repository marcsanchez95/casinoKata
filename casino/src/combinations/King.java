package combinations;

public class King{
	
	private final int twoSame = 3;
	private final int threeSame = 30;
	private final int twoSamePlusWild = 6;
	
	private final String king = "King";
	private final String wild = "Wild";
	public int checkPrize(String result1, String result2, String result3) {
		
		int prize = 0;
		boolean prized = false;
		if (result1.equalsIgnoreCase(king) && result2.equalsIgnoreCase(king) && result3.equalsIgnoreCase(king)) {
			prize = threeSame;
			prized = true;
		}
		if (prized == false && result1.equalsIgnoreCase(king) && result2.equalsIgnoreCase(king)) {
			prize = twoSame;
			prized = true;
		}
		if (prized == false && result1.equalsIgnoreCase(king) && result3.equalsIgnoreCase(king)) {
			prize = twoSame;
			prized = true;
		}
		if (prized == false && result2.equalsIgnoreCase(king) && result3.equalsIgnoreCase(king)) {
			prize = twoSame;
			prized = true;
		}
		if (prized == false && result1.equalsIgnoreCase(wild) && result2.equalsIgnoreCase(king) && result3.equalsIgnoreCase(king)) {
			prize = twoSamePlusWild;
			prized = true;
		}
		if (prized == false && result1.equalsIgnoreCase(king) && result2.equalsIgnoreCase(wild) && result3.equalsIgnoreCase(king)) {
			prize = twoSamePlusWild;
			prized = true;
		}
		if (prized == false && result1.equalsIgnoreCase(king) && result2.equalsIgnoreCase(king) && result3.equalsIgnoreCase(wild)) {
			prize = twoSamePlusWild;
			prized = true;
		}
		return prize;
		
	}

}
