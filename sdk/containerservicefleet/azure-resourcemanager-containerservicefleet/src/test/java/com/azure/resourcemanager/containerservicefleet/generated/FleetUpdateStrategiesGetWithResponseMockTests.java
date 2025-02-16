// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservicefleet.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.containerservicefleet.ContainerServiceFleetManager;
import com.azure.resourcemanager.containerservicefleet.models.FleetUpdateStrategy;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class FleetUpdateStrategiesGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"provisioningState\":\"Succeeded\",\"strategy\":{\"stages\":[{\"name\":\"q\",\"groups\":[{\"name\":\"doamciodhkha\"},{\"name\":\"xkhnzbonlwnto\"},{\"name\":\"gokdwbwhks\"},{\"name\":\"zcmrvexztvb\"}],\"afterStageWaitInSeconds\":991988200},{\"name\":\"sfraoyzko\",\"groups\":[{\"name\":\"lmnguxaw\"},{\"name\":\"aldsy\"}],\"afterStageWaitInSeconds\":1439928585},{\"name\":\"imerqfobwyznk\",\"groups\":[{\"name\":\"utwpfhp\"},{\"name\":\"gmhrskdsnfdsdoak\"}],\"afterStageWaitInSeconds\":323713899},{\"name\":\"lmkk\",\"groups\":[{\"name\":\"dlhewp\"},{\"name\":\"sdsttwvog\"},{\"name\":\"bbejdcngqqm\"},{\"name\":\"akufgmjz\"}],\"afterStageWaitInSeconds\":1463483261}]}},\"eTag\":\"grtwae\",\"id\":\"uzkopbminrfd\",\"name\":\"oyuhhziui\",\"type\":\"fozbhdmsmlmzqhof\"}";

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

        FleetUpdateStrategy response =
            manager
                .fleetUpdateStrategies()
                .getWithResponse("dcpzfoqo", "i", "ybxarzgszu", com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals("q", response.strategy().stages().get(0).name());
        Assertions.assertEquals("doamciodhkha", response.strategy().stages().get(0).groups().get(0).name());
        Assertions.assertEquals(991988200, response.strategy().stages().get(0).afterStageWaitInSeconds());
    }
}
