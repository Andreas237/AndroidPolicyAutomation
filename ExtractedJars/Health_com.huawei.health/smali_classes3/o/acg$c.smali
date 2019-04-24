.class Lo/acg$c;
.super Landroid/bluetooth/BluetoothGattCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/acg;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field final synthetic d:Lo/acg;

.field private e:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lo/acg;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lo/acg;Lo/acg;)V
    .locals 1

    .line 354
    iput-object p1, p0, Lo/acg$c;->d:Lo/acg;

    invoke-direct {p0}, Landroid/bluetooth/BluetoothGattCallback;-><init>()V

    .line 355
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/acg$c;->e:Ljava/lang/ref/WeakReference;

    .line 356
    return-void
.end method


# virtual methods
.method public onCharacteristicChanged(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V
    .locals 8

    .line 377
    iget-object v0, p0, Lo/acg$c;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/acg;

    .line 378
    const/4 v0, 0x0

    if-eq v0, v7, :cond_0

    if-eqz p1, :cond_0

    .line 379
    invoke-static {v7}, Lo/acg;->a(Lo/acg;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lo/acg$d;

    iget-object v2, p0, Lo/acg$c;->d:Lo/acg;

    const/4 v3, 0x1

    move-object v4, p1

    move-object v5, p2

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v6}, Lo/acg$d;-><init>(Lo/acg;ILandroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 382
    :cond_0
    return-void
.end method

.method public onCharacteristicRead(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V
    .locals 8

    .line 387
    iget-object v0, p0, Lo/acg$c;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/acg;

    .line 388
    const/4 v0, 0x0

    if-eq v0, v7, :cond_0

    if-eqz p1, :cond_0

    .line 389
    invoke-static {v7}, Lo/acg;->a(Lo/acg;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lo/acg$d;

    iget-object v2, p0, Lo/acg$c;->d:Lo/acg;

    const/4 v3, 0x2

    move-object v4, p1

    move-object v5, p2

    move v6, p3

    invoke-direct/range {v1 .. v6}, Lo/acg$d;-><init>(Lo/acg;ILandroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 393
    :cond_0
    return-void
.end method

.method public onCharacteristicWrite(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V
    .locals 8

    .line 398
    iget-object v0, p0, Lo/acg$c;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/acg;

    .line 399
    const/4 v0, 0x0

    if-eq v0, v7, :cond_0

    if-eqz p1, :cond_0

    .line 400
    invoke-static {v7}, Lo/acg;->a(Lo/acg;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lo/acg$d;

    iget-object v2, p0, Lo/acg$c;->d:Lo/acg;

    const/4 v3, 0x3

    move-object v4, p1

    move-object v5, p2

    move v6, p3

    invoke-direct/range {v1 .. v6}, Lo/acg$d;-><init>(Lo/acg;ILandroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 403
    :cond_0
    return-void
.end method

.method public onConnectionStateChange(Landroid/bluetooth/BluetoothGatt;II)V
    .locals 5

    .line 360
    iget-object v0, p0, Lo/acg$c;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/acg;

    .line 361
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    if-eqz p1, :cond_0

    .line 362
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "BleDevice onConnectionStateChange :status:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",newState:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 363
    invoke-static {v4}, Lo/acg;->a(Lo/acg;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lo/acg$e;

    iget-object v2, p0, Lo/acg$c;->d:Lo/acg;

    invoke-direct {v1, v2, p1, p2, p3}, Lo/acg$e;-><init>(Lo/acg;Landroid/bluetooth/BluetoothGatt;II)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 365
    :cond_0
    return-void
.end method

.method public onDescriptorRead(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V
    .locals 8

    .line 417
    iget-object v0, p0, Lo/acg$c;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/acg;

    .line 418
    const/4 v0, 0x0

    if-eq v0, v7, :cond_0

    if-eqz p1, :cond_0

    .line 419
    invoke-static {v7}, Lo/acg;->a(Lo/acg;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lo/acg$b;

    iget-object v2, p0, Lo/acg$c;->d:Lo/acg;

    const/4 v3, 0x1

    move-object v4, p1

    move-object v5, p2

    move v6, p3

    invoke-direct/range {v1 .. v6}, Lo/acg$b;-><init>(Lo/acg;ILandroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 422
    :cond_0
    return-void
.end method

.method public onDescriptorWrite(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V
    .locals 8

    .line 407
    iget-object v0, p0, Lo/acg$c;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/acg;

    .line 408
    const/4 v0, 0x0

    if-eq v0, v7, :cond_0

    if-eqz p1, :cond_0

    .line 409
    invoke-static {v7}, Lo/acg;->a(Lo/acg;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lo/acg$b;

    iget-object v2, p0, Lo/acg$c;->d:Lo/acg;

    const/4 v3, 0x2

    move-object v4, p1

    move-object v5, p2

    move v6, p3

    invoke-direct/range {v1 .. v6}, Lo/acg$b;-><init>(Lo/acg;ILandroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 412
    :cond_0
    return-void
.end method

.method public onReadRemoteRssi(Landroid/bluetooth/BluetoothGatt;II)V
    .locals 4

    .line 434
    iget-object v0, p0, Lo/acg$c;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/acg;

    .line 435
    const/4 v0, 0x0

    if-eq v0, v3, :cond_0

    if-eqz p1, :cond_0

    .line 436
    invoke-static {v3}, Lo/acg;->a(Lo/acg;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lo/acg$a;

    iget-object v2, p0, Lo/acg$c;->d:Lo/acg;

    invoke-direct {v1, v2, p1, p2, p3}, Lo/acg$a;-><init>(Lo/acg;Landroid/bluetooth/BluetoothGatt;II)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 438
    :cond_0
    return-void
.end method

.method public onReliableWriteCompleted(Landroid/bluetooth/BluetoothGatt;I)V
    .locals 4

    .line 426
    iget-object v0, p0, Lo/acg$c;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/acg;

    .line 427
    const/4 v0, 0x0

    if-eq v0, v3, :cond_0

    if-eqz p1, :cond_0

    .line 428
    invoke-static {v3}, Lo/acg;->a(Lo/acg;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lo/acg$k;

    iget-object v2, p0, Lo/acg$c;->d:Lo/acg;

    invoke-direct {v1, v2, p1, p2}, Lo/acg$k;-><init>(Lo/acg;Landroid/bluetooth/BluetoothGatt;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 430
    :cond_0
    return-void
.end method

.method public onServicesDiscovered(Landroid/bluetooth/BluetoothGatt;I)V
    .locals 4

    .line 369
    iget-object v0, p0, Lo/acg$c;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/acg;

    .line 370
    const/4 v0, 0x0

    if-eq v0, v3, :cond_0

    if-eqz p1, :cond_0

    .line 371
    invoke-static {v3}, Lo/acg;->a(Lo/acg;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lo/acg$g;

    iget-object v2, p0, Lo/acg$c;->d:Lo/acg;

    invoke-direct {v1, v2, p1, p2}, Lo/acg$g;-><init>(Lo/acg;Landroid/bluetooth/BluetoothGatt;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 373
    :cond_0
    return-void
.end method
