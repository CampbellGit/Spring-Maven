package com.m2i.formation;

import org.apache.log4j.Logger;

public class HelloLog4J {
	private static final Logger logger = Logger.getLogger(HelloLog4J.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		if (logger.isTraceEnabled()) logger.trace("Test log trace : ");
		if (logger.isDebugEnabled()) logger.debug("Test log debug : ");
		if (logger.isInfoEnabled()) logger.info("Test log info : ");
		logger.warn("Test log warn :");
		logger.error("Test log error :");
		logger.fatal("Test log fatal :");

		
		try {
			if (logger.isInfoEnabled()) logger.info("Entrée méthode main : ");
			if (logger.isDebugEnabled()) logger.debug("Test log debug : ");
			if (logger.isInfoEnabled()) logger.info("Sortie méthode main : ");

		} catch (Exception e){
			logger.error("Erreur dans la méthode :" +e);
		}
	}

}
