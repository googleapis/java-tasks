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

// [START tasks_v2beta3_generated_cloudtasksclient_gettask_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.tasks.v2beta3.CloudTasksClient;
import com.google.cloud.tasks.v2beta3.GetTaskRequest;
import com.google.cloud.tasks.v2beta3.Task;
import com.google.cloud.tasks.v2beta3.TaskName;

public class AsyncGetTask {

  public static void main(String[] args) throws Exception {
    asyncGetTask();
  }

  public static void asyncGetTask() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
      GetTaskRequest request =
          GetTaskRequest.newBuilder()
              .setName(TaskName.of("[PROJECT]", "[LOCATION]", "[QUEUE]", "[TASK]").toString())
              .build();
      ApiFuture<Task> future = cloudTasksClient.getTaskCallable().futureCall(request);
      // Do something.
      Task response = future.get();
    }
  }
}
// [END tasks_v2beta3_generated_cloudtasksclient_gettask_async]
