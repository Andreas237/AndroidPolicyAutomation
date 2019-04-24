.class public Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatchImpl;
.super Ljava/lang/Object;
.source "StopWatchImpl.java"

# interfaces
.implements Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatch;


# instance fields
.field private final appHelper:Lcom/ibotta/android/util/AppHelper;

.field private startTime:J


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/AppHelper;)V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatchImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    return-void
.end method


# virtual methods
.method public reset()V
    .locals 2

    const-wide/16 v0, 0x0

    .line 39
    iput-wide v0, p0, Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatchImpl;->startTime:J

    return-void
.end method

.method public start()V
    .locals 5

    .line 20
    iget-wide v0, p0, Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatchImpl;->startTime:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-gtz v4, :cond_0

    .line 21
    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatchImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v0}, Lcom/ibotta/android/util/AppHelper;->getCurrentTime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatchImpl;->startTime:J

    :cond_0
    return-void
.end method

.method public stop()J
    .locals 6

    .line 29
    iget-wide v0, p0, Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatchImpl;->startTime:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    .line 30
    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatchImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v0}, Lcom/ibotta/android/util/AppHelper;->getCurrentTime()J

    move-result-wide v0

    iget-wide v4, p0, Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatchImpl;->startTime:J

    sub-long/2addr v0, v4

    .line 31
    iput-wide v2, p0, Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatchImpl;->startTime:J

    goto :goto_0

    :cond_0
    move-wide v0, v2

    :goto_0
    return-wide v0
.end method
