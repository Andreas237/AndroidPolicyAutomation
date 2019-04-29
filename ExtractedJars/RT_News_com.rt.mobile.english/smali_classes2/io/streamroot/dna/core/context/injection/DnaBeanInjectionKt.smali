.class public final Lio/streamroot/dna/core/context/injection/DnaBeanInjectionKt;
.super Ljava/lang/Object;
.source "DnaBeanInjection.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0018\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\u0010\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0018\u0010\u0008\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u0018\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\u0010\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0010\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0018\u0010\u000c\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\u0010\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0010\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0018\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\u0018\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\u0018\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\u0018\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\u0018\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u00a8\u0006\u0014"
    }
    d2 = {
        "registerAnalyticsModuleBean",
        "",
        "beanStore",
        "Lio/streamroot/dna/core/context/bean/BeanStore;",
        "dnaConfiguration",
        "Lio/streamroot/dna/core/context/config/DnaConfiguration;",
        "registerAvailabilityZoneBean",
        "registerDataBean",
        "registerDnaBeans",
        "registerErrorFunnelBean",
        "registerHashBean",
        "registerHttpBean",
        "registerMediaWatcherBean",
        "registerMemoryServiceBean",
        "registerNetworkAnalyserBean",
        "registerPeerAgentBean",
        "registerPeerBean",
        "registerStore",
        "registerTrackerBean",
        "registerWatchDogBean",
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
.method public static final registerAnalyticsModuleBean(Lio/streamroot/dna/core/context/bean/BeanStore;Lio/streamroot/dna/core/context/config/DnaConfiguration;)V
    .locals 13
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

    const-string v0, "backendOkHttpClient"

    .line 169
    invoke-virtual {p0, v0}, Lio/streamroot/dna/core/context/bean/BeanStore;->getBean(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lokhttp3/Call$Factory;

    .line 170
    const-class v0, Lio/streamroot/dna/core/context/DnaCoroutineContext;

    invoke-virtual {p0, v0}, Lio/streamroot/dna/core/context/bean/BeanStore;->getBean(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/streamroot/dna/core/context/DnaCoroutineContext;

    .line 172
    invoke-static {}, Lio/streamroot/dna/core/context/config/Configurations;->getANALYTICS_RETRY_COUNT()Lio/streamroot/dna/core/context/config/Configuration;

    move-result-object v1

    invoke-virtual {p1, v1}, Lio/streamroot/dna/core/context/config/DnaConfiguration;->getNumericConfiguration(Lio/streamroot/dna/core/context/config/Configuration;)Ljava/lang/Number;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    .line 173
    invoke-static {}, Lio/streamroot/dna/core/context/config/Configurations;->getANALYTICS_RETRY_DELAY()Lio/streamroot/dna/core/context/config/Configuration;

    move-result-object v3

    invoke-virtual {p1, v3}, Lio/streamroot/dna/core/context/config/DnaConfiguration;->getNumericConfiguration(Lio/streamroot/dna/core/context/config/Configuration;)Ljava/lang/Number;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    move-result-wide v3

    .line 174
    const-class v5, Lio/streamroot/dna/core/analytics/AnalyticsReporter;

    invoke-virtual {p0, v5}, Lio/streamroot/dna/core/context/bean/BeanStore;->getBeans(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v10

    .line 176
    new-instance v12, Lio/streamroot/dna/core/analytics/AnalyticsModule;

    .line 178
    invoke-virtual {p1}, Lio/streamroot/dna/core/context/config/DnaConfiguration;->getInfrastructure()Lio/streamroot/dna/core/context/config/Infrastructure;

    move-result-object v5

    invoke-virtual {v5}, Lio/streamroot/dna/core/context/config/Infrastructure;->getKlaraUrl()Lokhttp3/HttpUrl;

    move-result-object v5

    .line 179
    invoke-static {v1, v3, v4}, Lio/streamroot/dna/core/http/circuitbreaker/SequencesKt;->countedSequence(IJ)Lkotlin/sequences/Sequence;

    move-result-object v4

    .line 180
    invoke-static {}, Lio/streamroot/dna/core/context/config/Configurations;->getSTATS_ANALYTICS_DELAY_IN_MS()Lio/streamroot/dna/core/context/config/Configuration;

    move-result-object v1

    invoke-virtual {p1, v1}, Lio/streamroot/dna/core/context/config/DnaConfiguration;->getNumericConfiguration(Lio/streamroot/dna/core/context/config/Configuration;)Ljava/lang/Number;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v6

    .line 181
    invoke-static {}, Lio/streamroot/dna/core/context/config/Configurations;->getCONTROL_ANALYTICS_DELAY_IN_MS()Lio/streamroot/dna/core/context/config/Configuration;

    move-result-object v1

    invoke-virtual {p1, v1}, Lio/streamroot/dna/core/context/config/DnaConfiguration;->getNumericConfiguration(Lio/streamroot/dna/core/context/config/Configuration;)Ljava/lang/Number;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v8

    .line 182
    check-cast v0, Lkotlin/coroutines/CoroutineContext;

    .line 184
    invoke-virtual {p1}, Lio/streamroot/dna/core/context/config/DnaConfiguration;->isQosTester()Z

    move-result v11

    move-object v1, v12

    move-object v3, v5

    move-wide v5, v6

    move-wide v7, v8

    move-object v9, v0

    .line 176
    invoke-direct/range {v1 .. v11}, Lio/streamroot/dna/core/analytics/AnalyticsModule;-><init>(Lokhttp3/Call$Factory;Lokhttp3/HttpUrl;Lkotlin/sequences/Sequence;JJLkotlin/coroutines/CoroutineContext;Ljava/util/List;Z)V

    .line 185
    invoke-virtual {p0, v12}, Lio/streamroot/dna/core/context/bean/BeanStore;->registerBean(Ljava/lang/Object;)Lio/streamroot/dna/core/context/bean/BeanStore;

    return-void
.end method

.method private static final registerAvailabilityZoneBean(Lio/streamroot/dna/core/context/bean/BeanStore;Lio/streamroot/dna/core/context/config/DnaConfiguration;)V
    .locals 14

    const-string v0, "backendOkHttpClient"

    .line 112
    invoke-virtual {p0, v0}, Lio/streamroot/dna/core/context/bean/BeanStore;->getBean(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lokhttp3/Call$Factory;

    .line 113
    const-class v0, Lio/streamroot/dna/core/context/DnaCoroutineContext;

    invoke-virtual {p0, v0}, Lio/streamroot/dna/core/context/bean/BeanStore;->getBean(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/streamroot/dna/core/context/DnaCoroutineContext;

    .line 115
    invoke-static {}, Lio/streamroot/dna/core/context/config/Configurations;->getAVAILABILITY_ZONE_RETRY_MIN_DELAY()Lio/streamroot/dna/core/context/config/Configuration;

    move-result-object v1

    invoke-virtual {p1, v1}, Lio/streamroot/dna/core/context/config/DnaConfiguration;->getNumericConfiguration(Lio/streamroot/dna/core/context/config/Configuration;)Ljava/lang/Number;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v3

    .line 116
    invoke-static {}, Lio/streamroot/dna/core/context/config/Configurations;->getAVAILABILITY_ZONE_RETRY_MAX_DELAY()Lio/streamroot/dna/core/context/config/Configuration;

    move-result-object v1

    invoke-virtual {p1, v1}, Lio/streamroot/dna/core/context/config/DnaConfiguration;->getNumericConfiguration(Lio/streamroot/dna/core/context/config/Configuration;)Ljava/lang/Number;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v5

    .line 117
    invoke-static {}, Lio/streamroot/dna/core/context/config/Configurations;->getAVAILABILITY_ZONE_RETRY_MIN_FACTOR()Lio/streamroot/dna/core/context/config/Configuration;

    move-result-object v1

    invoke-virtual {p1, v1}, Lio/streamroot/dna/core/context/config/DnaConfiguration;->getNumericConfiguration(Lio/streamroot/dna/core/context/config/Configuration;)Ljava/lang/Number;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v7

    .line 118
    invoke-static {}, Lio/streamroot/dna/core/context/config/Configurations;->getAVAILABILITY_ZONE_RETRY_MAX_FACTOR()Lio/streamroot/dna/core/context/config/Configuration;

    move-result-object v1

    invoke-virtual {p1, v1}, Lio/streamroot/dna/core/context/config/DnaConfiguration;->getNumericConfiguration(Lio/streamroot/dna/core/context/config/Configuration;)Ljava/lang/Number;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v9

    .line 119
    invoke-static {}, Lio/streamroot/dna/core/context/config/Configurations;->getAVAILABILITY_ZONE_REFRESH_TIME()Lio/streamroot/dna/core/context/config/Configuration;

    move-result-object v1

    invoke-virtual {p1, v1}, Lio/streamroot/dna/core/context/config/DnaConfiguration;->getNumericConfiguration(Lio/streamroot/dna/core/context/config/Configuration;)Ljava/lang/Number;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v11

    .line 121
    new-instance v13, Lio/streamroot/dna/core/backend/AvailabilityZoneRefresher;

    .line 124
    invoke-static/range {v3 .. v10}, Lio/streamroot/dna/core/http/circuitbreaker/SequencesKt;->endlessSequence(JJDD)Lkotlin/sequences/Sequence;

    move-result-object v5

    .line 125
    invoke-virtual {p1}, Lio/streamroot/dna/core/context/config/DnaConfiguration;->getInfrastructure()Lio/streamroot/dna/core/context/config/Infrastructure;

    move-result-object p1

    invoke-virtual {p1}, Lio/streamroot/dna/core/context/config/Infrastructure;->getBackendUrl()Lokhttp3/HttpUrl;

    move-result-object v6

    .line 126
    invoke-virtual {p0}, Lio/streamroot/dna/core/context/bean/BeanStore;->getSessionInformation()Lio/streamroot/dna/core/context/config/SessionInformation;

    move-result-object p1

    invoke-virtual {p1}, Lio/streamroot/dna/core/context/config/SessionInformation;->getStreamrootKey()Ljava/lang/String;

    move-result-object v7

    .line 127
    invoke-virtual {p0}, Lio/streamroot/dna/core/context/bean/BeanStore;->getSessionInformation()Lio/streamroot/dna/core/context/config/SessionInformation;

    move-result-object p1

    invoke-virtual {p1}, Lio/streamroot/dna/core/context/config/SessionInformation;->getMedia()Lio/streamroot/dna/core/context/config/Media;

    move-result-object p1

    invoke-virtual {p1}, Lio/streamroot/dna/core/context/config/Media;->getContentId()Ljava/lang/String;

    move-result-object v8

    .line 128
    move-object v9, v0

    check-cast v9, Lkotlin/coroutines/CoroutineContext;

    move-object v1, v13

    move-wide v3, v11

    .line 121
    invoke-direct/range {v1 .. v9}, Lio/streamroot/dna/core/backend/AvailabilityZoneRefresher;-><init>(Lokhttp3/Call$Factory;JLkotlin/sequences/Sequence;Lokhttp3/HttpUrl;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/CoroutineContext;)V

    .line 129
    invoke-virtual {p0, v13}, Lio/streamroot/dna/core/context/bean/BeanStore;->registerBean(Ljava/lang/Object;)Lio/streamroot/dna/core/context/bean/BeanStore;

    return-void
.end method

.method private static final registerDataBean(Lio/streamroot/dna/core/context/bean/BeanStore;)V
    .locals 6

    .line 220
    const-class v0, Lio/streamroot/dna/core/binary/store/BinaryDataStore;

    invoke-virtual {p0, v0}, Lio/streamroot/dna/core/context/bean/BeanStore;->getBean(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/streamroot/dna/core/binary/store/BinaryDataStore;

    .line 221
    const-class v1, Lio/streamroot/dna/core/binary/SegmentCallBackStore;

    invoke-virtual {p0, v1}, Lio/streamroot/dna/core/context/bean/BeanStore;->getBean(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/streamroot/dna/core/binary/SegmentCallBackStore;

    .line 222
    const-class v2, Lio/streamroot/dna/core/http/bandwidth/TransferListener;

    invoke-virtual {p0, v2}, Lio/streamroot/dna/core/context/bean/BeanStore;->getOptionalBean(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/streamroot/dna/core/http/bandwidth/TransferListener;

    .line 223
    const-class v3, Lio/streamroot/dna/core/binary/store/BinaryDataStore;

    invoke-virtual {p0, v3}, Lio/streamroot/dna/core/context/bean/BeanStore;->getBean(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/streamroot/dna/core/binary/store/BinaryDataStore;

    .line 224
    const-class v4, Lio/streamroot/dna/core/error/ErrorAggregator;

    invoke-virtual {p0, v4}, Lio/streamroot/dna/core/context/bean/BeanStore;->getBean(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/streamroot/dna/core/error/ErrorAggregator;

    .line 226
    new-instance v5, Lio/streamroot/dna/core/binary/SegmentProxyRequestInteractor;

    invoke-direct {v5, v3, v1, v4}, Lio/streamroot/dna/core/binary/SegmentProxyRequestInteractor;-><init>(Lio/streamroot/dna/core/binary/store/BinaryDataStore;Lio/streamroot/dna/core/binary/SegmentCallBackStore;Lio/streamroot/dna/core/error/ErrorAggregator;)V

    .line 227
    invoke-virtual {v5, v2}, Lio/streamroot/dna/core/binary/SegmentProxyRequestInteractor;->setTransferListener(Lio/streamroot/dna/core/http/bandwidth/TransferListener;)V

    .line 228
    invoke-virtual {p0, v5}, Lio/streamroot/dna/core/context/bean/BeanStore;->registerBean(Ljava/lang/Object;)Lio/streamroot/dna/core/context/bean/BeanStore;

    .line 230
    new-instance v1, Lio/streamroot/dna/core/binary/BinaryDataInteractor;

    invoke-direct {v1, v0, v4}, Lio/streamroot/dna/core/binary/BinaryDataInteractor;-><init>(Lio/streamroot/dna/core/binary/store/BinaryDataStore;Lio/streamroot/dna/core/error/ErrorAggregator;)V

    .line 231
    invoke-virtual {p0, v1}, Lio/streamroot/dna/core/context/bean/BeanStore;->registerBean(Ljava/lang/Object;)Lio/streamroot/dna/core/context/bean/BeanStore;

    return-void
.end method

.method public static final registerDnaBeans(Lio/streamroot/dna/core/context/bean/BeanStore;Lio/streamroot/dna/core/context/config/DnaConfiguration;)V
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

    .line 72
    invoke-static {p0, p1}, Lio/streamroot/dna/core/context/injection/DnaBeanInjectionKt;->registerStore(Lio/streamroot/dna/core/context/bean/BeanStore;Lio/streamroot/dna/core/context/config/DnaConfiguration;)V

    .line 74
    invoke-static {p0}, Lio/streamroot/dna/core/context/injection/DnaBeanInjectionKt;->registerMemoryServiceBean(Lio/streamroot/dna/core/context/bean/BeanStore;)V

    .line 75
    invoke-static {p0, p1}, Lio/streamroot/dna/core/context/injection/DnaBeanInjectionKt;->registerWatchDogBean(Lio/streamroot/dna/core/context/bean/BeanStore;Lio/streamroot/dna/core/context/config/DnaConfiguration;)V

    .line 77
    const-class v0, Lio/streamroot/dna/core/error/ErrorAggregator;

    invoke-virtual {p0, v0}, Lio/streamroot/dna/core/context/bean/BeanStore;->getBean(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/streamroot/dna/core/error/ErrorAggregator;

    .line 78
    new-instance v1, Lio/streamroot/dna/core/context/state/StateInteractor;

    invoke-virtual {p0}, Lio/streamroot/dna/core/context/bean/BeanStore;->getStateManager()Lio/streamroot/dna/core/context/state/StateManager;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lio/streamroot/dna/core/context/state/StateInteractor;-><init>(Lio/streamroot/dna/core/context/state/StateManager;Lio/streamroot/dna/core/error/ErrorAggregator;)V

    invoke-virtual {p0, v1}, Lio/streamroot/dna/core/context/bean/BeanStore;->registerBean(Ljava/lang/Object;)Lio/streamroot/dna/core/context/bean/BeanStore;

    .line 80
    new-instance v0, Lio/streamroot/dna/core/log/LoggerInteractor;

    invoke-direct {v0}, Lio/streamroot/dna/core/log/LoggerInteractor;-><init>()V

    invoke-virtual {p0, v0}, Lio/streamroot/dna/core/context/bean/BeanStore;->registerBean(Ljava/lang/Object;)Lio/streamroot/dna/core/context/bean/BeanStore;

    .line 82
    invoke-static {p0, p1}, Lio/streamroot/dna/core/context/injection/DnaBeanInjectionKt;->registerAvailabilityZoneBean(Lio/streamroot/dna/core/context/bean/BeanStore;Lio/streamroot/dna/core/context/config/DnaConfiguration;)V

    .line 83
    invoke-static {p0}, Lio/streamroot/dna/core/context/injection/DnaBeanInjectionKt;->registerNetworkAnalyserBean(Lio/streamroot/dna/core/context/bean/BeanStore;)V

    .line 84
    invoke-static {p0, p1}, Lio/streamroot/dna/core/context/injection/DnaBeanInjectionKt;->registerErrorFunnelBean(Lio/streamroot/dna/core/context/bean/BeanStore;Lio/streamroot/dna/core/context/config/DnaConfiguration;)V

    .line 85
    invoke-static {p0}, Lio/streamroot/dna/core/context/injection/DnaBeanInjectionKt;->registerDataBean(Lio/streamroot/dna/core/context/bean/BeanStore;)V

    .line 86
    invoke-static {p0}, Lio/streamroot/dna/core/context/injection/DnaBeanInjectionKt;->registerHashBean(Lio/streamroot/dna/core/context/bean/BeanStore;)V

    .line 87
    invoke-static {p0, p1}, Lio/streamroot/dna/core/context/injection/DnaBeanInjectionKt;->registerPeerBean(Lio/streamroot/dna/core/context/bean/BeanStore;Lio/streamroot/dna/core/context/config/DnaConfiguration;)V

    .line 88
    invoke-static {p0, p1}, Lio/streamroot/dna/core/context/injection/DnaBeanInjectionKt;->registerMediaWatcherBean(Lio/streamroot/dna/core/context/bean/BeanStore;Lio/streamroot/dna/core/context/config/DnaConfiguration;)V

    .line 89
    invoke-static {p0, p1}, Lio/streamroot/dna/core/context/injection/DnaBeanInjectionKt;->registerTrackerBean(Lio/streamroot/dna/core/context/bean/BeanStore;Lio/streamroot/dna/core/context/config/DnaConfiguration;)V

    .line 90
    invoke-static {p0}, Lio/streamroot/dna/core/context/injection/DnaBeanInjectionKt;->registerHttpBean(Lio/streamroot/dna/core/context/bean/BeanStore;)V

    .line 91
    invoke-static {p0, p1}, Lio/streamroot/dna/core/context/injection/DnaBeanInjectionKt;->registerPeerAgentBean(Lio/streamroot/dna/core/context/bean/BeanStore;Lio/streamroot/dna/core/context/config/DnaConfiguration;)V

    .line 93
    invoke-static {p0, p1}, Lio/streamroot/dna/core/context/injection/QosBeanInjectionKt;->registerQosModuleBean(Lio/streamroot/dna/core/context/bean/BeanStore;Lio/streamroot/dna/core/context/config/DnaConfiguration;)V

    .line 94
    invoke-static {p0, p1}, Lio/streamroot/dna/core/analytics/AnalyticsPayloadBeanFactoryKt;->registerSessionInformationBean(Lio/streamroot/dna/core/context/bean/BeanStore;Lio/streamroot/dna/core/context/config/DnaConfiguration;)V

    .line 95
    invoke-static {p0, p1}, Lio/streamroot/dna/core/context/injection/DnaBeanInjectionKt;->registerAnalyticsModuleBean(Lio/streamroot/dna/core/context/bean/BeanStore;Lio/streamroot/dna/core/context/config/DnaConfiguration;)V

    return-void
.end method

.method private static final registerErrorFunnelBean(Lio/streamroot/dna/core/context/bean/BeanStore;Lio/streamroot/dna/core/context/config/DnaConfiguration;)V
    .locals 7

    .line 189
    const-class v0, Lio/streamroot/dna/core/error/ErrorAggregator;

    invoke-virtual {p0, v0}, Lio/streamroot/dna/core/context/bean/BeanStore;->getBean(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/streamroot/dna/core/error/ErrorAggregator;

    .line 190
    invoke-virtual {p0}, Lio/streamroot/dna/core/context/bean/BeanStore;->getAndroidContext()Landroid/content/Context;

    move-result-object v1

    .line 192
    new-instance v2, Lio/streamroot/dna/core/error/ErrorInteractor;

    invoke-direct {v2, v0}, Lio/streamroot/dna/core/error/ErrorInteractor;-><init>(Lio/streamroot/dna/core/error/ErrorAggregator;)V

    .line 193
    invoke-virtual {p0, v2}, Lio/streamroot/dna/core/context/bean/BeanStore;->registerBean(Ljava/lang/Object;)Lio/streamroot/dna/core/context/bean/BeanStore;

    .line 195
    invoke-static {}, Lio/streamroot/dna/core/context/config/Configurations;->getERROR_FUNNEL_ENABLED()Lio/streamroot/dna/core/context/config/Configuration;

    move-result-object v2

    invoke-virtual {p1, v2}, Lio/streamroot/dna/core/context/config/DnaConfiguration;->getBooleanConfiguration(Lio/streamroot/dna/core/context/config/Configuration;)Z

    move-result v2

    if-eqz v2, :cond_1

    if-eqz v1, :cond_1

    .line 197
    invoke-static {}, Lio/streamroot/dna/core/context/config/Configurations;->getERROR_FUNNEL_SAMPLING_RATE()Lio/streamroot/dna/core/context/config/Configuration;

    move-result-object v2

    invoke-virtual {p1, v2}, Lio/streamroot/dna/core/context/config/DnaConfiguration;->getNumericConfiguration(Lio/streamroot/dna/core/context/config/Configuration;)Ljava/lang/Number;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v2

    .line 198
    invoke-static {}, Lio/streamroot/dna/core/context/config/Configurations;->getERROR_FUNNEL_UNCAUGHT_HANDLER()Lio/streamroot/dna/core/context/config/Configuration;

    move-result-object v4

    invoke-virtual {p1, v4}, Lio/streamroot/dna/core/context/config/DnaConfiguration;->getBooleanConfiguration(Lio/streamroot/dna/core/context/config/Configuration;)Z

    move-result v4

    const-string v5, "sentry-dsn"

    .line 199
    invoke-static {v1, v5}, Lio/streamroot/dna/core/utils/ContextExtensionKt;->loadProperty(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_0

    .line 200
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "?uncaught.handler.enabled="

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v4, "&sample.rate="

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 201
    new-instance v3, Lio/sentry/android/AndroidSentryClientFactory;

    invoke-direct {v3, v1}, Lio/sentry/android/AndroidSentryClientFactory;-><init>(Landroid/content/Context;)V

    check-cast v3, Lio/sentry/SentryClientFactory;

    invoke-static {v2, v3}, Lio/sentry/SentryClientFactory;->sentryClient(Ljava/lang/String;Lio/sentry/SentryClientFactory;)Lio/sentry/SentryClient;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 203
    invoke-virtual {v1}, Lio/sentry/SentryClient;->getContext()Lio/sentry/context/Context;

    move-result-object v2

    const-string v3, "sentryClient.context"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lio/sentry/event/UserBuilder;

    invoke-direct {v3}, Lio/sentry/event/UserBuilder;-><init>()V

    invoke-virtual {p0}, Lio/streamroot/dna/core/context/bean/BeanStore;->getSessionInformation()Lio/streamroot/dna/core/context/config/SessionInformation;

    move-result-object v4

    invoke-virtual {v4}, Lio/streamroot/dna/core/context/config/SessionInformation;->getStreamrootKey()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lio/sentry/event/UserBuilder;->setId(Ljava/lang/String;)Lio/sentry/event/UserBuilder;

    move-result-object v3

    invoke-virtual {v3}, Lio/sentry/event/UserBuilder;->build()Lio/sentry/event/User;

    move-result-object v3

    invoke-virtual {v2, v3}, Lio/sentry/context/Context;->setUser(Lio/sentry/event/User;)V

    const-string v2, "sdkVersion"

    const-string v3, "3.5.3"

    .line 204
    invoke-virtual {v1, v2, v3}, Lio/sentry/SentryClient;->addExtra(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v2, "peerAgentVersion"

    const-string v3, "5.7.0"

    .line 205
    invoke-virtual {v1, v2, v3}, Lio/sentry/SentryClient;->addExtra(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v2, "confLabel"

    .line 206
    invoke-virtual {p0}, Lio/streamroot/dna/core/context/bean/BeanStore;->getSessionInformation()Lio/streamroot/dna/core/context/config/SessionInformation;

    move-result-object v3

    invoke-virtual {v3}, Lio/streamroot/dna/core/context/config/SessionInformation;->getConfLabel()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lio/sentry/SentryClient;->addExtra(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v2, "backendUrl"

    .line 207
    invoke-virtual {p1}, Lio/streamroot/dna/core/context/config/DnaConfiguration;->getInfrastructure()Lio/streamroot/dna/core/context/config/Infrastructure;

    move-result-object p1

    invoke-virtual {p1}, Lio/streamroot/dna/core/context/config/Infrastructure;->getBackendUrl()Lokhttp3/HttpUrl;

    move-result-object p1

    invoke-virtual {v1, v2, p1}, Lio/sentry/SentryClient;->addExtra(Ljava/lang/String;Ljava/lang/Object;)V

    const-string p1, "contentUrl"

    .line 208
    invoke-virtual {p0}, Lio/streamroot/dna/core/context/bean/BeanStore;->getSessionInformation()Lio/streamroot/dna/core/context/config/SessionInformation;

    move-result-object v2

    invoke-virtual {v2}, Lio/streamroot/dna/core/context/config/SessionInformation;->getMedia()Lio/streamroot/dna/core/context/config/Media;

    move-result-object v2

    invoke-virtual {v2}, Lio/streamroot/dna/core/context/config/Media;->getOriginalUrl()Lokhttp3/HttpUrl;

    move-result-object v2

    invoke-virtual {v1, p1, v2}, Lio/sentry/SentryClient;->addExtra(Ljava/lang/String;Ljava/lang/Object;)V

    const-string p1, "contentId"

    .line 209
    invoke-virtual {p0}, Lio/streamroot/dna/core/context/bean/BeanStore;->getSessionInformation()Lio/streamroot/dna/core/context/config/SessionInformation;

    move-result-object v2

    invoke-virtual {v2}, Lio/streamroot/dna/core/context/config/SessionInformation;->getMedia()Lio/streamroot/dna/core/context/config/Media;

    move-result-object v2

    invoke-virtual {v2}, Lio/streamroot/dna/core/context/config/Media;->getContentId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, p1, v2}, Lio/sentry/SentryClient;->addExtra(Ljava/lang/String;Ljava/lang/Object;)V

    const-string p1, "latency"

    .line 210
    invoke-virtual {p0}, Lio/streamroot/dna/core/context/bean/BeanStore;->getSessionInformation()Lio/streamroot/dna/core/context/config/SessionInformation;

    move-result-object v2

    invoke-virtual {v2}, Lio/streamroot/dna/core/context/config/SessionInformation;->getMedia()Lio/streamroot/dna/core/context/config/Media;

    move-result-object v2

    invoke-virtual {v2}, Lio/streamroot/dna/core/context/config/Media;->getLatency()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, p1, v2}, Lio/sentry/SentryClient;->addExtra(Ljava/lang/String;Ljava/lang/Object;)V

    const-string p1, "property"

    .line 211
    invoke-virtual {p0}, Lio/streamroot/dna/core/context/bean/BeanStore;->getSessionInformation()Lio/streamroot/dna/core/context/config/SessionInformation;

    move-result-object v2

    invoke-virtual {v2}, Lio/streamroot/dna/core/context/config/SessionInformation;->getProperty()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, p1, v2}, Lio/sentry/SentryClient;->addExtra(Ljava/lang/String;Ljava/lang/Object;)V

    .line 212
    new-instance p1, Lio/streamroot/dna/core/error/SentryErrorFunnel;

    invoke-direct {p1, v1}, Lio/streamroot/dna/core/error/SentryErrorFunnel;-><init>(Lio/sentry/SentryClient;)V

    .line 213
    invoke-virtual {p0, p1}, Lio/streamroot/dna/core/context/bean/BeanStore;->registerBean(Ljava/lang/Object;)Lio/streamroot/dna/core/context/bean/BeanStore;

    .line 214
    check-cast p1, Lio/streamroot/dna/core/error/ErrorFunnel;

    invoke-virtual {v0, p1}, Lio/streamroot/dna/core/error/ErrorAggregator;->setErrorFunnel$dna_core_release(Lio/streamroot/dna/core/error/ErrorFunnel;)V

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    return-void
.end method

.method private static final registerHashBean(Lio/streamroot/dna/core/context/bean/BeanStore;)V
    .locals 9

    .line 258
    const-class v0, Lio/streamroot/dna/core/js/CallExecutor;

    invoke-virtual {p0, v0}, Lio/streamroot/dna/core/context/bean/BeanStore;->getBean(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/streamroot/dna/core/js/CallExecutor;

    .line 259
    const-class v1, Lio/streamroot/dna/core/binary/store/BinaryDataStore;

    invoke-virtual {p0, v1}, Lio/streamroot/dna/core/context/bean/BeanStore;->getBean(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lio/streamroot/dna/core/binary/store/BinaryDataStore;

    .line 260
    const-class v1, Lio/streamroot/dna/core/context/DnaCoroutineContext;

    invoke-virtual {p0, v1}, Lio/streamroot/dna/core/context/bean/BeanStore;->getBean(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/streamroot/dna/core/context/DnaCoroutineContext;

    .line 262
    new-instance v3, Lio/streamroot/dna/core/binary/hash/HashHandler;

    invoke-direct {v3, v0}, Lio/streamroot/dna/core/binary/hash/HashHandler;-><init>(Lio/streamroot/dna/core/js/CallExecutor;)V

    .line 263
    invoke-virtual {p0, v3}, Lio/streamroot/dna/core/context/bean/BeanStore;->registerBean(Ljava/lang/Object;)Lio/streamroot/dna/core/context/bean/BeanStore;

    .line 264
    new-instance v0, Lio/streamroot/dna/core/binary/hash/HashInteractor;

    move-object v5, v1

    check-cast v5, Lkotlin/coroutines/CoroutineContext;

    const/4 v6, 0x0

    const/16 v7, 0x8

    const/4 v8, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v8}, Lio/streamroot/dna/core/binary/hash/HashInteractor;-><init>(Lio/streamroot/dna/core/binary/hash/HashHandler;Lio/streamroot/dna/core/binary/store/BinaryDataStore;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineDispatcher;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0, v0}, Lio/streamroot/dna/core/context/bean/BeanStore;->registerBean(Ljava/lang/Object;)Lio/streamroot/dna/core/context/bean/BeanStore;

    return-void
.end method

.method private static final registerHttpBean(Lio/streamroot/dna/core/context/bean/BeanStore;)V
    .locals 9

    const-string v0, "customerOkHttpClient"

    .line 235
    invoke-virtual {p0, v0}, Lio/streamroot/dna/core/context/bean/BeanStore;->getBean(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lokhttp3/OkHttpClient;

    .line 236
    const-class v1, Lio/streamroot/dna/core/binary/store/BinaryDataStore;

    invoke-virtual {p0, v1}, Lio/streamroot/dna/core/context/bean/BeanStore;->getBean(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lio/streamroot/dna/core/binary/store/BinaryDataStore;

    .line 237
    const-class v1, Lio/streamroot/dna/core/js/CallExecutor;

    invoke-virtual {p0, v1}, Lio/streamroot/dna/core/context/bean/BeanStore;->getBean(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/streamroot/dna/core/js/CallExecutor;

    .line 238
    const-class v2, Lio/streamroot/dna/core/context/DnaCoroutineContext;

    invoke-virtual {p0, v2}, Lio/streamroot/dna/core/context/bean/BeanStore;->getBean(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/streamroot/dna/core/context/DnaCoroutineContext;

    .line 239
    const-class v3, Lio/streamroot/dna/core/binary/store/ChunkPool;

    invoke-virtual {p0, v3}, Lio/streamroot/dna/core/context/bean/BeanStore;->getBean(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    move-object v8, v3

    check-cast v8, Lio/streamroot/dna/core/binary/store/ChunkPool;

    .line 241
    new-instance v4, Lio/streamroot/dna/core/http/HttpRequestHandler;

    invoke-direct {v4, v1}, Lio/streamroot/dna/core/http/HttpRequestHandler;-><init>(Lio/streamroot/dna/core/js/CallExecutor;)V

    .line 242
    invoke-virtual {p0, v4}, Lio/streamroot/dna/core/context/bean/BeanStore;->registerBean(Ljava/lang/Object;)Lio/streamroot/dna/core/context/bean/BeanStore;

    .line 244
    new-instance v6, Lio/streamroot/dna/core/http/RequestFactory;

    invoke-direct {v6}, Lio/streamroot/dna/core/http/RequestFactory;-><init>()V

    .line 245
    invoke-virtual {p0, v6}, Lio/streamroot/dna/core/context/bean/BeanStore;->registerBean(Ljava/lang/Object;)Lio/streamroot/dna/core/context/bean/BeanStore;

    .line 247
    new-instance v1, Lio/streamroot/dna/core/http/HttpRequestInteractor;

    .line 248
    move-object v3, v0

    check-cast v3, Lokhttp3/Call$Factory;

    .line 252
    move-object v7, v2

    check-cast v7, Lkotlin/coroutines/CoroutineContext;

    move-object v2, v1

    .line 247
    invoke-direct/range {v2 .. v8}, Lio/streamroot/dna/core/http/HttpRequestInteractor;-><init>(Lokhttp3/Call$Factory;Lio/streamroot/dna/core/http/HttpRequestHandler;Lio/streamroot/dna/core/binary/store/BinaryDataStore;Lio/streamroot/dna/core/http/RequestFactory;Lkotlin/coroutines/CoroutineContext;Lio/streamroot/dna/core/binary/store/ChunkPool;)V

    .line 254
    invoke-virtual {p0, v1}, Lio/streamroot/dna/core/context/bean/BeanStore;->registerBean(Ljava/lang/Object;)Lio/streamroot/dna/core/context/bean/BeanStore;

    return-void
.end method

.method private static final registerMediaWatcherBean(Lio/streamroot/dna/core/context/bean/BeanStore;Lio/streamroot/dna/core/context/config/DnaConfiguration;)V
    .locals 7

    .line 318
    const-class v0, Lio/streamroot/dna/core/media/PlayerWrapper;

    invoke-virtual {p0, v0}, Lio/streamroot/dna/core/context/bean/BeanStore;->getBean(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lio/streamroot/dna/core/media/PlayerWrapper;

    .line 319
    const-class v0, Lio/streamroot/dna/core/js/CallExecutor;

    invoke-virtual {p0, v0}, Lio/streamroot/dna/core/context/bean/BeanStore;->getBean(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/streamroot/dna/core/js/CallExecutor;

    .line 320
    const-class v1, Lio/streamroot/dna/core/context/DnaCoroutineContext;

    invoke-virtual {p0, v1}, Lio/streamroot/dna/core/context/bean/BeanStore;->getBean(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/streamroot/dna/core/context/DnaCoroutineContext;

    .line 321
    invoke-static {}, Lio/streamroot/dna/core/context/config/Configurations;->getMEDIA_WATCHER_REFRESH_DELAY_IN_MS()Lio/streamroot/dna/core/context/config/Configuration;

    move-result-object v2

    invoke-virtual {p1, v2}, Lio/streamroot/dna/core/context/config/DnaConfiguration;->getNumericConfiguration(Lio/streamroot/dna/core/context/config/Configuration;)Ljava/lang/Number;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v5

    .line 323
    new-instance v3, Lio/streamroot/dna/core/media/MediaElementHandler;

    invoke-direct {v3, v0}, Lio/streamroot/dna/core/media/MediaElementHandler;-><init>(Lio/streamroot/dna/core/js/CallExecutor;)V

    .line 324
    invoke-virtual {p0, v3}, Lio/streamroot/dna/core/context/bean/BeanStore;->registerBean(Ljava/lang/Object;)Lio/streamroot/dna/core/context/bean/BeanStore;

    .line 326
    new-instance p1, Lio/streamroot/dna/core/media/MediaWatcher;

    move-object v2, v1

    check-cast v2, Lkotlin/coroutines/CoroutineContext;

    move-object v1, p1

    invoke-direct/range {v1 .. v6}, Lio/streamroot/dna/core/media/MediaWatcher;-><init>(Lkotlin/coroutines/CoroutineContext;Lio/streamroot/dna/core/media/MediaElementHandler;Lio/streamroot/dna/core/media/PlayerWrapper;J)V

    .line 327
    invoke-virtual {p0, p1}, Lio/streamroot/dna/core/context/bean/BeanStore;->registerBean(Ljava/lang/Object;)Lio/streamroot/dna/core/context/bean/BeanStore;

    return-void
.end method

.method public static final registerMemoryServiceBean(Lio/streamroot/dna/core/context/bean/BeanStore;)V
    .locals 4
    .param p0    # Lio/streamroot/dna/core/context/bean/BeanStore;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "beanStore"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 158
    invoke-virtual {p0}, Lio/streamroot/dna/core/context/bean/BeanStore;->getAndroidContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_0
    const-string v1, "activity"

    .line 159
    invoke-virtual {p0, v1}, Lio/streamroot/dna/core/context/bean/BeanStore;->getAndroidService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/ActivityManager;

    .line 161
    new-instance v2, Lio/streamroot/dna/core/system/MemoryService;

    invoke-static {v0}, Lio/streamroot/dna/core/utils/ContextExtensionKt;->isLowRamDevice(Landroid/content/Context;)Z

    move-result v3

    invoke-direct {v2, v3, v1}, Lio/streamroot/dna/core/system/MemoryService;-><init>(ZLandroid/app/ActivityManager;)V

    .line 162
    invoke-virtual {p0, v2}, Lio/streamroot/dna/core/context/bean/BeanStore;->registerBean(Ljava/lang/Object;)Lio/streamroot/dna/core/context/bean/BeanStore;

    .line 164
    new-instance v1, Lio/streamroot/dna/core/system/SystemInformationService;

    invoke-static {v0}, Lio/streamroot/dna/core/utils/ContextExtensionKt;->packageInfo(Landroid/content/Context;)Landroid/content/pm/PackageInfo;

    move-result-object v0

    invoke-direct {v1, v0}, Lio/streamroot/dna/core/system/SystemInformationService;-><init>(Landroid/content/pm/PackageInfo;)V

    .line 165
    invoke-virtual {p0, v1}, Lio/streamroot/dna/core/context/bean/BeanStore;->registerBean(Ljava/lang/Object;)Lio/streamroot/dna/core/context/bean/BeanStore;

    return-void
.end method

.method private static final registerNetworkAnalyserBean(Lio/streamroot/dna/core/context/bean/BeanStore;)V
    .locals 5

    .line 133
    const-class v0, Lio/streamroot/dna/core/js/CallExecutor;

    invoke-virtual {p0, v0}, Lio/streamroot/dna/core/context/bean/BeanStore;->getBean(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/streamroot/dna/core/js/CallExecutor;

    const-string v1, "connectivity"

    .line 134
    invoke-virtual {p0, v1}, Lio/streamroot/dna/core/context/bean/BeanStore;->getAndroidService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/net/ConnectivityManager;

    .line 136
    new-instance v2, Lio/streamroot/dna/core/transfer/NetworkTypeHandler;

    invoke-direct {v2, v0}, Lio/streamroot/dna/core/transfer/NetworkTypeHandler;-><init>(Lio/streamroot/dna/core/js/CallExecutor;)V

    .line 137
    invoke-virtual {p0, v2}, Lio/streamroot/dna/core/context/bean/BeanStore;->registerBean(Ljava/lang/Object;)Lio/streamroot/dna/core/context/bean/BeanStore;

    .line 139
    new-instance v0, Lio/streamroot/dna/core/transfer/NetworkTypeAnalyticsReporter;

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-direct {v0, v1, v3, v4, v3}, Lio/streamroot/dna/core/transfer/NetworkTypeAnalyticsReporter;-><init>(Landroid/net/ConnectivityManager;Lio/streamroot/dna/core/analytics/Timer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 140
    invoke-virtual {p0, v0}, Lio/streamroot/dna/core/context/bean/BeanStore;->registerBean(Ljava/lang/Object;)Lio/streamroot/dna/core/context/bean/BeanStore;

    .line 142
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x18

    if-lt v3, v4, :cond_0

    .line 143
    new-instance v3, Lio/streamroot/dna/core/transfer/NetworkBroadcastReceiverApi24AndHigher;

    invoke-direct {v3, v2, v0, v1}, Lio/streamroot/dna/core/transfer/NetworkBroadcastReceiverApi24AndHigher;-><init>(Lio/streamroot/dna/core/transfer/NetworkTypeHandler;Lio/streamroot/dna/core/transfer/NetworkTypeAnalyticsReporter;Landroid/net/ConnectivityManager;)V

    .line 147
    invoke-virtual {p0, v3}, Lio/streamroot/dna/core/context/bean/BeanStore;->registerBean(Ljava/lang/Object;)Lio/streamroot/dna/core/context/bean/BeanStore;

    goto :goto_0

    .line 149
    :cond_0
    new-instance v3, Lio/streamroot/dna/core/transfer/NetworkBroadcastReceiverApi19To23;

    invoke-direct {v3, v2, v0, v1}, Lio/streamroot/dna/core/transfer/NetworkBroadcastReceiverApi19To23;-><init>(Lio/streamroot/dna/core/transfer/NetworkTypeHandler;Lio/streamroot/dna/core/transfer/NetworkTypeAnalyticsReporter;Landroid/net/ConnectivityManager;)V

    .line 153
    invoke-virtual {p0, v3}, Lio/streamroot/dna/core/context/bean/BeanStore;->registerBean(Ljava/lang/Object;)Lio/streamroot/dna/core/context/bean/BeanStore;

    :goto_0
    return-void
.end method

.method private static final registerPeerAgentBean(Lio/streamroot/dna/core/context/bean/BeanStore;Lio/streamroot/dna/core/context/config/DnaConfiguration;)V
    .locals 9

    .line 381
    const-class v0, Lio/streamroot/dna/core/js/CallExecutor;

    invoke-virtual {p0, v0}, Lio/streamroot/dna/core/context/bean/BeanStore;->getBean(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lio/streamroot/dna/core/js/CallExecutor;

    .line 382
    const-class v0, Lio/streamroot/dna/core/js/PanamaInteractor;

    invoke-virtual {p0, v0}, Lio/streamroot/dna/core/context/bean/BeanStore;->getBeans(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v7

    .line 383
    const-class v0, Lio/streamroot/dna/core/media/MediaWatcher;

    invoke-virtual {p0, v0}, Lio/streamroot/dna/core/context/bean/BeanStore;->getBean(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lio/streamroot/dna/core/media/MediaWatcher;

    .line 384
    const-class v0, Lio/streamroot/dna/core/error/ErrorAggregator;

    invoke-virtual {p0, v0}, Lio/streamroot/dna/core/context/bean/BeanStore;->getBean(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lio/streamroot/dna/core/error/ErrorAggregator;

    .line 386
    const-class v0, Lio/streamroot/dna/core/analytics/AnalyticsHandler;

    invoke-virtual {p0, v0}, Lio/streamroot/dna/core/context/bean/BeanStore;->getBean(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/streamroot/dna/core/analytics/AnalyticsHandler;

    .line 387
    new-instance v1, Lio/streamroot/dna/core/analytics/PeerAgentAnalyticsReporter;

    invoke-direct {v1, v0}, Lio/streamroot/dna/core/analytics/PeerAgentAnalyticsReporter;-><init>(Lio/streamroot/dna/core/analytics/AnalyticsHandler;)V

    .line 388
    invoke-virtual {p0, v1}, Lio/streamroot/dna/core/context/bean/BeanStore;->registerBean(Ljava/lang/Object;)Lio/streamroot/dna/core/context/bean/BeanStore;

    .line 390
    new-instance v0, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter;

    .line 393
    invoke-virtual {p0}, Lio/streamroot/dna/core/context/bean/BeanStore;->getStateManager()Lio/streamroot/dna/core/context/state/StateManager;

    move-result-object v4

    .line 395
    invoke-virtual {p0}, Lio/streamroot/dna/core/context/bean/BeanStore;->getAndroidContext()Landroid/content/Context;

    move-result-object v6

    if-nez v6, :cond_0

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    .line 397
    :cond_0
    invoke-virtual {p1}, Lio/streamroot/dna/core/context/config/DnaConfiguration;->getPanamaConfiguration()Lorg/json/JSONObject;

    move-result-object v8

    move-object v1, v0

    .line 390
    invoke-direct/range {v1 .. v8}, Lio/streamroot/dna/core/js/WebViewJavaScriptInterpreter;-><init>(Lio/streamroot/dna/core/js/CallExecutor;Lio/streamroot/dna/core/media/MediaWatcher;Lio/streamroot/dna/core/context/state/StateManager;Lio/streamroot/dna/core/error/ErrorAggregator;Landroid/content/Context;Ljava/util/List;Lorg/json/JSONObject;)V

    .line 399
    invoke-virtual {p0, v0}, Lio/streamroot/dna/core/context/bean/BeanStore;->registerBean(Ljava/lang/Object;)Lio/streamroot/dna/core/context/bean/BeanStore;

    return-void
.end method

.method private static final registerPeerBean(Lio/streamroot/dna/core/context/bean/BeanStore;Lio/streamroot/dna/core/context/config/DnaConfiguration;)V
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "backendOkHttpClient"

    .line 268
    invoke-virtual {v0, v2}, Lio/streamroot/dna/core/context/bean/BeanStore;->getBean(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lokhttp3/OkHttpClient;

    .line 269
    const-class v3, Lio/streamroot/dna/core/js/CallExecutor;

    invoke-virtual {v0, v3}, Lio/streamroot/dna/core/context/bean/BeanStore;->getBean(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/streamroot/dna/core/js/CallExecutor;

    .line 270
    const-class v4, Lio/streamroot/dna/core/binary/store/BinaryDataStore;

    invoke-virtual {v0, v4}, Lio/streamroot/dna/core/context/bean/BeanStore;->getBean(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    move-object v8, v4

    check-cast v8, Lio/streamroot/dna/core/binary/store/BinaryDataStore;

    .line 271
    const-class v4, Lio/streamroot/dna/core/error/ErrorAggregator;

    invoke-virtual {v0, v4}, Lio/streamroot/dna/core/context/bean/BeanStore;->getBean(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/streamroot/dna/core/error/ErrorAggregator;

    .line 272
    const-class v5, Lio/streamroot/dna/core/context/DnaCoroutineContext;

    invoke-virtual {v0, v5}, Lio/streamroot/dna/core/context/bean/BeanStore;->getBean(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/streamroot/dna/core/context/DnaCoroutineContext;

    .line 273
    const-class v6, Lio/streamroot/dna/core/binary/store/ChunkPool;

    invoke-virtual {v0, v6}, Lio/streamroot/dna/core/context/bean/BeanStore;->getBean(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    move-object/from16 v18, v6

    check-cast v18, Lio/streamroot/dna/core/binary/store/ChunkPool;

    .line 275
    new-instance v11, Lio/streamroot/dna/core/peer/signaling/SignalingHandler;

    invoke-direct {v11, v3}, Lio/streamroot/dna/core/peer/signaling/SignalingHandler;-><init>(Lio/streamroot/dna/core/js/CallExecutor;)V

    .line 276
    invoke-virtual {v0, v11}, Lio/streamroot/dna/core/context/bean/BeanStore;->registerBean(Ljava/lang/Object;)Lio/streamroot/dna/core/context/bean/BeanStore;

    .line 278
    new-instance v6, Lio/streamroot/dna/core/peer/PeerConnectionHandler;

    invoke-direct {v6, v3}, Lio/streamroot/dna/core/peer/PeerConnectionHandler;-><init>(Lio/streamroot/dna/core/js/CallExecutor;)V

    .line 279
    invoke-virtual {v0, v6}, Lio/streamroot/dna/core/context/bean/BeanStore;->registerBean(Ljava/lang/Object;)Lio/streamroot/dna/core/context/bean/BeanStore;

    .line 281
    invoke-static {}, Lio/streamroot/dna/core/context/config/Configurations;->getSIGNALING_RETRY_MIN_DELAY()Lio/streamroot/dna/core/context/config/Configuration;

    move-result-object v3

    invoke-virtual {v1, v3}, Lio/streamroot/dna/core/context/config/DnaConfiguration;->getNumericConfiguration(Lio/streamroot/dna/core/context/config/Configuration;)Ljava/lang/Number;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    move-result-wide v19

    .line 282
    invoke-static {}, Lio/streamroot/dna/core/context/config/Configurations;->getSIGNALING_RETRY_MAX_DELAY()Lio/streamroot/dna/core/context/config/Configuration;

    move-result-object v3

    invoke-virtual {v1, v3}, Lio/streamroot/dna/core/context/config/DnaConfiguration;->getNumericConfiguration(Lio/streamroot/dna/core/context/config/Configuration;)Ljava/lang/Number;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    move-result-wide v21

    .line 283
    invoke-static {}, Lio/streamroot/dna/core/context/config/Configurations;->getSIGNALING_RETRY_MIN_FACTOR()Lio/streamroot/dna/core/context/config/Configuration;

    move-result-object v3

    invoke-virtual {v1, v3}, Lio/streamroot/dna/core/context/config/DnaConfiguration;->getNumericConfiguration(Lio/streamroot/dna/core/context/config/Configuration;)Ljava/lang/Number;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v23

    .line 284
    invoke-static {}, Lio/streamroot/dna/core/context/config/Configurations;->getSIGNALING_RETRY_MAX_FACTOR()Lio/streamroot/dna/core/context/config/Configuration;

    move-result-object v3

    invoke-virtual {v1, v3}, Lio/streamroot/dna/core/context/config/DnaConfiguration;->getNumericConfiguration(Lio/streamroot/dna/core/context/config/Configuration;)Ljava/lang/Number;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v25

    .line 285
    invoke-static {}, Lio/streamroot/dna/core/context/config/Configurations;->getENABLE_SDP_IPV6()Lio/streamroot/dna/core/context/config/Configuration;

    move-result-object v3

    invoke-virtual {v1, v3}, Lio/streamroot/dna/core/context/config/DnaConfiguration;->getBooleanConfiguration(Lio/streamroot/dna/core/context/config/Configuration;)Z

    move-result v3

    .line 287
    new-instance v7, Lio/streamroot/dna/core/peer/signaling/SdpEncoder;

    const/4 v9, 0x0

    const/4 v10, 0x1

    invoke-direct {v7, v9, v3, v10, v9}, Lio/streamroot/dna/core/peer/signaling/SdpEncoder;-><init>(Lio/streamroot/dna/core/utils/RandomService;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 288
    invoke-virtual {v0, v7}, Lio/streamroot/dna/core/context/bean/BeanStore;->registerBean(Ljava/lang/Object;)Lio/streamroot/dna/core/context/bean/BeanStore;

    .line 290
    new-instance v13, Lio/streamroot/dna/core/peer/signaling/MessageSerializer;

    invoke-direct {v13, v7}, Lio/streamroot/dna/core/peer/signaling/MessageSerializer;-><init>(Lio/streamroot/dna/core/peer/signaling/SdpEncoder;)V

    .line 291
    invoke-virtual {v0, v13}, Lio/streamroot/dna/core/context/bean/BeanStore;->registerBean(Ljava/lang/Object;)Lio/streamroot/dna/core/context/bean/BeanStore;

    .line 293
    new-instance v3, Lio/streamroot/dna/core/peer/signaling/SignalingConnectionFactory;

    .line 294
    move-object v10, v2

    check-cast v10, Lokhttp3/WebSocket$Factory;

    .line 298
    invoke-static/range {v19 .. v26}, Lio/streamroot/dna/core/http/circuitbreaker/SequencesKt;->endlessSequence(JJDD)Lkotlin/sequences/Sequence;

    move-result-object v14

    .line 299
    move-object v2, v5

    check-cast v2, Lkotlin/coroutines/CoroutineContext;

    .line 300
    invoke-virtual/range {p1 .. p1}, Lio/streamroot/dna/core/context/config/DnaConfiguration;->getInfrastructure()Lio/streamroot/dna/core/context/config/Infrastructure;

    move-result-object v5

    invoke-virtual {v5}, Lio/streamroot/dna/core/context/config/Infrastructure;->getBackendUrl()Lokhttp3/HttpUrl;

    move-result-object v16

    .line 301
    invoke-virtual/range {p1 .. p1}, Lio/streamroot/dna/core/context/config/DnaConfiguration;->getInfrastructure()Lio/streamroot/dna/core/context/config/Infrastructure;

    move-result-object v1

    invoke-virtual {v1}, Lio/streamroot/dna/core/context/config/Infrastructure;->getSignalingPath()Ljava/lang/String;

    move-result-object v17

    move-object v9, v3

    move-object v12, v4

    move-object v15, v2

    .line 293
    invoke-direct/range {v9 .. v17}, Lio/streamroot/dna/core/peer/signaling/SignalingConnectionFactory;-><init>(Lokhttp3/WebSocket$Factory;Lio/streamroot/dna/core/peer/signaling/SignalingHandler;Lio/streamroot/dna/core/error/ErrorAggregator;Lio/streamroot/dna/core/peer/signaling/MessageSerializer;Lkotlin/sequences/Sequence;Lkotlin/coroutines/CoroutineContext;Lokhttp3/HttpUrl;Ljava/lang/String;)V

    .line 302
    invoke-virtual {v0, v3}, Lio/streamroot/dna/core/context/bean/BeanStore;->registerBean(Ljava/lang/Object;)Lio/streamroot/dna/core/context/bean/BeanStore;

    .line 304
    new-instance v1, Lio/streamroot/dna/core/peer/PeerDataChannelPool;

    move-object v5, v1

    move-object v7, v3

    move-object v9, v4

    move-object v10, v2

    move-object/from16 v11, v18

    invoke-direct/range {v5 .. v11}, Lio/streamroot/dna/core/peer/PeerDataChannelPool;-><init>(Lio/streamroot/dna/core/peer/PeerConnectionHandler;Lio/streamroot/dna/core/peer/signaling/SignalingConnectionFactory;Lio/streamroot/dna/core/binary/store/BinaryDataStore;Lio/streamroot/dna/core/error/ErrorAggregator;Lkotlin/coroutines/CoroutineContext;Lio/streamroot/dna/core/binary/store/ChunkPool;)V

    .line 311
    invoke-virtual {v0, v1}, Lio/streamroot/dna/core/context/bean/BeanStore;->registerBean(Ljava/lang/Object;)Lio/streamroot/dna/core/context/bean/BeanStore;

    .line 313
    new-instance v2, Lio/streamroot/dna/core/peer/PeerConnectorInteractor;

    invoke-direct {v2, v1, v4}, Lio/streamroot/dna/core/peer/PeerConnectorInteractor;-><init>(Lio/streamroot/dna/core/peer/PeerDataChannelPool;Lio/streamroot/dna/core/error/ErrorAggregator;)V

    .line 314
    invoke-virtual {v0, v2}, Lio/streamroot/dna/core/context/bean/BeanStore;->registerBean(Ljava/lang/Object;)Lio/streamroot/dna/core/context/bean/BeanStore;

    return-void
.end method

.method private static final registerStore(Lio/streamroot/dna/core/context/bean/BeanStore;Lio/streamroot/dna/core/context/config/DnaConfiguration;)V
    .locals 6

    .line 99
    invoke-static {}, Lio/streamroot/dna/core/context/config/Configurations;->getCHUNK_DIRECT_ALLOCATION()Lio/streamroot/dna/core/context/config/Configuration;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/streamroot/dna/core/context/config/DnaConfiguration;->getBooleanConfiguration(Lio/streamroot/dna/core/context/config/Configuration;)Z

    move-result v0

    .line 100
    invoke-static {}, Lio/streamroot/dna/core/context/config/Configurations;->getCHUNK_SIZE()Lio/streamroot/dna/core/context/config/Configuration;

    move-result-object v1

    invoke-virtual {p1, v1}, Lio/streamroot/dna/core/context/config/DnaConfiguration;->getNumericConfiguration(Lio/streamroot/dna/core/context/config/Configuration;)Ljava/lang/Number;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    .line 101
    invoke-static {}, Lio/streamroot/dna/core/context/config/Configurations;->getCHUNK_RECYCLING_RATIO()Lio/streamroot/dna/core/context/config/Configuration;

    move-result-object v2

    invoke-virtual {p1, v2}, Lio/streamroot/dna/core/context/config/DnaConfiguration;->getNumericConfiguration(Lio/streamroot/dna/core/context/config/Configuration;)Ljava/lang/Number;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v2

    .line 102
    invoke-static {}, Lio/streamroot/dna/core/context/config/Configurations;->getP2P_CACHE_MAX_SIZE()Lio/streamroot/dna/core/context/config/Configuration;

    move-result-object v4

    invoke-virtual {p1, v4}, Lio/streamroot/dna/core/context/config/DnaConfiguration;->getNumericConfiguration(Lio/streamroot/dna/core/context/config/Configuration;)Ljava/lang/Number;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    .line 104
    div-int/2addr p1, v1

    int-to-double v4, p1

    mul-double/2addr v4, v2

    double-to-int p1, v4

    if-eqz v0, :cond_0

    .line 106
    new-instance v0, Lio/streamroot/dna/core/binary/store/DirectChunkPool;

    invoke-direct {v0, p1, v1}, Lio/streamroot/dna/core/binary/store/DirectChunkPool;-><init>(II)V

    :goto_0
    check-cast v0, Lio/streamroot/dna/core/binary/store/ChunkPool;

    goto :goto_1

    :cond_0
    new-instance v0, Lio/streamroot/dna/core/binary/store/HeapChunkPool;

    invoke-direct {v0, p1, v1}, Lio/streamroot/dna/core/binary/store/HeapChunkPool;-><init>(II)V

    goto :goto_0

    .line 107
    :goto_1
    invoke-virtual {p0, v0}, Lio/streamroot/dna/core/context/bean/BeanStore;->registerBean(Ljava/lang/Object;)Lio/streamroot/dna/core/context/bean/BeanStore;

    .line 108
    new-instance p1, Lio/streamroot/dna/core/binary/store/BinaryDataStore;

    invoke-direct {p1, v0}, Lio/streamroot/dna/core/binary/store/BinaryDataStore;-><init>(Lio/streamroot/dna/core/binary/store/ChunkPool;)V

    invoke-virtual {p0, p1}, Lio/streamroot/dna/core/context/bean/BeanStore;->registerBean(Ljava/lang/Object;)Lio/streamroot/dna/core/context/bean/BeanStore;

    return-void
.end method

.method private static final registerTrackerBean(Lio/streamroot/dna/core/context/bean/BeanStore;Lio/streamroot/dna/core/context/config/DnaConfiguration;)V
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "backendOkHttpClient"

    .line 358
    invoke-virtual {v0, v2}, Lio/streamroot/dna/core/context/bean/BeanStore;->getBean(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lokhttp3/OkHttpClient;

    .line 359
    const-class v3, Lio/streamroot/dna/core/js/CallExecutor;

    invoke-virtual {v0, v3}, Lio/streamroot/dna/core/context/bean/BeanStore;->getBean(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/streamroot/dna/core/js/CallExecutor;

    .line 360
    const-class v4, Lio/streamroot/dna/core/context/DnaCoroutineContext;

    invoke-virtual {v0, v4}, Lio/streamroot/dna/core/context/bean/BeanStore;->getBean(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/streamroot/dna/core/context/DnaCoroutineContext;

    .line 362
    invoke-static {}, Lio/streamroot/dna/core/context/config/Configurations;->getTRACKER_RETRY_MIN_DELAY()Lio/streamroot/dna/core/context/config/Configuration;

    move-result-object v5

    invoke-virtual {v1, v5}, Lio/streamroot/dna/core/context/config/DnaConfiguration;->getNumericConfiguration(Lio/streamroot/dna/core/context/config/Configuration;)Ljava/lang/Number;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    move-result-wide v6

    .line 363
    invoke-static {}, Lio/streamroot/dna/core/context/config/Configurations;->getTRACKER_RETRY_MAX_DELAY()Lio/streamroot/dna/core/context/config/Configuration;

    move-result-object v5

    invoke-virtual {v1, v5}, Lio/streamroot/dna/core/context/config/DnaConfiguration;->getNumericConfiguration(Lio/streamroot/dna/core/context/config/Configuration;)Ljava/lang/Number;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    move-result-wide v8

    .line 364
    invoke-static {}, Lio/streamroot/dna/core/context/config/Configurations;->getTRACKER_RETRY_MIN_FACTOR()Lio/streamroot/dna/core/context/config/Configuration;

    move-result-object v5

    invoke-virtual {v1, v5}, Lio/streamroot/dna/core/context/config/DnaConfiguration;->getNumericConfiguration(Lio/streamroot/dna/core/context/config/Configuration;)Ljava/lang/Number;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v10

    .line 365
    invoke-static {}, Lio/streamroot/dna/core/context/config/Configurations;->getTRACKER_RETRY_MAX_FACTOR()Lio/streamroot/dna/core/context/config/Configuration;

    move-result-object v5

    invoke-virtual {v1, v5}, Lio/streamroot/dna/core/context/config/DnaConfiguration;->getNumericConfiguration(Lio/streamroot/dna/core/context/config/Configuration;)Ljava/lang/Number;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v12

    .line 367
    new-instance v5, Lio/streamroot/dna/core/tracker/TrackerHandler;

    invoke-direct {v5, v3}, Lio/streamroot/dna/core/tracker/TrackerHandler;-><init>(Lio/streamroot/dna/core/js/CallExecutor;)V

    .line 368
    invoke-virtual {v0, v5}, Lio/streamroot/dna/core/context/bean/BeanStore;->registerBean(Ljava/lang/Object;)Lio/streamroot/dna/core/context/bean/BeanStore;

    .line 370
    new-instance v3, Lio/streamroot/dna/core/tracker/TrackerInteractor;

    .line 371
    move-object v15, v2

    check-cast v15, Lokhttp3/Call$Factory;

    .line 373
    invoke-static/range {v6 .. v13}, Lio/streamroot/dna/core/http/circuitbreaker/SequencesKt;->endlessSequence(JJDD)Lkotlin/sequences/Sequence;

    move-result-object v17

    .line 374
    move-object/from16 v18, v4

    check-cast v18, Lkotlin/coroutines/CoroutineContext;

    .line 375
    invoke-virtual/range {p1 .. p1}, Lio/streamroot/dna/core/context/config/DnaConfiguration;->getInfrastructure()Lio/streamroot/dna/core/context/config/Infrastructure;

    move-result-object v2

    invoke-virtual {v2}, Lio/streamroot/dna/core/context/config/Infrastructure;->getBackendUrl()Lokhttp3/HttpUrl;

    move-result-object v19

    .line 376
    invoke-virtual/range {p1 .. p1}, Lio/streamroot/dna/core/context/config/DnaConfiguration;->getInfrastructure()Lio/streamroot/dna/core/context/config/Infrastructure;

    move-result-object v1

    invoke-virtual {v1}, Lio/streamroot/dna/core/context/config/Infrastructure;->getTrackerPath()Ljava/lang/String;

    move-result-object v20

    move-object v14, v3

    move-object/from16 v16, v5

    .line 370
    invoke-direct/range {v14 .. v20}, Lio/streamroot/dna/core/tracker/TrackerInteractor;-><init>(Lokhttp3/Call$Factory;Lio/streamroot/dna/core/tracker/TrackerHandler;Lkotlin/sequences/Sequence;Lkotlin/coroutines/CoroutineContext;Lokhttp3/HttpUrl;Ljava/lang/String;)V

    .line 377
    invoke-virtual {v0, v3}, Lio/streamroot/dna/core/context/bean/BeanStore;->registerBean(Ljava/lang/Object;)Lio/streamroot/dna/core/context/bean/BeanStore;

    return-void
.end method

.method private static final registerWatchDogBean(Lio/streamroot/dna/core/context/bean/BeanStore;Lio/streamroot/dna/core/context/config/DnaConfiguration;)V
    .locals 12

    .line 331
    const-class v0, Lio/streamroot/dna/core/context/DnaCoroutineContext;

    invoke-virtual {p0, v0}, Lio/streamroot/dna/core/context/bean/BeanStore;->getBean(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/streamroot/dna/core/context/DnaCoroutineContext;

    .line 332
    const-class v1, Lio/streamroot/dna/core/js/CallExecutor;

    invoke-virtual {p0, v1}, Lio/streamroot/dna/core/context/bean/BeanStore;->getBean(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/streamroot/dna/core/js/CallExecutor;

    .line 333
    const-class v2, Lio/streamroot/dna/core/system/MemoryService;

    invoke-virtual {p0, v2}, Lio/streamroot/dna/core/context/bean/BeanStore;->getBean(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lio/streamroot/dna/core/system/MemoryService;

    .line 335
    invoke-static {}, Lio/streamroot/dna/core/context/config/Configurations;->getWATCHDOG_REFRESH_DELAY()Lio/streamroot/dna/core/context/config/Configuration;

    move-result-object v2

    invoke-virtual {p1, v2}, Lio/streamroot/dna/core/context/config/DnaConfiguration;->getNumericConfiguration(Lio/streamroot/dna/core/context/config/Configuration;)Ljava/lang/Number;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    move-result-wide v10

    .line 336
    invoke-static {}, Lio/streamroot/dna/core/context/config/Configurations;->getWATCHDOG_LOW_MEMORY_PERCENTAGE_THRESHOLD()Lio/streamroot/dna/core/context/config/Configuration;

    move-result-object v2

    invoke-virtual {p1, v2}, Lio/streamroot/dna/core/context/config/DnaConfiguration;->getNumericConfiguration(Lio/streamroot/dna/core/context/config/Configuration;)Ljava/lang/Number;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v5

    .line 337
    invoke-static {}, Lio/streamroot/dna/core/context/config/Configurations;->getWATCHDOG_HIGH_MEMORY_PERCENTAGE_THRESHOLD()Lio/streamroot/dna/core/context/config/Configuration;

    move-result-object v2

    invoke-virtual {p1, v2}, Lio/streamroot/dna/core/context/config/DnaConfiguration;->getNumericConfiguration(Lio/streamroot/dna/core/context/config/Configuration;)Ljava/lang/Number;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v7

    .line 339
    new-instance p1, Lio/streamroot/dna/core/monitoring/AdaptiveResourceHandler;

    invoke-direct {p1, v1}, Lio/streamroot/dna/core/monitoring/AdaptiveResourceHandler;-><init>(Lio/streamroot/dna/core/js/CallExecutor;)V

    .line 340
    invoke-virtual {p0, p1}, Lio/streamroot/dna/core/context/bean/BeanStore;->registerBean(Ljava/lang/Object;)Lio/streamroot/dna/core/context/bean/BeanStore;

    .line 342
    new-instance v1, Lio/streamroot/dna/core/monitoring/MemoryWatcher;

    move-object v3, v1

    invoke-direct/range {v3 .. v8}, Lio/streamroot/dna/core/monitoring/MemoryWatcher;-><init>(Lio/streamroot/dna/core/system/MemoryService;DD)V

    .line 346
    invoke-virtual {p0, v1}, Lio/streamroot/dna/core/context/bean/BeanStore;->registerBean(Ljava/lang/Object;)Lio/streamroot/dna/core/context/bean/BeanStore;

    .line 348
    new-instance v2, Lio/streamroot/dna/core/monitoring/Watchdog;

    .line 349
    invoke-virtual {p0}, Lio/streamroot/dna/core/context/bean/BeanStore;->getStateManager()Lio/streamroot/dna/core/context/state/StateManager;

    move-result-object v6

    const/4 v3, 0x1

    .line 351
    new-array v8, v3, [Lio/streamroot/dna/core/monitoring/Watcher;

    check-cast v1, Lio/streamroot/dna/core/monitoring/Watcher;

    const/4 v3, 0x0

    aput-object v1, v8, v3

    .line 352
    move-object v9, v0

    check-cast v9, Lkotlin/coroutines/CoroutineContext;

    move-object v5, v2

    move-object v7, p1

    .line 348
    invoke-direct/range {v5 .. v11}, Lio/streamroot/dna/core/monitoring/Watchdog;-><init>(Lio/streamroot/dna/core/context/state/StateManager;Lio/streamroot/dna/core/monitoring/AdaptiveResourceHandler;[Lio/streamroot/dna/core/monitoring/Watcher;Lkotlin/coroutines/CoroutineContext;J)V

    .line 354
    invoke-virtual {p0, v2}, Lio/streamroot/dna/core/context/bean/BeanStore;->registerBean(Ljava/lang/Object;)Lio/streamroot/dna/core/context/bean/BeanStore;

    return-void
.end method
