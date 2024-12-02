/*
 * (C) Copyright IBM Corp. 2024.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.ibm.cloud.watsonxdata.watsonx_data.v2.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createSalIntegrationEnrichment options.
 */
public class CreateSalIntegrationEnrichmentOptions extends GenericModel {

  protected EnrichmentObj changes;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private EnrichmentObj changes;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing CreateSalIntegrationEnrichmentOptions instance.
     *
     * @param createSalIntegrationEnrichmentOptions the instance to initialize the Builder with
     */
    private Builder(CreateSalIntegrationEnrichmentOptions createSalIntegrationEnrichmentOptions) {
      this.changes = createSalIntegrationEnrichmentOptions.changes;
      this.authInstanceId = createSalIntegrationEnrichmentOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CreateSalIntegrationEnrichmentOptions.
     *
     * @return the new CreateSalIntegrationEnrichmentOptions instance
     */
    public CreateSalIntegrationEnrichmentOptions build() {
      return new CreateSalIntegrationEnrichmentOptions(this);
    }

    /**
     * Set the changes.
     *
     * @param changes the changes
     * @return the CreateSalIntegrationEnrichmentOptions builder
     */
    public Builder changes(EnrichmentObj changes) {
      this.changes = changes;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the CreateSalIntegrationEnrichmentOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected CreateSalIntegrationEnrichmentOptions() { }

  protected CreateSalIntegrationEnrichmentOptions(Builder builder) {
    changes = builder.changes;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a CreateSalIntegrationEnrichmentOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the changes.
   *
   * Encrichment api object.
   *
   * @return the changes
   */
  public EnrichmentObj changes() {
    return changes;
  }

  /**
   * Gets the authInstanceId.
   *
   * watsonx.data instance ID.
   *
   * @return the authInstanceId
   */
  public String authInstanceId() {
    return authInstanceId;
  }
}

