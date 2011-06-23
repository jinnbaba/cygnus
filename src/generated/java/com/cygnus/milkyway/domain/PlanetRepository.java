package com.cygnus.milkyway.domain;

import java.util.List;

/**
 * Generated interface for Repository for Planet
 */
public interface PlanetRepository {
    public static final String BEAN_ID = "planetRepository";

    public List<Planet> findByExample(Planet example);
}
