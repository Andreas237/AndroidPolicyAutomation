.class public Lcom/huawei/health/sns/ui/qrcode/QRCodeProxyActivity;
.super Lcom/huawei/health/sns/ui/qrcode/TranslucentActivity;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/qrcode/TranslucentActivity;-><init>()V

    return-void
.end method

.method private d()Z
    .locals 2

    .line 56
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    .line 58
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/qrcode/QRCodeProxyActivity;->isInMultiWindowMode()Z

    move-result v0

    return v0

    .line 60
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private e()V
    .locals 5

    .line 37
    const/4 v2, 0x1

    .line 38
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/qrcode/QRCodeProxyActivity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    .line 39
    if-eqz v3, :cond_0

    .line 41
    const-string v0, "from_account"

    const/4 v1, 0x1

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v2

    .line 44
    :cond_0
    new-instance v4, Landroid/content/Intent;

    const-class v0, Lcom/huawei/health/sns/ui/qrcode/QRCodeSkipActivity;

    invoke-direct {v4, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 45
    const-string v0, "com.huawei.hwid"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 46
    const-string v0, "from_account"

    invoke-virtual {v4, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 47
    invoke-virtual {p0, v4}, Lcom/huawei/health/sns/ui/qrcode/QRCodeProxyActivity;->startActivity(Landroid/content/Intent;)V

    .line 48
    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 22
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/qrcode/TranslucentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 23
    const-string v0, "QRCodeProxyActivity"

    const-string v1, "QRCodeProxyActivity call QRCode."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/qrcode/QRCodeProxyActivity;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 26
    sget v0, Lcom/huawei/android/sns/R$string;->sns_no_support_split_tip:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/qrcode/QRCodeProxyActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lo/brh;->e(Landroid/app/Activity;Ljava/lang/String;)V

    goto :goto_0

    .line 30
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/qrcode/QRCodeProxyActivity;->e()V

    .line 32
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/qrcode/QRCodeProxyActivity;->finish()V

    .line 33
    return-void
.end method
