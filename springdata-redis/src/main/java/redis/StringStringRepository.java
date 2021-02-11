package redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

/**
 * Simple repository to store key/value pairs of type String/String.
 * @author tobias.trelle
 */
@Repository
public class StringStringRepository {
	
	@Autowired
	private RedisTemplate<String, String> template;	
	
	public void add(String key, String value) {
		template.opsForValue().set(key, value);
	}
	
	public String getValue(String key) {
		return template.opsForValue().get(key);
	}
	
	public void delete(String key) {
		template.opsForValue().getOperations().delete(key);
	}
	
}
