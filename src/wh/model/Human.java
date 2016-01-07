package wh.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Human extends Character {
	
	public Human(){
	}
	
	private static String race = "Cz³owiek";

	@Override
	public void drawStats() {
		setInitialWw(20 + diceThrow());
		setInitialUs(20 + diceThrow());
		setInitialK(20 + diceThrow());
		setInitialOdp(20 + diceThrow());
		setInitialZr(20 + diceThrow());
		setInitialInt(20 + diceThrow());
		setInitialSw(20 + diceThrow());
		setInitialOgd(20 + diceThrow());
		setInitialA(1);
		drawZyw();
		setInitialS(drawS(getInitialK()));
		setInitialWt(drawWt(getInitialOdp()));
		setInitialSz(4);
		setInitialMag(0);
		setInitialPo(0);
	}

	@Override
	public void drawZyw() {
		int x = random.nextInt(10)+1;
		if(x == 1 || x == 2 || x == 3 ){
			setInitialZyw(10);
		}
		else if(x == 4 || x == 5 || x == 6){
			setInitialZyw(11);
		}
		else if(x == 7 || x == 8 || x == 9){
			setInitialZyw(12);
		}
		else if(x == 10){
			setInitialZyw(13);
		}
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		Human.race = race;
	}

}
