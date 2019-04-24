.class public final Lio/radar/sdk/api/ApiService;
.super Ljava/lang/Object;
.source "ApiService.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nApiService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApiService.kt\nio/radar/sdk/api/ApiService\n*L\n1#1,328:1\n*E\n"
.end annotation

.annotation runtime Lio/radar/shadow/javax/inject/Singleton;
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x2
    }
    d1 = {
        "\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0001\u0018\u00002\u00020\u0001BG\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012J$\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0014\u0010\u001d\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u001a0\u001eJ\u0008\u0010\u001f\u001a\u00020\u0018H\u0002J\u0008\u0010 \u001a\u00020\u0018H\u0002J\u0014\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\"H\u0002JB\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010$2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020&2\u0008\u0008\u0002\u0010(\u001a\u00020&2\n\u0008\u0002\u0010)\u001a\u0004\u0018\u00010\u0018H\u0002JL\u0010*\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020&2\u0006\u0010(\u001a\u00020&2\u0008\u0010,\u001a\u0004\u0018\u00010\u00182\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u001a0\u001eJ,\u0010.\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\u00182\u0008\u00100\u001a\u0004\u0018\u0001012\n\u0008\u0002\u00102\u001a\u0004\u0018\u00010\u0018R\u0014\u0010\u0013\u001a\u00020\u00148BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00063"
    }
    d2 = {
        "Lio/radar/sdk/api/ApiService;",
        "",
        "context",
        "Landroid/content/Context;",
        "identityRepository",
        "Lio/radar/sdk/internal/repository/IdentityRepository;",
        "optionsRepository",
        "Lio/radar/sdk/internal/repository/OptionsRepository;",
        "apiRepository",
        "Lio/radar/sdk/api/ApiClientRepository;",
        "configRepository",
        "Lio/radar/sdk/config/ConfigRepository;",
        "integrationHelper",
        "Lio/radar/sdk/util/IntegrationHelper;",
        "deviceHelper",
        "Lio/radar/sdk/util/DeviceHelper;",
        "queue",
        "Lcom/android/volley/RequestQueue;",
        "(Landroid/content/Context;Lio/radar/sdk/internal/repository/IdentityRepository;Lio/radar/sdk/internal/repository/OptionsRepository;Lio/radar/sdk/api/ApiClientRepository;Lio/radar/sdk/config/ConfigRepository;Lio/radar/sdk/util/IntegrationHelper;Lio/radar/sdk/util/DeviceHelper;Lcom/android/volley/RequestQueue;)V",
        "DEFAULT_RETRY_POLICY",
        "Lcom/android/volley/DefaultRetryPolicy;",
        "getDEFAULT_RETRY_POLICY",
        "()Lcom/android/volley/DefaultRetryPolicy;",
        "FACEBOOK_PLACES_HOST",
        "",
        "fetchPlaces",
        "",
        "location",
        "Landroid/location/Location;",
        "callback",
        "Lkotlin/Function1;",
        "getIdType",
        "getLookupId",
        "getLookupIdAndType",
        "Lkotlin/Pair;",
        "makeParams",
        "",
        "stopped",
        "",
        "foreground",
        "replayed",
        "facebookPlaces",
        "userUpsert",
        "publishableKey",
        "places",
        "Lio/radar/sdk/api/RadarResponse;",
        "verifyEvent",
        "eventId",
        "verification",
        "Lio/radar/sdk/model/RadarEvent$RadarEventVerification;",
        "placeId",
        "sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xb
    }
.end annotation


# instance fields
.field private final FACEBOOK_PLACES_HOST:Ljava/lang/String;

.field private final apiRepository:Lio/radar/sdk/api/ApiClientRepository;

.field private final configRepository:Lio/radar/sdk/config/ConfigRepository;

.field private final context:Landroid/content/Context;

.field private final deviceHelper:Lio/radar/sdk/util/DeviceHelper;

.field private final identityRepository:Lio/radar/sdk/internal/repository/IdentityRepository;

.field private final integrationHelper:Lio/radar/sdk/util/IntegrationHelper;

.field private final optionsRepository:Lio/radar/sdk/internal/repository/OptionsRepository;

