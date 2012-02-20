/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package springidol;

/**
 *
 * @author Mateusz Lubański <m.lubanskii@gmail.com>
 */
public class City {
    private String name;
    private String state;
    private int population;
    
    
    City city;
    String propertyString;

    public City() {
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getPropertyString() {
        return propertyString;
    }

    public void setPropertyString(String propertyString) {
        this.propertyString = propertyString;
    }
    
    @Override
    public String toString() {
        return "City{" + "name=" + city.name + ", state=" + city.state + ", population=" + city.population + ", propertyString=" + propertyString + "}";
    }
}
