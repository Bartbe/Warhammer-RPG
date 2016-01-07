package wh.view;


import wh.MainApp;
import wh.model.Character;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.util.StringConverter;


public class StatsOverviewController {
	
	
	private MainApp mainApp;
	
	@FXML
	private ComboBox<Character> choiceCharacterBox;

	@FXML
	private Label nameLabel;

	@FXML
	private Label raceLabel;

	@FXML
	private Label currentOccupationLabel;

	@FXML
	private Label previousOccupationLabel;

	@FXML
	private Label ageLabel;

	@FXML
	private Label eyesColorLabel;

	@FXML
	private Label hairColorLabel;

	@FXML
	private Label sexLabel;

	@FXML
	private Label weightLabel;

	@FXML
	private Label heightLabel;
	
	@FXML
	private TextField currentExpField;
	
	@FXML
	private TextField allExpField;
	
	@FXML
	private TextField movementField;
	
	@FXML
	private TextField chargeField;
	
	@FXML
	private TextField runField;
	
	@FXML
	private TextField initialWwField;
	
	@FXML
	private TextField initialUsField;
	
	@FXML
	private TextField initialKField;
	
	@FXML
	private TextField initialOdpField;
	
	@FXML
	private TextField initialZrField;
	
	@FXML
	private TextField initialIntField;
	
	@FXML
	private TextField initialSwField;
	
	@FXML
	private TextField initialOgdField;
	
	@FXML
	private TextField initialAField;
	
	@FXML
	private TextField initialZywField;
	
	@FXML
	private TextField initialSField;
	
	@FXML
	private TextField initialWtField;
	
	@FXML
	private TextField initialSzField;
	
	@FXML
	private TextField initialMagField;
	
	@FXML
	private TextField initialPoField;
	
	@FXML
	private TextField initialPpField;
	
	@FXML
	private TextField developmentWwField;
	
	@FXML
	private TextField developmentUsField;
	
	@FXML
	private TextField developmentKField;
	
	@FXML
	private TextField developmentOdpField;
	
	@FXML
	private TextField developmentZrField;
	
	@FXML
	private TextField developmentIntField;
	
	@FXML
	private TextField developmentSwField;
	
	@FXML
	private TextField developmentOgdField;
	
	@FXML
	private TextField developmentAField;
	
	@FXML
	private TextField developmentZywField;
	
	@FXML
	private TextField developmentSField;
	
	@FXML
	private TextField developmentWtField;
	
	@FXML
	private TextField developmentSzField;
	
	@FXML
	private TextField developmentMagField;
	
	@FXML
	private TextField developmentPoField;
	
	@FXML
	private TextField developmentPpField;
	
	@FXML
	private TextField currentWwField;
	
	@FXML
	private TextField currentUsField;
	
	@FXML
	private TextField currentKField;
	
	@FXML
	private TextField currentOdpField;
	
	@FXML
	private TextField currentZrField;
	
	@FXML
	private TextField currentIntField;
	
	@FXML
	private TextField currentSwField;
	
	@FXML
	private TextField currentOgdField;
	
	@FXML
	private TextField currentAField;
	
	@FXML
	private TextField currentZywField;
	
	@FXML
	private TextField currentSField;
	
	@FXML
	private TextField currentWtField;
	
	@FXML
	private TextField currentSzField;
	
	@FXML
	private TextField currentMagField;
	
	@FXML
	private TextField currentPoField;
	
	@FXML
	private TextField currentPpField;
	
	
	public StatsOverviewController() {
	}
	
	@FXML
	private void initialize(){
		choiceCharacterBox.setCellFactory((comboBox) -> {
			return new ListCell<Character>() {
				@Override
				protected void updateItem(Character item, boolean empty) {
					super.updateItem(item, empty);
					if(item == null || empty){
						setText(null);
					}
					else {
						setText(item.getName());
					}
				}
			};
		});
		
		choiceCharacterBox.setConverter(new StringConverter<Character>() {
			@Override
			public String toString(Character character) {
				if(character == null) {
					return null;
				}
				else{
					return character.getName();
				}
			}
			
			@Override
			public Character fromString(String characterString) {
				return null;
			}
		});
		
		choiceCharacterBox.setOnAction((event) -> {
			Character selectedCharacter = choiceCharacterBox.getSelectionModel().getSelectedItem();
			showCharacter(selectedCharacter);
		});
		
		
	}
	
	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
		
