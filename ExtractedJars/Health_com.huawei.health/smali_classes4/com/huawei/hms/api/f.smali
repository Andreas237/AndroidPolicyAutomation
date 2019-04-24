.class Lcom/huawei/hms/api/f;
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
.field final synthetic a:Lcom/huawei/hms/api/HuaweiApiClientImpl;


# direct methods
.method constructor <init>(Lcom/huawei/hms/api/HuaweiApiClientImpl;)V
    .locals 0

    .line 676
    iput-object p1, p0, Lcom/huawei/hms/api/f;->a:Lcom/huawei/hms/api/HuaweiApiClientImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onMarketInstallInfo(Landroid/content/Intent;)V
    .locals 6

    .line 719
    if-eqz p1, :cond_0

    .line 720
    const-string v0, "downloadStatus"

    const/16 v1, -0x63

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v3

    .line 721
    const-string v0, "installState"

    const/16 v1, -0x63

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v4

    .line 722
    const-string v0, "installType"

    const/16 v1, -0x63

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v5

    .line 724
    const-string v0, "HuaweiApiClientImpl"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onMarketInstallInfo installState: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",installType: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",downloadCode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 726
    :cond_0
    return-void
.end method

.method public onMarketStoreError(I)V
    .locals 3

    .line 730
    const-string v0, "HuaweiApiClientImpl"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onMarketStoreError responseCode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 731
    return-void
.end method

.method public onUpdateInfo(Landroid/content/Intent;)V
    .locals 6

    .line 680
    if-eqz p1, :cond_3

    iget-object v0, p0, Lcom/huawei/hms/api/f;->a:Lcom/huawei/hms/api/HuaweiApiClientImpl;

    invoke-static {v0}, Lcom/huawei/hms/api/HuaweiApiClientImpl;->c(Lcom/huawei/hms/api/HuaweiApiClientImpl;)Lcom/huawei/hms/api/CheckUpdatelistener;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 684
    const-string v0, "status"

    const/16 v1, -0x63

    :try_start_0
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v3

    .line 685
    const-string v0, "failcause"

    const/16 v1, -0x63

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v4

    .line 687
    const-string v0, "compulsoryUpdateCancel"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v5

    .line 688
    const-string v0, "HuaweiApiClientImpl"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onUpdateInfo status: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",failcause: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",isExit: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 694
    goto :goto_0

    .line 690
    :catch_0
    move-exception v4

    .line 691
    const-string v0, "HuaweiApiClientImpl"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "intent has some error"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 692
    iget-object v0, p0, Lcom/huawei/hms/api/f;->a:Lcom/huawei/hms/api/HuaweiApiClientImpl;

    invoke-static {v0}, Lcom/huawei/hms/api/HuaweiApiClientImpl;->c(Lcom/huawei/hms/api/HuaweiApiClientImpl;)Lcom/huawei/hms/api/CheckUpdatelistener;

    move-result-object v0

    const/4 v1, -0x1

    invoke-interface {v0, v1}, Lcom/huawei/hms/api/CheckUpdatelistener;->onResult(I)V

    .line 693
    return-void

    .line 696
    :goto_0
    const/4 v0, 0x7

    if-ne v3, v0, :cond_1

    .line 698
    const-string v0, "updatesdk_update_info"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;

    .line 699
    if-eqz v4, :cond_0

    .line 700
    const-string v0, "HuaweiApiClientImpl"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onUpdateInfo: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 702
    :cond_0
    iget-object v0, p0, Lcom/huawei/hms/api/f;->a:Lcom/huawei/hms/api/HuaweiApiClientImpl;

    invoke-static {v0}, Lcom/huawei/hms/api/HuaweiApiClientImpl;->c(Lcom/huawei/hms/api/HuaweiApiClientImpl;)Lcom/huawei/hms/api/CheckUpdatelistener;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/huawei/hms/api/CheckUpdatelistener;->onResult(I)V

    .line 704
    goto :goto_1

    :cond_1
    const/4 v0, 0x3

    if-ne v3, v0, :cond_2

    .line 706
    iget-object v0, p0, Lcom/huawei/hms/api/f;->a:Lcom/huawei/hms/api/HuaweiApiClientImpl;

    invoke-static {v0}, Lcom/huawei/hms/api/HuaweiApiClientImpl;->c(Lcom/huawei/hms/api/HuaweiApiClientImpl;)Lcom/huawei/hms/api/CheckUpdatelistener;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/huawei/hms/api/CheckUpdatelistener;->onResult(I)V

    goto :goto_1

    .line 710
    :cond_2
    iget-object v0, p0, Lcom/huawei/hms/api/f;->a:Lcom/huawei/hms/api/HuaweiApiClientImpl;

    invoke-static {v0}, Lcom/huawei/hms/api/HuaweiApiClientImpl;->c(Lcom/huawei/hms/api/HuaweiApiClientImpl;)Lcom/huawei/hms/api/CheckUpdatelistener;

    move-result-object v0

    const/4 v1, -0x1

    invoke-interface {v0, v1}, Lcom/huawei/hms/api/CheckUpdatelistener;->onResult(I)V

    .line 713
    :goto_1
    iget-object v0, p0, Lcom/huawei/hms/api/f;->a:Lcom/huawei/hms/api/HuaweiApiClientImpl;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/hms/api/HuaweiApiClientImpl;->a(Lcom/huawei/hms/api/HuaweiApiClientImpl;Lcom/huawei/hms/api/CheckUpdatelistener;)Lcom/huawei/hms/api/CheckUpdatelistener;

    .line 715
    :cond_3
    return-void
.end method

.method public onUpdateStoreError(I)V
    .locals 3

    .line 735
    const-string v0, "HuaweiApiClientImpl"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onUpdateStoreError responseCode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 736
    return-void
.end method
