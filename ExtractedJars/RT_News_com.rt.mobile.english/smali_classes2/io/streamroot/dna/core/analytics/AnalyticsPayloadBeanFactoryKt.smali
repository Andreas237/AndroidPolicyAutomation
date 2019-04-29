.class public final Lio/streamroot/dna/core/analytics/AnalyticsPayloadBeanFactoryKt;
.super Ljava/lang/Object;
.source "AnalyticsPayloadBeanFactory.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u00a8\u0006\u0006"
    }
    d2 = {
        "registerSessionInformationBean",
        "",
        "beanStore",
        "Lio/streamroot/dna/core/context/bean/BeanStore;",
        "dnaConfiguration",
        "Lio/streamroot/dna/core/context/config/DnaConfiguration;",
        "dna-core_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# direct methods
.method public static final registerSessionInformationBean(Lio/streamroot/dna/core/context/bean/BeanStore;Lio/streamroot/dna/core/context/config/DnaConfiguration;)V
    .locals 9
    .param p0    # Lio/streamroot/dna/core/context/bean/BeanStore;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lio/streamroot/dna/core/context/config/DnaConfiguration;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "beanStore"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dnaConfiguration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    new-instance v0, Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter;

    .line 8
    invoke-virtual {p0}, Lio/streamroot/dna/core/context/bean/BeanStore;->getStateManager()Lio/streamroot/dna/core/context/state/StateManager;

    move-result-object v2

    .line 9
    invoke-virtual {p0}, Lio/streamroot/dna/core/context/bean/BeanStore;->getSessionInformation()Lio/streamroot/dna/core/context/config/SessionInformation;

    move-result-object v3

    .line 10
    invoke-virtual {p1}, Lio/streamroot/dna/core/context/config/DnaConfiguration;->getInfrastructure()Lio/streamroot/dna/core/context/config/Infrastructure;

    move-result-object v4

    .line 11
    invoke-virtual {p1}, Lio/streamroot/dna/core/context/config/DnaConfiguration;->getCustomerProperties()Lio/streamroot/dna/core/context/loader/CustomerProperties;

    move-result-object v5

    const/4 v6, 0x0

    const/16 v7, 0x10

    const/4 v8, 0x0

    move-object v1, v0

    .line 7
    invoke-direct/range {v1 .. v8}, Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter;-><init>(Lio/streamroot/dna/core/context/state/StateManager;Lio/streamroot/dna/core/context/config/SessionInformation;Lio/streamroot/dna/core/context/config/Infrastructure;Lio/streamroot/dna/core/context/loader/CustomerProperties;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 12
    invoke-virtual {p0, v0}, Lio/streamroot/dna/core/context/bean/BeanStore;->registerBean(Ljava/lang/Object;)Lio/streamroot/dna/core/context/bean/BeanStore;

    return-void
.end method
