package mx.bs.cross.security.db.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import mx.bs.cross.db.commons.model.PersistentObject;
import mx.bs.cross.security.commons.EndpointType;

/**
 *
 * @author Arq. Jesús Israel Anaya Salazar
 */
@Entity
@Data()
@EqualsAndHashCode(callSuper = true)
@Table(name = "ENDPOINT")
public class EndpointEntity extends PersistentObject {

	private static final long serialVersionUID = 1L;

	private String name;
	private String description;
	private String path;
	private EndpointType type;
	private String version;
	private String apiName;
}
