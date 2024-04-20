package combinations;

public class Seven  {
	
	private final int twoSame = 6;
	private final int threeSame = 60;
	private final int twoSamePlusWild = 12;
	private final String seven = "Seven";
	private final String wild = "Wild";
	
	public int checkPrize(String result1, String result2, String result3) {
		
		int prize = 0;
		boolean prized = false;
		if (result1.equalsIgnoreCase(seven) && result2.equalsIgnoreCase(seven) && result3.equalsIgnoreCase(seven)) {
			prize = threeSame;
			prized = true;
		}
		if (prized == false && result1.equalsIgnoreCase(seven) && result2.equalsIgnoreCase(seven)) {
			prize = twoSame;
			prized = true;
		}
		if (prized == false && result1.equalsIgnoreCase(seven) && result3.equalsIgnoreCase(seven)) {
			prize = twoSame;
			prized = true;
		}
		if (prized == false && result2.equalsIgnoreCase(seven) && result3.equalsIgnoreCase(seven)) {
			prize = twoSame;
			prized = true;
		}
		if (prized == false && result1.equalsIgnoreCase(wild) && result2.equalsIgnoreCase(seven) && result3.equalsIgnoreCase(seven)) {
			prize = twoSamePlusWild;
			prized = true;
		}
		if (prized == false && result1.equalsIgnoreCase(seven) && result2.equalsIgnoreCase(wild) && result3.equalsIgnoreCase(seven)) {
			prize = twoSamePlusWild;
			prized = true;
		}
		if (prized == false && result1.equalsIgnoreCase(seven) && result2.equalsIgnoreCase(seven) && result3.equalsIgnoreCase(wild)) {
			prize = twoSamePlusWild;
			prized = true;
		}
		return prize;
		
	}
}