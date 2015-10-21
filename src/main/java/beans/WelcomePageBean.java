package beans;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import entities.CarDefinition;

@ManagedBean(name = "welcomePageBean")
@ViewScoped
public class WelcomePageBean {

	private String welcomeMessage = "Welcome To Services Application";
	private CarDefinition carDefinition;
	
	@PostConstruct
	public void init(){
		carDefinition = new CarDefinition();
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
	
}
