package com.example.backend.Repository;

import com.example.backend.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer> {
}
