/**
 * 
 */
package de.padur.preisvergleich.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author ronald.padur
 *
 */
@Entity
public class Produkt {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String name;
	private long preis;

	public Produkt(long id, String name, long preis) {
		this.id = id;
		this.name = name;
		this.preis = preis;

	}

	public Produkt() {
		//
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPreis(long preis) {
		this.preis = preis;
	}

	public String getName() {
		return name;
	}

	public long getPreis() {
		return preis;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
}
