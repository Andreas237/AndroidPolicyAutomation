.class Lcom/huawei/login/huaweilogin/HuaweiLoginManager$NotAidlLoginHandler;
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
    name = "NotAidlLoginHandler"
.end annotation


# instance fields
.field private baseCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private isNeedAuth:Z

.field final synthetic this$0:Lcom/huawei/login/huaweilogin/HuaweiLoginManager;


# direct methods
.method constructor <init>(Lcom/huawei/login/huaweilogin/HuaweiLoginManager;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V
    .locals 0

    .line 601
    iput-object p1, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$NotAidlLoginHandler;->this$0:Lcom/huawei/login/huaweilogin/HuaweiLoginManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 602
    iput-object p2, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$NotAidlLoginHandler;->baseCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 603
    iput-boolean p3, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$NotAidlLoginHandler;->isNeedAuth:Z

    .line 604
    return-void
.end method


# virtual methods
.method public onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V
    .locals 4

    .line 620
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 621
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "NotAidlLoginHandler onError is null."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 622
    return-void

    .line 624
    :cond_0
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "NotAidlLoginHandler onError :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;->getErrorCode()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ","

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

    .line 625
    iget-object v0, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$NotAidlLoginHandler;->baseCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 626
    iget-object v0, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$NotAidlLoginHandler;->baseCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {p1}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;->getErrorCode()I

    move-result v1

    invoke-virtual {p1}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;->getErrorReason()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    goto :goto_0

    .line 628
    :cond_1
    iget-object v0, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$NotAidlLoginHandler;->this$0:Lcom/huawei/login/huaweilogin/HuaweiLoginManager;

    invoke-virtual {p1}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;->getErrorCode()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->access$000(Lcom/huawei/login/huaweilogin/HuaweiLoginManager;I)V

    .line 630
    :goto_0
    return-void
.end method

.method public onFinish([Lcom/huawei/cloudservice/CloudAccount;)V
    .locals 0

    .line 616
    return-void
.end method

.method public onLogin([Lcom/huawei/cloudservice/CloudAccount;I)V
    .locals 4

    .line 607
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "NotAidlLoginHandler onLogin:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 608
    iget-object v0, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$NotAidlLoginHandler;->this$0:Lcom/huawei/login/huaweilogin/HuaweiLoginManager;

    iget-object v1, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$NotAidlLoginHandler;->baseCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    iget-boolean v2, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$NotAidlLoginHandler;->isNeedAuth:Z

    invoke-static {v0, v1, v2}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->access$200(Lcom/huawei/login/huaweilogin/HuaweiLoginManager;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    .line 609
    return-void
.end method

.method public onLogout([Lcom/huawei/cloudservice/CloudAccount;I)V
    .locals 1

    .line 612
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->setAccount(Lcom/huawei/cloudservice/CloudAccount;)V

    .line 613
    return-void
.end method
