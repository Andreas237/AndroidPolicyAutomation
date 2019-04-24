.class public final Lio/radar/sdk/api/ApiClient;
.super Ljava/lang/Object;
.source "ApiClient.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nApiClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApiClient.kt\nio/radar/sdk/api/ApiClient\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,268:1\n1491#2,2:269\n*E\n*S KotlinDebug\n*F\n+ 1 ApiClient.kt\nio/radar/sdk/api/ApiClient\n*L\n254#1,2:269\n*E\n"
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
        "\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B/\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\u000cJ\u0015\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000fH\u0000\u00a2\u0006\u0002\u0008\u001cJ\u0015\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001fH\u0001\u00a2\u0006\u0002\u0008 J\u0010\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020#H\u0002J\u001d\u0010$\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(H\u0001\u00a2\u0006\u0002\u0008)JA\u0010*\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001f2\n\u0008\u0002\u0010\'\u001a\u0004\u0018\u00010(2\u0010\u0008\u0002\u0010+\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,2\n\u0008\u0002\u0010.\u001a\u0004\u0018\u00010/H\u0001\u00a2\u0006\u0004\u00080\u00101J\u0015\u00102\u001a\u00020\u001a2\u0006\u00103\u001a\u000204H\u0000\u00a2\u0006\u0002\u00085J\u001d\u00106\u001a\u00020\u001a2\u000e\u0008\u0002\u00107\u001a\u0008\u0012\u0004\u0012\u00020\u001a08H\u0000\u00a2\u0006\u0002\u00089JB\u0010:\u001a\u00020\u001a2\u0006\u0010\'\u001a\u00020(2\u0006\u0010;\u001a\u00020\u00142\u0006\u0010<\u001a\u00020\u00142\u0006\u0010=\u001a\u00020\u00142\u0008\u0008\u0002\u0010>\u001a\u00020\u00142\u000e\u0008\u0002\u00107\u001a\u0008\u0012\u0004\u0012\u00020\u001a08H\u0002J+\u0010?\u001a\u00020\u001a2\u0006\u0010@\u001a\u00020A2\u0008\u0010B\u001a\u0004\u0018\u00010C2\n\u0008\u0002\u0010D\u001a\u0004\u0018\u00010AH\u0000\u00a2\u0006\u0002\u0008ER\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\u0008\u0012\u0004\u0012\u00020\u000f`\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0014X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016\"\u0004\u0008\u0017\u0010\u0018\u00a8\u0006F"
    }
    d2 = {
        "Lio/radar/sdk/api/ApiClient;",
        "",
        "context",
        "Landroid/content/Context;",
        "identityRepository",
        "Lio/radar/sdk/internal/repository/IdentityRepository;",
        "optionsRepository",
        "Lio/radar/sdk/internal/repository/OptionsRepository;",
        "repository",
        "Lio/radar/sdk/api/ApiClientRepository;",
        "apiService",
        "Lio/radar/sdk/api/ApiService;",
        "(Landroid/content/Context;Lio/radar/sdk/internal/repository/IdentityRepository;Lio/radar/sdk/internal/repository/OptionsRepository;Lio/radar/sdk/api/ApiClientRepository;Lio/radar/sdk/api/ApiService;)V",
        "callbacks",
        "Ljava/util/ArrayList;",
        "Lio/radar/sdk/Radar$RadarCallback;",
        "Lkotlin/collections/ArrayList;",
        "handler",
        "Landroid/os/Handler;",
        "sendNextState",
        "",
        "getSendNextState$sdk_release",
        "()Z",
        "setSendNextState$sdk_release",
        "(Z)V",
        "addCallback",
        "",
        "callback",
        "addCallback$sdk_release",
        "broadcastError",
        "status",
        "Lio/radar/sdk/Radar$RadarStatus;",
        "broadcastError$sdk_release",
        "broadcastIntent",
        "intent",
        "Landroid/content/Intent;",
        "broadcastSuccess",
        "response",
        "Lorg/json/JSONObject;",
        "location",
        "Landroid/location/Location;",
        "broadcastSuccess$sdk_release",
        "deliverResult",
        "events",
        "",
        "Lio/radar/sdk/model/RadarEvent;",
        "user",
        "Lio/radar/sdk/model/RadarUser;",
        "deliverResult$sdk_release",
        "(Lio/radar/sdk/Radar$RadarStatus;Landroid/location/Location;[Lio/radar/sdk/model/RadarEvent;Lio/radar/sdk/model/RadarUser;)V",
        "handleState",
        "state",
        "Lio/radar/sdk/internal/RadarState;",
        "handleState$sdk_release",
        "retryFailedStop",
        "completionCallback",
        "Lkotlin/Function0;",
        "retryFailedStop$sdk_release",
        "updateLocation",
        "stopped",
        "foreground",
        "shouldGetPlaces",
        "replayed",
        "verifyEvent",
        "eventId",
        "",
        "verification",
        "Lio/radar/sdk/model/RadarEvent$RadarEventVerification;",
        "placeId",
        "verifyEvent$sdk_release",
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
.field private final apiService:Lio/radar/sdk/api/ApiService;

.field private final callbacks:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lio/radar/sdk/Radar$RadarCallback;",
            ">;"
        }
    .end annotation
