.class Lo/adg$4;
.super Landroid/bluetooth/BluetoothGattCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/adg;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/adg;


# direct methods
.method constructor <init>(Lo/adg;)V
    .locals 0

    .line 245
    iput-object p1, p0, Lo/adg$4;->b:Lo/adg;

    invoke-direct {p0}, Landroid/bluetooth/BluetoothGattCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onCharacteristicChanged(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V
    .locals 7

    .line 326
    invoke-super {p0, p1, p2}, Landroid/bluetooth/BluetoothGattCallback;->onCharacteristicChanged(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V

    .line 328
    const/4 v4, 0x0

    .line 329
    iget-object v0, p0, Lo/adg$4;->b:Lo/adg;

    invoke-static {v0}, Lo/adg;->o(Lo/adg;)I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 330
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HeartRateMeasureController onCharacteristicChanged mState is disconnected"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 331
    return-void

    .line 334
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HeartRateMeasureController onCharacteristicChanged()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 335
    move-object v5, p2

    .line 336
    invoke-virtual {v5}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v6

    .line 337
    const-string v0, "00002a37-0000-1000-8000-00805f9b34fb"

    invoke-virtual {v6, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 338
    iget-object v0, p0, Lo/adg$4;->b:Lo/adg;

    invoke-static {v0}, Lo/adg;->p(Lo/adg;)Lo/adi;

    move-result-object v0

    if-nez v0, :cond_1

    .line 339
    iget-object v0, p0, Lo/adg$4;->b:Lo/adg;

    new-instance v1, Lo/adi;

    invoke-direct {v1}, Lo/adi;-><init>()V

    invoke-static {v0, v1}, Lo/adg;->e(Lo/adg;Lo/adi;)Lo/adi;

    .line 341
    :cond_1
    iget-object v0, p0, Lo/adg$4;->b:Lo/adg;

    invoke-static {v0}, Lo/adg;->p(Lo/adg;)Lo/adi;

    move-result-object v0

    invoke-virtual {v5}, Landroid/bluetooth/BluetoothGattCharacteristic;->getProperties()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/adi;->c(I)V

    .line 342
    iget-object v0, p0, Lo/adg$4;->b:Lo/adg;

    invoke-static {v0}, Lo/adg;->p(Lo/adg;)Lo/adi;

    move-result-object v0

    invoke-virtual {v5}, Landroid/bluetooth/BluetoothGattCharacteristic;->getValue()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/adi;->b([B)Lo/afz;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/aga;

    .line 343
    if-eqz v4, :cond_2

    iget-object v0, p0, Lo/adg$4;->b:Lo/adg;

    invoke-static {v0}, Lo/adg;->k(Lo/adg;)Lo/abx;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 344
    iget-object v0, p0, Lo/adg$4;->b:Lo/adg;

    invoke-static {v0}, Lo/adg;->k(Lo/adg;)Lo/abx;

    move-result-object v0

    iget-object v1, p0, Lo/adg$4;->b:Lo/adg;

    invoke-static {v1}, Lo/adg;->m(Lo/adg;)Lo/acg;

    move-result-object v1

    invoke-interface {v0, v1, v4}, Lo/abx;->onDataChanged(Lo/acl;Lo/afz;)V

    .line 347
    :cond_2
    return-void
.end method

.method public onConnectionStateChange(Landroid/bluetooth/BluetoothGatt;II)V
    .locals 4

    .line 261
    const/4 v0, 0x2

    if-ne p3, v0, :cond_0

    .line 262
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HeartRateMeasureController Connected to GATT server."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 264
    iget-object v0, p0, Lo/adg$4;->b:Lo/adg;

    invoke-static {v0, p1}, Lo/adg;->b(Lo/adg;Landroid/bluetooth/BluetoothGatt;)Landroid/bluetooth/BluetoothGatt;

    .line 265
    iget-object v0, p0, Lo/adg$4;->b:Lo/adg;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/adg;->d(Lo/adg;I)I

    .line 268
    iget-object v0, p0, Lo/adg$4;->b:Lo/adg;

    invoke-static {v0}, Lo/adg;->e(Lo/adg;)Lo/adg$e;

    move-result-object v0

    const/4 v1, 0x1

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Lo/adg$e;->sendEmptyMessageDelayed(IJ)Z

    .line 270
    iget-object v0, p0, Lo/adg$4;->b:Lo/adg;

    invoke-static {v0}, Lo/adg;->k(Lo/adg;)Lo/abx;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 271
    iget-object v0, p0, Lo/adg$4;->b:Lo/adg;

    invoke-static {v0}, Lo/adg;->k(Lo/adg;)Lo/abx;

    move-result-object v0

    iget-object v1, p0, Lo/adg$4;->b:Lo/adg;

    invoke-static {v1}, Lo/adg;->g(Lo/adg;)Lo/acg;

    move-result-object v1

    const/4 v2, 0x2

    invoke-interface {v0, v1, v2}, Lo/abx;->onStatusChanged(Lo/acl;I)V

    goto :goto_0

    .line 274
    :cond_0
    if-nez p3, :cond_2

    .line 275
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HeartRateMeasureController Disconnected from GATT server."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 277
    iget-object v0, p0, Lo/adg$4;->b:Lo/adg;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/adg;->d(Lo/adg;I)I

    .line 278
    iget-object v0, p0, Lo/adg$4;->b:Lo/adg;

    invoke-static {v0}, Lo/adg;->f(Lo/adg;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 279
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HeartRateMeasureController isFirstConnect enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 280
    iget-object v0, p0, Lo/adg$4;->b:Lo/adg;

    iget-object v1, p0, Lo/adg$4;->b:Lo/adg;

    invoke-static {v1}, Lo/adg;->d(Lo/adg;)Landroid/bluetooth/BluetoothGatt;

    move-result-object v1

    iget-object v2, p0, Lo/adg$4;->b:Lo/adg;

    invoke-static {v2}, Lo/adg;->e(Lo/adg;)Lo/adg$e;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/adg;->b(Lo/adg;Landroid/bluetooth/BluetoothGatt;Lo/adg$e;)V

    .line 281
    iget-object v0, p0, Lo/adg$4;->b:Lo/adg;

    invoke-static {v0}, Lo/adg;->e(Lo/adg;)Lo/adg$e;

    move-result-object v0

    const/4 v1, 0x4

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Lo/adg$e;->sendEmptyMessageDelayed(IJ)Z

    .line 284
    :cond_1
    iget-object v0, p0, Lo/adg$4;->b:Lo/adg;

    invoke-static {v0}, Lo/adg;->k(Lo/adg;)Lo/abx;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 285
    iget-object v0, p0, Lo/adg$4;->b:Lo/adg;

    invoke-static {v0}, Lo/adg;->k(Lo/adg;)Lo/abx;

    move-result-object v0

    iget-object v1, p0, Lo/adg$4;->b:Lo/adg;

    invoke-static {v1}, Lo/adg;->l(Lo/adg;)Lo/acg;

    move-result-object v1

    const/4 v2, 0x3

    invoke-interface {v0, v1, v2}, Lo/abx;->onStatusChanged(Lo/acl;I)V

    .line 290
    :cond_2
    :goto_0
    return-void
.end method

.method public onDescriptorWrite(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V
    .locals 4

    .line 359
    invoke-super {p0, p1, p2, p3}, Landroid/bluetooth/BluetoothGattCallback;->onDescriptorWrite(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V

    .line 360
    iget-object v0, p0, Lo/adg$4;->b:Lo/adg;

    invoke-static {v0}, Lo/adg;->o(Lo/adg;)I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 361
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HeartRateMeasureController onDescriptorWrite mState is disconnected"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 362
    return-void

    .line 364
    :cond_0
    return-void
.end method

.method public onServicesDiscovered(Landroid/bluetooth/BluetoothGatt;I)V
    .locals 4

    .line 302
    invoke-super {p0, p1, p2}, Landroid/bluetooth/BluetoothGattCallback;->onServicesDiscovered(Landroid/bluetooth/BluetoothGatt;I)V

    .line 304
    iget-object v0, p0, Lo/adg$4;->b:Lo/adg;

    invoke-static {v0}, Lo/adg;->e(Lo/adg;)Lo/adg$e;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/adg$e;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 306
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HRP onServicesDiscovered status = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 308
    iget-object v0, p0, Lo/adg$4;->b:Lo/adg;

    invoke-static {v0}, Lo/adg;->o(Lo/adg;)I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 309
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HRPController onServicesDiscovered mState is disconnected"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 310
    return-void

    .line 313
    :cond_0
    if-nez p2, :cond_1

    .line 314
    iget-object v0, p0, Lo/adg$4;->b:Lo/adg;

    const/4 v1, 0x1

    invoke-static {v0, p1, v1}, Lo/adg;->e(Lo/adg;Landroid/bluetooth/BluetoothGatt;Z)V

    .line 316
    :cond_1
    return-void
.end method
