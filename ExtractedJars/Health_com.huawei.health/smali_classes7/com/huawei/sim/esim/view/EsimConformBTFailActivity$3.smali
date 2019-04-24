.class Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$3;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;


# direct methods
.method constructor <init>(Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;)V
    .locals 0

    .line 345
    iput-object p1, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$3;->e:Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 348
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 349
    const-string v0, "ConformReportActivity"

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

    .line 350
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 352
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$3;->e:Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->a(Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;)V

    .line 353
    goto :goto_0

    .line 355
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$3;->e:Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->c(Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 356
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$3;->e:Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->d(Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;)V

    .line 357
    goto :goto_0

    .line 359
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$3;->e:Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->b(Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;)V

    .line 360
    goto :goto_0

    .line 362
    :pswitch_3
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$3;->e:Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->b(Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;)V

    .line 363
    .line 367
    :goto_0
    :pswitch_4
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_4
        :pswitch_3
    .end packed-switch
.end method
