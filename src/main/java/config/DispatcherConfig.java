package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * User: yang
 * Date: 14-1-20 12:12
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "controller")
public class DispatcherConfig {
}
