package wh.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

@XmlRootElement
abstract public class Character {
	
	private StringProperty name, currentOccupation, previousOccupation;
	private StringProperty eyesColor, hairColor, sex;
	private IntegerProperty weight, height, age;
	
	private static String race; 
	private List<Character> characters = new ArrayList<Character>();
	
	private IntegerProperty currentExp, allExp, movemend, charge, run;
	private IntegerProperty initialWw, initialUs, initialK, initialOdp, initialZr, initialInt, initialSw;
	private IntegerProperty initialOgd, initialA, initialZyw, initialS, initialWt, initialSz, initialMag, initialPo, initialPp;
	private IntegerProperty developmentWw, developmentUs, developmentK, developmentOdp, developmentZr, developmentInt;
	private IntegerProperty developmentOgd, developmentA, developmentZyw, developmentS, developmentWt; 
	private IntegerProperty developmentSz, developmentMag, developmentPo, developmentPp, developmentSw;
	private IntegerProperty currentWw, currentUs, currentK, currentOdp, currentZr, currentInt, currentSw;
	private IntegerProperty currentOgd, currentA, currentZyw, currentS, currentWt, currentSz, currentMag, currentPo, currentPp;
	
	Random random = new Random();
	
	public Character() {
		this.name = new SimpleStringProperty("");
		this.currentOccupation = new SimpleStringProperty("");
		this.previousOccupation = new SimpleStringProperty("");
		this.eyesColor = new SimpleStringProperty("");
		this.hairColor = new SimpleStringProperty("");
		this.sex = new SimpleStringProperty("");
		this.age = new SimpleIntegerProperty(0);
		this.height = new SimpleIntegerProperty(0);
		this.weight = new SimpleIntegerProperty(0);
		this.currentPp = new SimpleIntegerProperty(0);
		this.currentPo = new SimpleIntegerProperty(0);
		this.currentMag = new SimpleIntegerProperty(0);
		this.currentSz = new SimpleIntegerProperty(0);
		this.currentWt = new SimpleIntegerProperty(0);
		this.currentS = new SimpleIntegerProperty(0);
		this.currentZyw = new SimpleIntegerProperty(0);
		this.currentA = new SimpleIntegerProperty(0);
		this.currentOgd = new SimpleIntegerProperty(0);
		this.currentSw = new SimpleIntegerProperty(0);
		this.currentInt = new SimpleIntegerProperty(0);
		this.currentZr = new SimpleIntegerProperty(0);
		this.currentOdp = new SimpleIntegerProperty(0);
		this.currentK = new SimpleIntegerProperty(0);
		this.currentUs = new SimpleIntegerProperty(0);
		this.currentWw = new SimpleIntegerProperty(0);
		this.developmentPp = new SimpleIntegerProperty(0);
		this.developmentPo = new SimpleIntegerProperty(0);
		this.developmentMag = new SimpleIntegerProperty(0);
		this.developmentSz = new SimpleIntegerProperty(0);
		this.developmentWt = new SimpleIntegerProperty(0);
		this.developmentS = new SimpleIntegerProperty(0);
		this.developmentZyw = new SimpleIntegerProperty(0);
		this.developmentA = new SimpleIntegerProperty(0);
		this.developmentOgd = new SimpleIntegerProperty(0);
		this.developmentSw = new SimpleIntegerProperty(0);
		this.developmentInt = new SimpleIntegerProperty(0);
		this.developmentZr = new SimpleIntegerProperty(0);
		this.developmentOdp = new SimpleIntegerProperty(0);
		this.developmentK = new SimpleIntegerProperty(0);
		this.developmentUs = new SimpleIntegerProperty(0);
		this.developmentWw = new SimpleIntegerProperty(0);
		this.initialPp = new SimpleIntegerProperty(0);
		this.initialPo = new SimpleIntegerProperty(0);
		this.initialMag = new SimpleIntegerProperty(0);
		this.initialSz = new SimpleIntegerProperty(0);
		this.initialWt = new SimpleIntegerProperty(0);
		this.initialS = new SimpleIntegerProperty(0);
		this.initialZyw = new SimpleIntegerProperty(0);
		this.initialA = new SimpleIntegerProperty(0);
		this.initialOgd = new SimpleIntegerProperty(0);
		this.initialSw = new SimpleIntegerProperty(0);
		this.initialInt = new SimpleIntegerProperty(0);
		this.initialZr = new SimpleIntegerProperty(0);
		this.initialOdp = new SimpleIntegerProperty(0);
		this.initialK = new SimpleIntegerProperty(0);
		this.initialUs = new SimpleIntegerProperty(0);
		this.initialWw = new SimpleIntegerProperty(0);
		this.run = new SimpleIntegerProperty(0);
		this.charge = new SimpleIntegerProperty(0);
		this.movemend = new SimpleIntegerProperty(0);
		this.allExp = new SimpleIntegerProperty(0);
		this.currentExp = new SimpleIntegerProperty(0);
	}
	
