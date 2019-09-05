package mx.bs.cross.security.db.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import mx.bs.cross.db.commons.services.PersistentServiceBase;
import mx.bs.cross.security.db.model.AuthorizeEndpointEntity;
import mx.bs.cross.security.db.model.BusinessGroupEntity;
import mx.bs.cross.security.db.repositories.AuthorizeEndpointRepository;
import mx.bs.cross.security.db.services.AuthorizeEndpointService;

/**
 *
 * @author Arq. Jesús Israel Anaya Salazar
 */
@Service
public class AuthorizeEndpointServiceImpl
		extends PersistentServiceBase<AuthorizeEndpointRepository, AuthorizeEndpointEntity>
		implements AuthorizeEndpointService {

	@Autowired
	protected AuthorizeEndpointServiceImpl(AuthorizeEndpointRepository repository) {
		super(repository);
	}

	@Override
	public List<AuthorizeEndpointEntity> findByActive(boolean active) {
		Sort sort = new Sort(Direction.ASC, "description");
		return getRepository().findByActive(active, sort);
	}

	public List<AuthorizeEndpointEntity> findByBusinessGroup(BusinessGroupEntity businessGroupEntity) {
		return getRepository().findByBusinessGroup(businessGroupEntity);
	}
}
