package wh.view;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import wh.view.NewCharacterDialogController;
import wh.model.Character;

public class EditCharacterDialogController extends NewCharacterDialogController {

	private Character character;
	private boolean okClicked = false;
	@FXML
	private Label raceLabel;
	@FXML
	private Label sexLabel;

	@FXML
	private void initialize() {

	}

	public void schowCharacter(Character character) {
		this.character = character;
		
		nameField.setText(character.getName());
		raceLabel.setText(character.getRace());
		currentOccupationField.setText(character.getCurrentOccupation());
		previousOccupationField.setText(character.getPreviousOccupation());
		ageField.setText(Integer.toString(character.getAge()));
		eyesColorField.setText(character.getEyesColor());
		hairColorField.setText(character.getHairColor());
		sexLabel.setText(character.getSex());
		weightField.setText(Integer.toString(character.getWeight()));
		heightField.setText(Integer.toString(character.getHeight()));
	}
	
	@FXML
	private void handleOk(){
		if(isInputValid()){
			setCharacter(character);
			okClicked = true;
			dialogStage.close();
		}
		
	}
	
	public void setCharacter(Character character){
		character.setName(nameField.getText());
		character.setCurrentOccupation(currentOccupationField.getText());
		character.setPreviousOccupation(previousOccupationField.getText());
		character.setAge(Integer.parseInt(ageField.getText()));
		character.setEyesColor(eyesColorField.getText());
		character.setHairColor(hairColorField.getText());
		character.setWeight(Integer.parseInt(weightField.getText()));
		character.setHeight(Integer.parseInt(heightField.getText()));
	}
	
	protected boolean isInputValid() {
		String errorMessage = "";

		if (nameField.getText() == null || nameField.getText().length() == 0) {
			errorMessage += "Podaj imiê postaci!\n";
		}
		if (currentOccupationField.getText() == null
				|| currentOccupationField.getText().length() == 0) {
			errorMessage += "Podaj obecn¹ profesjê!\n";
		}
		if (previousOccupationField.getText() == null
				|| previousOccupationField.getText().length() == 0) {
			errorMessage += "Podaj poprzedni¹ profesjê!\n";
		}
		if (eyesColorField.getText() == null
				|| eyesColorField.getText().length() == 0) {
			errorMessage += "Podaj kolor oczu!\n";
		}
		if (hairColorField.getText() == null
				|| hairColorField.getText().length() == 0) {
			errorMessage += "Podaj kolor w³osów!\n";
		}
		if (ageField.getText() == null || ageField.getText().length() == 0) {
			errorMessage += "Podaj wiek postaci!\n";
		} else {
			try {
				Integer.parseInt(ageField.getText());
			} catch (NumberFormatException e) {
				errorMessage += "Podaj wiek postaci(musi byæ liczb¹)!\n";
			}
		}
		if (weightField.getText() == null
				|| weightField.getText().length() == 0) {
			errorMessage += "Podaj wagê postaci!\n";
		} else {
			try {
				Integer.parseInt(weightField.getText());
			} catch (NumberFormatException e) {
				errorMessage += "Podaj wagê postaci(musi byæ liczb¹)!\n";
			}
		}
		if (heightField.getText() == null
				|| heightField.getText().length() == 0) {
			errorMessage += "Podaj wzrost postaci!\n";
		} else {
			try {
				Integer.parseInt(heightField.getText());
			} catch (NumberFormatException e) {
				errorMessage += "Podaj wzrost postaci(musi byæ liczb¹)!\n";
			}
		}
		if (errorMessage.length() == 0) {
			return true;
		} else {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Puste pole!");
			alert.setHeaderText("Uzupe³nij brakuj¹ce pole");
			alert.setContentText(errorMessage);
			alert.showAndWait();
			return false;
		}
	}
	
    public boolean isOkClicked() {
        return okClicked;
    }
}
