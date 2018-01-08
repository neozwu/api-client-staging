// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2beta2/dlp.proto

package com.google.privacy.dlp.v2beta2;

public interface InspectDataSourceRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2beta2.InspectDataSourceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The parent resource name, for example projects/my-project-id.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   * <pre>
   * The parent resource name, for example projects/my-project-id.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * A configuration for the job.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta2.InspectJobConfig job_config = 2;</code>
   */
  boolean hasJobConfig();
  /**
   * <pre>
   * A configuration for the job.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta2.InspectJobConfig job_config = 2;</code>
   */
  com.google.privacy.dlp.v2beta2.InspectJobConfig getJobConfig();
  /**
   * <pre>
   * A configuration for the job.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta2.InspectJobConfig job_config = 2;</code>
   */
  com.google.privacy.dlp.v2beta2.InspectJobConfigOrBuilder getJobConfigOrBuilder();
}
