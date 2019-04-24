.class Lcom/huawei/sim/esim/view/EsimProfileAcitvity$7;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/sim/esim/view/EsimProfileAcitvity;
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

    .line 398
    iput-object p1, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity$7;->a:Lcom/huawei/sim/esim/view/EsimProfileAcitvity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 401
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 402
    const-string v0, "EsimProfileAcitvity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "message "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p1, Landroid/os/Message;->what:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 403
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 405
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity$7;->a:Lcom/huawei/sim/esim/view/EsimProfileAcitvity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->f(Lcom/huawei/sim/esim/view/EsimProfileAcitvity;)V

    .line 406
    goto :goto_0

    .line 408
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity$7;->a:Lcom/huawei/sim/esim/view/EsimProfileAcitvity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->i(Lcom/huawei/sim/esim/view/EsimProfileAcitvity;)V

    .line 409
    goto :goto_0

    .line 411
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity$7;->a:Lcom/huawei/sim/esim/view/EsimProfileAcitvity;

    iget v1, p1, Landroid/os/Message;->arg1:I

    invoke-static {v0, v1}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->e(Lcom/huawei/sim/esim/view/EsimProfileAcitvity;I)V

    .line 412
    goto :goto_0

    .line 414
    :pswitch_3
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity$7;->a:Lcom/huawei/sim/esim/view/EsimProfileAcitvity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->k(Lcom/huawei/sim/esim/view/EsimProfileAcitvity;)V

    .line 415
    goto :goto_0

    .line 417
    :pswitch_4
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity$7;->a:Lcom/huawei/sim/esim/view/EsimProfileAcitvity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->k(Lcom/huawei/sim/esim/view/EsimProfileAcitvity;)V

    .line 418
    .line 422
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_1
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_4
    .end packed-switch
.end method
