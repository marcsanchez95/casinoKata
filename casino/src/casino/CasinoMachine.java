package casino;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

import combinations.Bar;
import combinations.Bell;
import combinations.Cherry;
import combinations.Jack;
import combinations.King;
import combinations.Queen;
import combinations.Seven;
import combinations.Shell;
import combinations.Star;
import combinations.Wild;

public class CasinoMachine {

	public static void roll() {

		List<String> reelForms = new ArrayList<>();
		reelForms.addAll(List.of("Wild", "Star", "Bell", "Shell", "Seven", "Cherry", "Bar", "King", "Queen", "Jack"));

		List<String> reel = new ArrayList<>(reelForms);

		String result1 = reel.get((int) (Math.random() * 10));
		String result2 = reel.get((int) (Math.random() * 10));
		String result3 = reel.get((int) (Math.random() * 10));

		calculateResult(result1, result2, result3);


		System.out.println(result1 + result2 + result3);
	}

	public static void calculateResult(String result1, String result2, String result3) {
		int totalPrize = 0;
		if(!result1.equalsIgnoreCase(result2) && !result1.equalsIgnoreCase(result3) && !result2.equalsIgnoreCase(result3)) {
			System.out.println("Your prize is = 0 Euros ");
			return;
		}

		if (result1.equalsIgnoreCase(result2) || result1.equalsIgnoreCase(result3) || result2.equalsIgnoreCase(result3)
				|| result2.equalsIgnoreCase(result3) && result1.equalsIgnoreCase(result3)) {
			
			Bar bar = new Bar();
			Bell bell = new Bell();
			Cherry cherry = new Cherry();
			Jack jack = new Jack();
			King king = new King();
			Queen queen = new Queen();
			Seven seven = new Seven();
			Shell shell = new Shell();
			Star star = new Star();
			Wild wild = new Wild();

			totalPrize += bar.checkPrize(result1, result2, result3);
			totalPrize += bell.checkPrize(result1, result2, result3);
			totalPrize += cherry.checkPrize(result1, result2, result3);
			totalPrize += jack.checkPrize(result1, result2, result3);
			totalPrize += king.checkPrize(result1, result2, result3);
			totalPrize += queen.checkPrize(result1, result2, result3);
			totalPrize += seven.checkPrize(result1, result2, result3);
			totalPrize += shell.checkPrize(result1, result2, result3);
			totalPrize += star.checkPrize(result1, result2, result3);
			totalPrize += wild.checkPrize(result1, result2, result3);

			System.out.println("Your prize: " + totalPrize + " Euros");
		}

	}
}
