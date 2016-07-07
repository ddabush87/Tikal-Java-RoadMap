package com.tikal.course.java;

import com.tikal.course.java.model.vehicles.*;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Haim.Turkel on 11/12/2015.
 */
public class TestCars {

    @Test
    public void car(){
        Car economy = new EconomyCar(1970, EngineType.medium, Color.red);
        Assert.assertEquals("EconomyCar{color=red}Car{engineType=medium}Vehicle{year=1970}",economy.toString());

        economy.drive();
        Car family = new FamilyCar(1990,EngineType.small,4);
        Assert.assertEquals("FamilyCar{doorCount=4}", family.toString());
        family.drive();
        Vehicle motorcycle = new Motorcycle(2000,MotorcycleType.Scooter);
        Assert.assertEquals("Motorcycle{motorcycleType=Scooter}Vehicle{year=2000}", motorcycle.toString());
        motorcycle.drive();

    }
}
