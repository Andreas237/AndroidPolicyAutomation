.class public final Lcom/ibotta/android/di/AopModule_ProvideNewRelicTrackingAdviceFactoryFactory;
.super Ljava/lang/Object;
.source "AopModule_ProvideNewRelicTrackingAdviceFactoryFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingAdviceFactory;",
        ">;"
    }
.end annotation


# static fields
.field private static final INSTANCE:Lcom/ibotta/android/di/AopModule_ProvideNewRelicTrackingAdviceFactoryFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 14
    new-instance v0, Lcom/ibotta/android/di/AopModule_ProvideNewRelicTrackingAdviceFactoryFactory;

    invoke-direct {v0}, Lcom/ibotta/android/di/AopModule_ProvideNewRelicTrackingAdviceFactoryFactory;-><init>()V

    sput-object v0, Lcom/ibotta/android/di/AopModule_ProvideNewRelicTrackingAdviceFactoryFactory;->INSTANCE:Lcom/ibotta/android/di/AopModule_ProvideNewRelicTrackingAdviceFactoryFactory;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create()Lcom/ibotta/android/di/AopModule_ProvideNewRelicTrackingAdviceFactoryFactory;
    .locals 1

    .line 27
    sget-object v0, Lcom/ibotta/android/di/AopModule_ProvideNewRelicTrackingAdviceFactoryFactory;->INSTANCE:Lcom/ibotta/android/di/AopModule_ProvideNewRelicTrackingAdviceFactoryFactory;

    return-object v0
.end method

.method public static provideInstance()Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingAdviceFactory;
    .locals 1

    .line 23
    invoke-static {}, Lcom/ibotta/android/di/AopModule_ProvideNewRelicTrackingAdviceFactoryFactory;->proxyProvideNewRelicTrackingAdviceFactory()Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingAdviceFactory;

    move-result-object v0

    return-object v0
.end method

.method public static proxyProvideNewRelicTrackingAdviceFactory()Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingAdviceFactory;
    .locals 2

    .line 32
    invoke-static {}, Lcom/ibotta/android/di/AopModule;->provideNewRelicTrackingAdviceFactory()Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingAdviceFactory;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable @Provides method"

    .line 31
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingAdviceFactory;

    return-object v0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingAdviceFactory;
    .locals 1

    .line 19
    invoke-static {}, Lcom/ibotta/android/di/AopModule_ProvideNewRelicTrackingAdviceFactoryFactory;->provideInstance()Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingAdviceFactory;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 8
    invoke-virtual {p0}, Lcom/ibotta/android/di/AopModule_ProvideNewRelicTrackingAdviceFactoryFactory;->get()Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingAdviceFactory;

    move-result-object v0

    return-object v0
.end method
