package mx.bs.cross.security.db.services;

import java.util.List;

import mx.bs.cross.db.commons.services.PersistentService;
import mx.bs.cross.security.db.model.AuthorizeBusinessGroupEntity;
import mx.bs.cross.security.db.model.SecurityApplicationEntity;

/**
 *
 * @author Arq. Jesús Israel Anaya Salazar
 */
public interface AuthorizeBusinessGroupService extends PersistentService<AuthorizeBusinessGroupEntity> {
	List<AuthorizeBusinessGroupEntity> findBySecurityApplication(SecurityApplicationEntity securityApplicationEntity);
}
