package com.employment.network.service;

import com.jobs.jobsearch.model.User;
import com.jobs.jobsearch.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import java.util.HashSet;
import java.util.Set;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private HttpServletRequest request;

    private String getClientIP() {
        String xfHeader = request.getHeader("X-Forwarded-For");
        if (xfHeader == null){
            return request.getRemoteAddr();
        }
        return xfHeader.split(",")[0];
    }





    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String username) {

        boolean accountNonExpired = true;
        boolean credentialsNonExpired = true;
        boolean accountNonLocked = true;
        try{

            User user = userRepository.findByUsername(username);
            if (user == null) throw new UsernameNotFoundException(username);

            Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
            grantedAuthorities.add(new SimpleGrantedAuthority(user.getRole().toString()));
            return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),user.isEnabled(), accountNonExpired,credentialsNonExpired,user.isAccountNonLocked(),grantedAuthorities);
        }catch (RuntimeException ex ){
            throw new RuntimeException(ex);
        }

    }
}
