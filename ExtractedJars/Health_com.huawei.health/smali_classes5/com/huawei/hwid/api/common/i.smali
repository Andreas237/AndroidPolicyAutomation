.class Lcom/huawei/hwid/api/common/i;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# instance fields
.field private a:Landroid/content/Context;

.field private b:Lcom/huawei/cloudservice/CloudRequestHandler;

.field private c:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/cloudservice/CloudRequestHandler;)V
    .locals 1

    .line 28
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 26
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwid/api/common/i;->c:Z

    .line 29
    iput-object p1, p0, Lcom/huawei/hwid/api/common/i;->a:Landroid/content/Context;

    .line 30
    iput-object p2, p0, Lcom/huawei/hwid/api/common/i;->b:Lcom/huawei/cloudservice/CloudRequestHandler;

    .line 31
    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    .line 38
    iget-boolean v0, p0, Lcom/huawei/hwid/api/common/i;->c:Z

    if-eqz v0, :cond_0

    .line 39
    return-void

    .line 44
    :cond_0
    :try_start_0
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 45
    const-string v0, "FingerBroadcastReceiver"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 46
    iget-object v0, p0, Lcom/huawei/hwid/api/common/i;->a:Landroid/content/Context;

    invoke-static {v0, v2}, Lcom/huawei/hwid/api/common/e;->a(Landroid/content/Context;Landroid/os/Bundle;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    goto :goto_0

    .line 47
    :catch_0
    move-exception v2

    .line 48
    const-string v0, "FingerBroadcastReceiver"

    const-string v1, "IllegalArgumentException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    :goto_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/hwid/api/common/i;->c:Z

    .line 52
    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 53
    return-void

    .line 55
    :cond_1
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    .line 57
    invoke-static {p1}, Lcom/huawei/hwid/api/common/e;->e(Landroid/content/Context;)V

    .line 60
    const-string v0, "com.huawei.cloudserive.fingerSuccess"

    :try_start_1
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 61
    iget-object v0, p0, Lcom/huawei/hwid/api/common/i;->b:Lcom/huawei/cloudservice/CloudRequestHandler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 63
    invoke-static {p1, p2}, Lcom/huawei/hwid/api/common/e;->a(Landroid/content/Context;Landroid/content/Intent;)V

    .line 64
    const-string v0, "bundle"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v3

    .line 65
    const/4 v0, 0x0

    if-ne v0, v3, :cond_2

    .line 66
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 68
    :cond_2
    iget-object v0, p0, Lcom/huawei/hwid/api/common/i;->b:Lcom/huawei/cloudservice/CloudRequestHandler;

    invoke-interface {v0, v3}, Lcom/huawei/cloudservice/CloudRequestHandler;->onFinish(Landroid/os/Bundle;)V

    .line 69
    goto :goto_1

    .line 70
    :cond_3
    const-string v0, "com.huawei.cloudserive.fingerCancel"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 71
    new-instance v3, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "use the sdk: press cancel or back key"

    const/16 v1, 0xbba

    invoke-direct {v3, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 72
    iget-object v0, p0, Lcom/huawei/hwid/api/common/i;->b:Lcom/huawei/cloudservice/CloudRequestHandler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 73
    iget-object v0, p0, Lcom/huawei/hwid/api/common/i;->b:Lcom/huawei/cloudservice/CloudRequestHandler;

    invoke-interface {v0, v3}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    .line 78
    :cond_4
    :goto_1
    goto :goto_2

    .line 76
    :catch_1
    move-exception v3

    .line 77
    const-string v0, "FingerBroadcastReceiver"

    const-string v1, "BroadcastReceiver components are not allowed to register to receive intents"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    :goto_2
    return-void
.end method
