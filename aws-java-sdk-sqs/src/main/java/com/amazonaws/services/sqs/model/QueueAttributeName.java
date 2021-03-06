/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not
 * use this file except in compliance with the License. A copy of the License is
 * located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.sqs.model;

/**
 * 
 */
public enum QueueAttributeName {

    Policy("Policy"),
    VisibilityTimeout("VisibilityTimeout"),
    MaximumMessageSize("MaximumMessageSize"),
    MessageRetentionPeriod("MessageRetentionPeriod"),
    ApproximateNumberOfMessages("ApproximateNumberOfMessages"),
    ApproximateNumberOfMessagesNotVisible(
            "ApproximateNumberOfMessagesNotVisible"),
    CreatedTimestamp("CreatedTimestamp"),
    LastModifiedTimestamp("LastModifiedTimestamp"),
    QueueArn("QueueArn"),
    ApproximateNumberOfMessagesDelayed("ApproximateNumberOfMessagesDelayed"),
    DelaySeconds("DelaySeconds"),
    ReceiveMessageWaitTimeSeconds("ReceiveMessageWaitTimeSeconds"),
    RedrivePolicy("RedrivePolicy");

    private String value;

    private QueueAttributeName(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return QueueAttributeName corresponding to the value
     */
    public static QueueAttributeName fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (QueueAttributeName enumEntry : QueueAttributeName.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value
                + " value!");
    }
}
