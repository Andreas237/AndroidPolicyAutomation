.class Lo/cyi$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cya;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cyi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/cyi;


# direct methods
.method constructor <init>(Lo/cyi;)V
    .locals 0

    .line 249
    iput-object p1, p0, Lo/cyi$1;->b:Lo/cyi;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 8

    .line 269
    const-string v0, "01"

    const-string v1, "BLEReconnectManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "BLE reconnect device discovery finished."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 270
    iget-object v0, p0, Lo/cyi$1;->b:Lo/cyi;

    invoke-static {v0}, Lo/cyi;->e(Lo/cyi;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 272
    iget-object v0, p0, Lo/cyi$1;->b:Lo/cyi;

    iget-object v1, p0, Lo/cyi$1;->b:Lo/cyi;

    invoke-static {v1}, Lo/cyi;->e(Lo/cyi;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/cyi;->c(Lo/cyi;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 273
    const-string v0, "01"

    const-string v1, "BLEReconnectManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "User do not disable current device, so start to connect wanted device."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->a(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 275
    iget-object v0, p0, Lo/cyi$1;->b:Lo/cyi;

    invoke-static {v0}, Lo/cyi;->c(Lo/cyi;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 276
    iget-object v0, p0, Lo/cyi$1;->b:Lo/cyi;

    invoke-static {v0}, Lo/cyi;->b(Lo/cyi;)I

    move-result v0

    int-to-long v5, v0

    .line 278
    iget-object v0, p0, Lo/cyi$1;->b:Lo/cyi;

    invoke-static {v0}, Lo/cyi;->c(Lo/cyi;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lo/cyi$1;->b:Lo/cyi;

    invoke-static {v1}, Lo/cyi;->e(Lo/cyi;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v7

    .line 280
    const-string v0, "01"

    const-string v1, "BLEReconnectManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Do not find the wanted device so start a new reconnect process with delay Millis = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 281
    iget-object v0, p0, Lo/cyi$1;->b:Lo/cyi;

    invoke-static {v0}, Lo/cyi;->c(Lo/cyi;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v7, v5, v6}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 283
    invoke-static {}, Lo/dbf;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 284
    iget-object v0, p0, Lo/cyi$1;->b:Lo/cyi;

    invoke-static {v0}, Lo/cyi;->a(Lo/cyi;)V

    .line 286
    :cond_0
    goto :goto_0

    .line 287
    :cond_1
    const-string v0, "01"

    const-string v1, "BLEReconnectManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "User disabled current device, so do not need  to connect wanted device."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 290
    :cond_2
    :goto_0
    return-void
.end method

.method public a(Landroid/bluetooth/BluetoothDevice;I[B)V
    .locals 6

    .line 252
    iget-object v0, p0, Lo/cyi$1;->b:Lo/cyi;

    invoke-static {v0}, Lo/cyi;->d(Lo/cyi;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 253
    return-void

    .line 255
    :cond_0
    const/4 v0, 0x0

    if-eq v0, p1, :cond_2

    .line 257
    iget-object v0, p0, Lo/cyi$1;->b:Lo/cyi;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/cyi;->c(Lo/cyi;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 258
    const-string v0, "01"

    const-string v1, "BLEReconnectManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "onDeviceDiscovered with find device but need check."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->a(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 259
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v5

    .line 260
    iget-object v0, p0, Lo/cyi$1;->b:Lo/cyi;

    iget-object v1, p0, Lo/cyi$1;->b:Lo/cyi;

    invoke-static {v1}, Lo/cyi;->e(Lo/cyi;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, p1, v5}, Lo/cyi;->e(Lo/cyi;Ljava/lang/String;Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;)V

    .line 261
    goto :goto_0

    .line 262
    :cond_1
    const-string v0, "01"

    const-string v1, "BLEReconnectManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "User disabled current device, so do not need  to connect wanted device."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 265
    :cond_2
    :goto_0
    return-void
.end method

.method public e()V
    .locals 5

    .line 294
    const-string v0, "01"

    const-string v1, "BLEReconnectManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "BLE discovery canceled."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 295
    return-void
.end method
