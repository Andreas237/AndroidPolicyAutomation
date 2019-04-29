.class public final Lio/streamroot/dna/core/context/injection/QosBeanInjectionKt;
.super Ljava/lang/Object;
.source "QosBeanInjection.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u0018\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u00a8\u0006\u0007"
    }
    d2 = {
        "registerQosModuleBean",
        "",
        "beanStore",
        "Lio/streamroot/dna/core/context/bean/BeanStore;",
        "dnaConfiguration",
        "Lio/streamroot/dna/core/context/config/DnaConfiguration;",
        "registerQosTesterBeans",
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
.method public static final registerQosModuleBean(Lio/streamroot/dna/core/context/bean/BeanStore;Lio/streamroot/dna/core/context/config/DnaConfiguration;)V
    .locals 3
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

    .line 20
    const-class v0, Lio/streamroot/dna/core/QosModule;

    invoke-virtual {p0, v0}, Lio/streamroot/dna/core/context/bean/BeanStore;->getOptionalBean(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/streamroot/dna/core/QosModule;

    if-nez v0, :cond_0

    .line 22
    const-class v0, Lio/streamroot/dna/core/media/PlayerWrapper;

    invoke-virtual {p0, v0}, Lio/streamroot/dna/core/context/bean/BeanStore;->getBean(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/streamroot/dna/core/media/PlayerWrapper;

    .line 23
    const-class v1, Lio/streamroot/dna/core/context/DnaCoroutineContext;

    invoke-virtual {p0, v1}, Lio/streamroot/dna/core/context/bean/BeanStore;->getBean(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/streamroot/dna/core/context/DnaCoroutineContext;

    .line 24
    new-instance v2, Lio/streamroot/dna/core/media/DefaultQosModule;

    check-cast v1, Lkotlin/coroutines/CoroutineContext;

    invoke-direct {v2, v0, v1}, Lio/streamroot/dna/core/media/DefaultQosModule;-><init>(Lio/streamroot/dna/core/media/PlayerWrapper;Lkotlin/coroutines/CoroutineContext;)V

    .line 25
    invoke-virtual {p0, v2}, Lio/streamroot/dna/core/context/bean/BeanStore;->registerBean(Ljava/lang/Object;)Lio/streamroot/dna/core/context/bean/BeanStore;

    .line 26
    move-object v0, v2

    check-cast v0, Lio/streamroot/dna/core/QosModule;

    .line 30
    :cond_0
    new-instance v1, Lio/streamroot/dna/core/media/QosAnalyticsReporter;

    invoke-virtual {p1}, Lio/streamroot/dna/core/context/config/DnaConfiguration;->isQosTester()Z

    move-result p1

    invoke-direct {v1, v0, p1}, Lio/streamroot/dna/core/media/QosAnalyticsReporter;-><init>(Lio/streamroot/dna/core/QosModule;Z)V

    invoke-virtual {p0, v1}, Lio/streamroot/dna/core/context/bean/BeanStore;->registerBean(Ljava/lang/Object;)Lio/streamroot/dna/core/context/bean/BeanStore;

    return-void
.end method

.method public static final registerQosTesterBeans(Lio/streamroot/dna/core/context/bean/BeanStore;Lio/streamroot/dna/core/context/config/DnaConfiguration;)V
    .locals 1
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

    .line 13
    invoke-static {p0, p1}, Lio/streamroot/dna/core/context/injection/QosBeanInjectionKt;->registerQosModuleBean(Lio/streamroot/dna/core/context/bean/BeanStore;Lio/streamroot/dna/core/context/config/DnaConfiguration;)V

    .line 14
    invoke-static {p0}, Lio/streamroot/dna/core/context/injection/DnaBeanInjectionKt;->registerMemoryServiceBean(Lio/streamroot/dna/core/context/bean/BeanStore;)V

    .line 15
    invoke-static {p0, p1}, Lio/streamroot/dna/core/analytics/AnalyticsPayloadBeanFactoryKt;->registerSessionInformationBean(Lio/streamroot/dna/core/context/bean/BeanStore;Lio/streamroot/dna/core/context/config/DnaConfiguration;)V

    .line 16
    invoke-static {p0, p1}, Lio/streamroot/dna/core/context/injection/DnaBeanInjectionKt;->registerAnalyticsModuleBean(Lio/streamroot/dna/core/context/bean/BeanStore;Lio/streamroot/dna/core/context/config/DnaConfiguration;)V

    return-void
.end method
