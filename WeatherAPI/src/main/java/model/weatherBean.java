package model;

public class weatherBean {

	// Statements
	private String cityStr;

	private String countryStr;

	private String cloudsStr;
	
	private String dateStr;
	
	private double temperature;
	
	// Constructor
	public weatherBean(String cityStr, String countryStr) {

		this.cityStr = cityStr;
		this.countryStr = countryStr;

	}
	// Getmethod
	public String getCityStr() {
		return cityStr;
	}

	public String getCountryStr() {
		return countryStr;
	}

	public String getCloudsStr() {
		return cloudsStr;
	}
		
		public String getDateStr() {
			return dateStr;
	}
		
		public double getTemperature() {
			return temperature;
	   
	}
		
	    public double getTemperatureCelsius() {
	        double cel = getTemperature() - 273.15;
	        return Math.round(cel);
	}
	// Setmethod date, cloud & temp
		public void setDateStr(String dateStr) {
			this.dateStr = dateStr;
		}
		
		public void setCloudsStr(String cloudsStr) {
		this.cloudsStr = cloudsStr;
	}	
		
	    public void setTemperature(double temperature) {
	        this.temperature = temperature;
	}


}