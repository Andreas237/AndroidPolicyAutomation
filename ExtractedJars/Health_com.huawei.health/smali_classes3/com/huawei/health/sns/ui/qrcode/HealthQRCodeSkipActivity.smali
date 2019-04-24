.class public Lcom/huawei/health/sns/ui/qrcode/HealthQRCodeSkipActivity;
.super Lcom/huawei/health/sns/ui/qrcode/TranslucentActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/qrcode/HealthQRCodeSkipActivity$b;
    }
.end annotation


# instance fields
.field c:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 13
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/qrcode/TranslucentActivity;-><init>()V

    .line 18
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthQRCodeSkipActivity;->c:Z

    return-void
.end method

.method private a()V
    .locals 5

    .line 43
    const-string v0, "Group_HealthQRCodeSkipActivit"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getIntentData start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 44
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/qrcode/HealthQRCodeSkipActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 45
    if-eqz v4, :cond_0

    .line 47
    const-string v0, "Group_HealthQRCodeSkipActivit"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getIntentData intent != null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 48
    const-string v0, "from_account"

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthQRCodeSkipActivity;->c:Z

    .line 50
    :cond_0
    return-void
.end method

.method private b()Lcom/huawei/qrcode/logic/IScanQrcodeListener;
    .locals 1

    .line 76
    new-instance v0, Lcom/huawei/health/sns/ui/qrcode/HealthQRCodeSkipActivity$b;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/qrcode/HealthQRCodeSkipActivity$b;-><init>(Lcom/huawei/health/sns/ui/qrcode/HealthQRCodeSkipActivity;)V

    return-object v0
.end method

.method private e()V
    .locals 6

    .line 57
    const-string v0, "Group_HealthQRCodeSkipActivit"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startQrCode start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 58
    invoke-static {}, Lcom/huawei/qrcode/logic/ScanQrcodeManger;->getInstance()Lcom/huawei/qrcode/logic/ScanQrcodeManger;

    move-result-object v0

    move-object v1, p0

    const-string v2, ""

    const-string v4, ""

    invoke-direct {p0}, Lcom/huawei/health/sns/ui/qrcode/HealthQRCodeSkipActivity;->b()Lcom/huawei/qrcode/logic/IScanQrcodeListener;

    move-result-object v5

    const/4 v3, 0x1

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/qrcode/logic/ScanQrcodeManger;->startScanQrcode(Landroid/content/Context;Ljava/lang/String;ZLjava/lang/String;Lcom/huawei/qrcode/logic/IScanQrcodeListener;)V

    .line 59
    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 23
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/qrcode/TranslucentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 24
    const-string v0, "Group_HealthQRCodeSkipActivit"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "QRCodeSkipActivity call QRCode."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 25
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/qrcode/HealthQRCodeSkipActivity;->a()V

    .line 26
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/qrcode/HealthQRCodeSkipActivity;->e()V

    .line 27
    return-void
.end method

.method protected onNewIntent(Landroid/content/Intent;)V
    .locals 4

    .line 32
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/qrcode/TranslucentActivity;->onNewIntent(Landroid/content/Intent;)V

    .line 33
    const-string v0, "Group_HealthQRCodeSkipActivit"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "QRCodeSkipActivity onNewIntent"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 34
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/qrcode/HealthQRCodeSkipActivity;->a()V

    .line 35
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/qrcode/HealthQRCodeSkipActivity;->e()V

    .line 36
    return-void
.end method

.method protected onStop()V
    .locals 4

    .line 64
    invoke-super {p0}, Lcom/huawei/health/sns/ui/qrcode/TranslucentActivity;->onStop()V

    .line 65
    const-string v0, "Group_HealthQRCodeSkipActivit"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startQrCode onStop"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 67
    return-void
.end method
