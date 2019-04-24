.class public Lcom/ibotta/android/aop/tracking/newrelic/timing/PwiBarcodeLoadTimingAdvice;
.super Lcom/ibotta/android/aop/tracking/newrelic/timing/AbstractNewRelicTimingAdvice;
.source "PwiBarcodeLoadTimingAdvice.java"


# direct methods
.method public constructor <init>(Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatch;)V
    .locals 0

    .line 11
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

    const-string v0, "timing"

    const-string v1, "time_to_load_igc_barcode"

    .line 16
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/aop/tracking/newrelic/timing/PwiBarcodeLoadTimingAdvice;->buildTimeAttributes(J)Ljava/util/Map;

    move-result-object p1

    invoke-virtual {p0, v0, v1, p1}, Lcom/ibotta/android/aop/tracking/newrelic/timing/PwiBarcodeLoadTimingAdvice;->recordCustomEvent(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method
