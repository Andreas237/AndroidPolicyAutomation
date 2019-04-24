.class public Lcom/huawei/health/browseraction/HWSchemeGroupActivity;
.super Landroid/app/Activity;
.source "SourceFile"


# instance fields
.field private a:Landroid/content/Context;

.field private b:Landroid/net/Uri;

.field private c:Ljava/lang/String;

.field private e:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 22
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 29
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/browseraction/HWSchemeGroupActivity;->b:Landroid/net/Uri;

    .line 30
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/browseraction/HWSchemeGroupActivity;->c:Ljava/lang/String;

    .line 31
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/browseraction/HWSchemeGroupActivity;->e:Ljava/lang/String;

    return-void
.end method

.method private b(ZZ)V
    .locals 3

    .line 107
    if-eqz p1, :cond_0

    .line 108
    invoke-virtual {p0}, Lcom/huawei/health/browseraction/HWSchemeGroupActivity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/health/browseraction/HWSchemeGroupActivity;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v2

    .line 109
    const-string v0, "schemeUrl"

    iget-object v1, p0, Lcom/huawei/health/browseraction/HWSchemeGroupActivity;->c:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 110
    invoke-virtual {p0, v2}, Lcom/huawei/health/browseraction/HWSchemeGroupActivity;->startActivity(Landroid/content/Intent;)V

    .line 111
    goto :goto_0

    :cond_0
    if-eqz p2, :cond_1

    .line 113
    invoke-virtual {p0}, Lcom/huawei/health/browseraction/HWSchemeGroupActivity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/health/browseraction/HWSchemeGroupActivity;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v2

    .line 114
    const-string v0, "healthgroup"

    iget-object v1, p0, Lcom/huawei/health/browseraction/HWSchemeGroupActivity;->e:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 115
    invoke-virtual {p0, v2}, Lcom/huawei/health/browseraction/HWSchemeGroupActivity;->startActivity(Landroid/content/Intent;)V

    .line 117
    :cond_1
    :goto_0
    return-void
.end method

.method private b()Z
    .locals 6

    .line 124
    const/4 v4, 0x1

    .line 125
    iget-object v0, p0, Lcom/huawei/health/browseraction/HWSchemeGroupActivity;->b:Landroid/net/Uri;

    if-nez v0, :cond_0

    .line 126
    const-string v0, "HWSchemeGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleCommand(Intent intent) schemeData == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 127
    const/4 v0, 0x0

    return v0

    .line 130
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/huawei/health/browseraction/HWSchemeGroupActivity;->b:Landroid/net/Uri;

    const-string v1, "address"

    invoke-virtual {v0, v1}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/browseraction/HWSchemeGroupActivity;->c:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 137
    goto :goto_0

    .line 131
    :catch_0
    move-exception v5

    .line 132
    const-string v0, "HWSchemeGroupActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate queryParameter IllegalArgumentException:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 133
    const/4 v4, 0x0

    .line 137
    goto :goto_0

    .line 134
    :catch_1
    move-exception v5

    .line 135
    const-string v0, "HWSchemeGroupActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate queryParameter Exception:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 136
    const/4 v4, 0x0

    .line 138
    :goto_0
    const-string v0, "HWSchemeGroupActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "schemeData queryParameter = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/health/browseraction/HWSchemeGroupActivity;->c:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 144
    iget-object v0, p0, Lcom/huawei/health/browseraction/HWSchemeGroupActivity;->c:Ljava/lang/String;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 145
    const-string v0, "HWSchemeGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "The schemeData queryParameter is unsafe! "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 146
    const/4 v4, 0x0

    .line 148
    :cond_1
    return v4
.end method

