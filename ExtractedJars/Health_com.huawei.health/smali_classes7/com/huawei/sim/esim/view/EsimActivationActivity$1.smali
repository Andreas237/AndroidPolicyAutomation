.class Lcom/huawei/sim/esim/view/EsimActivationActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/sim/esim/view/EsimActivationActivity;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/sim/esim/view/EsimActivationActivity;


# direct methods
.method constructor <init>(Lcom/huawei/sim/esim/view/EsimActivationActivity;)V
    .locals 0

    .line 96
    iput-object p1, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity$1;->b:Lcom/huawei/sim/esim/view/EsimActivationActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 99
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity$1;->b:Lcom/huawei/sim/esim/view/EsimActivationActivity;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "android.permission.CAMERA"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/ecw;->d(Landroid/content/Context;[Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 100
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity$1;->b:Lcom/huawei/sim/esim/view/EsimActivationActivity;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "android.permission.CAMERA"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/huawei/sim/esim/view/EsimActivationActivity;->requestPermissions([Ljava/lang/String;I)V

    goto :goto_0

    .line 102
    :cond_0
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity$1;->b:Lcom/huawei/sim/esim/view/EsimActivationActivity;

    const-class v1, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 103
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity$1;->b:Lcom/huawei/sim/esim/view/EsimActivationActivity;

    invoke-virtual {v0, v4}, Lcom/huawei/sim/esim/view/EsimActivationActivity;->startActivity(Landroid/content/Intent;)V

    .line 105
    :goto_0
    return-void
.end method
