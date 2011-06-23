package com.cygnus.milkyway.serviceimpl;

import org.fornax.cartridges.sculptor.framework.errorhandling.ServiceContext;

import org.springframework.stereotype.Service;

/**
 * Implementation of PlanetService.
 */
@Service("planetService")
public class PlanetServiceImpl extends PlanetServiceImplBase {
    public PlanetServiceImpl() {
    }

    public String sayHello(ServiceContext ctx, String planetName) {

        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("sayHello not implemented");

    }
}
