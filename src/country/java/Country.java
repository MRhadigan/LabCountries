package country.java;

public class Country {
	private String country;

	/**
	 * @param country
	 */
	public Country(String country) {
		super();
		this.country = country;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	
	@Override
	public String toString() {
		return country;
	}
	
}
