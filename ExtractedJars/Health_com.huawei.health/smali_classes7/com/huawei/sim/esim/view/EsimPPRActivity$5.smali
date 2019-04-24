.class Lcom/huawei/sim/esim/view/EsimPPRActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/sim/esim/view/EsimPPRActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/sim/esim/view/EsimPPRActivity;


# direct methods
.method constructor <init>(Lcom/huawei/sim/esim/view/EsimPPRActivity;)V
    .locals 0

    .line 69
    iput-object p1, p0, Lcom/huawei/sim/esim/view/EsimPPRActivity$5;->e:Lcom/huawei/sim/esim/view/EsimPPRActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 72
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimPPRActivity$5;->e:Lcom/huawei/sim/esim/view/EsimPPRActivity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/EsimPPRActivity;->c(Lcom/huawei/sim/esim/view/EsimPPRActivity;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 73
    new-instance v5, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimPPRActivity$5;->e:Lcom/huawei/sim/esim/view/EsimPPRActivity;

    const-class v1, Lcom/huawei/sim/esim/view/ConformActivity;

    invoke-direct {v5, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 74
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimPPRActivity$5;->e:Lcom/huawei/sim/esim/view/EsimPPRActivity;

    invoke-virtual {v0, v5}, Lcom/huawei/sim/esim/view/EsimPPRActivity;->startActivity(Landroid/content/Intent;)V

    .line 75
    goto :goto_0

    .line 77
    :cond_0
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimPPRActivity$5;->e:Lcom/huawei/sim/esim/view/EsimPPRActivity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/EsimPPRActivity;->b(Lcom/huawei/sim/esim/view/EsimPPRActivity;)Lo/ecx;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 78
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimPPRActivity$5;->e:Lcom/huawei/sim/esim/view/EsimPPRActivity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/EsimPPRActivity;->b(Lcom/huawei/sim/esim/view/EsimPPRActivity;)Lo/ecx;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/sim/esim/view/EsimPPRActivity$5;->e:Lcom/huawei/sim/esim/view/EsimPPRActivity;

    invoke-static {v1}, Lcom/huawei/sim/esim/view/EsimPPRActivity;->a(Lcom/huawei/sim/esim/view/EsimPPRActivity;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lo/ecx;->b(Ljava/lang/String;ILcom/huawei/hwbasemgr/IBaseResponseCallback;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 79
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimPPRActivity$5;->e:Lcom/huawei/sim/esim/view/EsimPPRActivity;

    sget v1, Lcom/huawei/sim/R$string;->IDS_plugin_sim_esim_handling:I

    invoke-static {v0, v1}, Lcom/huawei/sim/esim/view/EsimPPRActivity;->d(Lcom/huawei/sim/esim/view/EsimPPRActivity;I)V

    goto :goto_0

    .line 81
    :cond_1
    const-string v0, "EsimPPRActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == pluginSimAdapter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    :goto_0
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimPPRActivity$5;->e:Lcom/huawei/sim/esim/view/EsimPPRActivity;

    invoke-virtual {v0}, Lcom/huawei/sim/esim/view/EsimPPRActivity;->finish()V

    .line 85
    return-void
.end method
