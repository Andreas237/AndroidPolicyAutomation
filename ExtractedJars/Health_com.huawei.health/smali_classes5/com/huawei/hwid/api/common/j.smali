.class public Lcom/huawei/hwid/api/common/j;
.super Lcom/huawei/hwid/api/common/b;
.source "SourceFile"


# instance fields
.field private d:Lcom/huawei/cloudservice/IntentResultHandler;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:Landroid/os/Bundle;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Lcom/huawei/cloudservice/IntentResultHandler;)V
    .locals 1

    .line 35
    invoke-direct {p0, p1}, Lcom/huawei/hwid/api/common/b;-><init>(Landroid/content/Context;)V

    .line 36
    iput-object p5, p0, Lcom/huawei/hwid/api/common/j;->d:Lcom/huawei/cloudservice/IntentResultHandler;

    .line 37
    iput-object p2, p0, Lcom/huawei/hwid/api/common/j;->e:Ljava/lang/String;

    .line 38
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwid/api/common/j;->f:Ljava/lang/String;

    .line 39
    iput-object p3, p0, Lcom/huawei/hwid/api/common/j;->g:Ljava/lang/String;

    .line 40
    iput-object p4, p0, Lcom/huawei/hwid/api/common/j;->h:Landroid/os/Bundle;

    .line 41
    return-void
.end method

.method static synthetic a(Lcom/huawei/hwid/api/common/j;)Landroid/os/Bundle;
    .locals 1

    .line 15
    iget-object v0, p0, Lcom/huawei/hwid/api/common/j;->h:Landroid/os/Bundle;

    return-object v0
.end method

.method private a(Lcom/huawei/cloudservice/IntentResultHandler;)Lcom/huawei/cloudservice/c;
    .locals 1

    .line 82
    new-instance v0, Lcom/huawei/hwid/api/common/j$1;

    invoke-direct {v0, p0, p1}, Lcom/huawei/hwid/api/common/j$1;-><init>(Lcom/huawei/hwid/api/common/j;Lcom/huawei/cloudservice/IntentResultHandler;)V

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/hwid/api/common/j;)Ljava/lang/String;
    .locals 1

    .line 15
    iget-object v0, p0, Lcom/huawei/hwid/api/common/j;->e:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method a(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V
    .locals 3

    .line 68
    move-object v2, p1

    .line 69
    if-nez p1, :cond_0

    .line 70
    new-instance v2, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "timeout. retry again"

    const/16 v1, 0x27

    invoke-direct {v2, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 72
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwid/api/common/j;->d:Lcom/huawei/cloudservice/IntentResultHandler;

    invoke-interface {v0, v2}, Lcom/huawei/cloudservice/IntentResultHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 73
    return-void
.end method

.method b()V
    .locals 7

    .line 48
    iget-object v0, p0, Lcom/huawei/hwid/api/common/j;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/hwid/api/common/a;->a(Landroid/content/Context;)Lcom/huawei/hwid/api/common/a;

    move-result-object v4

    .line 49
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 50
    return-void

    .line 52
    :cond_0
    invoke-virtual {v4}, Lcom/huawei/hwid/api/common/a;->a()Lcom/huawei/cloudservice/b;

    move-result-object v5

    .line 54
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwid/api/common/j;->e:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/hwid/api/common/j;->f:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/hwid/api/common/j;->g:Ljava/lang/String;

    iget-object v3, p0, Lcom/huawei/hwid/api/common/j;->d:Lcom/huawei/cloudservice/IntentResultHandler;

    invoke-direct {p0, v3}, Lcom/huawei/hwid/api/common/j;->a(Lcom/huawei/cloudservice/IntentResultHandler;)Lcom/huawei/cloudservice/c;

    move-result-object v3

    invoke-interface {v5, v0, v1, v2, v3}, Lcom/huawei/cloudservice/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/cloudservice/c;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 57
    goto :goto_0

    .line 55
    :catch_0
    move-exception v6

    .line 56
    const-string v0, "RemoteAccessAuthorizeIntentTask"

    const-string v1, "remote exception"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    :goto_0
    return-void
.end method
