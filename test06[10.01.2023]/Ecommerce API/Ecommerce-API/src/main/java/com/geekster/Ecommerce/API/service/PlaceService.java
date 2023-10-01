package com.geekster.Ecommerce.API.service;

import com.geekster.Ecommerce.API.model.Address;
import com.geekster.Ecommerce.API.model.Place;
import com.geekster.Ecommerce.API.repo.IPlaceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaceService {

    @Autowired
    static IPlaceRepo placeRepo;
    public static String savePlace(Place newPlace) {
        placeRepo.save(newPlace);
        return "place added";
    }

    public List<Place> getPlace() {
        return placeRepo.findAll();
    }


    public Address getAddressByPlaceId(Integer placeId) {
        Place place = placeRepo.findById(placeId).orElseThrow();

        return place.getAddress();
    }
}
