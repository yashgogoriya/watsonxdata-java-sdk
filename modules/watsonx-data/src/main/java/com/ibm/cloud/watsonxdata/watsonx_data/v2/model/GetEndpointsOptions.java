/*
 * (C) Copyright IBM Corp. 2025.
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
 * The getEndpoints options.
 */
public class GetEndpointsOptions extends GenericModel {

  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing GetEndpointsOptions instance.
     *
     * @param getEndpointsOptions the instance to initialize the Builder with
     */
    private Builder(GetEndpointsOptions getEndpointsOptions) {
      this.authInstanceId = getEndpointsOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a GetEndpointsOptions.
     *
     * @return the new GetEndpointsOptions instance
     */
    public GetEndpointsOptions build() {
      return new GetEndpointsOptions(this);
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the GetEndpointsOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected GetEndpointsOptions() { }

  protected GetEndpointsOptions(Builder builder) {
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a GetEndpointsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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

