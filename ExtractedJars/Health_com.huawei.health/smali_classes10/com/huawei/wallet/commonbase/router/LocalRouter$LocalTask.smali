.class Lcom/huawei/wallet/commonbase/router/LocalRouter$LocalTask;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/wallet/commonbase/router/LocalRouter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "LocalTask"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/util/concurrent/Callable<Lcom/huawei/wallet/commonbase/router/RouterResponse;>;"
    }
.end annotation


# instance fields
.field private a:Lcom/huawei/wallet/commonbase/router/WalletAction;

.field private b:Lcom/huawei/wallet/commonbase/router/WalletActionRequest;

.field private c:Landroid/content/Context;

.field private d:Lcom/huawei/wallet/commonbase/router/RouterActionCallBack;

.field private e:Lcom/huawei/wallet/commonbase/router/RouterResponse;


# direct methods
.method public constructor <init>(Lcom/huawei/wallet/commonbase/router/RouterActionCallBack;Lcom/huawei/wallet/commonbase/router/RouterResponse;Lcom/huawei/wallet/commonbase/router/WalletActionRequest;Landroid/content/Context;Lcom/huawei/wallet/commonbase/router/WalletAction;)V
    .locals 0

    .line 144
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 145
    iput-object p4, p0, Lcom/huawei/wallet/commonbase/router/LocalRouter$LocalTask;->c:Landroid/content/Context;

    .line 146
    iput-object p2, p0, Lcom/huawei/wallet/commonbase/router/LocalRouter$LocalTask;->e:Lcom/huawei/wallet/commonbase/router/RouterResponse;

    .line 147
    iput-object p3, p0, Lcom/huawei/wallet/commonbase/router/LocalRouter$LocalTask;->b:Lcom/huawei/wallet/commonbase/router/WalletActionRequest;

    .line 148
    iput-object p5, p0, Lcom/huawei/wallet/commonbase/router/LocalRouter$LocalTask;->a:Lcom/huawei/wallet/commonbase/router/WalletAction;

    .line 149
    iput-object p1, p0, Lcom/huawei/wallet/commonbase/router/LocalRouter$LocalTask;->d:Lcom/huawei/wallet/commonbase/router/RouterActionCallBack;

    .line 150
    return-void
.end method


# virtual methods
.method public a()Lcom/huawei/wallet/commonbase/router/RouterResponse;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 154
    iget-object v0, p0, Lcom/huawei/wallet/commonbase/router/LocalRouter$LocalTask;->a:Lcom/huawei/wallet/commonbase/router/WalletAction;

    iget-object v1, p0, Lcom/huawei/wallet/commonbase/router/LocalRouter$LocalTask;->c:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/wallet/commonbase/router/LocalRouter$LocalTask;->b:Lcom/huawei/wallet/commonbase/router/WalletActionRequest;

    invoke-interface {v0, v1, v2}, Lcom/huawei/wallet/commonbase/router/WalletAction;->c(Landroid/content/Context;Lcom/huawei/wallet/commonbase/router/WalletActionRequest;)Lcom/huawei/wallet/commonbase/router/WalletActionResult;

    move-result-object v3

    .line 155
    iget-object v0, p0, Lcom/huawei/wallet/commonbase/router/LocalRouter$LocalTask;->e:Lcom/huawei/wallet/commonbase/router/RouterResponse;

    invoke-virtual {v3}, Lcom/huawei/wallet/commonbase/router/WalletActionResult;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/wallet/commonbase/router/RouterResponse;->c(Ljava/lang/String;)V

    .line 156
    iget-object v0, p0, Lcom/huawei/wallet/commonbase/router/LocalRouter$LocalTask;->e:Lcom/huawei/wallet/commonbase/router/RouterResponse;

    invoke-virtual {v3}, Lcom/huawei/wallet/commonbase/router/WalletActionResult;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/wallet/commonbase/router/RouterResponse;->e(Ljava/lang/String;)V

    .line 158
    invoke-virtual {v3}, Lcom/huawei/wallet/commonbase/router/WalletActionResult;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 160
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ASync invoke action:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/wallet/commonbase/router/LocalRouter$LocalTask;->b:Lcom/huawei/wallet/commonbase/router/WalletActionRequest;

    invoke-virtual {v1}, Lcom/huawei/wallet/commonbase/router/WalletActionRequest;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " success!"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->c(Ljava/lang/String;Z)V

    .line 161
    iget-object v0, p0, Lcom/huawei/wallet/commonbase/router/LocalRouter$LocalTask;->d:Lcom/huawei/wallet/commonbase/router/RouterActionCallBack;

    iget-object v1, p0, Lcom/huawei/wallet/commonbase/router/LocalRouter$LocalTask;->e:Lcom/huawei/wallet/commonbase/router/RouterResponse;

    invoke-interface {v0, v1}, Lcom/huawei/wallet/commonbase/router/RouterActionCallBack;->a(Lcom/huawei/wallet/commonbase/router/RouterResponse;)V

    goto :goto_0

    .line 165
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ASync invoke action:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/wallet/commonbase/router/LocalRouter$LocalTask;->b:Lcom/huawei/wallet/commonbase/router/WalletActionRequest;

    invoke-virtual {v1}, Lcom/huawei/wallet/commonbase/router/WalletActionRequest;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " failed, resultCode:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v3}, Lcom/huawei/wallet/commonbase/router/WalletActionResult;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " resultDesc:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v3}, Lcom/huawei/wallet/commonbase/router/WalletActionResult;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->c(Ljava/lang/String;Z)V

    .line 166
    iget-object v0, p0, Lcom/huawei/wallet/commonbase/router/LocalRouter$LocalTask;->d:Lcom/huawei/wallet/commonbase/router/RouterActionCallBack;

    iget-object v1, p0, Lcom/huawei/wallet/commonbase/router/LocalRouter$LocalTask;->e:Lcom/huawei/wallet/commonbase/router/RouterResponse;

    invoke-interface {v0, v1}, Lcom/huawei/wallet/commonbase/router/RouterActionCallBack;->b(Lcom/huawei/wallet/commonbase/router/RouterResponse;)V

    .line 168
    :goto_0
    iget-object v0, p0, Lcom/huawei/wallet/commonbase/router/LocalRouter$LocalTask;->e:Lcom/huawei/wallet/commonbase/router/RouterResponse;

    return-object v0
.end method

.method public synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 138
    invoke-virtual {p0}, Lcom/huawei/wallet/commonbase/router/LocalRouter$LocalTask;->a()Lcom/huawei/wallet/commonbase/router/RouterResponse;

    move-result-object v0

    return-object v0
.end method