	abstract public void drawStats();
	abstract public void drawZyw();
	
	final public int diceThrow(){
		int sum = 0;
		sum = random.nextInt(10)+1;
		sum += random.nextInt(10)+1;
		return sum;
	}
	
	final public int drawS(int x){
		return x /= 10;
	}
	
	final public int drawWt(int x){
		return x/= 10;
	}

	public String getName() {
		return name.get();
	}

	public void setName(String name) {
		this.name.set(name);
	}
	
	public StringProperty nameProperty(){
		return name;
	}

	public String getCurrentOccupation() {
		return currentOccupation.get();
	}

	public void setCurrentOccupation(String currentOccupation) {
		this.currentOccupation.set(currentOccupation);;
	}

	public String getPreviousOccupation() {
		return previousOccupation.get();
	}

	public void setPreviousOccupation(String previousOccupation) {
		this.previousOccupation.set(previousOccupation);
	}

	public String getEyesColor() {
		return eyesColor.get();
	}

	public void setEyesColor(String eyesColor) {
		this.eyesColor.set(eyesColor);
	}

	public String getHairColor() {
		return hairColor.get();
	}

	public void setHairColor(String hairColor) {
		this.hairColor.set(hairColor);
	}

	public String getSex() {
		return sex.get();
	}

	public void setSex(String sex) {
		this.sex.set(sex);
	}

	public int getWeight() {
		return weight.get();
	}

	public void setWeight(int weight) {
		this.weight.set(weight);
	}

	public int getHeight() {
		return height.get();
	}

	public void setHeight(int height) {
		this.height.set(height);
	}

	public int getAge() {
		return age.get();
	}

	public void setAge(int age) {
		this.age.set(age);
	}

	public String getRace() {
		return race;
	}


	public int getCurrentExp() {
		return currentExp.get();
	}

	public void setCurrentExp(int currentExp) {
		this.currentExp.set(currentExp);
	}

	public int getAllExp() {
		return allExp.get();
	}

	public void setAllExp(int allExp) {
		this.allExp.set(allExp);
	}

	public int getMovemend() {
		return movemend.get();
	}

	public void setMovemend(int movemend) {
		this.movemend.set(movemend);
	}

	public int getCharge() {
		return charge.get();
	}

	public void setCharge(int charge) {
		this.charge.set(charge);
	}

	public int getRun() {
		return run.get();
	}

	public void setRun(int run) {
		this.run.set(run);
	}

	public int getInitialWw() {
		return initialWw.get();
	}

	public void setInitialWw(int initialWw) {
		this.initialWw.set(initialWw);
	}

	public int getInitialUs() {
		return initialUs.get();
	}

	public void setInitialUs(int initialUs) {
		this.initialUs.set(initialUs);
	}

	public int getInitialK() {
		return initialK.get();
	}

