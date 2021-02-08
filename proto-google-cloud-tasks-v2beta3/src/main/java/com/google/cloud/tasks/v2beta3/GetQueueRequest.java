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
// source: google/cloud/tasks/v2beta3/cloudtasks.proto

package com.google.cloud.tasks.v2beta3;

/**
 *
 *
 * <pre>
 * Request message for [GetQueue][google.cloud.tasks.v2beta3.CloudTasks.GetQueue].
 * </pre>
 *
 * Protobuf type {@code google.cloud.tasks.v2beta3.GetQueueRequest}
 */
public final class GetQueueRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.tasks.v2beta3.GetQueueRequest)
    GetQueueRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use GetQueueRequest.newBuilder() to construct.
  private GetQueueRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GetQueueRequest() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new GetQueueRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private GetQueueRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
              java.lang.String s = input.readStringRequireUtf8();

              name_ = s;
              break;
            }
          case 18:
            {
              com.google.protobuf.FieldMask.Builder subBuilder = null;
              if (readMask_ != null) {
                subBuilder = readMask_.toBuilder();
              }
              readMask_ =
                  input.readMessage(com.google.protobuf.FieldMask.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(readMask_);
                readMask_ = subBuilder.buildPartial();
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
    return com.google.cloud.tasks.v2beta3.CloudTasksProto
        .internal_static_google_cloud_tasks_v2beta3_GetQueueRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.tasks.v2beta3.CloudTasksProto
        .internal_static_google_cloud_tasks_v2beta3_GetQueueRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.tasks.v2beta3.GetQueueRequest.class,
            com.google.cloud.tasks.v2beta3.GetQueueRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   *
   *
   * <pre>
   * Required. The resource name of the queue. For example:
   * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID`
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The resource name of the queue. For example:
   * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID`
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int READ_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask readMask_;
  /**
   *
   *
   * <pre>
   * Optional. Read mask is used for a more granular control over what the API returns.
   * If the mask is not present all fields will be returned except
   * [Queue.stats]. [Queue.stats] will be returned only if it was  explicitly
   * specified in the mask.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask read_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the readMask field is set.
   */
  @java.lang.Override
  public boolean hasReadMask() {
    return readMask_ != null;
  }
  /**
   *
   *
   * <pre>
   * Optional. Read mask is used for a more granular control over what the API returns.
   * If the mask is not present all fields will be returned except
   * [Queue.stats]. [Queue.stats] will be returned only if it was  explicitly
   * specified in the mask.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask read_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The readMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getReadMask() {
    return readMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : readMask_;
  }
  /**
   *
   *
   * <pre>
   * Optional. Read mask is used for a more granular control over what the API returns.
   * If the mask is not present all fields will be returned except
   * [Queue.stats]. [Queue.stats] will be returned only if it was  explicitly
   * specified in the mask.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask read_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getReadMaskOrBuilder() {
    return getReadMask();
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
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (readMask_ != null) {
      output.writeMessage(2, getReadMask());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (readMask_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getReadMask());
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
    if (!(obj instanceof com.google.cloud.tasks.v2beta3.GetQueueRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.tasks.v2beta3.GetQueueRequest other =
        (com.google.cloud.tasks.v2beta3.GetQueueRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (hasReadMask() != other.hasReadMask()) return false;
    if (hasReadMask()) {
      if (!getReadMask().equals(other.getReadMask())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasReadMask()) {
      hash = (37 * hash) + READ_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getReadMask().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.tasks.v2beta3.GetQueueRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.tasks.v2beta3.GetQueueRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.tasks.v2beta3.GetQueueRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.tasks.v2beta3.GetQueueRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.tasks.v2beta3.GetQueueRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.tasks.v2beta3.GetQueueRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.tasks.v2beta3.GetQueueRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.tasks.v2beta3.GetQueueRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.tasks.v2beta3.GetQueueRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.tasks.v2beta3.GetQueueRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.tasks.v2beta3.GetQueueRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.tasks.v2beta3.GetQueueRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.tasks.v2beta3.GetQueueRequest prototype) {
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
   * Request message for [GetQueue][google.cloud.tasks.v2beta3.CloudTasks.GetQueue].
   * </pre>
   *
   * Protobuf type {@code google.cloud.tasks.v2beta3.GetQueueRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.tasks.v2beta3.GetQueueRequest)
      com.google.cloud.tasks.v2beta3.GetQueueRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.tasks.v2beta3.CloudTasksProto
          .internal_static_google_cloud_tasks_v2beta3_GetQueueRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.tasks.v2beta3.CloudTasksProto
          .internal_static_google_cloud_tasks_v2beta3_GetQueueRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.tasks.v2beta3.GetQueueRequest.class,
              com.google.cloud.tasks.v2beta3.GetQueueRequest.Builder.class);
    }

    // Construct using com.google.cloud.tasks.v2beta3.GetQueueRequest.newBuilder()
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
      name_ = "";

      if (readMaskBuilder_ == null) {
        readMask_ = null;
      } else {
        readMask_ = null;
        readMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.tasks.v2beta3.CloudTasksProto
          .internal_static_google_cloud_tasks_v2beta3_GetQueueRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.tasks.v2beta3.GetQueueRequest getDefaultInstanceForType() {
      return com.google.cloud.tasks.v2beta3.GetQueueRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.tasks.v2beta3.GetQueueRequest build() {
      com.google.cloud.tasks.v2beta3.GetQueueRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.tasks.v2beta3.GetQueueRequest buildPartial() {
      com.google.cloud.tasks.v2beta3.GetQueueRequest result =
          new com.google.cloud.tasks.v2beta3.GetQueueRequest(this);
      result.name_ = name_;
      if (readMaskBuilder_ == null) {
        result.readMask_ = readMask_;
      } else {
        result.readMask_ = readMaskBuilder_.build();
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
      if (other instanceof com.google.cloud.tasks.v2beta3.GetQueueRequest) {
        return mergeFrom((com.google.cloud.tasks.v2beta3.GetQueueRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.tasks.v2beta3.GetQueueRequest other) {
      if (other == com.google.cloud.tasks.v2beta3.GetQueueRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.hasReadMask()) {
        mergeReadMask(other.getReadMask());
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
      com.google.cloud.tasks.v2beta3.GetQueueRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.tasks.v2beta3.GetQueueRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Required. The resource name of the queue. For example:
     * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID`
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the queue. For example:
     * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID`
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the queue. For example:
     * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID`
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      name_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the queue. For example:
     * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID`
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {

      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the queue. For example:
     * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID`
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      name_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.FieldMask readMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        readMaskBuilder_;
    /**
     *
     *
     * <pre>
     * Optional. Read mask is used for a more granular control over what the API returns.
     * If the mask is not present all fields will be returned except
     * [Queue.stats]. [Queue.stats] will be returned only if it was  explicitly
     * specified in the mask.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask read_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return Whether the readMask field is set.
     */
    public boolean hasReadMask() {
      return readMaskBuilder_ != null || readMask_ != null;
    }
    /**
     *
     *
     * <pre>
     * Optional. Read mask is used for a more granular control over what the API returns.
     * If the mask is not present all fields will be returned except
     * [Queue.stats]. [Queue.stats] will be returned only if it was  explicitly
     * specified in the mask.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask read_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The readMask.
     */
    public com.google.protobuf.FieldMask getReadMask() {
      if (readMaskBuilder_ == null) {
        return readMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : readMask_;
      } else {
        return readMaskBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Read mask is used for a more granular control over what the API returns.
     * If the mask is not present all fields will be returned except
     * [Queue.stats]. [Queue.stats] will be returned only if it was  explicitly
     * specified in the mask.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask read_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder setReadMask(com.google.protobuf.FieldMask value) {
      if (readMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        readMask_ = value;
        onChanged();
      } else {
        readMaskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Read mask is used for a more granular control over what the API returns.
     * If the mask is not present all fields will be returned except
     * [Queue.stats]. [Queue.stats] will be returned only if it was  explicitly
     * specified in the mask.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask read_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder setReadMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (readMaskBuilder_ == null) {
        readMask_ = builderForValue.build();
        onChanged();
      } else {
        readMaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Read mask is used for a more granular control over what the API returns.
     * If the mask is not present all fields will be returned except
     * [Queue.stats]. [Queue.stats] will be returned only if it was  explicitly
     * specified in the mask.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask read_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder mergeReadMask(com.google.protobuf.FieldMask value) {
      if (readMaskBuilder_ == null) {
        if (readMask_ != null) {
          readMask_ =
              com.google.protobuf.FieldMask.newBuilder(readMask_).mergeFrom(value).buildPartial();
        } else {
          readMask_ = value;
        }
        onChanged();
      } else {
        readMaskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Read mask is used for a more granular control over what the API returns.
     * If the mask is not present all fields will be returned except
     * [Queue.stats]. [Queue.stats] will be returned only if it was  explicitly
     * specified in the mask.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask read_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder clearReadMask() {
      if (readMaskBuilder_ == null) {
        readMask_ = null;
        onChanged();
      } else {
        readMask_ = null;
        readMaskBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Read mask is used for a more granular control over what the API returns.
     * If the mask is not present all fields will be returned except
     * [Queue.stats]. [Queue.stats] will be returned only if it was  explicitly
     * specified in the mask.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask read_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.protobuf.FieldMask.Builder getReadMaskBuilder() {

      onChanged();
      return getReadMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Optional. Read mask is used for a more granular control over what the API returns.
     * If the mask is not present all fields will be returned except
     * [Queue.stats]. [Queue.stats] will be returned only if it was  explicitly
     * specified in the mask.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask read_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getReadMaskOrBuilder() {
      if (readMaskBuilder_ != null) {
        return readMaskBuilder_.getMessageOrBuilder();
      } else {
        return readMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : readMask_;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Read mask is used for a more granular control over what the API returns.
     * If the mask is not present all fields will be returned except
     * [Queue.stats]. [Queue.stats] will be returned only if it was  explicitly
     * specified in the mask.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask read_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        getReadMaskFieldBuilder() {
      if (readMaskBuilder_ == null) {
        readMaskBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.FieldMask,
                com.google.protobuf.FieldMask.Builder,
                com.google.protobuf.FieldMaskOrBuilder>(
                getReadMask(), getParentForChildren(), isClean());
        readMask_ = null;
      }
      return readMaskBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.tasks.v2beta3.GetQueueRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.tasks.v2beta3.GetQueueRequest)
  private static final com.google.cloud.tasks.v2beta3.GetQueueRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.tasks.v2beta3.GetQueueRequest();
  }

  public static com.google.cloud.tasks.v2beta3.GetQueueRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetQueueRequest> PARSER =
      new com.google.protobuf.AbstractParser<GetQueueRequest>() {
        @java.lang.Override
        public GetQueueRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new GetQueueRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<GetQueueRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetQueueRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.tasks.v2beta3.GetQueueRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
