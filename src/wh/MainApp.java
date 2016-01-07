package wh;

import java.io.File;
import java.io.IOException;
import java.util.prefs.Preferences;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import wh.model.Character;
import wh.model.CharacterListWrapper;
import wh.model.Dwarf;
import wh.model.Elf;
import wh.model.Halfling;
import wh.model.Human;
import wh.view.EditCharacterDialogController;
import wh.view.NewCharacterDialogController;
import wh.view.StatsOverviewController;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MainApp extends Application {
	
	private Stage primaryStage;
	private BorderPane rootLayout;
	
	
	
	private ObservableList<Character> characterData = FXCollections.observableArrayList();
	
	File characterFile = new File("src/wh/data.xml");
	
	
	public MainApp() {
		
	/*	characterData.add(new Elf());
		characterData.get(0).setName("Ragros");
		characterData.get(0).setAge(22);
		characterData.get(0).setWeight(78);
		characterData.get(0).setHairColor("Czarne");
		
		characterData.add(new Human());
		characterData.get(1).setName("Albert");*/
		
	}
	
	public ObservableList<Character> getCharacterData(){
		return characterData;
	}

	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage; 
		this.primaryStage.setTitle("Warhammer RPG - karta postaci");
		
		
		initRootLayout();
		
		showStatsOverview();
		
	}
	
	
	public void initRootLayout(){
		try{
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/RootLayout.fxml"));
			rootLayout = (BorderPane) loader.load();
			
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
			
		}catch(IOException e){
			e.printStackTrace();
		}
		loadFile();
	}
	
	public void showStatsOverview(){
		try{
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/StatsOverview.fxml"));
			AnchorPane statsOverview = (AnchorPane) loader.load();
			
			rootLayout.setCenter(statsOverview);
			
			StatsOverviewController controller = loader.getController();
			controller.setMainApp(this);
			//controller.showCharacter(getCharacterData().get(0));
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public void showNewCharacterDialog(){
		try{
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/NewCharacterDialog.fxml"));
			AnchorPane page = (AnchorPane) loader.load();
			
			Stage dialogStage = new Stage(); 
			dialogStage.setTitle("Nowa postaæ");
			dialogStage.initModality(Modality.WINDOW_MODAL);
			dialogStage.initOwner(primaryStage);
			Scene scene = new Scene(page);
			dialogStage.setScene(scene);
			
			NewCharacterDialogController controller = loader.getController();
			controller.setMainApp(this);
			controller.setDialogStage(dialogStage);
			
			dialogStage.showAndWait();
			savePersonDataToFile(characterFile);
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public boolean showEditCharacterDialog(Character character){
		try{
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/EditCharacterDialog.fxml"));
			AnchorPane page = (AnchorPane) loader.load();
			
			Stage dialogStage = new Stage(); 
			dialogStage.setTitle("Edycja postaci");
			dialogStage.initModality(Modality.WINDOW_MODAL);
			dialogStage.initOwner(primaryStage);
			Scene scene = new Scene(page);
			dialogStage.setScene(scene);
			
			EditCharacterDialogController controller = loader.getController();
			controller.setMainApp(this);
			controller.setDialogStage(dialogStage);
			controller.schowCharacter(character);
			
			dialogStage.showAndWait();
			return controller.isOkClicked();
		}catch(IOException e){
			e.printStackTrace();
			return false;
		}
	}
	
	public File getCharcterFilePatch(){
		Preferences prefs = Preferences.userNodeForPackage(MainApp.class);
		String filePatch = prefs.get("filePath", null);
		if(filePatch != null){
			return new File(filePatch);
		} else{
			return null;
		}
	}
	
	public void setCharacterFilePatch(){
		Preferences prefs = Preferences.userNodeForPackage(MainApp.class);
		if(prefs.isUserNode()){
			prefs.put("filePath", "data.xml");
		}else {
			prefs.remove("filePath");
		}
	}
	
	public void loadCharacterDataFromFile(File file){
		try {
			JAXBContext context = JAXBContext
					.newInstance(CharacterListWrapper.class, Human.class, Dwarf.class, Elf.class, Halfling.class);
			Unmarshaller um = context.createUnmarshaller();
			
			CharacterListWrapper wrapper = (CharacterListWrapper) um.unmarshal(file);
			
			characterData.clear();
			characterData.addAll(wrapper.getCharacters());
			
		} 
	catch (Exception e) {
			//Alert alert = new Alert(AlertType.ERROR);
			//alert.setTitle("B³¹d");
			//alert.setHeaderText("Nie mo¿na za³adowaæ pliku");
			//alert.setContentText("Nie mo¿na za³adowaæ pliku ze œcie¿ki:\n" + file.getPath());
		//	alert.showAndWait();
		e.printStackTrace();
		}
	}
	
	public void savePersonDataToFile(File file){
		try{
			JAXBContext context = JAXBContext
					.newInstance(CharacterListWrapper.class, Human.class, Dwarf.class, Elf.class, Halfling.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			
			CharacterListWrapper wrapper = new CharacterListWrapper();
			wrapper.setCharacters(characterData);
			
			m.marshal(wrapper, file);
			
		} catch (Exception e) {
			/*Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("B³¹d");
			alert.setHeaderText("Nie mo¿na zapisaæ pliku");
			alert.setContentText("Nie mo¿na zapisaæ pliku do œcie¿ki:\n" + file.getPath());
			alert.showAndWait();*/
			e.printStackTrace();
		}
	}
	
	public void loadFile(){
		
		if(characterFile.isFile()){
			loadCharacterDataFromFile(characterFile);
		}
	
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
