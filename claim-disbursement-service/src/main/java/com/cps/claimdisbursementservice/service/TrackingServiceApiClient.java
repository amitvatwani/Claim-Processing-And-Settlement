package com.cps.claimdisbursementservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "TRACKING-SERVICE")
public interface TrackingServiceApiClient {
    @PutMapping("api/tracking/update-track/{claimId}")
    String updateTracking(@PathVariable String claimId, @RequestParam String status);
}
