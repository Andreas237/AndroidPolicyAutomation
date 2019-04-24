.class public Lcom/huawei/hwid/api/common/k;
.super Lcom/huawei/hwid/api/common/b;
.source "SourceFile"


# instance fields
.field private d:Lcom/huawei/cloudservice/CloudRequestHandler;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/cloudservice/CloudRequestHandler;)V
    .locals 1

    .line 32
    invoke-direct {p0, p1}, Lcom/huawei/hwid/api/common/b;-><init>(Landroid/content/Context;)V

    .line 33
    iput-object p3, p0, Lcom/huawei/hwid/api/common/k;->d:Lcom/huawei/cloudservice/CloudRequestHandler;

    .line 34
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwid/api/common/k;->e:Ljava/lang/String;

    .line 35
    iput-object p2, p0, Lcom/huawei/hwid/api/common/k;->f:Ljava/lang/String;

    .line 36
    return-void
.end method

.method private a(Lcom/huawei/cloudservice/CloudRequestHandler;)Lcom/huawei/cloudservice/c;
    .locals 1

    .line 77
    new-instance v0, Lcom/huawei/hwid/api/common/k$1;

    invoke-direct {v0, p0, p1}, Lcom/huawei/hwid/api/common/k$1;-><init>(Lcom/huawei/hwid/api/common/k;Lcom/huawei/cloudservice/CloudRequestHandler;)V

    return-object v0
.end method


# virtual methods
.method a(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V
    .locals 3

    .line 63
    move-object v2, p1

    .line 64
    if-nez p1, :cond_0

    .line 65
    new-instance v2, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "timeout. retry again"

    const/16 v1, 0x27

    invoke-direct {v2, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 67
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwid/api/common/k;->d:Lcom/huawei/cloudservice/CloudRequestHandler;

    invoke-interface {v0, v2}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 68
    return-void
.end method

.method b()V
    .locals 7

    .line 43
    iget-object v0, p0, Lcom/huawei/hwid/api/common/k;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/hwid/api/common/a;->a(Landroid/content/Context;)Lcom/huawei/hwid/api/common/a;

    move-result-object v4

    .line 44
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 45
    return-void

    .line 47
    :cond_0
    invoke-virtual {v4}, Lcom/huawei/hwid/api/common/a;->a()Lcom/huawei/cloudservice/b;

    move-result-object v5

    .line 49
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwid/api/common/k;->e:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/hwid/api/common/k;->f:Ljava/lang/String;

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    iget-object v3, p0, Lcom/huawei/hwid/api/common/k;->d:Lcom/huawei/cloudservice/CloudRequestHandler;

    invoke-direct {p0, v3}, Lcom/huawei/hwid/api/common/k;->a(Lcom/huawei/cloudservice/CloudRequestHandler;)Lcom/huawei/cloudservice/c;

    move-result-object v3

    invoke-interface {v5, v0, v1, v2, v3}, Lcom/huawei/cloudservice/b;->b(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Lcom/huawei/cloudservice/c;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 52
    goto :goto_0

    .line 50
    :catch_0
    move-exception v6

    .line 51
    const-string v0, "GetRealNameInfoTask"

    const-string v1, "remote exception"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    :goto_0
    return-void
.end method
