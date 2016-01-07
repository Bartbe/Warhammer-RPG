package wh.view;

import wh.MainApp;
import wh.model.Character;
import wh.model.Dwarf;
import wh.model.Elf;
import wh.model.Halfling;
import wh.model.Human;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class NewCharacterDialogController {

	protected MainApp mainApp;
	protected ObservableList<String> raceData = FXCollections
			.observableArrayList("Cz³owiek", "Elf", "Krasnolud", "Nizio³ek");
	protected ObservableList<String> sexData = FXCollections.observableArrayList(
			"Kobieta", "Mê¿czyzna");
	private int raceId;

	@FXML
	protected ComboBox<String> raceComboBox;
	@FXML
	protected ComboBox<String> sexComboBox;

	@FXML
	protected TextField nameField;
	@FXML
	protected TextField currentOccupationField;
	@FXML
	protected TextField previousOccupationField;
	@FXML
	protected TextField ageField;
	@FXML
	protected TextField eyesColorField;
	@FXML
	protected TextField hairColorField;
	@FXML
	protected TextField weightField;
	@FXML
	protected TextField heightField;
	@FXML
	protected TextField expField;
	@FXML
	protected TextField movementField;
	@FXML
	protected TextField chargeField;
	@FXML
	protected TextField runField;

	protected Stage dialogStage;

	@FXML
	private void initialize() {
		raceComboBox.setItems(raceData);
		sexComboBox.setItems(sexData);
	}

	@FXML
	private void handleOk() {
		raceId = raceComboBox.getSelectionModel().getSelectedIndex();
		if (isInputValid()) {

			switch (raceId) {
			case 0:
				Character human = new Human();
				setCharacter(human);
				break;
			case 1:
				Character elf = new Elf();
				setCharacter(elf);
				break;
			case 2:
				Character dwarf = new Dwarf();
				setCharacter(dwarf);
				break;
			case 3:
				Character halfing = new Halfling();
				setCharacter(halfing);
				break;
			}

			dialogStage.close();
		}
	}
	
	@FXML
	private void handleCancel(){
		dialogStage.close();
	}

	public void setCharacter(Character character) {
		character.setName(nameField.getText());
		character.setCurrentOccupation(currentOccupationField.getText());
		character.setPreviousOccupation(previousOccupationField.getText());
		character.setAge(Integer.parseInt(ageField.getText()));
		character.setEyesColor(eyesColorField.getText());
		character.setHairColor(hairColorField.getText());
		character.setSex(sexComboBox.getSelectionModel().getSelectedItem());
		character.setWeight(Integer.parseInt(weightField.getText()));
		character.setHeight(Integer.parseInt(heightField.getText()));
		character.setCurrentExp(Integer.parseInt(expField.getText()));
		character.setMovemend(Integer.parseInt(movementField.getText()));
		character.setCharge(Integer.parseInt(chargeField.getText()));
		character.setRun(Integer.parseInt(runField.getText()));
		character.drawStats();

		mainApp.getCharacterData().add(character);
	}

	protected boolean isInputValid() {
		String errorMessage = "";

		if (nameField.getText() == null || nameField.getText().length() == 0) {
			errorMessage += "Podaj imiê postaci!\n";
		}
		if (raceComboBox.getSelectionModel().getSelectedIndex() < 0
				|| raceComboBox.getSelectionModel().getSelectedIndex() > 3) {
			errorMessage += "Wybierz rasê!\n";
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
		if (sexComboBox.getSelectionModel().getSelectedIndex() < 0
				|| sexComboBox.getSelectionModel().getSelectedIndex() > 1) {
			errorMessage += "Wybierz p³eæ!\n";
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
		if (expField.getText() == null || expField.getText().length() == 0) {
			errorMessage += "Podaj doœwiadczenie postaci!\n";
		} else {
			try {
				Integer.parseInt(expField.getText());
			} catch (NumberFormatException e) {
				errorMessage += "Podaj doœwiadczenie postaci(musi byæ liczb¹)!\n";
			}
		}
		if (movementField.getText() == null
				|| movementField.getText().length() == 0) {
			errorMessage += "Podaj ruch postaci!\n";
		} else {
			try {
				Integer.parseInt(movementField.getText());
			} catch (NumberFormatException e) {
				errorMessage += "Podaj ruch postaci(musi byæ liczb¹)!\n";
			}
		}
		if (chargeField.getText() == null
				|| chargeField.getText().length() == 0) {
			errorMessage += "Podaj szar¿ê postaci!\n";
		} else {
			try {
				Integer.parseInt(chargeField.getText());
			} catch (NumberFormatException e) {
				errorMessage += "Podaj szar¿ê postaci(musi byæ liczb¹)!\n";
			}
		}
		if (runField.getText() == null || runField.getText().length() == 0) {
			errorMessage += "Podaj bieg postaci!\n";
		} else {
			try {
				Integer.parseInt(runField.getText());
			} catch (NumberFormatException e) {
				errorMessage += "Podaj bieg postaci(musi byæ liczb¹)!\n";
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

	public void setDialogStage(Stage dialogStage) {
		this.dialogStage = dialogStage;
	}

	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
	}

}
