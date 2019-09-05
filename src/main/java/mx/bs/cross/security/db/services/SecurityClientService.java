package mx.bs.cross.security.db.services;

import mx.bs.cross.db.commons.services.PersistentService;
import mx.bs.cross.security.db.model.SecurityClientEntity;

/**
 *
 * @author Arq. Jesús Israel Anaya Salazar
 */
public interface SecurityClientService extends PersistentService<SecurityClientEntity> {

	SecurityClientEntity findByClientId(String value);

}
