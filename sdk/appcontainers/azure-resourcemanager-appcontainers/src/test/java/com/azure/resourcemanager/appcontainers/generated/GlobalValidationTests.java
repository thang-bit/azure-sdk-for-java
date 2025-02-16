// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.GlobalValidation;
import com.azure.resourcemanager.appcontainers.models.UnauthenticatedClientActionV2;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class GlobalValidationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GlobalValidation model =
            BinaryData
                .fromString(
                    "{\"unauthenticatedClientAction\":\"Return401\",\"redirectToProvider\":\"yhxhu\",\"excludedPaths\":[\"ftyxolniw\"]}")
                .toObject(GlobalValidation.class);
        Assertions.assertEquals(UnauthenticatedClientActionV2.RETURN401, model.unauthenticatedClientAction());
        Assertions.assertEquals("yhxhu", model.redirectToProvider());
        Assertions.assertEquals("ftyxolniw", model.excludedPaths().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GlobalValidation model =
            new GlobalValidation()
                .withUnauthenticatedClientAction(UnauthenticatedClientActionV2.RETURN401)
                .withRedirectToProvider("yhxhu")
                .withExcludedPaths(Arrays.asList("ftyxolniw"));
        model = BinaryData.fromObject(model).toObject(GlobalValidation.class);
        Assertions.assertEquals(UnauthenticatedClientActionV2.RETURN401, model.unauthenticatedClientAction());
        Assertions.assertEquals("yhxhu", model.redirectToProvider());
        Assertions.assertEquals("ftyxolniw", model.excludedPaths().get(0));
    }
}
