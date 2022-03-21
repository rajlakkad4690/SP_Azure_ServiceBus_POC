// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.servicebus.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.messaging.servicebus.administration.models.EntityStatus;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/** The TopicDescription model. */
@JacksonXmlRootElement(
        localName = "TopicDescription",
        namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
@Fluent
public final class TopicDescription {
    /*
     * ISO 8601 default message timespan to live value. This is the duration
     * after which the message expires, starting from when the message is sent
     * to Service Bus. This is the default value used when TimeToLive is not
     * set on a message itself.
     */
    @JacksonXmlProperty(
            localName = "DefaultMessageTimeToLive",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private Duration defaultMessageTimeToLive;

    /*
     * The maximum size of the topic in megabytes, which is the size of memory
     * allocated for the topic.
     */
    @JacksonXmlProperty(
            localName = "MaxSizeInMegabytes",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private Long maxSizeInMegabytes;

    /*
     * A value indicating if this topic requires duplicate detection.
     */
    @JacksonXmlProperty(
            localName = "RequiresDuplicateDetection",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private Boolean requiresDuplicateDetection;

    /*
     * ISO 8601 timeSpan structure that defines the duration of the duplicate
     * detection history. The default value is 10 minutes.
     */
    @JacksonXmlProperty(
            localName = "DuplicateDetectionHistoryTimeWindow",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private Duration duplicateDetectionHistoryTimeWindow;

    /*
     * Value that indicates whether server-side batched operations are enabled.
     */
    @JacksonXmlProperty(
            localName = "EnableBatchedOperations",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private Boolean enableBatchedOperations;

    /*
     * The size of the topic, in bytes.
     */
    @JacksonXmlProperty(
            localName = "SizeInBytes",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private Integer sizeInBytes;

    /*
     * Filter messages before publishing.
     */
    @JacksonXmlProperty(
            localName = "FilteringMessagesBeforePublishing",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private Boolean filteringMessagesBeforePublishing;

    /*
     * A value indicating if the resource can be accessed without
     * authorization.
     */
    @JacksonXmlProperty(
            localName = "IsAnonymousAccessible",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private Boolean isAnonymousAccessible;

    private static final class AuthorizationRulesWrapper {
        @JacksonXmlProperty(localName = "AuthorizationRule")
        private final List<AuthorizationRuleImpl> items;

        @JsonCreator
        private AuthorizationRulesWrapper(
                @JacksonXmlProperty(localName = "AuthorizationRule") List<AuthorizationRuleImpl> items) {
            this.items = items;
        }
    }

    /*
     * Authorization rules for resource.
     */
    @JacksonXmlProperty(
            localName = "AuthorizationRules",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private AuthorizationRulesWrapper authorizationRules;

    /*
     * Status of a Service Bus resource
     */
    @JacksonXmlProperty(
            localName = "Status",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private EntityStatus status;

    /*
     * The exact time the topic was created.
     */
    @JacksonXmlProperty(
            localName = "CreatedAt",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private OffsetDateTime createdAt;

    /*
     * The exact time a message was updated in the topic.
     */
    @JacksonXmlProperty(
            localName = "UpdatedAt",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private OffsetDateTime updatedAt;

    /*
     * Last time a message was sent, or the last time there was a receive
     * request to this topic.
     */
    @JacksonXmlProperty(
            localName = "AccessedAt",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private OffsetDateTime accessedAt;

    /*
     * A value that indicates whether the topic supports ordering.
     */
    @JacksonXmlProperty(
            localName = "SupportOrdering",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private Boolean supportOrdering;

    /*
     * Details about the message counts in entity.
     */
    @JacksonXmlProperty(
            localName = "CountDetails",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private MessageCountDetails messageCountDetails;

    /*
     * The number of subscriptions in the topic.
     */
    @JacksonXmlProperty(
            localName = "SubscriptionCount",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private Integer subscriptionCount;

    /*
     * ISO 8601 timeSpan idle interval after which the topic is automatically
     * deleted. The minimum duration is 5 minutes.
     */
    @JacksonXmlProperty(
            localName = "AutoDeleteOnIdle",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private Duration autoDeleteOnIdle;

    /*
     * A value that indicates whether the topic is to be partitioned across
     * multiple message brokers.
     */
    @JacksonXmlProperty(
            localName = "EnablePartitioning",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private Boolean enablePartitioning;

    /*
     * Availability status of the entity
     */
    @JacksonXmlProperty(
            localName = "EntityAvailabilityStatus",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private EntityAvailabilityStatus entityAvailabilityStatus;

    /*
     * A value that indicates whether the topic's subscription is to be
     * partitioned.
     */
    @JacksonXmlProperty(
            localName = "EnableSubscriptionPartitioning",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private Boolean enableSubscriptionPartitioning;

    /*
     * A value that indicates whether Express Entities are enabled. An express
     * topic holds a message in memory temporarily before writing it to
     * persistent storage.
     */
    @JacksonXmlProperty(
            localName = "EnableExpress",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private Boolean enableExpress;

    /*
     * Metadata associated with the topic.
     */
    @JacksonXmlProperty(
            localName = "UserMetadata",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private String userMetadata;

    /*
     * The maximum message size for a message.
     */
    @JacksonXmlProperty(
        localName = "MaxMessageSizeInKilobytes",
        namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private Long maxMessageSizeInKilobytes;

    /**
     * Get the defaultMessageTimeToLive property: ISO 8601 default message timespan to live value. This is the duration
     * after which the message expires, starting from when the message is sent to Service Bus. This is the default value
     * used when TimeToLive is not set on a message itself.
     *
     * @return the defaultMessageTimeToLive value.
     */
    public Duration getDefaultMessageTimeToLive() {
        return this.defaultMessageTimeToLive;
    }

    /**
     * Set the defaultMessageTimeToLive property: ISO 8601 default message timespan to live value. This is the duration
     * after which the message expires, starting from when the message is sent to Service Bus. This is the default value
     * used when TimeToLive is not set on a message itself.
     *
     * @param defaultMessageTimeToLive the defaultMessageTimeToLive value to set.
     * @return the TopicDescription object itself.
     */
    public TopicDescription setDefaultMessageTimeToLive(Duration defaultMessageTimeToLive) {
        this.defaultMessageTimeToLive = defaultMessageTimeToLive;
        return this;
    }

    /**
     * Get the maxSizeInMegabytes property: The maximum size of the topic in megabytes, which is the size of memory
     * allocated for the topic.
     *
     * @return the maxSizeInMegabytes value.
     */
    public Long getMaxSizeInMegabytes() {
        return this.maxSizeInMegabytes;
    }

    /**
     * Set the maxSizeInMegabytes property: The maximum size of the topic in megabytes, which is the size of memory
     * allocated for the topic.
     *
     * @param maxSizeInMegabytes the maxSizeInMegabytes value to set.
     * @return the TopicDescription object itself.
     */
    public TopicDescription setMaxSizeInMegabytes(Long maxSizeInMegabytes) {
        this.maxSizeInMegabytes = maxSizeInMegabytes;
        return this;
    }

    /**
     * Get the requiresDuplicateDetection property: A value indicating if this topic requires duplicate detection.
     *
     * @return the requiresDuplicateDetection value.
     */
    public Boolean isRequiresDuplicateDetection() {
        return this.requiresDuplicateDetection;
    }

    /**
     * Set the requiresDuplicateDetection property: A value indicating if this topic requires duplicate detection.
     *
     * @param requiresDuplicateDetection the requiresDuplicateDetection value to set.
     * @return the TopicDescription object itself.
     */
    public TopicDescription setRequiresDuplicateDetection(Boolean requiresDuplicateDetection) {
        this.requiresDuplicateDetection = requiresDuplicateDetection;
        return this;
    }

    /**
     * Get the duplicateDetectionHistoryTimeWindow property: ISO 8601 timeSpan structure that defines the duration of
     * the duplicate detection history. The default value is 10 minutes.
     *
     * @return the duplicateDetectionHistoryTimeWindow value.
     */
    public Duration getDuplicateDetectionHistoryTimeWindow() {
        return this.duplicateDetectionHistoryTimeWindow;
    }

    /**
     * Set the duplicateDetectionHistoryTimeWindow property: ISO 8601 timeSpan structure that defines the duration of
     * the duplicate detection history. The default value is 10 minutes.
     *
     * @param duplicateDetectionHistoryTimeWindow the duplicateDetectionHistoryTimeWindow value to set.
     * @return the TopicDescription object itself.
     */
    public TopicDescription setDuplicateDetectionHistoryTimeWindow(Duration duplicateDetectionHistoryTimeWindow) {
        this.duplicateDetectionHistoryTimeWindow = duplicateDetectionHistoryTimeWindow;
        return this;
    }

    /**
     * Get the enableBatchedOperations property: Value that indicates whether server-side batched operations are
     * enabled.
     *
     * @return the enableBatchedOperations value.
     */
    public Boolean isEnableBatchedOperations() {
        return this.enableBatchedOperations;
    }

    /**
     * Set the enableBatchedOperations property: Value that indicates whether server-side batched operations are
     * enabled.
     *
     * @param enableBatchedOperations the enableBatchedOperations value to set.
     * @return the TopicDescription object itself.
     */
    public TopicDescription setEnableBatchedOperations(Boolean enableBatchedOperations) {
        this.enableBatchedOperations = enableBatchedOperations;
        return this;
    }

    /**
     * Get the sizeInBytes property: The size of the topic, in bytes.
     *
     * @return the sizeInBytes value.
     */
    public Integer getSizeInBytes() {
        return this.sizeInBytes;
    }

    /**
     * Set the sizeInBytes property: The size of the topic, in bytes.
     *
     * @param sizeInBytes the sizeInBytes value to set.
     * @return the TopicDescription object itself.
     */
    public TopicDescription setSizeInBytes(Integer sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
        return this;
    }

    /**
     * Get the filteringMessagesBeforePublishing property: Filter messages before publishing.
     *
     * @return the filteringMessagesBeforePublishing value.
     */
    public Boolean isFilteringMessagesBeforePublishing() {
        return this.filteringMessagesBeforePublishing;
    }

    /**
     * Set the filteringMessagesBeforePublishing property: Filter messages before publishing.
     *
     * @param filteringMessagesBeforePublishing the filteringMessagesBeforePublishing value to set.
     * @return the TopicDescription object itself.
     */
    public TopicDescription setFilteringMessagesBeforePublishing(Boolean filteringMessagesBeforePublishing) {
        this.filteringMessagesBeforePublishing = filteringMessagesBeforePublishing;
        return this;
    }

    /**
     * Get the isAnonymousAccessible property: A value indicating if the resource can be accessed without authorization.
     *
     * @return the isAnonymousAccessible value.
     */
    public Boolean isAnonymousAccessible() {
        return this.isAnonymousAccessible;
    }

    /**
     * Set the isAnonymousAccessible property: A value indicating if the resource can be accessed without authorization.
     *
     * @param isAnonymousAccessible the isAnonymousAccessible value to set.
     * @return the TopicDescription object itself.
     */
    public TopicDescription setIsAnonymousAccessible(Boolean isAnonymousAccessible) {
        this.isAnonymousAccessible = isAnonymousAccessible;
        return this;
    }

    /**
     * Get the authorizationRules property: Authorization rules for resource.
     *
     * @return the authorizationRules value.
     */
    public List<AuthorizationRuleImpl> getAuthorizationRules() {
        if (this.authorizationRules == null) {
            this.authorizationRules = new AuthorizationRulesWrapper(new ArrayList<AuthorizationRuleImpl>());
        }
        return this.authorizationRules.items;
    }

    /**
     * Set the authorizationRules property: Authorization rules for resource.
     *
     * @param authorizationRules the authorizationRules value to set.
     * @return the TopicDescription object itself.
     */
    public TopicDescription setAuthorizationRules(List<AuthorizationRuleImpl> authorizationRules) {
        this.authorizationRules = new AuthorizationRulesWrapper(authorizationRules);
        return this;
    }

    /**
     * Get the status property: Status of a Service Bus resource.
     *
     * @return the status value.
     */
    public EntityStatus getStatus() {
        return this.status;
    }

    /**
     * Set the status property: Status of a Service Bus resource.
     *
     * @param status the status value to set.
     * @return the TopicDescription object itself.
     */
    public TopicDescription setStatus(EntityStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the createdAt property: The exact time the topic was created.
     *
     * @return the createdAt value.
     */
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Set the createdAt property: The exact time the topic was created.
     *
     * @param createdAt the createdAt value to set.
     * @return the TopicDescription object itself.
     */
    public TopicDescription setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get the updatedAt property: The exact time a message was updated in the topic.
     *
     * @return the updatedAt value.
     */
    public OffsetDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Set the updatedAt property: The exact time a message was updated in the topic.
     *
     * @param updatedAt the updatedAt value to set.
     * @return the TopicDescription object itself.
     */
    public TopicDescription setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get the accessedAt property: Last time a message was sent, or the last time there was a receive request to this
     * topic.
     *
     * @return the accessedAt value.
     */
    public OffsetDateTime getAccessedAt() {
        return this.accessedAt;
    }

    /**
     * Set the accessedAt property: Last time a message was sent, or the last time there was a receive request to this
     * topic.
     *
     * @param accessedAt the accessedAt value to set.
     * @return the TopicDescription object itself.
     */
    public TopicDescription setAccessedAt(OffsetDateTime accessedAt) {
        this.accessedAt = accessedAt;
        return this;
    }

    /**
     * Get the supportOrdering property: A value that indicates whether the topic supports ordering.
     *
     * @return the supportOrdering value.
     */
    public Boolean isSupportOrdering() {
        return this.supportOrdering;
    }

    /**
     * Set the supportOrdering property: A value that indicates whether the topic supports ordering.
     *
     * @param supportOrdering the supportOrdering value to set.
     * @return the TopicDescription object itself.
     */
    public TopicDescription setSupportOrdering(Boolean supportOrdering) {
        this.supportOrdering = supportOrdering;
        return this;
    }

    /**
     * Get the messageCountDetails property: Details about the message counts in entity.
     *
     * @return the messageCountDetails value.
     */
    public MessageCountDetails getMessageCountDetails() {
        return this.messageCountDetails;
    }

    /**
     * Set the messageCountDetails property: Details about the message counts in entity.
     *
     * @param messageCountDetails the messageCountDetails value to set.
     * @return the TopicDescription object itself.
     */
    public TopicDescription setMessageCountDetails(MessageCountDetails messageCountDetails) {
        this.messageCountDetails = messageCountDetails;
        return this;
    }

    /**
     * Get the subscriptionCount property: The number of subscriptions in the topic.
     *
     * @return the subscriptionCount value.
     */
    public Integer getSubscriptionCount() {
        return this.subscriptionCount;
    }

    /**
     * Set the subscriptionCount property: The number of subscriptions in the topic.
     *
     * @param subscriptionCount the subscriptionCount value to set.
     * @return the TopicDescription object itself.
     */
    public TopicDescription setSubscriptionCount(Integer subscriptionCount) {
        this.subscriptionCount = subscriptionCount;
        return this;
    }

    /**
     * Get the autoDeleteOnIdle property: ISO 8601 timeSpan idle interval after which the topic is automatically
     * deleted. The minimum duration is 5 minutes.
     *
     * @return the autoDeleteOnIdle value.
     */
    public Duration getAutoDeleteOnIdle() {
        return this.autoDeleteOnIdle;
    }

    /**
     * Set the autoDeleteOnIdle property: ISO 8601 timeSpan idle interval after which the topic is automatically
     * deleted. The minimum duration is 5 minutes.
     *
     * @param autoDeleteOnIdle the autoDeleteOnIdle value to set.
     * @return the TopicDescription object itself.
     */
    public TopicDescription setAutoDeleteOnIdle(Duration autoDeleteOnIdle) {
        this.autoDeleteOnIdle = autoDeleteOnIdle;
        return this;
    }

    /**
     * Get the enablePartitioning property: A value that indicates whether the topic is to be partitioned across
     * multiple message brokers.
     *
     * @return the enablePartitioning value.
     */
    public Boolean isEnablePartitioning() {
        return this.enablePartitioning;
    }

    /**
     * Set the enablePartitioning property: A value that indicates whether the topic is to be partitioned across
     * multiple message brokers.
     *
     * @param enablePartitioning the enablePartitioning value to set.
     * @return the TopicDescription object itself.
     */
    public TopicDescription setEnablePartitioning(Boolean enablePartitioning) {
        this.enablePartitioning = enablePartitioning;
        return this;
    }

    /**
     * Get the entityAvailabilityStatus property: Availability status of the entity.
     *
     * @return the entityAvailabilityStatus value.
     */
    public EntityAvailabilityStatus getEntityAvailabilityStatus() {
        return this.entityAvailabilityStatus;
    }

    /**
     * Set the entityAvailabilityStatus property: Availability status of the entity.
     *
     * @param entityAvailabilityStatus the entityAvailabilityStatus value to set.
     * @return the TopicDescription object itself.
     */
    public TopicDescription setEntityAvailabilityStatus(EntityAvailabilityStatus entityAvailabilityStatus) {
        this.entityAvailabilityStatus = entityAvailabilityStatus;
        return this;
    }

    /**
     * Get the enableSubscriptionPartitioning property: A value that indicates whether the topic's subscription is to be
     * partitioned.
     *
     * @return the enableSubscriptionPartitioning value.
     */
    public Boolean isEnableSubscriptionPartitioning() {
        return this.enableSubscriptionPartitioning;
    }

    /**
     * Set the enableSubscriptionPartitioning property: A value that indicates whether the topic's subscription is to be
     * partitioned.
     *
     * @param enableSubscriptionPartitioning the enableSubscriptionPartitioning value to set.
     * @return the TopicDescription object itself.
     */
    public TopicDescription setEnableSubscriptionPartitioning(Boolean enableSubscriptionPartitioning) {
        this.enableSubscriptionPartitioning = enableSubscriptionPartitioning;
        return this;
    }

    /**
     * Get the enableExpress property: A value that indicates whether Express Entities are enabled. An express topic
     * holds a message in memory temporarily before writing it to persistent storage.
     *
     * @return the enableExpress value.
     */
    public Boolean isEnableExpress() {
        return this.enableExpress;
    }

    /**
     * Set the enableExpress property: A value that indicates whether Express Entities are enabled. An express topic
     * holds a message in memory temporarily before writing it to persistent storage.
     *
     * @param enableExpress the enableExpress value to set.
     * @return the TopicDescription object itself.
     */
    public TopicDescription setEnableExpress(Boolean enableExpress) {
        this.enableExpress = enableExpress;
        return this;
    }

    /**
     * Get the userMetadata property: Metadata associated with the topic.
     *
     * @return the userMetadata value.
     */
    public String getUserMetadata() {
        return this.userMetadata;
    }

    /**
     * Set the userMetadata property: Metadata associated with the topic.
     *
     * @param userMetadata the userMetadata value to set.
     * @return the TopicDescription object itself.
     */
    public TopicDescription setUserMetadata(String userMetadata) {
        this.userMetadata = userMetadata;
        return this;
    }

    /**
     * Get the maxMessageSizeInKilobytes property: The maximum size of a message in kilobytes.
     *
     * @return the maxMessageSizeInKilobytes value.
     */
    public Long getMaxMessageSizeInKilobytes() {
        return this.maxMessageSizeInKilobytes;
    }

    /**
     * Set the maxMessageSizeInKilobytes property: The maximum size of a message in kilobytes.
     *
     * @param maxMessageSizeInKilobytes the maxMessageSizeInKilobytes value to set.
     * @return the QueueDescription object itself.
     */
    public TopicDescription setMaxMessageSizeInKilobytes(Long maxMessageSizeInKilobytes) {
        this.maxMessageSizeInKilobytes = maxMessageSizeInKilobytes;
        return this;
    }
}
