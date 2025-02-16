// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.cdn.fluent.models.CheckEndpointNameAvailabilityOutputInner;
import com.azure.resourcemanager.cdn.fluent.models.CheckNameAvailabilityOutputInner;
import com.azure.resourcemanager.cdn.fluent.models.ValidateProbeOutputInner;
import com.azure.resourcemanager.cdn.models.CheckEndpointNameAvailabilityInput;
import com.azure.resourcemanager.cdn.models.CheckNameAvailabilityInput;
import com.azure.resourcemanager.cdn.models.ValidateProbeInput;
import java.time.Duration;
import reactor.core.publisher.Mono;

/** The interface for CdnManagementClient class. */
public interface CdnManagementClient {
    /**
     * Gets Azure Subscription ID.
     *
     * @return the subscriptionId value.
     */
    String getSubscriptionId();

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    String getEndpoint();

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    String getApiVersion();

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    HttpPipeline getHttpPipeline();

    /**
     * Gets The default poll interval for long-running operation.
     *
     * @return the defaultPollInterval value.
     */
    Duration getDefaultPollInterval();

    /**
     * Gets the AfdProfilesClient object to access its operations.
     *
     * @return the AfdProfilesClient object.
     */
    AfdProfilesClient getAfdProfiles();

    /**
     * Gets the AfdCustomDomainsClient object to access its operations.
     *
     * @return the AfdCustomDomainsClient object.
     */
    AfdCustomDomainsClient getAfdCustomDomains();

    /**
     * Gets the AfdEndpointsClient object to access its operations.
     *
     * @return the AfdEndpointsClient object.
     */
    AfdEndpointsClient getAfdEndpoints();

    /**
     * Gets the AfdOriginGroupsClient object to access its operations.
     *
     * @return the AfdOriginGroupsClient object.
     */
    AfdOriginGroupsClient getAfdOriginGroups();

    /**
     * Gets the AfdOriginsClient object to access its operations.
     *
     * @return the AfdOriginsClient object.
     */
    AfdOriginsClient getAfdOrigins();

    /**
     * Gets the RoutesClient object to access its operations.
     *
     * @return the RoutesClient object.
     */
    RoutesClient getRoutes();

    /**
     * Gets the RuleSetsClient object to access its operations.
     *
     * @return the RuleSetsClient object.
     */
    RuleSetsClient getRuleSets();

    /**
     * Gets the RulesClient object to access its operations.
     *
     * @return the RulesClient object.
     */
    RulesClient getRules();

    /**
     * Gets the SecurityPoliciesClient object to access its operations.
     *
     * @return the SecurityPoliciesClient object.
     */
    SecurityPoliciesClient getSecurityPolicies();

    /**
     * Gets the SecretsClient object to access its operations.
     *
     * @return the SecretsClient object.
     */
    SecretsClient getSecrets();

    /**
     * Gets the LogAnalyticsClient object to access its operations.
     *
     * @return the LogAnalyticsClient object.
     */
    LogAnalyticsClient getLogAnalytics();

    /**
     * Gets the ProfilesClient object to access its operations.
     *
     * @return the ProfilesClient object.
     */
    ProfilesClient getProfiles();

    /**
     * Gets the EndpointsClient object to access its operations.
     *
     * @return the EndpointsClient object.
     */
    EndpointsClient getEndpoints();

    /**
     * Gets the OriginsClient object to access its operations.
     *
     * @return the OriginsClient object.
     */
    OriginsClient getOrigins();

    /**
     * Gets the OriginGroupsClient object to access its operations.
     *
     * @return the OriginGroupsClient object.
     */
    OriginGroupsClient getOriginGroups();

    /**
     * Gets the CustomDomainsClient object to access its operations.
     *
     * @return the CustomDomainsClient object.
     */
    CustomDomainsClient getCustomDomains();

    /**
     * Gets the ResourceUsagesClient object to access its operations.
     *
     * @return the ResourceUsagesClient object.
     */
    ResourceUsagesClient getResourceUsages();

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the EdgeNodesClient object to access its operations.
     *
     * @return the EdgeNodesClient object.
     */
    EdgeNodesClient getEdgeNodes();

    /**
     * Gets the PoliciesClient object to access its operations.
     *
     * @return the PoliciesClient object.
     */
    PoliciesClient getPolicies();

    /**
     * Gets the ManagedRuleSetsClient object to access its operations.
     *
     * @return the ManagedRuleSetsClient object.
     */
    ManagedRuleSetsClient getManagedRuleSets();

