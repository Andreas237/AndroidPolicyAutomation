.class Lo/ahx$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cyx;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ahx;->e(Lcom/huawei/hihealth/HiHealthData;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/cyx<Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic d:Lo/ahx;


# direct methods
.method constructor <init>(Lo/ahx;Ljava/lang/String;)V
    .locals 0

    .line 172
    iput-object p1, p0, Lo/ahx$1;->d:Lo/ahx;

    iput-object p2, p0, Lo/ahx$1;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;Ljava/lang/String;Z)V
    .locals 6

    .line 176
    const-string v0, "SaveClaimWeightDataTask"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveSingleCloudData  isSuccess"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 177
    if-eqz p3, :cond_0

    .line 178
    iget-object v0, p0, Lo/ahx$1;->d:Lo/ahx;

    invoke-static {v0}, Lo/ahx;->e(Lo/ahx;)Lo/ahx$c;

    move-result-object v0

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Lo/ahx$c;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    goto :goto_0

    .line 180
    :cond_0
    if-eqz p1, :cond_1

    .line 181
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;->getResultCode()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 182
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;->getResultDesc()Ljava/lang/String;

    move-result-object v5

    .line 183
    const-string v0, "SaveClaimWeightDataTask"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "saveSingleCloudData error, errorCode ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " | errorDesc ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 184
    const v0, 0x6acfc00

    if-ne v0, v4, :cond_1

    .line 185
    iget-object v0, p0, Lo/ahx$1;->a:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-static {v1, v0}, Lo/ahu;->d(Landroid/content/Context;Ljava/lang/String;)V

    .line 186
    iget-object v0, p0, Lo/ahx$1;->d:Lo/ahx;

    invoke-static {v0}, Lo/ahx;->e(Lo/ahx;)Lo/ahx$c;

    move-result-object v0

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Lo/ahx$c;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 187
    return-void

    .line 191
    :cond_1
    iget-object v0, p0, Lo/ahx$1;->d:Lo/ahx;

    invoke-static {v0}, Lo/ahx;->b(Lo/ahx;)Lo/abz;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 192
    iget-object v0, p0, Lo/ahx$1;->d:Lo/ahx;

    invoke-static {v0}, Lo/ahx;->b(Lo/ahx;)Lo/abz;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/abz;->a(Z)V

    .line 195
    :cond_2
    :goto_0
    return-void
.end method

.method public synthetic operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V
    .locals 1

    .line 172
    move-object v0, p1

    check-cast v0, Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;

    invoke-virtual {p0, v0, p2, p3}, Lo/ahx$1;->a(Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;Ljava/lang/String;Z)V

    return-void
.end method
