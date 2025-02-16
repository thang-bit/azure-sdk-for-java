// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridnetwork.models.CustomProfile;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class CustomProfileTests {
    @Test
    public void testDeserialize() {
        CustomProfile model =
            BinaryData.fromString("{\"metadataConfigurationPath\":\"gwdkcglhsl\"}").toObject(CustomProfile.class);
        Assertions.assertEquals("gwdkcglhsl", model.metadataConfigurationPath());
    }

    @Test
    public void testSerialize() {
        CustomProfile model = new CustomProfile().withMetadataConfigurationPath("gwdkcglhsl");
        model = BinaryData.fromObject(model).toObject(CustomProfile.class);
        Assertions.assertEquals("gwdkcglhsl", model.metadataConfigurationPath());
    }
}
