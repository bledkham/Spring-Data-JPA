package mongodb.order;

import java.util.Date;
import java.util.List;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;
@Getter
@Setter
@EqualsAndHashCode
public class Order {

	@Id private String id;
	
	private Date date;
	
	@Field("custInfo") private String customerInfo;
	
	List<Item> items;
	
	public Order() {
		this(null);
	}

	public Order(String customerInfo) {
		super();
		this.customerInfo = customerInfo;
	}

	public Order(String id, String customerInfo) {
		this(customerInfo);
		this.id = id;
	}
}
