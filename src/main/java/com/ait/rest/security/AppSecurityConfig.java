package com.ait.rest.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class AppSecurityConfig {
	@Bean
	public InMemoryUserDetailsManager inMemUser() {

	UserDetails u1=User.withDefaultPasswordEncoder()
			.username("pg")
			.password("pgpwd")
			.roles("ADMIN").build();
	
	UserDetails u2=User.withDefaultPasswordEncoder()
			.username("gppp")
			.password("gppppwd")
			.roles("USER").build();
	return  new InMemoryUserDetailsManager(u1,u2);
	}
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests( (authorize) -> authorize
				                                  .requestMatchers("/contact","/about").
				                                  permitAll().anyRequest().authenticated()).formLogin();
		return http.build();
	}

}
