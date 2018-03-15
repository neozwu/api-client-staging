// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/videointelligence/v1p1beta1/video_intelligence.proto

package com.google.cloud.videointelligence.v1p1beta1;

public interface EmotionAttributeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.videointelligence.v1p1beta1.EmotionAttribute)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Emotion entry.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1p1beta1.Emotion emotion = 1;</code>
   */
  int getEmotionValue();
  /**
   * <pre>
   * Emotion entry.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1p1beta1.Emotion emotion = 1;</code>
   */
  com.google.cloud.videointelligence.v1p1beta1.Emotion getEmotion();

  /**
   * <pre>
   * Confidence score.
   * </pre>
   *
   * <code>float score = 2;</code>
   */
  float getScore();
}
