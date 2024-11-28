package com.example.Food.Service;



import com.example.Food.Entity.Signup;


public interface SignupService {
	void registerUser(Signup signup);
    boolean emailExists(String email);

}
