package combinations;

public class Cherry  {
	
	private final int twoSame = 5;
	private final int threeSame = 50;
	private final int twoSamePlusWild = 10;
	private final String cherry = "Cherry";
	private final String wild = "Wild";
	
	public int checkPrize(String result1, String result2, String result3) {
		
		int prize = 0;
		boolean prized = false;
		if (result1.equalsIgnoreCase(cherry) && result2.equalsIgnoreCase(cherry) && result3.equalsIgnoreCase(cherry)) {
			prize = threeSame;
			prized = true;
		}
		if (prized == false && result1.equalsIgnoreCase(cherry) && result2.equalsIgnoreCase(cherry)) {
			prize = twoSame;
			prized = true;
		}
		if (prized == false && result1.equalsIgnoreCase(cherry) && result3.equalsIgnoreCase(cherry)) {
			prize = twoSame;
			prized = true;
		}
		if (prized == false && result2.equalsIgnoreCase(cherry) && result3.equalsIgnoreCase(cherry)) {
			prize = twoSame;
			prized = true;
		}
		if (prized == false && result1.equalsIgnoreCase(wild) && result2.equalsIgnoreCase(cherry) && result3.equalsIgnoreCase(cherry)) {
			prize = twoSamePlusWild;
			prized = true;
		}
		if (prized == false && result1.equalsIgnoreCase(cherry) && result2.equalsIgnoreCase(wild) && result3.equalsIgnoreCase(cherry)) {
			prize = twoSamePlusWild;
			prized = true;
		}
		if (prized == false && result1.equalsIgnoreCase(cherry) && result2.equalsIgnoreCase(cherry) && result3.equalsIgnoreCase(wild)) {
			prize = twoSamePlusWild;
			prized = true;
		}
		return prize;
		
	}
}