.field private final queue:Lcom/android/volley/RequestQueue;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lio/radar/sdk/internal/repository/IdentityRepository;Lio/radar/sdk/internal/repository/OptionsRepository;Lio/radar/sdk/api/ApiClientRepository;Lio/radar/sdk/config/ConfigRepository;Lio/radar/sdk/util/IntegrationHelper;Lio/radar/sdk/util/DeviceHelper;Lcom/android/volley/RequestQueue;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/radar/sdk/internal/repository/IdentityRepository;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lio/radar/sdk/internal/repository/OptionsRepository;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lio/radar/sdk/api/ApiClientRepository;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lio/radar/sdk/config/ConfigRepository;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lio/radar/sdk/util/IntegrationHelper;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Lio/radar/sdk/util/DeviceHelper;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p8    # Lcom/android/volley/RequestQueue;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lio/radar/shadow/javax/inject/Inject;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "identityRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "optionsRepository"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "apiRepository"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configRepository"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "integrationHelper"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceHelper"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "queue"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/radar/sdk/api/ApiService;->context:Landroid/content/Context;

    iput-object p2, p0, Lio/radar/sdk/api/ApiService;->identityRepository:Lio/radar/sdk/internal/repository/IdentityRepository;

    iput-object p3, p0, Lio/radar/sdk/api/ApiService;->optionsRepository:Lio/radar/sdk/internal/repository/OptionsRepository;

    iput-object p4, p0, Lio/radar/sdk/api/ApiService;->apiRepository:Lio/radar/sdk/api/ApiClientRepository;

    iput-object p5, p0, Lio/radar/sdk/api/ApiService;->configRepository:Lio/radar/sdk/config/ConfigRepository;

    iput-object p6, p0, Lio/radar/sdk/api/ApiService;->integrationHelper:Lio/radar/sdk/util/IntegrationHelper;

    iput-object p7, p0, Lio/radar/sdk/api/ApiService;->deviceHelper:Lio/radar/sdk/util/DeviceHelper;

    iput-object p8, p0, Lio/radar/sdk/api/ApiService;->queue:Lcom/android/volley/RequestQueue;

    const-string p1, "https://graph.facebook.com"

    .line 53
    iput-object p1, p0, Lio/radar/sdk/api/ApiService;->FACEBOOK_PLACES_HOST:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic access$getApiRepository$p(Lio/radar/sdk/api/ApiService;)Lio/radar/sdk/api/ApiClientRepository;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 42
    iget-object p0, p0, Lio/radar/sdk/api/ApiService;->apiRepository:Lio/radar/sdk/api/ApiClientRepository;

    return-object p0
.end method

.method public static final synthetic access$getConfigRepository$p(Lio/radar/sdk/api/ApiService;)Lio/radar/sdk/config/ConfigRepository;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 42
    iget-object p0, p0, Lio/radar/sdk/api/ApiService;->configRepository:Lio/radar/sdk/config/ConfigRepository;

    return-object p0
.end method

.method public static final synthetic access$getIdentityRepository$p(Lio/radar/sdk/api/ApiService;)Lio/radar/sdk/internal/repository/IdentityRepository;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 42
    iget-object p0, p0, Lio/radar/sdk/api/ApiService;->identityRepository:Lio/radar/sdk/internal/repository/IdentityRepository;

    return-object p0
.end method

.method public static final synthetic access$getOptionsRepository$p(Lio/radar/sdk/api/ApiService;)Lio/radar/sdk/internal/repository/OptionsRepository;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 42
    iget-object p0, p0, Lio/radar/sdk/api/ApiService;->optionsRepository:Lio/radar/sdk/internal/repository/OptionsRepository;

    return-object p0
.end method

.method private final getDEFAULT_RETRY_POLICY()Lcom/android/volley/DefaultRetryPolicy;
    .locals 4

    .line 55
    new-instance v0, Lcom/android/volley/DefaultRetryPolicy;

    const/16 v1, 0x1388

    const/4 v2, 0x0

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-direct {v0, v1, v2, v3}, Lcom/android/volley/DefaultRetryPolicy;-><init>(IIF)V

    return-object v0
.end method

