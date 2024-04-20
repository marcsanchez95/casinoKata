package combinations;

public class Wild {

	private final int twoSame = 10;
	private final int threeSame = 100;

	private final String wild = "Wild";

	public int checkPrize(String result1, String result2, String result3) {

		int prize = 0;
		boolean prized = false;
		if (result1.equalsIgnoreCase(wild) && result2.equalsIgnoreCase(wild) && result3.equalsIgnoreCase(wild)) {
			prize = threeSame;
			prized = true;
		}
		if (prized == false && result1.equalsIgnoreCase(wild) && result2.equalsIgnoreCase(wild)) {
			prize = twoSame;
			prized = true;
		}
		if (prized == false && result1.equalsIgnoreCase(wild) && result3.equalsIgnoreCase(wild)) {
			prize = twoSame;
			prized = true;
		}
		if (prized == false && result2.equalsIgnoreCase(wild) && result3.equalsIgnoreCase(wild)) {
			prize = twoSame;
			prized = true;

		}
		return prize;
	}
}
