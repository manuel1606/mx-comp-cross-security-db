package mx.bs.cross.security.db.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import mx.bs.cross.db.commons.model.PersistentObject;

/**
 *
 * @author Arq. Jesús Israel Anaya Salazar
 */
@Entity
@Data()
@EqualsAndHashCode(callSuper = true)
@Table(name = "AUTH_ENDPOINT")
public class AuthorizeEndpointEntity extends PersistentObject {

	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "businessGroupId")
	private BusinessGroupEntity businessGroup;

	@JoinColumn(name = "endpointId")
	@ManyToOne
	private EndpointEntity endpoint;
}
