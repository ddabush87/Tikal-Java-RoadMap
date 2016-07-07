package com.tikal.course.java.dao;

import com.tikal.course.java.model.customers.Person;
import com.tikal.course.java.model.vehicles.Color;
import com.tikal.course.java.model.vehicles.Vehicle;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Haim.Turkel on 1/15/2016.
 */
public interface VehicleRepository extends CrudRepository<Vehicle,Integer> {
    List<Vehicle> getByColor(Color color);
}
