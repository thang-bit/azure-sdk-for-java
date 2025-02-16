// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.containerservice.fluent.models.TrustedAccessRoleInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of trusted access roles. */
@Immutable
public final class TrustedAccessRoleListResult {
    /*
     * Role list
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<TrustedAccessRoleInner> value;

    /*
     * Link to next page of resources.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /** Creates an instance of TrustedAccessRoleListResult class. */
    public TrustedAccessRoleListResult() {
    }

    /**
     * Get the value property: Role list.
     *
     * @return the value value.
     */
    public List<TrustedAccessRoleInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: Link to next page of resources.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
