.class Lo/cyq$1;
.super Landroid/bluetooth/BluetoothGattCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cyq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/cyq;


# direct methods
.method constructor <init>(Lo/cyq;)V
    .locals 0

    .line 415
    iput-object p1, p0, Lo/cyq$1;->d:Lo/cyq;

    invoke-direct {p0}, Landroid/bluetooth/BluetoothGattCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onCharacteristicChanged(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V
    .locals 3

    .line 541
    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getValue()[B

    move-result-object v1

    .line 542
    new-instance v2, Landroid/os/Message;

    invoke-direct {v2}, Landroid/os/Message;-><init>()V

    .line 543
    const/4 v0, 0x1

    iput v0, v2, Landroid/os/Message;->what:I

    .line 544
    iput-object v1, v2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 545
    iget-object v0, p0, Lo/cyq$1;->d:Lo/cyq;

    invoke-static {v0}, Lo/cyq;->o(Lo/cyq;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 546
    return-void
.end method

.method public onCharacteristicRead(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V
    .locals 5

    .line 523
    const/4 v0, 0x0

    if-eq v0, p3, :cond_0

    .line 524
    const-string v0, "01"

    const-string v1, "BTDeviceBLEService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Device-->SDK onCharacteristicRead error status = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 526
    :cond_0
    return-void
.end method

.method public onCharacteristicWrite(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V
    .locals 5

    .line 530
    iget-object v0, p0, Lo/cyq$1;->d:Lo/cyq;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v0, v1}, Lo/cyq;->d(Lo/cyq;Ljava/lang/Boolean;)Ljava/lang/Boolean;

    .line 531
    if-eqz p3, :cond_0

    .line 532
    const-string v0, "01"

    const-string v1, "BTDeviceBLEService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "SDK-->Device onCharacteristicWrite error status = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 535
    :cond_0
    iget-object v0, p0, Lo/cyq$1;->d:Lo/cyq;

    invoke-static {v0}, Lo/cyq;->l(Lo/cyq;)V

    .line 536
    return-void
.end method

.method public onConnectionStateChange(Landroid/bluetooth/BluetoothGatt;II)V
    .locals 6

    .line 419
    const-string v0, "DEVMGR_SETTING"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BTDeviceBLEService"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onConnectionStateChange() status = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " newState = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 421
    const/16 v0, 0x85

    if-ne v0, p2, :cond_0

    .line 423
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cxn;->c(J)V

    .line 426
    :cond_0
    iget-object v0, p0, Lo/cyq$1;->d:Lo/cyq;

    invoke-static {v0}, Lo/cyq;->a(Lo/cyq;)Landroid/bluetooth/BluetoothGatt;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 427
    const-string v0, "01"

    const-string v1, "BTDeviceBLEService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "mBluetoothGatt is null"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 428
    iget-object v0, p0, Lo/cyq$1;->d:Lo/cyq;

    invoke-static {v0, p1}, Lo/cyq;->e(Lo/cyq;Landroid/bluetooth/BluetoothGatt;)Landroid/bluetooth/BluetoothGatt;

    .line 431
    :cond_1
    const/4 v0, 0x2

    if-ne v0, p3, :cond_2

    .line 432
    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Lo/cxn;->c(J)V

    .line 434
    const-string v0, "01"

    const-string v1, "BTDeviceBLEService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Connected to GATT server."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 436
    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v0

    invoke-virtual {v0}, Lo/cxk;->e()V

    .line 438
    iget-object v0, p0, Lo/cyq$1;->d:Lo/cyq;

    invoke-static {v0}, Lo/cyq;->g(Lo/cyq;)Lo/cyq$b;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/cyq$b;->removeMessages(I)V

    .line 440
    iget-object v0, p0, Lo/cyq$1;->d:Lo/cyq;

    invoke-static {v0}, Lo/cyq;->g(Lo/cyq;)Lo/cyq$b;

    move-result-object v0

    const/4 v1, 0x2

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Lo/cyq$b;->sendEmptyMessageDelayed(IJ)Z

    goto/16 :goto_0

    .line 441
    :cond_2
    const/4 v0, 0x0

    if-ne v0, p3, :cond_5

    .line 443
    const-string v0, "01"

    const-string v1, "BTDeviceBLEService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Disconnected from GATT server."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 445
    iget-object v0, p0, Lo/cyq$1;->d:Lo/cyq;

    invoke-static {v0}, Lo/cyq;->g(Lo/cyq;)Lo/cyq$b;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/cyq$b;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 447
    iget-object v0, p0, Lo/cyq$1;->d:Lo/cyq;

    invoke-static {v0}, Lo/cyq;->i(Lo/cyq;)I

    move-result v5

    .line 448
    const-string v0, "01"

    const-string v1, "BTDeviceBLEService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "BT switch state = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " mSetNotificationFlag = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lo/cyq$1;->d:Lo/cyq;

    invoke-static {v4}, Lo/cyq;->h(Lo/cyq;)Z

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 449
    iget-object v0, p0, Lo/cyq$1;->d:Lo/cyq;

    invoke-static {v0}, Lo/cyq;->f(Lo/cyq;)Z

    move-result v0

    if-nez v0, :cond_4

    const/4 v0, 0x3

    if-ne v0, v5, :cond_4

    .line 451
    iget-object v0, p0, Lo/cyq$1;->d:Lo/cyq;

    invoke-static {v0}, Lo/cyq;->h(Lo/cyq;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 454
    iget-object v0, p0, Lo/cyq$1;->d:Lo/cyq;

    const/4 v1, 0x1

    invoke-static {v0, v1, p2}, Lo/cyq;->c(Lo/cyq;ZI)V

    goto :goto_0

    .line 458
    :cond_3
    iget-object v0, p0, Lo/cyq$1;->d:Lo/cyq;

    const/4 v1, 0x0

    invoke-static {v0, v1, p2}, Lo/cyq;->c(Lo/cyq;ZI)V

    goto :goto_0

    .line 462
    :cond_4
    const-string v0, "DEVMGR_SETTING"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BTDeviceBLEService"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " Wanted disconnect or bt switch is not on occur, so release.status:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 463
    const v0, 0xf4240

    add-int/2addr v0, p2

    invoke-static {v0}, Lo/cyc;->e(I)V

    .line 464
    iget-object v0, p0, Lo/cyq$1;->d:Lo/cyq;

    invoke-static {v0, p2}, Lo/cyq;->b(Lo/cyq;I)V

    .line 467
    :cond_5
    :goto_0
    return-void
.end method

.method public onDescriptorWrite(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V
    .locals 6

    .line 550
    const-string v0, "01"

    const-string v1, "BTDeviceBLEService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Enter onDescriptorWrite with status ="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 551
    const/4 v0, 0x0

    if-ne v0, p3, :cond_0

    .line 552
    const-string v0, "01"

    const-string v1, "BTDeviceBLEService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Notification set success."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 554
    iget-object v0, p0, Lo/cyq$1;->d:Lo/cyq;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lo/cyq;->c(I)V

    .line 556
    iget-object v0, p0, Lo/cyq$1;->d:Lo/cyq;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/cyq;->d(Lo/cyq;I)I

    goto :goto_0

    .line 559
    :cond_0
    iget-object v0, p0, Lo/cyq$1;->d:Lo/cyq;

    iget-object v1, p0, Lo/cyq$1;->d:Lo/cyq;

    invoke-static {v1}, Lo/cyq;->a(Lo/cyq;)Landroid/bluetooth/BluetoothGatt;

    move-result-object v1

    const/4 v2, 0x4

    invoke-static {v0, v1, v2}, Lo/cyq;->a(Lo/cyq;Landroid/bluetooth/BluetoothGatt;I)Z

    move-result v5

    .line 560
    const-string v0, "01"

    const-string v1, "BTDeviceBLEService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "refreshResult = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 562
    :goto_0
    return-void
.end method

.method public onServicesDiscovered(Landroid/bluetooth/BluetoothGatt;I)V
    .locals 9

    .line 471
    const-string v0, "01"

    const-string v1, "BTDeviceBLEService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "onServicesDiscovered() status = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 472
    iget-object v0, p0, Lo/cyq$1;->d:Lo/cyq;

    invoke-static {v0}, Lo/cyq;->a(Lo/cyq;)Landroid/bluetooth/BluetoothGatt;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 473
    const-string v0, "01"

    const-string v1, "BTDeviceBLEService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "mBluetoothGatt is null"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 475
    iget-object v0, p0, Lo/cyq$1;->d:Lo/cyq;

    const/4 v1, 0x0

    const/4 v2, -0x1

    invoke-static {v0, v1, v2}, Lo/cyq;->c(Lo/cyq;ZI)V

    .line 476
    return-void

    .line 479
    :cond_0
    const/4 v0, 0x0

    if-ne v0, p2, :cond_3

    .line 480
    const-string v0, "01"

    const-string v1, "BTDeviceBLEService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Service discover success."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 482
    iget-object v0, p0, Lo/cyq$1;->d:Lo/cyq;

    invoke-static {v0}, Lo/cyq;->g(Lo/cyq;)Lo/cyq$b;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/cyq$b;->removeMessages(I)V

    .line 484
    iget-object v0, p0, Lo/cyq$1;->d:Lo/cyq;

    invoke-static {v0}, Lo/cyq;->a(Lo/cyq;)Landroid/bluetooth/BluetoothGatt;

    move-result-object v0

    const-string v1, "0000fe86-0000-1000-8000-00805f9b34fb"

    invoke-static {v1}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/bluetooth/BluetoothGatt;->getService(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattService;

    move-result-object v5

    .line 485
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    .line 486
    const-string v0, "01"

    const-string v1, "BTDeviceBLEService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "BLE GATT Service UUID find success."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 488
    iget-object v0, p0, Lo/cyq$1;->d:Lo/cyq;

    iget-object v6, v0, Lo/cyq;->c:Ljava/lang/Object;

    monitor-enter v6

    .line 489
    :try_start_0
    iget-object v0, p0, Lo/cyq$1;->d:Lo/cyq;

    const-string v1, "0000fe01-0000-1000-8000-00805f9b34fb"

    invoke-static {v1}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v5, v1}, Landroid/bluetooth/BluetoothGattService;->getCharacteristic(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v1

    invoke-static {v0, v1}, Lo/cyq;->d(Lo/cyq;Landroid/bluetooth/BluetoothGattCharacteristic;)Landroid/bluetooth/BluetoothGattCharacteristic;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 490
    monitor-exit v6

    goto :goto_0

    :catchall_0
    move-exception v7

    monitor-exit v6

    throw v7

    .line 492
    :goto_0
    iget-object v0, p0, Lo/cyq$1;->d:Lo/cyq;

    const-string v1, "0000fe02-0000-1000-8000-00805f9b34fb"

    invoke-static {v1}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v5, v1}, Landroid/bluetooth/BluetoothGattService;->getCharacteristic(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v1

    invoke-static {v0, v1}, Lo/cyq;->e(Lo/cyq;Landroid/bluetooth/BluetoothGattCharacteristic;)Landroid/bluetooth/BluetoothGattCharacteristic;

    .line 494
    iget-object v0, p0, Lo/cyq$1;->d:Lo/cyq;

    invoke-static {v0}, Lo/cyq;->k(Lo/cyq;)V

    goto/16 :goto_2

    .line 496
    :cond_1
    iget-object v0, p0, Lo/cyq$1;->d:Lo/cyq;

    invoke-static {v0}, Lo/cyq;->a(Lo/cyq;)Landroid/bluetooth/BluetoothGatt;

    move-result-object v0

    const-string v1, "00000200-0000-1000-8000-00805F9B34FB"

    invoke-static {v1}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/bluetooth/BluetoothGatt;->getService(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattService;

    move-result-object v5

    .line 497
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    .line 498
    const-string v0, "01"

    const-string v1, "BTDeviceBLEService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "B0 GATT Service UUID find success."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 500
    iget-object v0, p0, Lo/cyq$1;->d:Lo/cyq;

    iget-object v6, v0, Lo/cyq;->c:Ljava/lang/Object;

    monitor-enter v6

    .line 501
    :try_start_1
    iget-object v0, p0, Lo/cyq$1;->d:Lo/cyq;

    const-string v1, "00000203-0000-1000-8000-00805F9B34FB"

    invoke-static {v1}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v5, v1}, Landroid/bluetooth/BluetoothGattService;->getCharacteristic(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v1

    invoke-static {v0, v1}, Lo/cyq;->d(Lo/cyq;Landroid/bluetooth/BluetoothGattCharacteristic;)Landroid/bluetooth/BluetoothGattCharacteristic;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 502
    monitor-exit v6

    goto :goto_1

    :catchall_1
    move-exception v8

    monitor-exit v6

    throw v8

    .line 504
    :goto_1
    iget-object v0, p0, Lo/cyq$1;->d:Lo/cyq;

    const-string v1, "00000202-0000-1000-8000-00805F9B34FB"

    invoke-static {v1}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v5, v1}, Landroid/bluetooth/BluetoothGattService;->getCharacteristic(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v1

    invoke-static {v0, v1}, Lo/cyq;->e(Lo/cyq;Landroid/bluetooth/BluetoothGattCharacteristic;)Landroid/bluetooth/BluetoothGattCharacteristic;

    .line 506
    iget-object v0, p0, Lo/cyq$1;->d:Lo/cyq;

    invoke-static {v0}, Lo/cyq;->k(Lo/cyq;)V

    goto :goto_2

    .line 509
    :cond_2
    const-string v0, "01"

    const-string v1, "BTDeviceBLEService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Do not match any Service UUID."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 511
    iget-object v0, p0, Lo/cyq$1;->d:Lo/cyq;

    iget-object v1, p0, Lo/cyq$1;->d:Lo/cyq;

    invoke-static {v1}, Lo/cyq;->a(Lo/cyq;)Landroid/bluetooth/BluetoothGatt;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lo/cyq;->a(Lo/cyq;Landroid/bluetooth/BluetoothGatt;I)Z

    .line 514
    :goto_2
    goto :goto_3

    .line 515
    :cond_3
    const-string v0, "01"

    const-string v1, "BTDeviceBLEService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Service discover fail."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 517
    iget-object v0, p0, Lo/cyq$1;->d:Lo/cyq;

    iget-object v1, p0, Lo/cyq$1;->d:Lo/cyq;

    invoke-static {v1}, Lo/cyq;->a(Lo/cyq;)Landroid/bluetooth/BluetoothGatt;

    move-result-object v1

    const/4 v2, 0x3

    invoke-static {v0, v1, v2}, Lo/cyq;->a(Lo/cyq;Landroid/bluetooth/BluetoothGatt;I)Z

    .line 519
    :goto_3
    return-void
.end method
