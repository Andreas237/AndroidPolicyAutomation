.class public interface abstract Lcom/newrelic/agent/android/measurement/Measurement;
.super Ljava/lang/Object;
.source "Measurement.java"


# virtual methods
.method public abstract asDouble()D
.end method

.method public abstract finish()V
.end method

.method public abstract getEndTime()J
.end method

.method public abstract getEndTimeInSeconds()D
.end method

.method public abstract getExclusiveTime()J
.end method

.method public abstract getExclusiveTimeInSeconds()D
.end method

.method public abstract getName()Ljava/lang/String;
.end method

.method public abstract getScope()Ljava/lang/String;
.end method

.method public abstract getStartTime()J
.end method

.method public abstract getStartTimeInSeconds()D
.end method

.method public abstract getThreadInfo()Lcom/newrelic/agent/android/measurement/ThreadInfo;
.end method

.method public abstract getType()Lcom/newrelic/agent/android/measurement/MeasurementType;
.end method

.method public abstract isFinished()Z
.end method

.method public abstract isInstantaneous()Z
.end method
