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

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.TablePatch;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the TablePatch model.
 */
public class TablePatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testTablePatch() throws Throwable {
    TablePatch tablePatchModel = new TablePatch.Builder()
      .tableName("updated_table_name")
      .build();
    assertEquals(tablePatchModel.tableName(), "updated_table_name");

    String json = TestUtilities.serialize(tablePatchModel);

    TablePatch tablePatchModelNew = TestUtilities.deserialize(json, TablePatch.class);
    assertTrue(tablePatchModelNew instanceof TablePatch);
    assertEquals(tablePatchModelNew.tableName(), "updated_table_name");
  }
  @Test
  public void testTablePatchAsPatch() throws Throwable {
    TablePatch tablePatchModel = new TablePatch.Builder()
      .tableName("updated_table_name")
      .build();

    Map<String, Object> mergePatch = tablePatchModel.asPatch();

    assertEquals(mergePatch.get("table_name"), "updated_table_name");
  }

}