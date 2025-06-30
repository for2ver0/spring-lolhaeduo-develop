package com.summoner.lolhaeduo.domain.gamedata.repository;

import com.summoner.lolhaeduo.domain.gamedata.entity.Version;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface VersionRepository extends JpaRepository<Version, Long> {

    @Query("SELECT v FROM Version v ORDER BY v.id DESC")
    Version findLatestVersion();
}
