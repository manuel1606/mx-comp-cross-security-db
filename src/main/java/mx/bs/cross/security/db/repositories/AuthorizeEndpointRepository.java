package mx.bs.cross.security.db.repositories;

import java.util.List;

import mx.bs.cross.db.commons.repositories.PersistentRepository;
import mx.bs.cross.security.db.model.AuthorizeEndpointEntity;
import mx.bs.cross.security.db.model.BusinessGroupEntity;

/**
 *
 * @author Arq. Jesús Israel Anaya Salazar
 */
public interface AuthorizeEndpointRepository extends PersistentRepository<AuthorizeEndpointEntity> {
	List<AuthorizeEndpointEntity> findByBusinessGroup(BusinessGroupEntity businessGroupEntity);
}
