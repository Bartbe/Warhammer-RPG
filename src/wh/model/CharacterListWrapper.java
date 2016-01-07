package wh.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "characters")
public class CharacterListWrapper {

	private List<Character> characters = new ArrayList<Character>();
	
	@XmlElementRef
	public List<Character> getCharacters(){
		return characters; 
	}
	
	public void setCharacters(List<Character> characters){
		this.characters = characters;
	}
}
