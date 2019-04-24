.class Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity$1;
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
.field final synthetic c:Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;)V
    .locals 0

    .line 386
    iput-object p1, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity$1;->c:Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 388
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity$1;->c:Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->finish()V

    .line 389
    return-void
.end method
