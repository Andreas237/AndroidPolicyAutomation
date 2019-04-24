.class Lcom/huawei/sim/esim/view/ConformActivity$2$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/sim/esim/view/ConformActivity$2;->onResponse(ILjava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic c:Ljava/lang/Object;

.field final synthetic e:Lcom/huawei/sim/esim/view/ConformActivity$2;


# direct methods
.method constructor <init>(Lcom/huawei/sim/esim/view/ConformActivity$2;ILjava/lang/Object;)V
    .locals 0

    .line 216
    iput-object p1, p0, Lcom/huawei/sim/esim/view/ConformActivity$2$1;->e:Lcom/huawei/sim/esim/view/ConformActivity$2;

    iput p2, p0, Lcom/huawei/sim/esim/view/ConformActivity$2$1;->a:I

    iput-object p3, p0, Lcom/huawei/sim/esim/view/ConformActivity$2$1;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 219
    iget v0, p0, Lcom/huawei/sim/esim/view/ConformActivity$2$1;->a:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 220
    new-instance v2, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity$2$1;->e:Lcom/huawei/sim/esim/view/ConformActivity$2;

    iget-object v0, v0, Lcom/huawei/sim/esim/view/ConformActivity$2;->b:Lcom/huawei/sim/esim/view/ConformActivity;

    const-class v1, Lcom/huawei/sim/esim/view/EsimProfileSuccessActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 221
    const-string v0, "conform_status"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 222
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity$2$1;->e:Lcom/huawei/sim/esim/view/ConformActivity$2;

    iget-object v0, v0, Lcom/huawei/sim/esim/view/ConformActivity$2;->b:Lcom/huawei/sim/esim/view/ConformActivity;

    invoke-virtual {v0, v2}, Lcom/huawei/sim/esim/view/ConformActivity;->startActivity(Landroid/content/Intent;)V

    .line 223
    goto/16 :goto_0

    .line 228
    :cond_0
    iget v0, p0, Lcom/huawei/sim/esim/view/ConformActivity$2$1;->a:I

    const/4 v1, 0x4

    if-ne v1, v0, :cond_1

    .line 229
    new-instance v2, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity$2$1;->e:Lcom/huawei/sim/esim/view/ConformActivity$2;

    iget-object v0, v0, Lcom/huawei/sim/esim/view/ConformActivity$2;->b:Lcom/huawei/sim/esim/view/ConformActivity;

    const-class v1, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 230
    const-string v0, "conform_error"

    const-string v1, "network_failed"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 231
    const-string v0, "conform_code"

    iget-object v1, p0, Lcom/huawei/sim/esim/view/ConformActivity$2$1;->e:Lcom/huawei/sim/esim/view/ConformActivity$2;

    iget-object v1, v1, Lcom/huawei/sim/esim/view/ConformActivity$2;->b:Lcom/huawei/sim/esim/view/ConformActivity;

    invoke-static {v1}, Lcom/huawei/sim/esim/view/ConformActivity;->c(Lcom/huawei/sim/esim/view/ConformActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 232
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity$2$1;->e:Lcom/huawei/sim/esim/view/ConformActivity$2;

    iget-object v0, v0, Lcom/huawei/sim/esim/view/ConformActivity$2;->b:Lcom/huawei/sim/esim/view/ConformActivity;

    const/4 v1, 0x0

    invoke-virtual {v0, v2, v1}, Lcom/huawei/sim/esim/view/ConformActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 233
    goto/16 :goto_0

    .line 239
    :cond_1
    iget v0, p0, Lcom/huawei/sim/esim/view/ConformActivity$2$1;->a:I

    const/4 v1, 0x1

    if-eq v1, v0, :cond_2

    iget v0, p0, Lcom/huawei/sim/esim/view/ConformActivity$2$1;->a:I

    const/4 v1, 0x2

    if-ne v1, v0, :cond_3

    .line 240
    :cond_2
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity$2$1;->e:Lcom/huawei/sim/esim/view/ConformActivity$2;

    iget-object v0, v0, Lcom/huawei/sim/esim/view/ConformActivity$2;->b:Lcom/huawei/sim/esim/view/ConformActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/sim/esim/view/ConformActivity;->d(Lcom/huawei/sim/esim/view/ConformActivity;I)I

    .line 241
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity$2$1;->e:Lcom/huawei/sim/esim/view/ConformActivity$2;

    iget-object v0, v0, Lcom/huawei/sim/esim/view/ConformActivity$2;->b:Lcom/huawei/sim/esim/view/ConformActivity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/ConformActivity;->g(Lcom/huawei/sim/esim/view/ConformActivity;)V

    goto/16 :goto_0

    .line 244
    :cond_3
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity$2$1;->c:Ljava/lang/Object;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 245
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity$2$1;->c:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    .line 246
    const/4 v0, -0x2

    if-ne v0, v2, :cond_4

    .line 247
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity$2$1;->e:Lcom/huawei/sim/esim/view/ConformActivity$2;

    iget-object v0, v0, Lcom/huawei/sim/esim/view/ConformActivity$2;->b:Lcom/huawei/sim/esim/view/ConformActivity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/ConformActivity;->k(Lcom/huawei/sim/esim/view/ConformActivity;)Lo/egn;

    move-result-object v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity$2$1;->e:Lcom/huawei/sim/esim/view/ConformActivity$2;

    iget-object v0, v0, Lcom/huawei/sim/esim/view/ConformActivity$2;->b:Lcom/huawei/sim/esim/view/ConformActivity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/ConformActivity;->k(Lcom/huawei/sim/esim/view/ConformActivity;)Lo/egn;

    move-result-object v0

    invoke-virtual {v0}, Lo/egn;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 248
    new-instance v3, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity$2$1;->e:Lcom/huawei/sim/esim/view/ConformActivity$2;

    iget-object v0, v0, Lcom/huawei/sim/esim/view/ConformActivity$2;->b:Lcom/huawei/sim/esim/view/ConformActivity;

    const-class v1, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;

    invoke-direct {v3, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 249
    const-string v0, "conform_code"

    iget-object v1, p0, Lcom/huawei/sim/esim/view/ConformActivity$2$1;->e:Lcom/huawei/sim/esim/view/ConformActivity$2;

    iget-object v1, v1, Lcom/huawei/sim/esim/view/ConformActivity$2;->b:Lcom/huawei/sim/esim/view/ConformActivity;

    invoke-static {v1}, Lcom/huawei/sim/esim/view/ConformActivity;->c(Lcom/huawei/sim/esim/view/ConformActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 250
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity$2$1;->e:Lcom/huawei/sim/esim/view/ConformActivity$2;

    iget-object v0, v0, Lcom/huawei/sim/esim/view/ConformActivity$2;->b:Lcom/huawei/sim/esim/view/ConformActivity;

    const/4 v1, 0x0

    invoke-virtual {v0, v3, v1}, Lcom/huawei/sim/esim/view/ConformActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 251
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity$2$1;->e:Lcom/huawei/sim/esim/view/ConformActivity$2;

    iget-object v0, v0, Lcom/huawei/sim/esim/view/ConformActivity$2;->b:Lcom/huawei/sim/esim/view/ConformActivity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/ConformActivity;->h(Lcom/huawei/sim/esim/view/ConformActivity;)V

    .line 252
    return-void

    .line 256
    :cond_4
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity$2$1;->e:Lcom/huawei/sim/esim/view/ConformActivity$2;

    iget-object v0, v0, Lcom/huawei/sim/esim/view/ConformActivity$2;->b:Lcom/huawei/sim/esim/view/ConformActivity;

    iget v1, p0, Lcom/huawei/sim/esim/view/ConformActivity$2$1;->a:I

    invoke-static {v0, v1}, Lcom/huawei/sim/esim/view/ConformActivity;->c(Lcom/huawei/sim/esim/view/ConformActivity;I)V

    .line 258
    :goto_0
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity$2$1;->e:Lcom/huawei/sim/esim/view/ConformActivity$2;

    iget-object v0, v0, Lcom/huawei/sim/esim/view/ConformActivity$2;->b:Lcom/huawei/sim/esim/view/ConformActivity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/ConformActivity;->h(Lcom/huawei/sim/esim/view/ConformActivity;)V

    .line 259
    return-void
.end method
