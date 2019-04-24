.class Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eug;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->d(Lo/eui;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;)V
    .locals 0

    .line 395
    iput-object p1, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$8;->b:Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 4

    .line 443
    const-string v0, "Login_ThirdPartyLoginActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HuaweiCloudLogin.login onFailure errcode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "; errmsg = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 444
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$8;->b:Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->b(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xfac

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 445
    return-void
.end method

.method public b(Ljava/lang/Object;)V
    .locals 9

    .line 398
    const-string v0, "Login_ThirdPartyLoginActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HuaweiCloudLogin.login onSuccess"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 400
    move-object v4, p1

    :try_start_0
    check-cast v4, Lo/eui;

    .line 401
    invoke-virtual {v4}, Lo/eui;->d()Ljava/lang/String;

    move-result-object v5

    .line 402
    sget-object v0, Lcom/huawei/hwcommonmodel/application/BaseApplication$e;->d:Lcom/huawei/hwcommonmodel/application/BaseApplication$e;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->d()Lcom/huawei/hwcommonmodel/application/BaseApplication$e;

    move-result-object v1

    if-ne v0, v1, :cond_1

    .line 403
    const-string v0, "Login_ThirdPartyLoginActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: account check success,apptype = health"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 404
    const-string v0, "Login_ThirdPartyLoginActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: account check success,accountContext1 = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 405
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$8;->b:Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->c(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;)Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 406
    const-string v0, "Login_ThirdPartyLoginActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: account is same"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 407
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$8;->b:Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->b(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 409
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$8;->b:Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;

    invoke-static {v0, v4}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->b(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;Lo/eui;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 411
    :goto_0
    return-void

    .line 413
    :cond_1
    :try_start_1
    invoke-virtual {v4}, Lo/eui;->c()Ljava/lang/String;

    move-result-object v6

    .line 415
    new-instance v7, Lcom/huawei/hihealth/HiAccountInfo;

    invoke-direct {v7}, Lcom/huawei/hihealth/HiAccountInfo;-><init>()V

    .line 416
    invoke-virtual {v4}, Lo/eui;->e()I

    move-result v0

    invoke-virtual {v7, v0}, Lcom/huawei/hihealth/HiAccountInfo;->setAppId(I)V

    .line 417
    invoke-virtual {v4}, Lo/eui;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/hihealth/HiAccountInfo;->setServiceToken(Ljava/lang/String;)V

    .line 418
    invoke-virtual {v4}, Lo/eui;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/hihealth/HiAccountInfo;->setAccessToken(Ljava/lang/String;)V

    .line 419
    invoke-virtual {v4}, Lo/eui;->a()I

    move-result v0

    invoke-virtual {v7, v0}, Lcom/huawei/hihealth/HiAccountInfo;->setType(I)V

    .line 420
    const-string v0, "Login_ThirdPartyLoginActivity"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "serviceToken=="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    const-string v2, ";huid=="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v5, v1, v2

    const-string v2, ";loginType=="

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-virtual {v4}, Lo/eui;->a()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 423
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v8

    .line 424
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {v8, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 425
    const-string v0, "Login_ThirdPartyLoginActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "userid is changed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 426
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$8;->b:Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;

    new-instance v1, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$8$5;

    invoke-direct {v1, p0, v4, v8}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$8$5;-><init>(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$8;Lo/eui;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    goto :goto_1

    .line 433
    :cond_2
    const-string v0, "Login_ThirdPartyLoginActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "userid is not changed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 434
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$8;->b:Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;

    invoke-static {v0, v4}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->c(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;Lo/eui;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 438
    :goto_1
    goto :goto_2

    .line 436
    :catch_0
    move-exception v4

    .line 437
    const-string v0, "Login_ThirdPartyLoginActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 439
    :goto_2
    return-void
.end method
