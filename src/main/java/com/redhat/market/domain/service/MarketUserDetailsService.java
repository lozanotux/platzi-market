package com.redhat.market.domain.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MarketUserDetailsService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        /*
         * This User, is a Demo... in real use cases (in real world scenarios)
         * we use a connection to DB or LDAP to validate users and roles.
         */
        return new User("test", "{noop}test", new ArrayList<>());
    }
}
