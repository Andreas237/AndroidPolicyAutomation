.class Lcom/huawei/sim/esim/qrcode/QrCodeActivity$4$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/sim/esim/qrcode/QrCodeActivity$4;->onResponse(ILjava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:I

.field final synthetic d:Ljava/lang/Object;

.field final synthetic e:Lcom/huawei/sim/esim/qrcode/QrCodeActivity$4;


# direct methods
.method constructor <init>(Lcom/huawei/sim/esim/qrcode/QrCodeActivity$4;ILjava/lang/Object;)V
    .locals 0

    .line 361
    iput-object p1, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity$4$3;->e:Lcom/huawei/sim/esim/qrcode/QrCodeActivity$4;

    iput p2, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity$4$3;->c:I

    iput-object p3, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity$4$3;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .line 364
    iget v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity$4$3;->c:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_4

    .line 365
    new-instance v4, Lo/edf;

    invoke-direct {v4}, Lo/edf;-><init>()V

    .line 366
    new-instance v5, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity$4$3;->e:Lcom/huawei/sim/esim/qrcode/QrCodeActivity$4;

    iget-object v0, v0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity$4;->a:Lcom/huawei/sim/esim/qrcode/QrCodeActivity;

    const-class v1, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;

    invoke-direct {v5, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 367
    const/4 v6, 0x0

    .line 369
    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity$4$3;->d:Ljava/lang/Object;

    instance-of v0, v0, Lo/dap;

    if-eqz v0, :cond_1

    .line 370
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    iget-object v1, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity$4$3;->d:Ljava/lang/Object;

    check-cast v1, Lo/dap;

    invoke-virtual {v1}, Lo/dap;->e()Lo/dal;

    move-result-object v1

    const-class v2, Lo/dal;

    invoke-virtual {v0, v1, v2}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/String;

    move-result-object v7

    .line 371
    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity$4$3;->d:Ljava/lang/Object;

    check-cast v0, Lo/dap;

    invoke-virtual {v0}, Lo/dap;->b()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v6, 0x0

    goto :goto_0

    :cond_0
    const/4 v6, 0x1

    :goto_0
    goto :goto_1

    .line 374
    :cond_1
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    iget-object v1, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity$4$3;->d:Ljava/lang/Object;

    const-class v2, Lo/dal;

    invoke-virtual {v0, v1, v2}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/String;

    move-result-object v7

    .line 376
    :goto_1
    const-string v0, "eSim_profile"

    invoke-virtual {v5, v0, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 377
    invoke-static {}, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "the data "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 378
    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity$4$3;->e:Lcom/huawei/sim/esim/qrcode/QrCodeActivity$4;

    iget-object v0, v0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity$4;->a:Lcom/huawei/sim/esim/qrcode/QrCodeActivity;

    invoke-static {v0}, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->c(Lcom/huawei/sim/esim/qrcode/QrCodeActivity;)Lo/pr;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/edf;->a(Lo/pr;)Z

    move-result v0

    if-nez v0, :cond_2

    if-eqz v6, :cond_3

    .line 379
    :cond_2
    const-string v0, "conform_status"

    const/4 v1, 0x1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    goto :goto_2

    .line 381
    :cond_3
    const-string v0, "conform_status"

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 383
    :goto_2
    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity$4$3;->e:Lcom/huawei/sim/esim/qrcode/QrCodeActivity$4;

    iget-object v0, v0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity$4;->a:Lcom/huawei/sim/esim/qrcode/QrCodeActivity;

    invoke-virtual {v0, v5}, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->startActivity(Landroid/content/Intent;)V

    .line 384
    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity$4$3;->e:Lcom/huawei/sim/esim/qrcode/QrCodeActivity$4;

    iget-object v0, v0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity$4;->a:Lcom/huawei/sim/esim/qrcode/QrCodeActivity;

    invoke-virtual {v0}, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->finish()V

    .line 385
    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity$4$3;->e:Lcom/huawei/sim/esim/qrcode/QrCodeActivity$4;

    iget-object v0, v0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity$4;->a:Lcom/huawei/sim/esim/qrcode/QrCodeActivity;

    invoke-static {v0}, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->a(Lcom/huawei/sim/esim/qrcode/QrCodeActivity;)V

    .line 386
    goto/16 :goto_4

    .line 388
    :cond_4
    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity$4$3;->e:Lcom/huawei/sim/esim/qrcode/QrCodeActivity$4;

    iget-object v0, v0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity$4;->a:Lcom/huawei/sim/esim/qrcode/QrCodeActivity;

    invoke-static {v0}, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->b(Lcom/huawei/sim/esim/qrcode/QrCodeActivity;)Lo/egn;

    move-result-object v0

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity$4$3;->e:Lcom/huawei/sim/esim/qrcode/QrCodeActivity$4;

    iget-object v0, v0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity$4;->a:Lcom/huawei/sim/esim/qrcode/QrCodeActivity;

    invoke-static {v0}, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->b(Lcom/huawei/sim/esim/qrcode/QrCodeActivity;)Lo/egn;

    move-result-object v0

    invoke-virtual {v0}, Lo/egn;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 389
    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity$4$3;->d:Ljava/lang/Object;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 390
    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity$4$3;->d:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 391
    const/4 v0, -0x2

    if-ne v0, v4, :cond_6

    .line 392
    new-instance v5, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity$4$3;->e:Lcom/huawei/sim/esim/qrcode/QrCodeActivity$4;

    iget-object v0, v0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity$4;->a:Lcom/huawei/sim/esim/qrcode/QrCodeActivity;

    const-class v1, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;

    invoke-direct {v5, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 393
    new-instance v6, Lo/edf;

    invoke-direct {v6}, Lo/edf;-><init>()V

    .line 394
    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity$4$3;->e:Lcom/huawei/sim/esim/qrcode/QrCodeActivity$4;

    iget-object v0, v0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity$4;->a:Lcom/huawei/sim/esim/qrcode/QrCodeActivity;

    invoke-static {v0}, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->c(Lcom/huawei/sim/esim/qrcode/QrCodeActivity;)Lo/pr;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/edf;->a(Lo/pr;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 395
    const-string v0, "conform_status"

    const/4 v1, 0x1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    goto :goto_3

    .line 397
    :cond_5
    const-string v0, "conform_status"

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 399
    :goto_3
    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity$4$3;->e:Lcom/huawei/sim/esim/qrcode/QrCodeActivity$4;

    iget-object v0, v0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity$4;->a:Lcom/huawei/sim/esim/qrcode/QrCodeActivity;

    invoke-virtual {v0, v5}, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->startActivity(Landroid/content/Intent;)V

    .line 400
    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity$4$3;->e:Lcom/huawei/sim/esim/qrcode/QrCodeActivity$4;

    iget-object v0, v0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity$4;->a:Lcom/huawei/sim/esim/qrcode/QrCodeActivity;

    invoke-virtual {v0}, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->finish()V

    .line 401
    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity$4$3;->e:Lcom/huawei/sim/esim/qrcode/QrCodeActivity$4;

    iget-object v0, v0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity$4;->a:Lcom/huawei/sim/esim/qrcode/QrCodeActivity;

    invoke-static {v0}, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->a(Lcom/huawei/sim/esim/qrcode/QrCodeActivity;)V

    .line 402
    return-void

    .line 405
    :cond_6
    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity$4$3;->e:Lcom/huawei/sim/esim/qrcode/QrCodeActivity$4;

    iget-object v0, v0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity$4;->a:Lcom/huawei/sim/esim/qrcode/QrCodeActivity;

    iget v1, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity$4$3;->c:I

    invoke-static {v0, v1}, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->b(Lcom/huawei/sim/esim/qrcode/QrCodeActivity;I)V

    .line 408
    :cond_7
    :goto_4
    return-void
.end method
