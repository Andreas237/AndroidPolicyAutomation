.class public Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatches;
.super Ljava/lang/Object;
.source "StopWatches.java"


# instance fields
.field private final stopWatchProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatch;",
            ">;"
        }
    .end annotation
.end field

.field private final stopWatches:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingType;",
            "Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatch;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatch;",
            ">;)V"
        }
    .end annotation

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatches;->stopWatches:Ljava/util/Map;

    .line 22
    iput-object p1, p0, Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatches;->stopWatchProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static synthetic lambda$forType$0(Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatches;Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingType;)Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatch;
    .locals 2

    .line 27
    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatches;->stopWatchProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatch;

    .line 28
    iget-object v1, p0, Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatches;->stopWatches:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method


# virtual methods
.method public forType(Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingType;)Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatch;
    .locals 2

    .line 26
    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatches;->stopWatches:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatch;

    invoke-static {v0}, Ljava9/util/Optional;->ofNullable(Ljava/lang/Object;)Ljava9/util/Optional;

    move-result-object v0

    new-instance v1, Lcom/ibotta/android/aop/tracking/newrelic/timing/-$$Lambda$StopWatches$WMcTrbchx_KFljSgA-P0hbMskHw;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/aop/tracking/newrelic/timing/-$$Lambda$StopWatches$WMcTrbchx_KFljSgA-P0hbMskHw;-><init>(Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatches;Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingType;)V

    invoke-virtual {v0, v1}, Ljava9/util/Optional;->orElseGet(Ljava9/util/function/Supplier;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatch;

    return-object p1
.end method
