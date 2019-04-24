.class public Lcom/huawei/hwcloudmodel/model/CustomStringRequest;
.super Lcom/android/volley/toolbox/StringRequest;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "CustomStringRequest"


# instance fields
.field private mMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ILjava/lang/String;Lcom/android/volley/Response$Listener;Lcom/android/volley/Response$ErrorListener;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/lang/String;Lcom/android/volley/Response$Listener<Ljava/lang/String;>;Lcom/android/volley/Response$ErrorListener;)V"
        }
    .end annotation

    .line 28
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/android/volley/toolbox/StringRequest;-><init>(ILjava/lang/String;Lcom/android/volley/Response$Listener;Lcom/android/volley/Response$ErrorListener;)V

    .line 17
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/model/CustomStringRequest;->mMap:Ljava/util/Map;

    .line 29
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Lcom/android/volley/Response$Listener;Lcom/android/volley/Response$ErrorListener;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/lang/String;Lcom/android/volley/Response$Listener<Ljava/lang/String;>;Lcom/android/volley/Response$ErrorListener;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 34
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/android/volley/toolbox/StringRequest;-><init>(ILjava/lang/String;Lcom/android/volley/Response$Listener;Lcom/android/volley/Response$ErrorListener;)V

    .line 17
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/model/CustomStringRequest;->mMap:Ljava/util/Map;

    .line 35
    iput-object p5, p0, Lcom/huawei/hwcloudmodel/model/CustomStringRequest;->mMap:Ljava/util/Map;

    .line 37
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Lorg/json/JSONObject;Lcom/android/volley/Response$Listener;Lcom/android/volley/Response$ErrorListener;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/lang/String;Lorg/json/JSONObject;Lcom/android/volley/Response$Listener<Ljava/lang/String;>;Lcom/android/volley/Response$ErrorListener;)V"
        }
    .end annotation

    .line 42
    invoke-direct {p0, p1, p2, p4, p5}, Lcom/android/volley/toolbox/StringRequest;-><init>(ILjava/lang/String;Lcom/android/volley/Response$Listener;Lcom/android/volley/Response$ErrorListener;)V

    .line 17
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/model/CustomStringRequest;->mMap:Ljava/util/Map;

    .line 43
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/android/volley/Response$Listener;Lcom/android/volley/Response$ErrorListener;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Lcom/android/volley/Response$Listener<Ljava/lang/String;>;Lcom/android/volley/Response$ErrorListener;)V"
        }
    .end annotation

    .line 22
    invoke-direct {p0, p1, p2, p3}, Lcom/android/volley/toolbox/StringRequest;-><init>(Ljava/lang/String;Lcom/android/volley/Response$Listener;Lcom/android/volley/Response$ErrorListener;)V

    .line 17
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/model/CustomStringRequest;->mMap:Ljava/util/Map;

    .line 23
    return-void
.end method


# virtual methods
.method public bridge synthetic deliverResponse(Ljava/lang/Object;)V
    .locals 1

    .line 16
    move-object v0, p1

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/hwcloudmodel/model/CustomStringRequest;->deliverResponse(Ljava/lang/String;)V

    return-void
.end method

.method public deliverResponse(Ljava/lang/String;)V
    .locals 0

    .line 56
    invoke-super {p0, p1}, Lcom/android/volley/toolbox/StringRequest;->deliverResponse(Ljava/lang/String;)V

    .line 57
    return-void
.end method

.method public getHeaders()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/android/volley/AuthFailureError;
        }
    .end annotation

    .line 47
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 48
    const-string v0, "Accept"

    const-string v1, "application/json"

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    const-string v0, "Content-Type"

    const-string v1, "application/x-www-form-urlencoded"

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    return-object v2
.end method

.method public getParams()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/android/volley/AuthFailureError;
        }
    .end annotation

    .line 62
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/CustomStringRequest;->mMap:Ljava/util/Map;

    return-object v0
.end method

.method public parseNetworkResponse(Lcom/android/volley/NetworkResponse;)Lcom/android/volley/Response;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/android/volley/NetworkResponse;)Lcom/android/volley/Response<Ljava/lang/String;>;"
        }
    .end annotation

    .line 68
    :try_start_0
    new-instance v2, Ljava/lang/String;

    iget-object v0, p1, Lcom/android/volley/NetworkResponse;->data:[B

    const-string v1, "utf-8"

    invoke-direct {v2, v0, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    .line 69
    .line 70
    invoke-static {p1}, Lcom/android/volley/toolbox/HttpHeaderParser;->parseCacheHeaders(Lcom/android/volley/NetworkResponse;)Lcom/android/volley/Cache$Entry;

    move-result-object v0

    .line 69
    invoke-static {v2, v0}, Lcom/android/volley/Response;->success(Ljava/lang/Object;Lcom/android/volley/Cache$Entry;)Lcom/android/volley/Response;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 71
    :catch_0
    move-exception v2

    .line 72
    new-instance v0, Lcom/android/volley/ParseError;

    invoke-direct {v0, v2}, Lcom/android/volley/ParseError;-><init>(Ljava/lang/Throwable;)V

    invoke-static {v0}, Lcom/android/volley/Response;->error(Lcom/android/volley/VolleyError;)Lcom/android/volley/Response;

    move-result-object v0

    return-object v0
.end method
