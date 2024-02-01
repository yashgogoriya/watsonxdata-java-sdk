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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updatePrestissimoEngine options.
 */
public class UpdatePrestissimoEngineOptions extends GenericModel {

  protected String engineId;
  protected List<JsonPatchOperation> body;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String engineId;
    private List<JsonPatchOperation> body;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing UpdatePrestissimoEngineOptions instance.
     *
     * @param updatePrestissimoEngineOptions the instance to initialize the Builder with
     */
    private Builder(UpdatePrestissimoEngineOptions updatePrestissimoEngineOptions) {
      this.engineId = updatePrestissimoEngineOptions.engineId;
      this.body = updatePrestissimoEngineOptions.body;
      this.authInstanceId = updatePrestissimoEngineOptions.authInstanceId;
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
     * @param body the body
     */
    public Builder(String engineId, List<JsonPatchOperation> body) {
      this.engineId = engineId;
      this.body = body;
    }

    /**
     * Builds a UpdatePrestissimoEngineOptions.
     *
     * @return the new UpdatePrestissimoEngineOptions instance
     */
    public UpdatePrestissimoEngineOptions build() {
      return new UpdatePrestissimoEngineOptions(this);
    }

    /**
     * Adds a new element to body.
     *
     * @param body the new element to be added
     * @return the UpdatePrestissimoEngineOptions builder
     */
    public Builder addBody(JsonPatchOperation body) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(body,
        "body cannot be null");
      if (this.body == null) {
        this.body = new ArrayList<JsonPatchOperation>();
      }
      this.body.add(body);
      return this;
    }

    /**
     * Set the engineId.
     *
     * @param engineId the engineId
     * @return the UpdatePrestissimoEngineOptions builder
     */
    public Builder engineId(String engineId) {
      this.engineId = engineId;
      return this;
    }

    /**
     * Set the body.
     * Existing body will be replaced.
     *
     * @param body the body
     * @return the UpdatePrestissimoEngineOptions builder
     */
    public Builder body(List<JsonPatchOperation> body) {
      this.body = body;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the UpdatePrestissimoEngineOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected UpdatePrestissimoEngineOptions() { }

  protected UpdatePrestissimoEngineOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.engineId,
      "engineId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.body,
      "body cannot be null");
    engineId = builder.engineId;
    body = builder.body;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a UpdatePrestissimoEngineOptions builder
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
   * Gets the body.
   *
   * Update prestissimo engine body.
   *
   * @return the body
   */
  public List<JsonPatchOperation> body() {
    return body;
  }

  /**
   * Gets the authInstanceId.
   *
   * Instance ID.
   *
   * @return the authInstanceId
   */
  public String authInstanceId() {
    return authInstanceId;
  }
}

