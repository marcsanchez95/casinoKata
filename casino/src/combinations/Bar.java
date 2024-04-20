package combinations;

public class Bar {
	
	private final int twoSame = 4;
	private final int threeSame = 40;
	private final int twoSamePlusWild = 8;
	private final String bar = "Bar";
	private final String wild = "Wild";
	
	public int checkPrize(String result1, String result2, String result3) {
		
		int prize = 0;
		boolean prized = false;
		if (result1.equalsIgnoreCase(bar) && result2.equalsIgnoreCase(bar) && result3.equalsIgnoreCase(bar)) {
			prize = threeSame;
			prized = true;
		}
		if (prized == false && result1.equalsIgnoreCase(bar) && result2.equalsIgnoreCase(bar)) {
			prize = twoSame;
			prized = true;
		}
		if (prized == false && result1.equalsIgnoreCase(bar) && result3.equalsIgnoreCase(bar)) {
			prize = twoSame;
			prized = true;
		}
		if (prized == false && result2.equalsIgnoreCase(bar) && result3.equalsIgnoreCase(bar)) {
			prize = twoSame;
			prized = true;
		}
		if (prized == false && result1.equalsIgnoreCase(wild) && result2.equalsIgnoreCase(bar) && result3.equalsIgnoreCase(bar)) {
			prize = twoSamePlusWild;
			prized = true;
		}
		if (prized == false && result1.equalsIgnoreCase(bar) && result2.equalsIgnoreCase(wild) && result3.equalsIgnoreCase(bar)) {
			prize = twoSamePlusWild;
			prized = true;
		}
		if (prized == false && result1.equalsIgnoreCase(bar) && result2.equalsIgnoreCase(bar) && result3.equalsIgnoreCase(wild)) {
			prize = twoSamePlusWild;
			prized = true;
		}
		return prize;
		
	}

}