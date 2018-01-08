/*
 * Copyright 2016 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.google.privacy.dlp.v2beta2;

import com.google.common.base.Preconditions;
import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import com.google.api.resourcenames.ResourceNameType;
import java.io.IOException;
import java.util.Map;

// AUTO-GENERATED DOCUMENTATION AND CLASS
@javax.annotation.Generated("by GAPIC protoc plugin")
public class DeidentifyTemplateName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("organizations/{organization}/deidentifyTemplates/{deidentify_template}");

  private final String organization;
  private final String deidentifyTemplate;

  public String getOrganization() {
    return organization;
  }

  public String getDeidentifyTemplate() {
    return deidentifyTemplate;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private DeidentifyTemplateName(Builder builder) {
    organization = Preconditions.checkNotNull(builder.getOrganization());
    deidentifyTemplate = Preconditions.checkNotNull(builder.getDeidentifyTemplate());
  }

  public static DeidentifyTemplateName of(String organization, String deidentifyTemplate) {
    return newBuilder()
      .setOrganization(organization)
      .setDeidentifyTemplate(deidentifyTemplate)
      .build();
  }

  /**
   * @deprecated Use {@link #of(String, String)} instead.
   */
  @Deprecated
  public static DeidentifyTemplateName create(String organization, String deidentifyTemplate) {
    return of(organization, deidentifyTemplate);
  }

  public static DeidentifyTemplateName parse(String formattedString) {
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "DeidentifyTemplateName.parse: formattedString not in valid format");
    return of(matchMap.get("organization"), matchMap.get("deidentify_template"));
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  @Override
  public ResourceNameType getType() {
    return DeidentifyTemplateNameType.instance();
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate("organization", organization, "deidentify_template", deidentifyTemplate);
  }

  /** Builder for DeidentifyTemplateName. */
  public static class Builder {

    private String organization;
    private String deidentifyTemplate;

    public String getOrganization() {
      return organization;
    }

    public String getDeidentifyTemplate() {
      return deidentifyTemplate;
    }

    public Builder setOrganization(String organization) {
      this.organization = organization;
      return this;
    }

    public Builder setDeidentifyTemplate(String deidentifyTemplate) {
      this.deidentifyTemplate = deidentifyTemplate;
      return this;
    }

    private Builder() {
    }

    private Builder(DeidentifyTemplateName deidentifyTemplateName) {
      organization = deidentifyTemplateName.organization;
      deidentifyTemplate = deidentifyTemplateName.deidentifyTemplate;
    }

    public DeidentifyTemplateName build() {
      return new DeidentifyTemplateName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof DeidentifyTemplateName) {
      DeidentifyTemplateName that = (DeidentifyTemplateName) o;
      return (this.organization.equals(that.organization))
          && (this.deidentifyTemplate.equals(that.deidentifyTemplate));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= organization.hashCode();
    h *= 1000003;
    h ^= deidentifyTemplate.hashCode();
    return h;
  }
}

