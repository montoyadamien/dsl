/*
 * generated by Xtext 2.14.0
 */
package polytech.dsl.spaceteam.spaml.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import polytech.dsl.spaceteam.spaml.SpamlRuntimeModule
import polytech.dsl.spaceteam.spaml.SpamlStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class SpamlIdeSetup extends SpamlStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new SpamlRuntimeModule, new SpamlIdeModule))
	}
	
}