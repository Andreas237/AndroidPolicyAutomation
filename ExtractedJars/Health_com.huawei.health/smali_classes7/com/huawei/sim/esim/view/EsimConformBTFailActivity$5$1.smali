.class Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$5$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$5;->onResponse(ILjava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic c:Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$5;

.field final synthetic d:Ljava/lang/Object;


# direct methods
.method constructor <init>(Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$5;ILjava/lang/Object;)V
    .locals 0

    .line 179
    iput-object p1, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$5$1;->c:Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$5;

    iput p2, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$5$1;->a:I

    iput-object p3, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$5$1;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 182
    iget v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$5$1;->a:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 183
    new-instance v2, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$5$1;->c:Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$5;

    iget-object v0, v0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$5;->a:Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;

    const-class v1, Lcom/huawei/sim/esim/view/EsimProfileSuccessActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 184
    const-string v0, "conform_status"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 185
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$5$1;->c:Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$5;

    iget-object v0, v0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$5;->a:Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;

    invoke-virtual {v0, v2}, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->startActivity(Landroid/content/Intent;)V

    .line 186
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$5$1;->c:Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$5;

    iget-object v0, v0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$5;->a:Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;

    invoke-virtual {v0}, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->finish()V

    .line 187
    goto/16 :goto_0

    .line 188
    :cond_0
    iget v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$5$1;->a:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    .line 189
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$5$1;->c:Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$5;

    iget-object v0, v0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$5;->a:Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;

    const-string v1, "network_failed"

    invoke-static {v0, v1}, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->c(Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;Ljava/lang/String;)Ljava/lang/String;

    goto :goto_0

    .line 191
    :cond_1
    iget v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$5$1;->a:I

    const/4 v1, 0x1

    if-eq v1, v0, :cond_2

    iget v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$5$1;->a:I

    const/4 v1, 0x2

    if-ne v1, v0, :cond_3

    .line 192
    :cond_2
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 194
    const-string v0, "conform_report"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 195
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$5$1;->c:Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$5;

    iget-object v0, v0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$5;->a:Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;

    const/4 v1, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->setResult(ILandroid/content/Intent;)V

    .line 196
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$5$1;->c:Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$5;

    iget-object v0, v0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$5;->a:Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;

    invoke-virtual {v0}, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->finish()V

    .line 197
    goto :goto_0

    .line 199
    :cond_3
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$5$1;->d:Ljava/lang/Object;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 200
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$5$1;->d:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    .line 201
    const/4 v0, -0x2

    if-ne v0, v2, :cond_4

    .line 202
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$5$1;->c:Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$5;

    iget-object v0, v0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$5;->a:Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->c(Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;)V

    .line 203
    return-void

    .line 206
    :cond_4
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$5$1;->c:Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$5;

    iget-object v0, v0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$5;->a:Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;

    iget v1, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$5$1;->a:I

    invoke-static {v0, v1}, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->c(Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;I)V

    .line 208
    :goto_0
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$5$1;->c:Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$5;

    iget-object v0, v0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$5;->a:Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->c(Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;)V

    .line 209
    return-void
.end method
