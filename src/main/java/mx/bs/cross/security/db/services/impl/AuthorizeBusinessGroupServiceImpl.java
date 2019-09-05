package mx.bs.cross.security.db.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import mx.bs.cross.db.commons.services.PersistentServiceBase;
import mx.bs.cross.security.db.model.AuthorizeBusinessGroupEntity;
import mx.bs.cross.security.db.model.SecurityApplicationEntity;
import mx.bs.cross.security.db.repositories.AuthorizeBusinessGroupRepository;
import mx.bs.cross.security.db.services.AuthorizeBusinessGroupService;

/**
 *
 * @author Arq. Jesús Israel Anaya Salazar
 */
@Service
public class AuthorizeBusinessGroupServiceImpl
		extends PersistentServiceBase<AuthorizeBusinessGroupRepository, AuthorizeBusinessGroupEntity>
		implements AuthorizeBusinessGroupService {

	@Autowired
	protected AuthorizeBusinessGroupServiceImpl(AuthorizeBusinessGroupRepository repository) {
		super(repository);
	}

	@Override
	public List<AuthorizeBusinessGroupEntity> findByActive(boolean active) {
		Sort sort = new Sort(Direction.ASC, "description");
		return getRepository().findByActive(active, sort);
	}

	public List<AuthorizeBusinessGroupEntity> findBySecurityApplication(SecurityApplicationEntity securityApplicationEntity) {
		return getRepository().findBySecurityApplication(securityApplicationEntity);
	}
}
