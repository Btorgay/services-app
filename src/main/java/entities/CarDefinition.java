/**
 * This class is for identifying General Car Information which the passenger will be attending to it.
 */
package entities;

import java.io.Serializable;
import java.security.Timestamp;
import java.util.Date;

/**
 * @author burak.torgay
 * 
 */
public class CarDefinition implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	
	/** name to be seen on the UI */
	private String carNickname;
	/** the unique identifier of the car */
	private String carPlate;
	/** where the car goes */
	private String carDestination;
	/** detail destination description */
	private String carDestinationDetail;
	/** where the car starts to move to its destination */
	private String carStation;
	/** detail station description */
	private String carStationDetail;

	/** The number of seats that the car has */
	private int totalPassangerSeats;
	/** The attendee passanger amount */
	private int currentTotalPassangers;
	/** The number of seats available at that moment */
	protected int remainingSeats;

	/** The Creation Date of the car on the system */
	private Date creationDate;
	/** The Departure time of the car*/
	private Date carDepartureTime;
	/** The Arrival time of the car*/
	private Date carEstimatedArrivalTime;

	/**
	 * @param carNickname
	 * @param carPlate
	 * @param carDestination
	 * @param carDestinationDetail
	 * @param carStation
	 * @param carStationDetail
	 * @param totalPassangerSeats
	 * @param currentTotalPassangers
	 * @param remainingSeats
	 * @param creationDate
	 */
	public CarDefinition(String carNickname, String carPlate,
			String carDestination, String carDestinationDetail,
			String carStation, String carStationDetail,
			int totalPassangerSeats, int currentTotalPassangers,
			int remainingSeats, Date creationDate) {
		super();
		this.carNickname = carNickname;
		this.carPlate = carPlate;
		this.carDestination = carDestination;
		this.carDestinationDetail = carDestinationDetail;
		this.carStation = carStation;
		this.carStationDetail = carStationDetail;
		this.totalPassangerSeats = totalPassangerSeats;
		this.currentTotalPassangers = currentTotalPassangers;
		this.remainingSeats = remainingSeats;
		this.creationDate = creationDate;
	}

	/**
	 * Default Constructor for trial
	 */
	public CarDefinition(String carNickname, String carPlate,
			String carDestination) {
		this.carNickname = carNickname;
		this.carPlate = carPlate;
		this.carDestination = carDestination;
		carDestinationDetail = "Galatasaray TT Arena'dan 7KM sonra Gaziosmanpaþa'ya dönüldüðünde soldaki bloklar";
		carStation = "Gebze - Yapý Kredi Bankacýlýk Üssü Önü";
		carStationDetail = "Üssün ön tarafýndaki güvenlik klübesinin önünden kalkar";
		totalPassangerSeats = 20;
		currentTotalPassangers = 12;
		remainingSeats = this.getRemainingSeats();
		creationDate = new Date();
	}



	public String getCarNickname() {
		return carNickname;
	}

	public void setCarNickname(String carNickname) {
		this.carNickname = carNickname;
	}

	public String getCarPlate() {
		return carPlate;
	}

	public void setCarPlate(String carPlate) {
		this.carPlate = carPlate;
	}

	public String getCarDestination() {
		return carDestination;
	}

	public void setCarDestination(String carDestination) {
		this.carDestination = carDestination;
	}

	public String getCarDestinationDetail() {
		return carDestinationDetail;
	}

	public void setCarDestinationDetail(String carDestinationDetail) {
		this.carDestinationDetail = carDestinationDetail;
	}

	public String getCarStation() {
		return carStation;
	}

	public void setCarStation(String carStation) {
		this.carStation = carStation;
	}

	public String getCarStationDetail() {
		return carStationDetail;
	}

	public void setCarStationDetail(String carStationDetail) {
		this.carStationDetail = carStationDetail;
	}

	public int getTotalPassangerSeats() {
		return totalPassangerSeats;
	}

	public void setTotalPassangerSeats(int totalPassangerSeats) {
		this.totalPassangerSeats = totalPassangerSeats;
	}

	public int getCurrentTotalPassangers() {
		return currentTotalPassangers;
	}

	public void setCurrentTotalPassangers(int currentTotalPassangers) {
		this.currentTotalPassangers = currentTotalPassangers;
	}

	public int getRemainingSeats() {
		return totalPassangerSeats - currentTotalPassangers;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getCarDepartureTime() {
		return carDepartureTime;
	}

	public void setCarDepartureTime(Date carDepartureTime) {
		this.carDepartureTime = carDepartureTime;
	}

	public Date getCarEstimatedArrivalTime() {
		return carEstimatedArrivalTime;
	}

	public void setCarEstimatedArrivalTime(Date carEstimatedArrivalTime) {
		this.carEstimatedArrivalTime = carEstimatedArrivalTime;
	}
	
	

}
