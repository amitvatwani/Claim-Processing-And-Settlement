package com.bfs.claimservice.service;


import com.bfs.claimservice.dto.TrackingClaimDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "TRACKING-SERVICE")
public interface TrackingClaimApiClient {
    @PostMapping("api/tracking/new-track")
TrackingClaimDto createNewTrackClaim(TrackingClaimDto trackingClaimDto);
    @GetMapping("api/tracking/track-status/{trackId}")
String checkTracking(Long trackId);
    @PutMapping("api/tracking/update-track/{claimId}")
    String updateTracking(@PathVariable String claimId, @RequestParam String status);
}
