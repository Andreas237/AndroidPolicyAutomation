.class Lcom/huawei/sim/esim/view/EsimProfileAcitvity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/sim/esim/view/EsimProfileAcitvity;


# direct methods
.method constructor <init>(Lcom/huawei/sim/esim/view/EsimProfileAcitvity;)V
    .locals 0

    .line 203
    iput-object p1, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity$3;->a:Lcom/huawei/sim/esim/view/EsimProfileAcitvity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 206
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity$3;->a:Lcom/huawei/sim/esim/view/EsimProfileAcitvity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->b(Lcom/huawei/sim/esim/view/EsimProfileAcitvity;)Lo/ecx;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 207
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity$3;->a:Lcom/huawei/sim/esim/view/EsimProfileAcitvity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->b(Lcom/huawei/sim/esim/view/EsimProfileAcitvity;)Lo/ecx;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity$3;->a:Lcom/huawei/sim/esim/view/EsimProfileAcitvity;

    invoke-static {v1}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->a(Lcom/huawei/sim/esim/view/EsimProfileAcitvity;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lo/ecx;->b(Ljava/lang/String;ILcom/huawei/hwbasemgr/IBaseResponseCallback;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 209
    :cond_0
    new-instance v5, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity$3;->a:Lcom/huawei/sim/esim/view/EsimProfileAcitvity;

    const-class v1, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;

    invoke-direct {v5, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 210
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity$3;->a:Lcom/huawei/sim/esim/view/EsimProfileAcitvity;

    invoke-virtual {v0, v5}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->startActivity(Landroid/content/Intent;)V

    .line 211
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity$3;->a:Lcom/huawei/sim/esim/view/EsimProfileAcitvity;

    invoke-virtual {v0}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->finish()V

    .line 212
    return-void
.end method
