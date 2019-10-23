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
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/tasks/v2beta2/target.proto

package com.google.cloud.tasks.v2beta2;

/**
 *
 *
 * <pre>
 * App Engine HTTP target.
 * The task will be delivered to the App Engine application hostname
 * specified by its [AppEngineHttpTarget][google.cloud.tasks.v2beta2.AppEngineHttpTarget] and [AppEngineHttpRequest][google.cloud.tasks.v2beta2.AppEngineHttpRequest].
 * The documentation for [AppEngineHttpRequest][google.cloud.tasks.v2beta2.AppEngineHttpRequest] explains how the
 * task's host URL is constructed.
 * Using [AppEngineHttpTarget][google.cloud.tasks.v2beta2.AppEngineHttpTarget] requires
 * [`appengine.applications.get`](https://cloud.google.com/appengine/docs/admin-api/access-control)
 * Google IAM permission for the project
 * and the following scope:
 * `https://www.googleapis.com/auth/cloud-platform`
 * </pre>
 *
 * Protobuf type {@code google.cloud.tasks.v2beta2.AppEngineHttpTarget}
 */
public final class AppEngineHttpTarget extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.tasks.v2beta2.AppEngineHttpTarget)
    AppEngineHttpTargetOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AppEngineHttpTarget.newBuilder() to construct.
  private AppEngineHttpTarget(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AppEngineHttpTarget() {}

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private AppEngineHttpTarget(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              com.google.cloud.tasks.v2beta2.AppEngineRouting.Builder subBuilder = null;
              if (appEngineRoutingOverride_ != null) {
                subBuilder = appEngineRoutingOverride_.toBuilder();
              }
              appEngineRoutingOverride_ =
                  input.readMessage(
                      com.google.cloud.tasks.v2beta2.AppEngineRouting.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(appEngineRoutingOverride_);
                appEngineRoutingOverride_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.tasks.v2beta2.TargetProto
        .internal_static_google_cloud_tasks_v2beta2_AppEngineHttpTarget_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.tasks.v2beta2.TargetProto
        .internal_static_google_cloud_tasks_v2beta2_AppEngineHttpTarget_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.tasks.v2beta2.AppEngineHttpTarget.class,
            com.google.cloud.tasks.v2beta2.AppEngineHttpTarget.Builder.class);
  }

  public static final int APP_ENGINE_ROUTING_OVERRIDE_FIELD_NUMBER = 1;
  private com.google.cloud.tasks.v2beta2.AppEngineRouting appEngineRoutingOverride_;
  /**
   *
   *
   * <pre>
   * Overrides for the
   * [task-level app_engine_routing][google.cloud.tasks.v2beta2.AppEngineHttpRequest.app_engine_routing].
   * If set, `app_engine_routing_override` is used for all tasks in
   * the queue, no matter what the setting is for the
   * [task-level app_engine_routing][google.cloud.tasks.v2beta2.AppEngineHttpRequest.app_engine_routing].
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta2.AppEngineRouting app_engine_routing_override = 1;</code>
   */
  public boolean hasAppEngineRoutingOverride() {
    return appEngineRoutingOverride_ != null;
  }
  /**
   *
   *
   * <pre>
   * Overrides for the
   * [task-level app_engine_routing][google.cloud.tasks.v2beta2.AppEngineHttpRequest.app_engine_routing].
   * If set, `app_engine_routing_override` is used for all tasks in
   * the queue, no matter what the setting is for the
   * [task-level app_engine_routing][google.cloud.tasks.v2beta2.AppEngineHttpRequest.app_engine_routing].
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta2.AppEngineRouting app_engine_routing_override = 1;</code>
   */
  public com.google.cloud.tasks.v2beta2.AppEngineRouting getAppEngineRoutingOverride() {
    return appEngineRoutingOverride_ == null
        ? com.google.cloud.tasks.v2beta2.AppEngineRouting.getDefaultInstance()
        : appEngineRoutingOverride_;
  }
  /**
   *
   *
   * <pre>
   * Overrides for the
   * [task-level app_engine_routing][google.cloud.tasks.v2beta2.AppEngineHttpRequest.app_engine_routing].
   * If set, `app_engine_routing_override` is used for all tasks in
   * the queue, no matter what the setting is for the
   * [task-level app_engine_routing][google.cloud.tasks.v2beta2.AppEngineHttpRequest.app_engine_routing].
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta2.AppEngineRouting app_engine_routing_override = 1;</code>
   */
  public com.google.cloud.tasks.v2beta2.AppEngineRoutingOrBuilder
      getAppEngineRoutingOverrideOrBuilder() {
    return getAppEngineRoutingOverride();
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (appEngineRoutingOverride_ != null) {
      output.writeMessage(1, getAppEngineRoutingOverride());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (appEngineRoutingOverride_ != null) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              1, getAppEngineRoutingOverride());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.tasks.v2beta2.AppEngineHttpTarget)) {
      return super.equals(obj);
    }
    com.google.cloud.tasks.v2beta2.AppEngineHttpTarget other =
        (com.google.cloud.tasks.v2beta2.AppEngineHttpTarget) obj;

    if (hasAppEngineRoutingOverride() != other.hasAppEngineRoutingOverride()) return false;
    if (hasAppEngineRoutingOverride()) {
      if (!getAppEngineRoutingOverride().equals(other.getAppEngineRoutingOverride())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasAppEngineRoutingOverride()) {
      hash = (37 * hash) + APP_ENGINE_ROUTING_OVERRIDE_FIELD_NUMBER;
      hash = (53 * hash) + getAppEngineRoutingOverride().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.tasks.v2beta2.AppEngineHttpTarget parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.tasks.v2beta2.AppEngineHttpTarget parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.tasks.v2beta2.AppEngineHttpTarget parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.tasks.v2beta2.AppEngineHttpTarget parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.tasks.v2beta2.AppEngineHttpTarget parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.tasks.v2beta2.AppEngineHttpTarget parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.tasks.v2beta2.AppEngineHttpTarget parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.tasks.v2beta2.AppEngineHttpTarget parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.tasks.v2beta2.AppEngineHttpTarget parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.tasks.v2beta2.AppEngineHttpTarget parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.tasks.v2beta2.AppEngineHttpTarget parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.tasks.v2beta2.AppEngineHttpTarget parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.tasks.v2beta2.AppEngineHttpTarget prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * App Engine HTTP target.
   * The task will be delivered to the App Engine application hostname
   * specified by its [AppEngineHttpTarget][google.cloud.tasks.v2beta2.AppEngineHttpTarget] and [AppEngineHttpRequest][google.cloud.tasks.v2beta2.AppEngineHttpRequest].
   * The documentation for [AppEngineHttpRequest][google.cloud.tasks.v2beta2.AppEngineHttpRequest] explains how the
   * task's host URL is constructed.
   * Using [AppEngineHttpTarget][google.cloud.tasks.v2beta2.AppEngineHttpTarget] requires
   * [`appengine.applications.get`](https://cloud.google.com/appengine/docs/admin-api/access-control)
   * Google IAM permission for the project
   * and the following scope:
   * `https://www.googleapis.com/auth/cloud-platform`
   * </pre>
   *
   * Protobuf type {@code google.cloud.tasks.v2beta2.AppEngineHttpTarget}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.tasks.v2beta2.AppEngineHttpTarget)
      com.google.cloud.tasks.v2beta2.AppEngineHttpTargetOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.tasks.v2beta2.TargetProto
          .internal_static_google_cloud_tasks_v2beta2_AppEngineHttpTarget_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.tasks.v2beta2.TargetProto
          .internal_static_google_cloud_tasks_v2beta2_AppEngineHttpTarget_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.tasks.v2beta2.AppEngineHttpTarget.class,
              com.google.cloud.tasks.v2beta2.AppEngineHttpTarget.Builder.class);
    }

    // Construct using com.google.cloud.tasks.v2beta2.AppEngineHttpTarget.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (appEngineRoutingOverrideBuilder_ == null) {
        appEngineRoutingOverride_ = null;
      } else {
        appEngineRoutingOverride_ = null;
        appEngineRoutingOverrideBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.tasks.v2beta2.TargetProto
          .internal_static_google_cloud_tasks_v2beta2_AppEngineHttpTarget_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.tasks.v2beta2.AppEngineHttpTarget getDefaultInstanceForType() {
      return com.google.cloud.tasks.v2beta2.AppEngineHttpTarget.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.tasks.v2beta2.AppEngineHttpTarget build() {
      com.google.cloud.tasks.v2beta2.AppEngineHttpTarget result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.tasks.v2beta2.AppEngineHttpTarget buildPartial() {
      com.google.cloud.tasks.v2beta2.AppEngineHttpTarget result =
          new com.google.cloud.tasks.v2beta2.AppEngineHttpTarget(this);
      if (appEngineRoutingOverrideBuilder_ == null) {
        result.appEngineRoutingOverride_ = appEngineRoutingOverride_;
      } else {
        result.appEngineRoutingOverride_ = appEngineRoutingOverrideBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.tasks.v2beta2.AppEngineHttpTarget) {
        return mergeFrom((com.google.cloud.tasks.v2beta2.AppEngineHttpTarget) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.tasks.v2beta2.AppEngineHttpTarget other) {
      if (other == com.google.cloud.tasks.v2beta2.AppEngineHttpTarget.getDefaultInstance())
        return this;
      if (other.hasAppEngineRoutingOverride()) {
        mergeAppEngineRoutingOverride(other.getAppEngineRoutingOverride());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.tasks.v2beta2.AppEngineHttpTarget parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.tasks.v2beta2.AppEngineHttpTarget) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.tasks.v2beta2.AppEngineRouting appEngineRoutingOverride_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.tasks.v2beta2.AppEngineRouting,
            com.google.cloud.tasks.v2beta2.AppEngineRouting.Builder,
            com.google.cloud.tasks.v2beta2.AppEngineRoutingOrBuilder>
        appEngineRoutingOverrideBuilder_;
    /**
     *
     *
     * <pre>
     * Overrides for the
     * [task-level app_engine_routing][google.cloud.tasks.v2beta2.AppEngineHttpRequest.app_engine_routing].
     * If set, `app_engine_routing_override` is used for all tasks in
     * the queue, no matter what the setting is for the
     * [task-level app_engine_routing][google.cloud.tasks.v2beta2.AppEngineHttpRequest.app_engine_routing].
     * </pre>
     *
     * <code>.google.cloud.tasks.v2beta2.AppEngineRouting app_engine_routing_override = 1;</code>
     */
    public boolean hasAppEngineRoutingOverride() {
      return appEngineRoutingOverrideBuilder_ != null || appEngineRoutingOverride_ != null;
    }
    /**
     *
     *
     * <pre>
     * Overrides for the
     * [task-level app_engine_routing][google.cloud.tasks.v2beta2.AppEngineHttpRequest.app_engine_routing].
     * If set, `app_engine_routing_override` is used for all tasks in
     * the queue, no matter what the setting is for the
     * [task-level app_engine_routing][google.cloud.tasks.v2beta2.AppEngineHttpRequest.app_engine_routing].
     * </pre>
     *
     * <code>.google.cloud.tasks.v2beta2.AppEngineRouting app_engine_routing_override = 1;</code>
     */
    public com.google.cloud.tasks.v2beta2.AppEngineRouting getAppEngineRoutingOverride() {
      if (appEngineRoutingOverrideBuilder_ == null) {
        return appEngineRoutingOverride_ == null
            ? com.google.cloud.tasks.v2beta2.AppEngineRouting.getDefaultInstance()
            : appEngineRoutingOverride_;
      } else {
        return appEngineRoutingOverrideBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Overrides for the
     * [task-level app_engine_routing][google.cloud.tasks.v2beta2.AppEngineHttpRequest.app_engine_routing].
     * If set, `app_engine_routing_override` is used for all tasks in
     * the queue, no matter what the setting is for the
     * [task-level app_engine_routing][google.cloud.tasks.v2beta2.AppEngineHttpRequest.app_engine_routing].
     * </pre>
     *
     * <code>.google.cloud.tasks.v2beta2.AppEngineRouting app_engine_routing_override = 1;</code>
     */
    public Builder setAppEngineRoutingOverride(
        com.google.cloud.tasks.v2beta2.AppEngineRouting value) {
      if (appEngineRoutingOverrideBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        appEngineRoutingOverride_ = value;
        onChanged();
      } else {
        appEngineRoutingOverrideBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Overrides for the
     * [task-level app_engine_routing][google.cloud.tasks.v2beta2.AppEngineHttpRequest.app_engine_routing].
     * If set, `app_engine_routing_override` is used for all tasks in
     * the queue, no matter what the setting is for the
     * [task-level app_engine_routing][google.cloud.tasks.v2beta2.AppEngineHttpRequest.app_engine_routing].
     * </pre>
     *
     * <code>.google.cloud.tasks.v2beta2.AppEngineRouting app_engine_routing_override = 1;</code>
     */
    public Builder setAppEngineRoutingOverride(
        com.google.cloud.tasks.v2beta2.AppEngineRouting.Builder builderForValue) {
      if (appEngineRoutingOverrideBuilder_ == null) {
        appEngineRoutingOverride_ = builderForValue.build();
        onChanged();
      } else {
        appEngineRoutingOverrideBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Overrides for the
     * [task-level app_engine_routing][google.cloud.tasks.v2beta2.AppEngineHttpRequest.app_engine_routing].
     * If set, `app_engine_routing_override` is used for all tasks in
     * the queue, no matter what the setting is for the
     * [task-level app_engine_routing][google.cloud.tasks.v2beta2.AppEngineHttpRequest.app_engine_routing].
     * </pre>
     *
     * <code>.google.cloud.tasks.v2beta2.AppEngineRouting app_engine_routing_override = 1;</code>
     */
    public Builder mergeAppEngineRoutingOverride(
        com.google.cloud.tasks.v2beta2.AppEngineRouting value) {
      if (appEngineRoutingOverrideBuilder_ == null) {
        if (appEngineRoutingOverride_ != null) {
          appEngineRoutingOverride_ =
              com.google.cloud.tasks.v2beta2.AppEngineRouting.newBuilder(appEngineRoutingOverride_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          appEngineRoutingOverride_ = value;
        }
        onChanged();
      } else {
        appEngineRoutingOverrideBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Overrides for the
     * [task-level app_engine_routing][google.cloud.tasks.v2beta2.AppEngineHttpRequest.app_engine_routing].
     * If set, `app_engine_routing_override` is used for all tasks in
     * the queue, no matter what the setting is for the
     * [task-level app_engine_routing][google.cloud.tasks.v2beta2.AppEngineHttpRequest.app_engine_routing].
     * </pre>
     *
     * <code>.google.cloud.tasks.v2beta2.AppEngineRouting app_engine_routing_override = 1;</code>
     */
    public Builder clearAppEngineRoutingOverride() {
      if (appEngineRoutingOverrideBuilder_ == null) {
        appEngineRoutingOverride_ = null;
        onChanged();
      } else {
        appEngineRoutingOverride_ = null;
        appEngineRoutingOverrideBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Overrides for the
     * [task-level app_engine_routing][google.cloud.tasks.v2beta2.AppEngineHttpRequest.app_engine_routing].
     * If set, `app_engine_routing_override` is used for all tasks in
     * the queue, no matter what the setting is for the
     * [task-level app_engine_routing][google.cloud.tasks.v2beta2.AppEngineHttpRequest.app_engine_routing].
     * </pre>
     *
     * <code>.google.cloud.tasks.v2beta2.AppEngineRouting app_engine_routing_override = 1;</code>
     */
    public com.google.cloud.tasks.v2beta2.AppEngineRouting.Builder
        getAppEngineRoutingOverrideBuilder() {

      onChanged();
      return getAppEngineRoutingOverrideFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Overrides for the
     * [task-level app_engine_routing][google.cloud.tasks.v2beta2.AppEngineHttpRequest.app_engine_routing].
     * If set, `app_engine_routing_override` is used for all tasks in
     * the queue, no matter what the setting is for the
     * [task-level app_engine_routing][google.cloud.tasks.v2beta2.AppEngineHttpRequest.app_engine_routing].
     * </pre>
     *
     * <code>.google.cloud.tasks.v2beta2.AppEngineRouting app_engine_routing_override = 1;</code>
     */
    public com.google.cloud.tasks.v2beta2.AppEngineRoutingOrBuilder
        getAppEngineRoutingOverrideOrBuilder() {
      if (appEngineRoutingOverrideBuilder_ != null) {
        return appEngineRoutingOverrideBuilder_.getMessageOrBuilder();
      } else {
        return appEngineRoutingOverride_ == null
            ? com.google.cloud.tasks.v2beta2.AppEngineRouting.getDefaultInstance()
            : appEngineRoutingOverride_;
      }
    }
    /**
     *
     *
     * <pre>
     * Overrides for the
     * [task-level app_engine_routing][google.cloud.tasks.v2beta2.AppEngineHttpRequest.app_engine_routing].
     * If set, `app_engine_routing_override` is used for all tasks in
     * the queue, no matter what the setting is for the
     * [task-level app_engine_routing][google.cloud.tasks.v2beta2.AppEngineHttpRequest.app_engine_routing].
     * </pre>
     *
     * <code>.google.cloud.tasks.v2beta2.AppEngineRouting app_engine_routing_override = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.tasks.v2beta2.AppEngineRouting,
            com.google.cloud.tasks.v2beta2.AppEngineRouting.Builder,
            com.google.cloud.tasks.v2beta2.AppEngineRoutingOrBuilder>
        getAppEngineRoutingOverrideFieldBuilder() {
      if (appEngineRoutingOverrideBuilder_ == null) {
        appEngineRoutingOverrideBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.tasks.v2beta2.AppEngineRouting,
                com.google.cloud.tasks.v2beta2.AppEngineRouting.Builder,
                com.google.cloud.tasks.v2beta2.AppEngineRoutingOrBuilder>(
                getAppEngineRoutingOverride(), getParentForChildren(), isClean());
        appEngineRoutingOverride_ = null;
      }
      return appEngineRoutingOverrideBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.tasks.v2beta2.AppEngineHttpTarget)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.tasks.v2beta2.AppEngineHttpTarget)
  private static final com.google.cloud.tasks.v2beta2.AppEngineHttpTarget DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.tasks.v2beta2.AppEngineHttpTarget();
  }

  public static com.google.cloud.tasks.v2beta2.AppEngineHttpTarget getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AppEngineHttpTarget> PARSER =
      new com.google.protobuf.AbstractParser<AppEngineHttpTarget>() {
        @java.lang.Override
        public AppEngineHttpTarget parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new AppEngineHttpTarget(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<AppEngineHttpTarget> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AppEngineHttpTarget> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.tasks.v2beta2.AppEngineHttpTarget getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
