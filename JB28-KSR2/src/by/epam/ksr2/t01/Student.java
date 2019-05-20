package by.epam.ksr2.t01;

import java.util.Date;

public class Student {
	int id;
	String surname;
	String name;
	String patronic;
	Date dateOfBirth;
	Addres addr;
	String phoneNumber;
	String faculty;
	int course;
	
	
	public Student(int id, String surname, String name, String patronic, Date dateOfBirth, Addres addr,
			String phoneNumber, String faculty, int course) {
		super();
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.patronic = patronic;
		this.dateOfBirth = dateOfBirth;
		this.addr = addr;
		this.phoneNumber = phoneNumber;
		this.faculty = faculty;
		this.course = course;
	}

	
	public Student(int id, String surname, String name, Date dateOfBirth, Addres addr,
			String faculty, int course) {
		super();
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.addr = addr;
		this.faculty = faculty;
		this.course = course;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((addr == null) ? 0 : addr.hashCode());
		result = prime * result + course;
		result = prime * result + ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
		result = prime * result + ((faculty == null) ? 0 : faculty.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((patronic == null) ? 0 : patronic.hashCode());
		result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
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
		Student other = (Student) obj;
		if (addr == null) {
			if (other.addr != null)
				return false;
		} else if (!addr.equals(other.addr))
			return false;
		if (course != other.course)
			return false;
		if (dateOfBirth == null) {
			if (other.dateOfBirth != null)
				return false;
		} else if (!dateOfBirth.equals(other.dateOfBirth))
			return false;
		if (faculty == null) {
			if (other.faculty != null)
				return false;
		} else if (!faculty.equals(other.faculty))
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
		if (phoneNumber == null) {
			if (other.phoneNumber != null)
				return false;
		} else if (!phoneNumber.equals(other.phoneNumber))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}
	
	

}
