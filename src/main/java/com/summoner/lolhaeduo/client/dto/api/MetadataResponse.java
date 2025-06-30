package com.summoner.lolhaeduo.client.dto.api;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Getter
@RequiredArgsConstructor
public class MetadataResponse {
    private final String dataVersion;
    private final String matchId;
    private final List<String> participants;
}
