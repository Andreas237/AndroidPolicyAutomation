.class Lcom/huawei/login/huaweilogin/HuaweiLoginManager$AidlLoginHandler;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/cloudservice/LoginHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/login/huaweilogin/HuaweiLoginManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "AidlLoginHandler"
.end annotation


# instance fields
.field private callback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private needAuth:Z

.field final synthetic this$0:Lcom/huawei/login/huaweilogin/HuaweiLoginManager;


# direct methods
.method constructor <init>(Lcom/huawei/login/huaweilogin/HuaweiLoginManager;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V
    .locals 0

    .line 521
    iput-object p1, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$AidlLoginHandler;->this$0:Lcom/huawei/login/huaweilogin/HuaweiLoginManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 522
    iput-object p2, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$AidlLoginHandler;->callback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 523
    iput-boolean p3, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$AidlLoginHandler;->needAuth:Z

    .line 524
    return-void
.end method


# virtual methods
.method public onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V
    .locals 4

    .line 556
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "AidlLoginHandler onError"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 557
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 558
    return-void

    .line 560
    :cond_0
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "AidlLoginHandler onError:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;->getErrorCode()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", reason = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;->getErrorReason()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 561
    invoke-virtual {p1}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;->getErrorCode()I

    move-result v0

    const/16 v1, 0x1f

    if-ne v1, v0, :cond_1

    .line 564
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "aidl login error, go to notAidlLogin():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 565
    iget-object v0, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$AidlLoginHandler;->this$0:Lcom/huawei/login/huaweilogin/HuaweiLoginManager;

    iget-object v1, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$AidlLoginHandler;->callback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    iget-boolean v2, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$AidlLoginHandler;->needAuth:Z

    invoke-static {v0, v1, v2}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->access$500(Lcom/huawei/login/huaweilogin/HuaweiLoginManager;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    goto :goto_0

    .line 566
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;->getErrorCode()I

    move-result v0

    const/16 v1, 0x1e

    if-ne v1, v0, :cond_2

    .line 568
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "aidl login error 30, SERVICETOKEN_INVALID,goto notaidllogin Auth"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 569
    iget-object v0, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$AidlLoginHandler;->this$0:Lcom/huawei/login/huaweilogin/HuaweiLoginManager;

    iget-object v1, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$AidlLoginHandler;->callback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->access$500(Lcom/huawei/login/huaweilogin/HuaweiLoginManager;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    goto :goto_0

    .line 570
    :cond_2
    invoke-virtual {p1}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;->getErrorCode()I

    move-result v0

    const/16 v1, 0x27

    if-ne v1, v0, :cond_3

    .line 572
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "aidl login error 39, LOGIN_TIMEOUT,goto notaidllogin noAuth"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 573
    iget-object v0, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$AidlLoginHandler;->this$0:Lcom/huawei/login/huaweilogin/HuaweiLoginManager;

    iget-object v1, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$AidlLoginHandler;->callback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->access$500(Lcom/huawei/login/huaweilogin/HuaweiLoginManager;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    goto :goto_0

    .line 575
    :cond_3
    iget-object v0, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$AidlLoginHandler;->callback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 576
    iget-object v0, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$AidlLoginHandler;->callback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {p1}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;->getErrorCode()I

    move-result v1

    invoke-virtual {p1}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;->getErrorReason()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    goto :goto_0

    .line 578
    :cond_4
    iget-object v0, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$AidlLoginHandler;->this$0:Lcom/huawei/login/huaweilogin/HuaweiLoginManager;

    invoke-virtual {p1}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;->getErrorCode()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->access$000(Lcom/huawei/login/huaweilogin/HuaweiLoginManager;I)V

    .line 581
    :goto_0
    return-void
.end method

.method public onFinish([Lcom/huawei/cloudservice/CloudAccount;)V
    .locals 0

    .line 553
    return-void
.end method

.method public onLogin([Lcom/huawei/cloudservice/CloudAccount;I)V
    .locals 6

    .line 527
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "AidlLoginHandler enter:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 528
    if-eqz p1, :cond_0

    array-length v0, p1

    if-gtz v0, :cond_1

    .line 529
    :cond_0
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "AidlLoginHandler mAccounts error:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 530
    return-void

    .line 532
    :cond_1
    const/4 v0, -0x1

    if-eq p2, v0, :cond_2

    .line 533
    aget-object v0, p1, p2

    invoke-static {v0}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->setAccount(Lcom/huawei/cloudservice/CloudAccount;)V

    .line 534
    iget-object v0, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$AidlLoginHandler;->this$0:Lcom/huawei/login/huaweilogin/HuaweiLoginManager;

    invoke-static {v0}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->access$400(Lcom/huawei/login/huaweilogin/HuaweiLoginManager;)V

    .line 535
    iget-object v0, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$AidlLoginHandler;->callback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 536
    aget-object v4, p1, p2

    .line 537
    invoke-virtual {v4}, Lcom/huawei/cloudservice/CloudAccount;->getAccountInfo()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "userId"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 538
    iget-object v0, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$AidlLoginHandler;->callback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    invoke-interface {v0, v1, v5}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 539
    goto :goto_0

    .line 541
    :cond_2
    iget-object v0, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$AidlLoginHandler;->callback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 542
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "AidlLoginHandler --- >error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 543
    iget-object v0, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$AidlLoginHandler;->callback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const-string v1, ""

    const/4 v2, -0x1

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 546
    :cond_3
    :goto_0
    return-void
.end method

.method public onLogout([Lcom/huawei/cloudservice/CloudAccount;I)V
    .locals 1

    .line 549
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->setAccount(Lcom/huawei/cloudservice/CloudAccount;)V

    .line 550
    return-void
.end method
