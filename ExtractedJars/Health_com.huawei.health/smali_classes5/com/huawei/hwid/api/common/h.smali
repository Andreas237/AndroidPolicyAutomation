.class public Lcom/huawei/hwid/api/common/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lcom/huawei/cloudservice/b;

.field private b:Landroid/content/Context;

.field private c:Landroid/content/Intent;

.field private d:I

.field private e:Lcom/huawei/cloudservice/CloudRequestHandler;

.field private f:Z

.field private g:Landroid/content/ServiceConnection;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/content/Intent;I)V
    .locals 1

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwid/api/common/h;->b:Landroid/content/Context;

    .line 30
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwid/api/common/h;->c:Landroid/content/Intent;

    .line 31
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwid/api/common/h;->d:I

    .line 32
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwid/api/common/h;->e:Lcom/huawei/cloudservice/CloudRequestHandler;

    .line 33
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwid/api/common/h;->f:Z

    .line 103
    new-instance v0, Lcom/huawei/hwid/api/common/h$1;

    invoke-direct {v0, p0}, Lcom/huawei/hwid/api/common/h$1;-><init>(Lcom/huawei/hwid/api/common/h;)V

    iput-object v0, p0, Lcom/huawei/hwid/api/common/h;->g:Landroid/content/ServiceConnection;

    .line 36
    iput-object p1, p0, Lcom/huawei/hwid/api/common/h;->b:Landroid/content/Context;

    .line 37
    iput-object p2, p0, Lcom/huawei/hwid/api/common/h;->c:Landroid/content/Intent;

    .line 38
    iput p3, p0, Lcom/huawei/hwid/api/common/h;->d:I

    .line 39
    return-void
.end method

.method static synthetic a(Lcom/huawei/hwid/api/common/h;)Lcom/huawei/cloudservice/b;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/huawei/hwid/api/common/h;->a:Lcom/huawei/cloudservice/b;

    return-object v0
.end method

.method static synthetic a(Lcom/huawei/hwid/api/common/h;Lcom/huawei/cloudservice/b;)Lcom/huawei/cloudservice/b;
    .locals 0

    .line 26
    iput-object p1, p0, Lcom/huawei/hwid/api/common/h;->a:Lcom/huawei/cloudservice/b;

    return-object p1
.end method

