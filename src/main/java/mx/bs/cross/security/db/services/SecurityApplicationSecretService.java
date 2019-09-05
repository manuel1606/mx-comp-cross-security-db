package mx.bs.cross.security.db.services;

import java.util.List;

import mx.bs.cross.db.commons.services.PersistentService;
import mx.bs.cross.security.db.model.SecurityApplicationSecretEntity;

public interface SecurityApplicationSecretService extends PersistentService<SecurityApplicationSecretEntity>{
	
	public List<SecurityApplicationSecretEntity> getAll();
	
	public SecurityApplicationSecretEntity findSecretById(String id);
	
	public void createSecret(SecurityApplicationSecretEntity secret);
	
	public SecurityApplicationSecretEntity updateSecret(String  idSecret);
	
	public void deleteSecret(String id);

}
