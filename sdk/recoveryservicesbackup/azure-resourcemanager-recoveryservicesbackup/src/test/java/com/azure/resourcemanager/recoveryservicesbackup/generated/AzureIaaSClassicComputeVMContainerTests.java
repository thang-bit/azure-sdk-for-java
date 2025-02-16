// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureIaaSClassicComputeVMContainer;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupManagementType;
import org.junit.jupiter.api.Assertions;

public final class AzureIaaSClassicComputeVMContainerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureIaaSClassicComputeVMContainer model =
            BinaryData
                .fromString(
                    "{\"containerType\":\"Microsoft.ClassicCompute/virtualMachines\",\"virtualMachineId\":\"oucs\",\"virtualMachineVersion\":\"ldpuviy\",\"resourceGroup\":\"aabeolhbhlvbmxuq\",\"friendlyName\":\"s\",\"backupManagementType\":\"AzureStorage\",\"registrationStatus\":\"udfbsfarf\",\"healthStatus\":\"owlkjxnqpv\",\"protectableObjectType\":\"fstmhqykizmdksao\"}")
                .toObject(AzureIaaSClassicComputeVMContainer.class);
        Assertions.assertEquals("s", model.friendlyName());
        Assertions.assertEquals(BackupManagementType.AZURE_STORAGE, model.backupManagementType());
        Assertions.assertEquals("udfbsfarf", model.registrationStatus());
        Assertions.assertEquals("owlkjxnqpv", model.healthStatus());
        Assertions.assertEquals("fstmhqykizmdksao", model.protectableObjectType());
        Assertions.assertEquals("oucs", model.virtualMachineId());
        Assertions.assertEquals("ldpuviy", model.virtualMachineVersion());
        Assertions.assertEquals("aabeolhbhlvbmxuq", model.resourceGroup());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureIaaSClassicComputeVMContainer model =
            new AzureIaaSClassicComputeVMContainer()
                .withFriendlyName("s")
                .withBackupManagementType(BackupManagementType.AZURE_STORAGE)
                .withRegistrationStatus("udfbsfarf")
                .withHealthStatus("owlkjxnqpv")
                .withProtectableObjectType("fstmhqykizmdksao")
                .withVirtualMachineId("oucs")
                .withVirtualMachineVersion("ldpuviy")
                .withResourceGroup("aabeolhbhlvbmxuq");
        model = BinaryData.fromObject(model).toObject(AzureIaaSClassicComputeVMContainer.class);
        Assertions.assertEquals("s", model.friendlyName());
        Assertions.assertEquals(BackupManagementType.AZURE_STORAGE, model.backupManagementType());
        Assertions.assertEquals("udfbsfarf", model.registrationStatus());
        Assertions.assertEquals("owlkjxnqpv", model.healthStatus());
        Assertions.assertEquals("fstmhqykizmdksao", model.protectableObjectType());
        Assertions.assertEquals("oucs", model.virtualMachineId());
        Assertions.assertEquals("ldpuviy", model.virtualMachineVersion());
        Assertions.assertEquals("aabeolhbhlvbmxuq", model.resourceGroup());
    }
}
