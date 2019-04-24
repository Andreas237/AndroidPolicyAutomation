.class public Lcom/newrelic/agent/android/tracing/SampleValue;
.super Ljava/lang/Object;
.source "SampleValue.java"


# instance fields
.field private isDouble:Z

.field private value:Ljava/lang/Double;


# direct methods
.method public constructor <init>(D)V
    .locals 2

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    .line 4
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, p0, Lcom/newrelic/agent/android/tracing/SampleValue;->value:Ljava/lang/Double;

    .line 8
    invoke-virtual {p0, p1, p2}, Lcom/newrelic/agent/android/tracing/SampleValue;->setValue(D)V

    return-void
.end method

.method public constructor <init>(J)V
    .locals 2

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    .line 4
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, p0, Lcom/newrelic/agent/android/tracing/SampleValue;->value:Ljava/lang/Double;

    .line 12
    invoke-virtual {p0, p1, p2}, Lcom/newrelic/agent/android/tracing/SampleValue;->setValue(J)V

    return-void
.end method


# virtual methods
.method public asDouble()Ljava/lang/Double;
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/newrelic/agent/android/tracing/SampleValue;->value:Ljava/lang/Double;

    return-object v0
.end method

.method public asLong()Ljava/lang/Long;
    .locals 2

    .line 26
    iget-object v0, p0, Lcom/newrelic/agent/android/tracing/SampleValue;->value:Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public getValue()Ljava/lang/Number;
    .locals 1

    .line 16
    iget-boolean v0, p0, Lcom/newrelic/agent/android/tracing/SampleValue;->isDouble:Z

    if-eqz v0, :cond_0

    .line 17
    invoke-virtual {p0}, Lcom/newrelic/agent/android/tracing/SampleValue;->asDouble()Ljava/lang/Double;

    move-result-object v0

    return-object v0

    .line 18
    :cond_0
    invoke-virtual {p0}, Lcom/newrelic/agent/android/tracing/SampleValue;->asLong()Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public isDouble()Z
    .locals 1

    .line 40
    iget-boolean v0, p0, Lcom/newrelic/agent/android/tracing/SampleValue;->isDouble:Z

    return v0
.end method

.method public setDouble(Z)V
    .locals 0

    .line 44
    iput-boolean p1, p0, Lcom/newrelic/agent/android/tracing/SampleValue;->isDouble:Z

    return-void
.end method

.method public setValue(D)V
    .locals 0

    .line 30
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    iput-object p1, p0, Lcom/newrelic/agent/android/tracing/SampleValue;->value:Ljava/lang/Double;

    const/4 p1, 0x1

    .line 31
    iput-boolean p1, p0, Lcom/newrelic/agent/android/tracing/SampleValue;->isDouble:Z

    return-void
.end method

.method public setValue(J)V
    .locals 0

    long-to-double p1, p1

    .line 35
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    iput-object p1, p0, Lcom/newrelic/agent/android/tracing/SampleValue;->value:Ljava/lang/Double;

    const/4 p1, 0x0

    .line 36
    iput-boolean p1, p0, Lcom/newrelic/agent/android/tracing/SampleValue;->isDouble:Z

    return-void
.end method
