// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/tasks/v2beta3/task.proto

package com.google.cloud.tasks.v2beta3;

public final class TaskProto {
  private TaskProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_tasks_v2beta3_Task_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2beta3_Task_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_tasks_v2beta3_Attempt_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2beta3_Attempt_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%google/cloud/tasks/v2beta3/task.proto\022" +
      "\032google.cloud.tasks.v2beta3\032\031google/api/" +
      "resource.proto\032\'google/cloud/tasks/v2bet" +
      "a3/target.proto\032\036google/protobuf/duratio" +
      "n.proto\032\037google/protobuf/timestamp.proto" +
      "\032\027google/rpc/status.proto\032\034google/api/an" +
      "notations.proto\"\216\006\n\004Task\022\014\n\004name\030\001 \001(\t\022S" +
      "\n\027app_engine_http_request\030\003 \001(\01320.google" +
      ".cloud.tasks.v2beta3.AppEngineHttpReques" +
      "tH\000\022?\n\014http_request\030\013 \001(\0132\'.google.cloud" +
      ".tasks.v2beta3.HttpRequestH\000\022?\n\014pull_mes" +
      "sage\030\r \001(\0132\'.google.cloud.tasks.v2beta3." +
      "PullMessageH\000\0221\n\rschedule_time\030\004 \001(\0132\032.g" +
      "oogle.protobuf.Timestamp\022/\n\013create_time\030" +
      "\005 \001(\0132\032.google.protobuf.Timestamp\0224\n\021dis" +
      "patch_deadline\030\014 \001(\0132\031.google.protobuf.D" +
      "uration\022\026\n\016dispatch_count\030\006 \001(\005\022\026\n\016respo" +
      "nse_count\030\007 \001(\005\022:\n\rfirst_attempt\030\010 \001(\0132#" +
      ".google.cloud.tasks.v2beta3.Attempt\0229\n\014l" +
      "ast_attempt\030\t \001(\0132#.google.cloud.tasks.v" +
      "2beta3.Attempt\0223\n\004view\030\n \001(\0162%.google.cl" +
      "oud.tasks.v2beta3.Task.View\"1\n\004View\022\024\n\020V" +
      "IEW_UNSPECIFIED\020\000\022\t\n\005BASIC\020\001\022\010\n\004FULL\020\002:h" +
      "\352Ae\n\036cloudtasks.googleapis.com/Task\022Cpro" +
      "jects/{project}/locations/{location}/que" +
      "ues/{queue}/tasks/{task}B\016\n\014payload_type" +
      "\"\317\001\n\007Attempt\0221\n\rschedule_time\030\001 \001(\0132\032.go" +
      "ogle.protobuf.Timestamp\0221\n\rdispatch_time" +
      "\030\002 \001(\0132\032.google.protobuf.Timestamp\0221\n\rre" +
      "sponse_time\030\003 \001(\0132\032.google.protobuf.Time" +
      "stamp\022+\n\017response_status\030\004 \001(\0132\022.google." +
      "rpc.StatusBn\n\036com.google.cloud.tasks.v2b" +
      "eta3B\tTaskProtoP\001Z?google.golang.org/gen" +
      "proto/googleapis/cloud/tasks/v2beta3;tas" +
      "ksb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.tasks.v2beta3.TargetProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_cloud_tasks_v2beta3_Task_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_tasks_v2beta3_Task_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_tasks_v2beta3_Task_descriptor,
        new java.lang.String[] { "Name", "AppEngineHttpRequest", "HttpRequest", "PullMessage", "ScheduleTime", "CreateTime", "DispatchDeadline", "DispatchCount", "ResponseCount", "FirstAttempt", "LastAttempt", "View", "PayloadType", });
    internal_static_google_cloud_tasks_v2beta3_Attempt_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_tasks_v2beta3_Attempt_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_tasks_v2beta3_Attempt_descriptor,
        new java.lang.String[] { "ScheduleTime", "DispatchTime", "ResponseTime", "ResponseStatus", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.tasks.v2beta3.TargetProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}