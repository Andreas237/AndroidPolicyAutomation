.class Lo/acv$1;
.super Landroid/bluetooth/BluetoothGattCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/acv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/acv;


# direct methods
.method constructor <init>(Lo/acv;)V
    .locals 0

    .line 99
    iput-object p1, p0, Lo/acv$1;->c:Lo/acv;

    invoke-direct {p0}, Landroid/bluetooth/BluetoothGattCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onCharacteristicChanged(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V
    .locals 5

    .line 160
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "BloodPressureMeasureController onCharacteristicChanged uuid is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",mBaseResponseCallback:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/acv$1;->c:Lo/acv;

    .line 161
    invoke-static {v3}, Lo/acv;->c(Lo/acv;)Lo/abx;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",parser:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/acv$1;->c:Lo/acv;

    invoke-static {v3}, Lo/acv;->k(Lo/acv;)Lo/acz;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 160
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 163
    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v0

    invoke-static {}, Lo/acv;->h()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 165
    iget-object v0, p0, Lo/acv$1;->c:Lo/acv;

    invoke-static {v0}, Lo/acv;->k(Lo/acv;)Lo/acz;

    move-result-object v0

    if-nez v0, :cond_0

    .line 166
    iget-object v0, p0, Lo/acv$1;->c:Lo/acv;

    new-instance v1, Lo/acz;

    invoke-direct {v1}, Lo/acz;-><init>()V

    invoke-static {v0, v1}, Lo/acv;->b(Lo/acv;Lo/acz;)Lo/acz;

    .line 168
    :cond_0
    iget-object v0, p0, Lo/acv$1;->c:Lo/acv;

    invoke-static {v0}, Lo/acv;->k(Lo/acv;)Lo/acz;

    move-result-object v0

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getValue()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/acz;->d([B)Lo/afz;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/age;

    .line 170
    if-eqz v4, :cond_1

    .line 171
    iget-object v0, p0, Lo/acv$1;->c:Lo/acv;

    invoke-static {v0}, Lo/acv;->c(Lo/acv;)Lo/abx;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 172
    iget-object v0, p0, Lo/acv$1;->c:Lo/acv;

    invoke-static {v0}, Lo/acv;->c(Lo/acv;)Lo/abx;

    move-result-object v0

    iget-object v1, p0, Lo/acv$1;->c:Lo/acv;

    invoke-static {v1}, Lo/acv;->f(Lo/acv;)Lo/acg;

    move-result-object v1

    invoke-interface {v0, v1, v4}, Lo/abx;->onDataChanged(Lo/acl;Lo/afz;)V

    .line 176
    :cond_1
    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v0

    invoke-static {}, Lo/acv;->i()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 177
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BloodPressureMeasureController time notification"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 178
    iget-object v0, p0, Lo/acv$1;->c:Lo/acv;

    invoke-static {v0, p1}, Lo/acv;->a(Lo/acv;Landroid/bluetooth/BluetoothGatt;)V

    .line 181
    :cond_2
    return-void
.end method

.method public onConnectionStateChange(Landroid/bluetooth/BluetoothGatt;II)V
    .locals 4

    .line 103
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "BloodPressureMeasureController onConnectionStateChange, newState="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 104
    const/4 v0, 0x2

    if-ne p3, v0, :cond_0

    .line 105
    iget-object v0, p0, Lo/acv$1;->c:Lo/acv;

    invoke-static {v0, p1}, Lo/acv;->e(Lo/acv;Landroid/bluetooth/BluetoothGatt;)Landroid/bluetooth/BluetoothGatt;

    .line 106
    iget-object v0, p0, Lo/acv$1;->c:Lo/acv;

    invoke-static {v0}, Lo/acv;->e(Lo/acv;)Landroid/bluetooth/BluetoothGatt;

    move-result-object v0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothGatt;->discoverServices()Z

    .line 107
    iget-object v0, p0, Lo/acv$1;->c:Lo/acv;

    invoke-static {v0}, Lo/acv;->c(Lo/acv;)Lo/abx;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 108
    iget-object v0, p0, Lo/acv$1;->c:Lo/acv;

    invoke-static {v0}, Lo/acv;->c(Lo/acv;)Lo/abx;

    move-result-object v0

    iget-object v1, p0, Lo/acv$1;->c:Lo/acv;

    invoke-static {v1}, Lo/acv;->a(Lo/acv;)Lo/acg;

    move-result-object v1

    const/4 v2, 0x2

    invoke-interface {v0, v1, v2}, Lo/abx;->onStatusChanged(Lo/acl;I)V

    goto :goto_0

    .line 110
    :cond_0
    if-nez p3, :cond_1

    .line 111
    iget-object v0, p0, Lo/acv$1;->c:Lo/acv;

    invoke-virtual {v0}, Lo/acv;->d()V

    .line 112
    iget-object v0, p0, Lo/acv$1;->c:Lo/acv;

    invoke-static {v0}, Lo/acv;->c(Lo/acv;)Lo/abx;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 113
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BloodPressureMeasureController onConnectionStateChange disconnected"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 114
    iget-object v0, p0, Lo/acv$1;->c:Lo/acv;

    invoke-static {v0}, Lo/acv;->c(Lo/acv;)Lo/abx;

    move-result-object v0

    iget-object v1, p0, Lo/acv$1;->c:Lo/acv;

    invoke-static {v1}, Lo/acv;->d(Lo/acv;)Lo/acg;

    move-result-object v1

    const/4 v2, 0x3

    invoke-interface {v0, v1, v2}, Lo/abx;->onStatusChanged(Lo/acl;I)V

    .line 117
    :cond_1
    :goto_0
    return-void
.end method

.method public onDescriptorWrite(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V
    .locals 4

    .line 185
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BloodPressureMeasureController onDescriptorWrite"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 187
    if-nez p3, :cond_1

    .line 188
    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattDescriptor;->getCharacteristic()Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v0

    invoke-static {}, Lo/acv;->h()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 189
    iget-object v0, p0, Lo/acv$1;->c:Lo/acv;

    invoke-static {v0}, Lo/acv;->h(Lo/acv;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lo/acv$1;->c:Lo/acv;

    invoke-static {v0}, Lo/acv;->i(Lo/acv;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 190
    :cond_0
    iget-object v0, p0, Lo/acv$1;->c:Lo/acv;

    invoke-static {v0, p1}, Lo/acv;->a(Lo/acv;Landroid/bluetooth/BluetoothGatt;)V

    .line 194
    :cond_1
    return-void
.end method

.method public onServicesDiscovered(Landroid/bluetooth/BluetoothGatt;I)V
    .locals 6

    .line 121
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "BloodPressureMeasureController onServicesDiscovered, status="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 122
    if-nez p2, :cond_0

    .line 123
    invoke-static {}, Lo/acv;->a()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/bluetooth/BluetoothGatt;->getService(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattService;

    move-result-object v4

    .line 124
    if-eqz v4, :cond_0

    .line 125
    iget-object v0, p0, Lo/acv$1;->c:Lo/acv;

    invoke-static {}, Lo/acv;->h()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v4, v1}, Landroid/bluetooth/BluetoothGattService;->getCharacteristic(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v1

    invoke-static {v0, v1}, Lo/acv;->e(Lo/acv;Landroid/bluetooth/BluetoothGattCharacteristic;)Landroid/bluetooth/BluetoothGattCharacteristic;

    .line 126
    iget-object v0, p0, Lo/acv$1;->c:Lo/acv;

    invoke-static {}, Lo/acv;->k()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v4, v1}, Landroid/bluetooth/BluetoothGattService;->getCharacteristic(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v1

    invoke-static {v0, v1}, Lo/acv;->c(Lo/acv;Landroid/bluetooth/BluetoothGattCharacteristic;)Landroid/bluetooth/BluetoothGattCharacteristic;

    .line 127
    iget-object v0, p0, Lo/acv$1;->c:Lo/acv;

    invoke-static {v0}, Lo/acv;->b(Lo/acv;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 129
    const-wide/16 v0, 0x1f4

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 132
    goto :goto_0

    .line 130
    :catch_0
    move-exception v5

    .line 131
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "InterruptedException e.getMessage() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 133
    :goto_0
    iget-object v0, p0, Lo/acv$1;->c:Lo/acv;

    iget-object v1, p0, Lo/acv$1;->c:Lo/acv;

    invoke-static {v1}, Lo/acv;->b(Lo/acv;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v1

    invoke-static {v0, p1, v1}, Lo/acv;->c(Lo/acv;Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)Z

    move-result v5

    .line 134
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "enableIndocation flag = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 139
    :cond_0
    const-wide/16 v0, 0x258

    :try_start_1
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1

    .line 142
    goto :goto_1

    .line 140
    :catch_1
    move-exception v4

    .line 141
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "InterruptedException e.getMessage() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 143
    :goto_1
    invoke-static {}, Lo/acv;->f()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/bluetooth/BluetoothGatt;->getService(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattService;

    move-result-object v4

    .line 144
    if-eqz v4, :cond_1

    .line 145
    iget-object v0, p0, Lo/acv$1;->c:Lo/acv;

    invoke-static {}, Lo/acv;->i()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v4, v1}, Landroid/bluetooth/BluetoothGattService;->getCharacteristic(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v1

    invoke-static {v0, v1}, Lo/acv;->a(Lo/acv;Landroid/bluetooth/BluetoothGattCharacteristic;)Landroid/bluetooth/BluetoothGattCharacteristic;

    .line 146
    iget-object v0, p0, Lo/acv$1;->c:Lo/acv;

    invoke-static {v0}, Lo/acv;->h(Lo/acv;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 147
    iget-object v0, p0, Lo/acv$1;->c:Lo/acv;

    invoke-static {v0}, Lo/acv;->h(Lo/acv;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Landroid/bluetooth/BluetoothGatt;->setCharacteristicNotification(Landroid/bluetooth/BluetoothGattCharacteristic;Z)Z

    .line 148
    iget-object v0, p0, Lo/acv$1;->c:Lo/acv;

    invoke-static {v0}, Lo/acv;->h(Lo/acv;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v0

    invoke-static {}, Lo/acv;->g()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/bluetooth/BluetoothGattCharacteristic;->getDescriptor(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattDescriptor;

    move-result-object v5

    .line 149
    if-eqz v5, :cond_1

    .line 150
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BloodPressureMeasureController ENABLE_NOTIFICATION_VALUE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 151
    sget-object v0, Landroid/bluetooth/BluetoothGattDescriptor;->ENABLE_NOTIFICATION_VALUE:[B

    invoke-virtual {v5, v0}, Landroid/bluetooth/BluetoothGattDescriptor;->setValue([B)Z

    .line 152
    invoke-virtual {p1, v5}, Landroid/bluetooth/BluetoothGatt;->writeDescriptor(Landroid/bluetooth/BluetoothGattDescriptor;)Z

    .line 156
    :cond_1
    return-void
.end method
