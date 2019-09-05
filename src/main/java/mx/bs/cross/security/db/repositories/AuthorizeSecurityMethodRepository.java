package mx.bs.cross.security.db.repositories;

import java.util.List;

import mx.bs.cross.db.commons.repositories.PersistentRepository;
import mx.bs.cross.security.db.model.AuthorizeSecurityMethodEntity;
import mx.bs.cross.security.db.model.SecurityApplicationEntity;

/**
 *
 * @author Arq. Jesús Israel Anaya Salazar
 */
public interface AuthorizeSecurityMethodRepository extends PersistentRepository<AuthorizeSecurityMethodEntity> {
	List<AuthorizeSecurityMethodEntity> findBySecurityApplication(SecurityApplicationEntity securityApplicationEntity);
}
