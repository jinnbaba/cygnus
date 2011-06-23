package com.cygnus.milkyway.domain;

import org.fornax.cartridges.sculptor.framework.domain.LeafProperty;
import org.fornax.cartridges.sculptor.framework.domain.PropertiesCollection;
import org.fornax.cartridges.sculptor.framework.domain.Property;

/**
 * This generated interface defines property names for all
 * attributes and associatations in
 * {@link com.cygnus.milkyway.domain.Planet}.
 * <p>
 * These properties are useful when building
 * criteria with {@link org.fornax.cartridges.sculptor.framework.accessapi.ConditionalCriteriaBuilder},
 * which can be used with findByCondition Repository operation.
 */
public class PlanetProperties {
    private static final PlanetPropertiesImpl<Planet> sharedInstance =
        new PlanetPropertiesImpl<Planet>(Planet.class);

    private PlanetProperties() {
    }

    public static Property<Planet> id() {
        return sharedInstance.id();
    }

    public static Property<Planet> name() {
        return sharedInstance.name();
    }

    public static Property<Planet> message() {
        return sharedInstance.message();
    }

    public static Property<Planet> createdDate() {
        return sharedInstance.createdDate();
    }

    public static Property<Planet> createdBy() {
        return sharedInstance.createdBy();
    }

    public static Property<Planet> lastUpdated() {
        return sharedInstance.lastUpdated();
    }

    public static Property<Planet> lastUpdatedBy() {
        return sharedInstance.lastUpdatedBy();
    }

    public static Property<Planet> version() {
        return sharedInstance.version();
    }

    /**
     * This class is used for references to {@link com.cygnus.milkyway.domain.Planet},
     * i.e. nested property.
     */
    public static class PlanetProperty<T> extends PlanetPropertiesImpl<T>
        implements Property<T> {
        private static final long serialVersionUID = 1L;

        public PlanetProperty(String parentPath, String additionalPath,
            Class<T> owningClass) {
            super(parentPath, additionalPath, owningClass);
        }
    }

    protected static class PlanetPropertiesImpl<T> extends PropertiesCollection {
        private static final long serialVersionUID = 1L;
        Class<T> owningClass;

        PlanetPropertiesImpl(Class<T> owningClass) {
            super(null);
            this.owningClass = owningClass;
        }

        PlanetPropertiesImpl(String parentPath, String additionalPath,
            Class<T> owningClass) {
            super(parentPath, additionalPath);
            this.owningClass = owningClass;
        }

        public Property<T> id() {
            return new LeafProperty<T>(getParentPath(), "id", false, owningClass);
        }

        public Property<T> name() {
            return new LeafProperty<T>(getParentPath(), "name", false,
                owningClass);
        }

        public Property<T> message() {
            return new LeafProperty<T>(getParentPath(), "message", false,
                owningClass);
        }

        public Property<T> createdDate() {
            return new LeafProperty<T>(getParentPath(), "createdDate", false,
                owningClass);
        }

        public Property<T> createdBy() {
            return new LeafProperty<T>(getParentPath(), "createdBy", false,
                owningClass);
        }

        public Property<T> lastUpdated() {
            return new LeafProperty<T>(getParentPath(), "lastUpdated", false,
                owningClass);
        }

        public Property<T> lastUpdatedBy() {
            return new LeafProperty<T>(getParentPath(), "lastUpdatedBy", false,
                owningClass);
        }

        public Property<T> version() {
            return new LeafProperty<T>(getParentPath(), "version", false,
                owningClass);
        }
    }
}
