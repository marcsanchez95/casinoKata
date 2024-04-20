package combinations;

public class Shell {
	
	private final int twoSame = 7;
	private final int twoSamePlusWild = 14;
	private final int threeSame = 70;
	private final String shell = "Shell";
	private final String wild = "Wild";
	
	public int checkPrize(String result1, String result2, String result3) {
		
		int prize = 0;
		boolean prized = false;
		if (result1.equalsIgnoreCase(shell) && result2.equalsIgnoreCase(shell) && result3.equalsIgnoreCase(shell)) {
			prize = threeSame;
			prized = true;
		}
		if (prized == false && result1.equalsIgnoreCase(shell) && result2.equalsIgnoreCase(shell)) {
			prize = twoSame;
			prized = true;
		}
		if (prized == false && result1.equalsIgnoreCase(shell) && result3.equalsIgnoreCase(shell)) {
			prize = twoSame;
			prized = true;
		}
		if (prized == false && result2.equalsIgnoreCase(shell) && result3.equalsIgnoreCase(shell)) {
			prize = twoSame;
			prized = true;
		}
		if (prized == false && result1.equalsIgnoreCase(wild) && result2.equalsIgnoreCase(shell) && result3.equalsIgnoreCase(shell)) {
			prize = twoSamePlusWild;
			prized = true;
		}
		if (prized == false && result1.equalsIgnoreCase(shell) && result2.equalsIgnoreCase(wild) && result3.equalsIgnoreCase(shell)) {
			prize = twoSamePlusWild;
			prized = true;
		}
		if (prized == false && result1.equalsIgnoreCase(shell) && result2.equalsIgnoreCase(shell) && result3.equalsIgnoreCase(wild)) {
			prize = twoSamePlusWild;
			prized = true;
		}
		return prize;
		
	}
}
