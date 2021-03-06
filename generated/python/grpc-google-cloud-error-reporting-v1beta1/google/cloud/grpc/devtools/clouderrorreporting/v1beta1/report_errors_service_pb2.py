# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/grpc/devtools/clouderrorreporting/v1beta1/report_errors_service.proto

import sys
_b=sys.version_info[0]<3 and (lambda x:x) or (lambda x:x.encode('latin1'))
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
from google.protobuf import descriptor_pb2
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.cloud.grpc.devtools.clouderrorreporting.v1beta1 import common_pb2 as google_dot_cloud_dot_grpc_dot_devtools_dot_clouderrorreporting_dot_v1beta1_dot_common__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/cloud/grpc/devtools/clouderrorreporting/v1beta1/report_errors_service.proto',
  package='google.devtools.clouderrorreporting.v1beta1',
  syntax='proto3',
  serialized_pb=_b('\nRgoogle/cloud/grpc/devtools/clouderrorreporting/v1beta1/report_errors_service.proto\x12+google.devtools.clouderrorreporting.v1beta1\x1a\x1cgoogle/api/annotations.proto\x1a\x43google/cloud/grpc/devtools/clouderrorreporting/v1beta1/common.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\x7f\n\x17ReportErrorEventRequest\x12\x14\n\x0cproject_name\x18\x01 \x01(\t\x12N\n\x05\x65vent\x18\x02 \x01(\x0b\x32?.google.devtools.clouderrorreporting.v1beta1.ReportedErrorEvent\"\x1a\n\x18ReportErrorEventResponse\"\xf7\x01\n\x12ReportedErrorEvent\x12.\n\nevent_time\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12T\n\x0fservice_context\x18\x02 \x01(\x0b\x32;.google.devtools.clouderrorreporting.v1beta1.ServiceContext\x12\x0f\n\x07message\x18\x03 \x01(\t\x12J\n\x07\x63ontext\x18\x04 \x01(\x0b\x32\x39.google.devtools.clouderrorreporting.v1beta1.ErrorContext2\xf8\x01\n\x13ReportErrorsService\x12\xe0\x01\n\x10ReportErrorEvent\x12\x44.google.devtools.clouderrorreporting.v1beta1.ReportErrorEventRequest\x1a\x45.google.devtools.clouderrorreporting.v1beta1.ReportErrorEventResponse\"?\x82\xd3\xe4\x93\x02\x39\"0/v1beta1/{project_name=projects/*}/events:report:\x05\x65ventB\xd3\x01\n/com.google.devtools.clouderrorreporting.v1beta1B\x18ReportErrorsServiceProtoP\x01Z^google.golang.org/genproto/googleapis/devtools/clouderrorreporting/v1beta1;clouderrorreporting\xaa\x02#Google.Cloud.ErrorReporting.V1Beta1b\x06proto3')
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_cloud_dot_grpc_dot_devtools_dot_clouderrorreporting_dot_v1beta1_dot_common__pb2.DESCRIPTOR,google_dot_protobuf_dot_timestamp__pb2.DESCRIPTOR,])
_sym_db.RegisterFileDescriptor(DESCRIPTOR)




_REPORTERROREVENTREQUEST = _descriptor.Descriptor(
  name='ReportErrorEventRequest',
  full_name='google.devtools.clouderrorreporting.v1beta1.ReportErrorEventRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='project_name', full_name='google.devtools.clouderrorreporting.v1beta1.ReportErrorEventRequest.project_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='event', full_name='google.devtools.clouderrorreporting.v1beta1.ReportErrorEventRequest.event', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=263,
  serialized_end=390,
)


_REPORTERROREVENTRESPONSE = _descriptor.Descriptor(
  name='ReportErrorEventResponse',
  full_name='google.devtools.clouderrorreporting.v1beta1.ReportErrorEventResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=392,
  serialized_end=418,
)


_REPORTEDERROREVENT = _descriptor.Descriptor(
  name='ReportedErrorEvent',
  full_name='google.devtools.clouderrorreporting.v1beta1.ReportedErrorEvent',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='event_time', full_name='google.devtools.clouderrorreporting.v1beta1.ReportedErrorEvent.event_time', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='service_context', full_name='google.devtools.clouderrorreporting.v1beta1.ReportedErrorEvent.service_context', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='message', full_name='google.devtools.clouderrorreporting.v1beta1.ReportedErrorEvent.message', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='context', full_name='google.devtools.clouderrorreporting.v1beta1.ReportedErrorEvent.context', index=3,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=421,
  serialized_end=668,
)

