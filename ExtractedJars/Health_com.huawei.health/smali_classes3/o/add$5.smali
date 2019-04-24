.class Lo/add$5;
.super Landroid/bluetooth/BluetoothGattCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/add;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/add;


# direct methods
.method constructor <init>(Lo/add;)V
    .locals 0

    .line 206
    iput-object p1, p0, Lo/add$5;->a:Lo/add;

    invoke-direct {p0}, Landroid/bluetooth/BluetoothGattCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onCharacteristicChanged(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V
    .locals 9

    .line 324
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "GlucoseMeasureController onCharacteristicChanged()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 325
    invoke-super {p0, p1, p2}, Landroid/bluetooth/BluetoothGattCallback;->onCharacteristicChanged(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V

    .line 327
    iget-object v0, p0, Lo/add$5;->a:Lo/add;

    invoke-static {v0}, Lo/add;->k(Lo/add;)I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 328
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCharacteristicChanged mState is disconnected"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 329
    return-void

    .line 332
    :cond_0
    move-object v4, p2

    .line 333
    invoke-virtual {v4}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v5

    .line 334
    iget-object v0, p0, Lo/add$5;->a:Lo/add;

    invoke-virtual {v4}, Landroid/bluetooth/BluetoothGattCharacteristic;->getValue()[B

    move-result-object v1

    invoke-static {v0, v1}, Lo/add;->b(Lo/add;[B)Ljava/lang/String;

    move-result-object v6

    .line 335
    const/4 v7, 0x0

    .line 336
    const-string v0, "00002A18-0000-1000-8000-00805f9b34fb"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 338
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "charact_id.equalsIgnoreCase(CHARACTERISTIC_GLUCOSE_MEASUREMENT)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 340
    iget-object v0, p0, Lo/add$5;->a:Lo/add;

    invoke-static {v0}, Lo/add;->p(Lo/add;)Lo/adb;

    move-result-object v0

    if-eqz v0, :cond_9

    .line 341
    iget-object v0, p0, Lo/add$5;->a:Lo/add;

    invoke-static {v0}, Lo/add;->p(Lo/add;)Lo/adb;

    move-result-object v0

    invoke-virtual {v4}, Landroid/bluetooth/BluetoothGattCharacteristic;->getValue()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/adb;->a([B)Lo/afz;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/afy;

    .line 342
    const/4 v8, 0x0

    .line 343
    if-eqz v7, :cond_7

    .line 344
    invoke-virtual {v7}, Lo/afy;->b()I

    move-result v8

    .line 345
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "GlucoseMeasureController current sequenceNumber is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 346
    iget-object v0, p0, Lo/add$5;->a:Lo/add;

    invoke-static {v0}, Lo/add;->c(Lo/add;)I

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/add$5;->a:Lo/add;

    invoke-static {v0}, Lo/add;->c(Lo/add;)I

    move-result v0

    if-le v8, v0, :cond_6

    .line 347
    :cond_1
    iget-object v0, p0, Lo/add$5;->a:Lo/add;

    iget-boolean v0, v0, Lo/add;->c:Z

    if-eqz v0, :cond_3

    .line 349
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "GlucoseMeasureController current sequenceNumber is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",\u672c\u6b21\u6d4b\u91cf"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 350
    iget-object v0, p0, Lo/add$5;->a:Lo/add;

    invoke-static {v0}, Lo/add;->d(Lo/add;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 351
    iget-object v0, p0, Lo/add$5;->a:Lo/add;

    invoke-static {v0, v8}, Lo/add;->e(Lo/add;I)I

    .line 352
    iget-object v0, p0, Lo/add$5;->a:Lo/add;

    invoke-static {v0}, Lo/add;->d(Lo/add;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 353
    iget-object v0, p0, Lo/add$5;->a:Lo/add;

    invoke-static {v0}, Lo/add;->r(Lo/add;)I

    move-result v0

    if-eqz v0, :cond_2

    .line 354
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "GlucoseMeasureController refreshedSequenceNumber is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/add$5;->a:Lo/add;

    invoke-static {v3}, Lo/add;->r(Lo/add;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 355
    iget-object v0, p0, Lo/add$5;->a:Lo/add;

    invoke-static {v0}, Lo/add;->e(Lo/add;)Lo/afi;

    move-result-object v0

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lo/add$5;->a:Lo/add;

    invoke-static {v2}, Lo/add;->b(Lo/add;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lo/add$5;->a:Lo/add;

    invoke-static {v3}, Lo/add;->r(Lo/add;)I

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Lo/afi;->e(Landroid/content/Context;Ljava/lang/String;I)V

    .line 357
    :cond_2
    iget-object v0, p0, Lo/add$5;->a:Lo/add;

    invoke-static {v0}, Lo/add;->f(Lo/add;)Lo/abx;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 358
    iget-object v0, p0, Lo/add$5;->a:Lo/add;

    invoke-static {v0}, Lo/add;->f(Lo/add;)Lo/abx;

    move-result-object v0

    iget-object v1, p0, Lo/add$5;->a:Lo/add;

    invoke-static {v1}, Lo/add;->s(Lo/add;)Lo/acg;

    move-result-object v1

    iget-object v2, p0, Lo/add$5;->a:Lo/add;

    invoke-static {v2}, Lo/add;->d(Lo/add;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/abx;->onDataChanged(Lo/acl;Ljava/util/List;)V

    goto/16 :goto_0

    .line 360
    :cond_3
    iget-object v0, p0, Lo/add$5;->a:Lo/add;

    iget v0, v0, Lo/add;->a:I

    if-eqz v0, :cond_5

    iget-object v0, p0, Lo/add$5;->a:Lo/add;

    iget v0, v0, Lo/add;->a:I

    add-int/lit8 v0, v0, 0x1

    if-eq v8, v0, :cond_5

    .line 362
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "GlucoseMeasureController refreshedSequenceNumber is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/add$5;->a:Lo/add;

    invoke-static {v3}, Lo/add;->r(Lo/add;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",lastNumber:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/add$5;->a:Lo/add;

    iget v3, v3, Lo/add;->a:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",sequenceNumber:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 363
    iget-object v0, p0, Lo/add$5;->a:Lo/add;

    invoke-static {v0}, Lo/add;->d(Lo/add;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 364
    iget-object v0, p0, Lo/add$5;->a:Lo/add;

    invoke-static {v0}, Lo/add;->r(Lo/add;)I

    move-result v0

    if-eqz v0, :cond_4

    .line 365
    iget-object v0, p0, Lo/add$5;->a:Lo/add;

    invoke-static {v0}, Lo/add;->e(Lo/add;)Lo/afi;

    move-result-object v0

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lo/add$5;->a:Lo/add;

    invoke-static {v2}, Lo/add;->b(Lo/add;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lo/add$5;->a:Lo/add;

    invoke-static {v3}, Lo/add;->r(Lo/add;)I

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Lo/afi;->e(Landroid/content/Context;Ljava/lang/String;I)V

    .line 367
    :cond_4
    iget-object v0, p0, Lo/add$5;->a:Lo/add;

    invoke-static {v0}, Lo/add;->f(Lo/add;)Lo/abx;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 368
    iget-object v0, p0, Lo/add$5;->a:Lo/add;

    invoke-static {v0}, Lo/add;->f(Lo/add;)Lo/abx;

    move-result-object v0

    iget-object v1, p0, Lo/add$5;->a:Lo/add;

    invoke-static {v1}, Lo/add;->t(Lo/add;)Lo/acg;

    move-result-object v1

    iget-object v2, p0, Lo/add$5;->a:Lo/add;

    invoke-static {v2}, Lo/add;->d(Lo/add;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/abx;->onDataChanged(Lo/acl;Ljava/util/List;)V

    goto :goto_0

    .line 372
    :cond_5
    iget-object v0, p0, Lo/add$5;->a:Lo/add;

    invoke-static {v0, v8}, Lo/add;->e(Lo/add;I)I

    .line 373
    iget-object v0, p0, Lo/add$5;->a:Lo/add;

    invoke-static {v0}, Lo/add;->d(Lo/add;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 374
    iget-object v0, p0, Lo/add$5;->a:Lo/add;

    invoke-static {v0}, Lo/add;->r(Lo/add;)I

    move-result v0

    if-eqz v0, :cond_6

    .line 375
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "GlucoseMeasureController refreshedSequenceNumber is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/add$5;->a:Lo/add;

    invoke-static {v3}, Lo/add;->r(Lo/add;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 376
    iget-object v0, p0, Lo/add$5;->a:Lo/add;

    invoke-static {v0}, Lo/add;->e(Lo/add;)Lo/afi;

    move-result-object v0

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lo/add$5;->a:Lo/add;

    invoke-static {v2}, Lo/add;->b(Lo/add;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lo/add$5;->a:Lo/add;

    invoke-static {v3}, Lo/add;->r(Lo/add;)I

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Lo/afi;->e(Landroid/content/Context;Ljava/lang/String;I)V

    .line 380
    :cond_6
    :goto_0
    iget-object v0, p0, Lo/add$5;->a:Lo/add;

    iput v8, v0, Lo/add;->a:I

    .line 382
    :cond_7
    goto :goto_1

    .line 385
    :cond_8
    const-string v0, "00002A52-0000-1000-8000-00805f9b34fb"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 387
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "GlucoseMeasureController charact_id.equalsIgnoreCase(CHARACTERISTIC_RECORD_ACCESS_CONTROL_POINT)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 389
    const-string v0, "06000101"

    invoke-virtual {v6, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 390
    iget-object v0, p0, Lo/add$5;->a:Lo/add;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lo/add;->c:Z

    .line 392
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "GlucoseMeasureController data has been completely transferred "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/add$5;->a:Lo/add;

    invoke-static {v3}, Lo/add;->d(Lo/add;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 394
    iget-object v0, p0, Lo/add$5;->a:Lo/add;

    invoke-static {v0}, Lo/add;->f(Lo/add;)Lo/abx;

    move-result-object v0

    if-eqz v0, :cond_9

    .line 395
    iget-object v0, p0, Lo/add$5;->a:Lo/add;

    invoke-static {v0}, Lo/add;->f(Lo/add;)Lo/abx;

    move-result-object v0

    iget-object v1, p0, Lo/add$5;->a:Lo/add;

    invoke-static {v1}, Lo/add;->q(Lo/add;)Lo/acg;

    move-result-object v1

    iget-object v2, p0, Lo/add$5;->a:Lo/add;

    invoke-static {v2}, Lo/add;->d(Lo/add;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/abx;->onDataChanged(Lo/acl;Ljava/util/List;)V

    .line 399
    :cond_9
    :goto_1
    return-void
.end method

.method public onCharacteristicWrite(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V
    .locals 5

    .line 304
    invoke-super {p0, p1, p2, p3}, Landroid/bluetooth/BluetoothGattCallback;->onCharacteristicWrite(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V

    .line 305
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " onCharacteristicWrite status:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " descriptor:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 306
    iget-object v0, p0, Lo/add$5;->a:Lo/add;

    invoke-static {v0}, Lo/add;->o(Lo/add;)Lo/aes;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 308
    :cond_0
    if-nez p3, :cond_1

    .line 309
    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v4

    .line 310
    const-string v0, "00002a2b-0000-1000-8000-00805f9b34fb"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 313
    iget-object v0, p0, Lo/add$5;->a:Lo/add;

    invoke-static {v0}, Lo/add;->n(Lo/add;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [B

    invoke-virtual {v0, v1}, Landroid/bluetooth/BluetoothGattCharacteristic;->setValue([B)Z

    .line 314
    iget-object v0, p0, Lo/add$5;->a:Lo/add;

    invoke-static {v0}, Lo/add;->n(Lo/add;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v0

    const/4 v1, 0x1

    const/16 v2, 0x11

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/bluetooth/BluetoothGattCharacteristic;->setValue(III)Z

    .line 315
    iget-object v0, p0, Lo/add$5;->a:Lo/add;

    invoke-static {v0}, Lo/add;->n(Lo/add;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v0

    const/4 v1, 0x1

    const/16 v2, 0x11

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Landroid/bluetooth/BluetoothGattCharacteristic;->setValue(III)Z

    .line 317
    iget-object v0, p0, Lo/add$5;->a:Lo/add;

    invoke-static {v0}, Lo/add;->a(Lo/add;)Landroid/bluetooth/BluetoothGatt;

    move-result-object v0

    iget-object v1, p0, Lo/add$5;->a:Lo/add;

    invoke-static {v1}, Lo/add;->n(Lo/add;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/bluetooth/BluetoothGatt;->writeCharacteristic(Landroid/bluetooth/BluetoothGattCharacteristic;)Z

    .line 320
    :cond_1
    return-void
.end method

.method public onConnectionStateChange(Landroid/bluetooth/BluetoothGatt;II)V
    .locals 4

    .line 221
    const/4 v0, 0x2

    if-ne p3, v0, :cond_0

    .line 222
    iget-object v0, p0, Lo/add$5;->a:Lo/add;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lo/add;->c:Z

    .line 223
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "GlucoseMeasureController Connected to GATT server."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 225
    iget-object v0, p0, Lo/add$5;->a:Lo/add;

    iget-object v1, p0, Lo/add$5;->a:Lo/add;

    invoke-static {v1}, Lo/add;->e(Lo/add;)Lo/afi;

    move-result-object v1

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v2

    iget-object v3, p0, Lo/add$5;->a:Lo/add;

    invoke-static {v3}, Lo/add;->b(Lo/add;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lo/afi;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    invoke-static {v0, v1}, Lo/add;->b(Lo/add;I)I

    .line 226
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "GlucoseMeasureController newestSequenceNumberInDB is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/add$5;->a:Lo/add;

    invoke-static {v3}, Lo/add;->c(Lo/add;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 227
    iget-object v0, p0, Lo/add$5;->a:Lo/add;

    invoke-static {v0}, Lo/add;->d(Lo/add;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 229
    iget-object v0, p0, Lo/add$5;->a:Lo/add;

    invoke-static {v0, p1}, Lo/add;->c(Lo/add;Landroid/bluetooth/BluetoothGatt;)Landroid/bluetooth/BluetoothGatt;

    .line 230
    iget-object v0, p0, Lo/add$5;->a:Lo/add;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/add;->c(Lo/add;I)I

    .line 231
    iget-object v0, p0, Lo/add$5;->a:Lo/add;

    invoke-static {v0}, Lo/add;->a(Lo/add;)Landroid/bluetooth/BluetoothGatt;

    move-result-object v0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothGatt;->discoverServices()Z

    .line 233
    iget-object v0, p0, Lo/add$5;->a:Lo/add;

    invoke-static {v0}, Lo/add;->f(Lo/add;)Lo/abx;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 234
    iget-object v0, p0, Lo/add$5;->a:Lo/add;

    invoke-static {v0}, Lo/add;->f(Lo/add;)Lo/abx;

    move-result-object v0

    iget-object v1, p0, Lo/add$5;->a:Lo/add;

    invoke-static {v1}, Lo/add;->g(Lo/add;)Lo/acg;

    move-result-object v1

    const/4 v2, 0x2

    invoke-interface {v0, v1, v2}, Lo/abx;->onStatusChanged(Lo/acl;I)V

    goto :goto_0

    .line 237
    :cond_0
    if-nez p3, :cond_1

    .line 240
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "GlucoseMeasureController Disconnected from GATT server."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 241
    iget-object v0, p0, Lo/add$5;->a:Lo/add;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/add;->c(Lo/add;I)I

    .line 243
    iget-object v0, p0, Lo/add$5;->a:Lo/add;

    invoke-virtual {v0}, Lo/add;->d()V

    .line 245
    iget-object v0, p0, Lo/add$5;->a:Lo/add;

    invoke-static {v0}, Lo/add;->f(Lo/add;)Lo/abx;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 246
    iget-object v0, p0, Lo/add$5;->a:Lo/add;

    invoke-static {v0}, Lo/add;->f(Lo/add;)Lo/abx;

    move-result-object v0

    iget-object v1, p0, Lo/add$5;->a:Lo/add;

    invoke-static {v1}, Lo/add;->h(Lo/add;)Lo/acg;

    move-result-object v1

    const/4 v2, 0x3

    invoke-interface {v0, v1, v2}, Lo/abx;->onStatusChanged(Lo/acl;I)V

    .line 250
    :cond_1
    :goto_0
    return-void
.end method

.method public onDescriptorWrite(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V
    .locals 7

    .line 405
    invoke-super {p0, p1, p2, p3}, Landroid/bluetooth/BluetoothGattCallback;->onDescriptorWrite(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V

    .line 406
    iget-object v0, p0, Lo/add$5;->a:Lo/add;

    invoke-static {v0}, Lo/add;->k(Lo/add;)I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 408
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "GlucoseMeasureController onDescriptorWrite mState is disconnected"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 409
    return-void

    .line 411
    :cond_0
    if-eqz p2, :cond_6

    .line 413
    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattDescriptor;->getCharacteristic()Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v4

    .line 414
    if-nez p3, :cond_6

    .line 416
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "GlucoseMeasureController onDescriptorWrite mState:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 417
    const-string v0, "00002A18-0000-1000-8000-00805f9b34fb"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 419
    iget-object v0, p0, Lo/add$5;->a:Lo/add;

    invoke-static {v0}, Lo/add;->o(Lo/add;)Lo/aes;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/aes;->a(Ljava/lang/Object;)V

    .line 420
    iget-object v0, p0, Lo/add$5;->a:Lo/add;

    iget-object v1, p0, Lo/add$5;->a:Lo/add;

    invoke-static {v1}, Lo/add;->a(Lo/add;)Landroid/bluetooth/BluetoothGatt;

    move-result-object v1

    iget-object v2, p0, Lo/add$5;->a:Lo/add;

    invoke-static {v2}, Lo/add;->n(Lo/add;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/add;->e(Lo/add;Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;Z)V

    goto/16 :goto_1

    .line 422
    :cond_1
    const-string v0, "00002A52-0000-1000-8000-00805f9b34fb"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 425
    const-string v0, "00001805-0000-1000-8000-00805f9b34fb"

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/bluetooth/BluetoothGatt;->getService(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattService;

    move-result-object v5

    .line 426
    if-eqz v5, :cond_3

    .line 427
    iget-object v0, p0, Lo/add$5;->a:Lo/add;

    const-string v1, "00002a2b-0000-1000-8000-00805f9b34fb"

    invoke-static {v1}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v5, v1}, Landroid/bluetooth/BluetoothGattService;->getCharacteristic(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v1

    invoke-static {v0, v1}, Lo/add;->d(Lo/add;Landroid/bluetooth/BluetoothGattCharacteristic;)Landroid/bluetooth/BluetoothGattCharacteristic;

    .line 428
    iget-object v0, p0, Lo/add$5;->a:Lo/add;

    invoke-static {v0}, Lo/add;->u(Lo/add;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 429
    iget-object v0, p0, Lo/add$5;->a:Lo/add;

    invoke-static {v0}, Lo/add;->u(Lo/add;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Landroid/bluetooth/BluetoothGatt;->setCharacteristicNotification(Landroid/bluetooth/BluetoothGattCharacteristic;Z)Z

    .line 430
    iget-object v0, p0, Lo/add$5;->a:Lo/add;

    invoke-static {v0}, Lo/add;->u(Lo/add;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v0

    const-string v1, "00002902-0000-1000-8000-00805f9b34fb"

    invoke-static {v1}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/bluetooth/BluetoothGattCharacteristic;->getDescriptor(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattDescriptor;

    move-result-object v6

    .line 431
    if-eqz v6, :cond_2

    .line 432
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "GlucoseMeasureController ENABLE_TIME_NOTIFICATION_VALUE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 433
    sget-object v0, Landroid/bluetooth/BluetoothGattDescriptor;->ENABLE_NOTIFICATION_VALUE:[B

    invoke-virtual {v6, v0}, Landroid/bluetooth/BluetoothGattDescriptor;->setValue([B)Z

    .line 434
    invoke-virtual {p1, v6}, Landroid/bluetooth/BluetoothGatt;->writeDescriptor(Landroid/bluetooth/BluetoothGattDescriptor;)Z

    .line 436
    :cond_2
    goto :goto_0

    .line 440
    :cond_3
    iget-object v0, p0, Lo/add$5;->a:Lo/add;

    invoke-static {v0}, Lo/add;->n(Lo/add;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [B

    invoke-virtual {v0, v1}, Landroid/bluetooth/BluetoothGattCharacteristic;->setValue([B)Z

    .line 441
    iget-object v0, p0, Lo/add$5;->a:Lo/add;

    invoke-static {v0}, Lo/add;->n(Lo/add;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v0

    const/4 v1, 0x1

    const/16 v2, 0x11

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/bluetooth/BluetoothGattCharacteristic;->setValue(III)Z

    .line 442
    iget-object v0, p0, Lo/add$5;->a:Lo/add;

    invoke-static {v0}, Lo/add;->n(Lo/add;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v0

    const/4 v1, 0x1

    const/16 v2, 0x11

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Landroid/bluetooth/BluetoothGattCharacteristic;->setValue(III)Z

    .line 443
    iget-object v0, p0, Lo/add$5;->a:Lo/add;

    invoke-static {v0}, Lo/add;->a(Lo/add;)Landroid/bluetooth/BluetoothGatt;

    move-result-object v0

    iget-object v1, p0, Lo/add$5;->a:Lo/add;

    invoke-static {v1}, Lo/add;->n(Lo/add;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/bluetooth/BluetoothGatt;->writeCharacteristic(Landroid/bluetooth/BluetoothGattCharacteristic;)Z

    .line 444
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "GlucoseMeasureController onDescriptorWrite NO_SERVICE_CURRENT_TIME"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 447
    :cond_4
    :goto_0
    goto :goto_1

    .line 448
    :cond_5
    const-string v0, "00002a2b-0000-1000-8000-00805f9b34fb"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 450
    iget-object v0, p0, Lo/add$5;->a:Lo/add;

    invoke-virtual {v0}, Lo/add;->a()V

    .line 454
    :cond_6
    :goto_1
    return-void
.end method

.method public onServicesDiscovered(Landroid/bluetooth/BluetoothGatt;I)V
    .locals 6

    .line 262
    invoke-super {p0, p1, p2}, Landroid/bluetooth/BluetoothGattCallback;->onServicesDiscovered(Landroid/bluetooth/BluetoothGatt;I)V

    .line 264
    iget-object v0, p0, Lo/add$5;->a:Lo/add;

    invoke-static {v0}, Lo/add;->k(Lo/add;)I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 265
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "GlucoseMeasureController onServicesDiscovered mState is disconnected"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 266
    return-void

    .line 269
    :cond_0
    move-object v4, p1

    .line 270
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "GlucoseMeasureController onServicesDiscovered status = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 271
    if-nez p2, :cond_2

    .line 272
    iget-object v0, p0, Lo/add$5;->a:Lo/add;

    const-string v1, "00001808-0000-1000-8000-00805f9b34fb"

    invoke-static {v1}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v4, v1}, Landroid/bluetooth/BluetoothGatt;->getService(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattService;

    move-result-object v1

    invoke-static {v0, v1}, Lo/add;->b(Lo/add;Landroid/bluetooth/BluetoothGattService;)Landroid/bluetooth/BluetoothGattService;

    .line 273
    iget-object v0, p0, Lo/add$5;->a:Lo/add;

    invoke-static {v0}, Lo/add;->i(Lo/add;)Landroid/bluetooth/BluetoothGattService;

    move-result-object v0

    if-nez v0, :cond_1

    .line 274
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "failed to get service"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 275
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 276
    const-string v0, "measureKitId"

    iget-object v1, p0, Lo/add$5;->a:Lo/add;

    invoke-static {v1}, Lo/add;->m(Lo/add;)Lo/acg;

    move-result-object v1

    invoke-virtual {v1}, Lo/acg;->k()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 277
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "No GATT service found."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const v2, 0x3611a8db

    const/4 v3, 0x0

    invoke-static {v2, v0, v5, v3, v1}, Lo/dho;->e(ILjava/lang/String;Landroid/os/Bundle;Z[Ljava/lang/Object;)V

    .line 278
    return-void

    .line 287
    :cond_1
    iget-object v0, p0, Lo/add$5;->a:Lo/add;

    invoke-static {v0}, Lo/add;->l(Lo/add;)Lo/aeo;

    move-result-object v0

    new-instance v1, Lo/aer;

    sget-object v2, Lo/aeo$a;->k:Lo/aeo$a;

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lo/aer;-><init>(Lo/aeo$a;[B)V

    invoke-virtual {v0, v1}, Lo/aeo;->e(Lo/aer;)V

    .line 288
    iget-object v0, p0, Lo/add$5;->a:Lo/add;

    invoke-static {v0}, Lo/add;->l(Lo/add;)Lo/aeo;

    move-result-object v0

    invoke-virtual {v0}, Lo/aeo;->c()V

    goto :goto_0

    .line 290
    :cond_2
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "GlucoseMeasureController onServicesDiscovered received: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 293
    :goto_0
    return-void
.end method
