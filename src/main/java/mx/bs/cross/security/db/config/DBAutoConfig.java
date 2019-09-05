package mx.bs.cross.security.db.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan(basePackages = "mx.bs.cross.security.db.model")
@EnableJpaRepositories(basePackages = "mx.bs.cross.security.db.repositories")
@ComponentScan(basePackages = "mx.bs.cross.security.db.services")
public class DBAutoConfig {

}