	public void setInitialK(int initialK) {
		this.initialK.set(initialK);
	}

	public int getInitialOdp() {
		return initialOdp.get();
	}

	public void setInitialOdp(int initialOdp) {
		this.initialOdp.set(initialOdp);
	}

	public int getInitialZr() {
		return initialZr.get();
	}

	public void setInitialZr(int initialZr) {
		this.initialZr.set(initialZr);
	}

	public int getInitialInt() {
		return initialInt.get();
	}

	public void setInitialInt(int initialInt) {
		this.initialInt.set(initialInt);
	}

	public int getInitialSw() {
		return initialSw.get();
	}

	public void setInitialSw(int initialSw) {
		this.initialSw.set(initialSw);
	}

	public int getInitialOgd() {
		return initialOgd.get();
	}

	public void setInitialOgd(int initialOgd) {
		this.initialOgd.set(initialOgd);
	}

	public int getInitialA() {
		return initialA.get();
	}

	public void setInitialA(int initialA) {
		this.initialA.set(initialA);
	}

	public int getInitialZyw() {
		return initialZyw.get();
	}

	public void setInitialZyw(int initialZyw) {
		this.initialZyw.set(initialZyw);
	}

	public int getInitialS() {
		return initialS.get();
	}

	public void setInitialS(int initialS) {
		this.initialS.set(initialS);
	}

	public int getInitialWt() {
		return initialWt.get();
	}

	public void setInitialWt(int initialWt) {
		this.initialWt.set(initialWt);
	}

	public int getInitialSz() {
		return initialSz.get();
	}

	public void setInitialSz(int initialSz) {
		this.initialSz.set(initialSz);
	}

	public int getInitialMag() {
		return initialMag.get();
	}

	public void setInitialMag(int initialMag) {
		this.initialMag.set(initialMag);
	}

	public int getInitialPo() {
		return initialPo.get();
	}

	public void setInitialPo(int initialPo) {
		this.initialPo.set(initialPo);
	}

	public int getInitialPp() {
		return initialPp.get();
	}

	public void setInitialPp(int initialPp) {
		this.initialPp.set(initialPp);
	}

	public int getDevelopmentWw() {
		return developmentWw.get();
	}

	public void setDevelopmentWw(int developmentWw) {
		this.developmentWw.set(developmentWw);
	}

	public int getDevelopmentUs() {
		return developmentUs.get();
	}

	public void setDevelopmentUs(int developmentUs) {
		this.developmentUs.set(developmentUs);
	}

	public int getDevelopmentK() {
		return developmentK.get();
	}

	public void setDevelopmentK(int developmentK) {
		this.developmentK.set(developmentK);
	}

	public int getDevelopmentOdp() {
		return developmentOdp.get();
	}

	public void setDevelopmentOdp(int developmentOdp) {
		this.developmentOdp.set(developmentOdp);
	}

	public int getDevelopmentZr() {
		return developmentZr.get();
	}

	public void setDevelopmentZr(int developmentZr) {
		this.developmentZr.set(developmentZr);
	}

	public int getDevelopmentInt() {
		return developmentInt.get();
	}

	public void setDevelopmentInt(int developmentInt) {
		this.developmentInt.set(developmentInt);
	}

	public int getDevelopmentOgd() {
		return developmentOgd.get();
	}

	public void setDevelopmentOgd(int developmentOgd) {
		this.developmentOgd.set(developmentOgd);
	}

	public int getDevelopmentA() {
		return developmentA.get();
	}

	public void setDevelopmentA(int developmentA) {
		this.developmentA.set(developmentA);
	}

	public int getDevelopmentZyw() {
		return developmentZyw.get();
	}

	public void setDevelopmentZyw(int developmentZyw) {
		this.developmentZyw.set(developmentZyw);
	}

	public int getDevelopmentS() {
		return developmentS.get();
	}

	public void setDevelopmentS(int developmentS) {
		this.developmentS.set(developmentS);
	}