.end field

.field private final context:Landroid/content/Context;

.field private final handler:Landroid/os/Handler;

.field private final identityRepository:Lio/radar/sdk/internal/repository/IdentityRepository;

.field private final optionsRepository:Lio/radar/sdk/internal/repository/OptionsRepository;

.field private final repository:Lio/radar/sdk/api/ApiClientRepository;

.field private sendNextState:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lio/radar/sdk/internal/repository/IdentityRepository;Lio/radar/sdk/internal/repository/OptionsRepository;Lio/radar/sdk/api/ApiClientRepository;Lio/radar/sdk/api/ApiService;)V
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
    .param p5    # Lio/radar/sdk/api/ApiService;
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

    const-string v0, "repository"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "apiService"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/radar/sdk/api/ApiClient;->context:Landroid/content/Context;

    iput-object p2, p0, Lio/radar/sdk/api/ApiClient;->identityRepository:Lio/radar/sdk/internal/repository/IdentityRepository;

    iput-object p3, p0, Lio/radar/sdk/api/ApiClient;->optionsRepository:Lio/radar/sdk/internal/repository/OptionsRepository;

    iput-object p4, p0, Lio/radar/sdk/api/ApiClient;->repository:Lio/radar/sdk/api/ApiClientRepository;

    iput-object p5, p0, Lio/radar/sdk/api/ApiClient;->apiService:Lio/radar/sdk/api/ApiService;

    .line 59
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lio/radar/sdk/api/ApiClient;->callbacks:Ljava/util/ArrayList;

    .line 60
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lio/radar/sdk/api/ApiClient;->handler:Landroid/os/Handler;

    .line 63
    iget-object p1, p0, Lio/radar/sdk/api/ApiClient;->repository:Lio/radar/sdk/api/ApiClientRepository;

    invoke-virtual {p1}, Lio/radar/sdk/api/ApiClientRepository;->loadAdId$sdk_release()V

    return-void
.end method

.method public static final synthetic access$getApiService$p(Lio/radar/sdk/api/ApiClient;)Lio/radar/sdk/api/ApiService;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 49
    iget-object p0, p0, Lio/radar/sdk/api/ApiClient;->apiService:Lio/radar/sdk/api/ApiService;

    return-object p0
.end method

.method public static final synthetic access$getCallbacks$p(Lio/radar/sdk/api/ApiClient;)Ljava/util/ArrayList;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 49
    iget-object p0, p0, Lio/radar/sdk/api/ApiClient;->callbacks:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static final synthetic access$getHandler$p(Lio/radar/sdk/api/ApiClient;)Landroid/os/Handler;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 49
    iget-object p0, p0, Lio/radar/sdk/api/ApiClient;->handler:Landroid/os/Handler;

    return-object p0
.end method

