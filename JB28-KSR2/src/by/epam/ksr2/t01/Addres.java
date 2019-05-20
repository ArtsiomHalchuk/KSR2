package by.epam.ksr2.t01;

public class Addres {
String city;
String street;
int houseNumber;
int flatNumber;

	public Addres(String city, String street, int houseNumber, int flatNumber) {
	super();
	this.city = city;
	this.street = street;
	this.houseNumber = houseNumber;
	this.flatNumber = flatNumber;
}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + flatNumber;
		result = prime * result + houseNumber;
		result = prime * result + ((street == null) ? 0 : street.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Addres other = (Addres) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (flatNumber != other.flatNumber)
			return false;
		if (houseNumber != other.houseNumber)
			return false;
		if (street == null) {
			if (other.street != null)
				return false;
		} else if (!street.equals(other.street))
			return false;
		return true;
	}

}
