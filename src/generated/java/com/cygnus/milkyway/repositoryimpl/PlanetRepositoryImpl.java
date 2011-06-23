package com.cygnus.milkyway.repositoryimpl;

import org.fornax.cartridges.sculptor.framework.accessapi.FindByExampleAccess;
import org.fornax.cartridges.sculptor.framework.accessimpl.jpahibernate.JpaHibFindByExampleAccessImpl;

import org.springframework.orm.jpa.support.JpaDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.cygnus.milkyway.domain.Planet;
import com.cygnus.milkyway.domain.PlanetRepository;

/**
 * Repository implementation for Planet
 */
@Repository("planetRepository")
public class PlanetRepositoryImpl extends JpaDaoSupport
    implements PlanetRepository {
    private EntityManager entityManager;

    public PlanetRepositoryImpl() {
    }

    /**
     * Delegates to {@link org.fornax.cartridges.sculptor.framework.accessapi.FindByExampleAccess}
     */
    public List<Planet> findByExample(Planet example) {
        FindByExampleAccess<Planet> ao = createFindByExampleAccess();

        ao.setExample(example);

        ao.execute();

        return ao.getResult();

    }

    /**
     * Dependency injection
     */
    @PersistenceContext(unitName = "UniverseEntityManagerFactory")
    protected void setEntityManagerDependency(EntityManager entityManager) {
        this.entityManager = entityManager;
        // for JpaDaoSupport, JpaTemplate
        setEntityManager(entityManager);
    }

    protected EntityManager getEntityManager() {
        return entityManager;
    }

    protected FindByExampleAccess<Planet> createFindByExampleAccess() {
        JpaHibFindByExampleAccessImpl<Planet> ao =
            new JpaHibFindByExampleAccessImpl<Planet>(getPersistentClass());

        ao.setEntityManager(getEntityManager());

        return ao;
    }

    protected Class<Planet> getPersistentClass() {
        return Planet.class;
    }
}
