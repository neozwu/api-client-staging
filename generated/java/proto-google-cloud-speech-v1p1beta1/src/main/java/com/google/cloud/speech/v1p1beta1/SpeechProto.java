// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/speech/v1p1beta1/cloud_speech.proto

package com.google.cloud.speech.v1p1beta1;

public final class SpeechProto {
  private SpeechProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_speech_v1p1beta1_RecognizeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1p1beta1_RecognizeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_speech_v1p1beta1_LongRunningRecognizeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1p1beta1_LongRunningRecognizeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_speech_v1p1beta1_StreamingRecognizeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1p1beta1_StreamingRecognizeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_speech_v1p1beta1_StreamingRecognitionConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1p1beta1_StreamingRecognitionConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_speech_v1p1beta1_RecognitionConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1p1beta1_RecognitionConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_speech_v1p1beta1_SpeechContext_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1p1beta1_SpeechContext_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_speech_v1p1beta1_RecognitionAudio_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1p1beta1_RecognitionAudio_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_speech_v1p1beta1_RecognizeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1p1beta1_RecognizeResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_speech_v1p1beta1_LongRunningRecognizeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1p1beta1_LongRunningRecognizeResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_speech_v1p1beta1_LongRunningRecognizeMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1p1beta1_LongRunningRecognizeMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_speech_v1p1beta1_StreamingRecognizeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1p1beta1_StreamingRecognizeResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_speech_v1p1beta1_StreamingRecognitionResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1p1beta1_StreamingRecognitionResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_speech_v1p1beta1_SpeechRecognitionResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1p1beta1_SpeechRecognitionResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_speech_v1p1beta1_SpeechRecognitionAlternative_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1p1beta1_SpeechRecognitionAlternative_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_speech_v1p1beta1_WordInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1p1beta1_WordInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0google/cloud/speech/v1p1beta1/cloud_sp" +
      "eech.proto\022\035google.cloud.speech.v1p1beta" +
      "1\032\034google/api/annotations.proto\032#google/" +
      "longrunning/operations.proto\032\031google/pro" +
      "tobuf/any.proto\032\036google/protobuf/duratio" +
      "n.proto\032\037google/protobuf/timestamp.proto" +
      "\032\027google/rpc/status.proto\"\224\001\n\020RecognizeR" +
      "equest\022@\n\006config\030\001 \001(\01320.google.cloud.sp" +
      "eech.v1p1beta1.RecognitionConfig\022>\n\005audi" +
      "o\030\002 \001(\0132/.google.cloud.speech.v1p1beta1.",
      "RecognitionAudio\"\237\001\n\033LongRunningRecogniz" +
      "eRequest\022@\n\006config\030\001 \001(\01320.google.cloud." +
      "speech.v1p1beta1.RecognitionConfig\022>\n\005au" +
      "dio\030\002 \001(\0132/.google.cloud.speech.v1p1beta" +
      "1.RecognitionAudio\"\240\001\n\031StreamingRecogniz" +
      "eRequest\022U\n\020streaming_config\030\001 \001(\01329.goo" +
      "gle.cloud.speech.v1p1beta1.StreamingReco" +
      "gnitionConfigH\000\022\027\n\raudio_content\030\002 \001(\014H\000" +
      "B\023\n\021streaming_request\"\221\001\n\032StreamingRecog" +
      "nitionConfig\022@\n\006config\030\001 \001(\01320.google.cl",
      "oud.speech.v1p1beta1.RecognitionConfig\022\030" +
      "\n\020single_utterance\030\002 \001(\010\022\027\n\017interim_resu" +
      "lts\030\003 \001(\010\"\302\003\n\021RecognitionConfig\022P\n\010encod" +
      "ing\030\001 \001(\0162>.google.cloud.speech.v1p1beta" +
      "1.RecognitionConfig.AudioEncoding\022\031\n\021sam" +
      "ple_rate_hertz\030\002 \001(\005\022\025\n\rlanguage_code\030\003 " +
      "\001(\t\022\030\n\020max_alternatives\030\004 \001(\005\022\030\n\020profani" +
      "ty_filter\030\005 \001(\010\022E\n\017speech_contexts\030\006 \003(\013" +
      "2,.google.cloud.speech.v1p1beta1.SpeechC" +
      "ontext\022 \n\030enable_word_time_offsets\030\010 \001(\010",
      "\"\213\001\n\rAudioEncoding\022\030\n\024ENCODING_UNSPECIFI" +
      "ED\020\000\022\014\n\010LINEAR16\020\001\022\010\n\004FLAC\020\002\022\t\n\005MULAW\020\003\022" +
      "\007\n\003AMR\020\004\022\n\n\006AMR_WB\020\005\022\014\n\010OGG_OPUS\020\006\022\032\n\026SP" +
      "EEX_WITH_HEADER_BYTE\020\007\" \n\rSpeechContext\022" +
      "\017\n\007phrases\030\001 \003(\t\"D\n\020RecognitionAudio\022\021\n\007" +
      "content\030\001 \001(\014H\000\022\r\n\003uri\030\002 \001(\tH\000B\016\n\014audio_" +
      "source\"\\\n\021RecognizeResponse\022G\n\007results\030\002" +
      " \003(\01326.google.cloud.speech.v1p1beta1.Spe" +
      "echRecognitionResult\"g\n\034LongRunningRecog" +
      "nizeResponse\022G\n\007results\030\002 \003(\01326.google.c",
      "loud.speech.v1p1beta1.SpeechRecognitionR" +
      "esult\"\236\001\n\034LongRunningRecognizeMetadata\022\030" +
      "\n\020progress_percent\030\001 \001(\005\022.\n\nstart_time\030\002" +
      " \001(\0132\032.google.protobuf.Timestamp\0224\n\020last" +
      "_update_time\030\003 \001(\0132\032.google.protobuf.Tim" +
      "estamp\"\277\002\n\032StreamingRecognizeResponse\022!\n" +
      "\005error\030\001 \001(\0132\022.google.rpc.Status\022J\n\007resu" +
      "lts\030\002 \003(\01329.google.cloud.speech.v1p1beta" +
      "1.StreamingRecognitionResult\022d\n\021speech_e" +
      "vent_type\030\004 \001(\0162I.google.cloud.speech.v1",
      "p1beta1.StreamingRecognizeResponse.Speec" +
      "hEventType\"L\n\017SpeechEventType\022\034\n\030SPEECH_" +
      "EVENT_UNSPECIFIED\020\000\022\033\n\027END_OF_SINGLE_UTT" +
      "ERANCE\020\001\"\224\001\n\032StreamingRecognitionResult\022" +
      "Q\n\014alternatives\030\001 \003(\0132;.google.cloud.spe" +
      "ech.v1p1beta1.SpeechRecognitionAlternati" +
      "ve\022\020\n\010is_final\030\002 \001(\010\022\021\n\tstability\030\003 \001(\002\"" +
      "l\n\027SpeechRecognitionResult\022Q\n\014alternativ" +
      "es\030\001 \003(\0132;.google.cloud.speech.v1p1beta1" +
      ".SpeechRecognitionAlternative\"~\n\034SpeechR",
      "ecognitionAlternative\022\022\n\ntranscript\030\001 \001(" +
      "\t\022\022\n\nconfidence\030\002 \001(\002\0226\n\005words\030\003 \003(\0132\'.g" +
      "oogle.cloud.speech.v1p1beta1.WordInfo\"t\n" +
      "\010WordInfo\022-\n\nstart_time\030\001 \001(\0132\031.google.p" +
      "rotobuf.Duration\022+\n\010end_time\030\002 \001(\0132\031.goo" +
      "gle.protobuf.Duration\022\014\n\004word\030\003 \001(\t2\330\003\n\006" +
      "Speech\022\226\001\n\tRecognize\022/.google.cloud.spee" +
      "ch.v1p1beta1.RecognizeRequest\0320.google.c" +
      "loud.speech.v1p1beta1.RecognizeResponse\"" +
      "&\202\323\344\223\002 \"\033/v1p1beta1/speech:recognize:\001*\022",
      "\244\001\n\024LongRunningRecognize\022:.google.cloud." +
      "speech.v1p1beta1.LongRunningRecognizeReq" +
      "uest\032\035.google.longrunning.Operation\"1\202\323\344" +
      "\223\002+\"&/v1p1beta1/speech:longrunningrecogn" +
      "ize:\001*\022\215\001\n\022StreamingRecognize\0228.google.c" +
      "loud.speech.v1p1beta1.StreamingRecognize" +
      "Request\0329.google.cloud.speech.v1p1beta1." +
      "StreamingRecognizeResponse(\0010\001Bz\n!com.go" +
      "ogle.cloud.speech.v1p1beta1B\013SpeechProto" +
      "P\001ZCgoogle.golang.org/genproto/googleapi",
      "s/cloud/speech/v1p1beta1;speech\370\001\001b\006prot" +
      "o3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
          com.google.protobuf.AnyProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        }, assigner);
    internal_static_google_cloud_speech_v1p1beta1_RecognizeRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_speech_v1p1beta1_RecognizeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_speech_v1p1beta1_RecognizeRequest_descriptor,
        new java.lang.String[] { "Config", "Audio", });
    internal_static_google_cloud_speech_v1p1beta1_LongRunningRecognizeRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_speech_v1p1beta1_LongRunningRecognizeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_speech_v1p1beta1_LongRunningRecognizeRequest_descriptor,
        new java.lang.String[] { "Config", "Audio", });
    internal_static_google_cloud_speech_v1p1beta1_StreamingRecognizeRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_speech_v1p1beta1_StreamingRecognizeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_speech_v1p1beta1_StreamingRecognizeRequest_descriptor,
        new java.lang.String[] { "StreamingConfig", "AudioContent", "StreamingRequest", });
    internal_static_google_cloud_speech_v1p1beta1_StreamingRecognitionConfig_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_speech_v1p1beta1_StreamingRecognitionConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_speech_v1p1beta1_StreamingRecognitionConfig_descriptor,
        new java.lang.String[] { "Config", "SingleUtterance", "InterimResults", });
    internal_static_google_cloud_speech_v1p1beta1_RecognitionConfig_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_speech_v1p1beta1_RecognitionConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_speech_v1p1beta1_RecognitionConfig_descriptor,
        new java.lang.String[] { "Encoding", "SampleRateHertz", "LanguageCode", "MaxAlternatives", "ProfanityFilter", "SpeechContexts", "EnableWordTimeOffsets", });
    internal_static_google_cloud_speech_v1p1beta1_SpeechContext_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_speech_v1p1beta1_SpeechContext_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_speech_v1p1beta1_SpeechContext_descriptor,
        new java.lang.String[] { "Phrases", });
    internal_static_google_cloud_speech_v1p1beta1_RecognitionAudio_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_speech_v1p1beta1_RecognitionAudio_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_speech_v1p1beta1_RecognitionAudio_descriptor,
        new java.lang.String[] { "Content", "Uri", "AudioSource", });
    internal_static_google_cloud_speech_v1p1beta1_RecognizeResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_speech_v1p1beta1_RecognizeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_speech_v1p1beta1_RecognizeResponse_descriptor,
        new java.lang.String[] { "Results", });
    internal_static_google_cloud_speech_v1p1beta1_LongRunningRecognizeResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_speech_v1p1beta1_LongRunningRecognizeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_speech_v1p1beta1_LongRunningRecognizeResponse_descriptor,
        new java.lang.String[] { "Results", });
    internal_static_google_cloud_speech_v1p1beta1_LongRunningRecognizeMetadata_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_speech_v1p1beta1_LongRunningRecognizeMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_speech_v1p1beta1_LongRunningRecognizeMetadata_descriptor,
        new java.lang.String[] { "ProgressPercent", "StartTime", "LastUpdateTime", });
    internal_static_google_cloud_speech_v1p1beta1_StreamingRecognizeResponse_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_speech_v1p1beta1_StreamingRecognizeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_speech_v1p1beta1_StreamingRecognizeResponse_descriptor,
        new java.lang.String[] { "Error", "Results", "SpeechEventType", });
    internal_static_google_cloud_speech_v1p1beta1_StreamingRecognitionResult_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_speech_v1p1beta1_StreamingRecognitionResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_speech_v1p1beta1_StreamingRecognitionResult_descriptor,
        new java.lang.String[] { "Alternatives", "IsFinal", "Stability", });
    internal_static_google_cloud_speech_v1p1beta1_SpeechRecognitionResult_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_speech_v1p1beta1_SpeechRecognitionResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_speech_v1p1beta1_SpeechRecognitionResult_descriptor,
        new java.lang.String[] { "Alternatives", });
    internal_static_google_cloud_speech_v1p1beta1_SpeechRecognitionAlternative_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_speech_v1p1beta1_SpeechRecognitionAlternative_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_speech_v1p1beta1_SpeechRecognitionAlternative_descriptor,
        new java.lang.String[] { "Transcript", "Confidence", "Words", });
    internal_static_google_cloud_speech_v1p1beta1_WordInfo_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_speech_v1p1beta1_WordInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_speech_v1p1beta1_WordInfo_descriptor,
        new java.lang.String[] { "StartTime", "EndTime", "Word", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}