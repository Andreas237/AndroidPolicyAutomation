.class public Lcom/huawei/health/sns/ui/qrcode/QRCodeSkipActivity;
.super Lcom/huawei/health/sns/ui/qrcode/TranslucentActivity;
.source "SourceFile"


# instance fields
.field a:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 18
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/qrcode/TranslucentActivity;-><init>()V

    .line 24
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/qrcode/QRCodeSkipActivity;->a:Z

    return-void
.end method

.method private a()V
    .locals 6

    .line 61
    invoke-static {}, Lcom/huawei/qrcode/logic/ScanQrcodeManger;->getInstance()Lcom/huawei/qrcode/logic/ScanQrcodeManger;

    move-result-object v0

    move-object v1, p0

    const-string v2, ""

    const-string v4, ""

    invoke-direct {p0}, Lcom/huawei/health/sns/ui/qrcode/QRCodeSkipActivity;->c()Lcom/huawei/qrcode/logic/IScanQrcodeListener;

    move-result-object v5

    const/4 v3, 0x1

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/qrcode/logic/ScanQrcodeManger;->startScanQrcode(Landroid/content/Context;Ljava/lang/String;ZLjava/lang/String;Lcom/huawei/qrcode/logic/IScanQrcodeListener;)V

    .line 62
    return-void
.end method

.method private b()V
    .locals 3

    .line 49
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/qrcode/QRCodeSkipActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    .line 50
    if-eqz v2, :cond_0

    .line 52
    const-string v0, "from_account"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/qrcode/QRCodeSkipActivity;->a:Z

    .line 54
    :cond_0
    return-void
.end method

.method private c()Lcom/huawei/qrcode/logic/IScanQrcodeListener;
    .locals 1

    .line 71
    new-instance v0, Lcom/huawei/health/sns/ui/qrcode/QRCodeSkipActivity$4;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/qrcode/QRCodeSkipActivity$4;-><init>(Lcom/huawei/health/sns/ui/qrcode/QRCodeSkipActivity;)V

    return-object v0
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 29
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/qrcode/TranslucentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 30
    const-string v0, "QRCodeSkipActivity onCreate"

    const-string v1, "QRCodeSkipActivity call QRCode."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/qrcode/QRCodeSkipActivity;->b()V

    .line 32
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/qrcode/QRCodeSkipActivity;->a()V

    .line 33
    return-void
.end method

.method protected onNewIntent(Landroid/content/Intent;)V
    .locals 2

    .line 38
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/qrcode/TranslucentActivity;->onNewIntent(Landroid/content/Intent;)V

    .line 39
    const-string v0, "QRCodeSkipActivity onNewIntent"

    const-string v1, "QRCodeSkipActivity call QRCode."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/qrcode/QRCodeSkipActivity;->b()V

    .line 41
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/qrcode/QRCodeSkipActivity;->a()V

    .line 42
    return-void
.end method
