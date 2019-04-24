.class public Lcom/tencent/stat/NetworkMonitor;
.super Ljava/lang/Object;


# instance fields
.field private a:J

.field private b:I

.field private c:Ljava/lang/String;

.field private d:I

.field private e:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/tencent/stat/NetworkMonitor;->a:J

    const/4 v0, 0x0

    iput v0, p0, Lcom/tencent/stat/NetworkMonitor;->b:I

    const-string v0, ""

    iput-object v0, p0, Lcom/tencent/stat/NetworkMonitor;->c:Ljava/lang/String;

    const/4 v0, 0x0

    iput v0, p0, Lcom/tencent/stat/NetworkMonitor;->d:I

    const-string v0, ""

    iput-object v0, p0, Lcom/tencent/stat/NetworkMonitor;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getDomain()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/tencent/stat/NetworkMonitor;->c:Ljava/lang/String;

    return-object v0
.end method

.method public getMillisecondsConsume()J
    .locals 2

    iget-wide v0, p0, Lcom/tencent/stat/NetworkMonitor;->a:J

    return-wide v0
.end method

.method public getPort()I
    .locals 1

    iget v0, p0, Lcom/tencent/stat/NetworkMonitor;->d:I

    return v0
.end method

.method public getRemoteIp()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/tencent/stat/NetworkMonitor;->e:Ljava/lang/String;

    return-object v0
.end method

.method public getStatusCode()I
    .locals 1

    iget v0, p0, Lcom/tencent/stat/NetworkMonitor;->b:I

    return v0
.end method

.method public setDomain(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/tencent/stat/NetworkMonitor;->c:Ljava/lang/String;

    return-void
.end method

.method public setMillisecondsConsume(J)V
    .locals 0

    iput-wide p1, p0, Lcom/tencent/stat/NetworkMonitor;->a:J

    return-void
.end method

.method public setPort(I)V
    .locals 0

    iput p1, p0, Lcom/tencent/stat/NetworkMonitor;->d:I

    return-void
.end method

.method public setRemoteIp(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/tencent/stat/NetworkMonitor;->e:Ljava/lang/String;

    return-void
.end method

.method public setStatusCode(I)V
    .locals 0

    iput p1, p0, Lcom/tencent/stat/NetworkMonitor;->b:I

    return-void
.end method

.method public toJSONObject()Lorg/json/JSONObject;
    .locals 7

    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    const-string v0, "tm"

    :try_start_0
    iget-wide v1, p0, Lcom/tencent/stat/NetworkMonitor;->a:J

    invoke-virtual {v5, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v0, "st"

    iget v1, p0, Lcom/tencent/stat/NetworkMonitor;->b:I

    invoke-virtual {v5, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    iget-object v0, p0, Lcom/tencent/stat/NetworkMonitor;->c:Ljava/lang/String;

    if-eqz v0, :cond_0

    const-string v0, "dm"

    iget-object v1, p0, Lcom/tencent/stat/NetworkMonitor;->c:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_0
    const-string v0, "pt"

    iget v1, p0, Lcom/tencent/stat/NetworkMonitor;->d:I

    invoke-virtual {v5, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    iget-object v0, p0, Lcom/tencent/stat/NetworkMonitor;->e:Ljava/lang/String;

    if-eqz v0, :cond_1

    const-string v0, "rip"

    iget-object v1, p0, Lcom/tencent/stat/NetworkMonitor;->e:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_1
    const-string v0, "ts"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    const-wide/16 v3, 0x3e8

    div-long/2addr v1, v3

    invoke-virtual {v5, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v6

    :goto_0
    return-object v5
.end method
