.class Lcom/huawei/hwid/update/d/k$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/updatesdk/service/otaupdate/CheckUpdateCallBack;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwid/update/d/k;->a(Lcom/huawei/hwid/update/a/a/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hwid/update/a/a/b;

.field final synthetic b:Lcom/huawei/hwid/update/d/k;


# direct methods
.method constructor <init>(Lcom/huawei/hwid/update/d/k;Lcom/huawei/hwid/update/a/a/b;)V
    .locals 0

    .line 375
    iput-object p1, p0, Lcom/huawei/hwid/update/d/k$1;->b:Lcom/huawei/hwid/update/d/k;

    iput-object p2, p0, Lcom/huawei/hwid/update/d/k$1;->a:Lcom/huawei/hwid/update/a/a/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onMarketInstallInfo(Landroid/content/Intent;)V
    .locals 0

    .line 435
    return-void
.end method

.method public onMarketStoreError(I)V
    .locals 0

    .line 440
    return-void
.end method

.method public onUpdateInfo(Landroid/content/Intent;)V
    .locals 14

    .line 378
    if-eqz p1, :cond_8

    .line 381
    const-string v0, "status"

    const/16 v1, -0x63

    :try_start_0
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v6

    .line 386
    goto :goto_0

    .line 382
    :catch_0
    move-exception v7

    .line 383
    const-string v0, "UpdateWizard"

    const-string v1, "intent has some error"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 384
    iget-object v0, p0, Lcom/huawei/hwid/update/d/k$1;->a:Lcom/huawei/hwid/update/a/a/b;

    const/16 v1, 0x4b1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/hwid/update/d/k;->a(Lcom/huawei/hwid/update/a/a/b;ILcom/huawei/hwid/update/a/a/c;)V

    .line 385
    return-void

    .line 388
    :goto_0
    const-string v0, "UpdateWizard"

    const-string v1, "onUpdateInfo status"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 389
    const/4 v0, 0x7

    if-ne v6, v0, :cond_6

    .line 391
    const-string v0, "updatesdk_update_info"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;

    .line 392
    if-eqz v7, :cond_5

    .line 393
    invoke-virtual {v7}, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->getPackage_()Ljava/lang/String;

    move-result-object v8

    .line 394
    invoke-virtual {v7}, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->getVersionCode_()I

    move-result v9

    .line 395
    invoke-virtual {v7}, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->getDownurl_()Ljava/lang/String;

    move-result-object v10

    .line 396
    invoke-virtual {v7}, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->getSize_()I

    move-result v11

    .line 397
    invoke-virtual {v7}, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->getSha256_()Ljava/lang/String;

    move-result-object v12

    .line 400
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hwid/update/d/k$1;->b:Lcom/huawei/hwid/update/d/k;

    iget-object v0, v0, Lcom/huawei/hwid/update/d/k;->c:Lcom/huawei/hwid/update/d/j;

    invoke-virtual {v0}, Lcom/huawei/hwid/update/d/j;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 401
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwid/update/d/k$1;->a:Lcom/huawei/hwid/update/a/a/b;

    const/16 v1, 0x4b1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/hwid/update/d/k;->a(Lcom/huawei/hwid/update/a/a/b;ILcom/huawei/hwid/update/a/a/c;)V

    .line 402
    return-void

    .line 406
    :cond_1
    iget-object v0, p0, Lcom/huawei/hwid/update/d/k$1;->b:Lcom/huawei/hwid/update/d/k;

    iget-object v0, v0, Lcom/huawei/hwid/update/d/k;->c:Lcom/huawei/hwid/update/d/j;

    invoke-virtual {v0}, Lcom/huawei/hwid/update/d/j;->b()I

    move-result v0

    if-ge v9, v0, :cond_2

    .line 407
    iget-object v0, p0, Lcom/huawei/hwid/update/d/k$1;->a:Lcom/huawei/hwid/update/a/a/b;

    const/16 v1, 0x4b3

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/hwid/update/d/k;->a(Lcom/huawei/hwid/update/a/a/b;ILcom/huawei/hwid/update/a/a/c;)V

    .line 408
    return-void

    .line 412
    :cond_2
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 413
    :cond_3
    iget-object v0, p0, Lcom/huawei/hwid/update/d/k$1;->a:Lcom/huawei/hwid/update/a/a/b;

    const/16 v1, 0x4b1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/hwid/update/d/k;->a(Lcom/huawei/hwid/update/a/a/b;ILcom/huawei/hwid/update/a/a/c;)V

    .line 414
    return-void

    .line 418
    :cond_4
    new-instance v0, Lcom/huawei/hwid/update/a/a/c;

    move-object v1, v8

    move v2, v9

    move-object v3, v10

    move v4, v11

    move-object v5, v12

    invoke-direct/range {v0 .. v5}, Lcom/huawei/hwid/update/a/a/c;-><init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)V

    move-object v13, v0

    .line 420
    iget-object v0, p0, Lcom/huawei/hwid/update/d/k$1;->a:Lcom/huawei/hwid/update/a/a/b;

    const/16 v1, 0x3e8

    invoke-static {v0, v1, v13}, Lcom/huawei/hwid/update/d/k;->a(Lcom/huawei/hwid/update/a/a/b;ILcom/huawei/hwid/update/a/a/c;)V

    .line 422
    :cond_5
    goto :goto_1

    :cond_6
    const/4 v0, 0x3

    if-ne v6, v0, :cond_7

    .line 424
    iget-object v0, p0, Lcom/huawei/hwid/update/d/k$1;->a:Lcom/huawei/hwid/update/a/a/b;

    const/16 v1, 0x4b2

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/hwid/update/d/k;->a(Lcom/huawei/hwid/update/a/a/b;ILcom/huawei/hwid/update/a/a/c;)V

    goto :goto_1

    .line 427
    :cond_7
    iget-object v0, p0, Lcom/huawei/hwid/update/d/k$1;->a:Lcom/huawei/hwid/update/a/a/b;

    const/16 v1, 0x4b1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/hwid/update/d/k;->a(Lcom/huawei/hwid/update/a/a/b;ILcom/huawei/hwid/update/a/a/c;)V

    .line 430
    :cond_8
    :goto_1
    return-void
.end method

.method public onUpdateStoreError(I)V
    .locals 0

    .line 445
    return-void
.end method