.method public static final synthetic access$getOptionsRepository$p(Lio/radar/sdk/api/ApiClient;)Lio/radar/sdk/internal/repository/OptionsRepository;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 49
    iget-object p0, p0, Lio/radar/sdk/api/ApiClient;->optionsRepository:Lio/radar/sdk/internal/repository/OptionsRepository;

    return-object p0
.end method

.method public static final synthetic access$getRepository$p(Lio/radar/sdk/api/ApiClient;)Lio/radar/sdk/api/ApiClientRepository;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 49
    iget-object p0, p0, Lio/radar/sdk/api/ApiClient;->repository:Lio/radar/sdk/api/ApiClientRepository;

    return-object p0
.end method

.method private final broadcastIntent(Landroid/content/Intent;)V
    .locals 5

    .line 250
    iget-object v0, p0, Lio/radar/sdk/api/ApiClient;->context:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/support/v4/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z

    .line 253
    iget-object v0, p0, Lio/radar/sdk/api/ApiClient;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/content/pm/PackageManager;->queryBroadcastReceivers(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v0

    const-string v1, "matches"

    .line 254
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    .line 269
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/pm/ResolveInfo;

    .line 255
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2, p1}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 256
    iget-object v3, p0, Lio/radar/sdk/api/ApiClient;->context:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    iget-object v4, v1, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v4, v4, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 257
    new-instance v3, Landroid/content/ComponentName;

    .line 258
    iget-object v4, v1, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v4, v4, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget-object v4, v4, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    .line 259
    iget-object v1, v1, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v1, v1, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    .line 257
    invoke-direct {v3, v4, v1}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 261
    invoke-virtual {v2, v3}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 263
    iget-object v1, p0, Lio/radar/sdk/api/ApiClient;->context:Landroid/content/Context;

    invoke-virtual {v1, v2}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static bridge synthetic retryFailedStop$sdk_release$default(Lio/radar/sdk/api/ApiClient;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 191
    sget-object p1, Lio/radar/sdk/api/ApiClient$retryFailedStop$1;->INSTANCE:Lio/radar/sdk/api/ApiClient$retryFailedStop$1;

    check-cast p1, Lkotlin/jvm/functions/Function0;

    :cond_0
    invoke-virtual {p0, p1}, Lio/radar/sdk/api/ApiClient;->retryFailedStop$sdk_release(Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method private final updateLocation(Landroid/location/Location;ZZZZLkotlin/jvm/functions/Function0;)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/location/Location;",
            "ZZZZ",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v9, p0

    .line 126
    iget-object v0, v9, Lio/radar/sdk/api/ApiClient;->handler:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 128
    iget-object v0, v9, Lio/radar/sdk/api/ApiClient;->identityRepository:Lio/radar/sdk/internal/repository/IdentityRepository;

    invoke-virtual {v0}, Lio/radar/sdk/internal/repository/IdentityRepository;->getPublishableKey$sdk_release()Ljava/lang/String;

    move-result-object v11

    if-nez v11, :cond_0

    .line 130
    sget-object v0, Lio/radar/sdk/Radar$RadarStatus;->ERROR_PUBLISHABLE_KEY:Lio/radar/sdk/Radar$RadarStatus;

    invoke-virtual {v9, v0}, Lio/radar/sdk/api/ApiClient;->broadcastError$sdk_release(Lio/radar/sdk/Radar$RadarStatus;)V

    .line 131
    sget-object v0, Lio/radar/sdk/Radar$RadarStatus;->ERROR_PUBLISHABLE_KEY:Lio/radar/sdk/Radar$RadarStatus;

    invoke-virtual {v9, v0, v1, v1, v1}, Lio/radar/sdk/api/ApiClient;->deliverResult$sdk_release(Lio/radar/sdk/Radar$RadarStatus;Landroid/location/Location;[Lio/radar/sdk/model/RadarEvent;Lio/radar/sdk/model/RadarUser;)V

    .line 132
    invoke-interface/range {p6 .. p6}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    return-void

    .line 135
    :cond_0
    monitor-enter p0

    .line 136
    :try_start_0
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    .line 137
    iget-object v2, v9, Lio/radar/sdk/api/ApiClient;->repository:Lio/radar/sdk/api/ApiClientRepository;

    invoke-virtual {v2}, Lio/radar/sdk/api/ApiClientRepository;->getLastSentAt$sdk_release()Ljava/util/Date;

    move-result-object v2

    if-eqz v2, :cond_1

    if-nez p2, :cond_1

    if-nez p3, :cond_1

    .line 138
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v5

    sub-long/2addr v3, v5

    const-wide/32 v5, 0xea60

    cmp-long v2, v3, v5

    if-gez v2, :cond_1

    .line 139
    sget-object v0, Lio/radar/sdk/internal/RadarLogger;->INSTANCE:Lio/radar/sdk/internal/RadarLogger;

    const-string v2, "Client rate limit hit (1 req/min). Skipping request"

    const/4 v3, 0x2

    invoke-static {v0, v2, v1, v3, v1}, Lio/radar/sdk/internal/RadarLogger;->d$default(Lio/radar/sdk/internal/RadarLogger;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 140
    invoke-interface/range {p6 .. p6}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    .line 143
    :cond_1
    :try_start_1
    iget-object v1, v9, Lio/radar/sdk/api/ApiClient;->repository:Lio/radar/sdk/api/ApiClientRepository;

    invoke-virtual {v1, v0}, Lio/radar/sdk/api/ApiClientRepository;->setLastSentAt$sdk_release(Ljava/util/Date;)V

    .line 144
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 135
    monitor-exit p0

    .line 146
    new-instance v0, Lio/radar/sdk/api/ApiClient$updateLocation$callback$1;

    move-object v1, v0

    move-object/from16 v2, p0

    move/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v5, p1

    move/from16 v6, p5

    move-object/from16 v7, p6

    invoke-direct/range {v1 .. v7}, Lio/radar/sdk/api/ApiClient$updateLocation$callback$1;-><init>(Lio/radar/sdk/api/ApiClient;ZZLandroid/location/Location;ZLkotlin/jvm/functions/Function0;)V

    move-object/from16 v17, v0

    check-cast v17, Lkotlin/jvm/functions/Function1;

    if-eqz p4, :cond_2

    .line 183
    iget-object v0, v9, Lio/radar/sdk/api/ApiClient;->apiService:Lio/radar/sdk/api/ApiService;

    new-instance v10, Lio/radar/sdk/api/ApiClient$updateLocation$3;

    move-object v1, v10

    move-object/from16 v2, p0

    move-object v3, v11

    move-object/from16 v4, p1

    move/from16 v5, p2

    move/from16 v6, p3

    move/from16 v7, p5

    move-object/from16 v8, v17

    invoke-direct/range {v1 .. v8}, Lio/radar/sdk/api/ApiClient$updateLocation$3;-><init>(Lio/radar/sdk/api/ApiClient;Ljava/lang/String;Landroid/location/Location;ZZZLkotlin/jvm/functions/Function1;)V

    check-cast v10, Lkotlin/jvm/functions/Function1;

    move-object/from16 v1, p1

    invoke-virtual {v0, v1, v10}, Lio/radar/sdk/api/ApiService;->fetchPlaces(Landroid/location/Location;Lkotlin/jvm/functions/Function1;)V

    goto :goto_0

    :cond_2
    move-object/from16 v1, p1

    .line 187
    iget-object v10, v9, Lio/radar/sdk/api/ApiClient;->apiService:Lio/radar/sdk/api/ApiService;

    const/16 v16, 0x0

    move-object/from16 v12, p1

    move/from16 v13, p2

    move/from16 v14, p3

    move/from16 v15, p5

    invoke-virtual/range {v10 .. v17}, Lio/radar/sdk/api/ApiService;->userUpsert(Ljava/lang/String;Landroid/location/Location;ZZZLjava/lang/String;Lkotlin/jvm/functions/Function1;)V

    :goto_0
    return-void

    :catchall_0
    move-exception v0

    .line 135
    monitor-exit p0

    throw v0
.end method

.method static bridge synthetic updateLocation$default(Lio/radar/sdk/api/ApiClient;Landroid/location/Location;ZZZZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V
    .locals 7

    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_0

    const/4 p5, 0x0

    const/4 v5, 0x0

    goto :goto_0

    :cond_0
    move v5, p5

    :goto_0
    and-int/lit8 p5, p7, 0x20

    if-eqz p5, :cond_1

    .line 123
    sget-object p5, Lio/radar/sdk/api/ApiClient$updateLocation$1;->INSTANCE:Lio/radar/sdk/api/ApiClient$updateLocation$1;

    move-object p6, p5

    check-cast p6, Lkotlin/jvm/functions/Function0;

    move-object v6, p6

    goto :goto_1

    :cond_1
    move-object v6, p6

    :goto_1
    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    invoke-direct/range {v0 .. v6}, Lio/radar/sdk/api/ApiClient;->updateLocation(Landroid/location/Location;ZZZZLkotlin/jvm/functions/Function0;)V

    return-void
.end method


# virtual methods
.method public final addCallback$sdk_release(Lio/radar/sdk/Radar$RadarCallback;)V
    .locals 3
    .param p1    # Lio/radar/sdk/Radar$RadarCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 107
    iget-object v0, p0, Lio/radar/sdk/api/ApiClient;->callbacks:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 108
    new-instance v0, Lio/radar/sdk/api/ApiClient$addCallback$timeoutRunnable$1;

    invoke-direct {v0, p0, p1}, Lio/radar/sdk/api/ApiClient$addCallback$timeoutRunnable$1;-><init>(Lio/radar/sdk/api/ApiClient;Lio/radar/sdk/Radar$RadarCallback;)V

    check-cast v0, Ljava/lang/Runnable;

    .line 114
    iget-object p1, p0, Lio/radar/sdk/api/ApiClient;->handler:Landroid/os/Handler;

    const-wide/16 v1, 0x4e20

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public final broadcastError$sdk_release(Lio/radar/sdk/Radar$RadarStatus;)V
    .locals 1
    .param p1    # Lio/radar/sdk/Radar$RadarStatus;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    const-string v0, "status"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 244
    sget-object v0, Lio/radar/sdk/RadarReceiver;->Companion:Lio/radar/sdk/RadarReceiver$Companion;

    invoke-virtual {v0, p1}, Lio/radar/sdk/RadarReceiver$Companion;->createErrorIntent$sdk_release(Lio/radar/sdk/Radar$RadarStatus;)Landroid/content/Intent;

    move-result-object p1

    .line 245
    invoke-direct {p0, p1}, Lio/radar/sdk/api/ApiClient;->broadcastIntent(Landroid/content/Intent;)V

    return-void
.end method

.method public final broadcastSuccess$sdk_release(Lorg/json/JSONObject;Landroid/location/Location;)V
    .locals 1
    .param p1    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/location/Location;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 238
    sget-object v0, Lio/radar/sdk/RadarReceiver;->Companion:Lio/radar/sdk/RadarReceiver$Companion;

    invoke-virtual {v0, p1, p2}, Lio/radar/sdk/RadarReceiver$Companion;->createIntent$sdk_release(Lorg/json/JSONObject;Landroid/location/Location;)Landroid/content/Intent;

    move-result-object p1

    .line 239
    invoke-direct {p0, p1}, Lio/radar/sdk/api/ApiClient;->broadcastIntent(Landroid/content/Intent;)V

    return-void
.end method

.method public final deliverResult$sdk_release(Lio/radar/sdk/Radar$RadarStatus;Landroid/location/Location;[Lio/radar/sdk/model/RadarEvent;Lio/radar/sdk/model/RadarUser;)V
    .locals 8
    .param p1    # Lio/radar/sdk/Radar$RadarStatus;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/location/Location;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # [Lio/radar/sdk/model/RadarEvent;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Lio/radar/sdk/model/RadarUser;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    const-string v0, "status"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 225
    iget-object v0, p0, Lio/radar/sdk/api/ApiClient;->handler:Landroid/os/Handler;

    new-instance v7, Lio/radar/sdk/api/ApiClient$deliverResult$1;

    move-object v1, v7

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Lio/radar/sdk/api/ApiClient$deliverResult$1;-><init>(Lio/radar/sdk/api/ApiClient;Lio/radar/sdk/Radar$RadarStatus;Landroid/location/Location;[Lio/radar/sdk/model/RadarEvent;Lio/radar/sdk/model/RadarUser;)V

    check-cast v7, Ljava/lang/Runnable;

    invoke-virtual {v0, v7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final handleState$sdk_release(Lio/radar/sdk/internal/RadarState;)V
    .locals 13
    .param p1    # Lio/radar/sdk/internal/RadarState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    iget-boolean v0, p0, Lio/radar/sdk/api/ApiClient;->sendNextState:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    instance-of v0, p1, Lio/radar/sdk/internal/Stopped;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Lio/radar/sdk/internal/Stopped;

    invoke-virtual {v0}, Lio/radar/sdk/internal/Stopped;->getJustStopped()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 68
    :cond_0
    sget-object v0, Lio/radar/sdk/api/LocationWorker;->Companion:Lio/radar/sdk/api/LocationWorker$Companion;

    invoke-virtual {v0}, Lio/radar/sdk/api/LocationWorker$Companion;->cancelWork$sdk_release()V

    .line 69
    iget-object v0, p0, Lio/radar/sdk/api/ApiClient;->repository:Lio/radar/sdk/api/ApiClientRepository;

    move-object v2, v1

    check-cast v2, Landroid/location/Location;

    invoke-virtual {v0, v2}, Lio/radar/sdk/api/ApiClientRepository;->setLastFailedStop$sdk_release(Landroid/location/Location;)V

    .line 72
    :cond_1
    iget-object v0, p0, Lio/radar/sdk/api/ApiClient;->optionsRepository:Lio/radar/sdk/internal/repository/OptionsRepository;

    invoke-virtual {v0}, Lio/radar/sdk/internal/repository/OptionsRepository;->getOfflineMode$sdk_release()Lio/radar/sdk/Radar$RadarTrackingOffline;

    move-result-object v0

    sget-object v2, Lio/radar/sdk/Radar$RadarTrackingOffline;->REPLAY_STOPPED:Lio/radar/sdk/Radar$RadarTrackingOffline;

    const/4 v3, 0x1

    if-ne v0, v2, :cond_2

    iget-object v0, p0, Lio/radar/sdk/api/ApiClient;->repository:Lio/radar/sdk/api/ApiClientRepository;

    invoke-virtual {v0}, Lio/radar/sdk/api/ApiClientRepository;->getLastFailedStop$sdk_release()Landroid/location/Location;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 73
    invoke-static {p0, v1, v3, v1}, Lio/radar/sdk/api/ApiClient;->retryFailedStop$sdk_release$default(Lio/radar/sdk/api/ApiClient;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    return-void

    .line 76
    :cond_2
    iget-boolean v0, p0, Lio/radar/sdk/api/ApiClient;->sendNextState:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    .line 78
    invoke-virtual {p1}, Lio/radar/sdk/internal/RadarState;->getLocation()Landroid/location/Location;

    move-result-object v5

    .line 79
    instance-of v6, p1, Lio/radar/sdk/internal/Stopped;

    const/4 v7, 0x1

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v11, 0x30

    const/4 v12, 0x0

    move-object v4, p0

    .line 77
    invoke-static/range {v4 .. v12}, Lio/radar/sdk/api/ApiClient;->updateLocation$default(Lio/radar/sdk/api/ApiClient;Landroid/location/Location;ZZZZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 83
    iput-boolean v1, p0, Lio/radar/sdk/api/ApiClient;->sendNextState:Z

    return-void

    .line 87
    :cond_3
    instance-of v0, p1, Lio/radar/sdk/internal/Moving;

    if-nez v0, :cond_4

    instance-of v0, p1, Lio/radar/sdk/internal/Stopped;

    if-eqz v0, :cond_a

    move-object v0, p1

    check-cast v0, Lio/radar/sdk/internal/Stopped;

    invoke-virtual {v0}, Lio/radar/sdk/internal/Stopped;->getJustStopped()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 88
    :cond_4
    instance-of v6, p1, Lio/radar/sdk/internal/Stopped;

    .line 91
    iget-object v0, p0, Lio/radar/sdk/api/ApiClient;->optionsRepository:Lio/radar/sdk/internal/repository/OptionsRepository;

    invoke-virtual {v0}, Lio/radar/sdk/internal/repository/OptionsRepository;->getSyncMode$sdk_release()Lio/radar/sdk/Radar$RadarTrackingSync;

    move-result-object v0

    sget-object v2, Lio/radar/sdk/Radar$RadarTrackingSync;->POSSIBLE_STATE_CHANGES:Lio/radar/sdk/Radar$RadarTrackingSync;

    if-ne v0, v2, :cond_7

    if-nez v6, :cond_6

    .line 92
    iget-object v0, p0, Lio/radar/sdk/api/ApiClient;->repository:Lio/radar/sdk/api/ApiClientRepository;

    invoke-virtual {v0}, Lio/radar/sdk/api/ApiClientRepository;->getCanExit$sdk_release()Z

    move-result v0

    if-eqz v0, :cond_5

    goto :goto_0

    :cond_5
    const/4 v0, 0x0

    goto :goto_1

    :cond_6
    :goto_0
    const/4 v0, 0x1

    goto :goto_1

    :cond_7
    const/4 v0, 0x1

    :goto_1
    if-eqz v0, :cond_a

    .line 97
    invoke-virtual {p1}, Lio/radar/sdk/internal/RadarState;->getLocation()Landroid/location/Location;

    move-result-object v5

    const/4 v7, 0x0

    if-nez v6, :cond_9

    .line 100
    iget-object p1, p0, Lio/radar/sdk/api/ApiClient;->repository:Lio/radar/sdk/api/ApiClientRepository;

    invoke-virtual {p1}, Lio/radar/sdk/api/ApiClientRepository;->getAtPlace$sdk_release()Z

    move-result p1

    if-eqz p1, :cond_8

    goto :goto_2

    :cond_8
    const/4 v8, 0x0

    goto :goto_3

    :cond_9
    :goto_2
    const/4 v8, 0x1

    :goto_3
    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v11, 0x30

    const/4 v12, 0x0

    move-object v4, p0

    .line 96
    invoke-static/range {v4 .. v12}, Lio/radar/sdk/api/ApiClient;->updateLocation$default(Lio/radar/sdk/api/ApiClient;Landroid/location/Location;ZZZZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    :cond_a
    return-void
.end method

.method public final retryFailedStop$sdk_release(Lkotlin/jvm/functions/Function0;)V
    .locals 8
    .param p1    # Lkotlin/jvm/functions/Function0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "completionCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 192
    iget-object v0, p0, Lio/radar/sdk/api/ApiClient;->repository:Lio/radar/sdk/api/ApiClientRepository;

    invoke-virtual {v0}, Lio/radar/sdk/api/ApiClientRepository;->getLastFailedStop$sdk_release()Landroid/location/Location;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 193
    sget-object v0, Lio/radar/sdk/internal/RadarLogger;->INSTANCE:Lio/radar/sdk/internal/RadarLogger;

    iget-object v1, p0, Lio/radar/sdk/api/ApiClient;->context:Landroid/content/Context;

    const-string v3, "Retrying failed stop"

    const-string v4, "Retrying last failed stop"

    invoke-virtual {v0, v1, v3, v4}, Lio/radar/sdk/internal/RadarLogger;->notify(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    move-object v1, p0

    move-object v7, p1

    .line 194
    invoke-direct/range {v1 .. v7}, Lio/radar/sdk/api/ApiClient;->updateLocation(Landroid/location/Location;ZZZZLkotlin/jvm/functions/Function0;)V

    :cond_0
    return-void
.end method

.method public final setSendNextState$sdk_release(Z)V
    .locals 0

    .line 57
    iput-boolean p1, p0, Lio/radar/sdk/api/ApiClient;->sendNextState:Z

    return-void
.end method
