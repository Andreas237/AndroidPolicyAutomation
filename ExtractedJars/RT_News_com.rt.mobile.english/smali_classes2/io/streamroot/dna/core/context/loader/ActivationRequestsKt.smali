.class public final Lio/streamroot/dna/core/context/loader/ActivationRequestsKt;
.super Ljava/lang/Object;
.source "ActivationRequests.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u00008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a+\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u001a \u0010\u000b\u001a\u00020\u000c2\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0002\u001a\u0018\u0010\u000f\u001a\u00020\u000c2\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\u001a \u0010\u0010\u001a\u00020\u000c2\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0002\u001a+\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u001a+\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u0014"
    }
    d2 = {
        "JSON",
        "Lokhttp3/MediaType;",
        "activatorRequest",
        "Lio/streamroot/dna/core/context/loader/ActivationRules;",
        "callFactory",
        "Lokhttp3/Call$Factory;",
        "backendUrl",
        "Lokhttp3/HttpUrl;",
        "sessionInformation",
        "Lio/streamroot/dna/core/context/config/SessionInformation;",
        "(Lokhttp3/Call$Factory;Lokhttp3/HttpUrl;Lio/streamroot/dna/core/context/config/SessionInformation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "buildActivationRequest",
        "Lokhttp3/Request;",
        "availabilityZone",
        "",
        "buildAvailabilityZoneRequest",
        "buildInjectedConfRequest",
        "injectedConfRequest",
        "Lio/streamroot/dna/core/context/loader/InjectedConf;",
        "routerRequest",
        "dna-core_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field private static final JSON:Lokhttp3/MediaType;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "application/json"

    .line 19
    invoke-static {v0}, Lokhttp3/MediaType;->parse(Ljava/lang/String;)Lokhttp3/MediaType;

    move-result-object v0

    sput-object v0, Lio/streamroot/dna/core/context/loader/ActivationRequestsKt;->JSON:Lokhttp3/MediaType;

    return-void
.end method

.method public static final synthetic access$buildActivationRequest(Lio/streamroot/dna/core/context/config/SessionInformation;Lokhttp3/HttpUrl;Ljava/lang/String;)Lokhttp3/Request;
    .locals 0
    .param p0    # Lio/streamroot/dna/core/context/config/SessionInformation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lokhttp3/HttpUrl;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    invoke-static {p0, p1, p2}, Lio/streamroot/dna/core/context/loader/ActivationRequestsKt;->buildActivationRequest(Lio/streamroot/dna/core/context/config/SessionInformation;Lokhttp3/HttpUrl;Ljava/lang/String;)Lokhttp3/Request;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$buildInjectedConfRequest(Lio/streamroot/dna/core/context/config/SessionInformation;Lokhttp3/HttpUrl;Ljava/lang/String;)Lokhttp3/Request;
    .locals 0
    .param p0    # Lio/streamroot/dna/core/context/config/SessionInformation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lokhttp3/HttpUrl;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    invoke-static {p0, p1, p2}, Lio/streamroot/dna/core/context/loader/ActivationRequestsKt;->buildInjectedConfRequest(Lio/streamroot/dna/core/context/config/SessionInformation;Lokhttp3/HttpUrl;Ljava/lang/String;)Lokhttp3/Request;

    move-result-object p0

    return-object p0
.end method

.method public static final activatorRequest(Lokhttp3/Call$Factory;Lokhttp3/HttpUrl;Lio/streamroot/dna/core/context/config/SessionInformation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 17
    .param p0    # Lokhttp3/Call$Factory;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lokhttp3/HttpUrl;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/streamroot/dna/core/context/config/SessionInformation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lokhttp3/Call$Factory;",
            "Lokhttp3/HttpUrl;",
            "Lio/streamroot/dna/core/context/config/SessionInformation;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lio/streamroot/dna/core/context/loader/ActivationRules;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-wide/16 v0, 0x2710

    const-wide/32 v2, 0x493e0

    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    const-wide v6, 0x4003333333333333L    # 2.4

    .line 61
    invoke-static/range {v0 .. v7}, Lio/streamroot/dna/core/http/circuitbreaker/SequencesKt;->endlessSequence(JJDD)Lkotlin/sequences/Sequence;

    move-result-object v10

    .line 62
    new-instance v0, Lio/streamroot/dna/core/context/loader/ActivationRequestsKt$activatorRequest$2;

    const/4 v1, 0x0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    invoke-direct {v0, v3, v2, v1}, Lio/streamroot/dna/core/context/loader/ActivationRequestsKt$activatorRequest$2;-><init>(Lio/streamroot/dna/core/context/config/SessionInformation;Lokhttp3/HttpUrl;Lkotlin/coroutines/Continuation;)V

    move-object v11, v0

    check-cast v11, Lkotlin/jvm/functions/Function2;

    .line 63
    new-instance v0, Lio/streamroot/dna/core/context/loader/ActivationRequestsKt$activatorRequest$3;

    invoke-direct {v0, v1}, Lio/streamroot/dna/core/context/loader/ActivationRequestsKt$activatorRequest$3;-><init>(Lkotlin/coroutines/Continuation;)V

    move-object v13, v0

    check-cast v13, Lkotlin/jvm/functions/Function2;

    const/4 v9, 0x0

    const/4 v12, 0x0

    const/16 v15, 0x12

    const/16 v16, 0x0

    move-object/from16 v8, p0

    move-object/from16 v14, p3

    .line 59
    invoke-static/range {v8 .. v16}, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt;->executeZonedHttpRequest$default(Lokhttp3/Call$Factory;ZLkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method private static final buildActivationRequest(Lio/streamroot/dna/core/context/config/SessionInformation;Lokhttp3/HttpUrl;Ljava/lang/String;)Lokhttp3/Request;
    .locals 4

    .line 87
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "osName"

    const-string v2, "android"

    .line 88
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "osVersion"

    .line 89
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "arch"

    .line 90
    sget-object v2, Landroid/os/Build;->CPU_ABI:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "model"

    .line 91
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x2d

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    sget-object v3, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "sdkVersion"

    const-string v2, "3.5.3"

    .line 92
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    .line 94
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    const-string v2, "streamrootKey"

    .line 95
    invoke-virtual {p0}, Lio/streamroot/dna/core/context/config/SessionInformation;->getStreamrootKey()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v1

    const-string v2, "bundleId"

    .line 96
    invoke-virtual {p0}, Lio/streamroot/dna/core/context/config/SessionInformation;->getBundleId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v1

    const-string v2, "property"

    .line 97
    invoke-virtual {p0}, Lio/streamroot/dna/core/context/config/SessionInformation;->getProperty()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v1

    const-string v2, "content"

    .line 98
    invoke-virtual {p0}, Lio/streamroot/dna/core/context/config/SessionInformation;->getMedia()Lio/streamroot/dna/core/context/config/Media;

    move-result-object p0

    invoke-virtual {p0}, Lio/streamroot/dna/core/context/config/Media;->getContentId()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, v2, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object p0

    const-string v1, "deviceInfo"

    .line 99
    invoke-virtual {p0, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object p0

    .line 100
    invoke-virtual {p0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "JSONObject()\n        .pu\u2026Info)\n        .toString()"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    .line 103
    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    aput-object p2, v0, v1

    const-string p2, "distributor/v1/config/native"

    const/4 v1, 0x1

    aput-object p2, v0, v1

    .line 102
    invoke-static {p1, v0}, Lio/streamroot/dna/core/utils/UrlsKt;->buildDnaDeliveryUrl(Lokhttp3/HttpUrl;[Ljava/lang/String;)Lokhttp3/HttpUrl;

    move-result-object p1

    .line 108
    new-instance p2, Lokhttp3/Request$Builder;

    invoke-direct {p2}, Lokhttp3/Request$Builder;-><init>()V

    .line 109
    sget-object v0, Lio/streamroot/dna/core/context/loader/ActivationRequestsKt;->JSON:Lokhttp3/MediaType;

    invoke-static {v0, p0}, Lokhttp3/RequestBody;->create(Lokhttp3/MediaType;Ljava/lang/String;)Lokhttp3/RequestBody;

    move-result-object p0

    invoke-virtual {p2, p0}, Lokhttp3/Request$Builder;->post(Lokhttp3/RequestBody;)Lokhttp3/Request$Builder;

    move-result-object p0

    .line 110
    invoke-virtual {p0, p1}, Lokhttp3/Request$Builder;->url(Lokhttp3/HttpUrl;)Lokhttp3/Request$Builder;

    move-result-object p0

    .line 111
    invoke-virtual {p0}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    move-result-object p0

    const-string p1, "Request\n        .Builder\u2026url(url)\n        .build()"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static final buildAvailabilityZoneRequest(Lio/streamroot/dna/core/context/config/SessionInformation;Lokhttp3/HttpUrl;)Lokhttp3/Request;
    .locals 3

    .line 44
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "streamrootKey"

    .line 45
    invoke-virtual {p0}, Lio/streamroot/dna/core/context/config/SessionInformation;->getStreamrootKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "content"

    .line 46
    invoke-virtual {p0}, Lio/streamroot/dna/core/context/config/SessionInformation;->getMedia()Lio/streamroot/dna/core/context/config/Media;

    move-result-object p0

    invoke-virtual {p0}, Lio/streamroot/dna/core/context/config/Media;->getContentId()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object p0

    .line 47
    invoke-virtual {p0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "JSONObject()\n        .pu\u2026ntId)\n        .toString()"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 49
    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "router/az"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {p1, v0}, Lio/streamroot/dna/core/utils/UrlsKt;->buildDnaDeliveryUrl(Lokhttp3/HttpUrl;[Ljava/lang/String;)Lokhttp3/HttpUrl;

    move-result-object p1

    .line 52
    new-instance v0, Lokhttp3/Request$Builder;

    invoke-direct {v0}, Lokhttp3/Request$Builder;-><init>()V

    .line 53
    sget-object v1, Lio/streamroot/dna/core/context/loader/ActivationRequestsKt;->JSON:Lokhttp3/MediaType;

    invoke-static {v1, p0}, Lokhttp3/RequestBody;->create(Lokhttp3/MediaType;Ljava/lang/String;)Lokhttp3/RequestBody;

    move-result-object p0

    invoke-virtual {v0, p0}, Lokhttp3/Request$Builder;->post(Lokhttp3/RequestBody;)Lokhttp3/Request$Builder;

    move-result-object p0

    .line 54
    invoke-virtual {p0, p1}, Lokhttp3/Request$Builder;->url(Lokhttp3/HttpUrl;)Lokhttp3/Request$Builder;

    move-result-object p0

    .line 55
    invoke-virtual {p0}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    move-result-object p0

    const-string p1, "Request\n        .Builder\u2026url(url)\n        .build()"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static final buildInjectedConfRequest(Lio/streamroot/dna/core/context/config/SessionInformation;Lokhttp3/HttpUrl;Ljava/lang/String;)Lokhttp3/Request;
    .locals 2

    .line 137
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "streamrootKey"

    .line 138
    invoke-virtual {p0}, Lio/streamroot/dna/core/context/config/SessionInformation;->getStreamrootKey()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object p0

    const-string v0, "paVersion"

    const-string v1, "5.7.0"

    .line 139
    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object p0

    const-string v0, "deviceFamily"

    const-string v1, "android"

    .line 140
    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object p0

    .line 141
    invoke-virtual {p0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "JSONObject()\n        .pu\u2026FORM)\n        .toString()"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    .line 144
    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    aput-object p2, v0, v1

    const-string p2, "distributor/v1/injectedConf"

    const/4 v1, 0x1

    aput-object p2, v0, v1

    .line 143
    invoke-static {p1, v0}, Lio/streamroot/dna/core/utils/UrlsKt;->buildDnaDeliveryUrl(Lokhttp3/HttpUrl;[Ljava/lang/String;)Lokhttp3/HttpUrl;

    move-result-object p1

    .line 149
    new-instance p2, Lokhttp3/Request$Builder;

    invoke-direct {p2}, Lokhttp3/Request$Builder;-><init>()V

    .line 150
    sget-object v0, Lio/streamroot/dna/core/context/loader/ActivationRequestsKt;->JSON:Lokhttp3/MediaType;

    invoke-static {v0, p0}, Lokhttp3/RequestBody;->create(Lokhttp3/MediaType;Ljava/lang/String;)Lokhttp3/RequestBody;

    move-result-object p0

    invoke-virtual {p2, p0}, Lokhttp3/Request$Builder;->post(Lokhttp3/RequestBody;)Lokhttp3/Request$Builder;

    move-result-object p0

    .line 151
    invoke-virtual {p0, p1}, Lokhttp3/Request$Builder;->url(Lokhttp3/HttpUrl;)Lokhttp3/Request$Builder;

    move-result-object p0

    .line 152
    invoke-virtual {p0}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    move-result-object p0

    const-string p1, "Request\n        .Builder\u2026url(url)\n        .build()"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final injectedConfRequest(Lokhttp3/Call$Factory;Lokhttp3/HttpUrl;Lio/streamroot/dna/core/context/config/SessionInformation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 17
    .param p0    # Lokhttp3/Call$Factory;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lokhttp3/HttpUrl;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/streamroot/dna/core/context/config/SessionInformation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lokhttp3/Call$Factory;",
            "Lokhttp3/HttpUrl;",
            "Lio/streamroot/dna/core/context/config/SessionInformation;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lio/streamroot/dna/core/context/loader/InjectedConf;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-wide/16 v0, 0x2710

    const-wide/32 v2, 0x493e0

    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    const-wide v6, 0x4003333333333333L    # 2.4

    .line 117
    invoke-static/range {v0 .. v7}, Lio/streamroot/dna/core/http/circuitbreaker/SequencesKt;->endlessSequence(JJDD)Lkotlin/sequences/Sequence;

    move-result-object v10

    .line 118
    new-instance v0, Lio/streamroot/dna/core/context/loader/ActivationRequestsKt$injectedConfRequest$2;

    const/4 v1, 0x0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    invoke-direct {v0, v3, v2, v1}, Lio/streamroot/dna/core/context/loader/ActivationRequestsKt$injectedConfRequest$2;-><init>(Lio/streamroot/dna/core/context/config/SessionInformation;Lokhttp3/HttpUrl;Lkotlin/coroutines/Continuation;)V

    move-object v11, v0

    check-cast v11, Lkotlin/jvm/functions/Function2;

    .line 119
    new-instance v0, Lio/streamroot/dna/core/context/loader/ActivationRequestsKt$injectedConfRequest$3;

    invoke-direct {v0, v1}, Lio/streamroot/dna/core/context/loader/ActivationRequestsKt$injectedConfRequest$3;-><init>(Lkotlin/coroutines/Continuation;)V

    move-object v13, v0

    check-cast v13, Lkotlin/jvm/functions/Function2;

    const/4 v9, 0x0

    const/4 v12, 0x0

    const/16 v15, 0x12

    const/16 v16, 0x0

    move-object/from16 v8, p0

    move-object/from16 v14, p3

    .line 115
    invoke-static/range {v8 .. v16}, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt;->executeZonedHttpRequest$default(Lokhttp3/Call$Factory;ZLkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public static final routerRequest(Lokhttp3/Call$Factory;Lokhttp3/HttpUrl;Lio/streamroot/dna/core/context/config/SessionInformation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .param p0    # Lokhttp3/Call$Factory;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lokhttp3/HttpUrl;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/streamroot/dna/core/context/config/SessionInformation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lokhttp3/Call$Factory;",
            "Lokhttp3/HttpUrl;",
            "Lio/streamroot/dna/core/context/config/SessionInformation;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-wide/16 v0, 0x2710

    const-wide/32 v2, 0x493e0

    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    const-wide v6, 0x4003333333333333L    # 2.4

    .line 24
    invoke-static/range {v0 .. v7}, Lio/streamroot/dna/core/http/circuitbreaker/SequencesKt;->endlessSequence(JJDD)Lkotlin/sequences/Sequence;

    move-result-object v0

    .line 25
    invoke-static {p2, p1}, Lio/streamroot/dna/core/context/loader/ActivationRequestsKt;->buildAvailabilityZoneRequest(Lio/streamroot/dna/core/context/config/SessionInformation;Lokhttp3/HttpUrl;)Lokhttp3/Request;

    move-result-object p1

    .line 26
    new-instance p2, Lio/streamroot/dna/core/context/loader/ActivationRequestsKt$routerRequest$2;

    const/4 v1, 0x0

    invoke-direct {p2, v1}, Lio/streamroot/dna/core/context/loader/ActivationRequestsKt$routerRequest$2;-><init>(Lkotlin/coroutines/Continuation;)V

    check-cast p2, Lkotlin/jvm/functions/Function2;

    .line 22
    invoke-static {p0, v0, p1, p2, p3}, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt;->executeHttpRequest(Lokhttp3/Call$Factory;Lkotlin/sequences/Sequence;Lokhttp3/Request;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
