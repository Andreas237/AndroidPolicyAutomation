.class public final Lcom/ibotta/android/di/AopModule_ProvideStopWatchesFactory;
.super Ljava/lang/Object;
.source "AopModule_ProvideStopWatchesFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatches;",
        ">;"
    }
.end annotation


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


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatch;",
            ">;)V"
        }
    .end annotation

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/ibotta/android/di/AopModule_ProvideStopWatchesFactory;->stopWatchProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/AopModule_ProvideStopWatchesFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatch;",
            ">;)",
            "Lcom/ibotta/android/di/AopModule_ProvideStopWatchesFactory;"
        }
    .end annotation

    .line 31
    new-instance v0, Lcom/ibotta/android/di/AopModule_ProvideStopWatchesFactory;

    invoke-direct {v0, p0}, Lcom/ibotta/android/di/AopModule_ProvideStopWatchesFactory;-><init>(Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatches;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatch;",
            ">;)",
            "Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatches;"
        }
    .end annotation

    .line 27
    invoke-static {p0}, Lcom/ibotta/android/di/AopModule_ProvideStopWatchesFactory;->proxyProvideStopWatches(Ljavax/inject/Provider;)Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatches;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideStopWatches(Ljavax/inject/Provider;)Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatches;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatch;",
            ">;)",
            "Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatches;"
        }
    .end annotation

    .line 36
    invoke-static {p0}, Lcom/ibotta/android/di/AopModule;->provideStopWatches(Ljavax/inject/Provider;)Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatches;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    .line 35
    invoke-static {p0, v0}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatches;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatches;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/ibotta/android/di/AopModule_ProvideStopWatchesFactory;->stopWatchProvider:Ljavax/inject/Provider;

    invoke-static {v0}, Lcom/ibotta/android/di/AopModule_ProvideStopWatchesFactory;->provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatches;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/ibotta/android/di/AopModule_ProvideStopWatchesFactory;->get()Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatches;

    move-result-object v0

    return-object v0
.end method
