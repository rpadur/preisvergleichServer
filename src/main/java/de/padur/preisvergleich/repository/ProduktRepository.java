/**
 * 
 */
package de.padur.preisvergleich.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import de.padur.preisvergleich.bo.Produkt;

/**
 * @author ronald.padur
 *
 */
@RepositoryRestResource(path = "/produkte", collectionResourceRel = "produkte")
public interface ProduktRepository extends PagingAndSortingRepository<Produkt, Long> {

}
