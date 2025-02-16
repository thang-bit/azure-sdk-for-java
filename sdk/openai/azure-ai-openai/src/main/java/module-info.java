// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

module com.azure.ai.openai {
    requires transitive com.azure.core;

    exports com.azure.ai.openai;
    exports com.azure.ai.openai.models;

    opens com.azure.ai.openai.models to
            com.azure.core,
            com.fasterxml.jackson.databind;
    opens com.azure.ai.openai.implementation.models to
            com.azure.core,
            com.fasterxml.jackson.databind;
    opens com.azure.ai.openai.implementation to
            com.azure.core,
            com.fasterxml.jackson.databind;
}