_REPORTERROREVENTREQUEST.fields_by_name['event'].message_type = _REPORTEDERROREVENT
_REPORTEDERROREVENT.fields_by_name['event_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_REPORTEDERROREVENT.fields_by_name['service_context'].message_type = google_dot_cloud_dot_grpc_dot_devtools_dot_clouderrorreporting_dot_v1beta1_dot_common__pb2._SERVICECONTEXT
_REPORTEDERROREVENT.fields_by_name['context'].message_type = google_dot_cloud_dot_grpc_dot_devtools_dot_clouderrorreporting_dot_v1beta1_dot_common__pb2._ERRORCONTEXT
DESCRIPTOR.message_types_by_name['ReportErrorEventRequest'] = _REPORTERROREVENTREQUEST
DESCRIPTOR.message_types_by_name['ReportErrorEventResponse'] = _REPORTERROREVENTRESPONSE
DESCRIPTOR.message_types_by_name['ReportedErrorEvent'] = _REPORTEDERROREVENT

ReportErrorEventRequest = _reflection.GeneratedProtocolMessageType('ReportErrorEventRequest', (_message.Message,), dict(
  DESCRIPTOR = _REPORTERROREVENTREQUEST,
  __module__ = 'google.cloud.grpc.devtools.clouderrorreporting.v1beta1.report_errors_service_pb2'
  # @@protoc_insertion_point(class_scope:google.devtools.clouderrorreporting.v1beta1.ReportErrorEventRequest)
  ))
_sym_db.RegisterMessage(ReportErrorEventRequest)

ReportErrorEventResponse = _reflection.GeneratedProtocolMessageType('ReportErrorEventResponse', (_message.Message,), dict(
  DESCRIPTOR = _REPORTERROREVENTRESPONSE,
  __module__ = 'google.cloud.grpc.devtools.clouderrorreporting.v1beta1.report_errors_service_pb2'
  # @@protoc_insertion_point(class_scope:google.devtools.clouderrorreporting.v1beta1.ReportErrorEventResponse)
  ))
_sym_db.RegisterMessage(ReportErrorEventResponse)

ReportedErrorEvent = _reflection.GeneratedProtocolMessageType('ReportedErrorEvent', (_message.Message,), dict(
  DESCRIPTOR = _REPORTEDERROREVENT,
  __module__ = 'google.cloud.grpc.devtools.clouderrorreporting.v1beta1.report_errors_service_pb2'
  # @@protoc_insertion_point(class_scope:google.devtools.clouderrorreporting.v1beta1.ReportedErrorEvent)
  ))
_sym_db.RegisterMessage(ReportedErrorEvent)


DESCRIPTOR.has_options = True
DESCRIPTOR._options = _descriptor._ParseOptions(descriptor_pb2.FileOptions(), _b('\n/com.google.devtools.clouderrorreporting.v1beta1B\030ReportErrorsServiceProtoP\001Z^google.golang.org/genproto/googleapis/devtools/clouderrorreporting/v1beta1;clouderrorreporting\252\002#Google.Cloud.ErrorReporting.V1Beta1'))
try:
  # THESE ELEMENTS WILL BE DEPRECATED.
  # Please use the generated *_pb2_grpc.py files instead.
  import grpc
  from grpc.framework.common import cardinality
  from grpc.framework.interfaces.face import utilities as face_utilities
  from grpc.beta import implementations as beta_implementations
  from grpc.beta import interfaces as beta_interfaces


  class ReportErrorsServiceStub(object):
    """An API for reporting error events.
    """

    def __init__(self, channel):
      """Constructor.

      Args:
        channel: A grpc.Channel.
      """
      self.ReportErrorEvent = channel.unary_unary(
          '/google.devtools.clouderrorreporting.v1beta1.ReportErrorsService/ReportErrorEvent',
          request_serializer=ReportErrorEventRequest.SerializeToString,
          response_deserializer=ReportErrorEventResponse.FromString,
          )


  class ReportErrorsServiceServicer(object):
    """An API for reporting error events.
    """

    def ReportErrorEvent(self, request, context):
      """Report an individual error event.

      This endpoint accepts <strong>either</strong> an OAuth token,
      <strong>or</strong> an
      <a href="https://support.google.com/cloud/answer/6158862">API key</a>
      for authentication. To use an API key, append it to the URL as the value of
      a `key` parameter. For example:
      <pre>POST https://clouderrorreporting.googleapis.com/v1beta1/projects/example-project/events:report?key=123ABC456</pre>
      """
      context.set_code(grpc.StatusCode.UNIMPLEMENTED)
      context.set_details('Method not implemented!')
      raise NotImplementedError('Method not implemented!')


  def add_ReportErrorsServiceServicer_to_server(servicer, server):
    rpc_method_handlers = {
        'ReportErrorEvent': grpc.unary_unary_rpc_method_handler(
            servicer.ReportErrorEvent,
            request_deserializer=ReportErrorEventRequest.FromString,
            response_serializer=ReportErrorEventResponse.SerializeToString,
        ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
        'google.devtools.clouderrorreporting.v1beta1.ReportErrorsService', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


  class BetaReportErrorsServiceServicer(object):
    """The Beta API is deprecated for 0.15.0 and later.

    It is recommended to use the GA API (classes and functions in this
    file not marked beta) for all further purposes. This class was generated
    only to ease transition from grpcio<0.15.0 to grpcio>=0.15.0."""
    """An API for reporting error events.
    """
    def ReportErrorEvent(self, request, context):
      """Report an individual error event.

      This endpoint accepts <strong>either</strong> an OAuth token,
      <strong>or</strong> an
      <a href="https://support.google.com/cloud/answer/6158862">API key</a>
      for authentication. To use an API key, append it to the URL as the value of
      a `key` parameter. For example:
      <pre>POST https://clouderrorreporting.googleapis.com/v1beta1/projects/example-project/events:report?key=123ABC456</pre>
      """
      context.code(beta_interfaces.StatusCode.UNIMPLEMENTED)


  class BetaReportErrorsServiceStub(object):
    """The Beta API is deprecated for 0.15.0 and later.

    It is recommended to use the GA API (classes and functions in this
    file not marked beta) for all further purposes. This class was generated
    only to ease transition from grpcio<0.15.0 to grpcio>=0.15.0."""
    """An API for reporting error events.
    """
    def ReportErrorEvent(self, request, timeout, metadata=None, with_call=False, protocol_options=None):
      """Report an individual error event.

      This endpoint accepts <strong>either</strong> an OAuth token,
      <strong>or</strong> an
      <a href="https://support.google.com/cloud/answer/6158862">API key</a>
      for authentication. To use an API key, append it to the URL as the value of
      a `key` parameter. For example:
      <pre>POST https://clouderrorreporting.googleapis.com/v1beta1/projects/example-project/events:report?key=123ABC456</pre>
      """
      raise NotImplementedError()
    ReportErrorEvent.future = None


  def beta_create_ReportErrorsService_server(servicer, pool=None, pool_size=None, default_timeout=None, maximum_timeout=None):
    """The Beta API is deprecated for 0.15.0 and later.

    It is recommended to use the GA API (classes and functions in this
    file not marked beta) for all further purposes. This function was
    generated only to ease transition from grpcio<0.15.0 to grpcio>=0.15.0"""
    request_deserializers = {
      ('google.devtools.clouderrorreporting.v1beta1.ReportErrorsService', 'ReportErrorEvent'): ReportErrorEventRequest.FromString,
    }
    response_serializers = {
      ('google.devtools.clouderrorreporting.v1beta1.ReportErrorsService', 'ReportErrorEvent'): ReportErrorEventResponse.SerializeToString,
    }
    method_implementations = {
      ('google.devtools.clouderrorreporting.v1beta1.ReportErrorsService', 'ReportErrorEvent'): face_utilities.unary_unary_inline(servicer.ReportErrorEvent),
    }
    server_options = beta_implementations.server_options(request_deserializers=request_deserializers, response_serializers=response_serializers, thread_pool=pool, thread_pool_size=pool_size, default_timeout=default_timeout, maximum_timeout=maximum_timeout)
    return beta_implementations.server(method_implementations, options=server_options)


  def beta_create_ReportErrorsService_stub(channel, host=None, metadata_transformer=None, pool=None, pool_size=None):
    """The Beta API is deprecated for 0.15.0 and later.

    It is recommended to use the GA API (classes and functions in this
    file not marked beta) for all further purposes. This function was
    generated only to ease transition from grpcio<0.15.0 to grpcio>=0.15.0"""
    request_serializers = {
      ('google.devtools.clouderrorreporting.v1beta1.ReportErrorsService', 'ReportErrorEvent'): ReportErrorEventRequest.SerializeToString,
    }
    response_deserializers = {
      ('google.devtools.clouderrorreporting.v1beta1.ReportErrorsService', 'ReportErrorEvent'): ReportErrorEventResponse.FromString,
    }
    cardinalities = {
      'ReportErrorEvent': cardinality.Cardinality.UNARY_UNARY,
    }
    stub_options = beta_implementations.stub_options(host=host, metadata_transformer=metadata_transformer, request_serializers=request_serializers, response_deserializers=response_deserializers, thread_pool=pool, thread_pool_size=pool_size)
    return beta_implementations.dynamic_stub(channel, 'google.devtools.clouderrorreporting.v1beta1.ReportErrorsService', cardinalities, options=stub_options)
except ImportError:
  pass
# @@protoc_insertion_point(module_scope)
