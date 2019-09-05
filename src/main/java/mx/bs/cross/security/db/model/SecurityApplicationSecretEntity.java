package mx.bs.cross.security.db.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
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
@Table(name = "SECAPP_SECRET")
public class SecurityApplicationSecretEntity extends PersistentObject {

	private static final long serialVersionUID = 1L;

	@JoinColumn(name = "securityApplicationId")
	@ManyToOne
	private SecurityApplicationEntity securityApplication;

	@Lob
	private byte[] secret;

}
