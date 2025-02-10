package com.dreamlayer.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityDetails {

	/*
	@Bean
	public InMemoryUserDetailsManager userDetailsService() {
		
		UserDetails user = User.withDefaultPasswordEncoder()
				.username(userName)
				.password(password)
				.roles("USER")
				.build();
		return new InMemoryUserDetailsManager(user);
	}
	*/
	
	@Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.csrf(csrf -> csrf.ignoringRequestMatchers("/eureka/**"));
        return httpSecurity.build();
    }
}
