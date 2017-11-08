<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/bigtable/admin/v2/bigtable_instance_admin.proto

namespace Google\Bigtable\Admin\V2;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * <pre>
 * Response message for BigtableInstanceAdmin.ListInstances.
 * </pre>
 *
 * Protobuf type <code>google.bigtable.admin.v2.ListInstancesResponse</code>
 */
class ListInstancesResponse extends \Google\Protobuf\Internal\Message
{
    /**
     * <pre>
     * The list of requested instances.
     * </pre>
     *
     * <code>repeated .google.bigtable.admin.v2.Instance instances = 1;</code>
     */
    private $instances;
    /**
     * <pre>
     * Locations from which Instance information could not be retrieved,
     * due to an outage or some other transient condition.
     * Instances whose Clusters are all in one of the failed locations
     * may be missing from `instances`, and Instances with at least one
     * Cluster in a failed location may only have partial information returned.
     * </pre>
     *
     * <code>repeated string failed_locations = 2;</code>
     */
    private $failed_locations;
    /**
     * <pre>
     * Set if not all instances could be returned in a single response.
     * Pass this value to `page_token` in another request to get the next
     * page of results.
     * </pre>
     *
     * <code>string next_page_token = 3;</code>
     */
    private $next_page_token = '';

    public function __construct() {
        \GPBMetadata\Google\Bigtable\Admin\V2\BigtableInstanceAdmin::initOnce();
        parent::__construct();
    }

    /**
     * <pre>
     * The list of requested instances.
     * </pre>
     *
     * <code>repeated .google.bigtable.admin.v2.Instance instances = 1;</code>
     */
    public function getInstances()
    {
        return $this->instances;
    }

    /**
     * <pre>
     * The list of requested instances.
     * </pre>
     *
     * <code>repeated .google.bigtable.admin.v2.Instance instances = 1;</code>
     */
    public function setInstances(&$var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \Google\Bigtable\Admin\V2\Instance::class);
        $this->instances = $arr;
    }

    /**
     * <pre>
     * Locations from which Instance information could not be retrieved,
     * due to an outage or some other transient condition.
     * Instances whose Clusters are all in one of the failed locations
     * may be missing from `instances`, and Instances with at least one
     * Cluster in a failed location may only have partial information returned.
     * </pre>
     *
     * <code>repeated string failed_locations = 2;</code>
     */
    public function getFailedLocations()
    {
        return $this->failed_locations;
    }

    /**
     * <pre>
     * Locations from which Instance information could not be retrieved,
     * due to an outage or some other transient condition.
     * Instances whose Clusters are all in one of the failed locations
     * may be missing from `instances`, and Instances with at least one
     * Cluster in a failed location may only have partial information returned.
     * </pre>
     *
     * <code>repeated string failed_locations = 2;</code>
     */
    public function setFailedLocations(&$var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::STRING);
        $this->failed_locations = $arr;
    }

    /**
     * <pre>
     * Set if not all instances could be returned in a single response.
     * Pass this value to `page_token` in another request to get the next
     * page of results.
     * </pre>
     *
     * <code>string next_page_token = 3;</code>
     */
    public function getNextPageToken()
    {
        return $this->next_page_token;
    }

    /**
     * <pre>
     * Set if not all instances could be returned in a single response.
     * Pass this value to `page_token` in another request to get the next
     * page of results.
     * </pre>
     *
     * <code>string next_page_token = 3;</code>
     */
    public function setNextPageToken($var)
    {
        GPBUtil::checkString($var, True);
        $this->next_page_token = $var;
    }

}
