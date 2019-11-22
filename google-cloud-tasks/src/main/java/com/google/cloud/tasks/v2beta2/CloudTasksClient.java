/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.tasks.v2beta2;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.tasks.v2beta2.stub.CloudTasksStub;
import com.google.cloud.tasks.v2beta2.stub.CloudTasksStubSettings;
import com.google.iam.v1.GetIamPolicyRequest;
import com.google.iam.v1.Policy;
import com.google.iam.v1.SetIamPolicyRequest;
import com.google.iam.v1.TestIamPermissionsRequest;
import com.google.iam.v1.TestIamPermissionsResponse;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: Cloud Tasks allows developers to manage the execution of background work in
 * their applications.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
 *   ListQueuesRequest request = ListQueuesRequest.newBuilder().build();
 *   ListQueuesResponse response = cloudTasksClient.listQueues(request);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the cloudTasksClient object to clean up resources such as
 * threads. In the example above, try-with-resources is used, which automatically calls close().
 *
 * <p>The surface of this class includes several types of Java methods for each of the API's
 * methods:
 *
 * <ol>
 *   <li>A "flattened" method. With this type of method, the fields of the request type have been
 *       converted into function parameters. It may be the case that not all fields are available as
 *       parameters, and not every API method will have a flattened method entry point.
 *   <li>A "request object" method. This type of method only takes one parameter, a request object,
 *       which must be constructed before the call. Not every API method will have a request object
 *       method.
 *   <li>A "callable" method. This type of method takes no parameters and returns an immutable API
 *       callable object, which can be used to initiate calls to the service.
 * </ol>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of CloudTasksSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * CloudTasksSettings cloudTasksSettings =
 *     CloudTasksSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * CloudTasksClient cloudTasksClient =
 *     CloudTasksClient.create(cloudTasksSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * CloudTasksSettings cloudTasksSettings =
 *     CloudTasksSettings.newBuilder().setEndpoint(myEndpoint).build();
 * CloudTasksClient cloudTasksClient =
 *     CloudTasksClient.create(cloudTasksSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class CloudTasksClient implements BackgroundResource {
  private final CloudTasksSettings settings;
  private final CloudTasksStub stub;

  /** Constructs an instance of CloudTasksClient with default settings. */
  public static final CloudTasksClient create() throws IOException {
    return create(CloudTasksSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of CloudTasksClient, using the given settings. The channels are created
   * based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final CloudTasksClient create(CloudTasksSettings settings) throws IOException {
    return new CloudTasksClient(settings);
  }

  /**
   * Constructs an instance of CloudTasksClient, using the given stub for making calls. This is for
   * advanced usage - prefer to use CloudTasksSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final CloudTasksClient create(CloudTasksStub stub) {
    return new CloudTasksClient(stub);
  }

  /**
   * Constructs an instance of CloudTasksClient, using the given settings. This is protected so that
   * it is easy to make a subclass, but otherwise, the static factory methods should be preferred.
   */
  protected CloudTasksClient(CloudTasksSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((CloudTasksStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected CloudTasksClient(CloudTasksStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final CloudTasksSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public CloudTasksStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists queues.
   *
   * <p>Queues are returned in lexicographical order.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
   *   ListQueuesRequest request = ListQueuesRequest.newBuilder().build();
   *   ListQueuesResponse response = cloudTasksClient.listQueues(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListQueuesResponse listQueues(ListQueuesRequest request) {
    return listQueuesCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists queues.
   *
   * <p>Queues are returned in lexicographical order.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
   *   ListQueuesRequest request = ListQueuesRequest.newBuilder().build();
   *   ApiFuture&lt;ListQueuesResponse&gt; future = cloudTasksClient.listQueuesCallable().futureCall(request);
   *   // Do something
   *   ListQueuesResponse response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<ListQueuesRequest, ListQueuesResponse> listQueuesCallable() {
    return stub.listQueuesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets a queue.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
   *   GetQueueRequest request = GetQueueRequest.newBuilder().build();
   *   Queue response = cloudTasksClient.getQueue(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Queue getQueue(GetQueueRequest request) {
    return getQueueCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets a queue.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
   *   GetQueueRequest request = GetQueueRequest.newBuilder().build();
   *   ApiFuture&lt;Queue&gt; future = cloudTasksClient.getQueueCallable().futureCall(request);
   *   // Do something
   *   Queue response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetQueueRequest, Queue> getQueueCallable() {
    return stub.getQueueCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a queue.
   *
   * <p>Queues created with this method allow tasks to live for a maximum of 31 days. After a task
   * is 31 days old, the task will be deleted regardless of whether it was dispatched or not.
   *
   * <p>WARNING: Using this method may have unintended side effects if you are using an App Engine
   * `queue.yaml` or `queue.xml` file to manage your queues. Read [Overview of Queue Management and
   * queue.yaml](https://cloud.google.com/tasks/docs/queue-yaml) before using this method.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
   *   CreateQueueRequest request = CreateQueueRequest.newBuilder().build();
   *   Queue response = cloudTasksClient.createQueue(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Queue createQueue(CreateQueueRequest request) {
    return createQueueCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a queue.
   *
   * <p>Queues created with this method allow tasks to live for a maximum of 31 days. After a task
   * is 31 days old, the task will be deleted regardless of whether it was dispatched or not.
   *
   * <p>WARNING: Using this method may have unintended side effects if you are using an App Engine
   * `queue.yaml` or `queue.xml` file to manage your queues. Read [Overview of Queue Management and
   * queue.yaml](https://cloud.google.com/tasks/docs/queue-yaml) before using this method.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
   *   CreateQueueRequest request = CreateQueueRequest.newBuilder().build();
   *   ApiFuture&lt;Queue&gt; future = cloudTasksClient.createQueueCallable().futureCall(request);
   *   // Do something
   *   Queue response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<CreateQueueRequest, Queue> createQueueCallable() {
    return stub.createQueueCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates a queue.
   *
   * <p>This method creates the queue if it does not exist and updates the queue if it does exist.
   *
   * <p>Queues created with this method allow tasks to live for a maximum of 31 days. After a task
   * is 31 days old, the task will be deleted regardless of whether it was dispatched or not.
   *
   * <p>WARNING: Using this method may have unintended side effects if you are using an App Engine
   * `queue.yaml` or `queue.xml` file to manage your queues. Read [Overview of Queue Management and
   * queue.yaml](https://cloud.google.com/tasks/docs/queue-yaml) before using this method.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
   *   UpdateQueueRequest request = UpdateQueueRequest.newBuilder().build();
   *   Queue response = cloudTasksClient.updateQueue(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Queue updateQueue(UpdateQueueRequest request) {
    return updateQueueCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates a queue.
   *
   * <p>This method creates the queue if it does not exist and updates the queue if it does exist.
   *
   * <p>Queues created with this method allow tasks to live for a maximum of 31 days. After a task
   * is 31 days old, the task will be deleted regardless of whether it was dispatched or not.
   *
   * <p>WARNING: Using this method may have unintended side effects if you are using an App Engine
   * `queue.yaml` or `queue.xml` file to manage your queues. Read [Overview of Queue Management and
   * queue.yaml](https://cloud.google.com/tasks/docs/queue-yaml) before using this method.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
   *   UpdateQueueRequest request = UpdateQueueRequest.newBuilder().build();
   *   ApiFuture&lt;Queue&gt; future = cloudTasksClient.updateQueueCallable().futureCall(request);
   *   // Do something
   *   Queue response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<UpdateQueueRequest, Queue> updateQueueCallable() {
    return stub.updateQueueCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes a queue.
   *
   * <p>This command will delete the queue even if it has tasks in it.
   *
   * <p>Note: If you delete a queue, a queue with the same name can't be created for 7 days.
   *
   * <p>WARNING: Using this method may have unintended side effects if you are using an App Engine
   * `queue.yaml` or `queue.xml` file to manage your queues. Read [Overview of Queue Management and
   * queue.yaml](https://cloud.google.com/tasks/docs/queue-yaml) before using this method.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
   *   DeleteQueueRequest request = DeleteQueueRequest.newBuilder().build();
   *   cloudTasksClient.deleteQueue(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteQueue(DeleteQueueRequest request) {
    deleteQueueCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes a queue.
   *
   * <p>This command will delete the queue even if it has tasks in it.
   *
   * <p>Note: If you delete a queue, a queue with the same name can't be created for 7 days.
   *
   * <p>WARNING: Using this method may have unintended side effects if you are using an App Engine
   * `queue.yaml` or `queue.xml` file to manage your queues. Read [Overview of Queue Management and
   * queue.yaml](https://cloud.google.com/tasks/docs/queue-yaml) before using this method.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
   *   DeleteQueueRequest request = DeleteQueueRequest.newBuilder().build();
   *   ApiFuture&lt;Void&gt; future = cloudTasksClient.deleteQueueCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<DeleteQueueRequest, Empty> deleteQueueCallable() {
    return stub.deleteQueueCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Purges a queue by deleting all of its tasks.
   *
   * <p>All tasks created before this method is called are permanently deleted.
   *
   * <p>Purge operations can take up to one minute to take effect. Tasks might be dispatched before
   * the purge takes effect. A purge is irreversible.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
   *   PurgeQueueRequest request = PurgeQueueRequest.newBuilder().build();
   *   Queue response = cloudTasksClient.purgeQueue(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Queue purgeQueue(PurgeQueueRequest request) {
    return purgeQueueCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Purges a queue by deleting all of its tasks.
   *
   * <p>All tasks created before this method is called are permanently deleted.
   *
   * <p>Purge operations can take up to one minute to take effect. Tasks might be dispatched before
   * the purge takes effect. A purge is irreversible.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
   *   PurgeQueueRequest request = PurgeQueueRequest.newBuilder().build();
   *   ApiFuture&lt;Queue&gt; future = cloudTasksClient.purgeQueueCallable().futureCall(request);
   *   // Do something
   *   Queue response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<PurgeQueueRequest, Queue> purgeQueueCallable() {
    return stub.purgeQueueCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Pauses the queue.
   *
   * <p>If a queue is paused then the system will stop dispatching tasks until the queue is resumed
   * via [ResumeQueue][google.cloud.tasks.v2beta2.CloudTasks.ResumeQueue]. Tasks can still be added
   * when the queue is paused. A queue is paused if its
   * [state][google.cloud.tasks.v2beta2.Queue.state] is
   * [PAUSED][google.cloud.tasks.v2beta2.Queue.State.PAUSED].
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
   *   PauseQueueRequest request = PauseQueueRequest.newBuilder().build();
   *   Queue response = cloudTasksClient.pauseQueue(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Queue pauseQueue(PauseQueueRequest request) {
    return pauseQueueCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Pauses the queue.
   *
   * <p>If a queue is paused then the system will stop dispatching tasks until the queue is resumed
   * via [ResumeQueue][google.cloud.tasks.v2beta2.CloudTasks.ResumeQueue]. Tasks can still be added
   * when the queue is paused. A queue is paused if its
   * [state][google.cloud.tasks.v2beta2.Queue.state] is
   * [PAUSED][google.cloud.tasks.v2beta2.Queue.State.PAUSED].
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
   *   PauseQueueRequest request = PauseQueueRequest.newBuilder().build();
   *   ApiFuture&lt;Queue&gt; future = cloudTasksClient.pauseQueueCallable().futureCall(request);
   *   // Do something
   *   Queue response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<PauseQueueRequest, Queue> pauseQueueCallable() {
    return stub.pauseQueueCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Resume a queue.
   *
   * <p>This method resumes a queue after it has been
   * [PAUSED][google.cloud.tasks.v2beta2.Queue.State.PAUSED] or
   * [DISABLED][google.cloud.tasks.v2beta2.Queue.State.DISABLED]. The state of a queue is stored in
   * the queue's [state][google.cloud.tasks.v2beta2.Queue.state]; after calling this method it will
   * be set to [RUNNING][google.cloud.tasks.v2beta2.Queue.State.RUNNING].
   *
   * <p>WARNING: Resuming many high-QPS queues at the same time can lead to target overloading. If
   * you are resuming high-QPS queues, follow the 500/50/5 pattern described in [Managing Cloud
   * Tasks Scaling Risks](https://cloud.google.com/tasks/docs/manage-cloud-task-scaling).
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
   *   ResumeQueueRequest request = ResumeQueueRequest.newBuilder().build();
   *   Queue response = cloudTasksClient.resumeQueue(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Queue resumeQueue(ResumeQueueRequest request) {
    return resumeQueueCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Resume a queue.
   *
   * <p>This method resumes a queue after it has been
   * [PAUSED][google.cloud.tasks.v2beta2.Queue.State.PAUSED] or
   * [DISABLED][google.cloud.tasks.v2beta2.Queue.State.DISABLED]. The state of a queue is stored in
   * the queue's [state][google.cloud.tasks.v2beta2.Queue.state]; after calling this method it will
   * be set to [RUNNING][google.cloud.tasks.v2beta2.Queue.State.RUNNING].
   *
   * <p>WARNING: Resuming many high-QPS queues at the same time can lead to target overloading. If
   * you are resuming high-QPS queues, follow the 500/50/5 pattern described in [Managing Cloud
   * Tasks Scaling Risks](https://cloud.google.com/tasks/docs/manage-cloud-task-scaling).
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
   *   ResumeQueueRequest request = ResumeQueueRequest.newBuilder().build();
   *   ApiFuture&lt;Queue&gt; future = cloudTasksClient.resumeQueueCallable().futureCall(request);
   *   // Do something
   *   Queue response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<ResumeQueueRequest, Queue> resumeQueueCallable() {
    return stub.resumeQueueCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets the access control policy for a [Queue][google.cloud.tasks.v2beta2.Queue]. Returns an
   * empty policy if the resource exists and does not have a policy set.
   *
   * <p>Authorization requires the following [Google IAM](https://cloud.google.com/iam) permission
   * on the specified resource parent:
   *
   * <p>&#42; `cloudtasks.queues.getIamPolicy`
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
   *   GetIamPolicyRequest request = GetIamPolicyRequest.newBuilder().build();
   *   Policy response = cloudTasksClient.getIamPolicy(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Policy getIamPolicy(GetIamPolicyRequest request) {
    return getIamPolicyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets the access control policy for a [Queue][google.cloud.tasks.v2beta2.Queue]. Returns an
   * empty policy if the resource exists and does not have a policy set.
   *
   * <p>Authorization requires the following [Google IAM](https://cloud.google.com/iam) permission
   * on the specified resource parent:
   *
   * <p>&#42; `cloudtasks.queues.getIamPolicy`
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
   *   GetIamPolicyRequest request = GetIamPolicyRequest.newBuilder().build();
   *   ApiFuture&lt;Policy&gt; future = cloudTasksClient.getIamPolicyCallable().futureCall(request);
   *   // Do something
   *   Policy response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetIamPolicyRequest, Policy> getIamPolicyCallable() {
    return stub.getIamPolicyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets the access control policy for a [Queue][google.cloud.tasks.v2beta2.Queue]. Replaces any
   * existing policy.
   *
   * <p>Note: The Cloud Console does not check queue-level IAM permissions yet. Project-level
   * permissions are required to use the Cloud Console.
   *
   * <p>Authorization requires the following [Google IAM](https://cloud.google.com/iam) permission
   * on the specified resource parent:
   *
   * <p>&#42; `cloudtasks.queues.setIamPolicy`
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
   *   SetIamPolicyRequest request = SetIamPolicyRequest.newBuilder().build();
   *   Policy response = cloudTasksClient.setIamPolicy(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Policy setIamPolicy(SetIamPolicyRequest request) {
    return setIamPolicyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets the access control policy for a [Queue][google.cloud.tasks.v2beta2.Queue]. Replaces any
   * existing policy.
   *
   * <p>Note: The Cloud Console does not check queue-level IAM permissions yet. Project-level
   * permissions are required to use the Cloud Console.
   *
   * <p>Authorization requires the following [Google IAM](https://cloud.google.com/iam) permission
   * on the specified resource parent:
   *
   * <p>&#42; `cloudtasks.queues.setIamPolicy`
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
   *   SetIamPolicyRequest request = SetIamPolicyRequest.newBuilder().build();
   *   ApiFuture&lt;Policy&gt; future = cloudTasksClient.setIamPolicyCallable().futureCall(request);
   *   // Do something
   *   Policy response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<SetIamPolicyRequest, Policy> setIamPolicyCallable() {
    return stub.setIamPolicyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns permissions that a caller has on a [Queue][google.cloud.tasks.v2beta2.Queue]. If the
   * resource does not exist, this will return an empty set of permissions, not a
   * [NOT_FOUND][google.rpc.Code.NOT_FOUND] error.
   *
   * <p>Note: This operation is designed to be used for building permission-aware UIs and
   * command-line tools, not for authorization checking. This operation may "fail open" without
   * warning.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
   *   TestIamPermissionsRequest request = TestIamPermissionsRequest.newBuilder().build();
   *   TestIamPermissionsResponse response = cloudTasksClient.testIamPermissions(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final TestIamPermissionsResponse testIamPermissions(TestIamPermissionsRequest request) {
    return testIamPermissionsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns permissions that a caller has on a [Queue][google.cloud.tasks.v2beta2.Queue]. If the
   * resource does not exist, this will return an empty set of permissions, not a
   * [NOT_FOUND][google.rpc.Code.NOT_FOUND] error.
   *
   * <p>Note: This operation is designed to be used for building permission-aware UIs and
   * command-line tools, not for authorization checking. This operation may "fail open" without
   * warning.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
   *   TestIamPermissionsRequest request = TestIamPermissionsRequest.newBuilder().build();
   *   ApiFuture&lt;TestIamPermissionsResponse&gt; future = cloudTasksClient.testIamPermissionsCallable().futureCall(request);
   *   // Do something
   *   TestIamPermissionsResponse response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsCallable() {
    return stub.testIamPermissionsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists the tasks in a queue.
   *
   * <p>By default, only the [BASIC][google.cloud.tasks.v2beta2.Task.View.BASIC] view is retrieved
   * due to performance considerations;
   * [response_view][google.cloud.tasks.v2beta2.ListTasksRequest.response_view] controls the subset
   * of information which is returned.
   *
   * <p>The tasks may be returned in any order. The ordering may change at any time.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
   *   ListTasksRequest request = ListTasksRequest.newBuilder().build();
   *   ListTasksResponse response = cloudTasksClient.listTasks(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListTasksResponse listTasks(ListTasksRequest request) {
    return listTasksCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists the tasks in a queue.
   *
   * <p>By default, only the [BASIC][google.cloud.tasks.v2beta2.Task.View.BASIC] view is retrieved
   * due to performance considerations;
   * [response_view][google.cloud.tasks.v2beta2.ListTasksRequest.response_view] controls the subset
   * of information which is returned.
   *
   * <p>The tasks may be returned in any order. The ordering may change at any time.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
   *   ListTasksRequest request = ListTasksRequest.newBuilder().build();
   *   ApiFuture&lt;ListTasksResponse&gt; future = cloudTasksClient.listTasksCallable().futureCall(request);
   *   // Do something
   *   ListTasksResponse response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<ListTasksRequest, ListTasksResponse> listTasksCallable() {
    return stub.listTasksCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets a task.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
   *   GetTaskRequest request = GetTaskRequest.newBuilder().build();
   *   Task response = cloudTasksClient.getTask(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Task getTask(GetTaskRequest request) {
    return getTaskCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets a task.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
   *   GetTaskRequest request = GetTaskRequest.newBuilder().build();
   *   ApiFuture&lt;Task&gt; future = cloudTasksClient.getTaskCallable().futureCall(request);
   *   // Do something
   *   Task response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetTaskRequest, Task> getTaskCallable() {
    return stub.getTaskCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a task and adds it to a queue.
   *
   * <p>Tasks cannot be updated after creation; there is no UpdateTask command.
   *
   * <p>&#42; For [App Engine queues][google.cloud.tasks.v2beta2.AppEngineHttpTarget], the maximum
   * task size is 100KB. &#42; For [pull queues][google.cloud.tasks.v2beta2.PullTarget], the maximum
   * task size is 1MB.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
   *   CreateTaskRequest request = CreateTaskRequest.newBuilder().build();
   *   Task response = cloudTasksClient.createTask(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Task createTask(CreateTaskRequest request) {
    return createTaskCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a task and adds it to a queue.
   *
   * <p>Tasks cannot be updated after creation; there is no UpdateTask command.
   *
   * <p>&#42; For [App Engine queues][google.cloud.tasks.v2beta2.AppEngineHttpTarget], the maximum
   * task size is 100KB. &#42; For [pull queues][google.cloud.tasks.v2beta2.PullTarget], the maximum
   * task size is 1MB.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
   *   CreateTaskRequest request = CreateTaskRequest.newBuilder().build();
   *   ApiFuture&lt;Task&gt; future = cloudTasksClient.createTaskCallable().futureCall(request);
   *   // Do something
   *   Task response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<CreateTaskRequest, Task> createTaskCallable() {
    return stub.createTaskCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes a task.
   *
   * <p>A task can be deleted if it is scheduled or dispatched. A task cannot be deleted if it has
   * completed successfully or permanently failed.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
   *   DeleteTaskRequest request = DeleteTaskRequest.newBuilder().build();
   *   cloudTasksClient.deleteTask(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteTask(DeleteTaskRequest request) {
    deleteTaskCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes a task.
   *
   * <p>A task can be deleted if it is scheduled or dispatched. A task cannot be deleted if it has
   * completed successfully or permanently failed.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
   *   DeleteTaskRequest request = DeleteTaskRequest.newBuilder().build();
   *   ApiFuture&lt;Void&gt; future = cloudTasksClient.deleteTaskCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<DeleteTaskRequest, Empty> deleteTaskCallable() {
    return stub.deleteTaskCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Leases tasks from a pull queue for
   * [lease_duration][google.cloud.tasks.v2beta2.LeaseTasksRequest.lease_duration].
   *
   * <p>This method is invoked by the worker to obtain a lease. The worker must acknowledge the task
   * via [AcknowledgeTask][google.cloud.tasks.v2beta2.CloudTasks.AcknowledgeTask] after they have
   * performed the work associated with the task.
   *
   * <p>The [payload][google.cloud.tasks.v2beta2.PullMessage.payload] is intended to store data that
   * the worker needs to perform the work associated with the task. To return the payloads in the
   * [response][google.cloud.tasks.v2beta2.LeaseTasksResponse], set
   * [response_view][google.cloud.tasks.v2beta2.LeaseTasksRequest.response_view] to
   * [FULL][google.cloud.tasks.v2beta2.Task.View.FULL].
   *
   * <p>A maximum of 10 qps of [LeaseTasks][google.cloud.tasks.v2beta2.CloudTasks.LeaseTasks]
   * requests are allowed per queue. [RESOURCE_EXHAUSTED][google.rpc.Code.RESOURCE_EXHAUSTED] is
   * returned when this limit is exceeded. [RESOURCE_EXHAUSTED][google.rpc.Code.RESOURCE_EXHAUSTED]
   * is also returned when
   * [max_tasks_dispatched_per_second][google.cloud.tasks.v2beta2.RateLimits.max_tasks_dispatched_per_second]
   * is exceeded.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
   *   LeaseTasksRequest request = LeaseTasksRequest.newBuilder().build();
   *   LeaseTasksResponse response = cloudTasksClient.leaseTasks(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final LeaseTasksResponse leaseTasks(LeaseTasksRequest request) {
    return leaseTasksCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Leases tasks from a pull queue for
   * [lease_duration][google.cloud.tasks.v2beta2.LeaseTasksRequest.lease_duration].
   *
   * <p>This method is invoked by the worker to obtain a lease. The worker must acknowledge the task
   * via [AcknowledgeTask][google.cloud.tasks.v2beta2.CloudTasks.AcknowledgeTask] after they have
   * performed the work associated with the task.
   *
   * <p>The [payload][google.cloud.tasks.v2beta2.PullMessage.payload] is intended to store data that
   * the worker needs to perform the work associated with the task. To return the payloads in the
   * [response][google.cloud.tasks.v2beta2.LeaseTasksResponse], set
   * [response_view][google.cloud.tasks.v2beta2.LeaseTasksRequest.response_view] to
   * [FULL][google.cloud.tasks.v2beta2.Task.View.FULL].
   *
   * <p>A maximum of 10 qps of [LeaseTasks][google.cloud.tasks.v2beta2.CloudTasks.LeaseTasks]
   * requests are allowed per queue. [RESOURCE_EXHAUSTED][google.rpc.Code.RESOURCE_EXHAUSTED] is
   * returned when this limit is exceeded. [RESOURCE_EXHAUSTED][google.rpc.Code.RESOURCE_EXHAUSTED]
   * is also returned when
   * [max_tasks_dispatched_per_second][google.cloud.tasks.v2beta2.RateLimits.max_tasks_dispatched_per_second]
   * is exceeded.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
   *   LeaseTasksRequest request = LeaseTasksRequest.newBuilder().build();
   *   ApiFuture&lt;LeaseTasksResponse&gt; future = cloudTasksClient.leaseTasksCallable().futureCall(request);
   *   // Do something
   *   LeaseTasksResponse response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<LeaseTasksRequest, LeaseTasksResponse> leaseTasksCallable() {
    return stub.leaseTasksCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Acknowledges a pull task.
   *
   * <p>The worker, that is, the entity that
   * [leased][google.cloud.tasks.v2beta2.CloudTasks.LeaseTasks] this task must call this method to
   * indicate that the work associated with the task has finished.
   *
   * <p>The worker must acknowledge a task within the
   * [lease_duration][google.cloud.tasks.v2beta2.LeaseTasksRequest.lease_duration] or the lease will
   * expire and the task will become available to be leased again. After the task is acknowledged,
   * it will not be returned by a later
   * [LeaseTasks][google.cloud.tasks.v2beta2.CloudTasks.LeaseTasks],
   * [GetTask][google.cloud.tasks.v2beta2.CloudTasks.GetTask], or
   * [ListTasks][google.cloud.tasks.v2beta2.CloudTasks.ListTasks].
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
   *   AcknowledgeTaskRequest request = AcknowledgeTaskRequest.newBuilder().build();
   *   cloudTasksClient.acknowledgeTask(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void acknowledgeTask(AcknowledgeTaskRequest request) {
    acknowledgeTaskCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Acknowledges a pull task.
   *
   * <p>The worker, that is, the entity that
   * [leased][google.cloud.tasks.v2beta2.CloudTasks.LeaseTasks] this task must call this method to
   * indicate that the work associated with the task has finished.
   *
   * <p>The worker must acknowledge a task within the
   * [lease_duration][google.cloud.tasks.v2beta2.LeaseTasksRequest.lease_duration] or the lease will
   * expire and the task will become available to be leased again. After the task is acknowledged,
   * it will not be returned by a later
   * [LeaseTasks][google.cloud.tasks.v2beta2.CloudTasks.LeaseTasks],
   * [GetTask][google.cloud.tasks.v2beta2.CloudTasks.GetTask], or
   * [ListTasks][google.cloud.tasks.v2beta2.CloudTasks.ListTasks].
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
   *   AcknowledgeTaskRequest request = AcknowledgeTaskRequest.newBuilder().build();
   *   ApiFuture&lt;Void&gt; future = cloudTasksClient.acknowledgeTaskCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<AcknowledgeTaskRequest, Empty> acknowledgeTaskCallable() {
    return stub.acknowledgeTaskCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Renew the current lease of a pull task.
   *
   * <p>The worker can use this method to extend the lease by a new duration, starting from now. The
   * new task lease will be returned in the task's
   * [schedule_time][google.cloud.tasks.v2beta2.Task.schedule_time].
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
   *   RenewLeaseRequest request = RenewLeaseRequest.newBuilder().build();
   *   Task response = cloudTasksClient.renewLease(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Task renewLease(RenewLeaseRequest request) {
    return renewLeaseCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Renew the current lease of a pull task.
   *
   * <p>The worker can use this method to extend the lease by a new duration, starting from now. The
   * new task lease will be returned in the task's
   * [schedule_time][google.cloud.tasks.v2beta2.Task.schedule_time].
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
   *   RenewLeaseRequest request = RenewLeaseRequest.newBuilder().build();
   *   ApiFuture&lt;Task&gt; future = cloudTasksClient.renewLeaseCallable().futureCall(request);
   *   // Do something
   *   Task response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<RenewLeaseRequest, Task> renewLeaseCallable() {
    return stub.renewLeaseCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Cancel a pull task's lease.
   *
   * <p>The worker can use this method to cancel a task's lease by setting its
   * [schedule_time][google.cloud.tasks.v2beta2.Task.schedule_time] to now. This will make the task
   * available to be leased to the next caller of
   * [LeaseTasks][google.cloud.tasks.v2beta2.CloudTasks.LeaseTasks].
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
   *   CancelLeaseRequest request = CancelLeaseRequest.newBuilder().build();
   *   Task response = cloudTasksClient.cancelLease(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Task cancelLease(CancelLeaseRequest request) {
    return cancelLeaseCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Cancel a pull task's lease.
   *
   * <p>The worker can use this method to cancel a task's lease by setting its
   * [schedule_time][google.cloud.tasks.v2beta2.Task.schedule_time] to now. This will make the task
   * available to be leased to the next caller of
   * [LeaseTasks][google.cloud.tasks.v2beta2.CloudTasks.LeaseTasks].
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
   *   CancelLeaseRequest request = CancelLeaseRequest.newBuilder().build();
   *   ApiFuture&lt;Task&gt; future = cloudTasksClient.cancelLeaseCallable().futureCall(request);
   *   // Do something
   *   Task response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<CancelLeaseRequest, Task> cancelLeaseCallable() {
    return stub.cancelLeaseCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Forces a task to run now.
   *
   * <p>When this method is called, Cloud Tasks will dispatch the task, even if the task is already
   * running, the queue has reached its [RateLimits][google.cloud.tasks.v2beta2.RateLimits] or is
   * [PAUSED][google.cloud.tasks.v2beta2.Queue.State.PAUSED].
   *
   * <p>This command is meant to be used for manual debugging. For example,
   * [RunTask][google.cloud.tasks.v2beta2.CloudTasks.RunTask] can be used to retry a failed task
   * after a fix has been made or to manually force a task to be dispatched now.
   *
   * <p>The dispatched task is returned. That is, the task that is returned contains the
   * [status][google.cloud.tasks.v2beta2.Task.status] after the task is dispatched but before the
   * task is received by its target.
   *
   * <p>If Cloud Tasks receives a successful response from the task's target, then the task will be
   * deleted; otherwise the task's [schedule_time][google.cloud.tasks.v2beta2.Task.schedule_time]
   * will be reset to the time that [RunTask][google.cloud.tasks.v2beta2.CloudTasks.RunTask] was
   * called plus the retry delay specified in the queue's
   * [RetryConfig][google.cloud.tasks.v2beta2.RetryConfig].
   *
   * <p>[RunTask][google.cloud.tasks.v2beta2.CloudTasks.RunTask] returns
   * [NOT_FOUND][google.rpc.Code.NOT_FOUND] when it is called on a task that has already succeeded
   * or permanently failed.
   *
   * <p>[RunTask][google.cloud.tasks.v2beta2.CloudTasks.RunTask] cannot be called on a [pull
   * task][google.cloud.tasks.v2beta2.PullMessage].
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
   *   RunTaskRequest request = RunTaskRequest.newBuilder().build();
   *   Task response = cloudTasksClient.runTask(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Task runTask(RunTaskRequest request) {
    return runTaskCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Forces a task to run now.
   *
   * <p>When this method is called, Cloud Tasks will dispatch the task, even if the task is already
   * running, the queue has reached its [RateLimits][google.cloud.tasks.v2beta2.RateLimits] or is
   * [PAUSED][google.cloud.tasks.v2beta2.Queue.State.PAUSED].
   *
   * <p>This command is meant to be used for manual debugging. For example,
   * [RunTask][google.cloud.tasks.v2beta2.CloudTasks.RunTask] can be used to retry a failed task
   * after a fix has been made or to manually force a task to be dispatched now.
   *
   * <p>The dispatched task is returned. That is, the task that is returned contains the
   * [status][google.cloud.tasks.v2beta2.Task.status] after the task is dispatched but before the
   * task is received by its target.
   *
   * <p>If Cloud Tasks receives a successful response from the task's target, then the task will be
   * deleted; otherwise the task's [schedule_time][google.cloud.tasks.v2beta2.Task.schedule_time]
   * will be reset to the time that [RunTask][google.cloud.tasks.v2beta2.CloudTasks.RunTask] was
   * called plus the retry delay specified in the queue's
   * [RetryConfig][google.cloud.tasks.v2beta2.RetryConfig].
   *
   * <p>[RunTask][google.cloud.tasks.v2beta2.CloudTasks.RunTask] returns
   * [NOT_FOUND][google.rpc.Code.NOT_FOUND] when it is called on a task that has already succeeded
   * or permanently failed.
   *
   * <p>[RunTask][google.cloud.tasks.v2beta2.CloudTasks.RunTask] cannot be called on a [pull
   * task][google.cloud.tasks.v2beta2.PullMessage].
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
   *   RunTaskRequest request = RunTaskRequest.newBuilder().build();
   *   ApiFuture&lt;Task&gt; future = cloudTasksClient.runTaskCallable().futureCall(request);
   *   // Do something
   *   Task response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<RunTaskRequest, Task> runTaskCallable() {
    return stub.runTaskCallable();
  }

  @Override
  public final void close() {
    stub.close();
  }

  @Override
  public void shutdown() {
    stub.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return stub.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return stub.isTerminated();
  }

  @Override
  public void shutdownNow() {
    stub.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return stub.awaitTermination(duration, unit);
  }
}
