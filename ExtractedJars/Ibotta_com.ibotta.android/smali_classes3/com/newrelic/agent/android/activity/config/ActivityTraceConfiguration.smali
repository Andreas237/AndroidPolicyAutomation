.class public Lcom/newrelic/agent/android/activity/config/ActivityTraceConfiguration;
.super Ljava/lang/Object;
.source "ActivityTraceConfiguration.java"


# instance fields
.field private maxTotalTraceCount:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static defaultActivityTraceConfiguration()Lcom/newrelic/agent/android/activity/config/ActivityTraceConfiguration;
    .locals 2

    .line 7
    new-instance v0, Lcom/newrelic/agent/android/activity/config/ActivityTraceConfiguration;

    invoke-direct {v0}, Lcom/newrelic/agent/android/activity/config/ActivityTraceConfiguration;-><init>()V

    const/4 v1, 0x1

    .line 8
    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/activity/config/ActivityTraceConfiguration;->setMaxTotalTraceCount(I)V

    return-object v0
.end method


# virtual methods
.method public getMaxTotalTraceCount()I
    .locals 1

    .line 13
    iget v0, p0, Lcom/newrelic/agent/android/activity/config/ActivityTraceConfiguration;->maxTotalTraceCount:I

    return v0
.end method

.method public setMaxTotalTraceCount(I)V
    .locals 0

    .line 17
    iput p1, p0, Lcom/newrelic/agent/android/activity/config/ActivityTraceConfiguration;->maxTotalTraceCount:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 22
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ActivityTraceConfiguration{maxTotalTraceCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/newrelic/agent/android/activity/config/ActivityTraceConfiguration;->maxTotalTraceCount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
