.class Lcom/huawei/hwid/api/common/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/cloudservice/CloudRequestHandler;


# instance fields
.field a:Landroid/app/Activity;

.field b:Lcom/huawei/cloudservice/CloudRequestHandler;

.field c:Lcom/huawei/hwid/core/datatype/HwAccount;


# direct methods
.method constructor <init>(Landroid/app/Activity;Lcom/huawei/cloudservice/CloudRequestHandler;Lcom/huawei/hwid/core/datatype/HwAccount;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Lcom/huawei/hwid/api/common/p;->a:Landroid/app/Activity;

    .line 32
    iput-object p2, p0, Lcom/huawei/hwid/api/common/p;->b:Lcom/huawei/cloudservice/CloudRequestHandler;

    .line 33
    iput-object p3, p0, Lcom/huawei/hwid/api/common/p;->c:Lcom/huawei/hwid/core/datatype/HwAccount;

    .line 34
    return-void
.end method

.method private a(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/cloudservice/CloudRequestHandler;Landroid/os/Bundle;)V
    .locals 7

    .line 54
    const-string v0, "TmpCloudRequestHandler"

    const-string v1, "logoutHwIDByUserID"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    invoke-static {p1, p3}, Lcom/huawei/hwid/api/common/o;->a(Landroid/content/Context;Lcom/huawei/cloudservice/CloudRequestHandler;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 56
    const-string v0, "TmpCloudRequestHandler"

    const-string v1, "logoutHwIDByUserID: context or cloudRequestHandler is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    return-void

    .line 60
    :cond_0
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 61
    const/4 v0, 0x0

    if-eq v0, p3, :cond_1

    .line 62
    new-instance v2, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "userId is empty"

    const/16 v1, 0xc

    invoke-direct {v2, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 63
    invoke-interface {p3, v2}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 65
    :cond_1
    const-string v0, "TmpCloudRequestHandler"

    const-string v1, "userId is empty"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    return-void

    .line 69
    :cond_2
    invoke-static {p1}, Lcom/huawei/hwid/api/common/o;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 70
    if-eqz p3, :cond_3

    .line 71
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 72
    const-string v0, "result_code"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 73
    invoke-interface {p3, v2}, Lcom/huawei/cloudservice/CloudRequestHandler;->onFinish(Landroid/os/Bundle;)V

    .line 75
    :cond_3
    return-void

    .line 77
    :cond_4
    const-string v0, "TmpCloudRequestHandler"

    const-string v1, "getHwAccount"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    const/4 v2, 0x0

    .line 80
    invoke-static {p1, p2}, Lcom/huawei/hwid/api/common/e;->b(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/cloudservice/CloudAccount;

    move-result-object v3

    .line 81
    const/4 v0, 0x0

    if-eq v0, v3, :cond_5

    .line 82
    invoke-virtual {v3}, Lcom/huawei/cloudservice/CloudAccount;->getAccountData()Lcom/huawei/hwid/core/datatype/HwAccount;

    move-result-object v2

    .line 84
    :cond_5
    const-string v4, ""

    .line 85
    const-string v5, ""

    .line 86
    if-eqz v2, :cond_6

    .line 87
    invoke-virtual {v2}, Lcom/huawei/hwid/core/datatype/HwAccount;->b()Ljava/lang/String;

    move-result-object v4

    .line 88
    invoke-virtual {v2}, Lcom/huawei/hwid/core/datatype/HwAccount;->g()Ljava/lang/String;

    move-result-object v5

    .line 90
    :cond_6
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 91
    const-string v0, "accountName"

    invoke-virtual {p4, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 93
    :cond_7
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 94
    const-string v0, "servicetoken"

    invoke-virtual {p4, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 96
    :cond_8
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_9

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 97
    :cond_9
    const/4 v0, 0x0

    if-eq v0, p3, :cond_a

    .line 98
    new-instance v6, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "accountName or serviceToken is empty"

    const/16 v1, 0xc

    invoke-direct {v6, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 99
    invoke-interface {p3, v6}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 100
    const-string v0, "TmpCloudRequestHandler"

    const-string v1, "accountName or serviceToken is empty"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    :cond_a
    return-void

    .line 104
    :cond_b
    invoke-static {p1}, Lcom/huawei/hwid/core/d/b;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_d

    .line 105
    const/4 v0, 0x0

    if-eq v0, p3, :cond_c

    .line 106
    new-instance v6, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "CS_no_network_content"

    invoke-static {p1, v0}, Lcom/huawei/hwid/core/d/i;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x5

    invoke-direct {v6, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 108
    invoke-interface {p3, v6}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 109
    const-string v0, "TmpCloudRequestHandler"

    const-string v1, "network is not avaible"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    :cond_c
    return-void

    .line 114
    :cond_d
    iget-object v0, p0, Lcom/huawei/hwid/api/common/p;->a:Landroid/app/Activity;

    invoke-virtual {p0, v0}, Lcom/huawei/hwid/api/common/p;->a(Landroid/content/Context;)V

    .line 115
    invoke-static {p1}, Lcom/huawei/hwid/api/common/e;->b(Landroid/content/Context;)V

    .line 117
    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 118
    const-string v0, "result_code"

    const/4 v1, 0x1

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 119
    invoke-interface {p3, v6}, Lcom/huawei/cloudservice/CloudRequestHandler;->onFinish(Landroid/os/Bundle;)V

    .line 121
    invoke-static {p1, v4}, Lcom/huawei/hwid/api/common/e;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_e

    .line 122
    invoke-static {p1, p2, v4, v5}, Lcom/huawei/hwid/api/common/p;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    :cond_e
    return-void
.end method

.method private static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 127
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/huawei/hwid/api/common/p$1;

    invoke-direct {v1, p1, p3, p0, p2}, Lcom/huawei/hwid/api/common/p$1;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 149
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 150
    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;)V
    .locals 4

    .line 153
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 154
    const-string v0, "TmpCloudRequestHandler"

    const-string v1, "context is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 155
    return-void

    .line 157
    :cond_0
    invoke-static {p1}, Lcom/huawei/hwid/core/d/b;->h(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1}, Lcom/huawei/hwid/api/common/o;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 158
    iget-object v0, p0, Lcom/huawei/hwid/api/common/p;->c:Lcom/huawei/hwid/core/datatype/HwAccount;

    invoke-static {p1, v0}, Lcom/huawei/hwid/api/common/apkimpl/a;->a(Landroid/content/Context;Lcom/huawei/hwid/core/datatype/HwAccount;)V

    .line 167
    :cond_1
    const-string v0, ""

    invoke-static {p1, v0}, Lcom/huawei/hwid/api/common/o;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 168
    invoke-static {p1}, Lcom/huawei/hwid/core/d/b;->l(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    .line 169
    invoke-static {p1}, Lcom/huawei/hwid/b/a;->a(Landroid/content/Context;)Lcom/huawei/hwid/b/b;

    move-result-object v0

    invoke-interface {v0, p1, v2}, Lcom/huawei/hwid/b/b;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 171
    invoke-static {}, Lcom/huawei/hwid/api/common/o;->a()Lcom/huawei/cloudservice/LoginHandler;

    move-result-object v3

    .line 173
    const/4 v0, 0x0

    if-eq v0, v3, :cond_2

    .line 176
    const/4 v0, 0x0

    new-array v0, v0, [Lcom/huawei/cloudservice/CloudAccount;

    const/4 v1, -0x1

    invoke-interface {v3, v0, v1}, Lcom/huawei/cloudservice/LoginHandler;->onLogout([Lcom/huawei/cloudservice/CloudAccount;I)V

    .line 178
    :cond_2
    return-void
.end method

.method public onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V
    .locals 0

    .line 51
    return-void
.end method

.method public onFinish(Landroid/os/Bundle;)V
    .locals 5

    .line 37
    if-nez p1, :cond_0

    .line 38
    return-void

    .line 40
    :cond_0
    const-string v0, "result_code"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v3

    .line 41
    const/4 v0, 0x1

    if-ne v0, v3, :cond_1

    .line 42
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 43
    const-string v0, "accountName"

    iget-object v1, p0, Lcom/huawei/hwid/api/common/p;->c:Lcom/huawei/hwid/core/datatype/HwAccount;

    invoke-virtual {v1}, Lcom/huawei/hwid/core/datatype/HwAccount;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    const-string v0, "servicetoken"

    iget-object v1, p0, Lcom/huawei/hwid/api/common/p;->c:Lcom/huawei/hwid/core/datatype/HwAccount;

    invoke-virtual {v1}, Lcom/huawei/hwid/core/datatype/HwAccount;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    iget-object v0, p0, Lcom/huawei/hwid/api/common/p;->a:Landroid/app/Activity;

    iget-object v1, p0, Lcom/huawei/hwid/api/common/p;->c:Lcom/huawei/hwid/core/datatype/HwAccount;

    invoke-virtual {v1}, Lcom/huawei/hwid/core/datatype/HwAccount;->d()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/hwid/api/common/p;->b:Lcom/huawei/cloudservice/CloudRequestHandler;

    invoke-direct {p0, v0, v1, v2, v4}, Lcom/huawei/hwid/api/common/p;->a(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/cloudservice/CloudRequestHandler;Landroid/os/Bundle;)V

    .line 47
    :cond_1
    return-void
.end method
