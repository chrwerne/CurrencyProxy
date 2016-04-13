package net.interact.web;

public class Currency {

	private String country;
	private String currency;
	private String isoA3Code;
	private String isoA2Code;
	private String value;
	private String comment;
	
	public Currency(String country, String currency, String isoA3Code, String isoA2Code, String value, String comment){
		this.country = country;
		this.currency = currency;
		this.isoA3Code = isoA3Code;
		this.isoA2Code = isoA2Code;
		this.value = value;
		this.comment = comment;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getIsoA3Code() {
		return isoA3Code;
	}

	public void setIsoA3Code(String isoA3Code) {
		this.isoA3Code = isoA3Code;
	}

	public String getIsoA2Code() {
		return isoA2Code;
	}

	public void setIsoA2Code(String isoA2Code) {
		this.isoA2Code = isoA2Code;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
}
