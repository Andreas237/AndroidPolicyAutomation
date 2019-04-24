.class Lcom/huawei/health/sns/ui/qrcode/HealthQRTextUrlActivty$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/qrcode/HealthQRTextUrlActivty;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/sns/ui/qrcode/HealthQRTextUrlActivty;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/qrcode/HealthQRTextUrlActivty;)V
    .locals 0

    .line 94
    iput-object p1, p0, Lcom/huawei/health/sns/ui/qrcode/HealthQRTextUrlActivty$1;->a:Lcom/huawei/health/sns/ui/qrcode/HealthQRTextUrlActivty;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 97
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthQRTextUrlActivty$1;->a:Lcom/huawei/health/sns/ui/qrcode/HealthQRTextUrlActivty;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/qrcode/HealthQRTextUrlActivty;->c(Lcom/huawei/health/sns/ui/qrcode/HealthQRTextUrlActivty;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 98
    new-instance v2, Landroid/content/Intent;

    const-string v0, "android.intent.action.VIEW"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/qrcode/HealthQRTextUrlActivty$1;->a:Lcom/huawei/health/sns/ui/qrcode/HealthQRTextUrlActivty;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/qrcode/HealthQRTextUrlActivty;->e(Lcom/huawei/health/sns/ui/qrcode/HealthQRTextUrlActivty;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 99
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthQRTextUrlActivty$1;->a:Lcom/huawei/health/sns/ui/qrcode/HealthQRTextUrlActivty;

    const-string v1, "com.android.browser"

    invoke-static {v0, v2, v1}, Lo/bnx;->a(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;)Z

    .line 101
    :cond_0
    return-void
.end method
