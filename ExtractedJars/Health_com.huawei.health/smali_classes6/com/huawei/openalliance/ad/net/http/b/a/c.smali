.class public Lcom/huawei/openalliance/ad/net/http/b/a/c;
.super Lcom/huawei/openalliance/ad/net/http/b/a/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/huawei/openalliance/ad/net/http/b/a/a<Ljava/lang/Object;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/net/http/b/a/a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    const-string v0, "application/json"

    return-object v0
.end method

.method protected a(Ljava/lang/Object;)Ljava/lang/String;
    .locals 3

    if-nez p1, :cond_0

    const-string v0, ""

    goto :goto_0

    :cond_0
    :try_start_0
    invoke-static {p1}, Lcom/huawei/openalliance/ad/utils/p;->a(Ljava/lang/Object;)Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v2

    const-string v0, "JsonBeanConverter"

    const-string v1, "convert json JSONException!"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    throw v2
.end method
