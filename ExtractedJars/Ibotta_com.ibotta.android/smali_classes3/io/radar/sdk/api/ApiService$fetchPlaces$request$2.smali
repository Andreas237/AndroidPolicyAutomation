.class final Lio/radar/sdk/api/ApiService$fetchPlaces$request$2;
.super Ljava/lang/Object;
.source "ApiService.kt"

# interfaces
.implements Lcom/android/volley/Response$ErrorListener;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/radar/sdk/api/ApiService;->fetchPlaces(Landroid/location/Location;Lkotlin/jvm/functions/Function1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nApiService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApiService.kt\nio/radar/sdk/api/ApiService$fetchPlaces$request$2\n*L\n1#1,328:1\n*E\n"
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

    iput-object p1, p0, Lio/radar/sdk/api/ApiService$fetchPlaces$request$2;->this$0:Lio/radar/sdk/api/ApiService;

    iput-object p2, p0, Lio/radar/sdk/api/ApiService$fetchPlaces$request$2;->$callback:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onErrorResponse(Lcom/android/volley/VolleyError;)V
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 171
    iget-object v1, p1, Lcom/android/volley/VolleyError;->networkResponse:Lcom/android/volley/NetworkResponse;

    if-eqz v1, :cond_0

    iget v1, v1, Lcom/android/volley/NetworkResponse;->statusCode:I

    const/16 v2, 0x1ad

    if-ne v1, v2, :cond_0

    .line 173
    iget-object p1, p0, Lio/radar/sdk/api/ApiService$fetchPlaces$request$2;->this$0:Lio/radar/sdk/api/ApiService;

    invoke-static {p1}, Lio/radar/sdk/api/ApiService;->access$getApiRepository$p(Lio/radar/sdk/api/ApiService;)Lio/radar/sdk/api/ApiClientRepository;

    move-result-object p1

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-virtual {p1, v1}, Lio/radar/sdk/api/ApiClientRepository;->setPlacesLimitAt$sdk_release(Ljava/util/Date;)V

    goto :goto_1

    :cond_0
    if-eqz p1, :cond_1

    .line 174
    iget-object v1, p1, Lcom/android/volley/VolleyError;->networkResponse:Lcom/android/volley/NetworkResponse;

    goto :goto_0

    :cond_1
    move-object v1, v0

    :goto_0
    if-eqz v1, :cond_3

    .line 176
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    iget-object p1, p1, Lcom/android/volley/VolleyError;->networkResponse:Lcom/android/volley/NetworkResponse;

    iget-object p1, p1, Lcom/android/volley/NetworkResponse;->data:[B

    const-string v1, "error.networkResponse.data"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/lang/String;

    sget-object v2, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v1, p1, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    invoke-static {v1}, Lcom/newrelic/agent/android/instrumentation/JSONObjectInstrumentation;->init(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    const-string v1, "error"

    .line 177
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    if-eqz p1, :cond_3

    const-string v1, "code"

    .line 179
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result p1

    const/4 v1, 0x4

    if-eq p1, v1, :cond_2

    const/16 v1, 0x11

    if-eq p1, v1, :cond_2

    const/16 v1, 0x155

    if-ne p1, v1, :cond_3

    .line 182
    :cond_2
    iget-object p1, p0, Lio/radar/sdk/api/ApiService$fetchPlaces$request$2;->this$0:Lio/radar/sdk/api/ApiService;

    invoke-static {p1}, Lio/radar/sdk/api/ApiService;->access$getApiRepository$p(Lio/radar/sdk/api/ApiService;)Lio/radar/sdk/api/ApiClientRepository;

    move-result-object p1

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-virtual {p1, v1}, Lio/radar/sdk/api/ApiClientRepository;->setPlacesLimitAt$sdk_release(Ljava/util/Date;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 189
    :catch_0
    :cond_3
    :goto_1
    iget-object p1, p0, Lio/radar/sdk/api/ApiService$fetchPlaces$request$2;->$callback:Lkotlin/jvm/functions/Function1;

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
