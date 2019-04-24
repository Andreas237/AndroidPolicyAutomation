.class Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity$5;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;


# direct methods
.method constructor <init>(Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;)V
    .locals 0

    .line 211
    iput-object p1, p0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity$5;->e:Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 214
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 215
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 217
    :pswitch_0
    const-string v0, "EsimProfileBTFailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "message MESSAGE_BT_CONNECTING "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 218
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity$5;->e:Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->d(Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;)V

    .line 219
    goto :goto_0

    .line 221
    :pswitch_1
    const-string v0, "EsimProfileBTFailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "message MESSAGE_BT_CONNECTED "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 222
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity$5;->e:Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->a(Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;)V

    .line 223
    goto :goto_0

    .line 225
    :pswitch_2
    const-string v0, "EsimProfileBTFailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "message MESSAGE_BT_DISCONNECTED "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 226
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity$5;->e:Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->e(Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;)V

    .line 227
    goto :goto_0

    .line 229
    :pswitch_3
    const-string v0, "EsimProfileBTFailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "message MESSAGE_BT_RECONNECT_TIMEOUT "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 230
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity$5;->e:Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->e(Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;)V

    .line 231
    .line 235
    :goto_0
    :pswitch_4
    return-void

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_4
        :pswitch_3
    .end packed-switch
.end method
