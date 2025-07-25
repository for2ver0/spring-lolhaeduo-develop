package com.summoner.lolhaeduo.client.dto.api;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class MatchResponse {
    private final MetadataResponse metadata;
    private final InfoResponse info;
}
