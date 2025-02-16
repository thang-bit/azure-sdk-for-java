// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureResourceProtectionIntent;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupManagementType;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectionStatus;
import org.junit.jupiter.api.Assertions;

public final class AzureResourceProtectionIntentTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureResourceProtectionIntent model =
            BinaryData
                .fromString(
                    "{\"protectionIntentItemType\":\"AzureResourceItem\",\"friendlyName\":\"dbwdpyqyybxubmdn\",\"backupManagementType\":\"DPM\",\"sourceResourceId\":\"qwremjel\",\"itemId\":\"acigel\",\"policyId\":\"hdbvqvwzkjop\",\"protectionState\":\"NotProtected\"}")
                .toObject(AzureResourceProtectionIntent.class);
        Assertions.assertEquals(BackupManagementType.DPM, model.backupManagementType());
        Assertions.assertEquals("qwremjel", model.sourceResourceId());
        Assertions.assertEquals("acigel", model.itemId());
        Assertions.assertEquals("hdbvqvwzkjop", model.policyId());
        Assertions.assertEquals(ProtectionStatus.NOT_PROTECTED, model.protectionState());
        Assertions.assertEquals("dbwdpyqyybxubmdn", model.friendlyName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureResourceProtectionIntent model =
            new AzureResourceProtectionIntent()
                .withBackupManagementType(BackupManagementType.DPM)
                .withSourceResourceId("qwremjel")
                .withItemId("acigel")
                .withPolicyId("hdbvqvwzkjop")
                .withProtectionState(ProtectionStatus.NOT_PROTECTED)
                .withFriendlyName("dbwdpyqyybxubmdn");
        model = BinaryData.fromObject(model).toObject(AzureResourceProtectionIntent.class);
        Assertions.assertEquals(BackupManagementType.DPM, model.backupManagementType());
        Assertions.assertEquals("qwremjel", model.sourceResourceId());
        Assertions.assertEquals("acigel", model.itemId());
        Assertions.assertEquals("hdbvqvwzkjop", model.policyId());
        Assertions.assertEquals(ProtectionStatus.NOT_PROTECTED, model.protectionState());
        Assertions.assertEquals("dbwdpyqyybxubmdn", model.friendlyName());
    }
}
