.class Lo/adu$1;
.super Landroid/bluetooth/BluetoothGattCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/adu;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/adu;


# direct methods
.method constructor <init>(Lo/adu;)V
    .locals 0

    .line 123
    iput-object p1, p0, Lo/adu$1;->d:Lo/adu;

    invoke-direct {p0}, Landroid/bluetooth/BluetoothGattCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onCharacteristicChanged(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V
    .locals 6

    .line 232
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "KangKangMeasureController onCharacteristicChanged"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 233
    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getValue()[B

    move-result-object v4

    .line 234
    if-eqz v4, :cond_1

    array-length v0, v4

    const/4 v1, 0x6

    if-ne v0, v1, :cond_1

    .line 235
    new-instance v5, Lo/age;

    invoke-direct {v5}, Lo/age;-><init>()V

    .line 236
    invoke-virtual {v5, v4}, Lo/age;->a([B)V

    .line 237
    invoke-virtual {v5}, Lo/age;->c()S

    move-result v0

    invoke-static {v0}, Lo/adz;->d(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 238
    iget-object v0, p0, Lo/adu$1;->d:Lo/adu;

    invoke-static {v0}, Lo/adu;->h(Lo/adu;)Lo/abx;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 239
    iget-object v0, p0, Lo/adu$1;->d:Lo/adu;

    invoke-static {v0}, Lo/adu;->h(Lo/adu;)Lo/abx;

    move-result-object v0

    iget-object v1, p0, Lo/adu$1;->d:Lo/adu;

    invoke-static {v1}, Lo/adu;->f(Lo/adu;)Lo/acg;

    move-result-object v1

    invoke-virtual {v5}, Lo/age;->c()S

    move-result v2

    invoke-interface {v0, v1, v2}, Lo/abx;->onFailed(Lo/acl;I)V

    goto :goto_0

    .line 242
    :cond_0
    iget-object v0, p0, Lo/adu$1;->d:Lo/adu;

    invoke-static {v0}, Lo/adu;->h(Lo/adu;)Lo/abx;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 243
    iget-object v0, p0, Lo/adu$1;->d:Lo/adu;

    invoke-static {v0}, Lo/adu;->h(Lo/adu;)Lo/abx;

    move-result-object v0

    iget-object v1, p0, Lo/adu$1;->d:Lo/adu;

    invoke-static {v1}, Lo/adu;->g(Lo/adu;)Lo/acg;

    move-result-object v1

    invoke-interface {v0, v1, v5}, Lo/abx;->onDataChanged(Lo/acl;Lo/afz;)V

    .line 247
    :cond_1
    :goto_0
    return-void
.end method

.method public onCharacteristicWrite(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V
    .locals 5

    .line 204
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "KangKangMeasureController write characteristic success  status:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 205
    invoke-static {}, Lo/adu;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 206
    const/4 v0, 0x0

    invoke-static {v0}, Lo/adu;->a(Z)Z

    .line 207
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "KangKangMeasureController onCharacteristicWrite send A cmd"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 209
    const-wide/16 v0, 0xc8

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 212
    goto :goto_0

    .line 210
    :catch_0
    move-exception v4

    .line 211
    invoke-virtual {v4}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 215
    :goto_0
    :try_start_1
    iget-object v0, p0, Lo/adu$1;->d:Lo/adu;

    invoke-static {v0}, Lo/adu;->c(Lo/adu;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v0

    const-string v1, "A"

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    const/16 v2, 0x11

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/bluetooth/BluetoothGattCharacteristic;->setValue(III)Z

    .line 216
    iget-object v0, p0, Lo/adu$1;->d:Lo/adu;

    invoke-static {v0}, Lo/adu;->b(Lo/adu;)Landroid/bluetooth/BluetoothGatt;

    move-result-object v0

    iget-object v1, p0, Lo/adu$1;->d:Lo/adu;

    invoke-static {v1}, Lo/adu;->c(Lo/adu;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/bluetooth/BluetoothGatt;->writeCharacteristic(Landroid/bluetooth/BluetoothGattCharacteristic;)Z
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    .line 220
    goto :goto_1

    .line 217
    :catch_1
    move-exception v4

    .line 218
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 219
    iget-object v0, p0, Lo/adu$1;->d:Lo/adu;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/adu;->c(Lo/adu;I)V

    .line 222
    :cond_0
    :goto_1
    return-void
.end method

.method public onConnectionStateChange(Landroid/bluetooth/BluetoothGatt;II)V
    .locals 5

    .line 137
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "KangKangMeasureController Connection State  Change:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 138
    iget-object v0, p0, Lo/adu$1;->d:Lo/adu;

    invoke-static {v0, p1}, Lo/adu;->a(Lo/adu;Landroid/bluetooth/BluetoothGatt;)Landroid/bluetooth/BluetoothGatt;

    .line 139
    const/4 v0, 0x1

    if-ne p3, v0, :cond_0

    .line 140
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "KangKangMeasureController please wait  connecting"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 141
    :cond_0
    const/4 v0, 0x2

    if-ne p3, v0, :cond_1

    .line 142
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "KangKangMeasureController Connected to GATT server."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 144
    const-wide/16 v0, 0x64

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 147
    goto :goto_0

    .line 145
    :catch_0
    move-exception v4

    .line 146
    invoke-virtual {v4}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 148
    :goto_0
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->discoverServices()Z

    .line 151
    const-wide/16 v0, 0x64

    :try_start_1
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1

    .line 154
    goto :goto_1

    .line 152
    :catch_1
    move-exception v4

    .line 153
    invoke-virtual {v4}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 154
    goto :goto_1

    .line 155
    :cond_1
    if-nez p3, :cond_2

    .line 156
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "KangKangMeasureController Disconnected from GATT server."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 157
    iget-object v0, p0, Lo/adu$1;->d:Lo/adu;

    invoke-virtual {v0}, Lo/adu;->d()V

    .line 158
    const/4 v0, 0x1

    invoke-static {v0}, Lo/adu;->a(Z)Z

    .line 159
    iget-object v0, p0, Lo/adu$1;->d:Lo/adu;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/adu;->c(Lo/adu;I)V

    .line 161
    :cond_2
    :goto_1
    return-void
.end method

.method public onDescriptorWrite(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V
    .locals 5

    .line 259
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "KangKangMeasureController write Descriptor success status:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 261
    iget-object v0, p0, Lo/adu$1;->d:Lo/adu;

    invoke-static {v0}, Lo/adu;->k(Lo/adu;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 262
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "KangKangMeasureController send ble cmd  11 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 263
    const/4 v0, 0x1

    invoke-static {v0}, Lo/adu;->a(Z)Z

    .line 264
    iget-object v0, p0, Lo/adu$1;->d:Lo/adu;

    invoke-static {v0}, Lo/adu;->c(Lo/adu;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v0

    const-string v1, "B"

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    const/16 v2, 0x11

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/bluetooth/BluetoothGattCharacteristic;->setValue(III)Z

    .line 265
    iget-object v0, p0, Lo/adu$1;->d:Lo/adu;

    invoke-static {v0}, Lo/adu;->c(Lo/adu;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/bluetooth/BluetoothGatt;->writeCharacteristic(Landroid/bluetooth/BluetoothGattCharacteristic;)Z

    .line 266
    iget-object v0, p0, Lo/adu$1;->d:Lo/adu;

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lo/adu;->c(Lo/adu;I)V

    .line 269
    const-wide/16 v0, 0x64

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 272
    goto :goto_0

    .line 270
    :catch_0
    move-exception v4

    .line 271
    invoke-virtual {v4}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 272
    goto :goto_0

    .line 273
    :cond_0
    iget-object v0, p0, Lo/adu$1;->d:Lo/adu;

    invoke-static {v0}, Lo/adu;->k(Lo/adu;)I

    move-result v0

    if-nez v0, :cond_1

    .line 274
    iget-object v0, p0, Lo/adu$1;->d:Lo/adu;

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lo/adu;->a(Lo/adu;I)I

    .line 275
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "KangKangMeasureController STATE_NONE only set STATE_CONNECTED"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 276
    const/4 v0, 0x0

    invoke-static {v0}, Lo/adu;->a(Z)Z

    .line 278
    :cond_1
    :goto_0
    return-void
.end method

.method public onServicesDiscovered(Landroid/bluetooth/BluetoothGatt;I)V
    .locals 5

    .line 172
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "KangKangMeasureController onServicesDiscovered"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 173
    if-nez p2, :cond_0

    .line 175
    iget-object v0, p0, Lo/adu$1;->d:Lo/adu;

    const-string v1, "0000fff0-0000-1000-8000-00805f9b34fb"

    invoke-static {v1}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/bluetooth/BluetoothGatt;->getService(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattService;

    move-result-object v1

    invoke-static {v0, v1}, Lo/adu;->c(Lo/adu;Landroid/bluetooth/BluetoothGattService;)Landroid/bluetooth/BluetoothGattService;

    .line 176
    iget-object v0, p0, Lo/adu$1;->d:Lo/adu;

    invoke-static {v0}, Lo/adu;->a(Lo/adu;)Landroid/bluetooth/BluetoothGattService;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 177
    iget-object v0, p0, Lo/adu$1;->d:Lo/adu;

    iget-object v1, p0, Lo/adu$1;->d:Lo/adu;

    invoke-static {v1}, Lo/adu;->a(Lo/adu;)Landroid/bluetooth/BluetoothGattService;

    move-result-object v1

    const-string v2, "0000fff1-0000-1000-8000-00805f9b34fb"

    invoke-static {v2}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/bluetooth/BluetoothGattService;->getCharacteristic(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v1

    invoke-static {v0, v1}, Lo/adu;->e(Lo/adu;Landroid/bluetooth/BluetoothGattCharacteristic;)Landroid/bluetooth/BluetoothGattCharacteristic;

    .line 179
    iget-object v0, p0, Lo/adu$1;->d:Lo/adu;

    iget-object v1, p0, Lo/adu$1;->d:Lo/adu;

    invoke-static {v1}, Lo/adu;->a(Lo/adu;)Landroid/bluetooth/BluetoothGattService;

    move-result-object v1

    const-string v2, "0000fff2-0000-1000-8000-00805f9b34fb"

    invoke-static {v2}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/bluetooth/BluetoothGattService;->getCharacteristic(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v1

    invoke-static {v0, v1}, Lo/adu;->d(Lo/adu;Landroid/bluetooth/BluetoothGattCharacteristic;)Landroid/bluetooth/BluetoothGattCharacteristic;

    .line 181
    iget-object v0, p0, Lo/adu$1;->d:Lo/adu;

    invoke-static {v0}, Lo/adu;->d(Lo/adu;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/adu$1;->d:Lo/adu;

    invoke-static {v0}, Lo/adu;->c(Lo/adu;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 182
    iget-object v0, p0, Lo/adu$1;->d:Lo/adu;

    iget-object v1, p0, Lo/adu$1;->d:Lo/adu;

    invoke-static {v1}, Lo/adu;->d(Lo/adu;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v1

    const-string v2, "00002902-0000-1000-8000-00805f9b34fb"

    invoke-static {v2}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getDescriptor(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattDescriptor;

    move-result-object v1

    invoke-static {v0, v1}, Lo/adu;->b(Lo/adu;Landroid/bluetooth/BluetoothGattDescriptor;)Landroid/bluetooth/BluetoothGattDescriptor;

    .line 185
    const-wide/16 v0, 0x32

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 188
    goto :goto_0

    .line 186
    :catch_0
    move-exception v4

    .line 187
    invoke-virtual {v4}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 190
    :goto_0
    iget-object v0, p0, Lo/adu$1;->d:Lo/adu;

    invoke-static {v0}, Lo/adu;->e(Lo/adu;)Landroid/bluetooth/BluetoothGattDescriptor;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 191
    iget-object v0, p0, Lo/adu$1;->d:Lo/adu;

    invoke-static {v0}, Lo/adu;->d(Lo/adu;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Landroid/bluetooth/BluetoothGatt;->setCharacteristicNotification(Landroid/bluetooth/BluetoothGattCharacteristic;Z)Z

    .line 192
    iget-object v0, p0, Lo/adu$1;->d:Lo/adu;

    invoke-static {v0}, Lo/adu;->e(Lo/adu;)Landroid/bluetooth/BluetoothGattDescriptor;

    move-result-object v0

    sget-object v1, Landroid/bluetooth/BluetoothGattDescriptor;->ENABLE_NOTIFICATION_VALUE:[B

    invoke-virtual {v0, v1}, Landroid/bluetooth/BluetoothGattDescriptor;->setValue([B)Z

    .line 193
    iget-object v0, p0, Lo/adu$1;->d:Lo/adu;

    invoke-static {v0}, Lo/adu;->e(Lo/adu;)Landroid/bluetooth/BluetoothGattDescriptor;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/bluetooth/BluetoothGatt;->writeDescriptor(Landroid/bluetooth/BluetoothGattDescriptor;)Z

    goto :goto_1

    .line 199
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "KangKangMeasureController onServicesDiscovered received: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 201
    :cond_1
    :goto_1
    return-void
.end method
