package mongodb.order;

import java.util.Date;

import org.bson.Document;
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.BeforeSaveEvent;

import com.mongodb.DBObject;


public class OrderBeforeSaveListener extends AbstractMongoEventListener<Order>  {

	@Override
	public void onBeforeSave(BeforeSaveEvent<Order> event) {
		Order o = event.getSource();
		Document d = event.getDocument();
		
		if ( o.getId() == null ) {
			d.put("_id","" + Math.random() );
		}
		
		if ( o.getDate() == null ) {
			d.put("date", new Date());
		}
	}

}
