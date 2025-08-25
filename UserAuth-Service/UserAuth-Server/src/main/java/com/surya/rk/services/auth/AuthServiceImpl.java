package com.surya.rk.services.auth;

import java.util.Optional;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.surya.rk.dto.SignupRequest;
import com.surya.rk.dto.UserDto;
import com.surya.rk.entities.User;
import com.surya.rk.enums.UserRole;
import com.surya.rk.repositories.UserRepository;

import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;

@Service	
@AllArgsConstructor
public class AuthServiceImpl implements AuthService 
{
	
	
	private final UserRepository userRepository;
	

	
	   // private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

	
	@PostConstruct
	public void createAdminAccount()
	{
		Optional<User>optinalUser=userRepository.findByUserRole(UserRole.ADMIN);
		if(optinalUser.isEmpty())
		{
			User user=new User();
			user.setEmail("admin@test.com");
			user.setName("admin");
			user.setPassword(new BCryptPasswordEncoder().encode("admin"));
			user.setUserRole(UserRole.ADMIN);
	        userRepository.save(user);
			System.out.println("Admin Account created Successfully 👍");
		}
		else
		{
			System.out.println("Admin Account already exist 😢");
		}
		
	}

	@Override
	public UserDto signupUser(SignupRequest signupRequest) {
	    if (userRepository.findFirstByEmail(signupRequest.getEmail()).isPresent()) {
	        throw new IllegalStateException("Email already exists");
	    }

	    User user = new User();
	    user.setEmail(signupRequest.getEmail());
	    user.setName(signupRequest.getName());
	    user.setPassword(new BCryptPasswordEncoder().encode(signupRequest.getPassword()));
	    user.setUserRole(UserRole.USER);

	    userRepository.save(user);
	
	    return user.getUserDto();
	}

	

	@Override
	public boolean hasUserWithEmail(String email) {
		return userRepository.findFirstByEmail(email).isPresent();
	}
	
	




	

	    	
}
