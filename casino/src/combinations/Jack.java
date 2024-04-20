package combinations;

public class Jack  {
	
	private final int twoSame = 1;
	private final int threeSame = 10;
	private final int twoSamePlusWild = 2;
	private final String jack = "Jack";
	private final String wild = "Wild";
	public int checkPrize(String result1, String result2, String result3) {
		
		int prize = 0;
		boolean prized = false;
		if (result1.equalsIgnoreCase(jack) && result2.equalsIgnoreCase(jack) && result3.equalsIgnoreCase(jack)) {
			prize = threeSame;
			prized = true;
		}
		if (prized == false && result1.equalsIgnoreCase(jack) && result2.equalsIgnoreCase(jack)) {
			prize = twoSame;
			prized = true;
		}
		if (prized == false && result1.equalsIgnoreCase(jack) && result3.equalsIgnoreCase(jack)) {
			prize = twoSame;
			prized = true;
		}
		if (prized == false && result2.equalsIgnoreCase(jack) && result3.equalsIgnoreCase(jack)) {
			prize = twoSame;
			prized = true;
		}
		if (prized == false && result1.equalsIgnoreCase(wild) && result2.equalsIgnoreCase(jack) && result3.equalsIgnoreCase(jack)) {
			prize = twoSamePlusWild;
			prized = true;
		}
		if (prized == false && result1.equalsIgnoreCase(jack) && result2.equalsIgnoreCase(wild) && result3.equalsIgnoreCase(jack)) {
			prize = twoSamePlusWild;
			prized = true;
		}
		if (prized == false && result1.equalsIgnoreCase(jack) && result2.equalsIgnoreCase(jack) && result3.equalsIgnoreCase(wild)) {
			prize = twoSamePlusWild;
			prized = true;
		}
		return prize;
		
	}

}
