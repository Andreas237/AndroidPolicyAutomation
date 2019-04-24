.class final Lo/ahu$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cyx;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ahu;->e(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/cyx<Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Ljava/lang/String;


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 275
    iput-object p1, p0, Lo/ahu$3;->a:Landroid/content/Context;

    iput-object p2, p0, Lo/ahu$3;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;Ljava/lang/String;Z)V
    .locals 6

    .line 278
    if-eqz p3, :cond_0

    .line 279
    const-string v0, "WifiDeviceControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setUserInfo success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 281
    :cond_0
    if-eqz p1, :cond_1

    .line 282
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;->getResultCode()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 283
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;->getResultDesc()Ljava/lang/String;

    move-result-object v5

    .line 284
    const-string v0, "WifiDeviceControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setUserInfo error, errorCode ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " | errorDesc ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 285
    const v0, 0x6acfc00

    if-ne v0, v4, :cond_1

    .line 286
    iget-object v0, p0, Lo/ahu$3;->a:Landroid/content/Context;

    iget-object v1, p0, Lo/ahu$3;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Lo/ahu;->d(Landroid/content/Context;Ljava/lang/String;)V

    .line 290
    :cond_1
    :goto_0
    return-void
.end method

.method public synthetic operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V
    .locals 1

    .line 275
    move-object v0, p1

    check-cast v0, Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;

    invoke-virtual {p0, v0, p2, p3}, Lo/ahu$3;->d(Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;Ljava/lang/String;Z)V

    return-void
.end method
