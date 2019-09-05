package mx.bs.cross.security.db.repositories;

import mx.bs.cross.db.commons.repositories.PersistentRepository;
import mx.bs.cross.security.db.model.SecurityApplicationEntity;

/**
 *
 * @author Arq. Jesús Israel Anaya Salazar
 */
public interface SecurityApplicationRepository extends PersistentRepository<SecurityApplicationEntity> {
	
	SecurityApplicationEntity findByIdString(String idString);
}
