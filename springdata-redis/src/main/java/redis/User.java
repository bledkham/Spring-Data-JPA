package redis;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
	
	private String login;
	
	private String fullName;
	
	private Date lastLogin;

	public User(String root, String superuser) {
	}
}

