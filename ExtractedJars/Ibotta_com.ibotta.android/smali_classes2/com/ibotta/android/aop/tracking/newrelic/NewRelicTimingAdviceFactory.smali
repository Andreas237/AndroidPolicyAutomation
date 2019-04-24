.class public Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAdviceFactory;
.super Ljava/lang/Object;
.source "NewRelicTimingAdviceFactory.java"


# instance fields
.field private final stopWatches:Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatches;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatches;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAdviceFactory;->stopWatches:Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatches;

    return-void
.end method


# virtual methods
.method public createAdvice(Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingType;)Lcom/ibotta/android/aop/tracking/newrelic/timing/NewRelicTimingAdvice;
    .locals 2

    .line 22
    sget-object v0, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAdviceFactory$1;->$SwitchMap$com$ibotta$android$aop$tracking$newrelic$NewRelicTimingType:[I

    invoke-virtual {p1}, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingType;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 31
    new-instance v0, Lcom/ibotta/android/aop/tracking/newrelic/timing/NoOpTimingAdvice;

    invoke-direct {v0}, Lcom/ibotta/android/aop/tracking/newrelic/timing/NoOpTimingAdvice;-><init>()V

    goto :goto_0

    .line 27
    :pswitch_0
    new-instance v0, Lcom/ibotta/android/aop/tracking/newrelic/timing/PwiBarcodeLoadTimingAdvice;

    iget-object v1, p0, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAdviceFactory;->stopWatches:Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatches;

    invoke-virtual {v1, p1}, Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatches;->forType(Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingType;)Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatch;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/ibotta/android/aop/tracking/newrelic/timing/PwiBarcodeLoadTimingAdvice;-><init>(Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatch;)V

    goto :goto_0

    .line 24
    :pswitch_1
    new-instance v0, Lcom/ibotta/android/aop/tracking/newrelic/timing/FirstContentTimingAdvice;

    iget-object v1, p0, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAdviceFactory;->stopWatches:Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatches;

    invoke-virtual {v1, p1}, Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatches;->forType(Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingType;)Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatch;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/ibotta/android/aop/tracking/newrelic/timing/FirstContentTimingAdvice;-><init>(Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatch;)V

    :goto_0
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
