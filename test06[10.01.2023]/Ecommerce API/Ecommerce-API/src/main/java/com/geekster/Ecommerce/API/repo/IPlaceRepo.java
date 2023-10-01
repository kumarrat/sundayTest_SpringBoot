package com.geekster.Ecommerce.API.repo;

import com.geekster.Ecommerce.API.model.Place;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPlaceRepo extends JpaRepository<Place,Integer> {
}
