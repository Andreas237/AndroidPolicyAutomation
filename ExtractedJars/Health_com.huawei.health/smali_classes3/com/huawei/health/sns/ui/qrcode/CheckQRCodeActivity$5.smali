.class Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->e(J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;

.field final synthetic e:J


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;J)V
    .locals 0

    .line 420
    iput-object p1, p0, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity$5;->c:Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;

    iput-wide p2, p0, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity$5;->e:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 420
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity$5;->d(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public d(Lo/bra;)Ljava/lang/Boolean;
    .locals 8

    .line 424
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->a()J

    move-result-wide v4

    .line 425
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity$5;->e:J

    invoke-virtual {v0, v1, v2}, Lo/atc;->d(J)Z

    move-result v6

    .line 426
    invoke-static {}, Lo/ath;->a()Lo/ath;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity$5;->e:J

    invoke-virtual {v0, v1, v2, v4, v5}, Lo/ath;->e(JJ)Z

    move-result v7

    .line 429
    if-eqz v6, :cond_0

    if-eqz v7, :cond_0

    .line 431
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity$5;->c:Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->d(Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity$5;->c:Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->d(Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;)Landroid/os/Handler;

    move-result-object v1

    iget-wide v2, p0, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity$5;->e:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/16 v3, 0x81

    invoke-virtual {v1, v3, v2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto :goto_0

    .line 435
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity$5;->c:Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->d(Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity$5;->c:Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->d(Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;)Landroid/os/Handler;

    move-result-object v1

    iget-wide v2, p0, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity$5;->e:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/16 v3, 0x82

    invoke-virtual {v1, v3, v2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 437
    :goto_0
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
