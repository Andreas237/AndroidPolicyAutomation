.class Lo/cyk$b;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cyk;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field final synthetic d:Lo/cyk;


# direct methods
.method public constructor <init>(Lo/cyk;Landroid/os/Looper;)V
    .locals 0

    .line 306
    iput-object p1, p0, Lo/cyk$b;->d:Lo/cyk;

    .line 307
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 308
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 7

    .line 312
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 313
    const-string v0, "01"

    const-string v1, "BLEAuthenticManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "received msg:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget v4, p1, Landroid/os/Message;->what:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 314
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 316
    :pswitch_0
    new-instance v6, Landroid/content/Intent;

    const-string v0, "com.huawei.bone.action.REQUEST_BIND_DEVICE"

    invoke-direct {v6, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 317
    iget-object v0, p0, Lo/cyk$b;->d:Lo/cyk;

    invoke-static {v0}, Lo/cyk;->e(Lo/cyk;)Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lo/dac;->a:Ljava/lang/String;

    invoke-virtual {v0, v6, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 318
    iget-object v0, p0, Lo/cyk$b;->d:Lo/cyk;

    invoke-static {v0}, Lo/cyk;->b(Lo/cyk;)Lo/cyj;

    move-result-object v0

    iget-object v1, p0, Lo/cyk$b;->d:Lo/cyk;

    invoke-static {v1}, Lo/cyk;->e(Lo/cyk;)Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lo/cyk$b;->d:Lo/cyk;

    invoke-static {v2}, Lo/cyk;->d(Lo/cyk;)Landroid/bluetooth/BluetoothDevice;

    move-result-object v2

    iget-object v3, p0, Lo/cyk$b;->d:Lo/cyk;

    invoke-static {v3}, Lo/cyk;->c(Lo/cyk;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v3

    invoke-static {v1, v2, v3}, Lo/cxo;->e(Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)Lo/cye;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cyj;->a(Lo/cye;)V

    .line 319
    goto :goto_0

    .line 321
    :pswitch_1
    iget-object v0, p0, Lo/cyk$b;->d:Lo/cyk;

    invoke-static {v0}, Lo/cyk;->b(Lo/cyk;)Lo/cyj;

    move-result-object v0

    invoke-virtual {v0}, Lo/cyj;->b()V

    .line 322
    goto :goto_0

    .line 324
    :pswitch_2
    iget-object v0, p0, Lo/cyk$b;->d:Lo/cyk;

    iget-object v1, p0, Lo/cyk$b;->d:Lo/cyk;

    invoke-static {v1}, Lo/cyk;->d(Lo/cyk;)Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    iget-object v2, p0, Lo/cyk$b;->d:Lo/cyk;

    invoke-static {v2}, Lo/cyk;->a(Lo/cyk;)Lo/cxz;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/cyk;->c(Landroid/bluetooth/BluetoothDevice;Lo/cxz;)V

    .line 325
    goto :goto_0

    .line 335
    :pswitch_3
    iget-object v0, p0, Lo/cyk$b;->d:Lo/cyk;

    invoke-static {v0}, Lo/cyk;->b(Lo/cyk;)Lo/cyj;

    move-result-object v0

    const/16 v1, 0x14

    invoke-virtual {v0, v1}, Lo/cyj;->a(I)V

    .line 336
    iget-object v0, p0, Lo/cyk$b;->d:Lo/cyk;

    invoke-static {v0}, Lo/cyk;->c(Lo/cyk;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 337
    iget-object v0, p0, Lo/cyk$b;->d:Lo/cyk;

    invoke-static {v0}, Lo/cyk;->b(Lo/cyk;)Lo/cyj;

    move-result-object v0

    iget-object v1, p0, Lo/cyk$b;->d:Lo/cyk;

    invoke-static {v1}, Lo/cyk;->c(Lo/cyk;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceProtocol()I

    move-result v1

    invoke-static {v1}, Lo/cxo;->c(I)Lo/cye;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cyj;->a(Lo/cye;)V

    goto :goto_0

    .line 339
    :cond_0
    const-string v0, "0xA0200006"

    const-string v1, "01"

    const-string v2, "BLEAuthenticManager"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "mBTDeviceInfo is null."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 341
    .line 345
    :goto_0
    :pswitch_4
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_4
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method
