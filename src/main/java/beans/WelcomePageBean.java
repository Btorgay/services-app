package beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import entities.CarDefinition;

@ManagedBean(name = "welcomePageBean")
@ViewScoped
public class WelcomePageBean implements Serializable{

	private static final long serialVersionUID = 1L;	
	
	private CarDefinition carDefinition;
	private CarDefinition carDefinition2;
	private CarDefinition carDefinition3;
	private CarDefinition carDefinition4;
	private CarDefinition selectedCar;
	
	private List<CarDefinition> carsList;
	
	@PostConstruct
	public void init(){
		carsList = new ArrayList<CarDefinition>();
		carDefinition = new CarDefinition("Car1", "34 ABC 9999", "Gaziosmanpaþa");
		carDefinition2 = new CarDefinition("Car2", "34 TTT 1234", "Sarýyer");
		carDefinition3 = new CarDefinition("Car3", "34 XXX 5555", "Maslak");
		carDefinition4 = new CarDefinition("Car4", "34 KLM 1212", "Kocaeli/Merkez");
		selectedCar = new CarDefinition();
		
		carsList.add(carDefinition);
		carsList.add(carDefinition2);
		carsList.add(carDefinition3);
		carsList.add(carDefinition4);
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

	public CarDefinition getSelectedCar() {
		return selectedCar;
	}

	public void setSelectedCar(CarDefinition selectedCar) {
		this.selectedCar = selectedCar;
	}
	
	
	
}
