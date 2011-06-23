package com.cygnus.milkyway.serviceapi;

import org.fornax.cartridges.sculptor.framework.errorhandling.ServiceContext;

/**
 * Generated interface for the Service PlanetService.
 */
public interface PlanetService {
    public static final String BEAN_ID = "planetService";

    public String sayHello(ServiceContext ctx, String planetName);
}
