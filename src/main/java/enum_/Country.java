package enum_;

import continent.Continent;

public class Country {
    public String name;
    public Integer area;
    public String capital;
    public Continent continent;


    public Country(String name, Integer area, String capital, Continent continent) {
        this.area = area;
        this.name = name;
        this.capital = capital;
        this.continent = continent;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }

}