.class public Lcom/huawei/common/applog/bean/ExtraBundle;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "ReportApi/ExtraBundle"


# instance fields
.field private json:Lorg/json/JSONObject;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    iput-object v0, p0, Lcom/huawei/common/applog/bean/ExtraBundle;->json:Lorg/json/JSONObject;

    return-void
.end method


# virtual methods
.method public putData(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 22
    :try_start_0
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 23
    iget-object v0, p0, Lcom/huawei/common/applog/bean/ExtraBundle;->json:Lorg/json/JSONObject;

    invoke-static {p1}, Lcom/huawei/feedback/e;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p2}, Lcom/huawei/feedback/e;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 24
    const-string v0, "ReportApi/ExtraBundle"

    const-string v1, "putData data!"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    :cond_0
    goto :goto_0

    .line 26
    :catch_0
    move-exception v3

    .line 28
    const-string v0, "ReportApi/ExtraBundle"

    const-string v1, "putData JSONException!"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    :goto_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/huawei/common/applog/bean/ExtraBundle;->json:Lorg/json/JSONObject;

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
