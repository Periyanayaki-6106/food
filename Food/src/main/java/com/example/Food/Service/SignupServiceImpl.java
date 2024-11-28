package com.example.Food.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Food.Entity.Signup;
import com.example.Food.Repository.SignupRepo;
@Service
public class SignupServiceImpl implements SignupService {
	 
	@Autowired
    private SignupRepo  signupRepository;

    
    public void registerUser(Signup signup) {
        signupRepository.save(signup);
    }

 
    public boolean emailExists(String email) {
        return signupRepository.findByEmail(email) != null;
    }
}
