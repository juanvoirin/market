package com.juan.market.domain.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MarketUserDetailsService implements UserDetailsService {

    //Aca deberia ir una autenticacion con la base de datos
    //de los usuarios que accedan
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return new User("juan", "{noop} market", new ArrayList<>());
    }

}
