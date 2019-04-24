.class Lcom/huawei/hwid/api/common/n;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# instance fields
.field private a:Landroid/content/Context;

.field private b:Lcom/huawei/cloudservice/LoginHandler;

.field private c:Z

.field private d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/cloudservice/LoginHandler;Ljava/lang/String;)V
    .locals 1

    .line 38
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 35
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwid/api/common/n;->c:Z

    .line 39
    iput-object p1, p0, Lcom/huawei/hwid/api/common/n;->a:Landroid/content/Context;

    .line 40
    iput-object p2, p0, Lcom/huawei/hwid/api/common/n;->b:Lcom/huawei/cloudservice/LoginHandler;

    .line 41
    iput-object p3, p0, Lcom/huawei/hwid/api/common/n;->d:Ljava/lang/String;

    .line 42
    return-void
.end method

.method private a(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 8

    .line 71
    const-string v0, "OpenLoginBroadcastReceiver"

    const-string v1, "handleOpenLoginBroadcast"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    .line 74
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v3

    .line 79
    const/4 v0, 0x0

    if-eq v0, v2, :cond_8

    .line 80
    const-string v0, "com.huawei.hwid.opensdk.smsauth.success"

    :try_start_0
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "com.huawei.hwid.opensdk.smsauth.quicklogin.SUCCESS"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 81
    :cond_0
    const/4 v0, 0x0

    if-eq v0, v3, :cond_8

    .line 82
    const-string v0, "com.huawei.hwid"

    iget-object v1, p0, Lcom/huawei/hwid/api/common/n;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 83
    const-string v0, "serviceToken"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 84
    iget-object v0, p0, Lcom/huawei/hwid/api/common/n;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Lcom/huawei/hwid/core/d/b;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 85
    const-string v0, "serviceToken"

    invoke-virtual {v3, v0, v5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 87
    :cond_1
    const-string v0, "accountType"

    const-string v1, "2"

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    iget-object v0, p0, Lcom/huawei/hwid/api/common/n;->a:Landroid/content/Context;

    invoke-static {v0, v3}, Lcom/huawei/hwid/api/common/o;->a(Landroid/content/Context;Landroid/os/Bundle;)Lcom/huawei/hwid/core/datatype/HwAccount;

    move-result-object v4

    .line 89
    invoke-virtual {v4}, Lcom/huawei/hwid/core/datatype/HwAccount;->o()Ljava/lang/String;

    move-result-object v5

    .line 90
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "null"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 91
    :cond_2
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/huawei/hwid/core/d/k;->a(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v5

    .line 92
    const/4 v0, 0x0

    if-ne v0, v5, :cond_3

    .line 93
    const-string v5, ""

    .line 95
    :cond_3
    invoke-virtual {v4, v5}, Lcom/huawei/hwid/core/datatype/HwAccount;->n(Ljava/lang/String;)V

    .line 98
    :cond_4
    invoke-static {p1}, Lcom/huawei/hwid/b/a;->a(Landroid/content/Context;)Lcom/huawei/hwid/b/b;

    move-result-object v0

    invoke-interface {v0, p1, v4}, Lcom/huawei/hwid/b/b;->a(Landroid/content/Context;Lcom/huawei/hwid/core/datatype/HwAccount;)Z

    .line 99
    invoke-static {p1}, Lcom/huawei/hwid/api/common/e;->a(Landroid/content/Context;)[Lcom/huawei/cloudservice/CloudAccount;

    move-result-object v6

    .line 100
    const-string v7, ""

    .line 101
    invoke-virtual {v4}, Lcom/huawei/hwid/core/datatype/HwAccount;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 102
    invoke-virtual {v4}, Lcom/huawei/hwid/core/datatype/HwAccount;->b()Ljava/lang/String;

    move-result-object v7

    .line 104
    :cond_5
    iget-object v0, p0, Lcom/huawei/hwid/api/common/n;->b:Lcom/huawei/cloudservice/LoginHandler;

    invoke-static {v6, v7}, Lcom/huawei/hwid/api/common/e;->a([Lcom/huawei/cloudservice/CloudAccount;Ljava/lang/String;)I

    move-result v1

    invoke-interface {v0, v6, v1}, Lcom/huawei/cloudservice/LoginHandler;->onLogin([Lcom/huawei/cloudservice/CloudAccount;I)V

    .line 105
    goto :goto_0

    .line 106
    :cond_6
    const-string v0, "com.huawei.hwid.opensdk.switch.other"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 107
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 108
    invoke-static {p1}, Lcom/huawei/hwid/core/d/b;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/huawei/hwid/core/d/a;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    .line 109
    const-string v0, "loginChannel"

    invoke-virtual {v4, v0, v5}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 110
    invoke-static {p1}, Lcom/huawei/hwid/core/d/b;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/api/common/n;->b:Lcom/huawei/cloudservice/LoginHandler;

    invoke-static {p1, v0, v4, v1}, Lcom/huawei/hwid/api/common/e;->a(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Lcom/huawei/cloudservice/LoginHandler;)V

    .line 111
    goto :goto_0

    :cond_7
    const-string v0, "com.huawei.hwid.opensdk.smsauth.quicklogin.fail"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 112
    new-instance v4, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "press back key"

    const/16 v1, 0xbba

    invoke-direct {v4, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 113
    iget-object v0, p0, Lcom/huawei/hwid/api/common/n;->b:Lcom/huawei/cloudservice/LoginHandler;

    invoke-interface {v0, v4}, Lcom/huawei/cloudservice/LoginHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 118
    :cond_8
    :goto_0
    goto :goto_1

    .line 116
    :catch_0
    move-exception v4

    .line 117
    const-string v0, "OpenLoginBroadcastReceiver"

    const-string v1, "BroadcastReceiver components are not allowed to register to receive intents"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 119
    :goto_1
    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3

    .line 50
    iget-boolean v0, p0, Lcom/huawei/hwid/api/common/n;->c:Z

    if-eqz v0, :cond_0

    .line 51
    return-void

    .line 56
    :cond_0
    :try_start_0
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 57
    const-string v0, "OpenLoginBroadcastReceiver"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 58
    iget-object v0, p0, Lcom/huawei/hwid/api/common/n;->a:Landroid/content/Context;

    invoke-static {v0, v2}, Lcom/huawei/hwid/api/common/e;->a(Landroid/content/Context;Landroid/os/Bundle;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 61
    goto :goto_0

    .line 59
    :catch_0
    move-exception v2

    .line 60
    const-string v0, "OpenLoginBroadcastReceiver"

    const-string v1, "IllegalArgumentException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    :goto_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/hwid/api/common/n;->c:Z

    .line 64
    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 65
    return-void

    .line 67
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/huawei/hwid/api/common/n;->a(Landroid/content/Context;Landroid/content/Intent;)V

    .line 68
    return-void
.end method
