.class public Lcom/huawei/ui/main/stories/nps/interactors/mode/GsonRequest;
.super Lcom/android/volley/Request;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:Ljava/lang/Object;>Lcom/android/volley/Request<TT;>;"
    }
.end annotation


# instance fields
.field private final mClazz:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<TT;>;"
        }
    .end annotation
.end field

.field private final mGson:Lcom/google/gson/Gson;

.field private final mHeaders:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private final mJsonObject:Lorg/json/JSONObject;

.field private final mListener:Lcom/android/volley/Response$Listener;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/volley/Response$Listener<TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ILjava/lang/String;Lorg/json/JSONObject;Ljava/lang/Class;Ljava/util/Map;Lcom/android/volley/Response$Listener;Lcom/android/volley/Response$ErrorListener;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/lang/String;Lorg/json/JSONObject;Ljava/lang/Class<TT;>;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;Lcom/android/volley/Response$Listener<TT;>;Lcom/android/volley/Response$ErrorListener;)V"
        }
    .end annotation

    .line 35
    invoke-direct {p0, p1, p2, p7}, Lcom/android/volley/Request;-><init>(ILjava/lang/String;Lcom/android/volley/Response$ErrorListener;)V

    .line 20
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/mode/GsonRequest;->mGson:Lcom/google/gson/Gson;

    .line 36
    iput-object p3, p0, Lcom/huawei/ui/main/stories/nps/interactors/mode/GsonRequest;->mJsonObject:Lorg/json/JSONObject;

    .line 37
    iput-object p4, p0, Lcom/huawei/ui/main/stories/nps/interactors/mode/GsonRequest;->mClazz:Ljava/lang/Class;

    .line 38
    iput-object p5, p0, Lcom/huawei/ui/main/stories/nps/interactors/mode/GsonRequest;->mHeaders:Ljava/util/Map;

    .line 39
    iput-object p6, p0, Lcom/huawei/ui/main/stories/nps/interactors/mode/GsonRequest;->mListener:Lcom/android/volley/Response$Listener;

    .line 40
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/Class;Lcom/android/volley/Response$Listener;Lcom/android/volley/Response$ErrorListener;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/Class<TT;>;Lcom/android/volley/Response$Listener<TT;>;Lcom/android/volley/Response$ErrorListener;)V"
        }
    .end annotation

    .line 28
    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v6, p4

    move-object v7, p5

    const/4 v1, 0x1

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v7}, Lcom/huawei/ui/main/stories/nps/interactors/mode/GsonRequest;-><init>(ILjava/lang/String;Lorg/json/JSONObject;Ljava/lang/Class;Ljava/util/Map;Lcom/android/volley/Response$Listener;Lcom/android/volley/Response$ErrorListener;)V

    .line 30
    return-void
.end method


# virtual methods
.method public deliverResponse(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 66
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/mode/GsonRequest;->mListener:Lcom/android/volley/Response$Listener;

    invoke-interface {v0, p1}, Lcom/android/volley/Response$Listener;->onResponse(Ljava/lang/Object;)V

    .line 68
    return-void
.end method

.method public getBody()[B
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/android/volley/AuthFailureError;
        }
    .end annotation

    .line 45
    const/4 v4, 0x0

    .line 47
    :try_start_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/mode/GsonRequest;->mJsonObject:Lorg/json/JSONObject;

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "UTF-8"

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v4, v0

    .line 50
    goto :goto_0

    .line 48
    :catch_0
    move-exception v5

    .line 49
    const-string v0, "GsonRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "UnsupportedEncodingException e"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 52
    :goto_0
    return-object v4
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

    .line 58
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 59
    const-string v0, "Accept"

    const-string v1, "application/json"

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    const-string v0, "Content-Type"

    const-string v1, "application/json; charset=UTF-8"

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
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

    .line 86
    invoke-super {p0}, Lcom/android/volley/Request;->getParams()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public parseNetworkResponse(Lcom/android/volley/NetworkResponse;)Lcom/android/volley/Response;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/android/volley/NetworkResponse;)Lcom/android/volley/Response<TT;>;"
        }
    .end annotation

    .line 73
    :try_start_0
    new-instance v2, Ljava/lang/String;

    iget-object v0, p1, Lcom/android/volley/NetworkResponse;->data:[B

    const-string v1, "utf-8"

    invoke-direct {v2, v0, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    .line 74
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/mode/GsonRequest;->mGson:Lcom/google/gson/Gson;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/nps/interactors/mode/GsonRequest;->mClazz:Ljava/lang/Class;

    invoke-virtual {v0, v2, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    .line 75
    invoke-static {p1}, Lcom/android/volley/toolbox/HttpHeaderParser;->parseCacheHeaders(Lcom/android/volley/NetworkResponse;)Lcom/android/volley/Cache$Entry;

    move-result-object v1

    .line 74
    invoke-static {v0, v1}, Lcom/android/volley/Response;->success(Ljava/lang/Object;Lcom/android/volley/Cache$Entry;)Lcom/android/volley/Response;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 76
    :catch_0
    move-exception v2

    .line 78
    new-instance v0, Lcom/android/volley/ParseError;

    invoke-direct {v0, v2}, Lcom/android/volley/ParseError;-><init>(Ljava/lang/Throwable;)V

    invoke-static {v0}, Lcom/android/volley/Response;->error(Lcom/android/volley/VolleyError;)Lcom/android/volley/Response;

    move-result-object v0

    return-object v0
.end method
