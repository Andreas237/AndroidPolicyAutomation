.class Lcom/huawei/hwid/api/common/k$1;
.super Lcom/huawei/cloudservice/c$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwid/api/common/k;->a(Lcom/huawei/cloudservice/CloudRequestHandler;)Lcom/huawei/cloudservice/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/cloudservice/CloudRequestHandler;

.field final synthetic b:Lcom/huawei/hwid/api/common/k;


# direct methods
.method constructor <init>(Lcom/huawei/hwid/api/common/k;Lcom/huawei/cloudservice/CloudRequestHandler;)V
    .locals 0

    .line 77
    iput-object p1, p0, Lcom/huawei/hwid/api/common/k$1;->b:Lcom/huawei/hwid/api/common/k;

    iput-object p2, p0, Lcom/huawei/hwid/api/common/k$1;->a:Lcom/huawei/cloudservice/CloudRequestHandler;

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

    .line 91
    return-void
.end method

.method public a(ILandroid/content/Intent;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 86
    return-void
.end method

.method public a(ILandroid/os/Bundle;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 81
    return-void
.end method

.method public b(ILandroid/os/Bundle;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 96
    iget-object v0, p0, Lcom/huawei/hwid/api/common/k$1;->b:Lcom/huawei/hwid/api/common/k;

    iget-object v0, v0, Lcom/huawei/hwid/api/common/k;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 97
    const-string v0, "GetRealNameInfoTask"

    const-string v1, "has cancelled by timeout, return directly"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    return-void

    .line 100
    :cond_0
    const/4 v0, -0x1

    if-ne p1, v0, :cond_1

    .line 101
    iget-object v0, p0, Lcom/huawei/hwid/api/common/k$1;->a:Lcom/huawei/cloudservice/CloudRequestHandler;

    invoke-interface {v0, p2}, Lcom/huawei/cloudservice/CloudRequestHandler;->onFinish(Landroid/os/Bundle;)V

    goto/16 :goto_0

    .line 102
    :cond_1
    if-nez p1, :cond_2

    .line 103
    iget-object v0, p0, Lcom/huawei/hwid/api/common/k$1;->a:Lcom/huawei/cloudservice/CloudRequestHandler;

    new-instance v1, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v2, "Account hasnot login"

    const/16 v3, 0x1f

    invoke-direct {v1, v3, v2}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    goto :goto_0

    .line 104
    :cond_2
    const/4 v0, 0x1

    if-ne p1, v0, :cond_3

    .line 105
    iget-object v0, p0, Lcom/huawei/hwid/api/common/k$1;->a:Lcom/huawei/cloudservice/CloudRequestHandler;

    new-instance v1, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v2, "Signature invalid"

    const/16 v3, 0x1d

    invoke-direct {v1, v3, v2}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    goto :goto_0

    .line 106
    :cond_3
    const/4 v0, 0x5

    if-ne p1, v0, :cond_4

    .line 107
    iget-object v0, p0, Lcom/huawei/hwid/api/common/k$1;->a:Lcom/huawei/cloudservice/CloudRequestHandler;

    new-instance v1, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v2, "userId invalid"

    const/16 v3, 0xc

    invoke-direct {v1, v3, v2}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    goto :goto_0

    .line 108
    :cond_4
    const/4 v0, 0x2

    if-ne p1, v0, :cond_5

    .line 109
    iget-object v0, p0, Lcom/huawei/hwid/api/common/k$1;->a:Lcom/huawei/cloudservice/CloudRequestHandler;

    new-instance v1, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v2, "st invalid"

    const/16 v3, 0x1e

    invoke-direct {v1, v3, v2}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    goto :goto_0

    .line 111
    :cond_5
    iget-object v0, p0, Lcom/huawei/hwid/api/common/k$1;->a:Lcom/huawei/cloudservice/CloudRequestHandler;

    new-instance v1, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v2, "params error"

    const/16 v3, 0xc

    invoke-direct {v1, v3, v2}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 114
    :goto_0
    iget-object v0, p0, Lcom/huawei/hwid/api/common/k$1;->b:Lcom/huawei/hwid/api/common/k;

    invoke-virtual {v0}, Lcom/huawei/hwid/api/common/k;->a()V

    .line 115
    return-void
.end method
