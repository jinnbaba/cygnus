package com.cygnus.milkyway.serviceapi;

import org.fornax.cartridges.sculptor.framework.test.AbstractDbUnitJpaTests;
import static org.junit.Assert.fail;
import org.junit.Test;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Spring based transactional test with DbUnit support.
 */
public class PlanetServiceTest extends AbstractDbUnitJpaTests
    implements PlanetServiceTestBase {
    @Autowired
    protected PlanetService planetService;

    @Test
    public void testSayHello() throws Exception {
        // TODO Auto-generated method stub
        fail("testSayHello not implemented");
    }
}
