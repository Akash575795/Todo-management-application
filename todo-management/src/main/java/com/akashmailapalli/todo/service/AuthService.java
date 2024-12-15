package com.akashmailapalli.todo.service;

import com.akashmailapalli.todo.dto.LoginDto;
import com.akashmailapalli.todo.dto.RegisterDto;

public interface AuthService {
    String register(RegisterDto registerDto);

    String login(LoginDto loginDto);
}
