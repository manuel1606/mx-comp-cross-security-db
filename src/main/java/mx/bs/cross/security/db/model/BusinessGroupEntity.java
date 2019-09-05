package mx.bs.cross.security.db.model;

import javax.persistence.Entity;
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
@Table(name = "BUSGROUP")
public class BusinessGroupEntity extends PersistentObject {

	private static final long serialVersionUID = 1L;

	private String name;
}
