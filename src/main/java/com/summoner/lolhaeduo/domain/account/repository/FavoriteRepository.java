package com.summoner.lolhaeduo.domain.account.repository;

import com.summoner.lolhaeduo.domain.account.entity.Favorite;
import com.summoner.lolhaeduo.domain.duo.enums.QueueType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FavoriteRepository extends JpaRepository<Favorite, Long> {
    List<Favorite> findTop3ByAccountIdAndQueueTypeOrderByPlayCountDesc(Long id, QueueType queueType);
    Favorite findByAccountIdAndQueueTypeAndChampionName(Long accountId, QueueType queueType, String championName);
}