.method private final getIdType()Ljava/lang/String;
    .locals 1

    .line 305
    invoke-direct {p0}, Lio/radar/sdk/api/ApiService;->getLookupIdAndType()Lkotlin/Pair;

    move-result-object v0

    invoke-virtual {v0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method private final getLookupId()Ljava/lang/String;
    .locals 1

    .line 309
    invoke-direct {p0}, Lio/radar/sdk/api/ApiService;->getLookupIdAndType()Lkotlin/Pair;

    move-result-object v0

    invoke-virtual {v0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method private final getLookupIdAndType()Lkotlin/Pair;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 313
    iget-object v0, p0, Lio/radar/sdk/api/ApiService;->identityRepository:Lio/radar/sdk/internal/repository/IdentityRepository;

    invoke-virtual {v0}, Lio/radar/sdk/internal/repository/IdentityRepository;->getRadarId$sdk_release()Ljava/lang/String;

    move-result-object v0

    const-string v1, "_id"

    if-nez v0, :cond_1

    .line 317
    iget-object v0, p0, Lio/radar/sdk/api/ApiService;->identityRepository:Lio/radar/sdk/internal/repository/IdentityRepository;

    invoke-virtual {v0}, Lio/radar/sdk/internal/repository/IdentityRepository;->getUserId$sdk_release()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "userId"

    goto :goto_0

    .line 322
    :cond_0
    iget-object v0, p0, Lio/radar/sdk/api/ApiService;->deviceHelper:Lio/radar/sdk/util/DeviceHelper;

    iget-object v1, p0, Lio/radar/sdk/api/ApiService;->context:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lio/radar/sdk/util/DeviceHelper;->getDeviceId$sdk_release(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "deviceId"

    .line 326
    :cond_1
    :goto_0
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    return-object v0
.end method

.method private final makeParams(Landroid/location/Location;ZZZLjava/lang/String;)Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/location/Location;",
            "ZZZ",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 232
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "longitude"

    .line 234
    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "latitude"

    .line 235
    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "accuracy"

    .line 236
    invoke-virtual {p1}, Landroid/location/Location;->getAccuracy()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "altitude"

    .line 237
    invoke-virtual {p1}, Landroid/location/Location;->getAltitude()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "speed"

    .line 238
    invoke-virtual {p1}, Landroid/location/Location;->getSpeed()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "course"

    .line 239
    invoke-virtual {p1}, Landroid/location/Location;->getBearing()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-nez p3, :cond_0

    .line 240
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x11

    if-lt v1, v2, :cond_0

    .line 241
    invoke-virtual {p1}, Landroid/location/Location;->getElapsedRealtimeNanos()J

    move-result-wide v1

    const-string p1, "updatedAtMsDiff"

    .line 242
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    move-result-wide v3

    sub-long/2addr v3, v1

    const v1, 0xf4240

    int-to-long v1, v1

    div-long/2addr v3, v1

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    if-eqz p4, :cond_1

    const-string p1, "replayed"

    .line 246
    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p4

    invoke-virtual {v0, p1, p4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    const-string p1, "foreground"

    .line 250
    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    invoke-virtual {v0, p1, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "stopped"

    .line 251
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "deviceType"

    const-string p2, "Android"

    .line 254
    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "deviceMake"

    .line 255
    iget-object p2, p0, Lio/radar/sdk/api/ApiService;->deviceHelper:Lio/radar/sdk/util/DeviceHelper;

    invoke-virtual {p2}, Lio/radar/sdk/util/DeviceHelper;->getMake$sdk_release()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "deviceModel"

    .line 256
    iget-object p2, p0, Lio/radar/sdk/api/ApiService;->deviceHelper:Lio/radar/sdk/util/DeviceHelper;

    invoke-virtual {p2}, Lio/radar/sdk/util/DeviceHelper;->getModel$sdk_release()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "deviceOS"

    .line 257
    iget-object p2, p0, Lio/radar/sdk/api/ApiService;->deviceHelper:Lio/radar/sdk/util/DeviceHelper;

    invoke-virtual {p2}, Lio/radar/sdk/util/DeviceHelper;->getOs$sdk_release()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "country"

    .line 258
    iget-object p2, p0, Lio/radar/sdk/api/ApiService;->deviceHelper:Lio/radar/sdk/util/DeviceHelper;

    invoke-virtual {p2}, Lio/radar/sdk/util/DeviceHelper;->getCountry$sdk_release()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "timeZoneOffset"

    .line 259
    iget-object p2, p0, Lio/radar/sdk/api/ApiService;->deviceHelper:Lio/radar/sdk/util/DeviceHelper;

    invoke-virtual {p2}, Lio/radar/sdk/util/DeviceHelper;->getTimeZoneOffset$sdk_release()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "sdkVersion"

    .line 260
    iget-object p2, p0, Lio/radar/sdk/api/ApiService;->deviceHelper:Lio/radar/sdk/util/DeviceHelper;

    const-string p2, "2.1.3"

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "deviceId"

    .line 261
    iget-object p2, p0, Lio/radar/sdk/api/ApiService;->deviceHelper:Lio/radar/sdk/util/DeviceHelper;

    iget-object p3, p0, Lio/radar/sdk/api/ApiService;->context:Landroid/content/Context;

    invoke-virtual {p2, p3}, Lio/radar/sdk/util/DeviceHelper;->getDeviceId$sdk_release(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 264
    iget-object p1, p0, Lio/radar/sdk/api/ApiService;->identityRepository:Lio/radar/sdk/internal/repository/IdentityRepository;

    invoke-virtual {p1}, Lio/radar/sdk/internal/repository/IdentityRepository;->getUserId$sdk_release()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    const-string p2, "userId"

    .line 265
    invoke-virtual {v0, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 267
    :cond_2
    iget-object p1, p0, Lio/radar/sdk/api/ApiService;->identityRepository:Lio/radar/sdk/internal/repository/IdentityRepository;

    invoke-virtual {p1}, Lio/radar/sdk/internal/repository/IdentityRepository;->getUserDescription$sdk_release()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_3

    const-string p2, "description"

    .line 268
    invoke-virtual {v0, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 270
    :cond_3
    iget-object p1, p0, Lio/radar/sdk/api/ApiService;->identityRepository:Lio/radar/sdk/internal/repository/IdentityRepository;

    invoke-virtual {p1}, Lio/radar/sdk/internal/repository/IdentityRepository;->getUserMetadata$sdk_release()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_4

    const-string p2, "metadata"

    .line 271
    invoke-virtual {v0, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    const-string p1, "idType"

    .line 274
    invoke-direct {p0}, Lio/radar/sdk/api/ApiService;->getIdType()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 276
    iget-object p1, p0, Lio/radar/sdk/api/ApiService;->apiRepository:Lio/radar/sdk/api/ApiClientRepository;

    invoke-virtual {p1}, Lio/radar/sdk/api/ApiClientRepository;->getAdId$sdk_release()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_5

    const-string p2, "adId"

    .line 277
    invoke-virtual {v0, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    if-eqz p5, :cond_6

    const-string p1, "facebookPlaces"

    .line 282
    invoke-virtual {v0, p1, p5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 285
    :cond_6
    iget-object p1, p0, Lio/radar/sdk/api/ApiService;->optionsRepository:Lio/radar/sdk/internal/repository/OptionsRepository;

    invoke-virtual {p1}, Lio/radar/sdk/internal/repository/OptionsRepository;->getPlacesProvider$sdk_release()Lio/radar/sdk/Radar$RadarPlacesProvider;

    move-result-object p1

    sget-object p2, Lio/radar/sdk/Radar$RadarPlacesProvider;->FACEBOOK:Lio/radar/sdk/Radar$RadarPlacesProvider;

    if-ne p1, p2, :cond_7

    const-string p1, "placesProvider"

    const-string p2, "facebook"

    .line 286
    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    const-string p1, "facebookVersion"

    .line 288
    iget-object p2, p0, Lio/radar/sdk/api/ApiService;->configRepository:Lio/radar/sdk/config/ConfigRepository;

    invoke-virtual {p2}, Lio/radar/sdk/config/ConfigRepository;->getFacebookApiVersion$sdk_release()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 291
    iget-object p1, p0, Lio/radar/sdk/api/ApiService;->integrationHelper:Lio/radar/sdk/util/IntegrationHelper;

    invoke-virtual {p1}, Lio/radar/sdk/util/IntegrationHelper;->getUrbanAirshipChannelId()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_8

    const-string p2, "uaChannelId"

    .line 292
    invoke-virtual {v0, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "uaSessionId"

    const-string p2, "radar"

    .line 293
    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 295
    :cond_8
    iget-object p1, p0, Lio/radar/sdk/api/ApiService;->integrationHelper:Lio/radar/sdk/util/IntegrationHelper;

    invoke-virtual {p1}, Lio/radar/sdk/util/IntegrationHelper;->getUrbanAirshipNamedUserId()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_9

    const-string p2, "uaNamedUserId"

    .line 296
    invoke-virtual {v0, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 298
    :cond_9
    iget-object p1, p0, Lio/radar/sdk/api/ApiService;->integrationHelper:Lio/radar/sdk/util/IntegrationHelper;

    invoke-virtual {p1}, Lio/radar/sdk/util/IntegrationHelper;->getUrbanAirshipSessionId()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_a

    const-string p2, "uaSessionId"

    .line 299
    invoke-virtual {v0, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 232
    :cond_a
    check-cast v0, Ljava/util/Map;

    return-object v0
.end method


# virtual methods
.method public final fetchPlaces(Landroid/location/Location;Lkotlin/jvm/functions/Function1;)V
    .locals 12
    .param p1    # Landroid/location/Location;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/location/Location;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "location"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 137
    iget-object v0, p0, Lio/radar/sdk/api/ApiService;->optionsRepository:Lio/radar/sdk/internal/repository/OptionsRepository;

    invoke-virtual {v0}, Lio/radar/sdk/internal/repository/OptionsRepository;->getPlacesProvider$sdk_release()Lio/radar/sdk/Radar$RadarPlacesProvider;

    move-result-object v0

    sget-object v1, Lio/radar/sdk/Radar$RadarPlacesProvider;->FACEBOOK:Lio/radar/sdk/Radar$RadarPlacesProvider;

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    .line 138
    invoke-interface {p2, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 141
    :cond_0
    iget-object v0, p0, Lio/radar/sdk/api/ApiService;->integrationHelper:Lio/radar/sdk/util/IntegrationHelper;

    invoke-virtual {v0}, Lio/radar/sdk/util/IntegrationHelper;->getFacebookAccessToken()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 143
    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    .line 144
    iget-object v3, p0, Lio/radar/sdk/api/ApiService;->apiRepository:Lio/radar/sdk/api/ApiClientRepository;

    invoke-virtual {v3}, Lio/radar/sdk/api/ApiClientRepository;->getPlacesLimitAt$sdk_release()Ljava/util/Date;

    move-result-object v3

    const/4 v4, 0x2

    if-eqz v3, :cond_2

    .line 146
    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v5

    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v7

    sub-long/2addr v5, v7

    const-wide/32 v7, 0x5265c00

    cmp-long v1, v5, v7

    if-gez v1, :cond_1

    .line 148
    sget-object p1, Lio/radar/sdk/internal/RadarLogger;->INSTANCE:Lio/radar/sdk/internal/RadarLogger;

    const-string v0, "Skipping places request, Facebook backoff in effect"

    invoke-static {p1, v0, v2, v4, v2}, Lio/radar/sdk/internal/RadarLogger;->d$default(Lio/radar/sdk/internal/RadarLogger;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 149
    invoke-interface {p2, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 152
    :cond_1
    iget-object v1, p0, Lio/radar/sdk/api/ApiService;->apiRepository:Lio/radar/sdk/api/ApiClientRepository;

    move-object v3, v2

    check-cast v3, Ljava/util/Date;

    invoke-virtual {v1, v3}, Lio/radar/sdk/api/ApiClientRepository;->setPlacesLimitAt$sdk_release(Ljava/util/Date;)V

    .line 156
    :cond_2
    iget-object v1, p0, Lio/radar/sdk/api/ApiService;->configRepository:Lio/radar/sdk/config/ConfigRepository;

    invoke-virtual {v1}, Lio/radar/sdk/config/ConfigRepository;->getFacebookApiVersion$sdk_release()Ljava/lang/String;

    move-result-object v1

    .line 157
    iget-object v3, p0, Lio/radar/sdk/api/ApiService;->configRepository:Lio/radar/sdk/config/ConfigRepository;

    invoke-virtual {v3}, Lio/radar/sdk/config/ConfigRepository;->getFacebookPlacesFields$sdk_release()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_3

    goto :goto_0

    :cond_3
    const-string v3, "confidence_level,category_list,website,name,single_line_address,location,checkins"

    .line 159
    :goto_0
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v6, p0, Lio/radar/sdk/api/ApiService;->FACEBOOK_PLACES_HOST:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "/v"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/current_place/results?coordinates={"

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\"latitude\":"

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v6

    invoke-virtual {v5, v6, v7}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const/16 v1, 0x2c

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v6, "\"longitude\":"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v6

    invoke-virtual {v5, v6, v7}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, "\"accuracy\":"

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    invoke-virtual {p1}, Landroid/location/Location;->getAccuracy()F

    move-result p1

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const/16 p1, 0x7d

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string p1, "&summary=tracking&limit=10&fields="

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "&access_token="

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 165
    new-instance p1, Lcom/android/volley/toolbox/JsonObjectRequest;

    const/4 v7, 0x0

    const/4 v9, 0x0

    .line 167
    new-instance v0, Lio/radar/sdk/api/ApiService$fetchPlaces$request$1;

    invoke-direct {v0, p2}, Lio/radar/sdk/api/ApiService$fetchPlaces$request$1;-><init>(Lkotlin/jvm/functions/Function1;)V

    move-object v10, v0

    check-cast v10, Lcom/android/volley/Response$Listener;

    .line 170
    new-instance v0, Lio/radar/sdk/api/ApiService$fetchPlaces$request$2;

    invoke-direct {v0, p0, p2}, Lio/radar/sdk/api/ApiService$fetchPlaces$request$2;-><init>(Lio/radar/sdk/api/ApiService;Lkotlin/jvm/functions/Function1;)V

    move-object v11, v0

    check-cast v11, Lcom/android/volley/Response$ErrorListener;

    move-object v6, p1

    .line 165
    invoke-direct/range {v6 .. v11}, Lcom/android/volley/toolbox/JsonObjectRequest;-><init>(ILjava/lang/String;Lorg/json/JSONObject;Lcom/android/volley/Response$Listener;Lcom/android/volley/Response$ErrorListener;)V

    .line 191
    invoke-direct {p0}, Lio/radar/sdk/api/ApiService;->getDEFAULT_RETRY_POLICY()Lcom/android/volley/DefaultRetryPolicy;

    move-result-object p2

    check-cast p2, Lcom/android/volley/RetryPolicy;

    invoke-virtual {p1, p2}, Lcom/android/volley/toolbox/JsonObjectRequest;->setRetryPolicy(Lcom/android/volley/RetryPolicy;)Lcom/android/volley/Request;

    .line 193
    iget-object p2, p0, Lio/radar/sdk/api/ApiService;->optionsRepository:Lio/radar/sdk/internal/repository/OptionsRepository;

    invoke-virtual {p2}, Lio/radar/sdk/internal/repository/OptionsRepository;->getDebug$sdk_release()Z

    move-result p2

    sput-boolean p2, Lcom/android/volley/VolleyLog;->DEBUG:Z

    .line 194
    iget-object p2, p0, Lio/radar/sdk/api/ApiService;->queue:Lcom/android/volley/RequestQueue;

    check-cast p1, Lcom/android/volley/Request;

    invoke-virtual {p2, p1}, Lcom/android/volley/RequestQueue;->add(Lcom/android/volley/Request;)Lcom/android/volley/Request;

    .line 195
    sget-object p1, Lio/radar/sdk/internal/RadarLogger;->INSTANCE:Lio/radar/sdk/internal/RadarLogger;

    const-string p2, "Requesting Facebook places"

    invoke-static {p1, p2, v2, v4, v2}, Lio/radar/sdk/internal/RadarLogger;->d$default(Lio/radar/sdk/internal/RadarLogger;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    return-void

    .line 141
    :cond_4
    invoke-interface {p2, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final userUpsert(Ljava/lang/String;Landroid/location/Location;ZZZLjava/lang/String;Lkotlin/jvm/functions/Function1;)V
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/location/Location;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p7    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroid/location/Location;",
            "ZZZ",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lio/radar/sdk/api/RadarResponse;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "publishableKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    invoke-direct {p0}, Lio/radar/sdk/api/ApiService;->getLookupId()Ljava/lang/String;

    move-result-object v0

    .line 63
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lio/radar/sdk/api/ApiService;->apiRepository:Lio/radar/sdk/api/ApiClientRepository;

    invoke-virtual {v2}, Lio/radar/sdk/api/ApiClientRepository;->getRadarHost$sdk_release()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "/v1/users/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object v1, p0

    move-object v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move-object v6, p6

    .line 65
    invoke-direct/range {v1 .. v6}, Lio/radar/sdk/api/ApiService;->makeParams(Landroid/location/Location;ZZZLjava/lang/String;)Ljava/util/Map;

    move-result-object p3

    .line 66
    sget-object p4, Lio/radar/sdk/internal/RadarLogger;->INSTANCE:Lio/radar/sdk/internal/RadarLogger;

    new-instance p5, Ljava/lang/StringBuilder;

    invoke-direct {p5}, Ljava/lang/StringBuilder;-><init>()V

    const-string p6, "Sending put request: "

    invoke-virtual {p5, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p6, "\n with params: "

    invoke-virtual {p5, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p5, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p5

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p4, p5, v2, v1, v2}, Lio/radar/sdk/internal/RadarLogger;->d$default(Lio/radar/sdk/internal/RadarLogger;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 67
    new-instance v3, Lio/radar/sdk/api/RadarJsonObjectRequest;

    .line 69
    new-instance p5, Lorg/json/JSONObject;

    invoke-direct {p5, p3}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 70
    new-instance p3, Lio/radar/sdk/api/ApiService$userUpsert$request$1;

    invoke-direct {p3, p0, p7, p2}, Lio/radar/sdk/api/ApiService$userUpsert$request$1;-><init>(Lio/radar/sdk/api/ApiService;Lkotlin/jvm/functions/Function1;Landroid/location/Location;)V

    move-object p6, p3

    check-cast p6, Lcom/android/volley/Response$Listener;

    .line 101
    new-instance p2, Lio/radar/sdk/api/ApiService$userUpsert$request$2;

    invoke-direct {p2, p0, p7}, Lio/radar/sdk/api/ApiService$userUpsert$request$2;-><init>(Lio/radar/sdk/api/ApiService;Lkotlin/jvm/functions/Function1;)V

    move-object p7, p2

    check-cast p7, Lcom/android/volley/Response$ErrorListener;

    const/4 p3, 0x2

    move-object p2, v3

    move-object p4, v0

    .line 67
    invoke-direct/range {p2 .. p7}, Lio/radar/sdk/api/RadarJsonObjectRequest;-><init>(ILjava/lang/String;Lorg/json/JSONObject;Lcom/android/volley/Response$Listener;Lcom/android/volley/Response$ErrorListener;)V

    const-string p2, "Authorization"

    .line 127
    invoke-virtual {v3, p2, p1}, Lio/radar/sdk/api/RadarJsonObjectRequest;->setHeader(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string p1, "X-Radar-Config"

    const-string p2, "true"

    .line 128
    invoke-virtual {v3, p1, p2}, Lio/radar/sdk/api/RadarJsonObjectRequest;->setHeader(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 129
    invoke-direct {p0}, Lio/radar/sdk/api/ApiService;->getDEFAULT_RETRY_POLICY()Lcom/android/volley/DefaultRetryPolicy;

    move-result-object p1

    check-cast p1, Lcom/android/volley/RetryPolicy;

    invoke-virtual {v3, p1}, Lio/radar/sdk/api/RadarJsonObjectRequest;->setRetryPolicy(Lcom/android/volley/RetryPolicy;)Lcom/android/volley/Request;

    .line 131
    iget-object p1, p0, Lio/radar/sdk/api/ApiService;->optionsRepository:Lio/radar/sdk/internal/repository/OptionsRepository;

    invoke-virtual {p1}, Lio/radar/sdk/internal/repository/OptionsRepository;->getDebug$sdk_release()Z

    move-result p1

    sput-boolean p1, Lcom/android/volley/VolleyLog;->DEBUG:Z

    .line 132
    iget-object p1, p0, Lio/radar/sdk/api/ApiService;->queue:Lcom/android/volley/RequestQueue;

    check-cast v3, Lcom/android/volley/Request;

    invoke-virtual {p1, v3}, Lcom/android/volley/RequestQueue;->add(Lcom/android/volley/Request;)Lcom/android/volley/Request;

    .line 133
    sget-object p1, Lio/radar/sdk/internal/RadarLogger;->INSTANCE:Lio/radar/sdk/internal/RadarLogger;

    const-string p2, "Sending location to Radar"

    invoke-static {p1, p2, v2, v1, v2}, Lio/radar/sdk/internal/RadarLogger;->d$default(Lio/radar/sdk/internal/RadarLogger;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    return-void
.end method
