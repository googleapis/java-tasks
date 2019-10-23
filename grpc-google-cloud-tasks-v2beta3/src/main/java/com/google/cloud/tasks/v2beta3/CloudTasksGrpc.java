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
package com.google.cloud.tasks.v2beta3;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 *
 *
 * <pre>
 * Cloud Tasks allows developers to manage the execution of background
 * work in their applications.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/cloud/tasks/v2beta3/cloudtasks.proto")
public final class CloudTasksGrpc {

  private CloudTasksGrpc() {}

  public static final String SERVICE_NAME = "google.cloud.tasks.v2beta3.CloudTasks";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getListQueuesMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.tasks.v2beta3.ListQueuesRequest,
          com.google.cloud.tasks.v2beta3.ListQueuesResponse>
      METHOD_LIST_QUEUES = getListQueuesMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.tasks.v2beta3.ListQueuesRequest,
          com.google.cloud.tasks.v2beta3.ListQueuesResponse>
      getListQueuesMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.tasks.v2beta3.ListQueuesRequest,
          com.google.cloud.tasks.v2beta3.ListQueuesResponse>
      getListQueuesMethod() {
    return getListQueuesMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.tasks.v2beta3.ListQueuesRequest,
          com.google.cloud.tasks.v2beta3.ListQueuesResponse>
      getListQueuesMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.tasks.v2beta3.ListQueuesRequest,
            com.google.cloud.tasks.v2beta3.ListQueuesResponse>
        getListQueuesMethod;
    if ((getListQueuesMethod = CloudTasksGrpc.getListQueuesMethod) == null) {
      synchronized (CloudTasksGrpc.class) {
        if ((getListQueuesMethod = CloudTasksGrpc.getListQueuesMethod) == null) {
          CloudTasksGrpc.getListQueuesMethod =
              getListQueuesMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.tasks.v2beta3.ListQueuesRequest,
                          com.google.cloud.tasks.v2beta3.ListQueuesResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.tasks.v2beta3.CloudTasks", "ListQueues"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.tasks.v2beta3.ListQueuesRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.tasks.v2beta3.ListQueuesResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(new CloudTasksMethodDescriptorSupplier("ListQueues"))
                      .build();
        }
      }
    }
    return getListQueuesMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetQueueMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.tasks.v2beta3.GetQueueRequest, com.google.cloud.tasks.v2beta3.Queue>
      METHOD_GET_QUEUE = getGetQueueMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.tasks.v2beta3.GetQueueRequest, com.google.cloud.tasks.v2beta3.Queue>
      getGetQueueMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.tasks.v2beta3.GetQueueRequest, com.google.cloud.tasks.v2beta3.Queue>
      getGetQueueMethod() {
    return getGetQueueMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.tasks.v2beta3.GetQueueRequest, com.google.cloud.tasks.v2beta3.Queue>
      getGetQueueMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.tasks.v2beta3.GetQueueRequest, com.google.cloud.tasks.v2beta3.Queue>
        getGetQueueMethod;
    if ((getGetQueueMethod = CloudTasksGrpc.getGetQueueMethod) == null) {
      synchronized (CloudTasksGrpc.class) {
        if ((getGetQueueMethod = CloudTasksGrpc.getGetQueueMethod) == null) {
          CloudTasksGrpc.getGetQueueMethod =
              getGetQueueMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.tasks.v2beta3.GetQueueRequest,
                          com.google.cloud.tasks.v2beta3.Queue>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.tasks.v2beta3.CloudTasks", "GetQueue"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.tasks.v2beta3.GetQueueRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.tasks.v2beta3.Queue.getDefaultInstance()))
                      .setSchemaDescriptor(new CloudTasksMethodDescriptorSupplier("GetQueue"))
                      .build();
        }
      }
    }
    return getGetQueueMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCreateQueueMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.tasks.v2beta3.CreateQueueRequest, com.google.cloud.tasks.v2beta3.Queue>
      METHOD_CREATE_QUEUE = getCreateQueueMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.tasks.v2beta3.CreateQueueRequest, com.google.cloud.tasks.v2beta3.Queue>
      getCreateQueueMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.tasks.v2beta3.CreateQueueRequest, com.google.cloud.tasks.v2beta3.Queue>
      getCreateQueueMethod() {
    return getCreateQueueMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.tasks.v2beta3.CreateQueueRequest, com.google.cloud.tasks.v2beta3.Queue>
      getCreateQueueMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.tasks.v2beta3.CreateQueueRequest, com.google.cloud.tasks.v2beta3.Queue>
        getCreateQueueMethod;
    if ((getCreateQueueMethod = CloudTasksGrpc.getCreateQueueMethod) == null) {
      synchronized (CloudTasksGrpc.class) {
        if ((getCreateQueueMethod = CloudTasksGrpc.getCreateQueueMethod) == null) {
          CloudTasksGrpc.getCreateQueueMethod =
              getCreateQueueMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.tasks.v2beta3.CreateQueueRequest,
                          com.google.cloud.tasks.v2beta3.Queue>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.tasks.v2beta3.CloudTasks", "CreateQueue"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.tasks.v2beta3.CreateQueueRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.tasks.v2beta3.Queue.getDefaultInstance()))
                      .setSchemaDescriptor(new CloudTasksMethodDescriptorSupplier("CreateQueue"))
                      .build();
        }
      }
    }
    return getCreateQueueMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getUpdateQueueMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.tasks.v2beta3.UpdateQueueRequest, com.google.cloud.tasks.v2beta3.Queue>
      METHOD_UPDATE_QUEUE = getUpdateQueueMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.tasks.v2beta3.UpdateQueueRequest, com.google.cloud.tasks.v2beta3.Queue>
      getUpdateQueueMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.tasks.v2beta3.UpdateQueueRequest, com.google.cloud.tasks.v2beta3.Queue>
      getUpdateQueueMethod() {
    return getUpdateQueueMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.tasks.v2beta3.UpdateQueueRequest, com.google.cloud.tasks.v2beta3.Queue>
      getUpdateQueueMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.tasks.v2beta3.UpdateQueueRequest, com.google.cloud.tasks.v2beta3.Queue>
        getUpdateQueueMethod;
    if ((getUpdateQueueMethod = CloudTasksGrpc.getUpdateQueueMethod) == null) {
      synchronized (CloudTasksGrpc.class) {
        if ((getUpdateQueueMethod = CloudTasksGrpc.getUpdateQueueMethod) == null) {
          CloudTasksGrpc.getUpdateQueueMethod =
              getUpdateQueueMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.tasks.v2beta3.UpdateQueueRequest,
                          com.google.cloud.tasks.v2beta3.Queue>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.tasks.v2beta3.CloudTasks", "UpdateQueue"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.tasks.v2beta3.UpdateQueueRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.tasks.v2beta3.Queue.getDefaultInstance()))
                      .setSchemaDescriptor(new CloudTasksMethodDescriptorSupplier("UpdateQueue"))
                      .build();
        }
      }
    }
    return getUpdateQueueMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDeleteQueueMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.tasks.v2beta3.DeleteQueueRequest, com.google.protobuf.Empty>
      METHOD_DELETE_QUEUE = getDeleteQueueMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.tasks.v2beta3.DeleteQueueRequest, com.google.protobuf.Empty>
      getDeleteQueueMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.tasks.v2beta3.DeleteQueueRequest, com.google.protobuf.Empty>
      getDeleteQueueMethod() {
    return getDeleteQueueMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.tasks.v2beta3.DeleteQueueRequest, com.google.protobuf.Empty>
      getDeleteQueueMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.tasks.v2beta3.DeleteQueueRequest, com.google.protobuf.Empty>
        getDeleteQueueMethod;
    if ((getDeleteQueueMethod = CloudTasksGrpc.getDeleteQueueMethod) == null) {
      synchronized (CloudTasksGrpc.class) {
        if ((getDeleteQueueMethod = CloudTasksGrpc.getDeleteQueueMethod) == null) {
          CloudTasksGrpc.getDeleteQueueMethod =
              getDeleteQueueMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.tasks.v2beta3.DeleteQueueRequest,
                          com.google.protobuf.Empty>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.tasks.v2beta3.CloudTasks", "DeleteQueue"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.tasks.v2beta3.DeleteQueueRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.protobuf.Empty.getDefaultInstance()))
                      .setSchemaDescriptor(new CloudTasksMethodDescriptorSupplier("DeleteQueue"))
                      .build();
        }
      }
    }
    return getDeleteQueueMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getPurgeQueueMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.tasks.v2beta3.PurgeQueueRequest, com.google.cloud.tasks.v2beta3.Queue>
      METHOD_PURGE_QUEUE = getPurgeQueueMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.tasks.v2beta3.PurgeQueueRequest, com.google.cloud.tasks.v2beta3.Queue>
      getPurgeQueueMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.tasks.v2beta3.PurgeQueueRequest, com.google.cloud.tasks.v2beta3.Queue>
      getPurgeQueueMethod() {
    return getPurgeQueueMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.tasks.v2beta3.PurgeQueueRequest, com.google.cloud.tasks.v2beta3.Queue>
      getPurgeQueueMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.tasks.v2beta3.PurgeQueueRequest, com.google.cloud.tasks.v2beta3.Queue>
        getPurgeQueueMethod;
    if ((getPurgeQueueMethod = CloudTasksGrpc.getPurgeQueueMethod) == null) {
      synchronized (CloudTasksGrpc.class) {
        if ((getPurgeQueueMethod = CloudTasksGrpc.getPurgeQueueMethod) == null) {
          CloudTasksGrpc.getPurgeQueueMethod =
              getPurgeQueueMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.tasks.v2beta3.PurgeQueueRequest,
                          com.google.cloud.tasks.v2beta3.Queue>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.tasks.v2beta3.CloudTasks", "PurgeQueue"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.tasks.v2beta3.PurgeQueueRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.tasks.v2beta3.Queue.getDefaultInstance()))
                      .setSchemaDescriptor(new CloudTasksMethodDescriptorSupplier("PurgeQueue"))
                      .build();
        }
      }
    }
    return getPurgeQueueMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getPauseQueueMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.tasks.v2beta3.PauseQueueRequest, com.google.cloud.tasks.v2beta3.Queue>
      METHOD_PAUSE_QUEUE = getPauseQueueMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.tasks.v2beta3.PauseQueueRequest, com.google.cloud.tasks.v2beta3.Queue>
      getPauseQueueMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.tasks.v2beta3.PauseQueueRequest, com.google.cloud.tasks.v2beta3.Queue>
      getPauseQueueMethod() {
    return getPauseQueueMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.tasks.v2beta3.PauseQueueRequest, com.google.cloud.tasks.v2beta3.Queue>
      getPauseQueueMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.tasks.v2beta3.PauseQueueRequest, com.google.cloud.tasks.v2beta3.Queue>
        getPauseQueueMethod;
    if ((getPauseQueueMethod = CloudTasksGrpc.getPauseQueueMethod) == null) {
      synchronized (CloudTasksGrpc.class) {
        if ((getPauseQueueMethod = CloudTasksGrpc.getPauseQueueMethod) == null) {
          CloudTasksGrpc.getPauseQueueMethod =
              getPauseQueueMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.tasks.v2beta3.PauseQueueRequest,
                          com.google.cloud.tasks.v2beta3.Queue>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.tasks.v2beta3.CloudTasks", "PauseQueue"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.tasks.v2beta3.PauseQueueRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.tasks.v2beta3.Queue.getDefaultInstance()))
                      .setSchemaDescriptor(new CloudTasksMethodDescriptorSupplier("PauseQueue"))
                      .build();
        }
      }
    }
    return getPauseQueueMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getResumeQueueMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.tasks.v2beta3.ResumeQueueRequest, com.google.cloud.tasks.v2beta3.Queue>
      METHOD_RESUME_QUEUE = getResumeQueueMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.tasks.v2beta3.ResumeQueueRequest, com.google.cloud.tasks.v2beta3.Queue>
      getResumeQueueMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.tasks.v2beta3.ResumeQueueRequest, com.google.cloud.tasks.v2beta3.Queue>
      getResumeQueueMethod() {
    return getResumeQueueMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.tasks.v2beta3.ResumeQueueRequest, com.google.cloud.tasks.v2beta3.Queue>
      getResumeQueueMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.tasks.v2beta3.ResumeQueueRequest, com.google.cloud.tasks.v2beta3.Queue>
        getResumeQueueMethod;
    if ((getResumeQueueMethod = CloudTasksGrpc.getResumeQueueMethod) == null) {
      synchronized (CloudTasksGrpc.class) {
        if ((getResumeQueueMethod = CloudTasksGrpc.getResumeQueueMethod) == null) {
          CloudTasksGrpc.getResumeQueueMethod =
              getResumeQueueMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.tasks.v2beta3.ResumeQueueRequest,
                          com.google.cloud.tasks.v2beta3.Queue>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.tasks.v2beta3.CloudTasks", "ResumeQueue"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.tasks.v2beta3.ResumeQueueRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.tasks.v2beta3.Queue.getDefaultInstance()))
                      .setSchemaDescriptor(new CloudTasksMethodDescriptorSupplier("ResumeQueue"))
                      .build();
        }
      }
    }
    return getResumeQueueMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetIamPolicyMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.iam.v1.GetIamPolicyRequest, com.google.iam.v1.Policy>
      METHOD_GET_IAM_POLICY = getGetIamPolicyMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.iam.v1.GetIamPolicyRequest, com.google.iam.v1.Policy>
      getGetIamPolicyMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.iam.v1.GetIamPolicyRequest, com.google.iam.v1.Policy>
      getGetIamPolicyMethod() {
    return getGetIamPolicyMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.iam.v1.GetIamPolicyRequest, com.google.iam.v1.Policy>
      getGetIamPolicyMethodHelper() {
    io.grpc.MethodDescriptor<com.google.iam.v1.GetIamPolicyRequest, com.google.iam.v1.Policy>
        getGetIamPolicyMethod;
    if ((getGetIamPolicyMethod = CloudTasksGrpc.getGetIamPolicyMethod) == null) {
      synchronized (CloudTasksGrpc.class) {
        if ((getGetIamPolicyMethod = CloudTasksGrpc.getGetIamPolicyMethod) == null) {
          CloudTasksGrpc.getGetIamPolicyMethod =
              getGetIamPolicyMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.iam.v1.GetIamPolicyRequest, com.google.iam.v1.Policy>newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.tasks.v2beta3.CloudTasks", "GetIamPolicy"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.iam.v1.GetIamPolicyRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.iam.v1.Policy.getDefaultInstance()))
                      .setSchemaDescriptor(new CloudTasksMethodDescriptorSupplier("GetIamPolicy"))
                      .build();
        }
      }
    }
    return getGetIamPolicyMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSetIamPolicyMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.iam.v1.SetIamPolicyRequest, com.google.iam.v1.Policy>
      METHOD_SET_IAM_POLICY = getSetIamPolicyMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.iam.v1.SetIamPolicyRequest, com.google.iam.v1.Policy>
      getSetIamPolicyMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.iam.v1.SetIamPolicyRequest, com.google.iam.v1.Policy>
      getSetIamPolicyMethod() {
    return getSetIamPolicyMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.iam.v1.SetIamPolicyRequest, com.google.iam.v1.Policy>
      getSetIamPolicyMethodHelper() {
    io.grpc.MethodDescriptor<com.google.iam.v1.SetIamPolicyRequest, com.google.iam.v1.Policy>
        getSetIamPolicyMethod;
    if ((getSetIamPolicyMethod = CloudTasksGrpc.getSetIamPolicyMethod) == null) {
      synchronized (CloudTasksGrpc.class) {
        if ((getSetIamPolicyMethod = CloudTasksGrpc.getSetIamPolicyMethod) == null) {
          CloudTasksGrpc.getSetIamPolicyMethod =
              getSetIamPolicyMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.iam.v1.SetIamPolicyRequest, com.google.iam.v1.Policy>newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.tasks.v2beta3.CloudTasks", "SetIamPolicy"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.iam.v1.SetIamPolicyRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.iam.v1.Policy.getDefaultInstance()))
                      .setSchemaDescriptor(new CloudTasksMethodDescriptorSupplier("SetIamPolicy"))
                      .build();
        }
      }
    }
    return getSetIamPolicyMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getTestIamPermissionsMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.iam.v1.TestIamPermissionsRequest, com.google.iam.v1.TestIamPermissionsResponse>
      METHOD_TEST_IAM_PERMISSIONS = getTestIamPermissionsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.iam.v1.TestIamPermissionsRequest, com.google.iam.v1.TestIamPermissionsResponse>
      getTestIamPermissionsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.iam.v1.TestIamPermissionsRequest, com.google.iam.v1.TestIamPermissionsResponse>
      getTestIamPermissionsMethod() {
    return getTestIamPermissionsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.iam.v1.TestIamPermissionsRequest, com.google.iam.v1.TestIamPermissionsResponse>
      getTestIamPermissionsMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.iam.v1.TestIamPermissionsRequest,
            com.google.iam.v1.TestIamPermissionsResponse>
        getTestIamPermissionsMethod;
    if ((getTestIamPermissionsMethod = CloudTasksGrpc.getTestIamPermissionsMethod) == null) {
      synchronized (CloudTasksGrpc.class) {
        if ((getTestIamPermissionsMethod = CloudTasksGrpc.getTestIamPermissionsMethod) == null) {
          CloudTasksGrpc.getTestIamPermissionsMethod =
              getTestIamPermissionsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.iam.v1.TestIamPermissionsRequest,
                          com.google.iam.v1.TestIamPermissionsResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.tasks.v2beta3.CloudTasks", "TestIamPermissions"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.iam.v1.TestIamPermissionsRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.iam.v1.TestIamPermissionsResponse.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new CloudTasksMethodDescriptorSupplier("TestIamPermissions"))
                      .build();
        }
      }
    }
    return getTestIamPermissionsMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getListTasksMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.tasks.v2beta3.ListTasksRequest,
          com.google.cloud.tasks.v2beta3.ListTasksResponse>
      METHOD_LIST_TASKS = getListTasksMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.tasks.v2beta3.ListTasksRequest,
          com.google.cloud.tasks.v2beta3.ListTasksResponse>
      getListTasksMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.tasks.v2beta3.ListTasksRequest,
          com.google.cloud.tasks.v2beta3.ListTasksResponse>
      getListTasksMethod() {
    return getListTasksMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.tasks.v2beta3.ListTasksRequest,
          com.google.cloud.tasks.v2beta3.ListTasksResponse>
      getListTasksMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.tasks.v2beta3.ListTasksRequest,
            com.google.cloud.tasks.v2beta3.ListTasksResponse>
        getListTasksMethod;
    if ((getListTasksMethod = CloudTasksGrpc.getListTasksMethod) == null) {
      synchronized (CloudTasksGrpc.class) {
        if ((getListTasksMethod = CloudTasksGrpc.getListTasksMethod) == null) {
          CloudTasksGrpc.getListTasksMethod =
              getListTasksMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.tasks.v2beta3.ListTasksRequest,
                          com.google.cloud.tasks.v2beta3.ListTasksResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.tasks.v2beta3.CloudTasks", "ListTasks"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.tasks.v2beta3.ListTasksRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.tasks.v2beta3.ListTasksResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(new CloudTasksMethodDescriptorSupplier("ListTasks"))
                      .build();
        }
      }
    }
    return getListTasksMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetTaskMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.tasks.v2beta3.GetTaskRequest, com.google.cloud.tasks.v2beta3.Task>
      METHOD_GET_TASK = getGetTaskMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.tasks.v2beta3.GetTaskRequest, com.google.cloud.tasks.v2beta3.Task>
      getGetTaskMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.tasks.v2beta3.GetTaskRequest, com.google.cloud.tasks.v2beta3.Task>
      getGetTaskMethod() {
    return getGetTaskMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.tasks.v2beta3.GetTaskRequest, com.google.cloud.tasks.v2beta3.Task>
      getGetTaskMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.tasks.v2beta3.GetTaskRequest, com.google.cloud.tasks.v2beta3.Task>
        getGetTaskMethod;
    if ((getGetTaskMethod = CloudTasksGrpc.getGetTaskMethod) == null) {
      synchronized (CloudTasksGrpc.class) {
        if ((getGetTaskMethod = CloudTasksGrpc.getGetTaskMethod) == null) {
          CloudTasksGrpc.getGetTaskMethod =
              getGetTaskMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.tasks.v2beta3.GetTaskRequest,
                          com.google.cloud.tasks.v2beta3.Task>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.tasks.v2beta3.CloudTasks", "GetTask"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.tasks.v2beta3.GetTaskRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.tasks.v2beta3.Task.getDefaultInstance()))
                      .setSchemaDescriptor(new CloudTasksMethodDescriptorSupplier("GetTask"))
                      .build();
        }
      }
    }
    return getGetTaskMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCreateTaskMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.tasks.v2beta3.CreateTaskRequest, com.google.cloud.tasks.v2beta3.Task>
      METHOD_CREATE_TASK = getCreateTaskMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.tasks.v2beta3.CreateTaskRequest, com.google.cloud.tasks.v2beta3.Task>
      getCreateTaskMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.tasks.v2beta3.CreateTaskRequest, com.google.cloud.tasks.v2beta3.Task>
      getCreateTaskMethod() {
    return getCreateTaskMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.tasks.v2beta3.CreateTaskRequest, com.google.cloud.tasks.v2beta3.Task>
      getCreateTaskMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.tasks.v2beta3.CreateTaskRequest, com.google.cloud.tasks.v2beta3.Task>
        getCreateTaskMethod;
    if ((getCreateTaskMethod = CloudTasksGrpc.getCreateTaskMethod) == null) {
      synchronized (CloudTasksGrpc.class) {
        if ((getCreateTaskMethod = CloudTasksGrpc.getCreateTaskMethod) == null) {
          CloudTasksGrpc.getCreateTaskMethod =
              getCreateTaskMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.tasks.v2beta3.CreateTaskRequest,
                          com.google.cloud.tasks.v2beta3.Task>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.tasks.v2beta3.CloudTasks", "CreateTask"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.tasks.v2beta3.CreateTaskRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.tasks.v2beta3.Task.getDefaultInstance()))
                      .setSchemaDescriptor(new CloudTasksMethodDescriptorSupplier("CreateTask"))
                      .build();
        }
      }
    }
    return getCreateTaskMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDeleteTaskMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.tasks.v2beta3.DeleteTaskRequest, com.google.protobuf.Empty>
      METHOD_DELETE_TASK = getDeleteTaskMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.tasks.v2beta3.DeleteTaskRequest, com.google.protobuf.Empty>
      getDeleteTaskMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.tasks.v2beta3.DeleteTaskRequest, com.google.protobuf.Empty>
      getDeleteTaskMethod() {
    return getDeleteTaskMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.tasks.v2beta3.DeleteTaskRequest, com.google.protobuf.Empty>
      getDeleteTaskMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.tasks.v2beta3.DeleteTaskRequest, com.google.protobuf.Empty>
        getDeleteTaskMethod;
    if ((getDeleteTaskMethod = CloudTasksGrpc.getDeleteTaskMethod) == null) {
      synchronized (CloudTasksGrpc.class) {
        if ((getDeleteTaskMethod = CloudTasksGrpc.getDeleteTaskMethod) == null) {
          CloudTasksGrpc.getDeleteTaskMethod =
              getDeleteTaskMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.tasks.v2beta3.DeleteTaskRequest, com.google.protobuf.Empty>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.tasks.v2beta3.CloudTasks", "DeleteTask"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.tasks.v2beta3.DeleteTaskRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.protobuf.Empty.getDefaultInstance()))
                      .setSchemaDescriptor(new CloudTasksMethodDescriptorSupplier("DeleteTask"))
                      .build();
        }
      }
    }
    return getDeleteTaskMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getRunTaskMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.tasks.v2beta3.RunTaskRequest, com.google.cloud.tasks.v2beta3.Task>
      METHOD_RUN_TASK = getRunTaskMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.tasks.v2beta3.RunTaskRequest, com.google.cloud.tasks.v2beta3.Task>
      getRunTaskMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.tasks.v2beta3.RunTaskRequest, com.google.cloud.tasks.v2beta3.Task>
      getRunTaskMethod() {
    return getRunTaskMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.tasks.v2beta3.RunTaskRequest, com.google.cloud.tasks.v2beta3.Task>
      getRunTaskMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.tasks.v2beta3.RunTaskRequest, com.google.cloud.tasks.v2beta3.Task>
        getRunTaskMethod;
    if ((getRunTaskMethod = CloudTasksGrpc.getRunTaskMethod) == null) {
      synchronized (CloudTasksGrpc.class) {
        if ((getRunTaskMethod = CloudTasksGrpc.getRunTaskMethod) == null) {
          CloudTasksGrpc.getRunTaskMethod =
              getRunTaskMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.tasks.v2beta3.RunTaskRequest,
                          com.google.cloud.tasks.v2beta3.Task>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.tasks.v2beta3.CloudTasks", "RunTask"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.tasks.v2beta3.RunTaskRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.tasks.v2beta3.Task.getDefaultInstance()))
                      .setSchemaDescriptor(new CloudTasksMethodDescriptorSupplier("RunTask"))
                      .build();
        }
      }
    }
    return getRunTaskMethod;
  }

  /** Creates a new async stub that supports all call types for the service */
  public static CloudTasksStub newStub(io.grpc.Channel channel) {
    return new CloudTasksStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CloudTasksBlockingStub newBlockingStub(io.grpc.Channel channel) {
    return new CloudTasksBlockingStub(channel);
  }

  /** Creates a new ListenableFuture-style stub that supports unary calls on the service */
  public static CloudTasksFutureStub newFutureStub(io.grpc.Channel channel) {
    return new CloudTasksFutureStub(channel);
  }

  /**
   *
   *
   * <pre>
   * Cloud Tasks allows developers to manage the execution of background
   * work in their applications.
   * </pre>
   */
  public abstract static class CloudTasksImplBase implements io.grpc.BindableService {

    /**
     *
     *
     * <pre>
     * Lists queues.
     * Queues are returned in lexicographical order.
     * </pre>
     */
    public void listQueues(
        com.google.cloud.tasks.v2beta3.ListQueuesRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.tasks.v2beta3.ListQueuesResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getListQueuesMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets a queue.
     * </pre>
     */
    public void getQueue(
        com.google.cloud.tasks.v2beta3.GetQueueRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.tasks.v2beta3.Queue> responseObserver) {
      asyncUnimplementedUnaryCall(getGetQueueMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates a queue.
     * Queues created with this method allow tasks to live for a maximum of 31
     * days. After a task is 31 days old, the task will be deleted regardless of whether
     * it was dispatched or not.
     * WARNING: Using this method may have unintended side effects if you are
     * using an App Engine `queue.yaml` or `queue.xml` file to manage your queues.
     * Read
     * [Overview of Queue Management and
     * queue.yaml](https://cloud.google.com/tasks/docs/queue-yaml) before using
     * this method.
     * </pre>
     */
    public void createQueue(
        com.google.cloud.tasks.v2beta3.CreateQueueRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.tasks.v2beta3.Queue> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateQueueMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Updates a queue.
     * This method creates the queue if it does not exist and updates
     * the queue if it does exist.
     * Queues created with this method allow tasks to live for a maximum of 31
     * days. After a task is 31 days old, the task will be deleted regardless of whether
     * it was dispatched or not.
     * WARNING: Using this method may have unintended side effects if you are
     * using an App Engine `queue.yaml` or `queue.xml` file to manage your queues.
     * Read
     * [Overview of Queue Management and
     * queue.yaml](https://cloud.google.com/tasks/docs/queue-yaml) before using
     * this method.
     * </pre>
     */
    public void updateQueue(
        com.google.cloud.tasks.v2beta3.UpdateQueueRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.tasks.v2beta3.Queue> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateQueueMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes a queue.
     * This command will delete the queue even if it has tasks in it.
     * Note: If you delete a queue, a queue with the same name can't be created
     * for 7 days.
     * WARNING: Using this method may have unintended side effects if you are
     * using an App Engine `queue.yaml` or `queue.xml` file to manage your queues.
     * Read
     * [Overview of Queue Management and
     * queue.yaml](https://cloud.google.com/tasks/docs/queue-yaml) before using
     * this method.
     * </pre>
     */
    public void deleteQueue(
        com.google.cloud.tasks.v2beta3.DeleteQueueRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteQueueMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Purges a queue by deleting all of its tasks.
     * All tasks created before this method is called are permanently deleted.
     * Purge operations can take up to one minute to take effect. Tasks
     * might be dispatched before the purge takes effect. A purge is irreversible.
     * </pre>
     */
    public void purgeQueue(
        com.google.cloud.tasks.v2beta3.PurgeQueueRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.tasks.v2beta3.Queue> responseObserver) {
      asyncUnimplementedUnaryCall(getPurgeQueueMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Pauses the queue.
     * If a queue is paused then the system will stop dispatching tasks
     * until the queue is resumed via
     * [ResumeQueue][google.cloud.tasks.v2beta3.CloudTasks.ResumeQueue]. Tasks can still be added
     * when the queue is paused. A queue is paused if its
     * [state][google.cloud.tasks.v2beta3.Queue.state] is [PAUSED][google.cloud.tasks.v2beta3.Queue.State.PAUSED].
     * </pre>
     */
    public void pauseQueue(
        com.google.cloud.tasks.v2beta3.PauseQueueRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.tasks.v2beta3.Queue> responseObserver) {
      asyncUnimplementedUnaryCall(getPauseQueueMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Resume a queue.
     * This method resumes a queue after it has been
     * [PAUSED][google.cloud.tasks.v2beta3.Queue.State.PAUSED] or
     * [DISABLED][google.cloud.tasks.v2beta3.Queue.State.DISABLED]. The state of a queue is stored
     * in the queue's [state][google.cloud.tasks.v2beta3.Queue.state]; after calling this method it
     * will be set to [RUNNING][google.cloud.tasks.v2beta3.Queue.State.RUNNING].
     * WARNING: Resuming many high-QPS queues at the same time can
     * lead to target overloading. If you are resuming high-QPS
     * queues, follow the 500/50/5 pattern described in
     * [Managing Cloud Tasks Scaling
     * Risks](https://cloud.google.com/tasks/docs/manage-cloud-task-scaling).
     * </pre>
     */
    public void resumeQueue(
        com.google.cloud.tasks.v2beta3.ResumeQueueRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.tasks.v2beta3.Queue> responseObserver) {
      asyncUnimplementedUnaryCall(getResumeQueueMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets the access control policy for a [Queue][google.cloud.tasks.v2beta3.Queue].
     * Returns an empty policy if the resource exists and does not have a policy
     * set.
     * Authorization requires the following
     * [Google IAM](https://cloud.google.com/iam) permission on the specified
     * resource parent:
     * * `cloudtasks.queues.getIamPolicy`
     * </pre>
     */
    public void getIamPolicy(
        com.google.iam.v1.GetIamPolicyRequest request,
        io.grpc.stub.StreamObserver<com.google.iam.v1.Policy> responseObserver) {
      asyncUnimplementedUnaryCall(getGetIamPolicyMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Sets the access control policy for a [Queue][google.cloud.tasks.v2beta3.Queue]. Replaces any existing
     * policy.
     * Note: The Cloud Console does not check queue-level IAM permissions yet.
     * Project-level permissions are required to use the Cloud Console.
     * Authorization requires the following
     * [Google IAM](https://cloud.google.com/iam) permission on the specified
     * resource parent:
     * * `cloudtasks.queues.setIamPolicy`
     * </pre>
     */
    public void setIamPolicy(
        com.google.iam.v1.SetIamPolicyRequest request,
        io.grpc.stub.StreamObserver<com.google.iam.v1.Policy> responseObserver) {
      asyncUnimplementedUnaryCall(getSetIamPolicyMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Returns permissions that a caller has on a [Queue][google.cloud.tasks.v2beta3.Queue].
     * If the resource does not exist, this will return an empty set of
     * permissions, not a [NOT_FOUND][google.rpc.Code.NOT_FOUND] error.
     * Note: This operation is designed to be used for building permission-aware
     * UIs and command-line tools, not for authorization checking. This operation
     * may "fail open" without warning.
     * </pre>
     */
    public void testIamPermissions(
        com.google.iam.v1.TestIamPermissionsRequest request,
        io.grpc.stub.StreamObserver<com.google.iam.v1.TestIamPermissionsResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getTestIamPermissionsMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists the tasks in a queue.
     * By default, only the [BASIC][google.cloud.tasks.v2beta3.Task.View.BASIC] view is retrieved
     * due to performance considerations;
     * [response_view][google.cloud.tasks.v2beta3.ListTasksRequest.response_view] controls the
     * subset of information which is returned.
     * The tasks may be returned in any order. The ordering may change at any
     * time.
     * </pre>
     */
    public void listTasks(
        com.google.cloud.tasks.v2beta3.ListTasksRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.tasks.v2beta3.ListTasksResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getListTasksMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets a task.
     * </pre>
     */
    public void getTask(
        com.google.cloud.tasks.v2beta3.GetTaskRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.tasks.v2beta3.Task> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTaskMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates a task and adds it to a queue.
     * Tasks cannot be updated after creation; there is no UpdateTask command.
     * * The maximum task size is 100KB.
     * </pre>
     */
    public void createTask(
        com.google.cloud.tasks.v2beta3.CreateTaskRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.tasks.v2beta3.Task> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateTaskMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes a task.
     * A task can be deleted if it is scheduled or dispatched. A task
     * cannot be deleted if it has executed successfully or permanently
     * failed.
     * </pre>
     */
    public void deleteTask(
        com.google.cloud.tasks.v2beta3.DeleteTaskRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteTaskMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Forces a task to run now.
     * When this method is called, Cloud Tasks will dispatch the task, even if
     * the task is already running, the queue has reached its [RateLimits][google.cloud.tasks.v2beta3.RateLimits] or
     * is [PAUSED][google.cloud.tasks.v2beta3.Queue.State.PAUSED].
     * This command is meant to be used for manual debugging. For
     * example, [RunTask][google.cloud.tasks.v2beta3.CloudTasks.RunTask] can be used to retry a failed
     * task after a fix has been made or to manually force a task to be
     * dispatched now.
     * The dispatched task is returned. That is, the task that is returned
     * contains the [status][Task.status] after the task is dispatched but
     * before the task is received by its target.
     * If Cloud Tasks receives a successful response from the task's
     * target, then the task will be deleted; otherwise the task's
     * [schedule_time][google.cloud.tasks.v2beta3.Task.schedule_time] will be reset to the time that
     * [RunTask][google.cloud.tasks.v2beta3.CloudTasks.RunTask] was called plus the retry delay specified
     * in the queue's [RetryConfig][google.cloud.tasks.v2beta3.RetryConfig].
     * [RunTask][google.cloud.tasks.v2beta3.CloudTasks.RunTask] returns
     * [NOT_FOUND][google.rpc.Code.NOT_FOUND] when it is called on a
     * task that has already succeeded or permanently failed.
     * </pre>
     */
    public void runTask(
        com.google.cloud.tasks.v2beta3.RunTaskRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.tasks.v2beta3.Task> responseObserver) {
      asyncUnimplementedUnaryCall(getRunTaskMethodHelper(), responseObserver);
    }

    @java.lang.Override
    public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
              getListQueuesMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.tasks.v2beta3.ListQueuesRequest,
                      com.google.cloud.tasks.v2beta3.ListQueuesResponse>(
                      this, METHODID_LIST_QUEUES)))
          .addMethod(
              getGetQueueMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.tasks.v2beta3.GetQueueRequest,
                      com.google.cloud.tasks.v2beta3.Queue>(this, METHODID_GET_QUEUE)))
          .addMethod(
              getCreateQueueMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.tasks.v2beta3.CreateQueueRequest,
                      com.google.cloud.tasks.v2beta3.Queue>(this, METHODID_CREATE_QUEUE)))
          .addMethod(
              getUpdateQueueMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.tasks.v2beta3.UpdateQueueRequest,
                      com.google.cloud.tasks.v2beta3.Queue>(this, METHODID_UPDATE_QUEUE)))
          .addMethod(
              getDeleteQueueMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.tasks.v2beta3.DeleteQueueRequest, com.google.protobuf.Empty>(
                      this, METHODID_DELETE_QUEUE)))
          .addMethod(
              getPurgeQueueMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.tasks.v2beta3.PurgeQueueRequest,
                      com.google.cloud.tasks.v2beta3.Queue>(this, METHODID_PURGE_QUEUE)))
          .addMethod(
              getPauseQueueMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.tasks.v2beta3.PauseQueueRequest,
                      com.google.cloud.tasks.v2beta3.Queue>(this, METHODID_PAUSE_QUEUE)))
          .addMethod(
              getResumeQueueMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.tasks.v2beta3.ResumeQueueRequest,
                      com.google.cloud.tasks.v2beta3.Queue>(this, METHODID_RESUME_QUEUE)))
          .addMethod(
              getGetIamPolicyMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.iam.v1.GetIamPolicyRequest, com.google.iam.v1.Policy>(
                      this, METHODID_GET_IAM_POLICY)))
          .addMethod(
              getSetIamPolicyMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.iam.v1.SetIamPolicyRequest, com.google.iam.v1.Policy>(
                      this, METHODID_SET_IAM_POLICY)))
          .addMethod(
              getTestIamPermissionsMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.iam.v1.TestIamPermissionsRequest,
                      com.google.iam.v1.TestIamPermissionsResponse>(
                      this, METHODID_TEST_IAM_PERMISSIONS)))
          .addMethod(
              getListTasksMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.tasks.v2beta3.ListTasksRequest,
                      com.google.cloud.tasks.v2beta3.ListTasksResponse>(this, METHODID_LIST_TASKS)))
          .addMethod(
              getGetTaskMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.tasks.v2beta3.GetTaskRequest,
                      com.google.cloud.tasks.v2beta3.Task>(this, METHODID_GET_TASK)))
          .addMethod(
              getCreateTaskMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.tasks.v2beta3.CreateTaskRequest,
                      com.google.cloud.tasks.v2beta3.Task>(this, METHODID_CREATE_TASK)))
          .addMethod(
              getDeleteTaskMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.tasks.v2beta3.DeleteTaskRequest, com.google.protobuf.Empty>(
                      this, METHODID_DELETE_TASK)))
          .addMethod(
              getRunTaskMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.tasks.v2beta3.RunTaskRequest,
                      com.google.cloud.tasks.v2beta3.Task>(this, METHODID_RUN_TASK)))
          .build();
    }
  }

  /**
   *
   *
   * <pre>
   * Cloud Tasks allows developers to manage the execution of background
   * work in their applications.
   * </pre>
   */
  public static final class CloudTasksStub extends io.grpc.stub.AbstractStub<CloudTasksStub> {
    private CloudTasksStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CloudTasksStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CloudTasksStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CloudTasksStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Lists queues.
     * Queues are returned in lexicographical order.
     * </pre>
     */
    public void listQueues(
        com.google.cloud.tasks.v2beta3.ListQueuesRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.tasks.v2beta3.ListQueuesResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListQueuesMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets a queue.
     * </pre>
     */
    public void getQueue(
        com.google.cloud.tasks.v2beta3.GetQueueRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.tasks.v2beta3.Queue> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetQueueMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates a queue.
     * Queues created with this method allow tasks to live for a maximum of 31
     * days. After a task is 31 days old, the task will be deleted regardless of whether
     * it was dispatched or not.
     * WARNING: Using this method may have unintended side effects if you are
     * using an App Engine `queue.yaml` or `queue.xml` file to manage your queues.
     * Read
     * [Overview of Queue Management and
     * queue.yaml](https://cloud.google.com/tasks/docs/queue-yaml) before using
     * this method.
     * </pre>
     */
    public void createQueue(
        com.google.cloud.tasks.v2beta3.CreateQueueRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.tasks.v2beta3.Queue> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateQueueMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Updates a queue.
     * This method creates the queue if it does not exist and updates
     * the queue if it does exist.
     * Queues created with this method allow tasks to live for a maximum of 31
     * days. After a task is 31 days old, the task will be deleted regardless of whether
     * it was dispatched or not.
     * WARNING: Using this method may have unintended side effects if you are
     * using an App Engine `queue.yaml` or `queue.xml` file to manage your queues.
     * Read
     * [Overview of Queue Management and
     * queue.yaml](https://cloud.google.com/tasks/docs/queue-yaml) before using
     * this method.
     * </pre>
     */
    public void updateQueue(
        com.google.cloud.tasks.v2beta3.UpdateQueueRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.tasks.v2beta3.Queue> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateQueueMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes a queue.
     * This command will delete the queue even if it has tasks in it.
     * Note: If you delete a queue, a queue with the same name can't be created
     * for 7 days.
     * WARNING: Using this method may have unintended side effects if you are
     * using an App Engine `queue.yaml` or `queue.xml` file to manage your queues.
     * Read
     * [Overview of Queue Management and
     * queue.yaml](https://cloud.google.com/tasks/docs/queue-yaml) before using
     * this method.
     * </pre>
     */
    public void deleteQueue(
        com.google.cloud.tasks.v2beta3.DeleteQueueRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteQueueMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Purges a queue by deleting all of its tasks.
     * All tasks created before this method is called are permanently deleted.
     * Purge operations can take up to one minute to take effect. Tasks
     * might be dispatched before the purge takes effect. A purge is irreversible.
     * </pre>
     */
    public void purgeQueue(
        com.google.cloud.tasks.v2beta3.PurgeQueueRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.tasks.v2beta3.Queue> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPurgeQueueMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Pauses the queue.
     * If a queue is paused then the system will stop dispatching tasks
     * until the queue is resumed via
     * [ResumeQueue][google.cloud.tasks.v2beta3.CloudTasks.ResumeQueue]. Tasks can still be added
     * when the queue is paused. A queue is paused if its
     * [state][google.cloud.tasks.v2beta3.Queue.state] is [PAUSED][google.cloud.tasks.v2beta3.Queue.State.PAUSED].
     * </pre>
     */
    public void pauseQueue(
        com.google.cloud.tasks.v2beta3.PauseQueueRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.tasks.v2beta3.Queue> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPauseQueueMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Resume a queue.
     * This method resumes a queue after it has been
     * [PAUSED][google.cloud.tasks.v2beta3.Queue.State.PAUSED] or
     * [DISABLED][google.cloud.tasks.v2beta3.Queue.State.DISABLED]. The state of a queue is stored
     * in the queue's [state][google.cloud.tasks.v2beta3.Queue.state]; after calling this method it
     * will be set to [RUNNING][google.cloud.tasks.v2beta3.Queue.State.RUNNING].
     * WARNING: Resuming many high-QPS queues at the same time can
     * lead to target overloading. If you are resuming high-QPS
     * queues, follow the 500/50/5 pattern described in
     * [Managing Cloud Tasks Scaling
     * Risks](https://cloud.google.com/tasks/docs/manage-cloud-task-scaling).
     * </pre>
     */
    public void resumeQueue(
        com.google.cloud.tasks.v2beta3.ResumeQueueRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.tasks.v2beta3.Queue> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getResumeQueueMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets the access control policy for a [Queue][google.cloud.tasks.v2beta3.Queue].
     * Returns an empty policy if the resource exists and does not have a policy
     * set.
     * Authorization requires the following
     * [Google IAM](https://cloud.google.com/iam) permission on the specified
     * resource parent:
     * * `cloudtasks.queues.getIamPolicy`
     * </pre>
     */
    public void getIamPolicy(
        com.google.iam.v1.GetIamPolicyRequest request,
        io.grpc.stub.StreamObserver<com.google.iam.v1.Policy> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetIamPolicyMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Sets the access control policy for a [Queue][google.cloud.tasks.v2beta3.Queue]. Replaces any existing
     * policy.
     * Note: The Cloud Console does not check queue-level IAM permissions yet.
     * Project-level permissions are required to use the Cloud Console.
     * Authorization requires the following
     * [Google IAM](https://cloud.google.com/iam) permission on the specified
     * resource parent:
     * * `cloudtasks.queues.setIamPolicy`
     * </pre>
     */
    public void setIamPolicy(
        com.google.iam.v1.SetIamPolicyRequest request,
        io.grpc.stub.StreamObserver<com.google.iam.v1.Policy> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetIamPolicyMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Returns permissions that a caller has on a [Queue][google.cloud.tasks.v2beta3.Queue].
     * If the resource does not exist, this will return an empty set of
     * permissions, not a [NOT_FOUND][google.rpc.Code.NOT_FOUND] error.
     * Note: This operation is designed to be used for building permission-aware
     * UIs and command-line tools, not for authorization checking. This operation
     * may "fail open" without warning.
     * </pre>
     */
    public void testIamPermissions(
        com.google.iam.v1.TestIamPermissionsRequest request,
        io.grpc.stub.StreamObserver<com.google.iam.v1.TestIamPermissionsResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTestIamPermissionsMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists the tasks in a queue.
     * By default, only the [BASIC][google.cloud.tasks.v2beta3.Task.View.BASIC] view is retrieved
     * due to performance considerations;
     * [response_view][google.cloud.tasks.v2beta3.ListTasksRequest.response_view] controls the
     * subset of information which is returned.
     * The tasks may be returned in any order. The ordering may change at any
     * time.
     * </pre>
     */
    public void listTasks(
        com.google.cloud.tasks.v2beta3.ListTasksRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.tasks.v2beta3.ListTasksResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListTasksMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets a task.
     * </pre>
     */
    public void getTask(
        com.google.cloud.tasks.v2beta3.GetTaskRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.tasks.v2beta3.Task> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTaskMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates a task and adds it to a queue.
     * Tasks cannot be updated after creation; there is no UpdateTask command.
     * * The maximum task size is 100KB.
     * </pre>
     */
    public void createTask(
        com.google.cloud.tasks.v2beta3.CreateTaskRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.tasks.v2beta3.Task> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateTaskMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes a task.
     * A task can be deleted if it is scheduled or dispatched. A task
     * cannot be deleted if it has executed successfully or permanently
     * failed.
     * </pre>
     */
    public void deleteTask(
        com.google.cloud.tasks.v2beta3.DeleteTaskRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteTaskMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Forces a task to run now.
     * When this method is called, Cloud Tasks will dispatch the task, even if
     * the task is already running, the queue has reached its [RateLimits][google.cloud.tasks.v2beta3.RateLimits] or
     * is [PAUSED][google.cloud.tasks.v2beta3.Queue.State.PAUSED].
     * This command is meant to be used for manual debugging. For
     * example, [RunTask][google.cloud.tasks.v2beta3.CloudTasks.RunTask] can be used to retry a failed
     * task after a fix has been made or to manually force a task to be
     * dispatched now.
     * The dispatched task is returned. That is, the task that is returned
     * contains the [status][Task.status] after the task is dispatched but
     * before the task is received by its target.
     * If Cloud Tasks receives a successful response from the task's
     * target, then the task will be deleted; otherwise the task's
     * [schedule_time][google.cloud.tasks.v2beta3.Task.schedule_time] will be reset to the time that
     * [RunTask][google.cloud.tasks.v2beta3.CloudTasks.RunTask] was called plus the retry delay specified
     * in the queue's [RetryConfig][google.cloud.tasks.v2beta3.RetryConfig].
     * [RunTask][google.cloud.tasks.v2beta3.CloudTasks.RunTask] returns
     * [NOT_FOUND][google.rpc.Code.NOT_FOUND] when it is called on a
     * task that has already succeeded or permanently failed.
     * </pre>
     */
    public void runTask(
        com.google.cloud.tasks.v2beta3.RunTaskRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.tasks.v2beta3.Task> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRunTaskMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }
  }

  /**
   *
   *
   * <pre>
   * Cloud Tasks allows developers to manage the execution of background
   * work in their applications.
   * </pre>
   */
  public static final class CloudTasksBlockingStub
      extends io.grpc.stub.AbstractStub<CloudTasksBlockingStub> {
    private CloudTasksBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CloudTasksBlockingStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CloudTasksBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CloudTasksBlockingStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Lists queues.
     * Queues are returned in lexicographical order.
     * </pre>
     */
    public com.google.cloud.tasks.v2beta3.ListQueuesResponse listQueues(
        com.google.cloud.tasks.v2beta3.ListQueuesRequest request) {
      return blockingUnaryCall(
          getChannel(), getListQueuesMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Gets a queue.
     * </pre>
     */
    public com.google.cloud.tasks.v2beta3.Queue getQueue(
        com.google.cloud.tasks.v2beta3.GetQueueRequest request) {
      return blockingUnaryCall(getChannel(), getGetQueueMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Creates a queue.
     * Queues created with this method allow tasks to live for a maximum of 31
     * days. After a task is 31 days old, the task will be deleted regardless of whether
     * it was dispatched or not.
     * WARNING: Using this method may have unintended side effects if you are
     * using an App Engine `queue.yaml` or `queue.xml` file to manage your queues.
     * Read
     * [Overview of Queue Management and
     * queue.yaml](https://cloud.google.com/tasks/docs/queue-yaml) before using
     * this method.
     * </pre>
     */
    public com.google.cloud.tasks.v2beta3.Queue createQueue(
        com.google.cloud.tasks.v2beta3.CreateQueueRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateQueueMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Updates a queue.
     * This method creates the queue if it does not exist and updates
     * the queue if it does exist.
     * Queues created with this method allow tasks to live for a maximum of 31
     * days. After a task is 31 days old, the task will be deleted regardless of whether
     * it was dispatched or not.
     * WARNING: Using this method may have unintended side effects if you are
     * using an App Engine `queue.yaml` or `queue.xml` file to manage your queues.
     * Read
     * [Overview of Queue Management and
     * queue.yaml](https://cloud.google.com/tasks/docs/queue-yaml) before using
     * this method.
     * </pre>
     */
    public com.google.cloud.tasks.v2beta3.Queue updateQueue(
        com.google.cloud.tasks.v2beta3.UpdateQueueRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateQueueMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes a queue.
     * This command will delete the queue even if it has tasks in it.
     * Note: If you delete a queue, a queue with the same name can't be created
     * for 7 days.
     * WARNING: Using this method may have unintended side effects if you are
     * using an App Engine `queue.yaml` or `queue.xml` file to manage your queues.
     * Read
     * [Overview of Queue Management and
     * queue.yaml](https://cloud.google.com/tasks/docs/queue-yaml) before using
     * this method.
     * </pre>
     */
    public com.google.protobuf.Empty deleteQueue(
        com.google.cloud.tasks.v2beta3.DeleteQueueRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteQueueMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Purges a queue by deleting all of its tasks.
     * All tasks created before this method is called are permanently deleted.
     * Purge operations can take up to one minute to take effect. Tasks
     * might be dispatched before the purge takes effect. A purge is irreversible.
     * </pre>
     */
    public com.google.cloud.tasks.v2beta3.Queue purgeQueue(
        com.google.cloud.tasks.v2beta3.PurgeQueueRequest request) {
      return blockingUnaryCall(
          getChannel(), getPurgeQueueMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Pauses the queue.
     * If a queue is paused then the system will stop dispatching tasks
     * until the queue is resumed via
     * [ResumeQueue][google.cloud.tasks.v2beta3.CloudTasks.ResumeQueue]. Tasks can still be added
     * when the queue is paused. A queue is paused if its
     * [state][google.cloud.tasks.v2beta3.Queue.state] is [PAUSED][google.cloud.tasks.v2beta3.Queue.State.PAUSED].
     * </pre>
     */
    public com.google.cloud.tasks.v2beta3.Queue pauseQueue(
        com.google.cloud.tasks.v2beta3.PauseQueueRequest request) {
      return blockingUnaryCall(
          getChannel(), getPauseQueueMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Resume a queue.
     * This method resumes a queue after it has been
     * [PAUSED][google.cloud.tasks.v2beta3.Queue.State.PAUSED] or
     * [DISABLED][google.cloud.tasks.v2beta3.Queue.State.DISABLED]. The state of a queue is stored
     * in the queue's [state][google.cloud.tasks.v2beta3.Queue.state]; after calling this method it
     * will be set to [RUNNING][google.cloud.tasks.v2beta3.Queue.State.RUNNING].
     * WARNING: Resuming many high-QPS queues at the same time can
     * lead to target overloading. If you are resuming high-QPS
     * queues, follow the 500/50/5 pattern described in
     * [Managing Cloud Tasks Scaling
     * Risks](https://cloud.google.com/tasks/docs/manage-cloud-task-scaling).
     * </pre>
     */
    public com.google.cloud.tasks.v2beta3.Queue resumeQueue(
        com.google.cloud.tasks.v2beta3.ResumeQueueRequest request) {
      return blockingUnaryCall(
          getChannel(), getResumeQueueMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Gets the access control policy for a [Queue][google.cloud.tasks.v2beta3.Queue].
     * Returns an empty policy if the resource exists and does not have a policy
     * set.
     * Authorization requires the following
     * [Google IAM](https://cloud.google.com/iam) permission on the specified
     * resource parent:
     * * `cloudtasks.queues.getIamPolicy`
     * </pre>
     */
    public com.google.iam.v1.Policy getIamPolicy(com.google.iam.v1.GetIamPolicyRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetIamPolicyMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Sets the access control policy for a [Queue][google.cloud.tasks.v2beta3.Queue]. Replaces any existing
     * policy.
     * Note: The Cloud Console does not check queue-level IAM permissions yet.
     * Project-level permissions are required to use the Cloud Console.
     * Authorization requires the following
     * [Google IAM](https://cloud.google.com/iam) permission on the specified
     * resource parent:
     * * `cloudtasks.queues.setIamPolicy`
     * </pre>
     */
    public com.google.iam.v1.Policy setIamPolicy(com.google.iam.v1.SetIamPolicyRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetIamPolicyMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Returns permissions that a caller has on a [Queue][google.cloud.tasks.v2beta3.Queue].
     * If the resource does not exist, this will return an empty set of
     * permissions, not a [NOT_FOUND][google.rpc.Code.NOT_FOUND] error.
     * Note: This operation is designed to be used for building permission-aware
     * UIs and command-line tools, not for authorization checking. This operation
     * may "fail open" without warning.
     * </pre>
     */
    public com.google.iam.v1.TestIamPermissionsResponse testIamPermissions(
        com.google.iam.v1.TestIamPermissionsRequest request) {
      return blockingUnaryCall(
          getChannel(), getTestIamPermissionsMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Lists the tasks in a queue.
     * By default, only the [BASIC][google.cloud.tasks.v2beta3.Task.View.BASIC] view is retrieved
     * due to performance considerations;
     * [response_view][google.cloud.tasks.v2beta3.ListTasksRequest.response_view] controls the
     * subset of information which is returned.
     * The tasks may be returned in any order. The ordering may change at any
     * time.
     * </pre>
     */
    public com.google.cloud.tasks.v2beta3.ListTasksResponse listTasks(
        com.google.cloud.tasks.v2beta3.ListTasksRequest request) {
      return blockingUnaryCall(getChannel(), getListTasksMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Gets a task.
     * </pre>
     */
    public com.google.cloud.tasks.v2beta3.Task getTask(
        com.google.cloud.tasks.v2beta3.GetTaskRequest request) {
      return blockingUnaryCall(getChannel(), getGetTaskMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Creates a task and adds it to a queue.
     * Tasks cannot be updated after creation; there is no UpdateTask command.
     * * The maximum task size is 100KB.
     * </pre>
     */
    public com.google.cloud.tasks.v2beta3.Task createTask(
        com.google.cloud.tasks.v2beta3.CreateTaskRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateTaskMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes a task.
     * A task can be deleted if it is scheduled or dispatched. A task
     * cannot be deleted if it has executed successfully or permanently
     * failed.
     * </pre>
     */
    public com.google.protobuf.Empty deleteTask(
        com.google.cloud.tasks.v2beta3.DeleteTaskRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteTaskMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Forces a task to run now.
     * When this method is called, Cloud Tasks will dispatch the task, even if
     * the task is already running, the queue has reached its [RateLimits][google.cloud.tasks.v2beta3.RateLimits] or
     * is [PAUSED][google.cloud.tasks.v2beta3.Queue.State.PAUSED].
     * This command is meant to be used for manual debugging. For
     * example, [RunTask][google.cloud.tasks.v2beta3.CloudTasks.RunTask] can be used to retry a failed
     * task after a fix has been made or to manually force a task to be
     * dispatched now.
     * The dispatched task is returned. That is, the task that is returned
     * contains the [status][Task.status] after the task is dispatched but
     * before the task is received by its target.
     * If Cloud Tasks receives a successful response from the task's
     * target, then the task will be deleted; otherwise the task's
     * [schedule_time][google.cloud.tasks.v2beta3.Task.schedule_time] will be reset to the time that
     * [RunTask][google.cloud.tasks.v2beta3.CloudTasks.RunTask] was called plus the retry delay specified
     * in the queue's [RetryConfig][google.cloud.tasks.v2beta3.RetryConfig].
     * [RunTask][google.cloud.tasks.v2beta3.CloudTasks.RunTask] returns
     * [NOT_FOUND][google.rpc.Code.NOT_FOUND] when it is called on a
     * task that has already succeeded or permanently failed.
     * </pre>
     */
    public com.google.cloud.tasks.v2beta3.Task runTask(
        com.google.cloud.tasks.v2beta3.RunTaskRequest request) {
      return blockingUnaryCall(getChannel(), getRunTaskMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   *
   *
   * <pre>
   * Cloud Tasks allows developers to manage the execution of background
   * work in their applications.
   * </pre>
   */
  public static final class CloudTasksFutureStub
      extends io.grpc.stub.AbstractStub<CloudTasksFutureStub> {
    private CloudTasksFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CloudTasksFutureStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CloudTasksFutureStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CloudTasksFutureStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Lists queues.
     * Queues are returned in lexicographical order.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.tasks.v2beta3.ListQueuesResponse>
        listQueues(com.google.cloud.tasks.v2beta3.ListQueuesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListQueuesMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Gets a queue.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.tasks.v2beta3.Queue>
        getQueue(com.google.cloud.tasks.v2beta3.GetQueueRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetQueueMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Creates a queue.
     * Queues created with this method allow tasks to live for a maximum of 31
     * days. After a task is 31 days old, the task will be deleted regardless of whether
     * it was dispatched or not.
     * WARNING: Using this method may have unintended side effects if you are
     * using an App Engine `queue.yaml` or `queue.xml` file to manage your queues.
     * Read
     * [Overview of Queue Management and
     * queue.yaml](https://cloud.google.com/tasks/docs/queue-yaml) before using
     * this method.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.tasks.v2beta3.Queue>
        createQueue(com.google.cloud.tasks.v2beta3.CreateQueueRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateQueueMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Updates a queue.
     * This method creates the queue if it does not exist and updates
     * the queue if it does exist.
     * Queues created with this method allow tasks to live for a maximum of 31
     * days. After a task is 31 days old, the task will be deleted regardless of whether
     * it was dispatched or not.
     * WARNING: Using this method may have unintended side effects if you are
     * using an App Engine `queue.yaml` or `queue.xml` file to manage your queues.
     * Read
     * [Overview of Queue Management and
     * queue.yaml](https://cloud.google.com/tasks/docs/queue-yaml) before using
     * this method.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.tasks.v2beta3.Queue>
        updateQueue(com.google.cloud.tasks.v2beta3.UpdateQueueRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateQueueMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes a queue.
     * This command will delete the queue even if it has tasks in it.
     * Note: If you delete a queue, a queue with the same name can't be created
     * for 7 days.
     * WARNING: Using this method may have unintended side effects if you are
     * using an App Engine `queue.yaml` or `queue.xml` file to manage your queues.
     * Read
     * [Overview of Queue Management and
     * queue.yaml](https://cloud.google.com/tasks/docs/queue-yaml) before using
     * this method.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty>
        deleteQueue(com.google.cloud.tasks.v2beta3.DeleteQueueRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteQueueMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Purges a queue by deleting all of its tasks.
     * All tasks created before this method is called are permanently deleted.
     * Purge operations can take up to one minute to take effect. Tasks
     * might be dispatched before the purge takes effect. A purge is irreversible.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.tasks.v2beta3.Queue>
        purgeQueue(com.google.cloud.tasks.v2beta3.PurgeQueueRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPurgeQueueMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Pauses the queue.
     * If a queue is paused then the system will stop dispatching tasks
     * until the queue is resumed via
     * [ResumeQueue][google.cloud.tasks.v2beta3.CloudTasks.ResumeQueue]. Tasks can still be added
     * when the queue is paused. A queue is paused if its
     * [state][google.cloud.tasks.v2beta3.Queue.state] is [PAUSED][google.cloud.tasks.v2beta3.Queue.State.PAUSED].
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.tasks.v2beta3.Queue>
        pauseQueue(com.google.cloud.tasks.v2beta3.PauseQueueRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPauseQueueMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Resume a queue.
     * This method resumes a queue after it has been
     * [PAUSED][google.cloud.tasks.v2beta3.Queue.State.PAUSED] or
     * [DISABLED][google.cloud.tasks.v2beta3.Queue.State.DISABLED]. The state of a queue is stored
     * in the queue's [state][google.cloud.tasks.v2beta3.Queue.state]; after calling this method it
     * will be set to [RUNNING][google.cloud.tasks.v2beta3.Queue.State.RUNNING].
     * WARNING: Resuming many high-QPS queues at the same time can
     * lead to target overloading. If you are resuming high-QPS
     * queues, follow the 500/50/5 pattern described in
     * [Managing Cloud Tasks Scaling
     * Risks](https://cloud.google.com/tasks/docs/manage-cloud-task-scaling).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.tasks.v2beta3.Queue>
        resumeQueue(com.google.cloud.tasks.v2beta3.ResumeQueueRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getResumeQueueMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Gets the access control policy for a [Queue][google.cloud.tasks.v2beta3.Queue].
     * Returns an empty policy if the resource exists and does not have a policy
     * set.
     * Authorization requires the following
     * [Google IAM](https://cloud.google.com/iam) permission on the specified
     * resource parent:
     * * `cloudtasks.queues.getIamPolicy`
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.iam.v1.Policy>
        getIamPolicy(com.google.iam.v1.GetIamPolicyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetIamPolicyMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Sets the access control policy for a [Queue][google.cloud.tasks.v2beta3.Queue]. Replaces any existing
     * policy.
     * Note: The Cloud Console does not check queue-level IAM permissions yet.
     * Project-level permissions are required to use the Cloud Console.
     * Authorization requires the following
     * [Google IAM](https://cloud.google.com/iam) permission on the specified
     * resource parent:
     * * `cloudtasks.queues.setIamPolicy`
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.iam.v1.Policy>
        setIamPolicy(com.google.iam.v1.SetIamPolicyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetIamPolicyMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Returns permissions that a caller has on a [Queue][google.cloud.tasks.v2beta3.Queue].
     * If the resource does not exist, this will return an empty set of
     * permissions, not a [NOT_FOUND][google.rpc.Code.NOT_FOUND] error.
     * Note: This operation is designed to be used for building permission-aware
     * UIs and command-line tools, not for authorization checking. This operation
     * may "fail open" without warning.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.iam.v1.TestIamPermissionsResponse>
        testIamPermissions(com.google.iam.v1.TestIamPermissionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTestIamPermissionsMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Lists the tasks in a queue.
     * By default, only the [BASIC][google.cloud.tasks.v2beta3.Task.View.BASIC] view is retrieved
     * due to performance considerations;
     * [response_view][google.cloud.tasks.v2beta3.ListTasksRequest.response_view] controls the
     * subset of information which is returned.
     * The tasks may be returned in any order. The ordering may change at any
     * time.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.tasks.v2beta3.ListTasksResponse>
        listTasks(com.google.cloud.tasks.v2beta3.ListTasksRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListTasksMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Gets a task.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.tasks.v2beta3.Task>
        getTask(com.google.cloud.tasks.v2beta3.GetTaskRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTaskMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Creates a task and adds it to a queue.
     * Tasks cannot be updated after creation; there is no UpdateTask command.
     * * The maximum task size is 100KB.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.tasks.v2beta3.Task>
        createTask(com.google.cloud.tasks.v2beta3.CreateTaskRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateTaskMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes a task.
     * A task can be deleted if it is scheduled or dispatched. A task
     * cannot be deleted if it has executed successfully or permanently
     * failed.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteTask(
        com.google.cloud.tasks.v2beta3.DeleteTaskRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteTaskMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Forces a task to run now.
     * When this method is called, Cloud Tasks will dispatch the task, even if
     * the task is already running, the queue has reached its [RateLimits][google.cloud.tasks.v2beta3.RateLimits] or
     * is [PAUSED][google.cloud.tasks.v2beta3.Queue.State.PAUSED].
     * This command is meant to be used for manual debugging. For
     * example, [RunTask][google.cloud.tasks.v2beta3.CloudTasks.RunTask] can be used to retry a failed
     * task after a fix has been made or to manually force a task to be
     * dispatched now.
     * The dispatched task is returned. That is, the task that is returned
     * contains the [status][Task.status] after the task is dispatched but
     * before the task is received by its target.
     * If Cloud Tasks receives a successful response from the task's
     * target, then the task will be deleted; otherwise the task's
     * [schedule_time][google.cloud.tasks.v2beta3.Task.schedule_time] will be reset to the time that
     * [RunTask][google.cloud.tasks.v2beta3.CloudTasks.RunTask] was called plus the retry delay specified
     * in the queue's [RetryConfig][google.cloud.tasks.v2beta3.RetryConfig].
     * [RunTask][google.cloud.tasks.v2beta3.CloudTasks.RunTask] returns
     * [NOT_FOUND][google.rpc.Code.NOT_FOUND] when it is called on a
     * task that has already succeeded or permanently failed.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.tasks.v2beta3.Task>
        runTask(com.google.cloud.tasks.v2beta3.RunTaskRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRunTaskMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_QUEUES = 0;
  private static final int METHODID_GET_QUEUE = 1;
  private static final int METHODID_CREATE_QUEUE = 2;
  private static final int METHODID_UPDATE_QUEUE = 3;
  private static final int METHODID_DELETE_QUEUE = 4;
  private static final int METHODID_PURGE_QUEUE = 5;
  private static final int METHODID_PAUSE_QUEUE = 6;
  private static final int METHODID_RESUME_QUEUE = 7;
  private static final int METHODID_GET_IAM_POLICY = 8;
  private static final int METHODID_SET_IAM_POLICY = 9;
  private static final int METHODID_TEST_IAM_PERMISSIONS = 10;
  private static final int METHODID_LIST_TASKS = 11;
  private static final int METHODID_GET_TASK = 12;
  private static final int METHODID_CREATE_TASK = 13;
  private static final int METHODID_DELETE_TASK = 14;
  private static final int METHODID_RUN_TASK = 15;

  private static final class MethodHandlers<Req, Resp>
      implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CloudTasksImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CloudTasksImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_QUEUES:
          serviceImpl.listQueues(
              (com.google.cloud.tasks.v2beta3.ListQueuesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.tasks.v2beta3.ListQueuesResponse>)
                  responseObserver);
          break;
        case METHODID_GET_QUEUE:
          serviceImpl.getQueue(
              (com.google.cloud.tasks.v2beta3.GetQueueRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.tasks.v2beta3.Queue>) responseObserver);
          break;
        case METHODID_CREATE_QUEUE:
          serviceImpl.createQueue(
              (com.google.cloud.tasks.v2beta3.CreateQueueRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.tasks.v2beta3.Queue>) responseObserver);
          break;
        case METHODID_UPDATE_QUEUE:
          serviceImpl.updateQueue(
              (com.google.cloud.tasks.v2beta3.UpdateQueueRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.tasks.v2beta3.Queue>) responseObserver);
          break;
        case METHODID_DELETE_QUEUE:
          serviceImpl.deleteQueue(
              (com.google.cloud.tasks.v2beta3.DeleteQueueRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_PURGE_QUEUE:
          serviceImpl.purgeQueue(
              (com.google.cloud.tasks.v2beta3.PurgeQueueRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.tasks.v2beta3.Queue>) responseObserver);
          break;
        case METHODID_PAUSE_QUEUE:
          serviceImpl.pauseQueue(
              (com.google.cloud.tasks.v2beta3.PauseQueueRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.tasks.v2beta3.Queue>) responseObserver);
          break;
        case METHODID_RESUME_QUEUE:
          serviceImpl.resumeQueue(
              (com.google.cloud.tasks.v2beta3.ResumeQueueRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.tasks.v2beta3.Queue>) responseObserver);
          break;
        case METHODID_GET_IAM_POLICY:
          serviceImpl.getIamPolicy(
              (com.google.iam.v1.GetIamPolicyRequest) request,
              (io.grpc.stub.StreamObserver<com.google.iam.v1.Policy>) responseObserver);
          break;
        case METHODID_SET_IAM_POLICY:
          serviceImpl.setIamPolicy(
              (com.google.iam.v1.SetIamPolicyRequest) request,
              (io.grpc.stub.StreamObserver<com.google.iam.v1.Policy>) responseObserver);
          break;
        case METHODID_TEST_IAM_PERMISSIONS:
          serviceImpl.testIamPermissions(
              (com.google.iam.v1.TestIamPermissionsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.iam.v1.TestIamPermissionsResponse>)
                  responseObserver);
          break;
        case METHODID_LIST_TASKS:
          serviceImpl.listTasks(
              (com.google.cloud.tasks.v2beta3.ListTasksRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.tasks.v2beta3.ListTasksResponse>)
                  responseObserver);
          break;
        case METHODID_GET_TASK:
          serviceImpl.getTask(
              (com.google.cloud.tasks.v2beta3.GetTaskRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.tasks.v2beta3.Task>) responseObserver);
          break;
        case METHODID_CREATE_TASK:
          serviceImpl.createTask(
              (com.google.cloud.tasks.v2beta3.CreateTaskRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.tasks.v2beta3.Task>) responseObserver);
          break;
        case METHODID_DELETE_TASK:
          serviceImpl.deleteTask(
              (com.google.cloud.tasks.v2beta3.DeleteTaskRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_RUN_TASK:
          serviceImpl.runTask(
              (com.google.cloud.tasks.v2beta3.RunTaskRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.tasks.v2beta3.Task>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private abstract static class CloudTasksBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier,
          io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CloudTasksBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.cloud.tasks.v2beta3.CloudTasksProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CloudTasks");
    }
  }

  private static final class CloudTasksFileDescriptorSupplier
      extends CloudTasksBaseDescriptorSupplier {
    CloudTasksFileDescriptorSupplier() {}
  }

  private static final class CloudTasksMethodDescriptorSupplier
      extends CloudTasksBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CloudTasksMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CloudTasksGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor =
              result =
                  io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                      .setSchemaDescriptor(new CloudTasksFileDescriptorSupplier())
                      .addMethod(getListQueuesMethodHelper())
                      .addMethod(getGetQueueMethodHelper())
                      .addMethod(getCreateQueueMethodHelper())
                      .addMethod(getUpdateQueueMethodHelper())
                      .addMethod(getDeleteQueueMethodHelper())
                      .addMethod(getPurgeQueueMethodHelper())
                      .addMethod(getPauseQueueMethodHelper())
                      .addMethod(getResumeQueueMethodHelper())
                      .addMethod(getGetIamPolicyMethodHelper())
                      .addMethod(getSetIamPolicyMethodHelper())
                      .addMethod(getTestIamPermissionsMethodHelper())
                      .addMethod(getListTasksMethodHelper())
                      .addMethod(getGetTaskMethodHelper())
                      .addMethod(getCreateTaskMethodHelper())
                      .addMethod(getDeleteTaskMethodHelper())
                      .addMethod(getRunTaskMethodHelper())
                      .build();
        }
      }
    }
    return result;
  }
}
