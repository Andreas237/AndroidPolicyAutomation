.class public Lcom/huawei/hwid/api/common/l;
.super Lcom/huawei/hwid/api/common/b;
.source "SourceFile"


# instance fields
.field private d:Ljava/lang/String;

.field private e:Landroid/os/Bundle;

.field private f:Lcom/huawei/cloudservice/LoginHandler;

.field private g:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Lcom/huawei/cloudservice/LoginHandler;)V
    .locals 0

    .line 41
    invoke-direct {p0, p1}, Lcom/huawei/hwid/api/common/b;-><init>(Landroid/content/Context;)V

    .line 42
    iput-object p1, p0, Lcom/huawei/hwid/api/common/l;->g:Landroid/content/Context;

    .line 43
    iput-object p2, p0, Lcom/huawei/hwid/api/common/l;->d:Ljava/lang/String;

    .line 44
    iput-object p3, p0, Lcom/huawei/hwid/api/common/l;->e:Landroid/os/Bundle;

    .line 45
    iput-object p4, p0, Lcom/huawei/hwid/api/common/l;->f:Lcom/huawei/cloudservice/LoginHandler;

    .line 46
    return-void
.end method

.method static synthetic a(Lcom/huawei/hwid/api/common/l;)Landroid/content/Context;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/huawei/hwid/api/common/l;->g:Landroid/content/Context;

    return-object v0
.end method

.method private a(Lcom/huawei/cloudservice/LoginHandler;)Lcom/huawei/cloudservice/c;
    .locals 1

    .line 85
    new-instance v0, Lcom/huawei/hwid/api/common/l$1;

    invoke-direct {v0, p0, p1}, Lcom/huawei/hwid/api/common/l$1;-><init>(Lcom/huawei/hwid/api/common/l;Lcom/huawei/cloudservice/LoginHandler;)V

    return-object v0
.end method

.method static synthetic a(Lcom/huawei/hwid/api/common/l;Lcom/huawei/hwid/core/datatype/HwAccount;)V
    .locals 0

    .line 25
    invoke-direct {p0, p1}, Lcom/huawei/hwid/api/common/l;->a(Lcom/huawei/hwid/core/datatype/HwAccount;)V

    return-void
.end method

.method private a(Lcom/huawei/hwid/core/datatype/HwAccount;)V
    .locals 3

    .line 147
    invoke-virtual {p1}, Lcom/huawei/hwid/core/datatype/HwAccount;->o()Ljava/lang/String;

    move-result-object v2

    .line 148
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "null"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 149
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwid/api/common/l;->g:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/k;->a(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v2

    .line 150
    const/4 v0, 0x0

    if-ne v0, v2, :cond_1

    .line 151
    const-string v2, ""

    .line 153
    :cond_1
    invoke-virtual {p1, v2}, Lcom/huawei/hwid/core/datatype/HwAccount;->n(Ljava/lang/String;)V

    .line 155
    :cond_2
    return-void
.end method


# virtual methods
.method a(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V
    .locals 3

    .line 72
    move-object v2, p1

    .line 73
    if-nez p1, :cond_0

    .line 74
    new-instance v2, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "login timeout. retry again"

    const/16 v1, 0x27

    invoke-direct {v2, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 76
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwid/api/common/l;->f:Lcom/huawei/cloudservice/LoginHandler;

    invoke-interface {v0, v2}, Lcom/huawei/cloudservice/LoginHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 77
    return-void
.end method

.method b()V
    .locals 6

    .line 53
    iget-object v0, p0, Lcom/huawei/hwid/api/common/l;->g:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/hwid/api/common/a;->a(Landroid/content/Context;)Lcom/huawei/hwid/api/common/a;

    move-result-object v3

    .line 54
    const/4 v0, 0x0

    if-ne v0, v3, :cond_0

    .line 55
    return-void

    .line 57
    :cond_0
    invoke-virtual {v3}, Lcom/huawei/hwid/api/common/a;->a()Lcom/huawei/cloudservice/b;

    move-result-object v4

    .line 59
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwid/api/common/l;->d:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/hwid/api/common/l;->e:Landroid/os/Bundle;

    iget-object v2, p0, Lcom/huawei/hwid/api/common/l;->f:Lcom/huawei/cloudservice/LoginHandler;

    invoke-direct {p0, v2}, Lcom/huawei/hwid/api/common/l;->a(Lcom/huawei/cloudservice/LoginHandler;)Lcom/huawei/cloudservice/c;

    move-result-object v2

    invoke-interface {v4, v0, v1, v2}, Lcom/huawei/cloudservice/b;->a(Ljava/lang/String;Landroid/os/Bundle;Lcom/huawei/cloudservice/c;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 62
    goto :goto_0

    .line 60
    :catch_0
    move-exception v5

    .line 61
    const-string v0, "LoginTask"

    const-string v1, "login remote exception"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    :goto_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 159
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "LoginTask{mServiceType=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/api/common/l;->d:Ljava/lang/String;

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
