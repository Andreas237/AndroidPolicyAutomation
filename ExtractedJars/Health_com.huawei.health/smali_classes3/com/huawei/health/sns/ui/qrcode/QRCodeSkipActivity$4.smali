.class Lcom/huawei/health/sns/ui/qrcode/QRCodeSkipActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/qrcode/logic/IScanQrcodeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/qrcode/QRCodeSkipActivity;->c()Lcom/huawei/qrcode/logic/IScanQrcodeListener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/health/sns/ui/qrcode/QRCodeSkipActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/qrcode/QRCodeSkipActivity;)V
    .locals 0

    .line 72
    iput-object p1, p0, Lcom/huawei/health/sns/ui/qrcode/QRCodeSkipActivity$4;->e:Lcom/huawei/health/sns/ui/qrcode/QRCodeSkipActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnalyzeSuccessCallBack(Landroid/content/Intent;)V
    .locals 2

    .line 110
    const-string v0, ""

    const-string v1, "onAnalyzeSuccessCallBack()"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/QRCodeSkipActivity$4;->e:Lcom/huawei/health/sns/ui/qrcode/QRCodeSkipActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/qrcode/QRCodeSkipActivity;->finish()V

    .line 112
    return-void
.end method

.method public onScanFailCallBack(ILjava/lang/String;Ljava/lang/String;)V
    .locals 5

    .line 76
    const-string v0, ""

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onScanFailCallBack() type:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",content isEmpty:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    const/16 v0, 0xfa6

    if-ne p1, v0, :cond_0

    .line 79
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/QRCodeSkipActivity$4;->e:Lcom/huawei/health/sns/ui/qrcode/QRCodeSkipActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/qrcode/QRCodeSkipActivity;->finish()V

    .line 81
    return-void

    .line 83
    :cond_0
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 84
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/QRCodeSkipActivity$4;->e:Lcom/huawei/health/sns/ui/qrcode/QRCodeSkipActivity;

    const-class v1, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 85
    const/high16 v0, 0x10000000

    invoke-virtual {v3, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 86
    const-string v0, "errType"

    invoke-virtual {v3, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 87
    const-string v0, "QRCode_errContent"

    invoke-virtual {v3, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 88
    const-string v0, "from_account"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/qrcode/QRCodeSkipActivity$4;->e:Lcom/huawei/health/sns/ui/qrcode/QRCodeSkipActivity;

    iget-boolean v1, v1, Lcom/huawei/health/sns/ui/qrcode/QRCodeSkipActivity;->a:Z

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 91
    :try_start_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/QRCodeSkipActivity$4;->e:Lcom/huawei/health/sns/ui/qrcode/QRCodeSkipActivity;

    invoke-virtual {v0, v3}, Lcom/huawei/health/sns/ui/qrcode/QRCodeSkipActivity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 96
    goto :goto_0

    .line 93
    :catch_0
    move-exception v4

    .line 95
    const-string v0, ""

    const-string v1, "onScanFailCallBack() start Activity meet exception."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/QRCodeSkipActivity$4;->e:Lcom/huawei/health/sns/ui/qrcode/QRCodeSkipActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/qrcode/QRCodeSkipActivity;->finish()V

    .line 98
    return-void
.end method

.method public onScanSuccessCallBack(Ljava/lang/String;)V
    .locals 2

    .line 103
    const-string v0, ""

    const-string v1, "onScanSuccessCallBack()"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/QRCodeSkipActivity$4;->e:Lcom/huawei/health/sns/ui/qrcode/QRCodeSkipActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/qrcode/QRCodeSkipActivity;->finish()V

    .line 105
    return-void
.end method
