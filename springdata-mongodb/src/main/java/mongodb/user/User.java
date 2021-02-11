package mongodb.user;

import java.util.Date;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class User {

	@Id 
	private String id;
	
	@Indexed(unique=true)
	private String fullName;
	
	private Date lastLogin;
	
	public User(String id, String fullName) {
		this.id = id;
		this.fullName = fullName;
		this.lastLogin = new Date();
	}
}
