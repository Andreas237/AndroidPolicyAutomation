.class Lcom/huawei/sim/esim/view/WirelessManagerAcitivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;


# direct methods
.method constructor <init>(Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;)V
    .locals 0

    .line 184
    iput-object p1, p0, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity$1;->a:Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 186
    new-instance v2, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity$1;->a:Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;

    const-class v1, Lcom/huawei/sim/esim/view/EsimActivationActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 187
    iget-object v0, p0, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity$1;->a:Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;->b(Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 188
    return-void
.end method
