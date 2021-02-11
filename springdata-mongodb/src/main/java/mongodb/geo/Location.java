package mongodb.geo;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@AllArgsConstructor
public class Location {

	@Id
	private String id;
	
	private GeoJsonPoint position;

}
