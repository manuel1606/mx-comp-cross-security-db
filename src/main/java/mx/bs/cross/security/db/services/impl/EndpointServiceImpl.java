package mx.bs.cross.security.db.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import mx.bs.cross.db.commons.services.PersistentServiceBase;
import mx.bs.cross.security.db.model.EndpointEntity;
import mx.bs.cross.security.db.repositories.EndpoointRepository;
import mx.bs.cross.security.db.services.EndpointService;

/**
 *
 * @author Arq. Jesús Israel Anaya Salazar
 */
@Service
public class EndpointServiceImpl
		extends PersistentServiceBase<EndpoointRepository, EndpointEntity>
		implements EndpointService {

	@Autowired
	protected EndpointServiceImpl(EndpoointRepository repository) {
		super(repository);
	}

	@Override
	public List<EndpointEntity> findByActive(boolean active) {
		Sort sort = new Sort(Direction.ASC, "description");
		return getRepository().findByActive(active, sort);
	}
	
	public EndpointEntity findByPath(String path) {
		return getRepository().findByPath(path);
	}
	

}
