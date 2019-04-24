.class public abstract Lcom/ibotta/android/aop/tracking/newrelic/timing/AbstractNewRelicTimingAdvice;
.super Ljava/lang/Object;
.source "AbstractNewRelicTimingAdvice.java"

# interfaces
.implements Lcom/ibotta/android/aop/tracking/newrelic/timing/NewRelicTimingAdvice;


# instance fields
.field private final stopWatch:Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatch;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatch;)V
    .locals 0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Lcom/ibotta/android/aop/tracking/newrelic/timing/AbstractNewRelicTimingAdvice;->stopWatch:Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatch;

    return-void
.end method


# virtual methods
.method protected buildCachedObjectAttributes(Ljava/lang/String;J)Ljava/util/Map;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "J)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 89
    invoke-virtual {p0, p2, p3}, Lcom/ibotta/android/aop/tracking/newrelic/timing/AbstractNewRelicTimingAdvice;->buildTimeAttributes(J)Ljava/util/Map;

    move-result-object p2

    const-string p3, "cached_object_name"

    .line 90
    invoke-interface {p2, p3, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2
.end method

.method protected buildGalleryAttributes(JI)Ljava/util/Map;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JI)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 96
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/aop/tracking/newrelic/timing/AbstractNewRelicTimingAdvice;->buildTimeAttributes(J)Ljava/util/Map;

    move-result-object p1

    const-string p2, "retailer_id"

    .line 97
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p1
.end method

.method protected buildTimeAttributes(J)Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 82
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "time"

    .line 83
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method protected abstract isResetStopWatchOnStart()Z
.end method

.method protected recordCustomEvent(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "Tracking timing event: eventType=%1$s, eventName=%2$s, attributes=%3$s"

    const/4 v1, 0x3

    .line 72
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 v2, 0x1

    aput-object p2, v1, v2

    const/4 v2, 0x2

    aput-object p3, v1, v2

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 78
    invoke-static {p1, p2, p3}, Lcom/newrelic/agent/android/NewRelic;->recordCustomEvent(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Z

    return-void
.end method

.method public startClock(Lorg/aspectj/lang/JoinPoint;)V
    .locals 0

    .line 43
    invoke-virtual {p0}, Lcom/ibotta/android/aop/tracking/newrelic/timing/AbstractNewRelicTimingAdvice;->isResetStopWatchOnStart()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 44
    iget-object p1, p0, Lcom/ibotta/android/aop/tracking/newrelic/timing/AbstractNewRelicTimingAdvice;->stopWatch:Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatch;

    invoke-interface {p1}, Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatch;->reset()V

    .line 47
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/aop/tracking/newrelic/timing/AbstractNewRelicTimingAdvice;->stopWatch:Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatch;

    invoke-interface {p1}, Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatch;->start()V

    return-void
.end method

.method public stopClock(Lorg/aspectj/lang/JoinPoint;)V
    .locals 4

    .line 57
    iget-object p1, p0, Lcom/ibotta/android/aop/tracking/newrelic/timing/AbstractNewRelicTimingAdvice;->stopWatch:Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatch;

    invoke-interface {p1}, Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatch;->stop()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-lez p1, :cond_0

    .line 60
    invoke-virtual {p0, v0, v1}, Lcom/ibotta/android/aop/tracking/newrelic/timing/AbstractNewRelicTimingAdvice;->trackElapsedTime(J)V

    :cond_0
    return-void
.end method

.method protected abstract trackElapsedTime(J)V
.end method
