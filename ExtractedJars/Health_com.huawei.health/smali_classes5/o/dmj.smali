.class public abstract Lo/dmj;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<U:Ljava/lang/Object;>Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field protected a:I

.field protected d:Ljava/lang/String;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput p1, p0, Lo/dmj;->a:I

    .line 37
    return-void
.end method

.method private b()Lcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper<TU;>;"
        }
    .end annotation

    .line 70
    :try_start_0
    new-instance v4, Lorg/json/JSONObject;

    iget-object v0, p0, Lo/dmj;->d:Ljava/lang/String;

    invoke-direct {v4, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 71
    const-string v0, "resultCode"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v6

    .line 72
    const-string v0, "resultDesc"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 73
    new-instance v5, Lcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper;

    iget v0, p0, Lo/dmj;->a:I

    invoke-direct {v5, v6, v7, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper;-><init>(ILjava/lang/String;I)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 74
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    .line 75
    return-object v5

    .line 80
    :cond_0
    goto :goto_0

    .line 77
    :catch_0
    move-exception v6

    .line 78
    const-string v0, "SMART_SmartHttpParser"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "parse common json error "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 79
    new-instance v5, Lcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper;

    const-string v0, "parse json failed"

    iget v1, p0, Lo/dmj;->a:I

    const/16 v2, 0x65

    invoke-direct {v5, v2, v0, v1}, Lcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper;-><init>(ILjava/lang/String;I)V

    .line 82
    :goto_0
    return-object v5
.end method


# virtual methods
.method protected abstract b(Lcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper;)Lcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper<TU;>;)Lcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper<TU;>;"
        }
    .end annotation
.end method

.method public b(Ljava/lang/String;)Lcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Lcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper<TU;>;"
        }
    .end annotation

    .line 45
    iput-object p1, p0, Lo/dmj;->d:Ljava/lang/String;

    .line 47
    invoke-direct {p0}, Lo/dmj;->b()Lcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper;

    move-result-object v1

    .line 49
    invoke-virtual {p0, v1}, Lo/dmj;->b(Lcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper;)Lcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper;

    .line 51
    return-object v1
.end method
