package com.homepage.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.homepage.api.models.Home;

public interface  HomeRepository extends JpaRepository<Home, Integer>

{



}
