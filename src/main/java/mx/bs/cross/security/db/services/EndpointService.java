package mx.bs.cross.security.db.services;

import mx.bs.cross.db.commons.services.PersistentService;
import mx.bs.cross.security.db.model.EndpointEntity;

/**
 *
 * @author Arq. Jesús Israel Anaya Salazar
 */
public interface EndpointService extends PersistentService<EndpointEntity> {
	EndpointEntity findByPath(String path);
}
