package api.model.requests;

import lombok.Data;

@Data
public class GraphQLRequest {

	private String query;
    private Object variables;	
    
}
