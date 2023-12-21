package io.abhinav.Pockemon;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Pockemon")
public class Pockemon {

    @Id
    private String name;
    @Column
    private int power;
    @Column
    private String type;
    @Column
    private String colour;

    // Constructors, getters, setters, etc.

    @Override
    public String toString() {
        return "Pockemon{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", type='" + type + '\'' +
                '}';
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
}
