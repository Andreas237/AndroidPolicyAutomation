.class public final synthetic Lcom/ibotta/android/aop/tracking/newrelic/timing/-$$Lambda$StopWatches$WMcTrbchx_KFljSgA-P0hbMskHw;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/Supplier;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatches;

.field private final synthetic f$1:Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingType;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatches;Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingType;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/aop/tracking/newrelic/timing/-$$Lambda$StopWatches$WMcTrbchx_KFljSgA-P0hbMskHw;->f$0:Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatches;

    iput-object p2, p0, Lcom/ibotta/android/aop/tracking/newrelic/timing/-$$Lambda$StopWatches$WMcTrbchx_KFljSgA-P0hbMskHw;->f$1:Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingType;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/newrelic/timing/-$$Lambda$StopWatches$WMcTrbchx_KFljSgA-P0hbMskHw;->f$0:Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatches;

    iget-object v1, p0, Lcom/ibotta/android/aop/tracking/newrelic/timing/-$$Lambda$StopWatches$WMcTrbchx_KFljSgA-P0hbMskHw;->f$1:Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingType;

    invoke-static {v0, v1}, Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatches;->lambda$forType$0(Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatches;Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingType;)Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatch;

    move-result-object v0

    return-object v0
.end method
