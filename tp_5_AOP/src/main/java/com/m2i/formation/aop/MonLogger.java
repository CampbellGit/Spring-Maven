package com.m2i.formation.aop;
import org.aspectj.lang.JoinPoint;

public class MonLogger {	
	/* Cette m�thode est appel�e � chaque fois (et avant) qu'une m�thode du
	 package com.m2i.formation.service est intercept�e
	 */
	public void logMethodEntry(JoinPoint joinPoint) {
		Object[] args = joinPoint.getArgs();
		
		// Nom de la m�thode intercept�e
		String name = joinPoint.getSignature().toLongString();
		StringBuffer sb = new StringBuffer(name + " appell� avec: [");
		
		// Liste des valeurs des arguments re�us par la m�thode
		for (int i = 0; i < args.length; i++) {
			Object o = args[i];
			sb.append("'" + o + "'");
			sb.append((i == args.length - 1) ? "" : ", ");
		}
		sb.append("]");
		System.out.println(sb);
	}
	/*public void logMethodExit(String msg) {

		System.out.println("Fini !");

	}*/

	
}