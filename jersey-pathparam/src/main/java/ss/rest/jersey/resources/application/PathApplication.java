package ss.rest.jersey.resources.application;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import ss.rest.jersey.resources.PathParamResource;

@ApplicationPath("/rest")
public class PathApplication extends Application{
	private Set<Class<?>> objectPerReq = null;
	
	public PathApplication() {
		objectPerReq = new HashSet<Class<?>>();
	}

	@Override
	public Set<Class<?>> getClasses() {
		objectPerReq.add(PathParamResource.class);
		return objectPerReq;
	}
	
}
