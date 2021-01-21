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
// source: google/cloud/tasks/v2beta3/queue.proto

package com.google.cloud.tasks.v2beta3;

/**
 *
 *
 * <pre>
 * Rate limits.
 * This message determines the maximum rate that tasks can be dispatched by a
 * queue, regardless of whether the dispatch is a first task attempt or a retry.
 * Note: The debugging command, [RunTask][google.cloud.tasks.v2beta3.CloudTasks.RunTask], will run a task
 * even if the queue has reached its [RateLimits][google.cloud.tasks.v2beta3.RateLimits].
 * </pre>
 *
 * Protobuf type {@code google.cloud.tasks.v2beta3.RateLimits}
 */
public final class RateLimits extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.tasks.v2beta3.RateLimits)
    RateLimitsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RateLimits.newBuilder() to construct.
  private RateLimits(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RateLimits() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RateLimits();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private RateLimits(
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
          case 9:
            {
              maxDispatchesPerSecond_ = input.readDouble();
              break;
            }
          case 16:
            {
              maxBurstSize_ = input.readInt32();
              break;
            }
          case 24:
            {
              maxConcurrentDispatches_ = input.readInt32();
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
    return com.google.cloud.tasks.v2beta3.QueueProto
        .internal_static_google_cloud_tasks_v2beta3_RateLimits_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.tasks.v2beta3.QueueProto
        .internal_static_google_cloud_tasks_v2beta3_RateLimits_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.tasks.v2beta3.RateLimits.class,
            com.google.cloud.tasks.v2beta3.RateLimits.Builder.class);
  }

  public static final int MAX_DISPATCHES_PER_SECOND_FIELD_NUMBER = 1;
  private double maxDispatchesPerSecond_;
  /**
   *
   *
   * <pre>
   * The maximum rate at which tasks are dispatched from this queue.
   * If unspecified when the queue is created, Cloud Tasks will pick the
   * default.
   * * For [App Engine queues][google.cloud.tasks.v2beta3.AppEngineHttpQueue], the maximum allowed value
   *   is 500.
   * This field has the same meaning as
   * [rate in
   * queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#rate).
   * </pre>
   *
   * <code>double max_dispatches_per_second = 1;</code>
   *
   * @return The maxDispatchesPerSecond.
   */
  @java.lang.Override
  public double getMaxDispatchesPerSecond() {
    return maxDispatchesPerSecond_;
  }

  public static final int MAX_BURST_SIZE_FIELD_NUMBER = 2;
  private int maxBurstSize_;
  /**
   *
   *
   * <pre>
   * The max burst size.
   * Max burst size limits how fast tasks in queue are processed when
   * many tasks are in the queue and the rate is high. This field
   * allows the queue to have a high rate so processing starts shortly
   * after a task is enqueued, but still limits resource usage when
   * many tasks are enqueued in a short period of time.
   * The [token bucket](https://wikipedia.org/wiki/Token_Bucket)
   * algorithm is used to control the rate of task dispatches. Each
   * queue has a token bucket that holds tokens, up to the maximum
   * specified by `max_burst_size`. Each time a task is dispatched, a
   * token is removed from the bucket. Tasks will be dispatched until
   * the queue's bucket runs out of tokens. The bucket will be
   * continuously refilled with new tokens based on
   * [max_dispatches_per_second][google.cloud.tasks.v2beta3.RateLimits.max_dispatches_per_second].
   * The default value of `max_burst_size` is picked by Cloud Tasks
   * based on the value of
   * [max_dispatches_per_second][google.cloud.tasks.v2beta3.RateLimits.max_dispatches_per_second].
   * The maximum value of `max_burst_size` is 500.
   * For App Engine queues that were created or updated using
   * `queue.yaml/xml`, `max_burst_size` is equal to
   * [bucket_size](https://cloud.google.com/appengine/docs/standard/python/config/queueref#bucket_size).
   * If
   * [UpdateQueue][google.cloud.tasks.v2beta3.CloudTasks.UpdateQueue] is called on a queue without
   * explicitly setting a value for `max_burst_size`,
   * `max_burst_size` value will get updated if
   * [UpdateQueue][google.cloud.tasks.v2beta3.CloudTasks.UpdateQueue] is updating
   * [max_dispatches_per_second][google.cloud.tasks.v2beta3.RateLimits.max_dispatches_per_second].
   * </pre>
   *
   * <code>int32 max_burst_size = 2;</code>
   *
   * @return The maxBurstSize.
   */
  @java.lang.Override
  public int getMaxBurstSize() {
    return maxBurstSize_;
  }

  public static final int MAX_CONCURRENT_DISPATCHES_FIELD_NUMBER = 3;
  private int maxConcurrentDispatches_;
  /**
   *
   *
   * <pre>
   * The maximum number of concurrent tasks that Cloud Tasks allows
   * to be dispatched for this queue. After this threshold has been
   * reached, Cloud Tasks stops dispatching tasks until the number of
   * concurrent requests decreases.
   * If unspecified when the queue is created, Cloud Tasks will pick the
   * default.
   * The maximum allowed value is 5,000.
   * This field has the same meaning as
   * [max_concurrent_requests in
   * queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#max_concurrent_requests).
   * </pre>
   *
   * <code>int32 max_concurrent_dispatches = 3;</code>
   *
   * @return The maxConcurrentDispatches.
   */
  @java.lang.Override
  public int getMaxConcurrentDispatches() {
    return maxConcurrentDispatches_;
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
    if (maxDispatchesPerSecond_ != 0D) {
      output.writeDouble(1, maxDispatchesPerSecond_);
    }
    if (maxBurstSize_ != 0) {
      output.writeInt32(2, maxBurstSize_);
    }
    if (maxConcurrentDispatches_ != 0) {
      output.writeInt32(3, maxConcurrentDispatches_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (maxDispatchesPerSecond_ != 0D) {
      size += com.google.protobuf.CodedOutputStream.computeDoubleSize(1, maxDispatchesPerSecond_);
    }
    if (maxBurstSize_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, maxBurstSize_);
    }
    if (maxConcurrentDispatches_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(3, maxConcurrentDispatches_);
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
    if (!(obj instanceof com.google.cloud.tasks.v2beta3.RateLimits)) {
      return super.equals(obj);
    }
    com.google.cloud.tasks.v2beta3.RateLimits other =
        (com.google.cloud.tasks.v2beta3.RateLimits) obj;

    if (java.lang.Double.doubleToLongBits(getMaxDispatchesPerSecond())
        != java.lang.Double.doubleToLongBits(other.getMaxDispatchesPerSecond())) return false;
    if (getMaxBurstSize() != other.getMaxBurstSize()) return false;
    if (getMaxConcurrentDispatches() != other.getMaxConcurrentDispatches()) return false;
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
    hash = (37 * hash) + MAX_DISPATCHES_PER_SECOND_FIELD_NUMBER;
    hash =
        (53 * hash)
            + com.google.protobuf.Internal.hashLong(
                java.lang.Double.doubleToLongBits(getMaxDispatchesPerSecond()));
    hash = (37 * hash) + MAX_BURST_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getMaxBurstSize();
    hash = (37 * hash) + MAX_CONCURRENT_DISPATCHES_FIELD_NUMBER;
    hash = (53 * hash) + getMaxConcurrentDispatches();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.tasks.v2beta3.RateLimits parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.tasks.v2beta3.RateLimits parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.tasks.v2beta3.RateLimits parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.tasks.v2beta3.RateLimits parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.tasks.v2beta3.RateLimits parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.tasks.v2beta3.RateLimits parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.tasks.v2beta3.RateLimits parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.tasks.v2beta3.RateLimits parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.tasks.v2beta3.RateLimits parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.tasks.v2beta3.RateLimits parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.tasks.v2beta3.RateLimits parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.tasks.v2beta3.RateLimits parseFrom(
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

  public static Builder newBuilder(com.google.cloud.tasks.v2beta3.RateLimits prototype) {
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
   * Rate limits.
   * This message determines the maximum rate that tasks can be dispatched by a
   * queue, regardless of whether the dispatch is a first task attempt or a retry.
   * Note: The debugging command, [RunTask][google.cloud.tasks.v2beta3.CloudTasks.RunTask], will run a task
   * even if the queue has reached its [RateLimits][google.cloud.tasks.v2beta3.RateLimits].
   * </pre>
   *
   * Protobuf type {@code google.cloud.tasks.v2beta3.RateLimits}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.tasks.v2beta3.RateLimits)
      com.google.cloud.tasks.v2beta3.RateLimitsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.tasks.v2beta3.QueueProto
          .internal_static_google_cloud_tasks_v2beta3_RateLimits_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.tasks.v2beta3.QueueProto
          .internal_static_google_cloud_tasks_v2beta3_RateLimits_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.tasks.v2beta3.RateLimits.class,
              com.google.cloud.tasks.v2beta3.RateLimits.Builder.class);
    }

    // Construct using com.google.cloud.tasks.v2beta3.RateLimits.newBuilder()
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
      maxDispatchesPerSecond_ = 0D;

      maxBurstSize_ = 0;

      maxConcurrentDispatches_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.tasks.v2beta3.QueueProto
          .internal_static_google_cloud_tasks_v2beta3_RateLimits_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.tasks.v2beta3.RateLimits getDefaultInstanceForType() {
      return com.google.cloud.tasks.v2beta3.RateLimits.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.tasks.v2beta3.RateLimits build() {
      com.google.cloud.tasks.v2beta3.RateLimits result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.tasks.v2beta3.RateLimits buildPartial() {
      com.google.cloud.tasks.v2beta3.RateLimits result =
          new com.google.cloud.tasks.v2beta3.RateLimits(this);
      result.maxDispatchesPerSecond_ = maxDispatchesPerSecond_;
      result.maxBurstSize_ = maxBurstSize_;
      result.maxConcurrentDispatches_ = maxConcurrentDispatches_;
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
      if (other instanceof com.google.cloud.tasks.v2beta3.RateLimits) {
        return mergeFrom((com.google.cloud.tasks.v2beta3.RateLimits) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.tasks.v2beta3.RateLimits other) {
      if (other == com.google.cloud.tasks.v2beta3.RateLimits.getDefaultInstance()) return this;
      if (other.getMaxDispatchesPerSecond() != 0D) {
        setMaxDispatchesPerSecond(other.getMaxDispatchesPerSecond());
      }
      if (other.getMaxBurstSize() != 0) {
        setMaxBurstSize(other.getMaxBurstSize());
      }
      if (other.getMaxConcurrentDispatches() != 0) {
        setMaxConcurrentDispatches(other.getMaxConcurrentDispatches());
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
      com.google.cloud.tasks.v2beta3.RateLimits parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.tasks.v2beta3.RateLimits) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private double maxDispatchesPerSecond_;
    /**
     *
     *
     * <pre>
     * The maximum rate at which tasks are dispatched from this queue.
     * If unspecified when the queue is created, Cloud Tasks will pick the
     * default.
     * * For [App Engine queues][google.cloud.tasks.v2beta3.AppEngineHttpQueue], the maximum allowed value
     *   is 500.
     * This field has the same meaning as
     * [rate in
     * queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#rate).
     * </pre>
     *
     * <code>double max_dispatches_per_second = 1;</code>
     *
     * @return The maxDispatchesPerSecond.
     */
    @java.lang.Override
    public double getMaxDispatchesPerSecond() {
      return maxDispatchesPerSecond_;
    }
    /**
     *
     *
     * <pre>
     * The maximum rate at which tasks are dispatched from this queue.
     * If unspecified when the queue is created, Cloud Tasks will pick the
     * default.
     * * For [App Engine queues][google.cloud.tasks.v2beta3.AppEngineHttpQueue], the maximum allowed value
     *   is 500.
     * This field has the same meaning as
     * [rate in
     * queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#rate).
     * </pre>
     *
     * <code>double max_dispatches_per_second = 1;</code>
     *
     * @param value The maxDispatchesPerSecond to set.
     * @return This builder for chaining.
     */
    public Builder setMaxDispatchesPerSecond(double value) {

      maxDispatchesPerSecond_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The maximum rate at which tasks are dispatched from this queue.
     * If unspecified when the queue is created, Cloud Tasks will pick the
     * default.
     * * For [App Engine queues][google.cloud.tasks.v2beta3.AppEngineHttpQueue], the maximum allowed value
     *   is 500.
     * This field has the same meaning as
     * [rate in
     * queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#rate).
     * </pre>
     *
     * <code>double max_dispatches_per_second = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMaxDispatchesPerSecond() {

      maxDispatchesPerSecond_ = 0D;
      onChanged();
      return this;
    }

    private int maxBurstSize_;
    /**
     *
     *
     * <pre>
     * The max burst size.
     * Max burst size limits how fast tasks in queue are processed when
     * many tasks are in the queue and the rate is high. This field
     * allows the queue to have a high rate so processing starts shortly
     * after a task is enqueued, but still limits resource usage when
     * many tasks are enqueued in a short period of time.
     * The [token bucket](https://wikipedia.org/wiki/Token_Bucket)
     * algorithm is used to control the rate of task dispatches. Each
     * queue has a token bucket that holds tokens, up to the maximum
     * specified by `max_burst_size`. Each time a task is dispatched, a
     * token is removed from the bucket. Tasks will be dispatched until
     * the queue's bucket runs out of tokens. The bucket will be
     * continuously refilled with new tokens based on
     * [max_dispatches_per_second][google.cloud.tasks.v2beta3.RateLimits.max_dispatches_per_second].
     * The default value of `max_burst_size` is picked by Cloud Tasks
     * based on the value of
     * [max_dispatches_per_second][google.cloud.tasks.v2beta3.RateLimits.max_dispatches_per_second].
     * The maximum value of `max_burst_size` is 500.
     * For App Engine queues that were created or updated using
     * `queue.yaml/xml`, `max_burst_size` is equal to
     * [bucket_size](https://cloud.google.com/appengine/docs/standard/python/config/queueref#bucket_size).
     * If
     * [UpdateQueue][google.cloud.tasks.v2beta3.CloudTasks.UpdateQueue] is called on a queue without
     * explicitly setting a value for `max_burst_size`,
     * `max_burst_size` value will get updated if
     * [UpdateQueue][google.cloud.tasks.v2beta3.CloudTasks.UpdateQueue] is updating
     * [max_dispatches_per_second][google.cloud.tasks.v2beta3.RateLimits.max_dispatches_per_second].
     * </pre>
     *
     * <code>int32 max_burst_size = 2;</code>
     *
     * @return The maxBurstSize.
     */
    @java.lang.Override
    public int getMaxBurstSize() {
      return maxBurstSize_;
    }
    /**
     *
     *
     * <pre>
     * The max burst size.
     * Max burst size limits how fast tasks in queue are processed when
     * many tasks are in the queue and the rate is high. This field
     * allows the queue to have a high rate so processing starts shortly
     * after a task is enqueued, but still limits resource usage when
     * many tasks are enqueued in a short period of time.
     * The [token bucket](https://wikipedia.org/wiki/Token_Bucket)
     * algorithm is used to control the rate of task dispatches. Each
     * queue has a token bucket that holds tokens, up to the maximum
     * specified by `max_burst_size`. Each time a task is dispatched, a
     * token is removed from the bucket. Tasks will be dispatched until
     * the queue's bucket runs out of tokens. The bucket will be
     * continuously refilled with new tokens based on
     * [max_dispatches_per_second][google.cloud.tasks.v2beta3.RateLimits.max_dispatches_per_second].
     * The default value of `max_burst_size` is picked by Cloud Tasks
     * based on the value of
     * [max_dispatches_per_second][google.cloud.tasks.v2beta3.RateLimits.max_dispatches_per_second].
     * The maximum value of `max_burst_size` is 500.
     * For App Engine queues that were created or updated using
     * `queue.yaml/xml`, `max_burst_size` is equal to
     * [bucket_size](https://cloud.google.com/appengine/docs/standard/python/config/queueref#bucket_size).
     * If
     * [UpdateQueue][google.cloud.tasks.v2beta3.CloudTasks.UpdateQueue] is called on a queue without
     * explicitly setting a value for `max_burst_size`,
     * `max_burst_size` value will get updated if
     * [UpdateQueue][google.cloud.tasks.v2beta3.CloudTasks.UpdateQueue] is updating
     * [max_dispatches_per_second][google.cloud.tasks.v2beta3.RateLimits.max_dispatches_per_second].
     * </pre>
     *
     * <code>int32 max_burst_size = 2;</code>
     *
     * @param value The maxBurstSize to set.
     * @return This builder for chaining.
     */
    public Builder setMaxBurstSize(int value) {

      maxBurstSize_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The max burst size.
     * Max burst size limits how fast tasks in queue are processed when
     * many tasks are in the queue and the rate is high. This field
     * allows the queue to have a high rate so processing starts shortly
     * after a task is enqueued, but still limits resource usage when
     * many tasks are enqueued in a short period of time.
     * The [token bucket](https://wikipedia.org/wiki/Token_Bucket)
     * algorithm is used to control the rate of task dispatches. Each
     * queue has a token bucket that holds tokens, up to the maximum
     * specified by `max_burst_size`. Each time a task is dispatched, a
     * token is removed from the bucket. Tasks will be dispatched until
     * the queue's bucket runs out of tokens. The bucket will be
     * continuously refilled with new tokens based on
     * [max_dispatches_per_second][google.cloud.tasks.v2beta3.RateLimits.max_dispatches_per_second].
     * The default value of `max_burst_size` is picked by Cloud Tasks
     * based on the value of
     * [max_dispatches_per_second][google.cloud.tasks.v2beta3.RateLimits.max_dispatches_per_second].
     * The maximum value of `max_burst_size` is 500.
     * For App Engine queues that were created or updated using
     * `queue.yaml/xml`, `max_burst_size` is equal to
     * [bucket_size](https://cloud.google.com/appengine/docs/standard/python/config/queueref#bucket_size).
     * If
     * [UpdateQueue][google.cloud.tasks.v2beta3.CloudTasks.UpdateQueue] is called on a queue without
     * explicitly setting a value for `max_burst_size`,
     * `max_burst_size` value will get updated if
     * [UpdateQueue][google.cloud.tasks.v2beta3.CloudTasks.UpdateQueue] is updating
     * [max_dispatches_per_second][google.cloud.tasks.v2beta3.RateLimits.max_dispatches_per_second].
     * </pre>
     *
     * <code>int32 max_burst_size = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMaxBurstSize() {

      maxBurstSize_ = 0;
      onChanged();
      return this;
    }

    private int maxConcurrentDispatches_;
    /**
     *
     *
     * <pre>
     * The maximum number of concurrent tasks that Cloud Tasks allows
     * to be dispatched for this queue. After this threshold has been
     * reached, Cloud Tasks stops dispatching tasks until the number of
     * concurrent requests decreases.
     * If unspecified when the queue is created, Cloud Tasks will pick the
     * default.
     * The maximum allowed value is 5,000.
     * This field has the same meaning as
     * [max_concurrent_requests in
     * queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#max_concurrent_requests).
     * </pre>
     *
     * <code>int32 max_concurrent_dispatches = 3;</code>
     *
     * @return The maxConcurrentDispatches.
     */
    @java.lang.Override
    public int getMaxConcurrentDispatches() {
      return maxConcurrentDispatches_;
    }
    /**
     *
     *
     * <pre>
     * The maximum number of concurrent tasks that Cloud Tasks allows
     * to be dispatched for this queue. After this threshold has been
     * reached, Cloud Tasks stops dispatching tasks until the number of
     * concurrent requests decreases.
     * If unspecified when the queue is created, Cloud Tasks will pick the
     * default.
     * The maximum allowed value is 5,000.
     * This field has the same meaning as
     * [max_concurrent_requests in
     * queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#max_concurrent_requests).
     * </pre>
     *
     * <code>int32 max_concurrent_dispatches = 3;</code>
     *
     * @param value The maxConcurrentDispatches to set.
     * @return This builder for chaining.
     */
    public Builder setMaxConcurrentDispatches(int value) {

      maxConcurrentDispatches_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The maximum number of concurrent tasks that Cloud Tasks allows
     * to be dispatched for this queue. After this threshold has been
     * reached, Cloud Tasks stops dispatching tasks until the number of
     * concurrent requests decreases.
     * If unspecified when the queue is created, Cloud Tasks will pick the
     * default.
     * The maximum allowed value is 5,000.
     * This field has the same meaning as
     * [max_concurrent_requests in
     * queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#max_concurrent_requests).
     * </pre>
     *
     * <code>int32 max_concurrent_dispatches = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMaxConcurrentDispatches() {

      maxConcurrentDispatches_ = 0;
      onChanged();
      return this;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.tasks.v2beta3.RateLimits)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.tasks.v2beta3.RateLimits)
  private static final com.google.cloud.tasks.v2beta3.RateLimits DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.tasks.v2beta3.RateLimits();
  }

  public static com.google.cloud.tasks.v2beta3.RateLimits getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RateLimits> PARSER =
      new com.google.protobuf.AbstractParser<RateLimits>() {
        @java.lang.Override
        public RateLimits parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new RateLimits(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<RateLimits> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RateLimits> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.tasks.v2beta3.RateLimits getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
