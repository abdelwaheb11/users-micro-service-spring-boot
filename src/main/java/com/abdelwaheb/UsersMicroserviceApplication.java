package com.abdelwaheb;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*import com.abdelwaheb.entity.Roles;
import com.abdelwaheb.entity.User;
import jakarta.annotation.PostConstruct;*/

//import com.abdelwaheb.service.UserService;

@SpringBootApplication
public class UsersMicroserviceApplication {

	/*@Autowired
	UserService userService;
	 
	@PostConstruct
	void init_users() {
		
		userService.addRole(new Roles(null,"ADMIN"));
		userService.addRole(new Roles(null,"USER"));
		
		userService.saveUser(new User(null,"admin","123",true,"yazidiabdelwaheb@gmail.com",null));
		
		userService.addRoleToUser("admin", "ADMIN");
		userService.addRoleToUser("admin", "USER");
	} */

	

	public static void main(String[] args) {
		SpringApplication.run(UsersMicroserviceApplication.class, args);
	}

}
