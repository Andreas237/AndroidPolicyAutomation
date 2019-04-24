.class Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cyx;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->c(Ljava/lang/String;Ljava/lang/String;)V
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
.field final synthetic a:Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 311
    iput-object p1, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$3;->a:Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;

    iput-object p2, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$3;->e:Ljava/lang/String;

    iput-object p3, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$3;->d:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lcom/huawei/hwcloudmodel/model/userprofile/MergeUserAllDataRsp;Ljava/lang/String;Z)V
    .locals 6

    .line 314
    const-string v0, "Login_ThirdPartyLoginActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: sendMigrageDataToCloud mergeUserAllData back"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 315
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$3;->e:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$3;->d:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$3;->a:Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->c(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;)Landroid/app/Activity;

    move-result-object v2

    invoke-static {v2}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/eul;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 317
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$3;->a:Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->b(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xe

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 318
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$3;->a:Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->e(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;)I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 319
    const-string v0, "Login_ThirdPartyLoginActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: sendMigraAgeDataToCloud mergeUserAllData back but already timeout,exit app"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 320
    return-void

    .line 322
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$3;->a:Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->d(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;I)I

    .line 323
    if-eqz p1, :cond_1

    .line 324
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/userprofile/MergeUserAllDataRsp;->getResultCode()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v0, :cond_3

    .line 325
    const-string v0, "Login_ThirdPartyLoginActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: sendMigrageDataToCloud but cloud return  var1.getResultCode() = 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 326
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$3;->a:Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->c(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;)Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v4

    .line 328
    :try_start_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$3;->a:Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$3;->e:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-static {v0, v1, v4, v2}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->e(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;Ljava/lang/String;Ljava/lang/String;Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 331
    goto :goto_0

    .line 329
    :catch_0
    move-exception v5

    .line 330
    const-string v0, "Login_ThirdPartyLoginActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: copyData copyHealthDatasFromAtoB down and iscopysuccessful Exception"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 332
    :goto_0
    goto/16 :goto_1

    .line 334
    :cond_1
    const-string v0, "Login_ThirdPartyLoginActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: sendMigrageDataToCloud cancel var1 = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 336
    :try_start_1
    invoke-static {p2}, Lo/eul;->a(Ljava/lang/String;)J

    move-result-wide v4

    .line 337
    const-wide/16 v0, 0x3e7

    cmp-long v0, v4, v0

    if-nez v0, :cond_2

    .line 338
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$3;->a:Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->b(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xfab

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 340
    :cond_2
    invoke-static {v4, v5}, Lo/eul;->e(J)V

    .line 341
    const-string v0, "Login_ThirdPartyLoginActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: sendMigrageDataToCloud but cloud return faild var1.getResultCode() = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    .line 348
    goto :goto_1

    .line 342
    :catch_1
    move-exception v4

    .line 344
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$3;->a:Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->d(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;I)I

    .line 345
    const-wide/16 v0, 0x3eb

    invoke-static {v0, v1}, Lo/eul;->e(J)V

    .line 346
    const-string v0, "Login_ThirdPartyLoginActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "accountmigrate: sendMigrageDataToCloud but cloud return faild var2.getResultCode() NumberFormatException : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 347
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$3;->a:Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->b(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xe

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 351
    :cond_3
    :goto_1
    return-void
.end method

.method public synthetic operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V
    .locals 1

    .line 311
    move-object v0, p1

    check-cast v0, Lcom/huawei/hwcloudmodel/model/userprofile/MergeUserAllDataRsp;

    invoke-virtual {p0, v0, p2, p3}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$3;->b(Lcom/huawei/hwcloudmodel/model/userprofile/MergeUserAllDataRsp;Ljava/lang/String;Z)V

    return-void
.end method
