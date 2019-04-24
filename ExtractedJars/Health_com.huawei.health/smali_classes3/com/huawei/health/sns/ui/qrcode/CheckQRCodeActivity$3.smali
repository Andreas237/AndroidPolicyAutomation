.class Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/avv$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->f()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;)V
    .locals 0

    .line 620
    iput-object p1, p0, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity$3;->a:Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(IJJ)V
    .locals 6

    .line 624
    const/4 v0, 0x2

    new-array v4, v0, [J

    .line 625
    const/4 v0, 0x0

    aput-wide p2, v4, v0

    .line 626
    const/4 v0, 0x1

    aput-wide p4, v4, v0

    .line 628
    if-eqz p1, :cond_0

    .line 630
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity$3;->a:Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;

    invoke-static {v0, p1}, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->e(Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;I)V

    .line 631
    return-void

    .line 633
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity$3;->a:Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->a(Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 635
    invoke-static {}, Lo/ath;->a()Lo/ath;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity$3;->a:Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->e(Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2, p2, p3}, Lo/ath;->a(JJ)Lcom/huawei/health/sns/model/group/GroupMember;

    move-result-object v5

    .line 637
    if-eqz v5, :cond_1

    invoke-virtual {v5}, Lcom/huawei/health/sns/model/group/GroupMember;->getState()I

    move-result v0

    if-nez v0, :cond_1

    .line 639
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity$3;->a:Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->d(Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity$3;->a:Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->f(Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;)J

    move-result-wide v1

    const/16 v3, 0x79

    invoke-virtual {v0, v3, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 640
    return-void

    .line 643
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity$3;->a:Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->d(Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity$3;->a:Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->d(Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;)Landroid/os/Handler;

    move-result-object v1

    const/16 v2, 0x78

    invoke-virtual {v1, v2, v4}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity$3;->a:Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;

    invoke-static {v2}, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->f(Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;)J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 644
    return-void
.end method
