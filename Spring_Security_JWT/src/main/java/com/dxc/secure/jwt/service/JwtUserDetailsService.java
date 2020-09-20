package com.dxc.secure.jwt.service;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

	// User user = repo.findByUsername(username);

	if ("javeed".equals(username)) {
	    return new User("javeed", "$2a$10$omxvGth10e5nuNENLwqtTeFrRjr1ZbT.ODXFVgHGTuyBXL3rxEPi2",
		    new ArrayList<>()); // here we can return UserPrincipal class obj by using user entity obj return
					// new UserPrincipal(user);
	} else {
	    throw new UsernameNotFoundException("User not found with username: " + username);
	}
    }
}