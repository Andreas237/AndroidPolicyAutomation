.class Lo/cxk$5;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cxk;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/cxk;


# direct methods
.method constructor <init>(Lo/cxk;)V
    .locals 0

    .line 238
    iput-object p1, p0, Lo/cxk$5;->c:Lo/cxk;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 10

    .line 241
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v5

    .line 243
    const-string v0, "android.bluetooth.device.action.FOUND"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 245
    const-string v0, "android.bluetooth.device.extra.DEVICE"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/bluetooth/BluetoothDevice;

    .line 246
    const/4 v0, 0x0

    if-eq v0, v6, :cond_1

    .line 248
    invoke-virtual {v6}, Landroid/bluetooth/BluetoothDevice;->getBondState()I

    move-result v0

    const/16 v1, 0xc

    if-eq v1, v0, :cond_1

    invoke-virtual {v6}, Landroid/bluetooth/BluetoothDevice;->getType()I

    move-result v0

    const/4 v1, 0x2

    if-eq v1, v0, :cond_1

    .line 249
    iget-object v0, p0, Lo/cxk$5;->c:Lo/cxk;

    invoke-static {v0}, Lo/cxk;->b(Lo/cxk;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 250
    invoke-static {}, Lo/cxk;->i()Ljava/lang/Object;

    move-result-object v7

    monitor-enter v7

    .line 251
    :try_start_0
    iget-object v0, p0, Lo/cxk$5;->c:Lo/cxk;

    invoke-static {v0}, Lo/cxk;->a(Lo/cxk;)Lo/cya;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 252
    iget-object v0, p0, Lo/cxk$5;->c:Lo/cxk;

    invoke-static {v0}, Lo/cxk;->a(Lo/cxk;)Lo/cya;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {v0, v6, v1, v2}, Lo/cya;->a(Landroid/bluetooth/BluetoothDevice;I[B)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 254
    :cond_0
    monitor-exit v7

    goto :goto_0

    :catchall_0
    move-exception v8

    monitor-exit v7

    throw v8

    .line 257
    :cond_1
    :goto_0
    goto/16 :goto_2

    .line 259
    :cond_2
    const-string v0, "android.bluetooth.adapter.action.DISCOVERY_FINISHED"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 260
    const-string v0, "01"

    const-string v1, "BTDeviceMgrUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter ACTION_DISCOVERY_FINISHED."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 261
    invoke-static {}, Lo/cxk;->i()Ljava/lang/Object;

    move-result-object v6

    monitor-enter v6

    .line 262
    :try_start_1
    iget-object v0, p0, Lo/cxk$5;->c:Lo/cxk;

    invoke-static {v0}, Lo/cxk;->a(Lo/cxk;)Lo/cya;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 263
    iget-object v0, p0, Lo/cxk$5;->c:Lo/cxk;

    invoke-static {v0}, Lo/cxk;->a(Lo/cxk;)Lo/cya;

    move-result-object v0

    invoke-interface {v0}, Lo/cya;->a()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 265
    :cond_3
    monitor-exit v6

    goto :goto_1

    :catchall_1
    move-exception v9

    monitor-exit v6

    throw v9

    :goto_1
    goto/16 :goto_2

    .line 268
    :cond_4
    const-string v0, "android.bluetooth.device.action.BOND_STATE_CHANGED"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 269
    const-string v0, "android.bluetooth.device.extra.DEVICE"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/bluetooth/BluetoothDevice;

    .line 270
    const/4 v0, 0x0

    if-eq v0, v6, :cond_8

    .line 271
    invoke-virtual {v6}, Landroid/bluetooth/BluetoothDevice;->getBondState()I

    move-result v0

    const/16 v1, 0xc

    if-ne v1, v0, :cond_6

    .line 273
    iget-object v0, p0, Lo/cxk$5;->c:Lo/cxk;

    invoke-static {v0}, Lo/cxk;->e(Lo/cxk;)Lo/cxz;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 274
    iget-object v0, p0, Lo/cxk$5;->c:Lo/cxk;

    invoke-static {v0}, Lo/cxk;->e(Lo/cxk;)Lo/cxz;

    move-result-object v0

    invoke-interface {v0, v6}, Lo/cxz;->a(Landroid/bluetooth/BluetoothDevice;)V

    .line 277
    :cond_5
    iget-object v0, p0, Lo/cxk$5;->c:Lo/cxk;

    invoke-static {v0}, Lo/cxk;->d(Lo/cxk;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lo/cxk$5;->c:Lo/cxk;

    invoke-static {v1}, Lo/cxk;->c(Lo/cxk;)Landroid/content/BroadcastReceiver;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    goto :goto_2

    .line 279
    :cond_6
    invoke-virtual {v6}, Landroid/bluetooth/BluetoothDevice;->getBondState()I

    move-result v0

    const/16 v1, 0xb

    if-ne v1, v0, :cond_7

    .line 281
    iget-object v0, p0, Lo/cxk$5;->c:Lo/cxk;

    invoke-static {v0}, Lo/cxk;->e(Lo/cxk;)Lo/cxz;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_8

    .line 282
    iget-object v0, p0, Lo/cxk$5;->c:Lo/cxk;

    invoke-static {v0}, Lo/cxk;->e(Lo/cxk;)Lo/cxz;

    move-result-object v0

    const/16 v1, 0xb

    invoke-interface {v0, v1}, Lo/cxz;->e(I)V

    goto :goto_2

    .line 285
    :cond_7
    invoke-virtual {v6}, Landroid/bluetooth/BluetoothDevice;->getBondState()I

    move-result v0

    const/16 v1, 0xa

    if-ne v1, v0, :cond_8

    .line 287
    iget-object v0, p0, Lo/cxk$5;->c:Lo/cxk;

    invoke-static {v0}, Lo/cxk;->e(Lo/cxk;)Lo/cxz;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_8

    .line 288
    iget-object v0, p0, Lo/cxk$5;->c:Lo/cxk;

    invoke-static {v0}, Lo/cxk;->e(Lo/cxk;)Lo/cxz;

    move-result-object v0

    const/16 v1, 0xa

    invoke-interface {v0, v1}, Lo/cxz;->a(I)V

    .line 293
    :cond_8
    :goto_2
    return-void
.end method
