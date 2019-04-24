.class final Lio/radar/sdk/api/ApiService$userUpsert$request$1;
.super Ljava/lang/Object;
.source "ApiService.kt"

# interfaces
.implements Lcom/android/volley/Response$Listener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/radar/sdk/api/ApiService;->userUpsert(Ljava/lang/String;Landroid/location/Location;ZZZLjava/lang/String;Lkotlin/jvm/functions/Function1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/android/volley/Response$Listener<",
        "Lorg/json/JSONObject;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nApiService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApiService.kt\nio/radar/sdk/api/ApiService$userUpsert$request$1\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,328:1\n25#2,2:329\n*E\n*S KotlinDebug\n*F\n+ 1 ApiService.kt\nio/radar/sdk/api/ApiService$userUpsert$request$1\n*L\n89#1,2:329\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x2
    }
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "response",
        "Lorg/json/JSONObject;",
        "kotlin.jvm.PlatformType",
        "onResponse"
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0xb
    }
.end annotation


# instance fields
.field final synthetic $callback:Lkotlin/jvm/functions/Function1;

.field final synthetic $location:Landroid/location/Location;

.field final synthetic this$0:Lio/radar/sdk/api/ApiService;


# direct methods
.method constructor <init>(Lio/radar/sdk/api/ApiService;Lkotlin/jvm/functions/Function1;Landroid/location/Location;)V
    .locals 0

    iput-object p1, p0, Lio/radar/sdk/api/ApiService$userUpsert$request$1;->this$0:Lio/radar/sdk/api/ApiService;

    iput-object p2, p0, Lio/radar/sdk/api/ApiService$userUpsert$request$1;->$callback:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lio/radar/sdk/api/ApiService$userUpsert$request$1;->$location:Landroid/location/Location;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic onResponse(Ljava/lang/Object;)V
    .locals 0

    .line 42
    check-cast p1, Lorg/json/JSONObject;

    invoke-virtual {p0, p1}, Lio/radar/sdk/api/ApiService$userUpsert$request$1;->onResponse(Lorg/json/JSONObject;)V

    return-void
.end method

