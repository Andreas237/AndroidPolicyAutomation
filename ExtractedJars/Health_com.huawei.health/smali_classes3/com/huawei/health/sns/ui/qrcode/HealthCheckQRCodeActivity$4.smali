.class Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->b(J)V
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
.field final synthetic a:J

.field final synthetic e:Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;J)V
    .locals 0

    .line 471
    iput-object p1, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity$4;->e:Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;

    iput-wide p2, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity$4;->a:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 471
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity$4;->b(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public b(Lo/bra;)Ljava/lang/Boolean;
    .locals 8

    .line 474
    const-string v0, "Group_HealthCheckQRCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkGroup in run start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 475
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->a()J

    move-result-wide v4

    .line 476
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity$4;->a:J

    invoke-virtual {v0, v1, v2}, Lo/atc;->d(J)Z

    move-result v6

    .line 477
    invoke-static {}, Lo/ath;->a()Lo/ath;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity$4;->a:J

    invoke-virtual {v0, v1, v2, v4, v5}, Lo/ath;->e(JJ)Z

    move-result v7

    .line 480
    if-eqz v6, :cond_0

    if-eqz v7, :cond_0

    .line 481
    const-string v0, "Group_HealthCheckQRCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkGroup in run isGroupStateNormal && isGroupMember"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 482
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity$4;->e:Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->a(Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity$4;->e:Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->a(Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;)Landroid/os/Handler;

    move-result-object v1

    iget-wide v2, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity$4;->a:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/16 v3, 0x90

    invoke-virtual {v1, v3, v2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto :goto_0

    .line 484
    :cond_0
    const-string v0, "Group_HealthCheckQRCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkGroup in run else"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 485
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity$4;->e:Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->a(Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity$4;->e:Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->a(Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;)Landroid/os/Handler;

    move-result-object v1

    iget-wide v2, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity$4;->a:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/16 v3, 0x82

    invoke-virtual {v1, v3, v2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 487
    :goto_0
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
