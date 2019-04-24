.class public Lcom/huawei/health/sns/ui/qrcode/HealthQRCodeProxyActivity;
.super Lcom/huawei/health/sns/ui/qrcode/TranslucentActivity;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/qrcode/TranslucentActivity;-><init>()V

    return-void
.end method

.method private b()Z
    .locals 2

    .line 47
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    .line 48
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/qrcode/HealthQRCodeProxyActivity;->isInMultiWindowMode()Z

    move-result v0

    return v0

    .line 50
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private c()V
    .locals 7

    .line 27
    const-string v0, "Group_HealthQRCodeProxyActivi"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startQrCode start "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 28
    const/4 v4, 0x1

    .line 29
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/qrcode/HealthQRCodeProxyActivity;->getIntent()Landroid/content/Intent;

    move-result-object v5

    .line 30
    if-eqz v5, :cond_0

    .line 31
    const-string v0, "Group_HealthQRCodeProxyActivi"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startQrCode intent != null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 32
    const-string v0, "from_account"

    const/4 v1, 0x1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v4

    .line 35
    :cond_0
    new-instance v6, Landroid/content/Intent;

    const-class v0, Lcom/huawei/health/sns/ui/qrcode/HealthQRCodeSkipActivity;

    invoke-direct {v6, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 36
    const-string v0, "com.huawei.hwid"

    invoke-virtual {v6, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 37
    const-string v0, "from_account"

    invoke-virtual {v6, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 38
    invoke-virtual {p0, v6}, Lcom/huawei/health/sns/ui/qrcode/HealthQRCodeProxyActivity;->startActivity(Landroid/content/Intent;)V

    .line 39
    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 14
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/qrcode/TranslucentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 15
    const-string v0, "Group_HealthQRCodeProxyActivi"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthQRCodeProxyActivity call QRCode."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 16
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/qrcode/HealthQRCodeProxyActivity;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 17
    const-string v0, "Group_HealthQRCodeProxyActivi"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthQRCodeProxyActivity call QRCode. isMultiWindowMode "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 18
    sget v0, Lcom/huawei/android/sns/R$string;->sns_no_support_split_tip:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/qrcode/HealthQRCodeProxyActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lo/brh;->e(Landroid/app/Activity;Ljava/lang/String;)V

    goto :goto_0

    .line 20
    :cond_0
    const-string v0, "Group_HealthQRCodeProxyActivi"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthQRCodeProxyActivity call QRCode. in else startQrCode "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 21
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/qrcode/HealthQRCodeProxyActivity;->c()V

    .line 23
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/qrcode/HealthQRCodeProxyActivity;->finish()V

    .line 24
    return-void
.end method
