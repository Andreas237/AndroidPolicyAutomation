.class Lcom/huawei/sim/esim/view/ConformActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/sim/esim/view/ConformActivity;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/sim/esim/view/ConformActivity;


# direct methods
.method constructor <init>(Lcom/huawei/sim/esim/view/ConformActivity;)V
    .locals 0

    .line 99
    iput-object p1, p0, Lcom/huawei/sim/esim/view/ConformActivity$3;->d:Lcom/huawei/sim/esim/view/ConformActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 7

    .line 102
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity$3;->d:Lcom/huawei/sim/esim/view/ConformActivity;

    iget-object v1, p0, Lcom/huawei/sim/esim/view/ConformActivity$3;->d:Lcom/huawei/sim/esim/view/ConformActivity;

    invoke-static {v1}, Lcom/huawei/sim/esim/view/ConformActivity;->a(Lcom/huawei/sim/esim/view/ConformActivity;)Lo/eha;

    move-result-object v1

    invoke-virtual {v1}, Lo/eha;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/sim/esim/view/ConformActivity;->c(Lcom/huawei/sim/esim/view/ConformActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 103
    const-string v0, "ConformActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "conformcode "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/sim/esim/view/ConformActivity$3;->d:Lcom/huawei/sim/esim/view/ConformActivity;

    invoke-static {v3}, Lcom/huawei/sim/esim/view/ConformActivity;->c(Lcom/huawei/sim/esim/view/ConformActivity;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 104
    const/4 v5, 0x3

    .line 105
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity$3;->d:Lcom/huawei/sim/esim/view/ConformActivity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/ConformActivity;->e(Lcom/huawei/sim/esim/view/ConformActivity;)Lo/ecx;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 106
    const-string v0, "ConformActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == pluginSimAdapter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 109
    :cond_0
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity$3;->d:Lcom/huawei/sim/esim/view/ConformActivity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/ConformActivity;->e(Lcom/huawei/sim/esim/view/ConformActivity;)Lo/ecx;

    move-result-object v0

    invoke-interface {v0}, Lo/ecx;->a()I

    move-result v5

    .line 111
    :goto_0
    const/4 v0, 0x2

    if-ne v0, v5, :cond_1

    .line 113
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity$3;->d:Lcom/huawei/sim/esim/view/ConformActivity;

    sget v1, Lcom/huawei/sim/R$string;->IDS_plugin_sim_esim_conform_code_auth:I

    invoke-static {v0, v1}, Lcom/huawei/sim/esim/view/ConformActivity;->b(Lcom/huawei/sim/esim/view/ConformActivity;I)V

    .line 114
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity$3;->d:Lcom/huawei/sim/esim/view/ConformActivity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/ConformActivity;->e(Lcom/huawei/sim/esim/view/ConformActivity;)Lo/ecx;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/sim/esim/view/ConformActivity$3;->d:Lcom/huawei/sim/esim/view/ConformActivity;

    invoke-static {v1}, Lcom/huawei/sim/esim/view/ConformActivity;->c(Lcom/huawei/sim/esim/view/ConformActivity;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/sim/esim/view/ConformActivity$3;->d:Lcom/huawei/sim/esim/view/ConformActivity;

    invoke-static {v2}, Lcom/huawei/sim/esim/view/ConformActivity;->d(Lcom/huawei/sim/esim/view/ConformActivity;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/sim/esim/view/ConformActivity$3;->d:Lcom/huawei/sim/esim/view/ConformActivity;

    invoke-static {v3}, Lcom/huawei/sim/esim/view/ConformActivity;->b(Lcom/huawei/sim/esim/view/ConformActivity;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v3

    const/4 v4, 0x0

    invoke-interface {v0, v1, v4, v2, v3}, Lo/ecx;->b(Ljava/lang/String;ILcom/huawei/hwbasemgr/IBaseResponseCallback;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_1

    .line 117
    :cond_1
    new-instance v6, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity$3;->d:Lcom/huawei/sim/esim/view/ConformActivity;

    const-class v1, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;

    invoke-direct {v6, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 118
    const-string v0, "conform_code"

    iget-object v1, p0, Lcom/huawei/sim/esim/view/ConformActivity$3;->d:Lcom/huawei/sim/esim/view/ConformActivity;

    invoke-static {v1}, Lcom/huawei/sim/esim/view/ConformActivity;->c(Lcom/huawei/sim/esim/view/ConformActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 119
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity$3;->d:Lcom/huawei/sim/esim/view/ConformActivity;

    const/4 v1, 0x0

    invoke-virtual {v0, v6, v1}, Lcom/huawei/sim/esim/view/ConformActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 121
    :goto_1
    return-void
.end method
