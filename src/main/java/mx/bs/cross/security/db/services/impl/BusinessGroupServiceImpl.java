package mx.bs.cross.security.db.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import mx.bs.cross.db.commons.services.PersistentServiceBase;
import mx.bs.cross.security.db.model.BusinessGroupEntity;
import mx.bs.cross.security.db.repositories.BusinessGroupRepository;
import mx.bs.cross.security.db.services.BusinessGroupService;

/**
 *
 * @author Arq. Jesús Israel Anaya Salazar
 */
@Service
public class BusinessGroupServiceImpl extends PersistentServiceBase<BusinessGroupRepository, BusinessGroupEntity>
		implements BusinessGroupService {

	@Autowired
	protected BusinessGroupServiceImpl(BusinessGroupRepository repository) {
		super(repository);
	}

	@Override
	public List<BusinessGroupEntity> findByActive(boolean active) {
		Sort sort = new Sort(Direction.ASC, "description");
		return getRepository().findByActive(active, sort);
	}
	
	public BusinessGroupEntity findByName(String name) {
		return getRepository().findByName(name);
	}
}
