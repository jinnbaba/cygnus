package com.cygnus.milkyway.serviceimpl;

import org.fornax.cartridges.sculptor.framework.errorhandling.ServiceContext;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import com.cygnus.milkyway.domain.Planet;
import com.cygnus.milkyway.domain.PlanetRepository;
import com.cygnus.milkyway.serviceapi.PlanetService;

/**
 * Generated base class for implementation of PlanetService.
 * <p>Make sure that subclass defines the following annotations:
 * <pre>

@org.springframework.stereotype.Service("planetService")

 * </pre>
 *
 */
public abstract class PlanetServiceImplBase implements PlanetService {
    @Autowired
    private PlanetRepository planetRepository;

    public PlanetServiceImplBase() {
    }

    protected PlanetRepository getPlanetRepository() {
        return planetRepository;
    }

    /**
     * Delegates to {@link com.cygnus.milkyway.domain.PlanetRepository#findByExample}
     */
    protected List<Planet> findByExample(ServiceContext ctx, Planet example) {
        return planetRepository.findByExample(example);

    }
}
