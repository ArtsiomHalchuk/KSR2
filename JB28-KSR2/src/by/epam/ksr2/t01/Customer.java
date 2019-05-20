package by.epam.ksr2.t01;

public class Customer {
	int id;
	String surname;
	String name;
	String patronic;
	Addres addr;
	int cardNumber;
	int bankNumber;
	
	
	public Customer(int id, String surname, String name, String patronic, Addres addr, int cardNumber, int bankNumber) {
		super();
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.patronic = patronic;
		this.addr = addr;
		this.cardNumber = cardNumber;
		this.bankNumber = bankNumber;
	}
	
	public Customer(int id, String surname, String name, int bankNumber) {
		super();
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.bankNumber = bankNumber;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((addr == null) ? 0 : addr.hashCode());
		result = prime * result + bankNumber;
		result = prime * result + cardNumber;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((patronic == null) ? 0 : patronic.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
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
		Customer other = (Customer) obj;
		if (addr == null) {
			if (other.addr != null)
				return false;
		} else if (!addr.equals(other.addr))
			return false;
		if (bankNumber != other.bankNumber)
			return false;
		if (cardNumber != other.cardNumber)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (patronic == null) {
			if (other.patronic != null)
				return false;
		} else if (!patronic.equals(other.patronic))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}
	
	
	
}
