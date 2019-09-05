package mx.bs.cross.security.db.services;

import java.util.List;

import mx.bs.cross.db.commons.services.PersistentService;
import mx.bs.cross.security.db.model.AuthorizeEndpointEntity;
import mx.bs.cross.security.db.model.AuthorizeSecurityMethodEntity;
import mx.bs.cross.security.db.model.BusinessGroupEntity;
import mx.bs.cross.security.db.model.SecurityApplicationEntity;

/**
 *
 * @author Arq. Jesús Israel Anaya Salazar
 */
public interface AuthorizeEndpointService extends PersistentService<AuthorizeEndpointEntity> {
	List<AuthorizeEndpointEntity> findByBusinessGroup(BusinessGroupEntity businessGroupEntity);
}
