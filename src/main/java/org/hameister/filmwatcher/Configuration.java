package org.hameister.filmwatcher;

import org.springframework.context.annotation.Import;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;
import org.springframework.data.jdbc.repository.config.JdbcConfiguration;

@org.springframework.context.annotation.Configuration
@EnableJdbcRepositories
@Import(JdbcConfiguration.class)
public class Configuration {

}
