/*
 * generated by Xtext
 */
package org.xtext.example.iptables.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class IptablesExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return org.xtext.example.iptables.ui.internal.IptablesActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return org.xtext.example.iptables.ui.internal.IptablesActivator.getInstance().getInjector("org.xtext.example.iptables.Iptables");
	}
	
}