package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class Addresses {
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String address;
	private String City;
	private int zip;
	public Addresses(long id, String name, String address, String city, int zip) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		City = city;
		this.zip = zip;
	}
	public Addresses(String name, String address, String city, int zip) {
		super();
		this.name = name;
		this.address = address;
		City = city;
		this.zip = zip;
	}
}
