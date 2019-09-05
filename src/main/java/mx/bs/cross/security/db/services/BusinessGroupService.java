package mx.bs.cross.security.db.services;

import mx.bs.cross.db.commons.services.PersistentService;
import mx.bs.cross.security.db.model.BusinessGroupEntity;

/**
 *
 * @author Arq. Jesús Israel Anaya Salazar
 */
public interface BusinessGroupService extends PersistentService<BusinessGroupEntity> {
	BusinessGroupEntity findByName(String name);
}
