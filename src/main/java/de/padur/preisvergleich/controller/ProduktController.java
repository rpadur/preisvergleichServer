/**
 * 
 */
package de.padur.preisvergleich.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import de.padur.preisvergleich.bo.Produkt;

/**
 * @author ronald.padur
 *
 */
@RestController
@RequestMapping(value = "/produkte", produces = MediaType.APPLICATION_JSON_VALUE)
public class ProduktController {

	private List<Produkt> testprodukte;
	private final Produkt dummy = new Produkt(0, "Fehlkauf", 99999999);

	/**
	 * Liefert alle Produkte
	 * 
	 * @return
	 */
	@RequestMapping("")
	public List<Produkt> produkte() {
		return getTestProdukte();
	}

	/**
	 * Liefert zu einer ID das passende Produkt
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public Produkt produkt(@PathVariable long id) {
		for (Produkt produkt : getTestProdukte()) {
			if (produkt.getId() == id) {
				return produkt;
			}
		}
		return dummy;

	}

	/**
	 * Erzeugt ein Produkt
	 * 
	 * @param produkt
	 * @return
	 */
	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public @ResponseBody Produkt createProdukt(@RequestBody @Valid Produkt produkt) {
		System.out.println("Produkt:" + produkt.getName());

		produkt.setId(testprodukte.size() + 1);
		testprodukte.add(produkt);

		return produkt;
	}

	/**
	 * Löscht ein Produkt
	 * 
	 * @param id
	 */
	@RequestMapping(value = "{id}", method = RequestMethod.DELETE)
	public @ResponseBody void deleteProdukt(@PathVariable long id) {
		for (Produkt produkt : testprodukte) {
			if (produkt.getId() == id) {
				testprodukte.remove(produkt);
				break;
			}
		}
	}

	private List<Produkt> getTestProdukte() {
		if (testprodukte == null) {
			testprodukte = createTestProdukte();
		}
		return testprodukte;
	}

	private List<Produkt> createTestProdukte() {
		final Produkt produkt1 = new Produkt(1, "Bananen", 199);
		final Produkt produkt2 = new Produkt(2, "Kokosöl", 2000);

		final Produkt produkt3 = new Produkt(3, "Head&Shoulders", 499);
		final Produkt produkt4 = new Produkt(4, "Mandeln", 199);
		final Produkt produkt5 = new Produkt(5, "Hirse", 249);

		final List<Produkt> produkte = new ArrayList<Produkt>();
		produkte.add(produkt1);
		produkte.add(produkt2);
		produkte.add(produkt3);
		produkte.add(produkt4);
		produkte.add(produkt5);
		return produkte;
	}
}