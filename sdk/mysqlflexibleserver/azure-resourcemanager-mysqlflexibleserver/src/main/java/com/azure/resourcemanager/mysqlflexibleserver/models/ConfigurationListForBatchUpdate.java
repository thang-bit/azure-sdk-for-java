// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A list of server configurations to update. */
@Fluent
public final class ConfigurationListForBatchUpdate {
    /*
     * The list of server configurations.
     */
    @JsonProperty(value = "value")
    private List<ConfigurationForBatchUpdate> value;

    /*
     * Whether to reset all server parameters to default.
     */
    @JsonProperty(value = "resetAllToDefault")
    private ResetAllToDefault resetAllToDefault;

    /** Creates an instance of ConfigurationListForBatchUpdate class. */
    public ConfigurationListForBatchUpdate() {
    }

    /**
     * Get the value property: The list of server configurations.
     *
     * @return the value value.
     */
    public List<ConfigurationForBatchUpdate> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of server configurations.
     *
     * @param value the value value to set.
     * @return the ConfigurationListForBatchUpdate object itself.
     */
    public ConfigurationListForBatchUpdate withValue(List<ConfigurationForBatchUpdate> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the resetAllToDefault property: Whether to reset all server parameters to default.
     *
     * @return the resetAllToDefault value.
     */
    public ResetAllToDefault resetAllToDefault() {
        return this.resetAllToDefault;
    }

    /**
     * Set the resetAllToDefault property: Whether to reset all server parameters to default.
     *
     * @param resetAllToDefault the resetAllToDefault value to set.
     * @return the ConfigurationListForBatchUpdate object itself.
     */
    public ConfigurationListForBatchUpdate withResetAllToDefault(ResetAllToDefault resetAllToDefault) {
        this.resetAllToDefault = resetAllToDefault;
        return this;
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
