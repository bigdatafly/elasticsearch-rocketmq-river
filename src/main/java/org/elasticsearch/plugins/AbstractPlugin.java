/**
 * 
 */
package org.elasticsearch.plugins;

import java.io.Closeable;
import java.util.Collection;

import org.elasticsearch.common.component.LifecycleComponent;
import org.elasticsearch.common.inject.Module;
import org.elasticsearch.common.settings.Settings;

/**
 * @author summer
 *
 */
public abstract class AbstractPlugin extends Plugin{

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

	@Override
	public Collection<Module> indexModules(Settings indexSettings) {
		// TODO Auto-generated method stub
		return super.indexModules(indexSettings);
	}

	@Override
	public Collection<Class<? extends Closeable>> indexServices() {
		// TODO Auto-generated method stub
		return super.indexServices();
	}

	@Override
	public Collection<Module> shardModules(Settings indexSettings) {
		// TODO Auto-generated method stub
		return super.shardModules(indexSettings);
	}

	@Override
	public Collection<Class<? extends Closeable>> shardServices() {
		// TODO Auto-generated method stub
		return super.shardServices();
	}

	@Override
	public Settings additionalSettings() {
		// TODO Auto-generated method stub
		return super.additionalSettings();
	}


	
}
