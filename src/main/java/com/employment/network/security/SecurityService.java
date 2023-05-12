package com.employment.network.security;

public interface SecurityService {
    String findLoggedInUsername();

    void autoLogin(String username, String password);
}