.method public final onResponse(Lorg/json/JSONObject;)V
    .locals 5

    const-string v0, "meta"

    .line 72
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "config"

    .line 73
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 74
    iget-object v1, p0, Lio/radar/sdk/api/ApiService$userUpsert$request$1;->this$0:Lio/radar/sdk/api/ApiService;

    invoke-static {v1}, Lio/radar/sdk/api/ApiService;->access$getConfigRepository$p(Lio/radar/sdk/api/ApiService;)Lio/radar/sdk/config/ConfigRepository;

    move-result-object v1

    invoke-virtual {v1, v0}, Lio/radar/sdk/config/ConfigRepository;->saveConfigJson$sdk_release(Lorg/json/JSONObject;)V

    :cond_0
    const-string v0, "user"

    .line 78
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 79
    sget-object v1, Lio/radar/sdk/model/RadarUser;->Companion:Lio/radar/sdk/model/RadarUser$Companion;

    invoke-virtual {v1, v0}, Lio/radar/sdk/model/RadarUser$Companion;->fromJson$sdk_release(Lorg/json/JSONObject;)Lio/radar/sdk/model/RadarUser;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    .line 83
    iget-object p1, p0, Lio/radar/sdk/api/ApiService$userUpsert$request$1;->$callback:Lkotlin/jvm/functions/Function1;

    new-instance v0, Lio/radar/sdk/api/Error;

    sget-object v1, Lio/radar/sdk/Radar$RadarStatus;->ERROR_SERVER:Lio/radar/sdk/Radar$RadarStatus;

    invoke-direct {v0, v1}, Lio/radar/sdk/api/Error;-><init>(Lio/radar/sdk/Radar$RadarStatus;)V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_2
    const-string v1, "events"

    .line 87
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    .line 88
    sget-object v3, Lio/radar/sdk/model/RadarEvent;->Companion:Lio/radar/sdk/model/RadarEvent$Companion;

    invoke-virtual {v3, v1}, Lio/radar/sdk/model/RadarEvent$Companion;->eventsFromJSONArray$sdk_release(Lorg/json/JSONArray;)[Lio/radar/sdk/model/RadarEvent;

    move-result-object v1

    if-eqz v1, :cond_3

    goto :goto_1

    .line 330
    :cond_3
    new-array v1, v2, [Lio/radar/sdk/model/RadarEvent;

    .line 91
    :goto_1
    iget-object v3, p0, Lio/radar/sdk/api/ApiService$userUpsert$request$1;->this$0:Lio/radar/sdk/api/ApiService;

    invoke-static {v3}, Lio/radar/sdk/api/ApiService;->access$getIdentityRepository$p(Lio/radar/sdk/api/ApiService;)Lio/radar/sdk/internal/repository/IdentityRepository;

    move-result-object v3

    invoke-virtual {v0}, Lio/radar/sdk/model/RadarUser;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lio/radar/sdk/internal/repository/IdentityRepository;->setRadarId$sdk_release(Ljava/lang/String;)V

    .line 93
    iget-object v3, p0, Lio/radar/sdk/api/ApiService$userUpsert$request$1;->this$0:Lio/radar/sdk/api/ApiService;

    invoke-static {v3}, Lio/radar/sdk/api/ApiService;->access$getOptionsRepository$p(Lio/radar/sdk/api/ApiService;)Lio/radar/sdk/internal/repository/OptionsRepository;

    move-result-object v3

    invoke-virtual {v3}, Lio/radar/sdk/internal/repository/OptionsRepository;->getPlacesProvider$sdk_release()Lio/radar/sdk/Radar$RadarPlacesProvider;

    move-result-object v3

    sget-object v4, Lio/radar/sdk/Radar$RadarPlacesProvider;->FACEBOOK:Lio/radar/sdk/Radar$RadarPlacesProvider;

    if-ne v3, v4, :cond_5

    .line 94
    iget-object v3, p0, Lio/radar/sdk/api/ApiService$userUpsert$request$1;->this$0:Lio/radar/sdk/api/ApiService;

    invoke-static {v3}, Lio/radar/sdk/api/ApiService;->access$getApiRepository$p(Lio/radar/sdk/api/ApiService;)Lio/radar/sdk/api/ApiClientRepository;

    move-result-object v3

    invoke-virtual {v0}, Lio/radar/sdk/model/RadarUser;->getPlace()Lio/radar/sdk/model/RadarPlace;

    move-result-object v4

    if-eqz v4, :cond_4

    const/4 v2, 0x1

    :cond_4
    invoke-virtual {v3, v2}, Lio/radar/sdk/api/ApiClientRepository;->setAtPlace$sdk_release(Z)V

    goto :goto_2

    .line 96
    :cond_5
    iget-object v3, p0, Lio/radar/sdk/api/ApiService$userUpsert$request$1;->this$0:Lio/radar/sdk/api/ApiService;

    invoke-static {v3}, Lio/radar/sdk/api/ApiService;->access$getApiRepository$p(Lio/radar/sdk/api/ApiService;)Lio/radar/sdk/api/ApiClientRepository;

    move-result-object v3

    invoke-virtual {v3, v2}, Lio/radar/sdk/api/ApiClientRepository;->setAtPlace$sdk_release(Z)V

    .line 99
    :goto_2
    iget-object v2, p0, Lio/radar/sdk/api/ApiService$userUpsert$request$1;->$callback:Lkotlin/jvm/functions/Function1;

    new-instance v3, Lio/radar/sdk/api/Success;

    const-string v4, "response"

    invoke-static {p1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, p0, Lio/radar/sdk/api/ApiService$userUpsert$request$1;->$location:Landroid/location/Location;

    invoke-direct {v3, p1, v4, v1, v0}, Lio/radar/sdk/api/Success;-><init>(Lorg/json/JSONObject;Landroid/location/Location;[Lio/radar/sdk/model/RadarEvent;Lio/radar/sdk/model/RadarUser;)V

    invoke-interface {v2, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
