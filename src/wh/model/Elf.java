package wh.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Elf extends Character {
	
	private static String race = "Elf";
	
	@Override
	public void drawStats() {
		setInitialWw(20 + diceThrow());
		setInitialUs(30 + diceThrow());
		setInitialK(20 + diceThrow());
		setInitialOdp(20 + diceThrow());
		setInitialZr(30 + diceThrow());
		setInitialInt(20 + diceThrow());
		setInitialSw(20 + diceThrow());
		setInitialOgd(20 + diceThrow());
		setInitialA(1);
		drawZyw();
		setInitialS(drawS(getInitialK()));
		setInitialWt(drawWt(getInitialOdp()));
		setInitialSz(5);
		setInitialMag(0);
		setInitialPo(0);
	}

	@Override
	public void drawZyw() {
		int x = random.nextInt(10)+1;
		if(x == 1 || x == 2 || x == 3 ){
			setInitialZyw(9);
		}
		else if(x == 4 || x == 5 || x == 6){
			setInitialZyw(10);
		}
		else if(x == 7 || x == 8 || x == 9){
			setInitialZyw(11);
		}
		else if(x == 10){
			setInitialZyw(12);
		}
	}

	public String getRace() {
		return race;
	}

}