    /**
     * Check the availability of a resource name. This is needed for resources where name is globally unique, such as a
     * afdx endpoint.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param checkEndpointNameAvailabilityInput Input to check.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of check name availability API along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<CheckEndpointNameAvailabilityOutputInner>> checkEndpointNameAvailabilityWithResponseAsync(
        String resourceGroupName, CheckEndpointNameAvailabilityInput checkEndpointNameAvailabilityInput);

    /**
     * Check the availability of a resource name. This is needed for resources where name is globally unique, such as a
     * afdx endpoint.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param checkEndpointNameAvailabilityInput Input to check.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of check name availability API on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<CheckEndpointNameAvailabilityOutputInner> checkEndpointNameAvailabilityAsync(
        String resourceGroupName, CheckEndpointNameAvailabilityInput checkEndpointNameAvailabilityInput);

    /**
     * Check the availability of a resource name. This is needed for resources where name is globally unique, such as a
     * afdx endpoint.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param checkEndpointNameAvailabilityInput Input to check.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of check name availability API along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CheckEndpointNameAvailabilityOutputInner> checkEndpointNameAvailabilityWithResponse(
        String resourceGroupName,
        CheckEndpointNameAvailabilityInput checkEndpointNameAvailabilityInput,
        Context context);

    /**
     * Check the availability of a resource name. This is needed for resources where name is globally unique, such as a
     * afdx endpoint.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param checkEndpointNameAvailabilityInput Input to check.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of check name availability API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CheckEndpointNameAvailabilityOutputInner checkEndpointNameAvailability(
        String resourceGroupName, CheckEndpointNameAvailabilityInput checkEndpointNameAvailabilityInput);

    /**
     * Check the availability of a resource name. This is needed for resources where name is globally unique, such as a
     * CDN endpoint.
     *
     * @param checkNameAvailabilityInput Input to check.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of check name availability API along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<CheckNameAvailabilityOutputInner>> checkNameAvailabilityWithResponseAsync(
        CheckNameAvailabilityInput checkNameAvailabilityInput);

    /**
     * Check the availability of a resource name. This is needed for resources where name is globally unique, such as a
     * CDN endpoint.
     *
     * @param checkNameAvailabilityInput Input to check.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of check name availability API on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<CheckNameAvailabilityOutputInner> checkNameAvailabilityAsync(
        CheckNameAvailabilityInput checkNameAvailabilityInput);

    /**
     * Check the availability of a resource name. This is needed for resources where name is globally unique, such as a
     * CDN endpoint.
     *
     * @param checkNameAvailabilityInput Input to check.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of check name availability API along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CheckNameAvailabilityOutputInner> checkNameAvailabilityWithResponse(
        CheckNameAvailabilityInput checkNameAvailabilityInput, Context context);

    /**
     * Check the availability of a resource name. This is needed for resources where name is globally unique, such as a
     * CDN endpoint.
     *
     * @param checkNameAvailabilityInput Input to check.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of check name availability API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CheckNameAvailabilityOutputInner checkNameAvailability(CheckNameAvailabilityInput checkNameAvailabilityInput);

    /**
     * Check the availability of a resource name. This is needed for resources where name is globally unique, such as a
     * CDN endpoint.
     *
     * @param checkNameAvailabilityInput Input to check.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of check name availability API along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<CheckNameAvailabilityOutputInner>> checkNameAvailabilityWithSubscriptionWithResponseAsync(
        CheckNameAvailabilityInput checkNameAvailabilityInput);

    /**
     * Check the availability of a resource name. This is needed for resources where name is globally unique, such as a
     * CDN endpoint.
     *
     * @param checkNameAvailabilityInput Input to check.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of check name availability API on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<CheckNameAvailabilityOutputInner> checkNameAvailabilityWithSubscriptionAsync(
        CheckNameAvailabilityInput checkNameAvailabilityInput);

    /**
     * Check the availability of a resource name. This is needed for resources where name is globally unique, such as a
     * CDN endpoint.
     *
     * @param checkNameAvailabilityInput Input to check.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of check name availability API along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CheckNameAvailabilityOutputInner> checkNameAvailabilityWithSubscriptionWithResponse(
        CheckNameAvailabilityInput checkNameAvailabilityInput, Context context);

    /**
     * Check the availability of a resource name. This is needed for resources where name is globally unique, such as a
     * CDN endpoint.
     *
     * @param checkNameAvailabilityInput Input to check.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of check name availability API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CheckNameAvailabilityOutputInner checkNameAvailabilityWithSubscription(
        CheckNameAvailabilityInput checkNameAvailabilityInput);

    /**
     * Check if the probe path is a valid path and the file can be accessed. Probe path is the path to a file hosted on
     * the origin server to help accelerate the delivery of dynamic content via the CDN endpoint. This path is relative
     * to the origin path specified in the endpoint configuration.
     *
     * @param validateProbeInput Input to check.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of the validate probe API along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<ValidateProbeOutputInner>> validateProbeWithResponseAsync(ValidateProbeInput validateProbeInput);

    /**
     * Check if the probe path is a valid path and the file can be accessed. Probe path is the path to a file hosted on
     * the origin server to help accelerate the delivery of dynamic content via the CDN endpoint. This path is relative
     * to the origin path specified in the endpoint configuration.
     *
     * @param validateProbeInput Input to check.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of the validate probe API on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ValidateProbeOutputInner> validateProbeAsync(ValidateProbeInput validateProbeInput);

    /**
     * Check if the probe path is a valid path and the file can be accessed. Probe path is the path to a file hosted on
     * the origin server to help accelerate the delivery of dynamic content via the CDN endpoint. This path is relative
     * to the origin path specified in the endpoint configuration.
     *
     * @param validateProbeInput Input to check.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of the validate probe API along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ValidateProbeOutputInner> validateProbeWithResponse(
        ValidateProbeInput validateProbeInput, Context context);

    /**
     * Check if the probe path is a valid path and the file can be accessed. Probe path is the path to a file hosted on
     * the origin server to help accelerate the delivery of dynamic content via the CDN endpoint. This path is relative
     * to the origin path specified in the endpoint configuration.
     *
     * @param validateProbeInput Input to check.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of the validate probe API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ValidateProbeOutputInner validateProbe(ValidateProbeInput validateProbeInput);
}
