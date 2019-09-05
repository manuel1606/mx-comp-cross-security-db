package mx.bs.cross.security.db.repositories;

import mx.bs.cross.db.commons.repositories.PersistentRepository;
import mx.bs.cross.security.db.model.BusinessGroupEntity;

/**
 *
 * @author Arq. Jesús Israel Anaya Salazar
 */
public interface BusinessGroupRepository extends PersistentRepository<BusinessGroupEntity> {
	BusinessGroupEntity findByName(String name);
}