.method private b()V
    .locals 4

    .line 59
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 60
    const-string v0, "com.huawei.hwid.ICloudService"

    invoke-virtual {v3, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 61
    const-string v0, "com.huawei.hwid"

    invoke-virtual {v3, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 62
    const-string v0, "CloudAccountServiceClient2"

    const-string v1, "begin to bindService"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    iget-object v0, p0, Lcom/huawei/hwid/api/common/h;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/api/common/h;->g:Landroid/content/ServiceConnection;

    const/4 v2, 0x1

    invoke-virtual {v0, v3, v1, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwid/api/common/h;->f:Z

    .line 64
    return-void
.end method

.method static synthetic b(Lcom/huawei/hwid/api/common/h;)V
    .locals 0

    .line 26
    invoke-direct {p0}, Lcom/huawei/hwid/api/common/h;->c()V

    return-void
.end method

.method private c()V
    .locals 5

    .line 67
    const-string v0, "CloudAccountServiceClient2"

    const-string v1, "saveLogoutIntent"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    iget-object v0, p0, Lcom/huawei/hwid/api/common/h;->a:Lcom/huawei/cloudservice/b;

    if-eqz v0, :cond_4

    .line 70
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwid/api/common/h;->a:Lcom/huawei/cloudservice/b;

    iget-object v1, p0, Lcom/huawei/hwid/api/common/h;->c:Landroid/content/Intent;

    iget v2, p0, Lcom/huawei/hwid/api/common/h;->d:I

    invoke-interface {v0, v1, v2}, Lcom/huawei/cloudservice/b;->a(Landroid/content/Intent;I)I

    move-result v3

    .line 71
    const/4 v0, 0x3

    if-ne v0, v3, :cond_0

    .line 72
    new-instance v4, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "already exists same priority"

    const/16 v1, 0x26

    invoke-direct {v4, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 73
    iget-object v0, p0, Lcom/huawei/hwid/api/common/h;->e:Lcom/huawei/cloudservice/CloudRequestHandler;

    invoke-interface {v0, v4}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 74
    goto :goto_1

    .line 75
    :cond_0
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 76
    const/4 v0, 0x2

    if-ne v0, v3, :cond_1

    .line 77
    const-string v0, "isSuccess"

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    goto :goto_0

    .line 78
    :cond_1
    const/4 v0, 0x1

    if-ne v0, v3, :cond_2

    .line 79
    const-string v0, "isSuccess"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 81
    :cond_2
    :goto_0
    const-string v0, "CloudAccountServiceClient2"

    const-string v1, "onFinish"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    iget-object v0, p0, Lcom/huawei/hwid/api/common/h;->e:Lcom/huawei/cloudservice/CloudRequestHandler;

    invoke-interface {v0, v4}, Lcom/huawei/cloudservice/CloudRequestHandler;->onFinish(Landroid/os/Bundle;)V

    .line 84
    :goto_1
    iget-boolean v0, p0, Lcom/huawei/hwid/api/common/h;->f:Z

    if-eqz v0, :cond_3

    .line 85
    iget-object v0, p0, Lcom/huawei/hwid/api/common/h;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/api/common/h;->g:Landroid/content/ServiceConnection;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    .line 86
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwid/api/common/h;->f:Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 92
    :cond_3
    goto :goto_2

    .line 88
    :catch_0
    move-exception v3

    .line 89
    const-string v0, "CloudAccountServiceClient2"

    const-string v1, "Call Remote Exception"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    new-instance v4, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "RemoteException"

    const/16 v1, 0x26

    invoke-direct {v4, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 91
    iget-object v0, p0, Lcom/huawei/hwid/api/common/h;->e:Lcom/huawei/cloudservice/CloudRequestHandler;

    invoke-interface {v0, v4}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 92
    goto :goto_2

    .line 94
    :cond_4
    new-instance v3, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "failed to get the remote interface"

    const/16 v1, 0x26

    invoke-direct {v3, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 95
    iget-object v0, p0, Lcom/huawei/hwid/api/common/h;->e:Lcom/huawei/cloudservice/CloudRequestHandler;

    invoke-interface {v0, v3}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 97
    :goto_2
    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 42
    const-string v0, "CloudAccountServiceClient2"

    const-string v1, "bindService"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    iget-object v0, p0, Lcom/huawei/hwid/api/common/h;->e:Lcom/huawei/cloudservice/CloudRequestHandler;

    if-eqz v0, :cond_1

    .line 45
    iget-object v0, p0, Lcom/huawei/hwid/api/common/h;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/hwid/api/common/apkimpl/a;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 46
    iget-object v0, p0, Lcom/huawei/hwid/api/common/h;->e:Lcom/huawei/cloudservice/CloudRequestHandler;

    new-instance v1, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v2, "Account hasnot login"

    const/16 v3, 0x1f

    invoke-direct {v1, v3, v2}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 47
    return-void

    .line 49
    :cond_0
    invoke-direct {p0}, Lcom/huawei/hwid/api/common/h;->b()V

    goto :goto_0

    .line 51
    :cond_1
    const-string v0, "CloudAccountServiceClient2"

    const-string v1, "has not set mCloudRequesthandler"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    :goto_0
    return-void
.end method

.method public a(Lcom/huawei/cloudservice/CloudRequestHandler;)V
    .locals 0

    .line 100
    iput-object p1, p0, Lcom/huawei/hwid/api/common/h;->e:Lcom/huawei/cloudservice/CloudRequestHandler;

    .line 101
    return-void
.end method
