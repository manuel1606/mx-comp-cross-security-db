package mx.bs.cross.security.db.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import mx.bs.cross.db.commons.services.PersistentServiceBase;
import mx.bs.cross.security.db.model.AuthorizeSecurityMethodEntity;
import mx.bs.cross.security.db.model.SecurityApplicationEntity;
import mx.bs.cross.security.db.repositories.AuthorizeSecurityMethodRepository;
import mx.bs.cross.security.db.services.AuthorizeSecurityMethodService;

/**
 *
 * @author Arq. Jesús Israel Anaya Salazar
 */
@Service
public class AuthorizeSecurityMethodServiceImpl
		extends PersistentServiceBase<AuthorizeSecurityMethodRepository, AuthorizeSecurityMethodEntity>
		implements AuthorizeSecurityMethodService {

	@Autowired
	protected AuthorizeSecurityMethodServiceImpl(AuthorizeSecurityMethodRepository repository) {
		super(repository);
	}

	@Override
	public List<AuthorizeSecurityMethodEntity> findByActive(boolean active) {
		Sort sort = new Sort(Direction.ASC, "description");
		return getRepository().findByActive(active, sort);
	}

	public List<AuthorizeSecurityMethodEntity> findBySecurityApplication(SecurityApplicationEntity securityApplicationEntity) {
		return getRepository().findBySecurityApplication(securityApplicationEntity);
	}
}
