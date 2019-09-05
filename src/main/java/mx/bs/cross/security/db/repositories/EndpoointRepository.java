package mx.bs.cross.security.db.repositories;

import mx.bs.cross.db.commons.repositories.PersistentRepository;
import mx.bs.cross.security.db.model.EndpointEntity;

/**
 *
 * @author Arq. Jesús Israel Anaya Salazar
 */
public interface EndpoointRepository extends PersistentRepository<EndpointEntity> {
	EndpointEntity findByPath(String path);
}
