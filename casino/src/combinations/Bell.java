package combinations;

public class Bell{

	private final int twoSame = 8;
	private final int threeSame = 80;
	private final int twoSamePlusWild = 16;
	private final String bell = "Bell";
	private final String wild = "Wild";

	public int checkPrize(String result1, String result2, String result3) {

		int prize = 0;
		boolean prized = false;
		if (result1.equalsIgnoreCase(bell) && result2.equalsIgnoreCase(bell) && result3.equalsIgnoreCase(bell)) {
			prize = threeSame;
			prized = true;
		}
		if (prized == false && result1.equalsIgnoreCase(bell) && result2.equalsIgnoreCase(bell)) {
			prize = twoSame;
			prized = true;
		}
		if (prized == false && result1.equalsIgnoreCase(bell) && result3.equalsIgnoreCase(bell)) {
			prize = twoSame;
			prized = true;
		}
		if (prized == false && result2.equalsIgnoreCase(bell) && result3.equalsIgnoreCase(bell)) {
			prize = twoSame;
			prized = true;
		}
		if (prized == false && result1.equalsIgnoreCase(wild) && result2.equalsIgnoreCase(bell)
				&& result3.equalsIgnoreCase(bell)) {
			prize = twoSamePlusWild;
			prized = true;
		}
		if (prized == false && result1.equalsIgnoreCase(bell) && result2.equalsIgnoreCase(wild)
				&& result3.equalsIgnoreCase(bell)) {
			prize = twoSamePlusWild;
			prized = true;
		}
		if (prized == false && result1.equalsIgnoreCase(bell) && result2.equalsIgnoreCase(bell)
				&& result3.equalsIgnoreCase(wild)) {
			prize = twoSamePlusWild;
			prized = true;
		}
		return prize;

	}
}
