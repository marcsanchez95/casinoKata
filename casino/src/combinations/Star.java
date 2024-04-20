package combinations;

public class Star  {
	
	private final int twoSame = 9;
	private final int threeSame = 90;
	private final  int twoSamePlusWild = 18;
	
	private final String star = "Star";
	private final String wild = "Wild";
	public int checkPrize(String result1, String result2, String result3) {
		
		int prize = 0;
		boolean prized = false;
		if (result1.equalsIgnoreCase(star) && result2.equalsIgnoreCase(star) && result3.equalsIgnoreCase(star)) {
			prize = threeSame;
			prized = true;
		}
		if (prized == false && result1.equalsIgnoreCase(star) && result2.equalsIgnoreCase(star)) {
			prize = twoSame;
			prized = true;
		}
		if (prized == false && result1.equalsIgnoreCase(star) && result3.equalsIgnoreCase(star)) {
			prize = twoSame;
			prized = true;
		}
		if (prized == false && result2.equalsIgnoreCase(star) && result3.equalsIgnoreCase(star)) {
			prize = twoSame;
			prized = true;
		}
		if (prized == false && result1.equalsIgnoreCase(wild) && result2.equalsIgnoreCase(star) && result3.equalsIgnoreCase(star)) {
			prize = twoSamePlusWild;
			prized = true;
		}
		if (prized == false && result1.equalsIgnoreCase(star) && result2.equalsIgnoreCase(wild) && result3.equalsIgnoreCase(star)) {
			prize = twoSamePlusWild;
			prized = true;
		}
		if (prized == false && result1.equalsIgnoreCase(star) && result2.equalsIgnoreCase(star) && result3.equalsIgnoreCase(wild)) {
			prize = twoSamePlusWild;
			prized = true;
		}
		return prize;
		
	}

}