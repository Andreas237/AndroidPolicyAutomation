.class Lcom/huawei/sim/esim/view/EsimProfileAcitvity$4;
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
.field final synthetic b:Lcom/huawei/sim/esim/view/EsimProfileAcitvity;


# direct methods
.method constructor <init>(Lcom/huawei/sim/esim/view/EsimProfileAcitvity;)V
    .locals 0

    .line 255
    iput-object p1, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity$4;->b:Lcom/huawei/sim/esim/view/EsimProfileAcitvity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 258
    const-string v0, "EsimProfileAcitvity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " mNextButton.setOnClickListener"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 259
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity$4;->b:Lcom/huawei/sim/esim/view/EsimProfileAcitvity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->d(Lcom/huawei/sim/esim/view/EsimProfileAcitvity;)[B

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity$4;->b:Lcom/huawei/sim/esim/view/EsimProfileAcitvity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->d(Lcom/huawei/sim/esim/view/EsimProfileAcitvity;)[B

    move-result-object v0

    const/4 v1, 0x0

    aget-byte v0, v0, v1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity$4;->b:Lcom/huawei/sim/esim/view/EsimProfileAcitvity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->d(Lcom/huawei/sim/esim/view/EsimProfileAcitvity;)[B

    move-result-object v0

    const/4 v1, 0x0

    aget-byte v0, v0, v1

    const/16 v1, -0x80

    if-ne v0, v1, :cond_3

    .line 260
    :cond_0
    const-string v0, "EsimProfileAcitvity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == mProfilePolicyRules"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 261
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity$4;->b:Lcom/huawei/sim/esim/view/EsimProfileAcitvity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->e(Lcom/huawei/sim/esim/view/EsimProfileAcitvity;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 262
    new-instance v5, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity$4;->b:Lcom/huawei/sim/esim/view/EsimProfileAcitvity;

    const-class v1, Lcom/huawei/sim/esim/view/ConformActivity;

    invoke-direct {v5, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 263
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity$4;->b:Lcom/huawei/sim/esim/view/EsimProfileAcitvity;

    invoke-virtual {v0, v5}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->startActivity(Landroid/content/Intent;)V

    .line 264
    goto/16 :goto_0

    .line 267
    :cond_1
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity$4;->b:Lcom/huawei/sim/esim/view/EsimProfileAcitvity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->b(Lcom/huawei/sim/esim/view/EsimProfileAcitvity;)Lo/ecx;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 268
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity$4;->b:Lcom/huawei/sim/esim/view/EsimProfileAcitvity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->b(Lcom/huawei/sim/esim/view/EsimProfileAcitvity;)Lo/ecx;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity$4;->b:Lcom/huawei/sim/esim/view/EsimProfileAcitvity;

    invoke-static {v1}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->a(Lcom/huawei/sim/esim/view/EsimProfileAcitvity;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lo/ecx;->b(Ljava/lang/String;ILcom/huawei/hwbasemgr/IBaseResponseCallback;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 269
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity$4;->b:Lcom/huawei/sim/esim/view/EsimProfileAcitvity;

    sget v1, Lcom/huawei/sim/R$string;->IDS_plugin_sim_esim_handling:I

    invoke-static {v0, v1}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->d(Lcom/huawei/sim/esim/view/EsimProfileAcitvity;I)V

    goto :goto_0

    .line 272
    :cond_2
    const-string v0, "EsimProfileAcitvity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == pluginSimAdapter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 276
    :cond_3
    const-string v0, "EsimProfileAcitvity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PPR1&PPR2"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 278
    new-instance v5, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity$4;->b:Lcom/huawei/sim/esim/view/EsimProfileAcitvity;

    const-class v1, Lcom/huawei/sim/esim/view/EsimPPRActivity;

    invoke-direct {v5, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 279
    const-string v0, "profile_policy_rules"

    iget-object v1, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity$4;->b:Lcom/huawei/sim/esim/view/EsimProfileAcitvity;

    invoke-static {v1}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->d(Lcom/huawei/sim/esim/view/EsimProfileAcitvity;)[B

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[B)Landroid/content/Intent;

    .line 280
    const-string v0, "conform_status"

    iget-object v1, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity$4;->b:Lcom/huawei/sim/esim/view/EsimProfileAcitvity;

    invoke-static {v1}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->e(Lcom/huawei/sim/esim/view/EsimProfileAcitvity;)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 281
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity$4;->b:Lcom/huawei/sim/esim/view/EsimProfileAcitvity;

    invoke-virtual {v0, v5}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->startActivity(Landroid/content/Intent;)V

    .line 283
    :goto_0
    return-void
.end method
