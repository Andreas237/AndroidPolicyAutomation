.class public interface abstract Lcom/newrelic/agent/android/activity/MeasuredActivity;
.super Ljava/lang/Object;
.source "MeasuredActivity.java"


# virtual methods
.method public abstract finish()V
.end method

.method public abstract getBackgroundMetricName()Ljava/lang/String;
.end method

.method public abstract getEndTime()J
.end method

.method public abstract getEndingMeasurement()Lcom/newrelic/agent/android/measurement/Measurement;
.end method

.method public abstract getEndingThread()Lcom/newrelic/agent/android/measurement/ThreadInfo;
.end method

.method public abstract getMeasurementPool()Lcom/newrelic/agent/android/measurement/MeasurementPool;
.end method

.method public abstract getMetricName()Ljava/lang/String;
.end method

.method public abstract getName()Ljava/lang/String;
.end method

.method public abstract getStartTime()J
.end method

.method public abstract getStartingMeasurement()Lcom/newrelic/agent/android/measurement/Measurement;
.end method

.method public abstract getStartingThread()Lcom/newrelic/agent/android/measurement/ThreadInfo;
.end method

.method public abstract isAutoInstrumented()Z
.end method

.method public abstract isFinished()Z
.end method

.method public abstract setName(Ljava/lang/String;)V
.end method
