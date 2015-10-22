package beans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import entities.CarDefinition;

@ManagedBean(name = "welcomePageBean")
@ViewScoped
public class WelcomePageBean {

	private String welcomeMessage = "Welcome To Services Application";
	private CarDefinition carDefinition;
	private CarDefinition carDefinition2;
	private CarDefinition carDefinition3;
	private CarDefinition carDefinition4;
	private List<CarDefinition> carsList;
	
	@PostConstruct
	public void init(){
		carsList = new ArrayList<CarDefinition>();
		carDefinition = new CarDefinition("Car1", "34 ABC 9999", "Gaziosmanpa�a");
		carDefinition2 = new CarDefinition("Car2", "34 TTT 1234", "Sar�yer");
		carDefinition3 = new CarDefinition("Car3", "34 XXX 5555", "Maslak");
		carDefinition4 = new CarDefinition("Car4", "34 KLM 1212", "Kocaeli/Merkez");
		
		carsList.add(carDefinition);
		carsList.add(carDefinition2);
		carsList.add(carDefinition3);
		carsList.add(carDefinition4);
	}

	public String getWelcomeMessage() {
		return welcomeMessage;
	}

	public void setWelcomeMessage(String welcomeMessage) {
		this.welcomeMessage = welcomeMessage;
	}

	public CarDefinition getCarDefinition() {
		return carDefinition;
	}

	public void setCarDefinition(CarDefinition carDefinition) {
		this.carDefinition = carDefinition;
	}

	public List<CarDefinition> getCarsList() {
		return carsList;
	}

	public void setCarsList(List<CarDefinition> carsList) {
		this.carsList = carsList;
	}
	
	
	
}
