.class Lcom/huawei/hwid/api/common/j$1;
.super Lcom/huawei/cloudservice/c$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwid/api/common/j;->a(Lcom/huawei/cloudservice/IntentResultHandler;)Lcom/huawei/cloudservice/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/cloudservice/IntentResultHandler;

.field final synthetic b:Lcom/huawei/hwid/api/common/j;


# direct methods
.method constructor <init>(Lcom/huawei/hwid/api/common/j;Lcom/huawei/cloudservice/IntentResultHandler;)V
    .locals 0

    .line 82
    iput-object p1, p0, Lcom/huawei/hwid/api/common/j$1;->b:Lcom/huawei/hwid/api/common/j;

    iput-object p2, p0, Lcom/huawei/hwid/api/common/j$1;->a:Lcom/huawei/cloudservice/IntentResultHandler;

    invoke-direct {p0}, Lcom/huawei/cloudservice/c$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 121
    return-void
.end method

.method public a(ILandroid/content/Intent;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 91
    iget-object v0, p0, Lcom/huawei/hwid/api/common/j$1;->b:Lcom/huawei/hwid/api/common/j;

    iget-object v0, v0, Lcom/huawei/hwid/api/common/j;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 92
    const-string v0, "RemoteAccessAuthorizeIntentTask"

    const-string v1, "has cancelled by timeout, return directly"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    return-void

    .line 95
    :cond_0
    const/4 v0, 0x3

    if-ne p1, v0, :cond_2

    .line 96
    const/4 v0, 0x0

    if-eq v0, p2, :cond_1

    iget-object v0, p0, Lcom/huawei/hwid/api/common/j$1;->b:Lcom/huawei/hwid/api/common/j;

    invoke-static {v0}, Lcom/huawei/hwid/api/common/j;->a(Lcom/huawei/hwid/api/common/j;)Landroid/os/Bundle;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    const-string v0, "ForgotPwdIntent"

    iget-object v1, p0, Lcom/huawei/hwid/api/common/j$1;->b:Lcom/huawei/hwid/api/common/j;

    invoke-static {v1}, Lcom/huawei/hwid/api/common/j;->b(Lcom/huawei/hwid/api/common/j;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 97
    const-string v0, "loginChannel"

    iget-object v1, p0, Lcom/huawei/hwid/api/common/j$1;->b:Lcom/huawei/hwid/api/common/j;

    .line 98
    invoke-static {v1}, Lcom/huawei/hwid/api/common/j;->a(Lcom/huawei/hwid/api/common/j;)Landroid/os/Bundle;

    move-result-object v1

    const-string v2, "loginChannel"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    .line 97
    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 99
    const-string v0, "reqClientType"

    iget-object v1, p0, Lcom/huawei/hwid/api/common/j$1;->b:Lcom/huawei/hwid/api/common/j;

    .line 100
    invoke-static {v1}, Lcom/huawei/hwid/api/common/j;->a(Lcom/huawei/hwid/api/common/j;)Landroid/os/Bundle;

    move-result-object v1

    const-string v2, "reqClientType"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    .line 99
    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 101
    const-string v0, "isOOBE"

    iget-object v1, p0, Lcom/huawei/hwid/api/common/j$1;->b:Lcom/huawei/hwid/api/common/j;

    .line 102
    invoke-static {v1}, Lcom/huawei/hwid/api/common/j;->a(Lcom/huawei/hwid/api/common/j;)Landroid/os/Bundle;

    move-result-object v1

    const-string v2, "isOOBE"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    .line 101
    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 104
    :cond_1
    iget-object v0, p0, Lcom/huawei/hwid/api/common/j$1;->a:Lcom/huawei/cloudservice/IntentResultHandler;

    invoke-interface {v0, p2}, Lcom/huawei/cloudservice/IntentResultHandler;->onFinish(Landroid/content/Intent;)V

    goto :goto_0

    .line 105
    :cond_2
    if-nez p1, :cond_3

    .line 106
    iget-object v0, p0, Lcom/huawei/hwid/api/common/j$1;->a:Lcom/huawei/cloudservice/IntentResultHandler;

    new-instance v1, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v2, "Account hasnot login"

    const/16 v3, 0x1f

    invoke-direct {v1, v3, v2}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/huawei/cloudservice/IntentResultHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    goto :goto_0

    .line 107
    :cond_3
    const/4 v0, 0x1

    if-ne p1, v0, :cond_4

    .line 108
    iget-object v0, p0, Lcom/huawei/hwid/api/common/j$1;->a:Lcom/huawei/cloudservice/IntentResultHandler;

    new-instance v1, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v2, "Signature invalid"

    const/16 v3, 0x1d

    invoke-direct {v1, v3, v2}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/huawei/cloudservice/IntentResultHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    goto :goto_0

    .line 109
    :cond_4
    const/4 v0, 0x5

    if-ne p1, v0, :cond_5

    .line 110
    iget-object v0, p0, Lcom/huawei/hwid/api/common/j$1;->a:Lcom/huawei/cloudservice/IntentResultHandler;

    new-instance v1, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v2, "userId invalid"

    const/16 v3, 0xc

    invoke-direct {v1, v3, v2}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/huawei/cloudservice/IntentResultHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    goto :goto_0

    .line 112
    :cond_5
    iget-object v0, p0, Lcom/huawei/hwid/api/common/j$1;->a:Lcom/huawei/cloudservice/IntentResultHandler;

    new-instance v1, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v2, "params error"

    const/16 v3, 0xc

    invoke-direct {v1, v3, v2}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/huawei/cloudservice/IntentResultHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 115
    :goto_0
    iget-object v0, p0, Lcom/huawei/hwid/api/common/j$1;->b:Lcom/huawei/hwid/api/common/j;

    invoke-virtual {v0}, Lcom/huawei/hwid/api/common/j;->a()V

    .line 116
    return-void
.end method

.method public a(ILandroid/os/Bundle;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 86
    return-void
.end method

.method public b(ILandroid/os/Bundle;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 126
    return-void
.end method
