.class final Lio/radar/sdk/api/ApiService$userUpsert$request$2;
.super Ljava/lang/Object;
.source "ApiService.kt"

# interfaces
.implements Lcom/android/volley/Response$ErrorListener;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/radar/sdk/api/ApiService;->userUpsert(Ljava/lang/String;Landroid/location/Location;ZZZLjava/lang/String;Lkotlin/jvm/functions/Function1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nApiService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApiService.kt\nio/radar/sdk/api/ApiService$userUpsert$request$2\n*L\n1#1,328:1\n*E\n"
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
        "error",
        "Lcom/android/volley/VolleyError;",
        "kotlin.jvm.PlatformType",
        "onErrorResponse"
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

.field final synthetic this$0:Lio/radar/sdk/api/ApiService;


# direct methods
.method constructor <init>(Lio/radar/sdk/api/ApiService;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    iput-object p1, p0, Lio/radar/sdk/api/ApiService$userUpsert$request$2;->this$0:Lio/radar/sdk/api/ApiService;

    iput-object p2, p0, Lio/radar/sdk/api/ApiService$userUpsert$request$2;->$callback:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onErrorResponse(Lcom/android/volley/VolleyError;)V
    .locals 4

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 104
    :try_start_0
    iget-object v1, p1, Lcom/android/volley/VolleyError;->networkResponse:Lcom/android/volley/NetworkResponse;

    if-eqz v1, :cond_0

    iget-object v1, v1, Lcom/android/volley/NetworkResponse;->data:[B

    if-eqz v1, :cond_0

    new-instance v2, Lorg/json/JSONObject;

    new-instance v2, Ljava/lang/String;

    sget-object v3, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v2, v1, v3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    invoke-static {v2}, Lcom/newrelic/agent/android/instrumentation/JSONObjectInstrumentation;->init(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_1

    :cond_0
    move-object v1, v0

    :goto_0
    if-eqz v1, :cond_1

    const-string v2, "meta"

    .line 105
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_1

    const-string v2, "config"

    .line 106
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 107
    iget-object v2, p0, Lio/radar/sdk/api/ApiService$userUpsert$request$2;->this$0:Lio/radar/sdk/api/ApiService;

    invoke-static {v2}, Lio/radar/sdk/api/ApiService;->access$getConfigRepository$p(Lio/radar/sdk/api/ApiService;)Lio/radar/sdk/config/ConfigRepository;

    move-result-object v2

    invoke-virtual {v2, v1}, Lio/radar/sdk/config/ConfigRepository;->saveConfigJson$sdk_release(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    .line 111
    :goto_1
    sget-object v2, Lio/radar/sdk/internal/RadarLogger;->INSTANCE:Lio/radar/sdk/internal/RadarLogger;

    const-string v3, "Failed to parse config"

    check-cast v1, Ljava/lang/Throwable;

    invoke-virtual {v2, v3, v1}, Lio/radar/sdk/internal/RadarLogger;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 113
    :cond_1
    :goto_2
    instance-of v1, p1, Lcom/android/volley/NetworkError;

    if-nez v1, :cond_b

    instance-of v1, p1, Lcom/android/volley/TimeoutError;

    if-eqz v1, :cond_2

    goto :goto_6

    :cond_2
    if-eqz p1, :cond_3

    .line 116
    iget-object p1, p1, Lcom/android/volley/VolleyError;->networkResponse:Lcom/android/volley/NetworkResponse;

    if-eqz p1, :cond_3

    iget p1, p1, Lcom/android/volley/NetworkResponse;->statusCode:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :cond_3
    if-nez v0, :cond_4

    goto :goto_3

    .line 117
    :cond_4
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/16 v1, 0x190

    if-ne p1, v1, :cond_5

    sget-object p1, Lio/radar/sdk/Radar$RadarStatus;->ERROR_LOCATION:Lio/radar/sdk/Radar$RadarStatus;

    goto :goto_7

    :cond_5
    :goto_3
    if-nez v0, :cond_6

    goto :goto_4

    .line 118
    :cond_6
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/16 v1, 0x191

    if-ne p1, v1, :cond_7

    sget-object p1, Lio/radar/sdk/Radar$RadarStatus;->ERROR_UNAUTHORIZED:Lio/radar/sdk/Radar$RadarStatus;

    goto :goto_7

    :cond_7
    :goto_4
    if-nez v0, :cond_8

    goto :goto_5

    .line 119
    :cond_8
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/16 v1, 0x1ad

    if-ne p1, v1, :cond_9

    sget-object p1, Lio/radar/sdk/Radar$RadarStatus;->ERROR_RATE_LIMIT:Lio/radar/sdk/Radar$RadarStatus;

    goto :goto_7

    :cond_9
    :goto_5
    const/16 p1, 0x1f4

    const/16 v1, 0x258

    .line 120
    invoke-static {p1, v1}, Lkotlin/ranges/RangesKt;->until(II)Lkotlin/ranges/IntRange;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1, v0}, Lkotlin/collections/CollectionsKt;->contains(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_a

    sget-object p1, Lio/radar/sdk/Radar$RadarStatus;->ERROR_SERVER:Lio/radar/sdk/Radar$RadarStatus;

    goto :goto_7

    .line 121
    :cond_a
    sget-object p1, Lio/radar/sdk/Radar$RadarStatus;->ERROR_UNKNOWN:Lio/radar/sdk/Radar$RadarStatus;

    goto :goto_7

    .line 114
    :cond_b
    :goto_6
    sget-object p1, Lio/radar/sdk/Radar$RadarStatus;->ERROR_NETWORK:Lio/radar/sdk/Radar$RadarStatus;

    .line 124
    :goto_7
    iget-object v0, p0, Lio/radar/sdk/api/ApiService$userUpsert$request$2;->$callback:Lkotlin/jvm/functions/Function1;

    new-instance v1, Lio/radar/sdk/api/Error;

    invoke-direct {v1, p1}, Lio/radar/sdk/api/Error;-><init>(Lio/radar/sdk/Radar$RadarStatus;)V

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
