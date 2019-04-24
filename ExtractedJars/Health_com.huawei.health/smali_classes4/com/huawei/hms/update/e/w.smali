.class Lcom/huawei/hms/update/e/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/updatesdk/service/otaupdate/CheckUpdateCallBack;


# annotations
.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hms/update/a/a/b;

.field final synthetic b:Lcom/huawei/hms/update/e/v;


# direct methods
.method constructor <init>(Lcom/huawei/hms/update/e/v;Lcom/huawei/hms/update/a/a/b;)V
    .locals 0

    .line 374
    iput-object p1, p0, Lcom/huawei/hms/update/e/w;->b:Lcom/huawei/hms/update/e/v;

    iput-object p2, p0, Lcom/huawei/hms/update/e/w;->a:Lcom/huawei/hms/update/a/a/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onMarketInstallInfo(Landroid/content/Intent;)V
    .locals 0

    .line 434
    return-void
.end method

.method public onMarketStoreError(I)V
    .locals 0

    .line 439
    return-void
.end method

.method public onUpdateInfo(Landroid/content/Intent;)V
    .locals 14

    .line 377
    if-eqz p1, :cond_8

    .line 380
    const-string v0, "status"

    const/16 v1, -0x63

    :try_start_0
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v6

    .line 385
    goto :goto_0

    .line 381
    :catch_0
    move-exception v7

    .line 382
    const-string v0, "UpdateWizard"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "intent has some error"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v7}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 383
    iget-object v0, p0, Lcom/huawei/hms/update/e/w;->a:Lcom/huawei/hms/update/a/a/b;

    const/16 v1, 0x4b1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/hms/update/e/v;->a(Lcom/huawei/hms/update/a/a/b;ILcom/huawei/hms/update/a/a/c;)V

    .line 384
    return-void

    .line 388
    :goto_0
    const/4 v0, 0x7

    if-ne v6, v0, :cond_6

    .line 390
    const-string v0, "updatesdk_update_info"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;

    .line 391
    if-eqz v7, :cond_5

    .line 392
    invoke-virtual {v7}, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->getPackage_()Ljava/lang/String;

    move-result-object v8

    .line 393
    invoke-virtual {v7}, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->getVersionCode_()I

    move-result v9

    .line 394
    invoke-virtual {v7}, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->getFullDownUrl_()Ljava/lang/String;

    move-result-object v10

    .line 395
    invoke-virtual {v7}, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->getSize_()I

    move-result v11

    .line 396
    invoke-virtual {v7}, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->getSha256_()Ljava/lang/String;

    move-result-object v12

    .line 399
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hms/update/e/w;->b:Lcom/huawei/hms/update/e/v;

    iget-object v0, v0, Lcom/huawei/hms/update/e/v;->c:Lcom/huawei/hms/update/e/u;

    invoke-virtual {v0}, Lcom/huawei/hms/update/e/u;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 400
    :cond_0
    iget-object v0, p0, Lcom/huawei/hms/update/e/w;->a:Lcom/huawei/hms/update/a/a/b;

    const/16 v1, 0x4b1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/hms/update/e/v;->a(Lcom/huawei/hms/update/a/a/b;ILcom/huawei/hms/update/a/a/c;)V

    .line 401
    return-void

    .line 405
    :cond_1
    iget-object v0, p0, Lcom/huawei/hms/update/e/w;->b:Lcom/huawei/hms/update/e/v;

    iget-object v0, v0, Lcom/huawei/hms/update/e/v;->c:Lcom/huawei/hms/update/e/u;

    invoke-virtual {v0}, Lcom/huawei/hms/update/e/u;->c()I

    move-result v0

    if-ge v9, v0, :cond_2

    .line 406
    iget-object v0, p0, Lcom/huawei/hms/update/e/w;->a:Lcom/huawei/hms/update/a/a/b;

    const/16 v1, 0x4b3

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/hms/update/e/v;->a(Lcom/huawei/hms/update/a/a/b;ILcom/huawei/hms/update/a/a/c;)V

    .line 407
    return-void

    .line 411
    :cond_2
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 412
    :cond_3
    iget-object v0, p0, Lcom/huawei/hms/update/e/w;->a:Lcom/huawei/hms/update/a/a/b;

    const/16 v1, 0x4b1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/hms/update/e/v;->a(Lcom/huawei/hms/update/a/a/b;ILcom/huawei/hms/update/a/a/c;)V

    .line 413
    return-void

    .line 417
    :cond_4
    new-instance v0, Lcom/huawei/hms/update/a/a/c;

    move-object v1, v8

    move v2, v9

    move-object v3, v10

    move v4, v11

    move-object v5, v12

    invoke-direct/range {v0 .. v5}, Lcom/huawei/hms/update/a/a/c;-><init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)V

    move-object v13, v0

    .line 419
    iget-object v0, p0, Lcom/huawei/hms/update/e/w;->a:Lcom/huawei/hms/update/a/a/b;

    const/16 v1, 0x3e8

    invoke-static {v0, v1, v13}, Lcom/huawei/hms/update/e/v;->a(Lcom/huawei/hms/update/a/a/b;ILcom/huawei/hms/update/a/a/c;)V

    .line 421
    :cond_5
    goto :goto_1

    :cond_6
    const/4 v0, 0x3

    if-ne v6, v0, :cond_7

    .line 423
    iget-object v0, p0, Lcom/huawei/hms/update/e/w;->a:Lcom/huawei/hms/update/a/a/b;

    const/16 v1, 0x4b2

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/hms/update/e/v;->a(Lcom/huawei/hms/update/a/a/b;ILcom/huawei/hms/update/a/a/c;)V

    goto :goto_1

    .line 426
    :cond_7
    iget-object v0, p0, Lcom/huawei/hms/update/e/w;->a:Lcom/huawei/hms/update/a/a/b;

    const/16 v1, 0x4b1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/hms/update/e/v;->a(Lcom/huawei/hms/update/a/a/b;ILcom/huawei/hms/update/a/a/c;)V

    .line 429
    :cond_8
    :goto_1
    return-void
.end method

.method public onUpdateStoreError(I)V
    .locals 0

    .line 444
    return-void
.end method
