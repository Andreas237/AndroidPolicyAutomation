.class public final Lcom/ibotta/android/di/AopModule_ProvideNewRelicTimingAdviceFactoryFactory;
.super Ljava/lang/Object;
.source "AopModule_ProvideNewRelicTimingAdviceFactoryFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAdviceFactory;",
        ">;"
    }
.end annotation


# instance fields
.field private final stopWatchesProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatches;",
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
            "Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatches;",
            ">;)V"
        }
    .end annotation

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/ibotta/android/di/AopModule_ProvideNewRelicTimingAdviceFactoryFactory;->stopWatchesProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/AopModule_ProvideNewRelicTimingAdviceFactoryFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatches;",
            ">;)",
            "Lcom/ibotta/android/di/AopModule_ProvideNewRelicTimingAdviceFactoryFactory;"
        }
    .end annotation

    .line 35
    new-instance v0, Lcom/ibotta/android/di/AopModule_ProvideNewRelicTimingAdviceFactoryFactory;

    invoke-direct {v0, p0}, Lcom/ibotta/android/di/AopModule_ProvideNewRelicTimingAdviceFactoryFactory;-><init>(Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAdviceFactory;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatches;",
            ">;)",
            "Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAdviceFactory;"
        }
    .end annotation

    .line 30
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatches;

    invoke-static {p0}, Lcom/ibotta/android/di/AopModule_ProvideNewRelicTimingAdviceFactoryFactory;->proxyProvideNewRelicTimingAdviceFactory(Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatches;)Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAdviceFactory;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideNewRelicTimingAdviceFactory(Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatches;)Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAdviceFactory;
    .locals 1

    .line 41
    invoke-static {p0}, Lcom/ibotta/android/di/AopModule;->provideNewRelicTimingAdviceFactory(Lcom/ibotta/android/aop/tracking/newrelic/timing/StopWatches;)Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAdviceFactory;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    .line 40
    invoke-static {p0, v0}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAdviceFactory;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAdviceFactory;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/ibotta/android/di/AopModule_ProvideNewRelicTimingAdviceFactoryFactory;->stopWatchesProvider:Ljavax/inject/Provider;

    invoke-static {v0}, Lcom/ibotta/android/di/AopModule_ProvideNewRelicTimingAdviceFactoryFactory;->provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAdviceFactory;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/ibotta/android/di/AopModule_ProvideNewRelicTimingAdviceFactoryFactory;->get()Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAdviceFactory;

    move-result-object v0

    return-object v0
.end method
