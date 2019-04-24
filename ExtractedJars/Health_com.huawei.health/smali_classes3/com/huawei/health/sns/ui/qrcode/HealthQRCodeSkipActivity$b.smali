.class Lcom/huawei/health/sns/ui/qrcode/HealthQRCodeSkipActivity$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/qrcode/logic/IScanQrcodeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/qrcode/HealthQRCodeSkipActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field private d:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/sns/ui/qrcode/HealthQRCodeSkipActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/qrcode/HealthQRCodeSkipActivity;)V
    .locals 1

    .line 82
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 83
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthQRCodeSkipActivity$b;->d:Ljava/lang/ref/WeakReference;

    .line 84
    return-void
.end method


# virtual methods
.method public onAnalyzeSuccessCallBack(Landroid/content/Intent;)V
    .locals 5

    .line 137
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthQRCodeSkipActivity$b;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/sns/ui/qrcode/HealthQRCodeSkipActivity;

    .line 138
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 139
    return-void

    .line 142
    :cond_0
    const-string v0, "Group_HealthQRCodeSkipActivit"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onAnalyzeSuccessCallBack()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 143
    invoke-virtual {v4}, Lcom/huawei/health/sns/ui/qrcode/HealthQRCodeSkipActivity;->finish()V

    .line 144
    return-void
.end method

.method public onScanFailCallBack(ILjava/lang/String;Ljava/lang/String;)V
    .locals 7

    .line 89
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthQRCodeSkipActivity$b;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/sns/ui/qrcode/HealthQRCodeSkipActivity;

    .line 90
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 91
    const-string v0, "Group_HealthQRCodeSkipActivit"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "activity == null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 92
    return-void

    .line 95
    :cond_0
    const-string v0, "Group_HealthQRCodeSkipActivit"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onScanFailCallBack() type:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",content isEmpty:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 96
    const/16 v0, 0xfa6

    if-ne p1, v0, :cond_1

    .line 98
    const-string v0, "Group_HealthQRCodeSkipActivit"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "QrcodeConstant.CANCEL_SCAN_QRCODE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 99
    invoke-virtual {v4}, Lcom/huawei/health/sns/ui/qrcode/HealthQRCodeSkipActivity;->finish()V

    .line 101
    return-void

    .line 103
    :cond_1
    const-string v0, "Group_HealthQRCodeSkipActivit"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Not QrcodeConstant.CANCEL_SCAN_QRCODE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 104
    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    .line 105
    const-class v0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;

    invoke-virtual {v5, v4, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 106
    const/high16 v0, 0x10000000

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 107
    const-string v0, "errType"

    invoke-virtual {v5, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 108
    const-string v0, "QRCode_errContent"

    invoke-virtual {v5, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 109
    const-string v0, "from_account"

    iget-boolean v1, v4, Lcom/huawei/health/sns/ui/qrcode/HealthQRCodeSkipActivity;->c:Z

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 112
    :try_start_0
    invoke-virtual {v4, v5}, Lcom/huawei/health/sns/ui/qrcode/HealthQRCodeSkipActivity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 117
    goto :goto_0

    .line 114
    :catch_0
    move-exception v6

    .line 116
    const-string v0, "Group_HealthQRCodeSkipActivit"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onScanFailCallBack() start Activity meet exception."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 118
    :goto_0
    invoke-virtual {v4}, Lcom/huawei/health/sns/ui/qrcode/HealthQRCodeSkipActivity;->finish()V

    .line 119
    return-void
.end method

.method public onScanSuccessCallBack(Ljava/lang/String;)V
    .locals 5

    .line 124
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthQRCodeSkipActivity$b;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/sns/ui/qrcode/HealthQRCodeSkipActivity;

    .line 125
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 126
    const-string v0, "Group_HealthQRCodeSkipActivit"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "activity == null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 127
    return-void

    .line 130
    :cond_0
    const-string v0, "Group_HealthQRCodeSkipActivit"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onScanSuccessCallBack()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 131
    invoke-virtual {v4}, Lcom/huawei/health/sns/ui/qrcode/HealthQRCodeSkipActivity;->finish()V

    .line 132
    return-void
.end method
