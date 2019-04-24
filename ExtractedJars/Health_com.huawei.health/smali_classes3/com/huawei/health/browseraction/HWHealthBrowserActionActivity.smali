.class public Lcom/huawei/health/browseraction/HWHealthBrowserActionActivity;
.super Landroid/app/Activity;
.source "SourceFile"


# instance fields
.field private b:Landroid/net/Uri;

.field private c:Landroid/content/Context;

.field private e:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 17
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 23
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/browseraction/HWHealthBrowserActionActivity;->b:Landroid/net/Uri;

    .line 24
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/browseraction/HWHealthBrowserActionActivity;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 10

    .line 28
    const-string v0, "HWHealthBrowserActionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 29
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 31
    invoke-virtual {p0}, Lcom/huawei/health/browseraction/HWHealthBrowserActionActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 32
    if-nez v4, :cond_0

    .line 33
    const-string v0, "HWHealthBrowserActionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleCommand(Intent intent) intent == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 34
    return-void

    .line 36
    :cond_0
    invoke-virtual {v4}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/browseraction/HWHealthBrowserActionActivity;->b:Landroid/net/Uri;

    .line 37
    iget-object v0, p0, Lcom/huawei/health/browseraction/HWHealthBrowserActionActivity;->b:Landroid/net/Uri;

    if-nez v0, :cond_1

    .line 38
    const-string v0, "HWHealthBrowserActionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleCommand(Intent intent) schemeData == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 39
    return-void

    .line 42
    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/huawei/health/browseraction/HWHealthBrowserActionActivity;->b:Landroid/net/Uri;

    const-string v1, "address"

    invoke-virtual {v0, v1}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/browseraction/HWHealthBrowserActionActivity;->e:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 51
    goto :goto_0

    .line 43
    :catch_0
    move-exception v5

    .line 44
    const-string v0, "HWHealthBrowserActionActivity"

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

    .line 45
    invoke-virtual {p0}, Lcom/huawei/health/browseraction/HWHealthBrowserActionActivity;->finish()V

    .line 46
    return-void

    .line 47
    :catch_1
    move-exception v5

    .line 48
    const-string v0, "HWHealthBrowserActionActivity"

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

    .line 49
    invoke-virtual {p0}, Lcom/huawei/health/browseraction/HWHealthBrowserActionActivity;->finish()V

    .line 50
    return-void

    .line 52
    :goto_0
    const-string v0, "HWHealthBrowserActionActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "schemeData queryParameter = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/health/browseraction/HWHealthBrowserActionActivity;->e:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 58
    iget-object v0, p0, Lcom/huawei/health/browseraction/HWHealthBrowserActionActivity;->e:Ljava/lang/String;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 59
    const-string v0, "HWHealthBrowserActionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "The schemeData queryParameter is unsafe! "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 60
    invoke-virtual {p0}, Lcom/huawei/health/browseraction/HWHealthBrowserActionActivity;->finish()V

    .line 61
    return-void

    .line 64
    :cond_2
    iput-object p0, p0, Lcom/huawei/health/browseraction/HWHealthBrowserActionActivity;->c:Landroid/content/Context;

    .line 66
    iget-object v0, p0, Lcom/huawei/health/browseraction/HWHealthBrowserActionActivity;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/operation/operation/PluginOperation;->getInstance(Landroid/content/Context;)Lcom/huawei/operation/operation/PluginOperation;

    move-result-object v5

    .line 67
    invoke-virtual {v5}, Lcom/huawei/operation/operation/PluginOperation;->getAdapter()Lo/eab;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/operation/adapter/PluginOperationAdapter;

    .line 69
    iget-object v0, p0, Lcom/huawei/health/browseraction/HWHealthBrowserActionActivity;->c:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_user_agree"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 70
    const-string v0, "HWHealthBrowserActionActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "agree="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v7, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 71
    const-string v0, "HWHealthBrowserActionActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "adapter="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 74
    iget-object v0, p0, Lcom/huawei/health/browseraction/HWHealthBrowserActionActivity;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v8

    .line 76
    const-string v0, "1"

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {v8}, Lcom/huawei/login/ui/login/LoginInit;->getIsLogined()Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v0, 0x0

    if-ne v0, v6, :cond_4

    .line 77
    :cond_3
    invoke-virtual {p0}, Lcom/huawei/health/browseraction/HWHealthBrowserActionActivity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/health/browseraction/HWHealthBrowserActionActivity;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v9

    .line 79
    const-string v0, "schemeUrl"

    iget-object v1, p0, Lcom/huawei/health/browseraction/HWHealthBrowserActionActivity;->e:Ljava/lang/String;

    invoke-virtual {v9, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 81
    invoke-virtual {p0, v9}, Lcom/huawei/health/browseraction/HWHealthBrowserActionActivity;->startActivity(Landroid/content/Intent;)V

    .line 82
    goto :goto_1

    .line 83
    :cond_4
    const-string v0, "HWHealthBrowserActionActivity"

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

    .line 84
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 85
    invoke-virtual {p0}, Lcom/huawei/health/browseraction/HWHealthBrowserActionActivity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/health/browseraction/HWHealthBrowserActionActivity;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v9

    .line 86
    invoke-virtual {p0, v9}, Lcom/huawei/health/browseraction/HWHealthBrowserActionActivity;->startActivity(Landroid/content/Intent;)V

    .line 87
    goto :goto_1

    .line 88
    :cond_5
    const-string v0, "HWHealthBrowserActionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "jump to webviewactivity via browser"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 89
    iget-object v0, p0, Lcom/huawei/health/browseraction/HWHealthBrowserActionActivity;->e:Ljava/lang/String;

    invoke-virtual {v5, v0}, Lcom/huawei/operation/operation/PluginOperation;->startOperationWebPage(Ljava/lang/String;)V

    .line 93
    :goto_1
    invoke-virtual {p0}, Lcom/huawei/health/browseraction/HWHealthBrowserActionActivity;->finish()V

    .line 95
    return-void
.end method

.method public onDestroy()V
    .locals 0

    .line 99
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 100
    return-void
.end method
