package org.apache.cayenne.testdo.mixed_persistence_strategy.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;
import org.apache.cayenne.testdo.mixed_persistence_strategy.MixedPersistenceStrategy2;

/**
 * Class _MixedPersistenceStrategy was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _MixedPersistenceStrategy extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String ID_PK_COLUMN = "ID";

    public static final Property<String> DESCRIPTION = new Property<>("description");
    public static final Property<String> NAME = new Property<>("name");
    public static final Property<List<MixedPersistenceStrategy2>> DETAILS = new Property<>("details");

    public void setDescription(String description) {
        writeProperty("description", description);
    }
    public String getDescription() {
        return (String)readProperty("description");
    }

    public void setName(String name) {
        writeProperty("name", name);
    }
    public String getName() {
        return (String)readProperty("name");
    }

    public void addToDetails(MixedPersistenceStrategy2 obj) {
        addToManyTarget("details", obj, true);
    }
    public void removeFromDetails(MixedPersistenceStrategy2 obj) {
        removeToManyTarget("details", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<MixedPersistenceStrategy2> getDetails() {
        return (List<MixedPersistenceStrategy2>)readProperty("details");
    }


}
