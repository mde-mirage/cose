/*
* generated by Xtext
*/
package org.xtext.example.iptables;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class IptablesUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return org.xtext.example.iptables.ui.internal.IptablesActivator.getInstance().getInjector("org.xtext.example.iptables.Iptables");
	}
	
}
