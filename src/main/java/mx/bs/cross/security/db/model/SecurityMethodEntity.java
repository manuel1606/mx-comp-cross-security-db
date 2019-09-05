package mx.bs.cross.security.db.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import mx.bs.cross.db.commons.model.PersistentObject;
import mx.bs.cross.security.commons.SecurityLevel;
import mx.bs.cross.security.commons.SecurityMethodType;

/**
 *
 * @author Arq. Jesús Israel Anaya Salazar
 */
@Entity
@Data()
@EqualsAndHashCode(callSuper = true)
@Table(name = "SECMETHOD")
public class SecurityMethodEntity extends PersistentObject {

	private static final long serialVersionUID = 1L;

	public SecurityMethodEntity() {
	}

	public SecurityMethodEntity(final String id, final String name, final SecurityMethodType type,
			final SecurityLevel securityLevel) {
		super(id);
		this.name = name;
		this.type = type;
		this.securityLevel = securityLevel;
	}

	private String name;
	private SecurityMethodType type;
	private SecurityLevel securityLevel;
}
