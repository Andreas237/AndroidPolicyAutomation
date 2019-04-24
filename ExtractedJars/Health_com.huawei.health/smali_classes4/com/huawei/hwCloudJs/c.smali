.class public Lcom/huawei/hwCloudJs/c;
.super Ljava/lang/Object;


# static fields
.field private static final a:Ljava/lang/String; = "JSUtils"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/huawei/hwCloudJs/api/JsParam;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/hwCloudJs/api/JsParam;
    .locals 2

    move-object v1, p0

    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    invoke-virtual {v1, p1}, Lcom/huawei/hwCloudJs/api/JsParam;->setAppId(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Lcom/huawei/hwCloudJs/api/JsParam;->setWebUrl(Ljava/lang/String;)V

    invoke-virtual {v1, p3}, Lcom/huawei/hwCloudJs/api/JsParam;->setBridgeId(Ljava/lang/String;)V

    :cond_0
    return-object v1
.end method

.method public static a(Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 4

    const/4 v2, 0x0

    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v2, v0

    goto :goto_0

    :catch_0
    move-exception v3

    const-string v0, "JSUtils"

    const-string v1, "json2Object error"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-object v2
.end method

.method public static a(Landroid/webkit/WebView;)V
    .locals 4

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    const-string v0, "code"

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v3

    const-string v0, "JSUtils"

    const-string v1, "jsReady  put data error"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    const-string v0, "event_inner_ready"

    invoke-static {v0, v2}, Lcom/huawei/hwCloudJs/c/a;->a(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    invoke-static {p0, v3}, Lcom/huawei/hwCloudJs/c;->a(Landroid/webkit/WebView;Ljava/lang/String;)V

    return-void
.end method

.method public static a(Landroid/webkit/WebView;I)V
    .locals 1

    const-string v0, ""

    invoke-static {p0, p1, v0}, Lcom/huawei/hwCloudJs/c;->a(Landroid/webkit/WebView;ILjava/lang/String;)V

    return-void
.end method

.method public static a(Landroid/webkit/WebView;ILjava/lang/String;)V
    .locals 3

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    const-string v0, "code"

    :try_start_0
    invoke-virtual {v1, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v0, "message"

    invoke-virtual {v1, v0, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    return-void

    :goto_0
    const-string v0, "event_inner_error"

    invoke-static {v0, v1}, Lcom/huawei/hwCloudJs/c/a;->a(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p0, v2}, Lcom/huawei/hwCloudJs/c;->a(Landroid/webkit/WebView;Ljava/lang/String;)V

    return-void
.end method

.method public static a(Landroid/webkit/WebView;Lcom/huawei/hwCloudJs/service/jsmsg/NativeMsg;)V
    .locals 1

    invoke-static {p1}, Lcom/huawei/hwCloudJs/c/a;->a(Lcom/huawei/hwCloudJs/service/jsmsg/NativeMsg;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/huawei/hwCloudJs/c;->a(Landroid/webkit/WebView;Ljava/lang/String;)V

    return-void
.end method

.method public static a(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 1

    new-instance v0, Lcom/huawei/hwCloudJs/c$1;

    invoke-direct {v0, p0, p1}, Lcom/huawei/hwCloudJs/c$1;-><init>(Landroid/webkit/WebView;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Landroid/webkit/WebView;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public static a(Landroid/webkit/WebView;Ljava/lang/String;ILjava/lang/String;)V
    .locals 1

    new-instance v0, Lcom/huawei/hwCloudJs/core/JsCallback;

    invoke-direct {v0, p0, p1, p3}, Lcom/huawei/hwCloudJs/core/JsCallback;-><init>(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Lcom/huawei/hwCloudJs/core/JsCallback;->failure(I)V

    return-void
.end method
