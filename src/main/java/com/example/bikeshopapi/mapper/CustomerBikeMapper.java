package com.example.bikeshopapi.mapper;

import com.example.bikeshopapi.controller.resources.CustomerBikeResource;
import com.example.bikeshopapi.entity.CustomerBike;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CustomerBikeMapper {

    public CustomerBikeMapper CUSTOMER_BIKE_MAPPER = Mappers.getMapper(CustomerBikeMapper.class);

    @Mapping(source = "owner.name", target = "ownerName")
    @Mapping(source = "bikeShop.name", target = "bikeShopName")
    CustomerBike fromCustomerBikeResource(CustomerBikeResource resource);

    @Mapping(source = "ownerName", target = "owner.name")
    @Mapping(source = "bikeShopName", target = "bikeShop.name")
    CustomerBikeResource toCustomerBikeResource(CustomerBike customerBike);

    List<CustomerBikeResource> toCustomerBikeResources(List<CustomerBike> customerBikes);

}