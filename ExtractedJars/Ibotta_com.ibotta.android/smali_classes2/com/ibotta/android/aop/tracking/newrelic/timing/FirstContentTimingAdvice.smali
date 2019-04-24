.class public Lcom/ibotta/android/aop/tracking/newrelic/timing/FirstContentTimingAdvice;
.super Lcom/ibotta/android/aop/tracking/newrelic/timing/AbstractNewRelicTimingAdvice;
.source "FirstContentTimingAdvice.java"


# static fields
.field protected static isAlreadyTracked:Z


# direct methods
.method public constructor <init>(Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatch;)V
    .locals 0

    .line 14
    invoke-direct {p0, p1}, Lcom/ibotta/android/aop/tracking/newrelic/timing/AbstractNewRelicTimingAdvice;-><init>(Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatch;)V

    return-void
.end method


# virtual methods
.method protected isResetStopWatchOnStart()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method protected trackElapsedTime(J)V
    .locals 2

    .line 20
    sget-boolean v0, Lcom/ibotta/android/aop/tracking/newrelic/timing/FirstContentTimingAdvice;->isAlreadyTracked:Z

    if-nez v0, :cond_0

    const-string v0, "timing"

    const-string v1, "time_to_first_content"

    .line 21
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/aop/tracking/newrelic/timing/FirstContentTimingAdvice;->buildTimeAttributes(J)Ljava/util/Map;

    move-result-object p1

    invoke-virtual {p0, v0, v1, p1}, Lcom/ibotta/android/aop/tracking/newrelic/timing/FirstContentTimingAdvice;->recordCustomEvent(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    const/4 p1, 0x1

    .line 22
    sput-boolean p1, Lcom/ibotta/android/aop/tracking/newrelic/timing/FirstContentTimingAdvice;->isAlreadyTracked:Z

    :cond_0
    return-void
.end method
