// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservicefleet.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.containerservicefleet.ContainerServiceFleetManager;
import com.azure.resourcemanager.containerservicefleet.models.Fleet;
import com.azure.resourcemanager.containerservicefleet.models.ManagedServiceIdentityType;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class FleetsListByResourceGroupMockTests {
    @Test
    public void testListByResourceGroup() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"provisioningState\":\"Canceled\",\"hubProfile\":{\"dnsPrefix\":\"eemaofmxagkvtme\",\"apiServerAccessProfile\":{\"enablePrivateCluster\":false,\"enableVnetIntegration\":true,\"subnetId\":\"hvljuahaquh\"},\"agentProfile\":{\"subnetId\":\"mdua\",\"vmSize\":\"exq\"},\"fqdn\":\"fadmws\",\"kubernetesVersion\":\"r\",\"portalFqdn\":\"xpvgo\"}},\"eTag\":\"lf\",\"identity\":{\"principalId\":\"61ab43c2-58d9-4dd3-a491-1118ea52d937\",\"tenantId\":\"b9730ec9-bca9-4dac-8a72-7003e297e01b\",\"type\":\"None\",\"userAssignedIdentities\":{\"e\":{\"principalId\":\"453a29e8-d761-4925-b2bf-f8fbec0b1f84\",\"clientId\":\"49b761c0-bc58-426f-a2e0-8e4c80c068e5\"},\"wkz\":{\"principalId\":\"1007fd38-857f-4c71-8ef7-bec98e0454a9\",\"clientId\":\"c02bb178-a4ee-42c5-b839-e72a64fdd74f\"}}},\"location\":\"liourqhak\",\"tags\":{\"w\":\"ashsfwxos\",\"cjooxdjebwpucwwf\":\"xcug\",\"hzceuojgjrwjue\":\"ovbvmeueciv\"},\"id\":\"otwmcdyt\",\"name\":\"x\",\"type\":\"it\"}]}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        ContainerServiceFleetManager manager =
            ContainerServiceFleetManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<Fleet> response =
            manager.fleets().listByResourceGroup("ehhseyvjusrts", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("liourqhak", response.iterator().next().location());
        Assertions.assertEquals("ashsfwxos", response.iterator().next().tags().get("w"));
        Assertions.assertEquals(ManagedServiceIdentityType.NONE, response.iterator().next().identity().type());
        Assertions.assertEquals("eemaofmxagkvtme", response.iterator().next().hubProfile().dnsPrefix());
        Assertions
            .assertEquals(
                false, response.iterator().next().hubProfile().apiServerAccessProfile().enablePrivateCluster());
        Assertions
            .assertEquals(
                true, response.iterator().next().hubProfile().apiServerAccessProfile().enableVnetIntegration());
        Assertions
            .assertEquals("hvljuahaquh", response.iterator().next().hubProfile().apiServerAccessProfile().subnetId());
        Assertions.assertEquals("mdua", response.iterator().next().hubProfile().agentProfile().subnetId());
        Assertions.assertEquals("exq", response.iterator().next().hubProfile().agentProfile().vmSize());
    }
}
