package com.summoner.lolhaeduo.domain.gamedata.repository;

import com.summoner.lolhaeduo.domain.gamedata.entity.Champion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Set;

public interface ChampionRepository extends JpaRepository<Champion, Long> {
    @Query("SELECT c.id FROM Champion c")
    Set<String> findAllIds();
}
