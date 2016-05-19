package org.elasticsearch.rest.action;

import org.elasticsearch.client.Client;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.rest.BaseRestHandler;
import org.elasticsearch.rest.RestChannel;
import org.elasticsearch.rest.RestController;
import org.elasticsearch.rest.RestRequest;
import org.elasticsearch.river.RiverIndexName;

public class RoctMQRestAction extends BaseRestHandler {

	private final String riverIndexName="";
	
	public RoctMQRestAction(Settings settings, RestController controller,
			Client client, @RiverIndexName String riverIndexName) {
		super(settings, controller, client);
		
	}



	@Override
	protected void handleRequest(RestRequest request, RestChannel channel,
			Client client) throws Exception {
		
		
	}

}
