.class Lcom/huawei/hwid/api/common/l$1;
.super Lcom/huawei/cloudservice/c$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwid/api/common/l;->a(Lcom/huawei/cloudservice/LoginHandler;)Lcom/huawei/cloudservice/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/cloudservice/LoginHandler;

.field final synthetic b:Lcom/huawei/hwid/api/common/l;


# direct methods
.method constructor <init>(Lcom/huawei/hwid/api/common/l;Lcom/huawei/cloudservice/LoginHandler;)V
    .locals 0

    .line 85
    iput-object p1, p0, Lcom/huawei/hwid/api/common/l$1;->b:Lcom/huawei/hwid/api/common/l;

    iput-object p2, p0, Lcom/huawei/hwid/api/common/l$1;->a:Lcom/huawei/cloudservice/LoginHandler;

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

    .line 136
    return-void
.end method

.method public a(ILandroid/content/Intent;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 131
    return-void
.end method

.method public a(ILandroid/os/Bundle;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 89
    iget-object v0, p0, Lcom/huawei/hwid/api/common/l$1;->b:Lcom/huawei/hwid/api/common/l;

    iget-object v0, v0, Lcom/huawei/hwid/api/common/l;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 90
    const-string v0, "LoginTask"

    const-string v1, "has cancelled by timeout, return directly"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 91
    return-void

    .line 93
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwid/api/common/l$1;->b:Lcom/huawei/hwid/api/common/l;

    invoke-virtual {v0}, Lcom/huawei/hwid/api/common/l;->a()V

    .line 94
    const/4 v0, -0x1

    if-ne p1, v0, :cond_2

    .line 95
    new-instance v0, Lcom/huawei/hwid/core/datatype/HwAccount;

    invoke-direct {v0}, Lcom/huawei/hwid/core/datatype/HwAccount;-><init>()V

    invoke-virtual {v0, p2}, Lcom/huawei/hwid/core/datatype/HwAccount;->a(Landroid/os/Bundle;)Lcom/huawei/hwid/core/datatype/HwAccount;

    move-result-object v4

    .line 96
    iget-object v0, p0, Lcom/huawei/hwid/api/common/l$1;->b:Lcom/huawei/hwid/api/common/l;

    invoke-static {v0, v4}, Lcom/huawei/hwid/api/common/l;->a(Lcom/huawei/hwid/api/common/l;Lcom/huawei/hwid/core/datatype/HwAccount;)V

    .line 97
    iget-object v0, p0, Lcom/huawei/hwid/api/common/l$1;->b:Lcom/huawei/hwid/api/common/l;

    invoke-static {v0}, Lcom/huawei/hwid/api/common/l;->a(Lcom/huawei/hwid/api/common/l;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hwid/c/a;->a(Landroid/content/Context;)Lcom/huawei/hwid/c/a;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/huawei/hwid/c/a;->a(Lcom/huawei/hwid/core/datatype/HwAccount;)V

    .line 98
    iget-object v0, p0, Lcom/huawei/hwid/api/common/l$1;->b:Lcom/huawei/hwid/api/common/l;

    invoke-static {v0}, Lcom/huawei/hwid/api/common/l;->a(Lcom/huawei/hwid/api/common/l;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hwid/api/common/e;->a(Landroid/content/Context;)[Lcom/huawei/cloudservice/CloudAccount;

    move-result-object v5

    .line 99
    const-string v6, ""

    .line 100
    invoke-virtual {v4}, Lcom/huawei/hwid/core/datatype/HwAccount;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 101
    invoke-virtual {v4}, Lcom/huawei/hwid/core/datatype/HwAccount;->b()Ljava/lang/String;

    move-result-object v6

    .line 103
    :cond_1
    const-string v0, "LoginTask"

    const-string v1, "loginResult"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    invoke-static {v5, v6}, Lcom/huawei/hwid/api/common/e;->a([Lcom/huawei/cloudservice/CloudAccount;Ljava/lang/String;)I

    move-result v7

    .line 106
    iget-object v0, p0, Lcom/huawei/hwid/api/common/l$1;->a:Lcom/huawei/cloudservice/LoginHandler;

    invoke-interface {v0, v5, v7}, Lcom/huawei/cloudservice/LoginHandler;->onLogin([Lcom/huawei/cloudservice/CloudAccount;I)V

    .line 107
    iget-object v0, p0, Lcom/huawei/hwid/api/common/l$1;->b:Lcom/huawei/hwid/api/common/l;

    invoke-static {v0}, Lcom/huawei/hwid/api/common/l;->a(Lcom/huawei/hwid/api/common/l;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hwid/b/a;->a(Landroid/content/Context;)Lcom/huawei/hwid/b/b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/api/common/l$1;->b:Lcom/huawei/hwid/api/common/l;

    invoke-static {v1}, Lcom/huawei/hwid/api/common/l;->a(Lcom/huawei/hwid/api/common/l;)Landroid/content/Context;

    move-result-object v1

    invoke-interface {v0, v1, v4}, Lcom/huawei/hwid/b/b;->a(Landroid/content/Context;Lcom/huawei/hwid/core/datatype/HwAccount;)Z

    .line 118
    goto :goto_0

    :cond_2
    if-nez p1, :cond_3

    .line 119
    iget-object v0, p0, Lcom/huawei/hwid/api/common/l$1;->a:Lcom/huawei/cloudservice/LoginHandler;

    new-instance v1, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v2, "Account hasnot login"

    const/16 v3, 0x1f

    invoke-direct {v1, v3, v2}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/huawei/cloudservice/LoginHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    goto :goto_0

    .line 120
    :cond_3
    const/4 v0, 0x1

    if-ne p1, v0, :cond_4

    .line 121
    iget-object v0, p0, Lcom/huawei/hwid/api/common/l$1;->a:Lcom/huawei/cloudservice/LoginHandler;

    new-instance v1, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v2, "Signature invalid"

    const/16 v3, 0x1d

    invoke-direct {v1, v3, v2}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/huawei/cloudservice/LoginHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    goto :goto_0

    .line 122
    :cond_4
    const/4 v0, 0x2

    if-ne p1, v0, :cond_5

    .line 123
    iget-object v0, p0, Lcom/huawei/hwid/api/common/l$1;->a:Lcom/huawei/cloudservice/LoginHandler;

    new-instance v1, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v2, "serviceToken invalid"

    const/16 v3, 0x1e

    invoke-direct {v1, v3, v2}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/huawei/cloudservice/LoginHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    goto :goto_0

    .line 125
    :cond_5
    const-string v0, "LoginTask"

    const-string v1, "DONT KNOW RET_CODE:"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 127
    :goto_0
    return-void
.end method

.method public b(ILandroid/os/Bundle;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 141
    return-void
.end method
