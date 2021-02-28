
/**
 *  @author Sergio
 *  
 *   Este pacote armazena todas as entidades subclasses que serao invocadas 
 *   pelas entidades supers e utilizadas por aplicacoes externas.
 */
package mz.djm.via.fe.entity.subs;

import mz.djm.via.fe.entity.Criterio;

class Test{
	
	public static void main() {
		Criterio cr = new mz.djm.via.fe.entity.subs.Criterio01();
		
		cr.getValue();
		cr.getDescription();
	}
}