		choiceCharacterBox.setItems(mainApp.getCharacterData());
	}

	private void showCharacter(Character character) {
		if (character != null) {
			nameLabel.setText(character.getName());
			ageLabel.setText(Integer.toString(character.getAge()));
			weightLabel.setText(Integer.toString(character.getWeight()));
			hairColorLabel.setText(character.getHairColor());
			raceLabel.setText(character.getRace());
			sexLabel.setText(character.getSex());
			currentOccupationLabel.setText(character.getCurrentOccupation());
			previousOccupationLabel.setText(character.getPreviousOccupation());
			eyesColorLabel.setText(character.getEyesColor());
			heightLabel.setText(Integer.toString(character.getHeight()));
			currentExpField.setText(Integer.toString(character.getCurrentExp()));
			allExpField.setText(Integer.toString(character.getAllExp()));
			movementField.setText(Integer.toString(character.getMovemend()));
			chargeField.setText(Integer.toString(character.getCharge()));
			runField.setText(Integer.toString(character.getRun()));
			initialWwField.setText(Integer.toString(character.getInitialWw()));
			initialUsField.setText(Integer.toString(character.getInitialUs()));
			initialKField.setText(Integer.toString(character.getInitialK()));
			initialOdpField.setText(Integer.toString(character.getInitialOdp()));
			initialZrField.setText(Integer.toString(character.getInitialZr()));
			initialIntField.setText(Integer.toString(character.getInitialInt()));
			initialSwField.setText(Integer.toString(character.getInitialSw()));
			initialOgdField.setText(Integer.toString(character.getInitialOgd()));
			initialAField.setText(Integer.toString(character.getInitialA()));
			initialZywField.setText(Integer.toString(character.getInitialZyw()));
			initialSField.setText(Integer.toString(character.getInitialS()));
			initialWtField.setText(Integer.toString(character.getInitialWt()));
			initialSzField.setText(Integer.toString(character.getInitialSz()));
			initialMagField.setText(Integer.toString(character.getInitialMag()));
			initialPoField.setText(Integer.toString(character.getInitialPo()));
			initialPpField.setText(Integer.toString(character.getInitialPp()));
			developmentWwField.setText(Integer.toString(character.getDevelopmentWw()));
			developmentUsField.setText(Integer.toString(character.getDevelopmentUs()));
			developmentKField.setText(Integer.toString(character.getDevelopmentK()));
			developmentOdpField.setText(Integer.toString(character.getDevelopmentOdp()));
			developmentZrField.setText(Integer.toString(character.getDevelopmentZr()));
			developmentIntField.setText(Integer.toString(character.getDevelopmentInt()));
			developmentSwField.setText(Integer.toString(character.getDevelopmentSw()));
			developmentOgdField.setText(Integer.toString(character.getDevelopmentOgd()));
			developmentAField.setText(Integer.toString(character.getDevelopmentA()));
			developmentZywField.setText(Integer.toString(character.getDevelopmentZyw()));
			developmentSField.setText(Integer.toString(character.getDevelopmentS()));
			developmentWtField.setText(Integer.toString(character.getDevelopmentWt()));
			developmentSzField.setText(Integer.toString(character.getDevelopmentSz()));
			developmentMagField.setText(Integer.toString(character.getDevelopmentMag()));
			developmentPoField.setText(Integer.toString(character.getDevelopmentPo()));
			developmentPpField.setText(Integer.toString(character.getDevelopmentPp()));
			currentWwField.setText(Integer.toString(character.getCurrentWw()));
			currentUsField.setText(Integer.toString(character.getCurrentUs()));
			currentKField.setText(Integer.toString(character.getCurrentK()));
			currentOdpField.setText(Integer.toString(character.getCurrentOdp()));
			currentZrField.setText(Integer.toString(character.getCurrentZr()));
			currentIntField.setText(Integer.toString(character.getCurrentInt()));
			currentSwField.setText(Integer.toString(character.getCurrentSw()));
			currentOgdField.setText(Integer.toString(character.getCurrentOgd()));
			currentAField.setText(Integer.toString(character.getCurrentA()));
			currentZywField.setText(Integer.toString(character.getCurrentZyw()));
			currentSField.setText(Integer.toString(character.getCurrentS()));
			currentWtField.setText(Integer.toString(character.getCurrentWt()));
			currentSzField.setText(Integer.toString(character.getCurrentSz()));
			currentMagField.setText(Integer.toString(character.getCurrentMag()));
			currentPoField.setText(Integer.toString(character.getCurrentPo()));
			currentPpField.setText(Integer.toString(character.getCurrentPp()));
		} else {
			nameLabel.setText("");
			ageLabel.setText("");
			weightLabel.setText("");
			hairColorLabel.setText("");
			raceLabel.setText("");
			sexLabel.setText("");
			currentOccupationLabel.setText("");
			previousOccupationLabel.setText("");
			eyesColorLabel.setText("");
			heightLabel.setText("");
			currentExpField.setText("");
			allExpField.setText("");
			movementField.setText("");
			chargeField.setText("");
			runField.setText("");
			initialWwField.setText("");
			initialUsField.setText("");
			initialKField.setText("");
			initialOdpField.setText("");
			initialZrField.setText("");
			initialIntField.setText("");
			initialSwField.setText("");
			initialOgdField.setText("");
			initialAField.setText("");
			initialZywField.setText("");
			initialSField.setText("");
			initialWtField.setText("");
			initialSzField.setText("");
			initialMagField.setText("");
			initialPoField.setText("");
			initialPpField.setText("");
			developmentWwField.setText("");
			developmentUsField.setText("");
			developmentKField.setText("");
			developmentOdpField.setText("");
			developmentZrField.setText("");
			developmentIntField.setText("");
			developmentSwField.setText("");
			developmentOgdField.setText("");
			developmentAField.setText("");
			developmentZywField.setText("");
			developmentSField.setText("");
			developmentWtField.setText("");
			developmentSzField.setText("");
			developmentMagField.setText("");
			developmentPoField.setText("");
			developmentPpField.setText("");
			currentWwField.setText("");
			currentUsField.setText("");
			currentKField.setText("");
			currentOdpField.setText("");
			currentZrField.setText("");
			currentIntField.setText("");
			currentSwField.setText("");
			currentOgdField.setText("");
			currentAField.setText("");
			currentZywField.setText("");
			currentSField.setText("");
			currentWtField.setText("");
			currentSzField.setText("");
			currentMagField.setText("");
			currentPoField.setText("");
			currentPpField.setText("");
		}
	}
	
	private void saveCharacter(Character character){
		character.setCurrentExp(Integer.parseInt(currentExpField.getText()));
		character.setAllExp(Integer.parseInt(allExpField.getText()));
		character.setMovemend(Integer.parseInt(movementField.getText()));
		character.setCharge(Integer.parseInt(chargeField.getText()));
		character.setRun(Integer.parseInt(runField.getText()));
		character.setInitialWw(Integer.parseInt(initialWwField.getText()));
		character.setInitialUs(Integer.parseInt(initialUsField.getText()));
		character.setInitialK(Integer.parseInt(initialKField.getText()));
		character.setInitialOdp(Integer.parseInt(initialOdpField.getText()));
		character.setInitialZr(Integer.parseInt(initialZrField.getText()));
		character.setInitialInt(Integer.parseInt(initialIntField.getText()));
		character.setInitialSw(Integer.parseInt(initialSwField.getText()));
		character.setInitialOgd(Integer.parseInt(initialOgdField.getText()));
		character.setInitialA(Integer.parseInt(initialAField.getText()));
		character.setInitialZyw(Integer.parseInt(initialZywField.getText()));
		character.setInitialS(Integer.parseInt(initialSField.getText()));
		character.setInitialWt(Integer.parseInt(initialWtField.getText()));
		character.setInitialWw(Integer.parseInt(initialWwField.getText()));
		character.setInitialSz(Integer.parseInt(initialSzField.getText()));
		character.setInitialMag(Integer.parseInt(initialMagField.getText()));
		character.setInitialPo(Integer.parseInt(initialPoField.getText()));
		character.setInitialPp(Integer.parseInt(initialPpField.getText()));
		character.setDevelopmentWw(Integer.parseInt(developmentWwField.getText()));
		character.setDevelopmentUs(Integer.parseInt(developmentUsField.getText()));
		character.setDevelopmentK(Integer.parseInt(developmentKField.getText()));
		character.setDevelopmentOdp(Integer.parseInt(developmentOdpField.getText()));
		character.setDevelopmentZr(Integer.parseInt(developmentZrField.getText()));
		character.setDevelopmentInt(Integer.parseInt(developmentIntField.getText()));
		character.setDevelopmentSw(Integer.parseInt(developmentSwField.getText()));
		character.setDevelopmentOgd(Integer.parseInt(developmentOgdField.getText()));
		character.setDevelopmentA(Integer.parseInt(developmentAField.getText()));
		character.setDevelopmentZyw(Integer.parseInt(developmentZywField.getText()));
		character.setDevelopmentS(Integer.parseInt(developmentSField.getText()));
		character.setDevelopmentWt(Integer.parseInt(developmentWtField.getText()));
		character.setDevelopmentWw(Integer.parseInt(developmentWwField.getText()));
		character.setDevelopmentSz(Integer.parseInt(developmentSzField.getText()));
		character.setDevelopmentMag(Integer.parseInt(developmentMagField.getText()));
		character.setDevelopmentPo(Integer.parseInt(developmentPoField.getText()));
		character.setDevelopmentPp(Integer.parseInt(developmentPpField.getText()));
		character.setCurrentWw(Integer.parseInt(currentWwField.getText()));
		character.setCurrentUs(Integer.parseInt(currentUsField.getText()));
		character.setCurrentK(Integer.parseInt(currentKField.getText()));
		character.setCurrentOdp(Integer.parseInt(currentOdpField.getText()));
		character.setCurrentZr(Integer.parseInt(currentZrField.getText()));
		character.setCurrentInt(Integer.parseInt(currentIntField.getText()));
		character.setCurrentSw(Integer.parseInt(currentSwField.getText()));
		character.setCurrentOgd(Integer.parseInt(currentOgdField.getText()));
		character.setCurrentA(Integer.parseInt(currentAField.getText()));
		character.setCurrentZyw(Integer.parseInt(currentZywField.getText()));
		character.setCurrentS(Integer.parseInt(currentSField.getText()));
		character.setCurrentWt(Integer.parseInt(currentWtField.getText()));
		character.setCurrentWw(Integer.parseInt(currentWwField.getText()));
		character.setCurrentSz(Integer.parseInt(currentSzField.getText()));
		character.setCurrentMag(Integer.parseInt(currentMagField.getText()));
		character.setCurrentPo(Integer.parseInt(currentPoField.getText()));
		character.setCurrentPp(Integer.parseInt(currentPpField.getText()));
	}
	
	
	@FXML
	private void handleNewCharacter(){
		mainApp.showNewCharacterDialog();
	}
	
	@FXML
	private void handleEditCharacter(){
		Character selectedCharacter = choiceCharacterBox.getSelectionModel().getSelectedItem();
		if(selectedCharacter != null){
			boolean okClicked = mainApp.showEditCharacterDialog(selectedCharacter);
			if(okClicked){
				showCharacter(selectedCharacter);
			}
		}else{
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Nie wybrano postaci!");
			alert.setHeaderText("Wybierz postaæ!");
			alert.showAndWait();
		}
	}
	
	@FXML
	private void handleSaveCharacter(){
		Character selectedCharacter = choiceCharacterBox.getSelectionModel().getSelectedItem();
		if(selectedCharacter != null){
			saveCharacter(selectedCharacter);
			showCharacter(selectedCharacter);
		}else{
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Nie wybrano postaci!");
			alert.setHeaderText("Wybierz postaæ!");
			alert.showAndWait();
		}
	}
	
	@FXML
	private void handleDeleteCharacter(){
		int selectedIndex = choiceCharacterBox.getSelectionModel().getSelectedIndex();
		if(selectedIndex >= 0){
			choiceCharacterBox.getItems().remove(selectedIndex);
		}else{
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Nie wybrano postaci!");
			alert.setHeaderText("Wybierz postaæ!");
			alert.showAndWait();
		}
	}

}
