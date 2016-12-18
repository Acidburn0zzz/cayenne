package org.apache.cayenne.testdo.inheritance_people.auto;

import java.util.List;

import org.apache.cayenne.exp.Property;
import org.apache.cayenne.testdo.inheritance_people.AbstractPerson;
import org.apache.cayenne.testdo.inheritance_people.Address;
import org.apache.cayenne.testdo.inheritance_people.Department;

/**
 * Class _Employee was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Employee extends AbstractPerson {

    private static final long serialVersionUID = 1L; 

    public static final String PERSON_ID_PK_COLUMN = "PERSON_ID";

    public static final Property<Float> SALARY = new Property<>("salary");
    public static final Property<List<Address>> ADDRESSES = new Property<>("addresses");
    public static final Property<Department> TO_DEPARTMENT = new Property<>("toDepartment");

    public void setSalary(Float salary) {
        writeProperty("salary", salary);
    }
    public Float getSalary() {
        return (Float)readProperty("salary");
    }

    public void addToAddresses(Address obj) {
        addToManyTarget("addresses", obj, true);
    }
    public void removeFromAddresses(Address obj) {
        removeToManyTarget("addresses", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Address> getAddresses() {
        return (List<Address>)readProperty("addresses");
    }


    public void setToDepartment(Department toDepartment) {
        setToOneTarget("toDepartment", toDepartment, true);
    }

    public Department getToDepartment() {
        return (Department)readProperty("toDepartment");
    }


}
