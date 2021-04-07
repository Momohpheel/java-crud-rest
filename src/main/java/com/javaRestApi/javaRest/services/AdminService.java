package com.javaRestApi.javaRest.services;

import com.javaRestApi.javaRest.models.Admin;
import com.javaRestApi.javaRest.models.User;
import com.javaRestApi.javaRest.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class AdminService {

    @Autowired
    AdminRepository adminRepository;

    public Admin login(){}

    public Admin register(){}

    public List<User> getAllUsers(){}

    public void deleteUser(){}
}
