package mx.bs.cross.security.db.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import mx.bs.cross.db.commons.model.PersistentObject;
import mx.bs.cross.security.commons.SecurityApplicationType;

/**
 *
 * @author Arq. Jesús Israel Anaya Salazar
 */
@Entity
@Data()
@EqualsAndHashCode(callSuper = true)
@Table(name = "SECAPP")
public class SecurityApplicationEntity extends PersistentObject {

	private static final long serialVersionUID = 1L;

	private String idString;
	private String description;
	private SecurityApplicationType type;

}