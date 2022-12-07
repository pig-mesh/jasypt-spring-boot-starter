package com.ulisesbocchio.jasyptspringbootstarter;

import com.ulisesbocchio.jasyptspringboot.configuration.EnableEncryptablePropertiesConfiguration;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author Ulises Bocchio
 */
@Configuration
@AutoConfiguration
@Import(EnableEncryptablePropertiesConfiguration.class)
public class JasyptSpringBootAutoConfiguration {

}
