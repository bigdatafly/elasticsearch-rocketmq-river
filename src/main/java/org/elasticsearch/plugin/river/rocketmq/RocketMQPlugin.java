/**
 * 
 */
package org.elasticsearch.plugin.river.rocketmq;

import java.util.Collection;

import org.elasticsearch.common.component.LifecycleComponent;
import org.elasticsearch.common.inject.Module;
import org.elasticsearch.plugins.AbstractPlugin;

/**
 * @author zhuxh
 *
 */
public class RocketMQPlugin extends AbstractPlugin{

	/**
	 * 
	 */
	public RocketMQPlugin() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Module> nodeModules() {
		// TODO Auto-generated method stub
		return super.nodeModules();
	}

	@Override
	public Collection<Class<? extends LifecycleComponent>> nodeServices() {
		// TODO Auto-generated method stub
		return super.nodeServices();
	}

	
}
