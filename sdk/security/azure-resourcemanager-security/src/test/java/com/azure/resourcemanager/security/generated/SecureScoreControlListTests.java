// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.SecureScoreControlList;

public final class SecureScoreControlListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SecureScoreControlList model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"displayName\":\"ttgplucfotangcf\",\"healthyResourceCount\":1254839089,\"unhealthyResourceCount\":1077682035,\"notApplicableResourceCount\":809427492,\"weight\":4429427229457258180},\"id\":\"wlmzqwmvtxnjmxmc\",\"name\":\"qudtcvclx\",\"type\":\"npdkv\"},{\"properties\":{\"displayName\":\"buiyji\",\"healthyResourceCount\":874901455,\"unhealthyResourceCount\":203185987,\"notApplicableResourceCount\":1296462428,\"weight\":7170232891344779001},\"id\":\"n\",\"name\":\"gox\",\"type\":\"jiuqhibtozi\"},{\"properties\":{\"displayName\":\"jedmurrxxgewp\",\"healthyResourceCount\":1212082891,\"unhealthyResourceCount\":538601125,\"notApplicableResourceCount\":1264888765,\"weight\":1955127853962585170},\"id\":\"yhlfb\",\"name\":\"gwgcl\",\"type\":\"xoe\"},{\"properties\":{\"displayName\":\"njipnwjfujql\",\"healthyResourceCount\":1462565656,\"unhealthyResourceCount\":1454671377,\"notApplicableResourceCount\":295372470,\"weight\":5131304404617914310},\"id\":\"o\",\"name\":\"yjwpfilkmkkh\",\"type\":\"l\"}],\"nextLink\":\"ndviauogphuartvt\"}")
                .toObject(SecureScoreControlList.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SecureScoreControlList model = new SecureScoreControlList();
        model = BinaryData.fromObject(model).toObject(SecureScoreControlList.class);
    }
}
