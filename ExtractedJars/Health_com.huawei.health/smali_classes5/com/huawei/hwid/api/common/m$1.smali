.class Lcom/huawei/hwid/api/common/m$1;
.super Lcom/huawei/cloudservice/c$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwid/api/common/m;->a(Lcom/huawei/cloudservice/LogoutHandler;)Lcom/huawei/cloudservice/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/cloudservice/LogoutHandler;

.field final synthetic b:Lcom/huawei/hwid/api/common/m;


# direct methods
.method constructor <init>(Lcom/huawei/hwid/api/common/m;Lcom/huawei/cloudservice/LogoutHandler;)V
    .locals 0

    .line 86
    iput-object p1, p0, Lcom/huawei/hwid/api/common/m$1;->b:Lcom/huawei/hwid/api/common/m;

    iput-object p2, p0, Lcom/huawei/hwid/api/common/m$1;->a:Lcom/huawei/cloudservice/LogoutHandler;

    invoke-direct {p0}, Lcom/huawei/cloudservice/c$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 98
    const-string v0, "LogoutTask"

    const-string v1, "logoutResult"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 100
    iget-object v0, p0, Lcom/huawei/hwid/api/common/m$1;->b:Lcom/huawei/hwid/api/common/m;

    iget-object v0, v0, Lcom/huawei/hwid/api/common/m;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 101
    const-string v0, "LogoutTask"

    const-string v1, "has cancelled by timeout, return directly"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    return-void

    .line 104
    :cond_0
    const/4 v0, 0x6

    if-ne p1, v0, :cond_1

    .line 105
    iget-object v0, p0, Lcom/huawei/hwid/api/common/m$1;->b:Lcom/huawei/hwid/api/common/m;

    invoke-static {v0}, Lcom/huawei/hwid/api/common/m;->a(Lcom/huawei/hwid/api/common/m;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/cloudservice/CloudAccountManager;->clearAccountData(Landroid/content/Context;)V

    .line 106
    iget-object v0, p0, Lcom/huawei/hwid/api/common/m$1;->a:Lcom/huawei/cloudservice/LogoutHandler;

    invoke-interface {v0}, Lcom/huawei/cloudservice/LogoutHandler;->onSuccess()V

    goto/16 :goto_0

    .line 107
    :cond_1
    if-nez p1, :cond_2

    .line 108
    iget-object v0, p0, Lcom/huawei/hwid/api/common/m$1;->a:Lcom/huawei/cloudservice/LogoutHandler;

    new-instance v1, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v2, "Account has not login"

    const/16 v3, 0x1f

    invoke-direct {v1, v3, v2}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/huawei/cloudservice/LogoutHandler;->onFail(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    goto/16 :goto_0

    .line 109
    :cond_2
    const/4 v0, 0x7

    if-ne p1, v0, :cond_3

    .line 110
    iget-object v0, p0, Lcom/huawei/hwid/api/common/m$1;->a:Lcom/huawei/cloudservice/LogoutHandler;

    new-instance v1, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v2, "userid not system account"

    const/16 v3, 0x2a

    invoke-direct {v1, v3, v2}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/huawei/cloudservice/LogoutHandler;->onFail(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    goto :goto_0

    .line 111
    :cond_3
    const/16 v0, 0x8

    if-ne p1, v0, :cond_4

    .line 112
    iget-object v0, p0, Lcom/huawei/hwid/api/common/m$1;->a:Lcom/huawei/cloudservice/LogoutHandler;

    new-instance v1, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v2, "packagename was not matched"

    const/16 v3, 0x2c

    invoke-direct {v1, v3, v2}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/huawei/cloudservice/LogoutHandler;->onFail(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    goto :goto_0

    .line 113
    :cond_4
    const/16 v0, 0x9

    if-ne p1, v0, :cond_5

    .line 114
    iget-object v0, p0, Lcom/huawei/hwid/api/common/m$1;->a:Lcom/huawei/cloudservice/LogoutHandler;

    new-instance v1, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v2, "packagename not in hwid list"

    const/16 v3, 0x2b

    invoke-direct {v1, v3, v2}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/huawei/cloudservice/LogoutHandler;->onFail(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    goto :goto_0

    .line 115
    :cond_5
    const/4 v0, 0x1

    if-ne p1, v0, :cond_6

    .line 116
    iget-object v0, p0, Lcom/huawei/hwid/api/common/m$1;->a:Lcom/huawei/cloudservice/LogoutHandler;

    new-instance v1, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v2, "Signature invalid"

    const/16 v3, 0x1d

    invoke-direct {v1, v3, v2}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/huawei/cloudservice/LogoutHandler;->onFail(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    goto :goto_0

    .line 118
    :cond_6
    iget-object v0, p0, Lcom/huawei/hwid/api/common/m$1;->a:Lcom/huawei/cloudservice/LogoutHandler;

    new-instance v1, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v2, "other error"

    const/16 v3, 0x2c

    invoke-direct {v1, v3, v2}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/huawei/cloudservice/LogoutHandler;->onFail(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 119
    const-string v0, "LogoutTask"

    const-string v1, "DONT KNOW RET_CODE:"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 122
    :goto_0
    iget-object v0, p0, Lcom/huawei/hwid/api/common/m$1;->b:Lcom/huawei/hwid/api/common/m;

    invoke-virtual {v0}, Lcom/huawei/hwid/api/common/m;->a()V

    .line 123
    return-void
.end method

.method public a(ILandroid/content/Intent;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 94
    return-void
.end method

.method public a(ILandroid/os/Bundle;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 89
    return-void
.end method

.method public b(ILandroid/os/Bundle;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 128
    return-void
.end method
