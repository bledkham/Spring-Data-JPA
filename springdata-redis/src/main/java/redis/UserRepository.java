package redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

/**
 * Repository for key/value pairs of type String/User.
 * @author tobias.trelle
 */
@Repository
public class UserRepository {

	@Autowired
	private RedisTemplate<String, User> template;	
	
	public void add(User user) {
		template.opsForValue().set(user.getLogin(), user);
	}
	
	public User get(String key) {
		return template.opsForValue().get(key);
	}
	
}
