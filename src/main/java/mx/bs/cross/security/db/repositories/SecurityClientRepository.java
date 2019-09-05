package mx.bs.cross.security.db.repositories;

import mx.bs.cross.db.commons.repositories.PersistentRepository;
import mx.bs.cross.security.db.model.SecurityClientEntity;

/**
 *
 * @author Arq. Jesús Israel Anaya Salazar
 */
public interface SecurityClientRepository extends PersistentRepository<SecurityClientEntity> {

	SecurityClientEntity findByClientId(String value);

}
