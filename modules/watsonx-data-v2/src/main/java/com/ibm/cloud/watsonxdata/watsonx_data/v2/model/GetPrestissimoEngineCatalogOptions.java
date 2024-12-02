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
 * The getPrestissimoEngineCatalog options.
 */
public class GetPrestissimoEngineCatalogOptions extends GenericModel {

  protected String engineId;
  protected String catalogId;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String engineId;
    private String catalogId;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing GetPrestissimoEngineCatalogOptions instance.
     *
     * @param getPrestissimoEngineCatalogOptions the instance to initialize the Builder with
     */
    private Builder(GetPrestissimoEngineCatalogOptions getPrestissimoEngineCatalogOptions) {
      this.engineId = getPrestissimoEngineCatalogOptions.engineId;
      this.catalogId = getPrestissimoEngineCatalogOptions.catalogId;
      this.authInstanceId = getPrestissimoEngineCatalogOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param engineId the engineId
     * @param catalogId the catalogId
     */
    public Builder(String engineId, String catalogId) {
      this.engineId = engineId;
      this.catalogId = catalogId;
    }

    /**
     * Builds a GetPrestissimoEngineCatalogOptions.
     *
     * @return the new GetPrestissimoEngineCatalogOptions instance
     */
    public GetPrestissimoEngineCatalogOptions build() {
      return new GetPrestissimoEngineCatalogOptions(this);
    }

    /**
     * Set the engineId.
     *
     * @param engineId the engineId
     * @return the GetPrestissimoEngineCatalogOptions builder
     */
    public Builder engineId(String engineId) {
      this.engineId = engineId;
      return this;
    }

    /**
     * Set the catalogId.
     *
     * @param catalogId the catalogId
     * @return the GetPrestissimoEngineCatalogOptions builder
     */
    public Builder catalogId(String catalogId) {
      this.catalogId = catalogId;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the GetPrestissimoEngineCatalogOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected GetPrestissimoEngineCatalogOptions() { }

  protected GetPrestissimoEngineCatalogOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.engineId,
      "engineId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.catalogId,
      "catalogId cannot be empty");
    engineId = builder.engineId;
    catalogId = builder.catalogId;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a GetPrestissimoEngineCatalogOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the engineId.
   *
   * engine id.
   *
   * @return the engineId
   */
  public String engineId() {
    return engineId;
  }

  /**
   * Gets the catalogId.
   *
   * catalog id.
   *
   * @return the catalogId
   */
  public String catalogId() {
    return catalogId;
  }

  /**
   * Gets the authInstanceId.
   *
   * CRN.
   *
   * @return the authInstanceId
   */
  public String authInstanceId() {
    return authInstanceId;
  }
}

