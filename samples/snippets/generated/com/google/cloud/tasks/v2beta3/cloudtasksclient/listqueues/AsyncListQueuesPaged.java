/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.tasks.v2beta3.samples;

// [START tasks_v2beta3_generated_cloudtasksclient_listqueues_paged_async]
import com.google.cloud.tasks.v2beta3.CloudTasksClient;
import com.google.cloud.tasks.v2beta3.ListQueuesRequest;
import com.google.cloud.tasks.v2beta3.ListQueuesResponse;
import com.google.cloud.tasks.v2beta3.LocationName;
import com.google.cloud.tasks.v2beta3.Queue;
import com.google.common.base.Strings;
import com.google.protobuf.FieldMask;

public class AsyncListQueuesPaged {

  public static void main(String[] args) throws Exception {
    asyncListQueuesPaged();
  }

  public static void asyncListQueuesPaged() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
      ListQueuesRequest request =
          ListQueuesRequest.newBuilder()
              .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
              .setFilter("filter-1274492040")
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .setReadMask(FieldMask.newBuilder().build())
              .build();
      while (true) {
        ListQueuesResponse response = cloudTasksClient.listQueuesCallable().call(request);
        for (Queue element : response.getQueuesList()) {
          // doThingsWith(element);
        }
        String nextPageToken = response.getNextPageToken();
        if (!Strings.isNullOrEmpty(nextPageToken)) {
          request = request.toBuilder().setPageToken(nextPageToken).build();
        } else {
          break;
        }
      }
    }
  }
}
// [END tasks_v2beta3_generated_cloudtasksclient_listqueues_paged_async]
