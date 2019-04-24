.class public Lcom/huawei/hwid/api/common/m;
.super Lcom/huawei/hwid/api/common/b;
.source "SourceFile"


# instance fields
.field private d:Ljava/lang/String;

.field private e:Landroid/os/Bundle;

.field private f:Ljava/lang/String;

.field private g:Lcom/huawei/cloudservice/LogoutHandler;

.field private h:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Lcom/huawei/cloudservice/LogoutHandler;)V
    .locals 0

    .line 40
    invoke-direct {p0, p1}, Lcom/huawei/hwid/api/common/b;-><init>(Landroid/content/Context;)V

    .line 41
    iput-object p1, p0, Lcom/huawei/hwid/api/common/m;->h:Landroid/content/Context;

    .line 42
    iput-object p2, p0, Lcom/huawei/hwid/api/common/m;->d:Ljava/lang/String;

    .line 43
    iput-object p3, p0, Lcom/huawei/hwid/api/common/m;->f:Ljava/lang/String;

    .line 44
    iput-object p4, p0, Lcom/huawei/hwid/api/common/m;->e:Landroid/os/Bundle;

    .line 45
    iput-object p5, p0, Lcom/huawei/hwid/api/common/m;->g:Lcom/huawei/cloudservice/LogoutHandler;

    .line 46
    return-void
.end method

.method static synthetic a(Lcom/huawei/hwid/api/common/m;)Landroid/content/Context;
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/huawei/hwid/api/common/m;->h:Landroid/content/Context;

    return-object v0
.end method

.method private a(Lcom/huawei/cloudservice/LogoutHandler;)Lcom/huawei/cloudservice/c;
    .locals 1

    .line 86
    new-instance v0, Lcom/huawei/hwid/api/common/m$1;

    invoke-direct {v0, p0, p1}, Lcom/huawei/hwid/api/common/m$1;-><init>(Lcom/huawei/hwid/api/common/m;Lcom/huawei/cloudservice/LogoutHandler;)V

    return-object v0
.end method


# virtual methods
.method a(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V
    .locals 3

    .line 73
    move-object v2, p1

    .line 74
    if-nez p1, :cond_0

    .line 75
    new-instance v2, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "login timeout. retry again"

    const/16 v1, 0x27

    invoke-direct {v2, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 77
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwid/api/common/m;->g:Lcom/huawei/cloudservice/LogoutHandler;

    invoke-interface {v0, v2}, Lcom/huawei/cloudservice/LogoutHandler;->onFail(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 78
    return-void
.end method

.method b()V
    .locals 7

    .line 53
    iget-object v0, p0, Lcom/huawei/hwid/api/common/m;->h:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/hwid/api/common/a;->a(Landroid/content/Context;)Lcom/huawei/hwid/api/common/a;

    move-result-object v4

    .line 54
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 55
    const-string v0, "LogoutTask"

    const-string v1, "cloudAccount logout  null == aidlClientManager"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    return-void

    .line 58
    :cond_0
    invoke-virtual {v4}, Lcom/huawei/hwid/api/common/a;->a()Lcom/huawei/cloudservice/b;

    move-result-object v5

    .line 60
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwid/api/common/m;->d:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/hwid/api/common/m;->f:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/hwid/api/common/m;->e:Landroid/os/Bundle;

    iget-object v3, p0, Lcom/huawei/hwid/api/common/m;->g:Lcom/huawei/cloudservice/LogoutHandler;

    invoke-direct {p0, v3}, Lcom/huawei/hwid/api/common/m;->a(Lcom/huawei/cloudservice/LogoutHandler;)Lcom/huawei/cloudservice/c;

    move-result-object v3

    invoke-interface {v5, v0, v1, v2, v3}, Lcom/huawei/cloudservice/b;->a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Lcom/huawei/cloudservice/c;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 63
    goto :goto_0

    .line 61
    :catch_0
    move-exception v6

    .line 62
    const-string v0, "LogoutTask"

    const-string v1, "login remote exception"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    :goto_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 135
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "LogoutTask{  mServiceType=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/api/common/m;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
