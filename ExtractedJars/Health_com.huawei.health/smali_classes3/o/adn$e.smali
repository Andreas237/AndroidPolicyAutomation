.class Lo/adn$e;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/adn;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation


# instance fields
.field final synthetic c:Lo/adn;


# direct methods
.method public constructor <init>(Lo/adn;Landroid/os/Looper;)V
    .locals 0

    .line 189
    iput-object p1, p0, Lo/adn$e;->c:Lo/adn;

    .line 190
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 191
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 5

    .line 195
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 196
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 197
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HWChMeasureController receive msg : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p1, Landroid/os/Message;->what:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 198
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 201
    :pswitch_0
    iget-object v0, p0, Lo/adn$e;->c:Lo/adn;

    invoke-static {v0}, Lo/adn;->c(Lo/adn;)Landroid/bluetooth/BluetoothGatt;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 203
    const/4 v0, 0x2

    const-wide/16 v1, 0x2710

    invoke-virtual {p0, v0, v1, v2}, Lo/adn$e;->sendEmptyMessageDelayed(IJ)Z

    .line 204
    iget-object v0, p0, Lo/adn$e;->c:Lo/adn;

    iget-object v1, p0, Lo/adn$e;->c:Lo/adn;

    invoke-static {v1}, Lo/adn;->c(Lo/adn;)Landroid/bluetooth/BluetoothGatt;

    move-result-object v1

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothGatt;->discoverServices()Z

    move-result v1

    invoke-static {v0, v1}, Lo/adn;->c(Lo/adn;Z)Z

    .line 205
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Attemping to start service discovery:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/adn$e;->c:Lo/adn;

    invoke-static {v3}, Lo/adn;->e(Lo/adn;)Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 210
    :pswitch_1
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lo/adn$e;->removeMessages(I)V

    .line 211
    iget-object v0, p0, Lo/adn$e;->c:Lo/adn;

    invoke-static {v0}, Lo/adn;->b(Lo/adn;)I

    move-result v0

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    .line 212
    iget-object v0, p0, Lo/adn$e;->c:Lo/adn;

    invoke-static {v0}, Lo/adn;->a(Lo/adn;)I

    .line 213
    iget-object v0, p0, Lo/adn$e;->c:Lo/adn;

    iget-object v1, p0, Lo/adn$e;->c:Lo/adn;

    invoke-static {v1}, Lo/adn;->c(Lo/adn;)Landroid/bluetooth/BluetoothGatt;

    move-result-object v1

    iget-object v2, p0, Lo/adn$e;->c:Lo/adn;

    invoke-static {v2}, Lo/adn;->d(Lo/adn;)Lo/adn$e;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/adn;->d(Lo/adn;Landroid/bluetooth/BluetoothGatt;Lo/adn$e;)V

    .line 214
    iget-object v0, p0, Lo/adn$e;->c:Lo/adn;

    invoke-static {v0}, Lo/adn;->d(Lo/adn;)Lo/adn$e;

    move-result-object v0

    const/4 v1, 0x3

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Lo/adn$e;->sendEmptyMessageDelayed(IJ)Z

    goto/16 :goto_0

    .line 216
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HWChMeasureController Times IS OUT! The mConnectTryNum = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/adn$e;->c:Lo/adn;

    invoke-static {v3}, Lo/adn;->b(Lo/adn;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 218
    goto/16 :goto_0

    .line 221
    :pswitch_2
    iget-object v0, p0, Lo/adn$e;->c:Lo/adn;

    invoke-static {v0}, Lo/adn;->k(Lo/adn;)Lo/acg;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/acg;->a(Lo/abx;)Z

    .line 222
    goto/16 :goto_0

    .line 225
    :pswitch_3
    iget-object v0, p0, Lo/adn$e;->c:Lo/adn;

    invoke-static {v0}, Lo/adn;->f(Lo/adn;)Lo/acg;

    move-result-object v0

    invoke-virtual {v0}, Lo/acg;->d()Z

    .line 226
    goto/16 :goto_0

    .line 228
    :pswitch_4
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HWChMeasureController MSG_SYNC_DATA_DONE  mType=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/adn$e;->c:Lo/adn;

    invoke-static {v3}, Lo/adn;->g(Lo/adn;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 229
    iget-object v0, p0, Lo/adn$e;->c:Lo/adn;

    invoke-static {v0}, Lo/adn;->g(Lo/adn;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_2

    iget-object v0, p0, Lo/adn$e;->c:Lo/adn;

    invoke-static {v0}, Lo/adn;->g(Lo/adn;)I

    move-result v0

    const/4 v1, -0x2

    if-eq v0, v1, :cond_2

    .line 230
    iget-object v0, p0, Lo/adn$e;->c:Lo/adn;

    invoke-virtual {v0}, Lo/adn;->d()V

    .line 231
    iget-object v0, p0, Lo/adn$e;->c:Lo/adn;

    invoke-virtual {v0}, Lo/adn;->e()V

    goto :goto_0

    .line 235
    :pswitch_5
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->k()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 236
    iget-object v0, p0, Lo/adn$e;->c:Lo/adn;

    invoke-static {v0}, Lo/adn;->h(Lo/adn;)Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 237
    iget-object v0, p0, Lo/adn$e;->c:Lo/adn;

    invoke-static {v0}, Lo/adn;->h(Lo/adn;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lo/adn$e;->c:Lo/adn;

    invoke-static {v1}, Lo/adn;->h(Lo/adn;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_device_sync_data_done_toast:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/emv;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 238
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 239
    const-string v0, "com.huawei.health"

    const-class v1, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 240
    const-string v0, "productId"

    iget-object v1, p0, Lo/adn$e;->c:Lo/adn;

    invoke-static {v1}, Lo/adn;->i(Lo/adn;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 241
    const/high16 v0, 0x14000000

    invoke-virtual {v4, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 242
    iget-object v0, p0, Lo/adn$e;->c:Lo/adn;

    invoke-static {v0}, Lo/adn;->h(Lo/adn;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 245
    :cond_1
    iget-object v0, p0, Lo/adn$e;->c:Lo/adn;

    invoke-static {v0}, Lo/adn;->d(Lo/adn;)Lo/adn$e;

    move-result-object v0

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Lo/adn$e;->sendEmptyMessage(I)Z

    .line 246
    .line 250
    :cond_2
    :goto_0
    :pswitch_6
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method
