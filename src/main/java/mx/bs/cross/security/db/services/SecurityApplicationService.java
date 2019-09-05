package mx.bs.cross.security.db.services;

import mx.bs.cross.db.commons.services.PersistentService;
import mx.bs.cross.security.db.model.SecurityApplicationEntity;

/**
 *
 * @author Arq. Jesús Israel Anaya Salazar
 */
public interface SecurityApplicationService extends PersistentService<SecurityApplicationEntity> {
	SecurityApplicationEntity findByIdString(String idString);
}
