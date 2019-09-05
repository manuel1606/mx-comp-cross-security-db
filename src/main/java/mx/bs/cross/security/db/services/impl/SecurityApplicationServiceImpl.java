package mx.bs.cross.security.db.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import mx.bs.cross.db.commons.services.PersistentServiceBase;
import mx.bs.cross.security.db.model.SecurityApplicationEntity;
import mx.bs.cross.security.db.repositories.SecurityApplicationRepository;
import mx.bs.cross.security.db.services.SecurityApplicationService;

/**
 *
 * @author Arq. Jesús Israel Anaya Salazar
 */
@Service
public class SecurityApplicationServiceImpl
		extends PersistentServiceBase<SecurityApplicationRepository, SecurityApplicationEntity>
		implements SecurityApplicationService {

	@Autowired
	protected SecurityApplicationServiceImpl(SecurityApplicationRepository repository) {
		super(repository);
	}

	@Override
	public List<SecurityApplicationEntity> findByActive(boolean active) {
		Sort sort = new Sort(Direction.ASC, "description");
		return getRepository().findByActive(active, sort);
	}

	public SecurityApplicationEntity findByIdString(String idString) {
		return getRepository().findByIdString(idString);
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
