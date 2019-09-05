package mx.bs.cross.security.db.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;

import mx.bs.cross.db.commons.services.PersistentServiceBase;
import mx.bs.cross.security.db.model.SecurityApplicationSecretEntity;
import mx.bs.cross.security.db.repositories.SecurityApplicationSecretRepository;
import mx.bs.cross.security.db.services.SecurityApplicationSecretService;

public class SecurityApplicationSecretServiceImpl extends PersistentServiceBase<SecurityApplicationSecretRepository,SecurityApplicationSecretEntity> implements SecurityApplicationSecretService{

	@Autowired
	protected SecurityApplicationSecretServiceImpl(SecurityApplicationSecretRepository repository) {
		super(repository);
	}

	@Override
	public List<SecurityApplicationSecretEntity> getAll() {
		return getRepository().findAll();
	}

	@Override
	public SecurityApplicationSecretEntity findSecretById(String id) {
	
		return getRepository().getOne(id);
	}

	@Override
	public void createSecret(SecurityApplicationSecretEntity secret) {
		getRepository().save(secret);
		
	}

	@Override
	public SecurityApplicationSecretEntity updateSecret(String idSecret) {
		return null;
	}

	@Override
	public void deleteSecret(String id) {
		getRepository().deleteById(id);
		
	}

	@Override
	public List<SecurityApplicationSecretEntity> findByActive(boolean active) {
		Sort sort = new Sort(Direction.ASC, "description");
		return getRepository().findByActive(active, sort);
	}
	


}
