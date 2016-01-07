package wh.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Dwarf extends Character{
	
	private static String race = "Krasnolud";

	@Override
	public void drawStats() {
		setInitialWw(30+diceThrow());
		setInitialUs(20+diceThrow());
		setInitialK(20+diceThrow());
		setInitialOdp(30+diceThrow());
		setInitialZr(10+diceThrow());
		setInitialInt(20+diceThrow());
		setInitialSw(20+diceThrow());
		setInitialOgd(10+diceThrow());
		setInitialA(1);
		drawZyw();
		setInitialS(drawS(getInitialK()));
		setInitialWt(drawWt(getInitialOdp()));
		setInitialSz(3);
		setInitialMag(0);
		setInitialPo(0);
	}

	public void drawZyw(){
		int x = random.nextInt(10)+1;
		if(x == 1 || x == 2 || x == 3 ){
			setInitialZyw(11);
		}
		else if(x == 4 || x == 5 || x == 6){
			setInitialZyw(12);
		}
		else if(x == 7 || x == 8 || x == 9){
			setInitialZyw(13);
		}
		else if(x == 10){
			setInitialZyw(14);
		}
	}

	public String getRace(){
		return race;
	}
}