	public int getDevelopmentWt() {
		return developmentWt.get();
	}

	public void setDevelopmentWt(int developmentWt) {
		this.developmentWt.set(developmentWt);
	}

	public int getDevelopmentSz() {
		return developmentSz.get();
	}

	public void setDevelopmentSz(int developmentSz) {
		this.developmentSz.set(developmentSz);
	}

	public int getDevelopmentMag() {
		return developmentMag.get();
	}

	public void setDevelopmentMag(int developmentMag) {
		this.developmentMag.set(developmentMag);
	}

	public int getDevelopmentPo() {
		return developmentPo.get();
	}

	public void setDevelopmentPo(int developmentPo) {
		this.developmentPo.set(developmentPo);
	}

	public int getDevelopmentPp() {
		return developmentPp.get();
	}

	public void setDevelopmentPp(int developmentPp) {
		this.developmentPp.set(developmentPp);
	}

	public int getDevelopmentSw() {
		return developmentSw.get();
	}

	public void setDevelopmentSw(int developmentSw) {
		this.developmentSw.set(developmentSw);
	}

	public int getCurrentWw() {
		return currentWw.get();
	}

	public void setCurrentWw(int currentWw) {
		this.currentWw.set(currentWw);
	}

	public int getCurrentUs() {
		return currentUs.get();
	}

	public void setCurrentUs(int currentUs) {
		this.currentUs.set(currentUs);
	}

	public int getCurrentK() {
		return currentK.get();
	}

	public void setCurrentK(int currentK) {
		this.currentK.set(currentK);
	}

	public int getCurrentOdp() {
		return currentOdp.get();
	}

	public void setCurrentOdp(int currentOdp) {
		this.currentOdp.set(currentOdp);
	}

	public int getCurrentZr() {
		return currentZr.get();
	}

	public void setCurrentZr(int currentZr) {
		this.currentZr.set(currentZr);
	}

	public int getCurrentInt() {
		return currentInt.get();
	}

	public void setCurrentInt(int currentInt) {
		this.currentInt.set(currentInt);
	}

	public int getCurrentSw() {
		return currentSw.get();
	}

	public void setCurrentSw(int currentSw) {
		this.currentSw.set(currentSw);
	}

	public int getCurrentOgd() {
		return currentOgd.get();
	}

	public void setCurrentOgd(int currentOgd) {
		this.currentOgd.set(currentOgd);
	}

	public int getCurrentA() {
		return currentA.get();
	}

	public void setCurrentA(int currentA) {
		this.currentA.set(currentA);
	}

	public int getCurrentZyw() {
		return currentZyw.get();
	}

	public void setCurrentZyw(int currentZyw) {
		this.currentZyw.set(currentZyw);
	}

	public int getCurrentS() {
		return currentS.get();
	}

	public void setCurrentS(int currentS) {
		this.currentS.set(currentS);
	}

	public int getCurrentWt() {
		return currentWt.get();
	}

	public void setCurrentWt(int currentWt) {
		this.currentWt.set(currentWt);
	}

	public int getCurrentSz() {
		return currentSz.get();
	}

	public void setCurrentSz(int currentSz) {
		this.currentSz.set(currentSz);
	}

	public int getCurrentMag() {
		return currentMag.get();
	}

	public void setCurrentMag(int currentMag) {
		this.currentMag.set(currentMag);
	}

	public int getCurrentPo() {
		return currentPo.get();
	}

	public void setCurrentPo(int currentPo) {
		this.currentPo.set(currentPo);
	}

	public int getCurrentPp() {
		return currentPp.get();
	}

	public void setCurrentPp(int currentPp) {
		this.currentPp.set(currentPp);
	}
	
	@XmlElementWrapper(name = "characters")
	public List<Character> getCharacters() {
		return characters; 
	}
	
	public void setCharacters(List<Character> characters){
		this.characters = characters;
	}
	
	
}
