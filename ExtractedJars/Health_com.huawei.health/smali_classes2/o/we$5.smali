.class Lo/we$5;
.super Lcom/android/volley/toolbox/JsonObjectRequest;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/we;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILorg/json/JSONObject;Ljava/util/Map;Lo/wo;Landroid/os/Bundle;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic d:Lo/we;


# direct methods
.method constructor <init>(Lo/we;ILjava/lang/String;Lorg/json/JSONObject;Lcom/android/volley/Response$Listener;Lcom/android/volley/Response$ErrorListener;Landroid/content/Context;)V
    .locals 6

    .line 194
    iput-object p1, p0, Lo/we$5;->d:Lo/we;

    iput-object p7, p0, Lo/we$5;->a:Landroid/content/Context;

    move-object v0, p0

    move v1, p2

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    move-object v5, p6

    invoke-direct/range {v0 .. v5}, Lcom/android/volley/toolbox/JsonObjectRequest;-><init>(ILjava/lang/String;Lorg/json/JSONObject;Lcom/android/volley/Response$Listener;Lcom/android/volley/Response$ErrorListener;)V

    return-void
.end method


# virtual methods
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

    .line 208
    invoke-super {p0}, Lcom/android/volley/toolbox/JsonObjectRequest;->getHeaders()Ljava/util/Map;

    move-result-object v2

    .line 210
    if-eqz v2, :cond_0

    .line 211
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/Map;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 212
    :cond_0
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 215
    :cond_1
    const-string v0, "x-huid"

    invoke-interface {v2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 217
    const-string v0, "x-huid"

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lo/vu;->a(Landroid/content/Context;)Lo/vu;

    move-result-object v1

    invoke-virtual {v1}, Lo/vu;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 219
    :cond_2
    const-string v0, "x-version"

    invoke-interface {v2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 220
    const-string v0, "x-version"

    const-string v1, "1"

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 222
    :cond_3
    iget-object v0, p0, Lo/we$5;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/wi;->e(Landroid/content/Context;)Lo/wi;

    move-result-object v0

    invoke-virtual {v0, v2}, Lo/wi;->a(Ljava/util/Map;)V

    .line 224
    return-object v2
.end method

.method public parseNetworkResponse(Lcom/android/volley/NetworkResponse;)Lcom/android/volley/Response;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/android/volley/NetworkResponse;)Lcom/android/volley/Response<Lorg/json/JSONObject;>;"
        }
    .end annotation

    .line 197
    iget-object v0, p1, Lcom/android/volley/NetworkResponse;->headers:Ljava/util/Map;

    const-string v1, "Set-Cookie"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    .line 198
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    .line 199
    iget-object v0, p0, Lo/we$5;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/wi;->e(Landroid/content/Context;)Lo/wi;

    move-result-object v0

    iget-object v1, p1, Lcom/android/volley/NetworkResponse;->headers:Ljava/util/Map;

    invoke-virtual {v0, v1}, Lo/wi;->d(Ljava/util/Map;)V

    .line 203
    :cond_0
    invoke-super {p0, p1}, Lcom/android/volley/toolbox/JsonObjectRequest;->parseNetworkResponse(Lcom/android/volley/NetworkResponse;)Lcom/android/volley/Response;

    move-result-object v0

    return-object v0
.end method
