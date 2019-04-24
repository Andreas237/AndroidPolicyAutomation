.class Lcom/huawei/sim/esim/view/EsimProfileAcitvity$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/sim/esim/view/EsimProfileAcitvity;
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

    .line 425
    iput-object p1, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity$10;->b:Lcom/huawei/sim/esim/view/EsimProfileAcitvity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 5

    .line 428
    const-string v0, "EsimProfileAcitvity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "err_code = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 429
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity$10;->b:Lcom/huawei/sim/esim/view/EsimProfileAcitvity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->g(Lcom/huawei/sim/esim/view/EsimProfileAcitvity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 430
    const/4 v0, 0x1

    if-ne v0, p1, :cond_0

    .line 431
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v4

    .line 432
    const/4 v0, 0x4

    iput v0, v4, Landroid/os/Message;->what:I

    .line 433
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity$10;->b:Lcom/huawei/sim/esim/view/EsimProfileAcitvity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->g(Lcom/huawei/sim/esim/view/EsimProfileAcitvity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 434
    goto :goto_0

    .line 435
    :cond_0
    const/4 v0, 0x2

    if-ne v0, p1, :cond_1

    .line 436
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v4

    .line 437
    const/4 v0, 0x2

    iput v0, v4, Landroid/os/Message;->what:I

    .line 438
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity$10;->b:Lcom/huawei/sim/esim/view/EsimProfileAcitvity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->g(Lcom/huawei/sim/esim/view/EsimProfileAcitvity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 439
    goto :goto_0

    .line 441
    :cond_1
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v4

    .line 442
    const/4 v0, 0x3

    iput v0, v4, Landroid/os/Message;->what:I

    .line 443
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity$10;->b:Lcom/huawei/sim/esim/view/EsimProfileAcitvity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->g(Lcom/huawei/sim/esim/view/EsimProfileAcitvity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 445
    :goto_0
    return-void
.end method
