/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question11;

import java.util.Objects;

/**
 * Vehicle class to illustrate hash code and equals
 *
 * @author Bala Shankar Malladi
 */
public class Vehicle {
    /**
     * Initializing the instance variables model and type of type String.
     */
    private String model;
    private String type;
    /**
     * Constructor with two argument parameters
     * @param model
     * @param type 
     */
    public Vehicle(String model, String type) {
        this.model = model;
        this.type = type;
    }
    /**
     * Getter method for model
     * @return 
     */
    public String getModel() {
        return model;
    }
    /**
     * Getter method for type
     * @return 
     */
    public String getType() {
        return type;
    }
    /**
     * Hashcode method is overriden and it returns the values based on vehicle type and model.
     * @return 
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.model);
        hash = 83 * hash + Objects.hashCode(this.type);
        return hash;
    }
   /**
    * Equals method is overridden to tell the compiler whether it contains the object or not
    * and if so it will check the model and type.
    * @param obj
    * @return 
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vehicle other = (Vehicle) obj;
        if (!Objects.equals(this.model, other.model)) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        return true;
    }
}
