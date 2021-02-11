package mongodb;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.geo.Point;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "pois")
@Getter
@Setter
@NoArgsConstructor
public class PointOfInterest {

	@Indexed private String typ;
	private String tags;
	
	@Field("desc") private String description;
	private Adresse adresse;
	
	private Point location;
}
