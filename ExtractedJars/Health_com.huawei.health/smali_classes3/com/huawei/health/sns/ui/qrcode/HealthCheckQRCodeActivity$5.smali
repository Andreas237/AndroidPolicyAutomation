.class Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->b(Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;

.field final synthetic d:Landroid/content/Intent;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;Landroid/content/Intent;)V
    .locals 0

    .line 379
    iput-object p1, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity$5;->b:Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;

    iput-object p2, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity$5;->d:Landroid/content/Intent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 382
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity$5;->b:Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->e(Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "NEWSOCIALFRAGMENT_IS_SHOW_HEALTH_GROUP_KEY"

    const-string v3, "NEWSOCIALFRAGMENT_SHOW_HEALTH_GROUP_VALUE"

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 383
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity$5;->b:Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity$5;->d:Landroid/content/Intent;

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->a(Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;Landroid/content/Intent;)V

    .line 384
    return-void
.end method
