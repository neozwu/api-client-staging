// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2beta2/dlp.proto

package com.google.privacy.dlp.v2beta2;

public interface CreateDeidentifyTemplateRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2beta2.CreateDeidentifyTemplateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The parent resource name, for example projects/my-project-id or
   * organizations/my-org-id.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   * <pre>
   * The parent resource name, for example projects/my-project-id or
   * organizations/my-org-id.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * The DeidentifyTemplate to create.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta2.DeidentifyTemplate deidentify_template = 2;</code>
   */
  boolean hasDeidentifyTemplate();
  /**
   * <pre>
   * The DeidentifyTemplate to create.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta2.DeidentifyTemplate deidentify_template = 2;</code>
   */
  com.google.privacy.dlp.v2beta2.DeidentifyTemplate getDeidentifyTemplate();
  /**
   * <pre>
   * The DeidentifyTemplate to create.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta2.DeidentifyTemplate deidentify_template = 2;</code>
   */
  com.google.privacy.dlp.v2beta2.DeidentifyTemplateOrBuilder getDeidentifyTemplateOrBuilder();

  /**
   * <pre>
   * The template id can contain uppercase and lowercase letters,
   * numbers, and hyphens; that is, it must match the regular
   * expression: `[a-zA-Z&#92;&#92;d-]+`. The maximum length is 100
   * characters. Can be empty to allow the system to generate one.
   * </pre>
   *
   * <code>string template_id = 3;</code>
   */
  java.lang.String getTemplateId();
  /**
   * <pre>
   * The template id can contain uppercase and lowercase letters,
   * numbers, and hyphens; that is, it must match the regular
   * expression: `[a-zA-Z&#92;&#92;d-]+`. The maximum length is 100
   * characters. Can be empty to allow the system to generate one.
   * </pre>
   *
   * <code>string template_id = 3;</code>
   */
  com.google.protobuf.ByteString
      getTemplateIdBytes();
}
