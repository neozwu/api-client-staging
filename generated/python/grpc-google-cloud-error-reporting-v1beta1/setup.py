"""A setup module for the GRPC Stackdriver Error Reporting API.

See:
https://packaging.python.org/en/latest/distributing.html
https://github.com/pypa/sampleproject
"""

import setuptools

from setuptools import setup, find_packages

install_requires = [
  'oauth2client>=2.0.0, <4.0dev',
  'grpcio>=1.0.2, <2.0dev',
  'googleapis-common-protos[grpc]>=1.5.0, <2.0dev'
]

setuptools.setup(
  name='grpc-google-cloud-error-reporting-v1beta1',
  version='0.14.0',
  author='Google Inc',
  author_email='googleapis-packages@google.com',
  classifiers=[
    'Intended Audience :: Developers',
    'Development Status :: 3 - Alpha',
    'Intended Audience :: Developers',
    'License :: OSI Approved :: Apache Software License',
    'Programming Language :: Python',
    'Programming Language :: Python :: 2',
    'Programming Language :: Python :: 2.7',
    'Programming Language :: Python :: 3',
    'Programming Language :: Python :: 3.4',
    'Programming Language :: Python :: 3.5',
    'Programming Language :: Python :: Implementation :: CPython',
  ],
  description='GRPC library for the Stackdriver Error Reporting API',
  long_description=open('README.rst').read(),
  install_requires=install_requires,
  license='Apache-2.0',
  packages=find_packages(),
  namespace_packages=['google.cloud.grpc.devtools.clouderrorreporting', 'google.cloud.grpc.devtools', 'google.cloud.grpc', 'google.cloud', 'google'],
  url='https://github.com/googleapis/googleapis'
)
