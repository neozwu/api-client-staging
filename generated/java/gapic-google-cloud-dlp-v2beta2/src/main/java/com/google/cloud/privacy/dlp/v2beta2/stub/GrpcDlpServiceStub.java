/*
 * Copyright 2017 Google LLC
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
package com.google.cloud.privacy.dlp.v2beta2.stub;

import static com.google.cloud.privacy.dlp.v2beta2.PagedResponseWrappers.ListDeidentifyTemplatesPagedResponse;
import static com.google.cloud.privacy.dlp.v2beta2.PagedResponseWrappers.ListDlpJobsPagedResponse;
import static com.google.cloud.privacy.dlp.v2beta2.PagedResponseWrappers.ListInspectTemplatesPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.privacy.dlp.v2beta2.DlpServiceSettings;
import com.google.privacy.dlp.v2beta2.AnalyzeDataSourceRiskRequest;
import com.google.privacy.dlp.v2beta2.CancelDlpJobRequest;
import com.google.privacy.dlp.v2beta2.CreateDeidentifyTemplateRequest;
import com.google.privacy.dlp.v2beta2.CreateInspectTemplateRequest;
import com.google.privacy.dlp.v2beta2.DeidentifyContentRequest;
import com.google.privacy.dlp.v2beta2.DeidentifyContentResponse;
import com.google.privacy.dlp.v2beta2.DeidentifyTemplate;
import com.google.privacy.dlp.v2beta2.DeleteDeidentifyTemplateRequest;
import com.google.privacy.dlp.v2beta2.DeleteDlpJobRequest;
import com.google.privacy.dlp.v2beta2.DeleteInspectTemplateRequest;
import com.google.privacy.dlp.v2beta2.DlpJob;
import com.google.privacy.dlp.v2beta2.GetDeidentifyTemplateRequest;
import com.google.privacy.dlp.v2beta2.GetDlpJobRequest;
import com.google.privacy.dlp.v2beta2.GetInspectTemplateRequest;
import com.google.privacy.dlp.v2beta2.InspectContentRequest;
import com.google.privacy.dlp.v2beta2.InspectContentResponse;
import com.google.privacy.dlp.v2beta2.InspectDataSourceRequest;
import com.google.privacy.dlp.v2beta2.InspectTemplate;
import com.google.privacy.dlp.v2beta2.ListDeidentifyTemplatesRequest;
import com.google.privacy.dlp.v2beta2.ListDeidentifyTemplatesResponse;
import com.google.privacy.dlp.v2beta2.ListDlpJobsRequest;
import com.google.privacy.dlp.v2beta2.ListDlpJobsResponse;
import com.google.privacy.dlp.v2beta2.ListInfoTypesRequest;
import com.google.privacy.dlp.v2beta2.ListInfoTypesResponse;
import com.google.privacy.dlp.v2beta2.ListInspectTemplatesRequest;
import com.google.privacy.dlp.v2beta2.ListInspectTemplatesResponse;
import com.google.privacy.dlp.v2beta2.RedactImageRequest;
import com.google.privacy.dlp.v2beta2.RedactImageResponse;
import com.google.privacy.dlp.v2beta2.ReidentifyContentRequest;
import com.google.privacy.dlp.v2beta2.ReidentifyContentResponse;
import com.google.privacy.dlp.v2beta2.UpdateDeidentifyTemplateRequest;
import com.google.privacy.dlp.v2beta2.UpdateInspectTemplateRequest;
import com.google.protobuf.Empty;
import io.grpc.MethodDescriptor;
import io.grpc.protobuf.ProtoUtils;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * gRPC stub implementation for DLP API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by GAPIC v0.0.5")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public class GrpcDlpServiceStub extends DlpServiceStub {

  private static final MethodDescriptor<InspectContentRequest, InspectContentResponse>
      inspectContentMethodDescriptor =
          MethodDescriptor.<InspectContentRequest, InspectContentResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.privacy.dlp.v2beta2.DlpService/InspectContent")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(InspectContentRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(InspectContentResponse.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<RedactImageRequest, RedactImageResponse>
      redactImageMethodDescriptor =
          MethodDescriptor.<RedactImageRequest, RedactImageResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.privacy.dlp.v2beta2.DlpService/RedactImage")
              .setRequestMarshaller(ProtoUtils.marshaller(RedactImageRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(RedactImageResponse.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<DeidentifyContentRequest, DeidentifyContentResponse>
      deidentifyContentMethodDescriptor =
          MethodDescriptor.<DeidentifyContentRequest, DeidentifyContentResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.privacy.dlp.v2beta2.DlpService/DeidentifyContent")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(DeidentifyContentRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(DeidentifyContentResponse.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<ReidentifyContentRequest, ReidentifyContentResponse>
      reidentifyContentMethodDescriptor =
          MethodDescriptor.<ReidentifyContentRequest, ReidentifyContentResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.privacy.dlp.v2beta2.DlpService/ReidentifyContent")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ReidentifyContentRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ReidentifyContentResponse.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<InspectDataSourceRequest, DlpJob>
      inspectDataSourceMethodDescriptor =
          MethodDescriptor.<InspectDataSourceRequest, DlpJob>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.privacy.dlp.v2beta2.DlpService/InspectDataSource")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(InspectDataSourceRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(DlpJob.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<AnalyzeDataSourceRiskRequest, DlpJob>
      analyzeDataSourceRiskMethodDescriptor =
          MethodDescriptor.<AnalyzeDataSourceRiskRequest, DlpJob>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.privacy.dlp.v2beta2.DlpService/AnalyzeDataSourceRisk")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(AnalyzeDataSourceRiskRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(DlpJob.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<ListInfoTypesRequest, ListInfoTypesResponse>
      listInfoTypesMethodDescriptor =
          MethodDescriptor.<ListInfoTypesRequest, ListInfoTypesResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.privacy.dlp.v2beta2.DlpService/ListInfoTypes")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListInfoTypesRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListInfoTypesResponse.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<CreateInspectTemplateRequest, InspectTemplate>
      createInspectTemplateMethodDescriptor =
          MethodDescriptor.<CreateInspectTemplateRequest, InspectTemplate>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.privacy.dlp.v2beta2.DlpService/CreateInspectTemplate")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(CreateInspectTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(InspectTemplate.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<UpdateInspectTemplateRequest, InspectTemplate>
      updateInspectTemplateMethodDescriptor =
          MethodDescriptor.<UpdateInspectTemplateRequest, InspectTemplate>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.privacy.dlp.v2beta2.DlpService/UpdateInspectTemplate")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(UpdateInspectTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(InspectTemplate.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<GetInspectTemplateRequest, InspectTemplate>
      getInspectTemplateMethodDescriptor =
          MethodDescriptor.<GetInspectTemplateRequest, InspectTemplate>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.privacy.dlp.v2beta2.DlpService/GetInspectTemplate")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetInspectTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(InspectTemplate.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<ListInspectTemplatesRequest, ListInspectTemplatesResponse>
      listInspectTemplatesMethodDescriptor =
          MethodDescriptor.<ListInspectTemplatesRequest, ListInspectTemplatesResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.privacy.dlp.v2beta2.DlpService/ListInspectTemplates")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListInspectTemplatesRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListInspectTemplatesResponse.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<DeleteInspectTemplateRequest, Empty>
      deleteInspectTemplateMethodDescriptor =
          MethodDescriptor.<DeleteInspectTemplateRequest, Empty>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.privacy.dlp.v2beta2.DlpService/DeleteInspectTemplate")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(DeleteInspectTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Empty.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<CreateDeidentifyTemplateRequest, DeidentifyTemplate>
      createDeidentifyTemplateMethodDescriptor =
          MethodDescriptor.<CreateDeidentifyTemplateRequest, DeidentifyTemplate>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.privacy.dlp.v2beta2.DlpService/CreateDeidentifyTemplate")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(CreateDeidentifyTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(DeidentifyTemplate.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<UpdateDeidentifyTemplateRequest, DeidentifyTemplate>
      updateDeidentifyTemplateMethodDescriptor =
          MethodDescriptor.<UpdateDeidentifyTemplateRequest, DeidentifyTemplate>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.privacy.dlp.v2beta2.DlpService/UpdateDeidentifyTemplate")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(UpdateDeidentifyTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(DeidentifyTemplate.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<GetDeidentifyTemplateRequest, DeidentifyTemplate>
      getDeidentifyTemplateMethodDescriptor =
          MethodDescriptor.<GetDeidentifyTemplateRequest, DeidentifyTemplate>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.privacy.dlp.v2beta2.DlpService/GetDeidentifyTemplate")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetDeidentifyTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(DeidentifyTemplate.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<
          ListDeidentifyTemplatesRequest, ListDeidentifyTemplatesResponse>
      listDeidentifyTemplatesMethodDescriptor =
          MethodDescriptor
              .<ListDeidentifyTemplatesRequest, ListDeidentifyTemplatesResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.privacy.dlp.v2beta2.DlpService/ListDeidentifyTemplates")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListDeidentifyTemplatesRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListDeidentifyTemplatesResponse.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<DeleteDeidentifyTemplateRequest, Empty>
      deleteDeidentifyTemplateMethodDescriptor =
          MethodDescriptor.<DeleteDeidentifyTemplateRequest, Empty>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.privacy.dlp.v2beta2.DlpService/DeleteDeidentifyTemplate")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(DeleteDeidentifyTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Empty.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<ListDlpJobsRequest, ListDlpJobsResponse>
      listDlpJobsMethodDescriptor =
          MethodDescriptor.<ListDlpJobsRequest, ListDlpJobsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.privacy.dlp.v2beta2.DlpService/ListDlpJobs")
              .setRequestMarshaller(ProtoUtils.marshaller(ListDlpJobsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListDlpJobsResponse.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<GetDlpJobRequest, DlpJob> getDlpJobMethodDescriptor =
      MethodDescriptor.<GetDlpJobRequest, DlpJob>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.privacy.dlp.v2beta2.DlpService/GetDlpJob")
          .setRequestMarshaller(ProtoUtils.marshaller(GetDlpJobRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(DlpJob.getDefaultInstance()))
          .build();
  private static final MethodDescriptor<DeleteDlpJobRequest, Empty> deleteDlpJobMethodDescriptor =
      MethodDescriptor.<DeleteDlpJobRequest, Empty>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.privacy.dlp.v2beta2.DlpService/DeleteDlpJob")
          .setRequestMarshaller(ProtoUtils.marshaller(DeleteDlpJobRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Empty.getDefaultInstance()))
          .build();
  private static final MethodDescriptor<CancelDlpJobRequest, Empty> cancelDlpJobMethodDescriptor =
      MethodDescriptor.<CancelDlpJobRequest, Empty>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.privacy.dlp.v2beta2.DlpService/CancelDlpJob")
          .setRequestMarshaller(ProtoUtils.marshaller(CancelDlpJobRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Empty.getDefaultInstance()))
          .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<InspectContentRequest, InspectContentResponse> inspectContentCallable;
  private final UnaryCallable<RedactImageRequest, RedactImageResponse> redactImageCallable;
  private final UnaryCallable<DeidentifyContentRequest, DeidentifyContentResponse>
      deidentifyContentCallable;
  private final UnaryCallable<ReidentifyContentRequest, ReidentifyContentResponse>
      reidentifyContentCallable;
  private final UnaryCallable<InspectDataSourceRequest, DlpJob> inspectDataSourceCallable;
  private final UnaryCallable<AnalyzeDataSourceRiskRequest, DlpJob> analyzeDataSourceRiskCallable;
  private final UnaryCallable<ListInfoTypesRequest, ListInfoTypesResponse> listInfoTypesCallable;
  private final UnaryCallable<CreateInspectTemplateRequest, InspectTemplate>
      createInspectTemplateCallable;
  private final UnaryCallable<UpdateInspectTemplateRequest, InspectTemplate>
      updateInspectTemplateCallable;
  private final UnaryCallable<GetInspectTemplateRequest, InspectTemplate>
      getInspectTemplateCallable;
  private final UnaryCallable<ListInspectTemplatesRequest, ListInspectTemplatesResponse>
      listInspectTemplatesCallable;
  private final UnaryCallable<ListInspectTemplatesRequest, ListInspectTemplatesPagedResponse>
      listInspectTemplatesPagedCallable;
  private final UnaryCallable<DeleteInspectTemplateRequest, Empty> deleteInspectTemplateCallable;
  private final UnaryCallable<CreateDeidentifyTemplateRequest, DeidentifyTemplate>
      createDeidentifyTemplateCallable;
  private final UnaryCallable<UpdateDeidentifyTemplateRequest, DeidentifyTemplate>
      updateDeidentifyTemplateCallable;
  private final UnaryCallable<GetDeidentifyTemplateRequest, DeidentifyTemplate>
      getDeidentifyTemplateCallable;
  private final UnaryCallable<ListDeidentifyTemplatesRequest, ListDeidentifyTemplatesResponse>
      listDeidentifyTemplatesCallable;
  private final UnaryCallable<ListDeidentifyTemplatesRequest, ListDeidentifyTemplatesPagedResponse>
      listDeidentifyTemplatesPagedCallable;
  private final UnaryCallable<DeleteDeidentifyTemplateRequest, Empty>
      deleteDeidentifyTemplateCallable;
  private final UnaryCallable<ListDlpJobsRequest, ListDlpJobsResponse> listDlpJobsCallable;
  private final UnaryCallable<ListDlpJobsRequest, ListDlpJobsPagedResponse>
      listDlpJobsPagedCallable;
  private final UnaryCallable<GetDlpJobRequest, DlpJob> getDlpJobCallable;
  private final UnaryCallable<DeleteDlpJobRequest, Empty> deleteDlpJobCallable;
  private final UnaryCallable<CancelDlpJobRequest, Empty> cancelDlpJobCallable;

  public static final GrpcDlpServiceStub create(DlpServiceSettings settings) throws IOException {
    return new GrpcDlpServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcDlpServiceStub create(ClientContext clientContext) throws IOException {
    return new GrpcDlpServiceStub(DlpServiceSettings.newBuilder().build(), clientContext);
  }

  /**
   * Constructs an instance of GrpcDlpServiceStub, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected GrpcDlpServiceStub(DlpServiceSettings settings, ClientContext clientContext)
      throws IOException {

    GrpcCallSettings<InspectContentRequest, InspectContentResponse>
        inspectContentTransportSettings =
            GrpcCallSettings.<InspectContentRequest, InspectContentResponse>newBuilder()
                .setMethodDescriptor(inspectContentMethodDescriptor)
                .build();
    GrpcCallSettings<RedactImageRequest, RedactImageResponse> redactImageTransportSettings =
        GrpcCallSettings.<RedactImageRequest, RedactImageResponse>newBuilder()
            .setMethodDescriptor(redactImageMethodDescriptor)
            .build();
    GrpcCallSettings<DeidentifyContentRequest, DeidentifyContentResponse>
        deidentifyContentTransportSettings =
            GrpcCallSettings.<DeidentifyContentRequest, DeidentifyContentResponse>newBuilder()
                .setMethodDescriptor(deidentifyContentMethodDescriptor)
                .build();
    GrpcCallSettings<ReidentifyContentRequest, ReidentifyContentResponse>
        reidentifyContentTransportSettings =
            GrpcCallSettings.<ReidentifyContentRequest, ReidentifyContentResponse>newBuilder()
                .setMethodDescriptor(reidentifyContentMethodDescriptor)
                .build();
    GrpcCallSettings<InspectDataSourceRequest, DlpJob> inspectDataSourceTransportSettings =
        GrpcCallSettings.<InspectDataSourceRequest, DlpJob>newBuilder()
            .setMethodDescriptor(inspectDataSourceMethodDescriptor)
            .build();
    GrpcCallSettings<AnalyzeDataSourceRiskRequest, DlpJob> analyzeDataSourceRiskTransportSettings =
        GrpcCallSettings.<AnalyzeDataSourceRiskRequest, DlpJob>newBuilder()
            .setMethodDescriptor(analyzeDataSourceRiskMethodDescriptor)
            .build();
    GrpcCallSettings<ListInfoTypesRequest, ListInfoTypesResponse> listInfoTypesTransportSettings =
        GrpcCallSettings.<ListInfoTypesRequest, ListInfoTypesResponse>newBuilder()
            .setMethodDescriptor(listInfoTypesMethodDescriptor)
            .build();
    GrpcCallSettings<CreateInspectTemplateRequest, InspectTemplate>
        createInspectTemplateTransportSettings =
            GrpcCallSettings.<CreateInspectTemplateRequest, InspectTemplate>newBuilder()
                .setMethodDescriptor(createInspectTemplateMethodDescriptor)
                .build();
    GrpcCallSettings<UpdateInspectTemplateRequest, InspectTemplate>
        updateInspectTemplateTransportSettings =
            GrpcCallSettings.<UpdateInspectTemplateRequest, InspectTemplate>newBuilder()
                .setMethodDescriptor(updateInspectTemplateMethodDescriptor)
                .build();
    GrpcCallSettings<GetInspectTemplateRequest, InspectTemplate>
        getInspectTemplateTransportSettings =
            GrpcCallSettings.<GetInspectTemplateRequest, InspectTemplate>newBuilder()
                .setMethodDescriptor(getInspectTemplateMethodDescriptor)
                .build();
    GrpcCallSettings<ListInspectTemplatesRequest, ListInspectTemplatesResponse>
        listInspectTemplatesTransportSettings =
            GrpcCallSettings.<ListInspectTemplatesRequest, ListInspectTemplatesResponse>newBuilder()
                .setMethodDescriptor(listInspectTemplatesMethodDescriptor)
                .build();
    GrpcCallSettings<DeleteInspectTemplateRequest, Empty> deleteInspectTemplateTransportSettings =
        GrpcCallSettings.<DeleteInspectTemplateRequest, Empty>newBuilder()
            .setMethodDescriptor(deleteInspectTemplateMethodDescriptor)
            .build();
    GrpcCallSettings<CreateDeidentifyTemplateRequest, DeidentifyTemplate>
        createDeidentifyTemplateTransportSettings =
            GrpcCallSettings.<CreateDeidentifyTemplateRequest, DeidentifyTemplate>newBuilder()
                .setMethodDescriptor(createDeidentifyTemplateMethodDescriptor)
                .build();
    GrpcCallSettings<UpdateDeidentifyTemplateRequest, DeidentifyTemplate>
        updateDeidentifyTemplateTransportSettings =
            GrpcCallSettings.<UpdateDeidentifyTemplateRequest, DeidentifyTemplate>newBuilder()
                .setMethodDescriptor(updateDeidentifyTemplateMethodDescriptor)
                .build();
    GrpcCallSettings<GetDeidentifyTemplateRequest, DeidentifyTemplate>
        getDeidentifyTemplateTransportSettings =
            GrpcCallSettings.<GetDeidentifyTemplateRequest, DeidentifyTemplate>newBuilder()
                .setMethodDescriptor(getDeidentifyTemplateMethodDescriptor)
                .build();
    GrpcCallSettings<ListDeidentifyTemplatesRequest, ListDeidentifyTemplatesResponse>
        listDeidentifyTemplatesTransportSettings =
            GrpcCallSettings
                .<ListDeidentifyTemplatesRequest, ListDeidentifyTemplatesResponse>newBuilder()
                .setMethodDescriptor(listDeidentifyTemplatesMethodDescriptor)
                .build();
    GrpcCallSettings<DeleteDeidentifyTemplateRequest, Empty>
        deleteDeidentifyTemplateTransportSettings =
            GrpcCallSettings.<DeleteDeidentifyTemplateRequest, Empty>newBuilder()
                .setMethodDescriptor(deleteDeidentifyTemplateMethodDescriptor)
                .build();
    GrpcCallSettings<ListDlpJobsRequest, ListDlpJobsResponse> listDlpJobsTransportSettings =
        GrpcCallSettings.<ListDlpJobsRequest, ListDlpJobsResponse>newBuilder()
            .setMethodDescriptor(listDlpJobsMethodDescriptor)
            .build();
    GrpcCallSettings<GetDlpJobRequest, DlpJob> getDlpJobTransportSettings =
        GrpcCallSettings.<GetDlpJobRequest, DlpJob>newBuilder()
            .setMethodDescriptor(getDlpJobMethodDescriptor)
            .build();
    GrpcCallSettings<DeleteDlpJobRequest, Empty> deleteDlpJobTransportSettings =
        GrpcCallSettings.<DeleteDlpJobRequest, Empty>newBuilder()
            .setMethodDescriptor(deleteDlpJobMethodDescriptor)
            .build();
    GrpcCallSettings<CancelDlpJobRequest, Empty> cancelDlpJobTransportSettings =
        GrpcCallSettings.<CancelDlpJobRequest, Empty>newBuilder()
            .setMethodDescriptor(cancelDlpJobMethodDescriptor)
            .build();

    this.inspectContentCallable =
        GrpcCallableFactory.createUnaryCallable(
            inspectContentTransportSettings, settings.inspectContentSettings(), clientContext);
    this.redactImageCallable =
        GrpcCallableFactory.createUnaryCallable(
            redactImageTransportSettings, settings.redactImageSettings(), clientContext);
    this.deidentifyContentCallable =
        GrpcCallableFactory.createUnaryCallable(
            deidentifyContentTransportSettings,
            settings.deidentifyContentSettings(),
            clientContext);
    this.reidentifyContentCallable =
        GrpcCallableFactory.createUnaryCallable(
            reidentifyContentTransportSettings,
            settings.reidentifyContentSettings(),
            clientContext);
    this.inspectDataSourceCallable =
        GrpcCallableFactory.createUnaryCallable(
            inspectDataSourceTransportSettings,
            settings.inspectDataSourceSettings(),
            clientContext);
    this.analyzeDataSourceRiskCallable =
        GrpcCallableFactory.createUnaryCallable(
            analyzeDataSourceRiskTransportSettings,
            settings.analyzeDataSourceRiskSettings(),
            clientContext);
    this.listInfoTypesCallable =
        GrpcCallableFactory.createUnaryCallable(
            listInfoTypesTransportSettings, settings.listInfoTypesSettings(), clientContext);
    this.createInspectTemplateCallable =
        GrpcCallableFactory.createUnaryCallable(
            createInspectTemplateTransportSettings,
            settings.createInspectTemplateSettings(),
            clientContext);
    this.updateInspectTemplateCallable =
        GrpcCallableFactory.createUnaryCallable(
            updateInspectTemplateTransportSettings,
            settings.updateInspectTemplateSettings(),
            clientContext);
    this.getInspectTemplateCallable =
        GrpcCallableFactory.createUnaryCallable(
            getInspectTemplateTransportSettings,
            settings.getInspectTemplateSettings(),
            clientContext);
    this.listInspectTemplatesCallable =
        GrpcCallableFactory.createUnaryCallable(
            listInspectTemplatesTransportSettings,
            settings.listInspectTemplatesSettings(),
            clientContext);
    this.listInspectTemplatesPagedCallable =
        GrpcCallableFactory.createPagedCallable(
            listInspectTemplatesTransportSettings,
            settings.listInspectTemplatesSettings(),
            clientContext);
    this.deleteInspectTemplateCallable =
        GrpcCallableFactory.createUnaryCallable(
            deleteInspectTemplateTransportSettings,
            settings.deleteInspectTemplateSettings(),
            clientContext);
    this.createDeidentifyTemplateCallable =
        GrpcCallableFactory.createUnaryCallable(
            createDeidentifyTemplateTransportSettings,
            settings.createDeidentifyTemplateSettings(),
            clientContext);
    this.updateDeidentifyTemplateCallable =
        GrpcCallableFactory.createUnaryCallable(
            updateDeidentifyTemplateTransportSettings,
            settings.updateDeidentifyTemplateSettings(),
            clientContext);
    this.getDeidentifyTemplateCallable =
        GrpcCallableFactory.createUnaryCallable(
            getDeidentifyTemplateTransportSettings,
            settings.getDeidentifyTemplateSettings(),
            clientContext);
    this.listDeidentifyTemplatesCallable =
        GrpcCallableFactory.createUnaryCallable(
            listDeidentifyTemplatesTransportSettings,
            settings.listDeidentifyTemplatesSettings(),
            clientContext);
    this.listDeidentifyTemplatesPagedCallable =
        GrpcCallableFactory.createPagedCallable(
            listDeidentifyTemplatesTransportSettings,
            settings.listDeidentifyTemplatesSettings(),
            clientContext);
    this.deleteDeidentifyTemplateCallable =
        GrpcCallableFactory.createUnaryCallable(
            deleteDeidentifyTemplateTransportSettings,
            settings.deleteDeidentifyTemplateSettings(),
            clientContext);
    this.listDlpJobsCallable =
        GrpcCallableFactory.createUnaryCallable(
            listDlpJobsTransportSettings, settings.listDlpJobsSettings(), clientContext);
    this.listDlpJobsPagedCallable =
        GrpcCallableFactory.createPagedCallable(
            listDlpJobsTransportSettings, settings.listDlpJobsSettings(), clientContext);
    this.getDlpJobCallable =
        GrpcCallableFactory.createUnaryCallable(
            getDlpJobTransportSettings, settings.getDlpJobSettings(), clientContext);
    this.deleteDlpJobCallable =
        GrpcCallableFactory.createUnaryCallable(
            deleteDlpJobTransportSettings, settings.deleteDlpJobSettings(), clientContext);
    this.cancelDlpJobCallable =
        GrpcCallableFactory.createUnaryCallable(
            cancelDlpJobTransportSettings, settings.cancelDlpJobSettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public UnaryCallable<InspectContentRequest, InspectContentResponse> inspectContentCallable() {
    return inspectContentCallable;
  }

  public UnaryCallable<RedactImageRequest, RedactImageResponse> redactImageCallable() {
    return redactImageCallable;
  }

  public UnaryCallable<DeidentifyContentRequest, DeidentifyContentResponse>
      deidentifyContentCallable() {
    return deidentifyContentCallable;
  }

  public UnaryCallable<ReidentifyContentRequest, ReidentifyContentResponse>
      reidentifyContentCallable() {
    return reidentifyContentCallable;
  }

  public UnaryCallable<InspectDataSourceRequest, DlpJob> inspectDataSourceCallable() {
    return inspectDataSourceCallable;
  }

  public UnaryCallable<AnalyzeDataSourceRiskRequest, DlpJob> analyzeDataSourceRiskCallable() {
    return analyzeDataSourceRiskCallable;
  }

  public UnaryCallable<ListInfoTypesRequest, ListInfoTypesResponse> listInfoTypesCallable() {
    return listInfoTypesCallable;
  }

  public UnaryCallable<CreateInspectTemplateRequest, InspectTemplate>
      createInspectTemplateCallable() {
    return createInspectTemplateCallable;
  }

  public UnaryCallable<UpdateInspectTemplateRequest, InspectTemplate>
      updateInspectTemplateCallable() {
    return updateInspectTemplateCallable;
  }

  public UnaryCallable<GetInspectTemplateRequest, InspectTemplate> getInspectTemplateCallable() {
    return getInspectTemplateCallable;
  }

  public UnaryCallable<ListInspectTemplatesRequest, ListInspectTemplatesPagedResponse>
      listInspectTemplatesPagedCallable() {
    return listInspectTemplatesPagedCallable;
  }

  public UnaryCallable<ListInspectTemplatesRequest, ListInspectTemplatesResponse>
      listInspectTemplatesCallable() {
    return listInspectTemplatesCallable;
  }

  public UnaryCallable<DeleteInspectTemplateRequest, Empty> deleteInspectTemplateCallable() {
    return deleteInspectTemplateCallable;
  }

  public UnaryCallable<CreateDeidentifyTemplateRequest, DeidentifyTemplate>
      createDeidentifyTemplateCallable() {
    return createDeidentifyTemplateCallable;
  }

  public UnaryCallable<UpdateDeidentifyTemplateRequest, DeidentifyTemplate>
      updateDeidentifyTemplateCallable() {
    return updateDeidentifyTemplateCallable;
  }

  public UnaryCallable<GetDeidentifyTemplateRequest, DeidentifyTemplate>
      getDeidentifyTemplateCallable() {
    return getDeidentifyTemplateCallable;
  }

  public UnaryCallable<ListDeidentifyTemplatesRequest, ListDeidentifyTemplatesPagedResponse>
      listDeidentifyTemplatesPagedCallable() {
    return listDeidentifyTemplatesPagedCallable;
  }

  public UnaryCallable<ListDeidentifyTemplatesRequest, ListDeidentifyTemplatesResponse>
      listDeidentifyTemplatesCallable() {
    return listDeidentifyTemplatesCallable;
  }

  public UnaryCallable<DeleteDeidentifyTemplateRequest, Empty> deleteDeidentifyTemplateCallable() {
    return deleteDeidentifyTemplateCallable;
  }

  public UnaryCallable<ListDlpJobsRequest, ListDlpJobsPagedResponse> listDlpJobsPagedCallable() {
    return listDlpJobsPagedCallable;
  }

  public UnaryCallable<ListDlpJobsRequest, ListDlpJobsResponse> listDlpJobsCallable() {
    return listDlpJobsCallable;
  }

  public UnaryCallable<GetDlpJobRequest, DlpJob> getDlpJobCallable() {
    return getDlpJobCallable;
  }

  public UnaryCallable<DeleteDlpJobRequest, Empty> deleteDlpJobCallable() {
    return deleteDlpJobCallable;
  }

  public UnaryCallable<CancelDlpJobRequest, Empty> cancelDlpJobCallable() {
    return cancelDlpJobCallable;
  }

  @Override
  public final void close() throws Exception {
    shutdown();
  }

  @Override
  public void shutdown() {
    backgroundResources.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return backgroundResources.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return backgroundResources.isTerminated();
  }

  @Override
  public void shutdownNow() {
    backgroundResources.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return backgroundResources.awaitTermination(duration, unit);
  }
}
