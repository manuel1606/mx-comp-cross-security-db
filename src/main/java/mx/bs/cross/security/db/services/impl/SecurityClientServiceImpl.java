package mx.bs.cross.security.db.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import mx.bs.cross.db.commons.services.PersistentServiceBase;
import mx.bs.cross.security.db.model.SecurityClientEntity;
import mx.bs.cross.security.db.repositories.SecurityClientRepository;
import mx.bs.cross.security.db.services.SecurityClientService;

/**
 *
 * @author Arq. Jesús Israel Anaya Salazar
 */
@Service
public class SecurityClientServiceImpl extends PersistentServiceBase<SecurityClientRepository, SecurityClientEntity>
		implements SecurityClientService {

	@Autowired
	PasswordEncoder passwordEncoder;

	@Autowired
	protected SecurityClientServiceImpl(SecurityClientRepository repository) {
		super(repository);
	}

	@Override
	public List<SecurityClientEntity> findByActive(boolean active) {
		Sort sort = new Sort(Direction.ASC, "clientId");
		return getRepository().findByActive(active, sort);
	}

	@Override
	public SecurityClientEntity findByClientId(String value) {
		return getRepository().findByClientId(value);
	}

	@Override
	protected void onBeforeSave(SecurityClientEntity entity) {
		if (isNewEntity(entity)) {
			String clientSecret = entity.getClientSecret();
			clientSecret = passwordEncoder.encode(clientSecret);
			entity.setClientSecret(clientSecret);
		}
	}

	/*
	 * protected void validateDuplicate(SecurityApplication entity) { if
	 * (!getRepository().existsById(entity.getId())) { T foundItem =
	 * getRepository().findByCode(entity.getCode());
	 * 
	 * if (foundItem != null) { throw new DataException("Un elemento con código " +
	 * entity.getCode() + " ya existe."); } } }
	 * 
	 * @Override protected void onValidateEntity(T entity) {
	 * super.onValidateEntity(entity); validateDuplicate(entity); }
	 */
}
