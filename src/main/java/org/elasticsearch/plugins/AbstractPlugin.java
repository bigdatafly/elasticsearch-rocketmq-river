/**
 * 
 */
package org.elasticsearch.plugins;

import java.io.Closeable;
import java.util.Collection;

import org.elasticsearch.common.component.LifecycleComponent;
import org.elasticsearch.common.inject.Module;
import org.elasticsearch.common.settings.Settings;

import com.google.common.collect.ImmutableList;


/**
 * @author summer
 *
 */
public abstract class AbstractPlugin{

	@Override
	public Collection<Module> nodeModules() {
		
		 return ImmutableList.of();
	}

	@Override
	public Collection<Class<? extends LifecycleComponent>> nodeServices() {
		
		return ImmutableList.of();
	}

	@Override
	public Collection<Module> indexModules(Settings indexSettings) {
		
		return ImmutableList.of();
	}

	@Override
	public Collection<Class<? extends Closeable>> indexServices() {
		
		return ImmutableList.of();
	}

	@Override
	public Collection<Module> shardModules(Settings indexSettings) {
		return ImmutableList.of();
				
	}

	@Override
	public Collection<Class<? extends Closeable>> shardServices() {
		return ImmutableList.of();
	}

	@Override
	public Settings additionalSettings() {
		
		 return Settings.Builder.EMPTY_SETTINGS;
	}


	
}
