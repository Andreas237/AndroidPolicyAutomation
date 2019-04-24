.class public abstract Lcom/ibotta/android/di/AopModule;
.super Ljava/lang/Object;
.source "AopModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static provideNewRelicTimingAdviceFactory(Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatches;)Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAdviceFactory;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 35
    new-instance v0, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAdviceFactory;

    invoke-direct {v0, p0}, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAdviceFactory;-><init>(Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatches;)V

    return-object v0
.end method

.method public static provideNewRelicTrackingAdviceFactory()Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingAdviceFactory;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 30
    new-instance v0, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingAdviceFactory;

    invoke-direct {v0}, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingAdviceFactory;-><init>()V

    return-object v0
.end method

.method public static provideScreenNameMap()Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 60
    new-instance v0, Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;

    invoke-direct {v0}, Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;-><init>()V

    return-object v0
.end method

.method public static provideStopWatch(Lcom/ibotta/android/util/AppHelper;)Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatch;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 50
    new-instance v0, Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatchImpl;

    invoke-direct {v0, p0}, Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatchImpl;-><init>(Lcom/ibotta/android/util/AppHelper;)V

    return-object v0
.end method

.method public static provideStopWatches(Ljavax/inject/Provider;)Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatches;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatch;",
            ">;)",
            "Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatches;"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 55
    new-instance v0, Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatches;

    invoke-direct {v0, p0}, Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatches;-><init>(Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideTrackingAdviceFactory(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;Landroid/content/res/Resources;)Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;
    .locals 7
    .param p0    # Lcom/ibotta/android/tracking/TrackingClient;
        .annotation runtime Ljavax/inject/Named;
            value = "AdviceTrackingClient"
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 45
    new-instance v6, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/aop/tracking/TrackingAdviceFactory;-><init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/aop/tracking/advice/ScreenNameMap;Landroid/content/res/Resources;)V

    return-object v6
.end method
