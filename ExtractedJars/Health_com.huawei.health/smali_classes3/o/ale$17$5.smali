.class Lo/ale$17$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cyx;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ale$17;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/cyx<Lcom/huawei/hwcloudmodel/model/userprofile/GetUserMergeInfoRsp;>;"
    }
.end annotation


# instance fields
.field final synthetic b:Lo/ale$17;


# direct methods
.method constructor <init>(Lo/ale$17;)V
    .locals 0

    .line 1335
    iput-object p1, p0, Lo/ale$17$5;->b:Lo/ale$17;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Lcom/huawei/hwcloudmodel/model/userprofile/GetUserMergeInfoRsp;Ljava/lang/String;Z)V
    .locals 8

    .line 1338
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate:checkIsReceivedCloudPush() getUserMergeInfo call back"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1339
    if-eqz p1, :cond_2

    .line 1340
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "accountmigrate: checkIsReceivedCloudPush() getUserMergeInfo "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/userprofile/GetUserMergeInfoRsp;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " text = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "isSuccess = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1341
    iget-object v0, p0, Lo/ale$17$5;->b:Lo/ale$17;

    iget-object v0, v0, Lo/ale$17;->b:Lo/ale;

    invoke-static {v0}, Lo/ale;->e(Lo/ale;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/alg;->e(Landroid/content/Context;)V

    .line 1342
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/userprofile/GetUserMergeInfoRsp;->getUserMergeInfos()Ljava/util/List;

    move-result-object v4

    .line 1343
    const/4 v5, 0x0

    :goto_0
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_1

    .line 1344
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcloudmodel/model/userprofile/UserMergeInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcloudmodel/model/userprofile/UserMergeInfo;->getOriginalHuid()Ljava/lang/String;

    move-result-object v6

    .line 1345
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcloudmodel/model/userprofile/UserMergeInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcloudmodel/model/userprofile/UserMergeInfo;->getStatus()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v7

    .line 1346
    const/4 v0, 0x1

    if-ne v7, v0, :cond_0

    .line 1347
    invoke-static {}, Lo/dcs;->e()Lo/dcs;

    move-result-object v0

    iget-object v1, p0, Lo/ale$17$5;->b:Lo/ale$17;

    iget-object v1, v1, Lo/ale$17;->b:Lo/ale;

    invoke-static {v1}, Lo/ale;->e(Lo/ale;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v6, v1}, Lo/dcs;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 1343
    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 1350
    :cond_1
    iget-object v0, p0, Lo/ale$17$5;->b:Lo/ale$17;

    iget-object v0, v0, Lo/ale$17;->b:Lo/ale;

    invoke-static {v0}, Lo/ale;->n(Lo/ale;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xfb1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1351
    goto :goto_1

    .line 1352
    :cond_2
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: checkIsReceivedCloudPush() getUserMergeInfo == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1354
    :goto_1
    return-void
.end method

.method public synthetic operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V
    .locals 1

    .line 1335
    move-object v0, p1

    check-cast v0, Lcom/huawei/hwcloudmodel/model/userprofile/GetUserMergeInfoRsp;

    invoke-virtual {p0, v0, p2, p3}, Lo/ale$17$5;->d(Lcom/huawei/hwcloudmodel/model/userprofile/GetUserMergeInfoRsp;Ljava/lang/String;Z)V

    return-void
.end method
