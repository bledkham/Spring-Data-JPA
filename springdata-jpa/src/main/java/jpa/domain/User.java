package jpa.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

import javax.persistence.*;

@Entity
@NamedQueries( {
	@NamedQuery( name="User.findByUser5", query = "SELECT u FROM User u where u.fullName = 'User 5'" ),
	@NamedQuery( name="User.classicQuery", query = "SELECT u FROM User u where u.fullName = :fullName" )
})
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
public class User {

	@Id
	@GeneratedValue
	private String id;
	
	private String fullName;
	
	private String lastLogin;

	public User(String fullName, String lastLogin) {
		this.fullName = fullName;
		this.lastLogin = lastLogin;
	}
}