.method private e(ZZLcom/huawei/operation/operation/PluginOperation;)V
    .locals 5

    .line 85
    if-eqz p1, :cond_0

    .line 86
    const-string v0, "HWSchemeGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "jump to webviewactivity via browser"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 87
    iget-object v0, p0, Lcom/huawei/health/browseraction/HWSchemeGroupActivity;->c:Ljava/lang/String;

    invoke-virtual {p3, v0}, Lcom/huawei/operation/operation/PluginOperation;->startOperationWebPage(Ljava/lang/String;)V

    goto :goto_0

    .line 88
    :cond_0
    if-eqz p2, :cond_1

    .line 90
    const-string v0, "HWSchemeGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "jump to group"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 91
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 92
    const-class v0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;

    invoke-virtual {v4, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 93
    const/high16 v0, 0x10000000

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 94
    const-string v0, "QRCode_errContent"

    iget-object v1, p0, Lcom/huawei/health/browseraction/HWSchemeGroupActivity;->e:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 95
    const-string v0, "from_account"

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 96
    const-string v0, "is_form_scheme"

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 97
    invoke-virtual {p0, v4}, Lcom/huawei/health/browseraction/HWSchemeGroupActivity;->startActivity(Landroid/content/Intent;)V

    .line 99
    :cond_1
    :goto_0
    return-void
.end method

.method private e()Z
    .locals 6

    .line 156
    const/4 v4, 0x1

    .line 157
    iget-object v0, p0, Lcom/huawei/health/browseraction/HWSchemeGroupActivity;->b:Landroid/net/Uri;

    if-nez v0, :cond_0

    .line 158
    const-string v0, "HWSchemeGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleCommand(Intent intent) schemeData == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 159
    const/4 v0, 0x0

    return v0

    .line 162
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/huawei/health/browseraction/HWSchemeGroupActivity;->b:Landroid/net/Uri;

    const-string v1, "healthgroup"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/net/Uri;->getBooleanQueryParameter(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 163
    iget-object v0, p0, Lcom/huawei/health/browseraction/HWSchemeGroupActivity;->b:Landroid/net/Uri;

    const-string v1, "healthgroup"

    invoke-virtual {v0, v1}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/browseraction/HWSchemeGroupActivity;->e:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    .line 165
    :cond_1
    const/4 v4, 0x0

    .line 173
    :goto_0
    goto :goto_1

    .line 167
    :catch_0
    move-exception v5

    .line 168
    const-string v0, "HWSchemeGroupActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate groupParameter IllegalArgumentException:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 169
    const/4 v4, 0x0

    .line 173
    goto :goto_1

    .line 170
    :catch_1
    move-exception v5

    .line 171
    const-string v0, "HWSchemeGroupActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate groupParameter Exception:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 172
    const/4 v4, 0x0

    .line 174
    :goto_1
    const-string v0, "HWSchemeGroupActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "schemeData groupParameter = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/health/browseraction/HWSchemeGroupActivity;->e:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 177
    iget-object v0, p0, Lcom/huawei/health/browseraction/HWSchemeGroupActivity;->e:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 178
    const-string v0, "HWSchemeGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "The schemeData groupParameter is unsafe! "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 179
    const/4 v4, 0x0

    .line 181
    :cond_2
    return v4
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 12

    .line 35
    const-string v0, "HWSchemeGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 36
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 38
    invoke-virtual {p0}, Lcom/huawei/health/browseraction/HWSchemeGroupActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 39
    if-nez v4, :cond_0

    .line 40
    const-string v0, "HWSchemeGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleCommand(Intent intent) intent == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 41
    return-void

    .line 43
    :cond_0
    invoke-virtual {v4}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/browseraction/HWSchemeGroupActivity;->b:Landroid/net/Uri;

    .line 44
    invoke-direct {p0}, Lcom/huawei/health/browseraction/HWSchemeGroupActivity;->b()Z

    move-result v5

    .line 45
    invoke-direct {p0}, Lcom/huawei/health/browseraction/HWSchemeGroupActivity;->e()Z

    move-result v6

    .line 46
    if-nez v5, :cond_1

    if-nez v6, :cond_1

    .line 47
    invoke-virtual {p0}, Lcom/huawei/health/browseraction/HWSchemeGroupActivity;->finish()V

    .line 48
    return-void

    .line 51
    :cond_1
    iput-object p0, p0, Lcom/huawei/health/browseraction/HWSchemeGroupActivity;->a:Landroid/content/Context;

    .line 53
    iget-object v0, p0, Lcom/huawei/health/browseraction/HWSchemeGroupActivity;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/operation/operation/PluginOperation;->getInstance(Landroid/content/Context;)Lcom/huawei/operation/operation/PluginOperation;

    move-result-object v7

    .line 54
    invoke-virtual {v7}, Lcom/huawei/operation/operation/PluginOperation;->getAdapter()Lo/eab;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/operation/adapter/PluginOperationAdapter;

    .line 56
    iget-object v0, p0, Lcom/huawei/health/browseraction/HWSchemeGroupActivity;->a:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_user_agree"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 57
    const-string v0, "HWSchemeGroupActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "agree="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v9, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 58
    const-string v0, "HWSchemeGroupActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "adapter="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v8, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 61
    iget-object v0, p0, Lcom/huawei/health/browseraction/HWSchemeGroupActivity;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v10

    .line 63
    const-string v0, "1"

    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v10}, Lcom/huawei/login/ui/login/LoginInit;->getIsLogined()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    if-ne v0, v8, :cond_3

    .line 64
    :cond_2
    invoke-direct {p0, v5, v6}, Lcom/huawei/health/browseraction/HWSchemeGroupActivity;->b(ZZ)V

    goto :goto_0

    .line 66
    :cond_3
    const-string v0, "HWSchemeGroupActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isOversea()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Lo/czu;->e()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 67
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 68
    invoke-virtual {p0}, Lcom/huawei/health/browseraction/HWSchemeGroupActivity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/health/browseraction/HWSchemeGroupActivity;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v11

    .line 69
    invoke-virtual {p0, v11}, Lcom/huawei/health/browseraction/HWSchemeGroupActivity;->startActivity(Landroid/content/Intent;)V

    .line 70
    goto :goto_0

    .line 71
    :cond_4
    invoke-direct {p0, v5, v6, v7}, Lcom/huawei/health/browseraction/HWSchemeGroupActivity;->e(ZZLcom/huawei/operation/operation/PluginOperation;)V

    .line 74
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/health/browseraction/HWSchemeGroupActivity;->finish()V

    .line 76
    return-void
.end method

.method public onDestroy()V
    .locals 0

    .line 186
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 187
    return-void
.end method
