.class Lo/ael$1;
.super Landroid/bluetooth/BluetoothGattCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ael;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private b:Landroid/bluetooth/BluetoothGatt;

.field final synthetic c:Lo/ael;

.field private d:I


# direct methods
.method constructor <init>(Lo/ael;)V
    .locals 0

    .line 169
    iput-object p1, p0, Lo/ael$1;->c:Lo/ael;

    invoke-direct {p0}, Landroid/bluetooth/BluetoothGattCallback;-><init>()V

    return-void
.end method

.method static synthetic d(Lo/ael$1;)Landroid/bluetooth/BluetoothGatt;
    .locals 1

    .line 169
    iget-object v0, p0, Lo/ael$1;->b:Landroid/bluetooth/BluetoothGatt;

    return-object v0
.end method


# virtual methods
.method public onCharacteristicChanged(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V
    .locals 9

    .line 226
    invoke-super {p0, p1, p2}, Landroid/bluetooth/BluetoothGattCallback;->onCharacteristicChanged(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V

    .line 227
    iget v0, p0, Lo/ael$1;->d:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 228
    return-void

    .line 231
    :cond_0
    move-object v4, p2

    .line 232
    invoke-virtual {v4}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v5

    .line 233
    const-string v0, "0000fff2-0000-1000-8000-00805f9b34fb"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 234
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "PicoocMeasureController \u5199\u6570\u636e"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Landroid/bluetooth/BluetoothGattCharacteristic;->getValue()[B

    move-result-object v3

    invoke-static {v3}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 235
    :cond_1
    const-string v0, "0000fff1-0000-1000-8000-00805f9b34fb"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 236
    invoke-virtual {v4}, Landroid/bluetooth/BluetoothGattCharacteristic;->getValue()[B

    move-result-object v6

    .line 237
    array-length v0, v6

    if-lez v0, :cond_5

    .line 238
    invoke-static {v6}, Lcom/picooc/health/formula/Formula;->d([B)[B

    move-result-object v7

    .line 239
    if-eqz v7, :cond_2

    array-length v0, v7

    if-lez v0, :cond_2

    iget-object v0, p0, Lo/ael$1;->c:Lo/ael;

    invoke-static {v0}, Lo/ael;->c(Lo/ael;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lo/ael$1;->b:Landroid/bluetooth/BluetoothGatt;

    if-eqz v0, :cond_2

    .line 241
    iget-object v0, p0, Lo/ael$1;->c:Lo/ael;

    invoke-static {v0}, Lo/ael;->c(Lo/ael;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/bluetooth/BluetoothGattCharacteristic;->setValue([B)Z

    .line 242
    iget-object v0, p0, Lo/ael$1;->b:Landroid/bluetooth/BluetoothGatt;

    iget-object v1, p0, Lo/ael$1;->c:Lo/ael;

    invoke-static {v1}, Lo/ael;->c(Lo/ael;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/bluetooth/BluetoothGatt;->writeCharacteristic(Landroid/bluetooth/BluetoothGattCharacteristic;)Z

    .line 244
    :cond_2
    iget-object v0, p0, Lo/ael$1;->c:Lo/ael;

    invoke-static {v0}, Lo/ael;->d(Lo/ael;)F

    move-result v0

    iget-object v1, p0, Lo/ael$1;->c:Lo/ael;

    invoke-static {v1}, Lo/ael;->a(Lo/ael;)I

    move-result v1

    iget-object v2, p0, Lo/ael$1;->c:Lo/ael;

    invoke-static {v2}, Lo/ael;->h(Lo/ael;)I

    move-result v2

    invoke-static {v6, v0, v1, v2}, Lcom/picooc/health/formula/Formula;->a([BFII)Lo/fkd;

    move-result-object v8

    .line 245
    invoke-virtual {v8}, Lo/fkd;->a()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 247
    :pswitch_0
    iget-object v0, p0, Lo/ael$1;->c:Lo/ael;

    invoke-static {v0}, Lo/ael;->g(Lo/ael;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 248
    iget-object v0, p0, Lo/ael$1;->c:Lo/ael;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/ael;->b(Lo/ael;Z)Z

    .line 249
    iget-object v0, p0, Lo/ael$1;->c:Lo/ael;

    invoke-static {v0}, Lo/ael;->b(Lo/ael;)Lo/abx;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 250
    iget-object v0, p0, Lo/ael$1;->c:Lo/ael;

    invoke-static {v0}, Lo/ael;->b(Lo/ael;)Lo/abx;

    move-result-object v0

    iget-object v1, p0, Lo/ael$1;->c:Lo/ael;

    invoke-static {v1}, Lo/ael;->e(Lo/ael;)Lo/acl;

    move-result-object v1

    iget-object v2, p0, Lo/ael$1;->c:Lo/ael;

    invoke-static {v2, v8}, Lo/ael;->a(Lo/ael;Lo/fkd;)Lo/agg;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/abx;->onDataChanged(Lo/acl;Lo/afz;)V

    .line 252
    :cond_3
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PicoocMeasureController \u53d1\u9001\u672c\u6b21\u6d4b\u91cf\u6570\u636e"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 256
    :pswitch_1
    iget-object v0, p0, Lo/ael$1;->c:Lo/ael;

    invoke-static {v0, v8}, Lo/ael;->d(Lo/ael;Lo/fkd;)V

    .line 257
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PicoocMeasureController \u6536\u5230\u4e00\u6761\u5386\u53f2\u6570\u636e"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 258
    goto :goto_0

    .line 260
    :pswitch_2
    iget-object v0, p0, Lo/ael$1;->c:Lo/ael;

    invoke-static {v0}, Lo/ael;->k(Lo/ael;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_5

    iget-object v0, p0, Lo/ael$1;->c:Lo/ael;

    invoke-static {v0}, Lo/ael;->f(Lo/ael;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 261
    iget-object v0, p0, Lo/ael$1;->c:Lo/ael;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/ael;->d(Lo/ael;Z)Z

    .line 262
    iget-object v0, p0, Lo/ael$1;->c:Lo/ael;

    invoke-static {v0}, Lo/ael;->b(Lo/ael;)Lo/abx;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 263
    iget-object v0, p0, Lo/ael$1;->c:Lo/ael;

    invoke-static {v0}, Lo/ael;->b(Lo/ael;)Lo/abx;

    move-result-object v0

    iget-object v1, p0, Lo/ael$1;->c:Lo/ael;

    invoke-static {v1}, Lo/ael;->e(Lo/ael;)Lo/acl;

    move-result-object v1

    iget-object v2, p0, Lo/ael$1;->c:Lo/ael;

    invoke-static {v2}, Lo/ael;->k(Lo/ael;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/abx;->onDataChanged(Lo/acl;Ljava/util/List;)V

    .line 265
    :cond_4
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "PicoocMeasureController \u6279\u91cf\u53d1\u9001\u5386\u53f2\u6570\u636e"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/ael$1;->c:Lo/ael;

    invoke-static {v3}, Lo/ael;->k(Lo/ael;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\u6761,"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 273
    :cond_5
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public onConnectionStateChange(Landroid/bluetooth/BluetoothGatt;II)V
    .locals 4

    .line 175
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "PicoocMeasureController onConnectionStateChange\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "   newState = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 176
    if-nez p2, :cond_2

    .line 177
    const/4 v0, 0x2

    if-ne p3, v0, :cond_0

    .line 178
    iput-object p1, p0, Lo/ael$1;->b:Landroid/bluetooth/BluetoothGatt;

    .line 179
    const/4 v0, 0x2

    iput v0, p0, Lo/ael$1;->d:I

    .line 181
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Lo/ael$1$3;

    invoke-direct {v1, p0}, Lo/ael$1$3;-><init>(Lo/ael$1;)V

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    .line 198
    :cond_0
    if-nez p3, :cond_3

    .line 199
    const/4 v0, 0x0

    iput v0, p0, Lo/ael$1;->d:I

    .line 200
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PicoocMeasureController onConnectionStateChange STATUS_DISCONNECTED 1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 201
    iget-object v0, p0, Lo/ael$1;->c:Lo/ael;

    invoke-static {v0}, Lo/ael;->b(Lo/ael;)Lo/abx;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 202
    iget-object v0, p0, Lo/ael$1;->c:Lo/ael;

    invoke-static {v0}, Lo/ael;->b(Lo/ael;)Lo/abx;

    move-result-object v0

    iget-object v1, p0, Lo/ael$1;->c:Lo/ael;

    invoke-static {v1}, Lo/ael;->e(Lo/ael;)Lo/acl;

    move-result-object v1

    const/4 v2, 0x3

    invoke-interface {v0, v1, v2}, Lo/abx;->onStatusChanged(Lo/acl;I)V

    .line 204
    :cond_1
    iget-object v0, p0, Lo/ael$1;->c:Lo/ael;

    invoke-virtual {v0}, Lo/ael;->d()V

    goto :goto_0

    .line 207
    :cond_2
    const/4 v0, 0x0

    iput v0, p0, Lo/ael$1;->d:I

    .line 208
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PicoocMeasureController onConnectionStateChange STATUS_DISCONNECTED 2"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 209
    iget-object v0, p0, Lo/ael$1;->c:Lo/ael;

    invoke-static {v0}, Lo/ael;->b(Lo/ael;)Lo/abx;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 210
    iget-object v0, p0, Lo/ael$1;->c:Lo/ael;

    invoke-static {v0}, Lo/ael;->b(Lo/ael;)Lo/abx;

    move-result-object v0

    iget-object v1, p0, Lo/ael$1;->c:Lo/ael;

    invoke-static {v1}, Lo/ael;->e(Lo/ael;)Lo/acl;

    move-result-object v1

    const/4 v2, 0x3

    invoke-interface {v0, v1, v2}, Lo/abx;->onStatusChanged(Lo/acl;I)V

    .line 213
    :cond_3
    :goto_0
    return-void
.end method

.method public onDescriptorWrite(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V
    .locals 4

    .line 217
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "PicoocMeasureController onDescriptorWrite\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 218
    invoke-super {p0, p1, p2, p3}, Landroid/bluetooth/BluetoothGattCallback;->onDescriptorWrite(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V

    .line 219
    iget v0, p0, Lo/ael$1;->d:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 220
    return-void

    .line 222
    :cond_0
    return-void
.end method

.method public onServicesDiscovered(Landroid/bluetooth/BluetoothGatt;I)V
    .locals 5

    .line 277
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PicoocMeasureController onServicesDiscovered"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 278
    invoke-super {p0, p1, p2}, Landroid/bluetooth/BluetoothGattCallback;->onServicesDiscovered(Landroid/bluetooth/BluetoothGatt;I)V

    .line 279
    if-nez p2, :cond_0

    .line 280
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PicoocMeasureController GATT_SUCCESS"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 281
    iget-object v0, p0, Lo/ael$1;->c:Lo/ael;

    invoke-virtual {v0, p1}, Lo/ael;->a(Landroid/bluetooth/BluetoothGatt;)V

    goto :goto_0

    .line 284
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PicoocMeasureController onServicesDiscovered failed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 285
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 286
    const-string v0, "measureKitId"

    iget-object v1, p0, Lo/ael$1;->c:Lo/ael;

    invoke-static {v1}, Lo/ael;->i(Lo/ael;)Lo/acg;

    move-result-object v1

    invoke-virtual {v1}, Lo/acg;->k()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 287
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "No GATT service found."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const v2, 0x3611a8db

    const/4 v3, 0x0

    invoke-static {v2, v0, v4, v3, v1}, Lo/dho;->e(ILjava/lang/String;Landroid/os/Bundle;Z[Ljava/lang/Object;)V

    .line 288
    iget-object v0, p0, Lo/ael$1;->c:Lo/ael;

    invoke-static {v0}, Lo/ael;->b(Lo/ael;)Lo/abx;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 289
    iget-object v0, p0, Lo/ael$1;->c:Lo/ael;

    invoke-static {v0}, Lo/ael;->b(Lo/ael;)Lo/abx;

    move-result-object v0

    iget-object v1, p0, Lo/ael$1;->c:Lo/ael;

    invoke-static {v1}, Lo/ael;->e(Lo/ael;)Lo/acl;

    move-result-object v1

    const/16 v2, 0x8

    invoke-interface {v0, v1, v2}, Lo/abx;->onStatusChanged(Lo/acl;I)V

    .line 292
    :cond_1
    :goto_0
    return-void
.end method
