.class public final Lio/streamroot/dna/core/context/DnaContext;
.super Lio/streamroot/dna/core/context/bean/BeanStore;
.source "DnaContext.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\u000cJ\u0015\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0000\u00a2\u0006\u0002\u0008 J\u0008\u0010!\u001a\u00020\u001dH\u0016J\u0010\u0010\"\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020$H\u0002R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010\"\u0004\u0008\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018\"\u0004\u0008\u0019\u0010\u001aR\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"
    }
    d2 = {
        "Lio/streamroot/dna/core/context/DnaContext;",
        "Lio/streamroot/dna/core/context/bean/BeanStore;",
        "sessionInformation",
        "Lio/streamroot/dna/core/context/config/SessionInformation;",
        "context",
        "Landroid/content/Context;",
        "playerInteractor",
        "Lio/streamroot/dna/core/PlayerInteractor;",
        "qosModule",
        "Lio/streamroot/dna/core/QosModule;",
        "bandwidthListener",
        "Lio/streamroot/dna/core/BandwidthListener;",
        "(Lio/streamroot/dna/core/context/config/SessionInformation;Landroid/content/Context;Lio/streamroot/dna/core/PlayerInteractor;Lio/streamroot/dna/core/QosModule;Lio/streamroot/dna/core/BandwidthListener;)V",
        "analyticsService",
        "Lio/streamroot/dna/core/analytics/AnalyticsService;",
        "getAnalyticsService",
        "()Lio/streamroot/dna/core/analytics/AnalyticsService;",
        "setAnalyticsService",
        "(Lio/streamroot/dna/core/analytics/AnalyticsService;)V",
        "dnaAsyncLoaderJob",
        "Lkotlinx/coroutines/Job;",
        "dnaBehaviourService",
        "Lio/streamroot/dna/core/transfer/DnaBehaviourService;",
        "getDnaBehaviourService",
        "()Lio/streamroot/dna/core/transfer/DnaBehaviourService;",
        "setDnaBehaviourService",
        "(Lio/streamroot/dna/core/transfer/DnaBehaviourService;)V",
        "loadingTimeoutJob",
        "asyncLoad",
        "",
        "backendUrl",
        "Lokhttp3/HttpUrl;",
        "asyncLoad$dna_core_release",
        "close",
        "triggerLoadingTimeout",
        "dnaConfiguration",
        "Lio/streamroot/dna/core/context/config/DnaConfiguration;",
        "dna-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private analyticsService:Lio/streamroot/dna/core/analytics/AnalyticsService;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private dnaAsyncLoaderJob:Lkotlinx/coroutines/Job;

.field private dnaBehaviourService:Lio/streamroot/dna/core/transfer/DnaBehaviourService;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private loadingTimeoutJob:Lkotlinx/coroutines/Job;


# direct methods
.method public constructor <init>(Lio/streamroot/dna/core/context/config/SessionInformation;Landroid/content/Context;Lio/streamroot/dna/core/PlayerInteractor;Lio/streamroot/dna/core/QosModule;Lio/streamroot/dna/core/BandwidthListener;)V
    .locals 1
    .param p1    # Lio/streamroot/dna/core/context/config/SessionInformation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lio/streamroot/dna/core/PlayerInteractor;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lio/streamroot/dna/core/QosModule;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Lio/streamroot/dna/core/BandwidthListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "sessionInformation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "playerInteractor"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    invoke-direct {p0, p1, p2}, Lio/streamroot/dna/core/context/bean/BeanStore;-><init>(Lio/streamroot/dna/core/context/config/SessionInformation;Landroid/content/Context;)V

    .line 42
    move-object p1, p0

    check-cast p1, Lio/streamroot/dna/core/context/bean/BeanStore;

    invoke-static {p1, p3, p4, p5}, Lio/streamroot/dna/core/context/injection/InitialBeanInjectionKt;->registerInitialBeans(Lio/streamroot/dna/core/context/bean/BeanStore;Lio/streamroot/dna/core/PlayerInteractor;Lio/streamroot/dna/core/QosModule;Lio/streamroot/dna/core/BandwidthListener;)V

    .line 43
    const-class p1, Lio/streamroot/dna/core/analytics/AnalyticsService;

    invoke-virtual {p0, p1}, Lio/streamroot/dna/core/context/DnaContext;->getBean(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/streamroot/dna/core/analytics/AnalyticsService;

    iput-object p1, p0, Lio/streamroot/dna/core/context/DnaContext;->analyticsService:Lio/streamroot/dna/core/analytics/AnalyticsService;

    .line 44
    const-class p1, Lio/streamroot/dna/core/transfer/DnaBehaviourService;

    invoke-virtual {p0, p1}, Lio/streamroot/dna/core/context/DnaContext;->getBean(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/streamroot/dna/core/transfer/DnaBehaviourService;

    iput-object p1, p0, Lio/streamroot/dna/core/context/DnaContext;->dnaBehaviourService:Lio/streamroot/dna/core/transfer/DnaBehaviourService;

    return-void
.end method

.method public static final synthetic access$triggerLoadingTimeout(Lio/streamroot/dna/core/context/DnaContext;Lio/streamroot/dna/core/context/config/DnaConfiguration;)V
    .locals 0
    .param p1    # Lio/streamroot/dna/core/context/config/DnaConfiguration;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 29
    invoke-direct {p0, p1}, Lio/streamroot/dna/core/context/DnaContext;->triggerLoadingTimeout(Lio/streamroot/dna/core/context/config/DnaConfiguration;)V

    return-void
.end method

.method private final triggerLoadingTimeout(Lio/streamroot/dna/core/context/config/DnaConfiguration;)V
    .locals 9

    .line 87
    invoke-static {}, Lio/streamroot/dna/core/context/config/Configurations;->getDNA_LOADING_TIMEOUT()Lio/streamroot/dna/core/context/config/Configuration;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/streamroot/dna/core/context/config/DnaConfiguration;->getNumericConfiguration(Lio/streamroot/dna/core/context/config/Configuration;)Ljava/lang/Number;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    .line 88
    const-class p1, Lio/streamroot/dna/core/context/DnaCoroutineContext;

    invoke-virtual {p0, p1}, Lio/streamroot/dna/core/context/DnaContext;->getBean(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/streamroot/dna/core/context/DnaCoroutineContext;

    .line 89
    sget-object v2, Lkotlinx/coroutines/GlobalScope;->INSTANCE:Lkotlinx/coroutines/GlobalScope;

    move-object v3, v2

    check-cast v3, Lkotlinx/coroutines/CoroutineScope;

    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getDefault()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v2

    check-cast v2, Lkotlin/coroutines/CoroutineContext;

    invoke-virtual {p1, v2}, Lio/streamroot/dna/core/context/DnaCoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object v4

    new-instance p1, Lio/streamroot/dna/core/context/DnaContext$triggerLoadingTimeout$1;

    const/4 v2, 0x0

    invoke-direct {p1, p0, v0, v1, v2}, Lio/streamroot/dna/core/context/DnaContext$triggerLoadingTimeout$1;-><init>(Lio/streamroot/dna/core/context/DnaContext;JLkotlin/coroutines/Continuation;)V

    move-object v6, p1

    check-cast v6, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x0

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static/range {v3 .. v8}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    move-result-object p1

    iput-object p1, p0, Lio/streamroot/dna/core/context/DnaContext;->loadingTimeoutJob:Lkotlinx/coroutines/Job;

    return-void
.end method


# virtual methods
.method public final asyncLoad$dna_core_release(Lokhttp3/HttpUrl;)V
    .locals 9
    .param p1    # Lokhttp3/HttpUrl;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "backendUrl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    invoke-virtual {p0}, Lio/streamroot/dna/core/context/DnaContext;->getStateManager()Lio/streamroot/dna/core/context/state/StateManager;

    move-result-object v0

    sget-object v1, Lio/streamroot/dna/core/State;->DNA_ACCESS_REQUESTED:Lio/streamroot/dna/core/State;

    invoke-virtual {v0, v1}, Lio/streamroot/dna/core/context/state/StateManager;->updateState(Lio/streamroot/dna/core/State;)V

    .line 50
    invoke-virtual {p0}, Lio/streamroot/dna/core/context/DnaContext;->getWeakContext()Ljava/lang/ref/WeakReference;

    move-result-object v2

    .line 51
    invoke-virtual {p0}, Lio/streamroot/dna/core/context/DnaContext;->getStateManager()Lio/streamroot/dna/core/context/state/StateManager;

    move-result-object v3

    const-string v0, "backendOkHttpClient"

    .line 52
    invoke-virtual {p0, v0}, Lio/streamroot/dna/core/context/DnaContext;->getBean(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lokhttp3/Call$Factory;

    .line 53
    const-class v0, Lio/streamroot/dna/core/context/DnaCoroutineContext;

    invoke-virtual {p0, v0}, Lio/streamroot/dna/core/context/DnaContext;->getBean(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lkotlin/coroutines/CoroutineContext;

    .line 54
    invoke-virtual {p0}, Lio/streamroot/dna/core/context/DnaContext;->getSessionInformation()Lio/streamroot/dna/core/context/config/SessionInformation;

    move-result-object v6

    .line 56
    new-instance v0, Lio/streamroot/dna/core/context/DnaContext$asyncLoad$1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lio/streamroot/dna/core/context/DnaContext$asyncLoad$1;-><init>(Lio/streamroot/dna/core/context/DnaContext;Lkotlin/coroutines/Continuation;)V

    move-object v8, v0

    check-cast v8, Lkotlin/jvm/functions/Function2;

    move-object v7, p1

    .line 49
    invoke-static/range {v2 .. v8}, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt;->dnaAsyncLoad(Ljava/lang/ref/WeakReference;Lio/streamroot/dna/core/context/state/StateManager;Lokhttp3/Call$Factory;Lkotlin/coroutines/CoroutineContext;Lio/streamroot/dna/core/context/config/SessionInformation;Lokhttp3/HttpUrl;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;

    move-result-object p1

    iput-object p1, p0, Lio/streamroot/dna/core/context/DnaContext;->dnaAsyncLoaderJob:Lkotlinx/coroutines/Job;

    return-void
.end method

.method public close()V
    .locals 2

    .line 79
    invoke-super {p0}, Lio/streamroot/dna/core/context/bean/BeanStore;->close()V

    const/4 v0, 0x0

    .line 80
    move-object v1, v0

    check-cast v1, Lio/streamroot/dna/core/transfer/DnaBehaviourService;

    iput-object v1, p0, Lio/streamroot/dna/core/context/DnaContext;->dnaBehaviourService:Lio/streamroot/dna/core/transfer/DnaBehaviourService;

    .line 81
    check-cast v0, Lio/streamroot/dna/core/analytics/AnalyticsService;

    iput-object v0, p0, Lio/streamroot/dna/core/context/DnaContext;->analyticsService:Lio/streamroot/dna/core/analytics/AnalyticsService;

    .line 82
    iget-object v0, p0, Lio/streamroot/dna/core/context/DnaContext;->loadingTimeoutJob:Lkotlinx/coroutines/Job;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lkotlinx/coroutines/Job;->cancel()V

    .line 83
    :cond_0
    iget-object v0, p0, Lio/streamroot/dna/core/context/DnaContext;->dnaAsyncLoaderJob:Lkotlinx/coroutines/Job;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lkotlinx/coroutines/Job;->cancel()V

    :cond_1
    return-void
.end method

.method public final getAnalyticsService()Lio/streamroot/dna/core/analytics/AnalyticsService;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 38
    iget-object v0, p0, Lio/streamroot/dna/core/context/DnaContext;->analyticsService:Lio/streamroot/dna/core/analytics/AnalyticsService;

    return-object v0
.end method

.method public final getDnaBehaviourService()Lio/streamroot/dna/core/transfer/DnaBehaviourService;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 39
    iget-object v0, p0, Lio/streamroot/dna/core/context/DnaContext;->dnaBehaviourService:Lio/streamroot/dna/core/transfer/DnaBehaviourService;

    return-object v0
.end method

.method public final setAnalyticsService(Lio/streamroot/dna/core/analytics/AnalyticsService;)V
    .locals 0
    .param p1    # Lio/streamroot/dna/core/analytics/AnalyticsService;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 38
    iput-object p1, p0, Lio/streamroot/dna/core/context/DnaContext;->analyticsService:Lio/streamroot/dna/core/analytics/AnalyticsService;

    return-void
.end method

.method public final setDnaBehaviourService(Lio/streamroot/dna/core/transfer/DnaBehaviourService;)V
    .locals 0
    .param p1    # Lio/streamroot/dna/core/transfer/DnaBehaviourService;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 39
    iput-object p1, p0, Lio/streamroot/dna/core/context/DnaContext;->dnaBehaviourService:Lio/streamroot/dna/core/transfer/DnaBehaviourService;

    return-void
.end method
