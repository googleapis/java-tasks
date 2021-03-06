/*
 * Copyright 2020 Google LLC
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
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/tasks/v2/queue.proto

package com.google.cloud.tasks.v2;

public final class QueueProto {
  private QueueProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_tasks_v2_Queue_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2_Queue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_tasks_v2_RateLimits_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2_RateLimits_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_tasks_v2_RetryConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2_RetryConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_tasks_v2_StackdriverLoggingConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2_StackdriverLoggingConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n!google/cloud/tasks/v2/queue.proto\022\025goo"
          + "gle.cloud.tasks.v2\032\031google/api/resource."
          + "proto\032\"google/cloud/tasks/v2/target.prot"
          + "o\032\036google/protobuf/duration.proto\032\037googl"
          + "e/protobuf/timestamp.proto\032\034google/api/a"
          + "nnotations.proto\"\262\004\n\005Queue\022\014\n\004name\030\001 \001(\t"
          + "\022L\n\033app_engine_routing_override\030\002 \001(\0132\'."
          + "google.cloud.tasks.v2.AppEngineRouting\0226"
          + "\n\013rate_limits\030\003 \001(\0132!.google.cloud.tasks"
          + ".v2.RateLimits\0228\n\014retry_config\030\004 \001(\0132\".g"
          + "oogle.cloud.tasks.v2.RetryConfig\0221\n\005stat"
          + "e\030\005 \001(\0162\".google.cloud.tasks.v2.Queue.St"
          + "ate\022.\n\npurge_time\030\006 \001(\0132\032.google.protobu"
          + "f.Timestamp\022S\n\032stackdriver_logging_confi"
          + "g\030\t \001(\0132/.google.cloud.tasks.v2.Stackdri"
          + "verLoggingConfig\"E\n\005State\022\025\n\021STATE_UNSPE"
          + "CIFIED\020\000\022\013\n\007RUNNING\020\001\022\n\n\006PAUSED\020\002\022\014\n\010DIS"
          + "ABLED\020\003:\\\352AY\n\037cloudtasks.googleapis.com/"
          + "Queue\0226projects/{project}/locations/{loc"
          + "ation}/queues/{queue}\"j\n\nRateLimits\022!\n\031m"
          + "ax_dispatches_per_second\030\001 \001(\001\022\026\n\016max_bu"
          + "rst_size\030\002 \001(\005\022!\n\031max_concurrent_dispatc"
          + "hes\030\003 \001(\005\"\321\001\n\013RetryConfig\022\024\n\014max_attempt"
          + "s\030\001 \001(\005\0225\n\022max_retry_duration\030\002 \001(\0132\031.go"
          + "ogle.protobuf.Duration\022.\n\013min_backoff\030\003 "
          + "\001(\0132\031.google.protobuf.Duration\022.\n\013max_ba"
          + "ckoff\030\004 \001(\0132\031.google.protobuf.Duration\022\025"
          + "\n\rmax_doublings\030\005 \001(\005\"2\n\030StackdriverLogg"
          + "ingConfig\022\026\n\016sampling_ratio\030\001 \001(\001Be\n\031com"
          + ".google.cloud.tasks.v2B\nQueueProtoP\001Z:go"
          + "ogle.golang.org/genproto/googleapis/clou"
          + "d/tasks/v2;tasksb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.tasks.v2.TargetProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_cloud_tasks_v2_Queue_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_tasks_v2_Queue_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_tasks_v2_Queue_descriptor,
            new java.lang.String[] {
              "Name",
              "AppEngineRoutingOverride",
              "RateLimits",
              "RetryConfig",
              "State",
              "PurgeTime",
              "StackdriverLoggingConfig",
            });
    internal_static_google_cloud_tasks_v2_RateLimits_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_tasks_v2_RateLimits_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_tasks_v2_RateLimits_descriptor,
            new java.lang.String[] {
              "MaxDispatchesPerSecond", "MaxBurstSize", "MaxConcurrentDispatches",
            });
    internal_static_google_cloud_tasks_v2_RetryConfig_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_tasks_v2_RetryConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_tasks_v2_RetryConfig_descriptor,
            new java.lang.String[] {
              "MaxAttempts", "MaxRetryDuration", "MinBackoff", "MaxBackoff", "MaxDoublings",
            });
    internal_static_google_cloud_tasks_v2_StackdriverLoggingConfig_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_tasks_v2_StackdriverLoggingConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_tasks_v2_StackdriverLoggingConfig_descriptor,
            new java.lang.String[] {
              "SamplingRatio",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.tasks.v2.TargetProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
