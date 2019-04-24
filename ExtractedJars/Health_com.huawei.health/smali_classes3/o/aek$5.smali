.class Lo/aek$5;
.super Landroid/bluetooth/BluetoothGattCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/aek;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/aek;


# direct methods
.method constructor <init>(Lo/aek;)V
    .locals 0

    .line 145
    iput-object p1, p0, Lo/aek$5;->e:Lo/aek;

    invoke-direct {p0}, Landroid/bluetooth/BluetoothGattCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onCharacteristicChanged(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V
    .locals 7

    .line 208
    invoke-super {p0, p1, p2}, Landroid/bluetooth/BluetoothGattCallback;->onCharacteristicChanged(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V

    .line 209
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " onCharacteristicChanged data:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/aek$5;->e:Lo/aek;

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getValue()[B

    move-result-object v4

    invoke-static {v3, v4}, Lo/aek;->c(Lo/aek;[B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 210
    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v0

    invoke-static {}, Lo/aek;->h()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 211
    iget-object v0, p0, Lo/aek$5;->e:Lo/aek;

    invoke-static {v0}, Lo/aek;->g(Lo/aek;)Lo/aen;

    move-result-object v0

    if-nez v0, :cond_0

    .line 212
    iget-object v0, p0, Lo/aek$5;->e:Lo/aek;

    new-instance v1, Lo/aen;

    invoke-direct {v1}, Lo/aen;-><init>()V

    invoke-static {v0, v1}, Lo/aek;->a(Lo/aek;Lo/aen;)Lo/aen;

    .line 214
    :cond_0
    iget-object v0, p0, Lo/aek$5;->e:Lo/aek;

    invoke-static {v0}, Lo/aek;->g(Lo/aek;)Lo/aen;

    move-result-object v0

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getValue()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/aen;->e([B)Lo/afz;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/agg;

    .line 215
    if-nez v5, :cond_1

    iget-object v0, p0, Lo/aek$5;->e:Lo/aek;

    invoke-static {v0}, Lo/aek;->f(Lo/aek;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 216
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseData is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 217
    iget-object v0, p0, Lo/aek$5;->e:Lo/aek;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aek;->d(Lo/aek;Z)Z

    .line 218
    iget-object v0, p0, Lo/aek$5;->e:Lo/aek;

    invoke-static {v0}, Lo/aek;->k(Lo/aek;)Lo/agg;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/agg;->b(F)V

    .line 219
    iget-object v0, p0, Lo/aek$5;->e:Lo/aek;

    invoke-static {v0}, Lo/aek;->a(Lo/aek;)Lo/abx;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 220
    iget-object v0, p0, Lo/aek$5;->e:Lo/aek;

    invoke-static {v0}, Lo/aek;->a(Lo/aek;)Lo/abx;

    move-result-object v0

    iget-object v1, p0, Lo/aek$5;->e:Lo/aek;

    invoke-static {v1}, Lo/aek;->h(Lo/aek;)Lo/acg;

    move-result-object v1

    iget-object v2, p0, Lo/aek$5;->e:Lo/aek;

    invoke-static {v2}, Lo/aek;->k(Lo/aek;)Lo/agg;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/abx;->onDataChanged(Lo/acl;Lo/afz;)V

    .line 223
    :cond_1
    iget-object v0, p0, Lo/aek$5;->e:Lo/aek;

    invoke-static {v0}, Lo/aek;->f(Lo/aek;)Z

    move-result v0

    if-eqz v0, :cond_2

    if-eqz v5, :cond_2

    iget-object v0, p0, Lo/aek$5;->e:Lo/aek;

    invoke-static {v0}, Lo/aek;->k(Lo/aek;)Lo/agg;

    move-result-object v0

    invoke-virtual {v0}, Lo/agg;->k()J

    move-result-wide v0

    invoke-virtual {v5}, Lo/agg;->k()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_2

    .line 224
    iget-object v0, p0, Lo/aek$5;->e:Lo/aek;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aek;->d(Lo/aek;Z)Z

    .line 225
    iget-object v0, p0, Lo/aek$5;->e:Lo/aek;

    invoke-static {v0}, Lo/aek;->k(Lo/aek;)Lo/agg;

    move-result-object v0

    invoke-virtual {v5}, Lo/agg;->c()F

    move-result v1

    invoke-virtual {v0, v1}, Lo/agg;->b(F)V

    .line 226
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bodyFat is not null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 227
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onCharacteristChanged weight = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/aek$5;->e:Lo/aek;

    invoke-static {v3}, Lo/aek;->k(Lo/aek;)Lo/agg;

    move-result-object v3

    invoke-virtual {v3}, Lo/agg;->a()F

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 228
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onCharacteristChanged body = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/aek$5;->e:Lo/aek;

    invoke-static {v3}, Lo/aek;->k(Lo/aek;)Lo/agg;

    move-result-object v3

    invoke-virtual {v3}, Lo/agg;->c()F

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 229
    iget-object v0, p0, Lo/aek$5;->e:Lo/aek;

    invoke-static {v0}, Lo/aek;->a(Lo/aek;)Lo/abx;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 230
    iget-object v0, p0, Lo/aek$5;->e:Lo/aek;

    invoke-static {v0}, Lo/aek;->a(Lo/aek;)Lo/abx;

    move-result-object v0

    iget-object v1, p0, Lo/aek$5;->e:Lo/aek;

    invoke-static {v1}, Lo/aek;->l(Lo/aek;)Lo/acg;

    move-result-object v1

    iget-object v2, p0, Lo/aek$5;->e:Lo/aek;

    invoke-static {v2}, Lo/aek;->k(Lo/aek;)Lo/agg;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/abx;->onDataChanged(Lo/acl;Lo/afz;)V

    .line 233
    :cond_2
    goto/16 :goto_0

    :cond_3
    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v0

    invoke-static {}, Lo/aek;->i()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 234
    iget-object v0, p0, Lo/aek$5;->e:Lo/aek;

    invoke-static {v0}, Lo/aek;->g(Lo/aek;)Lo/aen;

    move-result-object v0

    if-nez v0, :cond_4

    .line 235
    iget-object v0, p0, Lo/aek$5;->e:Lo/aek;

    new-instance v1, Lo/aen;

    invoke-direct {v1}, Lo/aen;-><init>()V

    invoke-static {v0, v1}, Lo/aek;->a(Lo/aek;Lo/aen;)Lo/aen;

    .line 237
    :cond_4
    iget-object v0, p0, Lo/aek$5;->e:Lo/aek;

    invoke-static {v0}, Lo/aek;->g(Lo/aek;)Lo/aen;

    move-result-object v0

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getValue()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/aen;->d([B)Lo/afz;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/agg;

    .line 238
    iget-object v0, p0, Lo/aek$5;->e:Lo/aek;

    invoke-static {v0}, Lo/aek;->k(Lo/aek;)Lo/agg;

    move-result-object v0

    invoke-virtual {v0}, Lo/agg;->k()J

    move-result-wide v0

    invoke-virtual {v5}, Lo/agg;->k()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-eqz v0, :cond_6

    .line 239
    iget-object v0, p0, Lo/aek$5;->e:Lo/aek;

    invoke-static {v0}, Lo/aek;->k(Lo/aek;)Lo/agg;

    move-result-object v0

    invoke-virtual {v5}, Lo/agg;->a()F

    move-result v1

    invoke-virtual {v0, v1}, Lo/agg;->e(F)V

    .line 240
    iget-object v0, p0, Lo/aek$5;->e:Lo/aek;

    invoke-static {v0}, Lo/aek;->k(Lo/aek;)Lo/agg;

    move-result-object v0

    invoke-virtual {v5}, Lo/agg;->k()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/agg;->d(J)V

    .line 241
    iget-object v0, p0, Lo/aek$5;->e:Lo/aek;

    invoke-static {v0}, Lo/aek;->k(Lo/aek;)Lo/agg;

    move-result-object v0

    invoke-virtual {v5}, Lo/agg;->h()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/agg;->e(J)V

    .line 242
    iget-object v0, p0, Lo/aek$5;->e:Lo/aek;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/aek;->d(Lo/aek;Z)Z

    .line 243
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "weight is not null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 244
    iget-object v0, p0, Lo/aek$5;->e:Lo/aek;

    invoke-static {v0}, Lo/aek;->p(Lo/aek;)Landroid/os/Bundle;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_5

    .line 245
    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 246
    const-string v0, "weight_data"

    invoke-virtual {v6, v0, v5}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 247
    new-instance v0, Lo/ahi$a;

    const-string v1, "weight_measure_choose_user"

    invoke-direct {v0, v1, v6}, Lo/ahi$a;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    invoke-static {v0}, Lo/ahi;->e(Lo/ahi$a;)V

    .line 248
    goto :goto_0

    .line 249
    :cond_5
    iget-object v0, p0, Lo/aek$5;->e:Lo/aek;

    iget-object v1, p0, Lo/aek$5;->e:Lo/aek;

    invoke-static {v1}, Lo/aek;->p(Lo/aek;)Landroid/os/Bundle;

    move-result-object v1

    invoke-static {v0, v1}, Lo/aek;->c(Lo/aek;Landroid/os/Bundle;)V

    goto :goto_0

    .line 252
    :cond_6
    invoke-virtual {v5}, Lo/agg;->a()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v1, v0

    if-eqz v0, :cond_8

    invoke-virtual {v5}, Lo/agg;->c()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_8

    .line 253
    iget-object v0, p0, Lo/aek$5;->e:Lo/aek;

    invoke-static {v0}, Lo/aek;->p(Lo/aek;)Landroid/os/Bundle;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_7

    .line 254
    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 255
    const-string v0, "weight_data"

    invoke-virtual {v6, v0, v5}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 256
    new-instance v0, Lo/ahi$a;

    const-string v1, "weight_measure_choose_user"

    invoke-direct {v0, v1, v6}, Lo/ahi$a;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    invoke-static {v0}, Lo/ahi;->e(Lo/ahi$a;)V

    .line 257
    goto :goto_0

    .line 258
    :cond_7
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "send userInfo again"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 259
    iget-object v0, p0, Lo/aek$5;->e:Lo/aek;

    iget-object v1, p0, Lo/aek$5;->e:Lo/aek;

    invoke-static {v1}, Lo/aek;->p(Lo/aek;)Landroid/os/Bundle;

    move-result-object v1

    invoke-static {v0, v1}, Lo/aek;->c(Lo/aek;Landroid/os/Bundle;)V

    .line 264
    :cond_8
    :goto_0
    return-void
.end method

.method public onCharacteristicWrite(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V
    .locals 4

    .line 185
    invoke-super {p0, p1, p2, p3}, Landroid/bluetooth/BluetoothGattCallback;->onCharacteristicWrite(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V

    .line 186
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

    .line 188
    iget-object v0, p0, Lo/aek$5;->e:Lo/aek;

    invoke-static {v0}, Lo/aek;->d(Lo/aek;)Lo/aes;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 190
    :cond_0
    if-nez p3, :cond_1

    .line 191
    iget-object v0, p0, Lo/aek$5;->e:Lo/aek;

    invoke-static {v0}, Lo/aek;->d(Lo/aek;)Lo/aes;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/aes;->a(Ljava/lang/Object;)V

    .line 193
    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "00002a2b-0000-1000-8000-00805f9b34fb"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 194
    iget-object v0, p0, Lo/aek$5;->e:Lo/aek;

    invoke-static {v0}, Lo/aek;->i(Lo/aek;)Lo/aeo;

    move-result-object v0

    new-instance v1, Lo/aer;

    sget-object v2, Lo/aeo$a;->b:Lo/aeo$a;

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lo/aer;-><init>(Lo/aeo$a;[B)V

    invoke-virtual {v0, v1}, Lo/aeo;->e(Lo/aer;)V

    .line 195
    iget-object v0, p0, Lo/aek$5;->e:Lo/aek;

    invoke-static {v0}, Lo/aek;->i(Lo/aek;)Lo/aeo;

    move-result-object v0

    invoke-virtual {v0}, Lo/aeo;->c()V

    .line 197
    iget-object v0, p0, Lo/aek$5;->e:Lo/aek;

    invoke-static {v0}, Lo/aek;->i(Lo/aek;)Lo/aeo;

    move-result-object v0

    new-instance v1, Lo/aer;

    sget-object v2, Lo/aeo$a;->h:Lo/aeo$a;

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lo/aer;-><init>(Lo/aeo$a;[B)V

    invoke-virtual {v0, v1}, Lo/aeo;->e(Lo/aer;)V

    .line 198
    iget-object v0, p0, Lo/aek$5;->e:Lo/aek;

    invoke-static {v0}, Lo/aek;->i(Lo/aek;)Lo/aeo;

    move-result-object v0

    invoke-virtual {v0}, Lo/aeo;->c()V

    goto :goto_0

    .line 201
    :cond_1
    iget-object v0, p0, Lo/aek$5;->e:Lo/aek;

    invoke-static {v0}, Lo/aek;->d(Lo/aek;)Lo/aes;

    move-result-object v0

    invoke-interface {v0}, Lo/aes;->c()V

    .line 204
    :cond_2
    :goto_0
    return-void
.end method

.method public onConnectionStateChange(Landroid/bluetooth/BluetoothGatt;II)V
    .locals 4

    .line 149
    invoke-super {p0, p1, p2, p3}, Landroid/bluetooth/BluetoothGattCallback;->onConnectionStateChange(Landroid/bluetooth/BluetoothGatt;II)V

    .line 151
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " onConnectionStateChange status:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " newState:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 153
    const/4 v0, 0x2

    if-ne p3, v0, :cond_0

    .line 154
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->discoverServices()Z

    .line 155
    iget-object v0, p0, Lo/aek$5;->e:Lo/aek;

    invoke-static {v0}, Lo/aek;->a(Lo/aek;)Lo/abx;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 156
    iget-object v0, p0, Lo/aek$5;->e:Lo/aek;

    invoke-static {v0}, Lo/aek;->a(Lo/aek;)Lo/abx;

    move-result-object v0

    iget-object v1, p0, Lo/aek$5;->e:Lo/aek;

    invoke-static {v1}, Lo/aek;->b(Lo/aek;)Lo/acg;

    move-result-object v1

    const/4 v2, 0x2

    invoke-interface {v0, v1, v2}, Lo/abx;->onStatusChanged(Lo/acl;I)V

    goto :goto_0

    .line 158
    :cond_0
    if-nez p3, :cond_2

    .line 159
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "newState == BluetoothProfile.STATE_DISCONNECTED"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 160
    iget-object v0, p0, Lo/aek$5;->e:Lo/aek;

    invoke-static {v0}, Lo/aek;->a(Lo/aek;)Lo/abx;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 161
    iget-object v0, p0, Lo/aek$5;->e:Lo/aek;

    invoke-static {v0}, Lo/aek;->a(Lo/aek;)Lo/abx;

    move-result-object v0

    iget-object v1, p0, Lo/aek$5;->e:Lo/aek;

    invoke-static {v1}, Lo/aek;->e(Lo/aek;)Lo/acg;

    move-result-object v1

    const/4 v2, 0x3

    invoke-interface {v0, v1, v2}, Lo/abx;->onStatusChanged(Lo/acl;I)V

    .line 163
    :cond_1
    iget-object v0, p0, Lo/aek$5;->e:Lo/aek;

    invoke-virtual {v0}, Lo/aek;->d()V

    .line 165
    :cond_2
    :goto_0
    return-void
.end method

.method public onDescriptorWrite(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V
    .locals 4

    .line 268
    invoke-super {p0, p1, p2, p3}, Landroid/bluetooth/BluetoothGattCallback;->onDescriptorWrite(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V

    .line 270
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " onDescriptorWrite status:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " descriptor:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattDescriptor;->getCharacteristic()Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v3

    invoke-virtual {v3}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

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

    .line 272
    iget-object v0, p0, Lo/aek$5;->e:Lo/aek;

    invoke-static {v0}, Lo/aek;->d(Lo/aek;)Lo/aes;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 274
    :cond_0
    if-nez p3, :cond_1

    .line 275
    iget-object v0, p0, Lo/aek$5;->e:Lo/aek;

    invoke-static {v0}, Lo/aek;->d(Lo/aek;)Lo/aes;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/aes;->a(Ljava/lang/Object;)V

    goto :goto_0

    .line 277
    :cond_1
    iget-object v0, p0, Lo/aek$5;->e:Lo/aek;

    invoke-static {v0}, Lo/aek;->d(Lo/aek;)Lo/aes;

    move-result-object v0

    invoke-interface {v0}, Lo/aes;->c()V

    .line 279
    :goto_0
    return-void
.end method

.method public onServicesDiscovered(Landroid/bluetooth/BluetoothGatt;I)V
    .locals 4

    .line 169
    invoke-super {p0, p1, p2}, Landroid/bluetooth/BluetoothGattCallback;->onServicesDiscovered(Landroid/bluetooth/BluetoothGatt;I)V

    .line 171
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " onServicesDiscovered status:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 173
    if-nez p2, :cond_1

    .line 174
    iget-object v0, p0, Lo/aek$5;->e:Lo/aek;

    invoke-static {v0, p1}, Lo/aek;->b(Lo/aek;Landroid/bluetooth/BluetoothGatt;)Landroid/bluetooth/BluetoothGatt;

    .line 175
    iget-object v0, p0, Lo/aek$5;->e:Lo/aek;

    invoke-static {v0}, Lo/aek;->a(Lo/aek;)Lo/abx;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 176
    iget-object v0, p0, Lo/aek$5;->e:Lo/aek;

    invoke-static {v0}, Lo/aek;->a(Lo/aek;)Lo/abx;

    move-result-object v0

    iget-object v1, p0, Lo/aek$5;->e:Lo/aek;

    invoke-static {v1}, Lo/aek;->c(Lo/aek;)Lo/acg;

    move-result-object v1

    const/4 v2, 0x2

    invoke-interface {v0, v1, v2}, Lo/abx;->onStatusChanged(Lo/acl;I)V

    .line 179
    :cond_0
    iget-object v0, p0, Lo/aek$5;->e:Lo/aek;

    invoke-virtual {v0}, Lo/aek;->a()V

    .line 181
    :cond_1
    return-void
.end method
