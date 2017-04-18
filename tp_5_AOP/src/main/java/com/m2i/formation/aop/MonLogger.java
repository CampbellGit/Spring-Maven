package com.m2i.formation.aop;
import org.aspectj.lang.JoinPoint;

public class MonLogger {	
	/* Cette méthode est appelée à chaque fois (et avant) qu'une méthode du
	 package com.m2i.formation.service est interceptée
	 */
	public void logMethodEntry(JoinPoint joinPoint) {
		Object[] args = joinPoint.getArgs();
		
		// Nom de la méthode interceptée
		String name = joinPoint.getSignature().toLongString();
		StringBuffer sb = new StringBuffer(name + " appellé avec: [");
		
		// Liste des valeurs des arguments reçus par la méthode
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