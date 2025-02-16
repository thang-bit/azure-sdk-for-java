// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.SapBwSource;

public final class SapBwSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SapBwSource model =
            BinaryData
                .fromString(
                    "{\"type\":\"SapBwSource\",\"query\":\"datajthmibqgld\",\"queryTimeout\":\"datatkalp\",\"additionalColumns\":\"datanny\",\"sourceRetryCount\":\"datajea\",\"sourceRetryWait\":\"datalewlwbxufq\",\"maxConcurrentConnections\":\"datakkvij\",\"disableMetricsCollection\":\"dataf\",\"\":{\"aqoaopzqpf\":\"datadzowdqvqfl\",\"ee\":\"datanjdyoxform\"}}")
                .toObject(SapBwSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SapBwSource model =
            new SapBwSource()
                .withSourceRetryCount("datajea")
                .withSourceRetryWait("datalewlwbxufq")
                .withMaxConcurrentConnections("datakkvij")
                .withDisableMetricsCollection("dataf")
                .withQueryTimeout("datatkalp")
                .withAdditionalColumns("datanny")
                .withQuery("datajthmibqgld");
        model = BinaryData.fromObject(model).toObject(SapBwSource.class);
    }
}
