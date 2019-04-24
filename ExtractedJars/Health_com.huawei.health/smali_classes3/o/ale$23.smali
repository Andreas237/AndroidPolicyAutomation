.class Lo/ale$23;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cyx;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ale;->ad()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/cyx<Lcom/huawei/hwcloudmodel/model/userprofile/MergeUserAllDataRsp;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lo/ale;


# direct methods
.method constructor <init>(Lo/ale;)V
    .locals 0

    .line 1499
    iput-object p1, p0, Lo/ale$23;->a:Lo/ale;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/hwcloudmodel/model/userprofile/MergeUserAllDataRsp;Ljava/lang/String;Z)V
    .locals 8

    .line 1502
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: sendMigrageDataToCloud mergeUserAllData back"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1503
    iget-object v0, p0, Lo/ale$23;->a:Lo/ale;

    invoke-static {v0}, Lo/ale;->q(Lo/ale;)I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 1504
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: sendMigrageDataToCloud mergeUserAllData back but already timeout,exit app"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1505
    return-void

    .line 1507
    :cond_0
    iget-object v0, p0, Lo/ale$23;->a:Lo/ale;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/ale;->c(Lo/ale;I)I

    .line 1508
    if-eqz p1, :cond_2

    .line 1509
    invoke-static {}, Lo/dcs;->e()Lo/dcs;

    move-result-object v0

    iget-object v1, p0, Lo/ale$23;->a:Lo/ale;

    invoke-static {v1}, Lo/ale;->t(Lo/ale;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/ale$23;->a:Lo/ale;

    invoke-static {v2}, Lo/ale;->e(Lo/ale;)Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/dcs;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 1510
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/userprofile/MergeUserAllDataRsp;->getResultCode()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v0, :cond_1

    .line 1511
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: sendMigrageDataToCloud but cloud return  var1.getResultCode() = 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1512
    iget-object v0, p0, Lo/ale$23;->a:Lo/ale;

    invoke-static {v0}, Lo/ale;->r(Lo/ale;)V

    goto/16 :goto_1

    .line 1514
    :cond_1
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: sendMigrageDataToCloud but cloud return var1 != null but var1.getResultCode() ! = 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_1

    .line 1517
    :cond_2
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: sendMigrageDataToCloud cancel var1 = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1519
    :try_start_0
    invoke-static {p2}, Lo/alg;->c(Ljava/lang/String;)J

    move-result-wide v6

    .line 1520
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: sendMigrageDataToCloud but cloud return faild error_coed = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1521
    invoke-static {}, Lo/dcs;->e()Lo/dcs;

    move-result-object v0

    iget-object v1, p0, Lo/ale$23;->a:Lo/ale;

    invoke-static {v1}, Lo/ale;->t(Lo/ale;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/ale$23;->a:Lo/ale;

    invoke-static {v2}, Lo/ale;->e(Lo/ale;)Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/dcs;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 1522
    const-wide/16 v0, 0x3e7

    cmp-long v0, v6, v0

    if-nez v0, :cond_3

    .line 1523
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: sendMigrageDataToCloud but cloud return faild var2.getResultCode() = 999 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1524
    iget-object v0, p0, Lo/ale$23;->a:Lo/ale;

    invoke-static {v0}, Lo/ale;->n(Lo/ale;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xfab

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 1525
    :cond_3
    const-wide/16 v0, 0x791d

    cmp-long v0, v6, v0

    if-nez v0, :cond_4

    .line 1526
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: sendMigrageDataToCloud but cloud return faild var2.getResultCode() = 31005 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1527
    iget-object v0, p0, Lo/ale$23;->a:Lo/ale;

    invoke-static {v0}, Lo/ale;->e(Lo/ale;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x271f

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "is_auth_failed_migrate"

    const-string v3, "is_auth_failed_migrate_true"

    new-instance v4, Lo/dcy;

    const/4 v5, 0x0

    invoke-direct {v4, v5}, Lo/dcy;-><init>(I)V

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 1531
    iget-object v0, p0, Lo/ale$23;->a:Lo/ale;

    invoke-static {v0}, Lo/ale;->r(Lo/ale;)V

    .line 1533
    :cond_4
    :goto_0
    invoke-static {v6, v7}, Lo/alg;->d(J)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1539
    goto :goto_1

    .line 1534
    :catch_0
    move-exception v6

    .line 1535
    iget-object v0, p0, Lo/ale$23;->a:Lo/ale;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/ale;->c(Lo/ale;I)I

    .line 1536
    const-wide/16 v0, 0x3eb

    invoke-static {v0, v1}, Lo/alg;->d(J)V

    .line 1537
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "accountmigrate: sendMigrageDataToCloud but cloud return faild var2.getResultCode() NumberFormatException : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1538
    iget-object v0, p0, Lo/ale$23;->a:Lo/ale;

    invoke-static {v0}, Lo/ale;->n(Lo/ale;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xfac

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1541
    :goto_1
    return-void
.end method

.method public synthetic operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V
    .locals 1

    .line 1499
    move-object v0, p1

    check-cast v0, Lcom/huawei/hwcloudmodel/model/userprofile/MergeUserAllDataRsp;

    invoke-virtual {p0, v0, p2, p3}, Lo/ale$23;->a(Lcom/huawei/hwcloudmodel/model/userprofile/MergeUserAllDataRsp;Ljava/lang/String;Z)V

    return-void
.end method
