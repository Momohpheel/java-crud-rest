package com.javaRestApi.javaRest.services;

import com.javaRestApi.javaRest.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@Service
public class ProfileService {

    @Autowired
    ProfileRepository profileRepository;


}
