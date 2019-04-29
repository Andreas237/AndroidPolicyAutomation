.class public final Lio/streamroot/dna/core/context/injection/InitialBeanInjectionKt;
.super Ljava/lang/Object;
.source "InitialBeanInjection.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nInitialBeanInjection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InitialBeanInjection.kt\nio/streamroot/dna/core/context/injection/InitialBeanInjectionKt\n*L\n1#1,198:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0010\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a,\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0008\u0010\u0008\u001a\u0004\u0018\u00010\t2\u0008\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0000\u001a\u0010\u0010\u000c\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0010\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0010\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u00a8\u0006\u000f"
    }
    d2 = {
        "registerAnalyticsService",
        "",
        "beanStore",
        "Lio/streamroot/dna/core/context/bean/BeanStore;",
        "registerDnaBehaviorService",
        "registerInitialBeans",
        "playerInteractor",
        "Lio/streamroot/dna/core/PlayerInteractor;",
        "qosModule",
        "Lio/streamroot/dna/core/QosModule;",
        "bandwidthListener",
        "Lio/streamroot/dna/core/BandwidthListener;",
        "registerManifestBean",
        "registerOkHttpClientBean",
        "registerProxyBean",
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
.method private static final registerAnalyticsService(Lio/streamroot/dna/core/context/bean/BeanStore;)V
    .locals 8

    .line 172
    const-class v0, Lio/streamroot/dna/core/js/CallExecutor;

    invoke-virtual {p0, v0}, Lio/streamroot/dna/core/context/bean/BeanStore;->getBean(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/streamroot/dna/core/js/CallExecutor;

    .line 173
    const-class v1, Lio/streamroot/dna/core/analytics/CdnAnalyticsReporter;

    invoke-virtual {p0, v1}, Lio/streamroot/dna/core/context/bean/BeanStore;->getBean(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lio/streamroot/dna/core/analytics/CdnAnalyticsReporter;

    .line 174
    const-class v1, Lio/streamroot/dna/core/error/ErrorAggregator;

    invoke-virtual {p0, v1}, Lio/streamroot/dna/core/context/bean/BeanStore;->getBean(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lio/streamroot/dna/core/error/ErrorAggregator;

    .line 175
    const-class v1, Lio/streamroot/dna/core/context/DnaCoroutineContext;

    invoke-virtual {p0, v1}, Lio/streamroot/dna/core/context/bean/BeanStore;->getBean(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/streamroot/dna/core/context/DnaCoroutineContext;

    .line 177
    new-instance v7, Lio/streamroot/dna/core/analytics/AnalyticsHandler;

    invoke-direct {v7, v0}, Lio/streamroot/dna/core/analytics/AnalyticsHandler;-><init>(Lio/streamroot/dna/core/js/CallExecutor;)V

    .line 178
    invoke-virtual {p0, v7}, Lio/streamroot/dna/core/context/bean/BeanStore;->registerBean(Ljava/lang/Object;)Lio/streamroot/dna/core/context/bean/BeanStore;

    .line 180
    new-instance v0, Lio/streamroot/dna/core/analytics/AnalyticsService;

    .line 181
    invoke-virtual {p0}, Lio/streamroot/dna/core/context/bean/BeanStore;->getStateManager()Lio/streamroot/dna/core/context/state/StateManager;

    move-result-object v3

    .line 184
    move-object v6, v1

    check-cast v6, Lkotlin/coroutines/CoroutineContext;

    move-object v2, v0

    .line 180
    invoke-direct/range {v2 .. v7}, Lio/streamroot/dna/core/analytics/AnalyticsService;-><init>(Lio/streamroot/dna/core/context/state/StateManager;Lio/streamroot/dna/core/analytics/CdnAnalyticsReporter;Lio/streamroot/dna/core/error/ErrorAggregator;Lkotlin/coroutines/CoroutineContext;Lio/streamroot/dna/core/analytics/AnalyticsHandler;)V

    .line 186
    invoke-virtual {p0, v0}, Lio/streamroot/dna/core/context/bean/BeanStore;->registerBean(Ljava/lang/Object;)Lio/streamroot/dna/core/context/bean/BeanStore;

    return-void
.end method

.method private static final registerDnaBehaviorService(Lio/streamroot/dna/core/context/bean/BeanStore;)V
    .locals 2

    .line 190
    const-class v0, Lio/streamroot/dna/core/js/CallExecutor;

    invoke-virtual {p0, v0}, Lio/streamroot/dna/core/context/bean/BeanStore;->getBean(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/streamroot/dna/core/js/CallExecutor;

    .line 192
    new-instance v1, Lio/streamroot/dna/core/transfer/DnaBehaviourHandler;

    invoke-direct {v1, v0}, Lio/streamroot/dna/core/transfer/DnaBehaviourHandler;-><init>(Lio/streamroot/dna/core/js/CallExecutor;)V

    .line 193
    invoke-virtual {p0, v1}, Lio/streamroot/dna/core/context/bean/BeanStore;->registerBean(Ljava/lang/Object;)Lio/streamroot/dna/core/context/bean/BeanStore;

    .line 195
    new-instance v0, Lio/streamroot/dna/core/transfer/DnaBehaviourService;

    invoke-direct {v0, v1}, Lio/streamroot/dna/core/transfer/DnaBehaviourService;-><init>(Lio/streamroot/dna/core/transfer/DnaBehaviourHandler;)V

    .line 196
    invoke-virtual {p0, v0}, Lio/streamroot/dna/core/context/bean/BeanStore;->registerBean(Ljava/lang/Object;)Lio/streamroot/dna/core/context/bean/BeanStore;

    return-void
.end method

.method public static final registerInitialBeans(Lio/streamroot/dna/core/context/bean/BeanStore;Lio/streamroot/dna/core/PlayerInteractor;Lio/streamroot/dna/core/QosModule;Lio/streamroot/dna/core/BandwidthListener;)V
    .locals 8
    .param p0    # Lio/streamroot/dna/core/context/bean/BeanStore;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lio/streamroot/dna/core/PlayerInteractor;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/streamroot/dna/core/QosModule;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lio/streamroot/dna/core/BandwidthListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "beanStore"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "playerInteractor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    new-instance v2, Lio/streamroot/dna/core/error/ErrorAggregator;

    invoke-direct {v2}, Lio/streamroot/dna/core/error/ErrorAggregator;-><init>()V

    .line 49
    new-instance v0, Lio/streamroot/dna/core/context/DnaCoroutineContext;

    invoke-direct {v0, v2}, Lio/streamroot/dna/core/context/DnaCoroutineContext;-><init>(Lio/streamroot/dna/core/error/ErrorAggregator;)V

    .line 50
    invoke-virtual {p0, v2}, Lio/streamroot/dna/core/context/bean/BeanStore;->registerBean(Ljava/lang/Object;)Lio/streamroot/dna/core/context/bean/BeanStore;

    .line 51
    new-instance v1, Lio/streamroot/dna/core/js/CallExecutor;

    invoke-direct {v1}, Lio/streamroot/dna/core/js/CallExecutor;-><init>()V

    invoke-virtual {p0, v1}, Lio/streamroot/dna/core/context/bean/BeanStore;->registerBean(Ljava/lang/Object;)Lio/streamroot/dna/core/context/bean/BeanStore;

    .line 52
    new-instance v1, Lio/streamroot/dna/core/analytics/CdnAnalyticsReporter;

    invoke-virtual {p0}, Lio/streamroot/dna/core/context/bean/BeanStore;->getStateManager()Lio/streamroot/dna/core/context/state/StateManager;

    move-result-object v3

    invoke-direct {v1, v3}, Lio/streamroot/dna/core/analytics/CdnAnalyticsReporter;-><init>(Lio/streamroot/dna/core/context/state/StateManager;)V

    invoke-virtual {p0, v1}, Lio/streamroot/dna/core/context/bean/BeanStore;->registerBean(Ljava/lang/Object;)Lio/streamroot/dna/core/context/bean/BeanStore;

    .line 53
    invoke-virtual {p0, v0}, Lio/streamroot/dna/core/context/bean/BeanStore;->registerBean(Ljava/lang/Object;)Lio/streamroot/dna/core/context/bean/BeanStore;

    .line 54
    new-instance v1, Lio/streamroot/dna/core/media/PlayerWrapper;

    invoke-direct {v1, p1}, Lio/streamroot/dna/core/media/PlayerWrapper;-><init>(Lio/streamroot/dna/core/PlayerInteractor;)V

    invoke-virtual {p0, v1}, Lio/streamroot/dna/core/context/bean/BeanStore;->registerBean(Ljava/lang/Object;)Lio/streamroot/dna/core/context/bean/BeanStore;

    if-eqz p2, :cond_0

    .line 55
    invoke-virtual {p0, p2}, Lio/streamroot/dna/core/context/bean/BeanStore;->registerBean(Ljava/lang/Object;)Lio/streamroot/dna/core/context/bean/BeanStore;

    :cond_0
    if-eqz p3, :cond_1

    .line 56
    new-instance p1, Lio/streamroot/dna/core/http/bandwidth/BandwidthMeter;

    move-object v4, v0

    check-cast v4, Lkotlin/coroutines/CoroutineContext;

    const/4 v5, 0x0

    const/16 v6, 0x8

    const/4 v7, 0x0

    move-object v1, p1

    move-object v3, p3

    invoke-direct/range {v1 .. v7}, Lio/streamroot/dna/core/http/bandwidth/BandwidthMeter;-><init>(Lio/streamroot/dna/core/error/ErrorAggregator;Lio/streamroot/dna/core/BandwidthListener;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineDispatcher;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0, p1}, Lio/streamroot/dna/core/context/bean/BeanStore;->registerBean(Ljava/lang/Object;)Lio/streamroot/dna/core/context/bean/BeanStore;

    .line 58
    :cond_1
    invoke-static {p0}, Lio/streamroot/dna/core/context/injection/InitialBeanInjectionKt;->registerManifestBean(Lio/streamroot/dna/core/context/bean/BeanStore;)V

    .line 59
    invoke-static {p0}, Lio/streamroot/dna/core/context/injection/InitialBeanInjectionKt;->registerOkHttpClientBean(Lio/streamroot/dna/core/context/bean/BeanStore;)V

    .line 60
    invoke-static {p0}, Lio/streamroot/dna/core/context/injection/InitialBeanInjectionKt;->registerProxyBean(Lio/streamroot/dna/core/context/bean/BeanStore;)V

    .line 61
    invoke-static {p0}, Lio/streamroot/dna/core/context/injection/InitialBeanInjectionKt;->registerDnaBehaviorService(Lio/streamroot/dna/core/context/bean/BeanStore;)V

    .line 62
    invoke-static {p0}, Lio/streamroot/dna/core/context/injection/InitialBeanInjectionKt;->registerAnalyticsService(Lio/streamroot/dna/core/context/bean/BeanStore;)V

    return-void
.end method

.method private static final registerManifestBean(Lio/streamroot/dna/core/context/bean/BeanStore;)V
    .locals 6

    .line 66
    const-class v0, Lio/streamroot/dna/core/js/CallExecutor;

    invoke-virtual {p0, v0}, Lio/streamroot/dna/core/context/bean/BeanStore;->getBean(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/streamroot/dna/core/js/CallExecutor;

    .line 67
    const-class v1, Lio/streamroot/dna/core/context/DnaCoroutineContext;

    invoke-virtual {p0, v1}, Lio/streamroot/dna/core/context/bean/BeanStore;->getBean(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/streamroot/dna/core/context/DnaCoroutineContext;

    .line 69
    new-instance v2, Lio/streamroot/dna/core/stream/ManifestHandler;

    check-cast v1, Lkotlin/coroutines/CoroutineContext;

    invoke-direct {v2, v1, v0}, Lio/streamroot/dna/core/stream/ManifestHandler;-><init>(Lkotlin/coroutines/CoroutineContext;Lio/streamroot/dna/core/js/CallExecutor;)V

    .line 70
    invoke-virtual {p0, v2}, Lio/streamroot/dna/core/context/bean/BeanStore;->registerBean(Ljava/lang/Object;)Lio/streamroot/dna/core/context/bean/BeanStore;

    .line 72
    invoke-virtual {p0}, Lio/streamroot/dna/core/context/bean/BeanStore;->getSessionInformation()Lio/streamroot/dna/core/context/config/SessionInformation;

    move-result-object v0

    invoke-virtual {v0}, Lio/streamroot/dna/core/context/config/SessionInformation;->getMedia()Lio/streamroot/dna/core/context/config/Media;

    move-result-object v0

    invoke-virtual {v0}, Lio/streamroot/dna/core/context/config/Media;->getFormat()Lio/streamroot/dna/core/context/config/StreamFormat;

    move-result-object v0

    sget-object v1, Lio/streamroot/dna/core/context/injection/InitialBeanInjectionKt$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Lio/streamroot/dna/core/context/config/StreamFormat;->ordinal()I

    move-result v0

    aget v0, v1, v0

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    .line 98
    :pswitch_0
    new-instance v0, Lio/streamroot/dna/core/stream/dash/DashManifestService;

    invoke-direct {v0, v2}, Lio/streamroot/dna/core/stream/dash/DashManifestService;-><init>(Lio/streamroot/dna/core/stream/ManifestHandler;)V

    .line 99
    invoke-virtual {p0, v0}, Lio/streamroot/dna/core/context/bean/BeanStore;->registerBean(Ljava/lang/Object;)Lio/streamroot/dna/core/context/bean/BeanStore;

    goto :goto_1

    .line 74
    :pswitch_1
    new-instance v0, Lio/streamroot/dna/core/stream/hls/AbsoluteUrlLineProcessor;

    invoke-direct {v0}, Lio/streamroot/dna/core/stream/hls/AbsoluteUrlLineProcessor;-><init>()V

    .line 75
    invoke-virtual {p0, v0}, Lio/streamroot/dna/core/context/bean/BeanStore;->registerBean(Ljava/lang/Object;)Lio/streamroot/dna/core/context/bean/BeanStore;

    .line 77
    new-instance v1, Lio/streamroot/dna/core/stream/hls/IgnoreLineProcessor;

    invoke-direct {v1}, Lio/streamroot/dna/core/stream/hls/IgnoreLineProcessor;-><init>()V

    .line 78
    invoke-virtual {p0, v1}, Lio/streamroot/dna/core/context/bean/BeanStore;->registerBean(Ljava/lang/Object;)Lio/streamroot/dna/core/context/bean/BeanStore;

    .line 80
    invoke-virtual {p0}, Lio/streamroot/dna/core/context/bean/BeanStore;->getSessionInformation()Lio/streamroot/dna/core/context/config/SessionInformation;

    move-result-object v3

    invoke-virtual {v3}, Lio/streamroot/dna/core/context/config/SessionInformation;->getMedia()Lio/streamroot/dna/core/context/config/Media;

    move-result-object v3

    invoke-virtual {v3}, Lio/streamroot/dna/core/context/config/Media;->getLatency()I

    move-result v3

    if-lez v3, :cond_0

    .line 81
    new-instance v3, Lio/streamroot/dna/core/stream/hls/PlaylistHeaderProcessor;

    move-object v4, v1

    check-cast v4, Lio/streamroot/dna/core/stream/hls/LineProcessor;

    invoke-virtual {p0}, Lio/streamroot/dna/core/context/bean/BeanStore;->getSessionInformation()Lio/streamroot/dna/core/context/config/SessionInformation;

    move-result-object v5

    invoke-virtual {v5}, Lio/streamroot/dna/core/context/config/SessionInformation;->getMedia()Lio/streamroot/dna/core/context/config/Media;

    move-result-object v5

    invoke-virtual {v5}, Lio/streamroot/dna/core/context/config/Media;->getLatency()I

    move-result v5

    invoke-direct {v3, v4, v5}, Lio/streamroot/dna/core/stream/hls/PlaylistHeaderProcessor;-><init>(Lio/streamroot/dna/core/stream/hls/LineProcessor;I)V

    .line 82
    invoke-virtual {p0, v3}, Lio/streamroot/dna/core/context/bean/BeanStore;->registerBean(Ljava/lang/Object;)Lio/streamroot/dna/core/context/bean/BeanStore;

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 88
    :goto_0
    new-instance v4, Lio/streamroot/dna/core/stream/hls/PlaylistManifestProcessor;

    check-cast v0, Lio/streamroot/dna/core/stream/hls/LineProcessor;

    invoke-direct {v4, v0, v3}, Lio/streamroot/dna/core/stream/hls/PlaylistManifestProcessor;-><init>(Lio/streamroot/dna/core/stream/hls/LineProcessor;Lio/streamroot/dna/core/stream/hls/PlaylistHeaderProcessor;)V

    .line 89
    invoke-virtual {p0, v4}, Lio/streamroot/dna/core/context/bean/BeanStore;->registerBean(Ljava/lang/Object;)Lio/streamroot/dna/core/context/bean/BeanStore;

    .line 91
    new-instance v3, Lio/streamroot/dna/core/stream/hls/MainManifestProcessor;

    check-cast v1, Lio/streamroot/dna/core/stream/hls/LineProcessor;

    invoke-direct {v3, v0, v1}, Lio/streamroot/dna/core/stream/hls/MainManifestProcessor;-><init>(Lio/streamroot/dna/core/stream/hls/LineProcessor;Lio/streamroot/dna/core/stream/hls/LineProcessor;)V

    .line 92
    invoke-virtual {p0, v3}, Lio/streamroot/dna/core/context/bean/BeanStore;->registerBean(Ljava/lang/Object;)Lio/streamroot/dna/core/context/bean/BeanStore;

    .line 94
    new-instance v0, Lio/streamroot/dna/core/stream/hls/HlsManifestService;

    check-cast v3, Lio/streamroot/dna/core/stream/hls/ManifestProcessor;

    check-cast v4, Lio/streamroot/dna/core/stream/hls/ManifestProcessor;

    invoke-direct {v0, v2, v3, v4}, Lio/streamroot/dna/core/stream/hls/HlsManifestService;-><init>(Lio/streamroot/dna/core/stream/ManifestHandler;Lio/streamroot/dna/core/stream/hls/ManifestProcessor;Lio/streamroot/dna/core/stream/hls/ManifestProcessor;)V

    .line 95
    invoke-virtual {p0, v0}, Lio/streamroot/dna/core/context/bean/BeanStore;->registerBean(Ljava/lang/Object;)Lio/streamroot/dna/core/context/bean/BeanStore;

    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static final registerOkHttpClientBean(Lio/streamroot/dna/core/context/bean/BeanStore;)V
    .locals 6

    .line 105
    const-class v0, Lio/streamroot/dna/core/http/bandwidth/TransferListener;

    invoke-virtual {p0, v0}, Lio/streamroot/dna/core/context/bean/BeanStore;->getOptionalBean(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/streamroot/dna/core/http/bandwidth/TransferListener;

    .line 107
    new-instance v1, Lokhttp3/OkHttpClient$Builder;

    invoke-direct {v1}, Lokhttp3/OkHttpClient$Builder;-><init>()V

    const/4 v2, 0x0

    .line 108
    invoke-virtual {v1, v2}, Lokhttp3/OkHttpClient$Builder;->retryOnConnectionFailure(Z)Lokhttp3/OkHttpClient$Builder;

    .line 109
    new-instance v3, Lio/streamroot/dna/core/utils/InMemoryCookieJar;

    invoke-direct {v3}, Lio/streamroot/dna/core/utils/InMemoryCookieJar;-><init>()V

    check-cast v3, Lokhttp3/CookieJar;

    invoke-virtual {v1, v3}, Lokhttp3/OkHttpClient$Builder;->cookieJar(Lokhttp3/CookieJar;)Lokhttp3/OkHttpClient$Builder;

    if-eqz v0, :cond_0

    .line 110
    new-instance v3, Lio/streamroot/dna/core/http/bandwidth/BandwidthNetworkInterceptor;

    invoke-virtual {p0}, Lio/streamroot/dna/core/context/bean/BeanStore;->getStateManager()Lio/streamroot/dna/core/context/state/StateManager;

    move-result-object v4

    invoke-virtual {p0}, Lio/streamroot/dna/core/context/bean/BeanStore;->getSessionInformation()Lio/streamroot/dna/core/context/config/SessionInformation;

    move-result-object v5

    invoke-virtual {v5}, Lio/streamroot/dna/core/context/config/SessionInformation;->getMedia()Lio/streamroot/dna/core/context/config/Media;

    move-result-object v5

    invoke-virtual {v5}, Lio/streamroot/dna/core/context/config/Media;->getFormat()Lio/streamroot/dna/core/context/config/StreamFormat;

    move-result-object v5

    invoke-direct {v3, v4, v0, v5}, Lio/streamroot/dna/core/http/bandwidth/BandwidthNetworkInterceptor;-><init>(Lio/streamroot/dna/core/context/state/StateManager;Lio/streamroot/dna/core/http/bandwidth/TransferListener;Lio/streamroot/dna/core/context/config/StreamFormat;)V

    check-cast v3, Lokhttp3/Interceptor;

    invoke-virtual {v1, v3}, Lokhttp3/OkHttpClient$Builder;->addNetworkInterceptor(Lokhttp3/Interceptor;)Lokhttp3/OkHttpClient$Builder;

    .line 111
    :cond_0
    invoke-virtual {v1}, Lokhttp3/OkHttpClient$Builder;->build()Lokhttp3/OkHttpClient;

    move-result-object v0

    const-string v1, "customerOkHttpClient"

    const-string v3, "customerOkHttpClient"

    .line 113
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v1, v0}, Lio/streamroot/dna/core/context/bean/BeanStore;->registerBean(Ljava/lang/String;Ljava/lang/Object;)Lio/streamroot/dna/core/context/bean/BeanStore;

    .line 115
    new-instance v0, Lokhttp3/OkHttpClient$Builder;

    invoke-direct {v0}, Lokhttp3/OkHttpClient$Builder;-><init>()V

    .line 116
    invoke-virtual {v0, v2}, Lokhttp3/OkHttpClient$Builder;->retryOnConnectionFailure(Z)Lokhttp3/OkHttpClient$Builder;

    move-result-object v0

    .line 117
    invoke-virtual {v0}, Lokhttp3/OkHttpClient$Builder;->build()Lokhttp3/OkHttpClient;

    move-result-object v0

    const-string v1, "backendOkHttpClient"

    const-string v2, "backendOkHttpClient"

    .line 118
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v1, v0}, Lio/streamroot/dna/core/context/bean/BeanStore;->registerBean(Ljava/lang/String;Ljava/lang/Object;)Lio/streamroot/dna/core/context/bean/BeanStore;

    return-void
.end method

.method private static final registerProxyBean(Lio/streamroot/dna/core/context/bean/BeanStore;)V
    .locals 13

    const-string v0, "customerOkHttpClient"

    .line 122
    invoke-virtual {p0, v0}, Lio/streamroot/dna/core/context/bean/BeanStore;->getBean(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lokhttp3/Call$Factory;

    .line 123
    const-class v0, Lio/streamroot/dna/core/context/DnaCoroutineContext;

    invoke-virtual {p0, v0}, Lio/streamroot/dna/core/context/bean/BeanStore;->getBean(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/streamroot/dna/core/context/DnaCoroutineContext;

    .line 124
    const-class v1, Lio/streamroot/dna/core/analytics/CdnAnalyticsReporter;

    invoke-virtual {p0, v1}, Lio/streamroot/dna/core/context/bean/BeanStore;->getBean(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/streamroot/dna/core/analytics/CdnAnalyticsReporter;

    .line 125
    const-class v3, Lio/streamroot/dna/core/error/ErrorAggregator;

    invoke-virtual {p0, v3}, Lio/streamroot/dna/core/context/bean/BeanStore;->getBean(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    move-object v9, v3

    check-cast v9, Lio/streamroot/dna/core/error/ErrorAggregator;

    .line 126
    const-class v3, Lio/streamroot/dna/core/js/CallExecutor;

    invoke-virtual {p0, v3}, Lio/streamroot/dna/core/context/bean/BeanStore;->getBean(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/streamroot/dna/core/js/CallExecutor;

    .line 127
    const-class v4, Lio/streamroot/dna/core/stream/ManifestService;

    invoke-virtual {p0, v4}, Lio/streamroot/dna/core/context/bean/BeanStore;->getBean(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/streamroot/dna/core/stream/ManifestService;

    .line 129
    invoke-virtual {p0}, Lio/streamroot/dna/core/context/bean/BeanStore;->getSessionInformation()Lio/streamroot/dna/core/context/config/SessionInformation;

    move-result-object v5

    invoke-virtual {v5}, Lio/streamroot/dna/core/context/config/SessionInformation;->getMedia()Lio/streamroot/dna/core/context/config/Media;

    move-result-object v5

    invoke-virtual {v5}, Lio/streamroot/dna/core/context/config/Media;->getOriginalUrl()Lokhttp3/HttpUrl;

    move-result-object v5

    invoke-virtual {v5}, Lokhttp3/HttpUrl;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lokhttp3/HttpUrl;->parse(Ljava/lang/String;)Lokhttp3/HttpUrl;

    move-result-object v5

    if-nez v5, :cond_0

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_0
    const-string v6, "HttpUrl.parse(beanStore.\u2026originalUrl.toString())!!"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 130
    new-instance v8, Lio/streamroot/dna/core/proxy/TargetUrlManager;

    invoke-direct {v8, v5}, Lio/streamroot/dna/core/proxy/TargetUrlManager;-><init>(Lokhttp3/HttpUrl;)V

    .line 131
    invoke-virtual {p0, v8}, Lio/streamroot/dna/core/context/bean/BeanStore;->registerBean(Ljava/lang/Object;)Lio/streamroot/dna/core/context/bean/BeanStore;

    .line 133
    new-instance v5, Lio/streamroot/dna/core/binary/SegmentCallBackStore;

    invoke-direct {v5}, Lio/streamroot/dna/core/binary/SegmentCallBackStore;-><init>()V

    .line 134
    invoke-virtual {p0, v5}, Lio/streamroot/dna/core/context/bean/BeanStore;->registerBean(Ljava/lang/Object;)Lio/streamroot/dna/core/context/bean/BeanStore;

    .line 136
    new-instance v10, Lio/streamroot/dna/core/binary/SegmentHandler;

    invoke-direct {v10, v3, v5}, Lio/streamroot/dna/core/binary/SegmentHandler;-><init>(Lio/streamroot/dna/core/js/CallExecutor;Lio/streamroot/dna/core/binary/SegmentCallBackStore;)V

    .line 137
    invoke-virtual {p0, v10}, Lio/streamroot/dna/core/context/bean/BeanStore;->registerBean(Ljava/lang/Object;)Lio/streamroot/dna/core/context/bean/BeanStore;

    .line 139
    new-instance v5, Lio/streamroot/dna/core/proxy/ProxyRequestFactory;

    invoke-direct {v5, v8}, Lio/streamroot/dna/core/proxy/ProxyRequestFactory;-><init>(Lio/streamroot/dna/core/proxy/TargetUrlManager;)V

    .line 140
    invoke-virtual {p0, v5}, Lio/streamroot/dna/core/context/bean/BeanStore;->registerBean(Ljava/lang/Object;)Lio/streamroot/dna/core/context/bean/BeanStore;

    .line 142
    new-instance v11, Lio/streamroot/dna/core/proxy/ProxyRequestForwarder;

    invoke-direct {v11, v1, v2, v5}, Lio/streamroot/dna/core/proxy/ProxyRequestForwarder;-><init>(Lio/streamroot/dna/core/analytics/CdnAnalyticsReporter;Lokhttp3/Call$Factory;Lio/streamroot/dna/core/proxy/ProxyRequestFactory;)V

    .line 143
    invoke-virtual {p0, v11}, Lio/streamroot/dna/core/context/bean/BeanStore;->registerBean(Ljava/lang/Object;)Lio/streamroot/dna/core/context/bean/BeanStore;

    .line 145
    new-instance v12, Lio/streamroot/dna/core/stream/ManifestProxyEndpoint;

    .line 151
    invoke-virtual {p0}, Lio/streamroot/dna/core/context/bean/BeanStore;->getSessionInformation()Lio/streamroot/dna/core/context/config/SessionInformation;

    move-result-object v1

    invoke-virtual {v1}, Lio/streamroot/dna/core/context/config/SessionInformation;->getMedia()Lio/streamroot/dna/core/context/config/Media;

    move-result-object v1

    invoke-virtual {v1}, Lio/streamroot/dna/core/context/config/Media;->getFormat()Lio/streamroot/dna/core/context/config/StreamFormat;

    move-result-object v7

    move-object v1, v12

    move-object v3, v4

    move-object v4, v5

    move-object v5, v8

    move-object v6, v9

    .line 145
    invoke-direct/range {v1 .. v7}, Lio/streamroot/dna/core/stream/ManifestProxyEndpoint;-><init>(Lokhttp3/Call$Factory;Lio/streamroot/dna/core/stream/ManifestService;Lio/streamroot/dna/core/proxy/ProxyRequestFactory;Lio/streamroot/dna/core/proxy/TargetUrlManager;Lio/streamroot/dna/core/error/ErrorAggregator;Lio/streamroot/dna/core/context/config/StreamFormat;)V

    .line 152
    invoke-virtual {p0, v12}, Lio/streamroot/dna/core/context/bean/BeanStore;->registerBean(Ljava/lang/Object;)Lio/streamroot/dna/core/context/bean/BeanStore;

    .line 154
    new-instance v1, Lio/streamroot/dna/core/binary/SegmentProxyEndpoint;

    .line 156
    invoke-virtual {p0}, Lio/streamroot/dna/core/context/bean/BeanStore;->getStateManager()Lio/streamroot/dna/core/context/state/StateManager;

    move-result-object v6

    .line 160
    invoke-virtual {p0}, Lio/streamroot/dna/core/context/bean/BeanStore;->getSessionInformation()Lio/streamroot/dna/core/context/config/SessionInformation;

    move-result-object v2

    invoke-virtual {v2}, Lio/streamroot/dna/core/context/config/SessionInformation;->getMedia()Lio/streamroot/dna/core/context/config/Media;

    move-result-object v2

    invoke-virtual {v2}, Lio/streamroot/dna/core/context/config/Media;->getFormat()Lio/streamroot/dna/core/context/config/StreamFormat;

    move-result-object v2

    move-object v4, v1

    move-object v5, v10

    move-object v7, v11

    move-object v10, v2

    .line 154
    invoke-direct/range {v4 .. v10}, Lio/streamroot/dna/core/binary/SegmentProxyEndpoint;-><init>(Lio/streamroot/dna/core/binary/SegmentHandler;Lio/streamroot/dna/core/context/state/StateManager;Lio/streamroot/dna/core/proxy/ProxyRequestForwarder;Lio/streamroot/dna/core/proxy/TargetUrlManager;Lio/streamroot/dna/core/error/ErrorAggregator;Lio/streamroot/dna/core/context/config/StreamFormat;)V

    .line 161
    invoke-virtual {p0, v1}, Lio/streamroot/dna/core/context/bean/BeanStore;->registerBean(Ljava/lang/Object;)Lio/streamroot/dna/core/context/bean/BeanStore;

    .line 163
    new-instance v2, Lio/streamroot/dna/core/proxy/server/WebServer;

    const/4 v3, 0x2

    .line 165
    new-array v3, v3, [Lio/streamroot/dna/core/proxy/ProxyEndpoint;

    const/4 v4, 0x0

    check-cast v1, Lio/streamroot/dna/core/proxy/ProxyEndpoint;

    aput-object v1, v3, v4

    const/4 v1, 0x1

    check-cast v12, Lio/streamroot/dna/core/proxy/ProxyEndpoint;

    aput-object v12, v3, v1

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->arrayListOf([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 166
    check-cast v0, Lkotlin/coroutines/CoroutineContext;

    .line 167
    invoke-virtual {p0}, Lio/streamroot/dna/core/context/bean/BeanStore;->getSessionInformation()Lio/streamroot/dna/core/context/config/SessionInformation;

    move-result-object v3

    invoke-virtual {v3}, Lio/streamroot/dna/core/context/config/SessionInformation;->getProxyPort()I

    move-result v3

    .line 163
    invoke-direct {v2, v11, v1, v0, v3}, Lio/streamroot/dna/core/proxy/server/WebServer;-><init>(Lio/streamroot/dna/core/proxy/ProxyRequestForwarder;Ljava/util/List;Lkotlin/coroutines/CoroutineContext;I)V

    .line 168
    invoke-virtual {p0, v2}, Lio/streamroot/dna/core/context/bean/BeanStore;->registerBean(Ljava/lang/Object;)Lio/streamroot/dna/core/context/bean/BeanStore;

    return-void
.end method
