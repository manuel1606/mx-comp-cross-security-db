package mx.bs.cross.security.db.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import mx.bs.cross.db.commons.services.PersistentServiceBase;
import mx.bs.cross.security.db.model.SecurityMethodEntity;
import mx.bs.cross.security.db.repositories.SecurityMethodRepository;
import mx.bs.cross.security.db.services.SecurityMethodService;

/**
 *
 * @author Arq. Jesús Israel Anaya Salazar
 */
@Service
public class SecurityMethodServiceImpl extends PersistentServiceBase<SecurityMethodRepository, SecurityMethodEntity>
		implements SecurityMethodService {

	@Autowired
	protected SecurityMethodServiceImpl(SecurityMethodRepository repository) {
		super(repository);
	}

	@Override
	public List<SecurityMethodEntity> findByActive(boolean active) {
		Sort sort = new Sort(Direction.ASC, "description");
		return getRepository().findByActive(active, sort);
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
