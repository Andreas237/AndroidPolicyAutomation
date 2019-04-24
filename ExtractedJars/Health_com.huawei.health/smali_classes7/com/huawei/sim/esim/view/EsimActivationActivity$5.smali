.class Lcom/huawei/sim/esim/view/EsimActivationActivity$5;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/sim/esim/view/EsimActivationActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/sim/esim/view/EsimActivationActivity;


# direct methods
.method constructor <init>(Lcom/huawei/sim/esim/view/EsimActivationActivity;)V
    .locals 0

    .line 281
    iput-object p1, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity$5;->c:Lcom/huawei/sim/esim/view/EsimActivationActivity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 284
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 285
    const-string v0, "EsimActivationActivity"

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

    .line 286
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 288
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity$5;->c:Lcom/huawei/sim/esim/view/EsimActivationActivity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/EsimActivationActivity;->e(Lcom/huawei/sim/esim/view/EsimActivationActivity;)V

    .line 289
    goto :goto_0

    .line 291
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity$5;->c:Lcom/huawei/sim/esim/view/EsimActivationActivity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/EsimActivationActivity;->c(Lcom/huawei/sim/esim/view/EsimActivationActivity;)V

    .line 292
    goto :goto_0

    .line 294
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity$5;->c:Lcom/huawei/sim/esim/view/EsimActivationActivity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/EsimActivationActivity;->d(Lcom/huawei/sim/esim/view/EsimActivationActivity;)V

    .line 295
    goto :goto_0

    .line 297
    :pswitch_3
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity$5;->c:Lcom/huawei/sim/esim/view/EsimActivationActivity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/EsimActivationActivity;->c(Lcom/huawei/sim/esim/view/EsimActivationActivity;)V

    .line 298
    .line 302
    :goto_0
    :pswitch_4
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_4
        :pswitch_3
    .end packed-switch
.end method
