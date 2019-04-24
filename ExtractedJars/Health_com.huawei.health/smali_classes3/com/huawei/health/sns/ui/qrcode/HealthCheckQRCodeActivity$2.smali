.class Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/avv$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;)V
    .locals 0

    .line 673
    iput-object p1, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity$2;->e:Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(IJJ)V
    .locals 5

    .line 676
    const-string v0, "Group_HealthCheckQRCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestCode onQRCodeResult in"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 677
    const/4 v0, 0x2

    new-array v4, v0, [J

    .line 678
    const/4 v0, 0x0

    aput-wide p2, v4, v0

    .line 679
    const/4 v0, 0x1

    aput-wide p4, v4, v0

    .line 681
    if-eqz p1, :cond_0

    .line 682
    const-string v0, "Group_HealthCheckQRCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestCode onQRCodeResult retCode != SNSHttpCode.OK"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 683
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity$2;->e:Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;

    invoke-static {v0, p1}, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->b(Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;I)V

    .line 684
    return-void

    .line 686
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity$2;->e:Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->b(Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 687
    const-string v0, "Group_HealthCheckQRCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestCode onQRCodeResult isInvite"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 694
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity$2;->e:Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity$2;->e:Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->g(Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/biv;->d(Ljava/lang/String;)Z

    move-result v1

    iget-object v2, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity$2;->e:Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;

    invoke-static {v2}, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->g(Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->b(Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;ZLjava/lang/String;)V

    .line 696
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity$2;->e:Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->a(Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity$2;->e:Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->a(Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;)Landroid/os/Handler;

    move-result-object v1

    const/16 v2, 0x78

    invoke-virtual {v1, v2, v4}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity$2;->e:Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;

    invoke-static {v2}, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->f(Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;)J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 697
    return-void
.end method
