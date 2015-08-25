/**
 * 
 */
package de.padur.preisvergleich.bo;

/**
 * @author ronald.padur
 *
 */
public class Produkt {
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
