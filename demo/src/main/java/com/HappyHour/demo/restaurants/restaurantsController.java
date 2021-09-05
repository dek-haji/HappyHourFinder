package com.HappyHour.demo.restaurants;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping(path = "api/restaurants")
public class restaurantsController {

    @GetMapping
    public List<restaurants> getRestaurants() {
        ArrayList<restaurants> restaurantList = new ArrayList<restaurants>();
        restaurants restaurants = new restaurants(1, "Babylon", "Nashville", "Free coffee");
        restaurantList.add(restaurants);
        return restaurantList;
    }



    @PostMapping(path = "restaurants",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<restaurants> createRestaurant(@RequestBody restaurants newRestaurant){
    restaurants restaurants = userServices.save(newRestaurant);
    if(restaurants == null)
    {
        throw new ServerException();
    } else {
        return new ResponseEntity<>(restaurants, HttpStatus.CREATED);
    }
    }


}
