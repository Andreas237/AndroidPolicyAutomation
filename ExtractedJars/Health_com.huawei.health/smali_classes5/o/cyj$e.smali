.class Lo/cyj$e;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cyj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation


# instance fields
.field final synthetic d:Lo/cyj;


# direct methods
.method public constructor <init>(Lo/cyj;Landroid/os/Looper;)V
    .locals 0

    .line 2108
    iput-object p1, p0, Lo/cyj$e;->d:Lo/cyj;

    .line 2109
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 2110
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 14

    .line 2114
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 2115
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_10

    .line 2117
    :sswitch_0
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Receive SEND_COMMAND Message and sendResult = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v4}, Lo/cyj;->t(Lo/cyj;)Z

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " size:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v4}, Lo/cyj;->c(Lo/cyj;)Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2118
    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->c(Lo/cyj;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1b

    .line 2121
    const/4 v7, 0x0

    .line 2122
    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->f(Lo/cyj;)Ljava/lang/Object;

    move-result-object v8

    monitor-enter v8

    .line 2123
    :try_start_0
    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->w(Lo/cyj;)I

    move-result v6

    .line 2124
    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->c(Lo/cyj;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_0

    .line 2125
    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->c(Lo/cyj;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/cye;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2127
    :cond_0
    monitor-exit v8

    goto :goto_0

    :catchall_0
    move-exception v9

    monitor-exit v8

    throw v9

    .line 2129
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v7, :cond_1a

    .line 2131
    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->i(Lo/cyj;)I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_e

    .line 2133
    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->z(Lo/cyj;)Z

    move-result v0

    if-nez v0, :cond_1a

    .line 2135
    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-virtual {v7}, Lo/cye;->g()I

    move-result v1

    invoke-static {v0, v1}, Lo/cyj;->b(Lo/cyj;I)I

    .line 2136
    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-virtual {v7}, Lo/cye;->h()I

    move-result v1

    invoke-static {v0, v1}, Lo/cyj;->c(Lo/cyj;I)I

    .line 2137
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "ServiceID = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v4}, Lo/cyj;->v(Lo/cyj;)I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " CommandID = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v4}, Lo/cyj;->y(Lo/cyj;)I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2139
    invoke-virtual {v7}, Lo/cye;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2140
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Command need ack."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2142
    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/cyj;->a(Lo/cyj;Z)Z

    .line 2144
    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    const/4 v1, 0x3

    invoke-static {v0, v1}, Lo/cyj;->i(Lo/cyj;I)I

    .line 2148
    :cond_1
    const/4 v8, 0x0

    .line 2149
    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->l(Lo/cyj;)Lo/cyn;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 2150
    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->l(Lo/cyj;)Lo/cyn;

    move-result-object v0

    invoke-interface {v0}, Lo/cyn;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v9

    .line 2151
    const/4 v0, 0x0

    if-eq v0, v9, :cond_3

    invoke-virtual {v9}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceBTType()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_3

    .line 2152
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Current device type is ble."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2153
    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->v(Lo/cyj;)I

    move-result v0

    const/16 v1, 0x9

    if-eq v1, v0, :cond_3

    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->v(Lo/cyj;)I

    move-result v0

    const/16 v1, 0xa

    if-eq v1, v0, :cond_3

    .line 2154
    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->v(Lo/cyj;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_2

    .line 2156
    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->y(Lo/cyj;)I

    move-result v0

    const/4 v1, 0x1

    if-eq v1, v0, :cond_3

    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->y(Lo/cyj;)I

    move-result v0

    const/16 v1, 0xe

    if-eq v1, v0, :cond_3

    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    .line 2157
    invoke-static {v0}, Lo/cyj;->y(Lo/cyj;)I

    move-result v0

    const/16 v1, 0xf

    if-eq v1, v0, :cond_3

    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->y(Lo/cyj;)I

    move-result v0

    const/16 v1, 0x13

    if-eq v1, v0, :cond_3

    .line 2158
    const/4 v8, 0x1

    goto :goto_1

    .line 2161
    :cond_2
    const/4 v8, 0x1

    .line 2167
    :cond_3
    :goto_1
    if-eqz v8, :cond_6

    .line 2170
    const/4 v9, 0x0

    .line 2171
    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->a(Lo/cyj;)Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 2172
    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->x(Lo/cyj;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v7}, Lo/cye;->c()[B

    move-result-object v1

    iget-object v2, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v2}, Lo/cyj;->a(Lo/cyj;)Landroid/bluetooth/BluetoothDevice;

    move-result-object v2

    invoke-virtual {v2}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v3}, Lo/cyj;->t(Lo/cyj;)Z

    move-result v3

    invoke-static {v0, v1, v2, v3}, Lo/cxo;->d(Landroid/content/Context;[BLjava/lang/String;Z)[B

    move-result-object v9

    goto :goto_2

    .line 2174
    :cond_4
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "mBTDevice is null"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2177
    :goto_2
    const/4 v0, 0x0

    if-eq v0, v9, :cond_5

    .line 2178
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Get encryptData info."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2179
    array-length v0, v9

    invoke-virtual {v7, v0}, Lo/cye;->a(I)V

    .line 2180
    invoke-virtual {v7, v9}, Lo/cye;->a([B)V

    goto :goto_3

    .line 2182
    :cond_5
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Do not get encryptData info."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2183
    invoke-virtual {v7}, Lo/cye;->c()[B

    move-result-object v0

    array-length v0, v0

    invoke-virtual {v7, v0}, Lo/cye;->a(I)V

    .line 2184
    invoke-virtual {v7}, Lo/cye;->c()[B

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/cye;->a([B)V

    .line 2188
    :cond_6
    :goto_3
    invoke-virtual {v7}, Lo/cye;->d()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 2190
    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/cyj;->d(Lo/cyj;I)I

    .line 2191
    const-string v0, "BTDeviceSendCommandUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mBtDeviceCommand = btDeviceCommand"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2192
    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v0, v7}, Lo/cyj;->d(Lo/cyj;Lo/cye;)Lo/cye;

    .line 2195
    :cond_7
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Send V2 Command timeout with ReSendTime = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v4}, Lo/cyj;->D(Lo/cyj;)I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2196
    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->D(Lo/cyj;)I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_a

    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->v(Lo/cyj;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_a

    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->y(Lo/cyj;)I

    move-result v0

    const/4 v1, 0x5

    if-ne v1, v0, :cond_a

    .line 2198
    invoke-static {}, Lo/cxo;->c()Lo/cye;

    move-result-object v9

    .line 2200
    const/4 v10, 0x0

    .line 2201
    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->a(Lo/cyj;)Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_8

    .line 2202
    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->x(Lo/cyj;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v9}, Lo/cye;->c()[B

    move-result-object v1

    iget-object v2, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v2}, Lo/cyj;->a(Lo/cyj;)Landroid/bluetooth/BluetoothDevice;

    move-result-object v2

    invoke-virtual {v2}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v3}, Lo/cyj;->t(Lo/cyj;)Z

    move-result v3

    invoke-static {v0, v1, v2, v3}, Lo/cxo;->d(Landroid/content/Context;[BLjava/lang/String;Z)[B

    move-result-object v10

    goto :goto_4

    .line 2204
    :cond_8
    const-string v0, "0xA0200006"

    const-string v1, "01"

    const-string v2, "BTDeviceSendCommandUtil"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "mBTDevice is null"

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2208
    :goto_4
    const/4 v0, 0x0

    if-eq v0, v10, :cond_9

    .line 2209
    invoke-virtual {v7, v10}, Lo/cye;->a([B)V

    .line 2210
    array-length v0, v10

    invoke-virtual {v7, v0}, Lo/cye;->a(I)V

    goto :goto_5

    .line 2212
    :cond_9
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "encryptData is null."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2215
    :cond_a
    :goto_5
    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    iget-object v1, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v1, v7}, Lo/cyj;->e(Lo/cyj;Lo/cye;)Z

    move-result v1

    invoke-static {v0, v1}, Lo/cyj;->h(Lo/cyj;Z)Z

    .line 2216
    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->D(Lo/cyj;)I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_c

    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->k(Lo/cyj;)I

    move-result v0

    iget-object v1, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v1}, Lo/cyj;->D(Lo/cyj;)I

    move-result v1

    if-gt v0, v1, :cond_7

    goto :goto_6

    .line 2218
    :cond_b
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Do not need ack."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2219
    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    iget-object v1, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v1, v7}, Lo/cyj;->e(Lo/cyj;Lo/cye;)Z

    move-result v1

    invoke-static {v0, v1}, Lo/cyj;->h(Lo/cyj;Z)Z

    .line 2222
    :cond_c
    :goto_6
    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->f(Lo/cyj;)Ljava/lang/Object;

    move-result-object v9

    monitor-enter v9

    .line 2224
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    :try_start_1
    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Remove V2 Command from list."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2225
    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->c(Lo/cyj;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_d

    if-ltz v6, :cond_d

    .line 2226
    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->c(Lo/cyj;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v6}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    goto :goto_7

    .line 2228
    :cond_d
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Remove fail for index is not in rang, mBTDeviceCommandList.size() = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v4}, Lo/cyj;->c(Lo/cyj;)Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 2230
    :goto_7
    monitor-exit v9

    goto :goto_8

    :catchall_1
    move-exception v11

    monitor-exit v9

    throw v11

    .line 2231
    :goto_8
    goto/16 :goto_f

    .line 2233
    :cond_e
    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->z(Lo/cyj;)Z

    move-result v0

    if-nez v0, :cond_1a

    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->B(Lo/cyj;)Lo/cye;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1a

    .line 2235
    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/cyj;->a(Lo/cyj;Z)Z

    .line 2237
    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    const/4 v1, 0x3

    invoke-static {v0, v1}, Lo/cyj;->i(Lo/cyj;I)I

    .line 2238
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Set Sending flag true."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2239
    const/4 v8, 0x0

    .line 2240
    invoke-virtual {v7}, Lo/cye;->c()[B

    move-result-object v9

    .line 2242
    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-virtual {v7}, Lo/cye;->f()I

    move-result v1

    invoke-static {v0, v1}, Lo/cyj;->h(Lo/cyj;I)I

    .line 2243
    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->i(Lo/cyj;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_12

    .line 2245
    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-virtual {v7}, Lo/cye;->g()I

    move-result v1

    invoke-static {v0, v1}, Lo/cyj;->b(Lo/cyj;I)I

    .line 2246
    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-virtual {v7}, Lo/cye;->h()I

    move-result v1

    invoke-static {v0, v1}, Lo/cyj;->c(Lo/cyj;I)I

    .line 2247
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "SEND_COMMAND Msg with mServiceID = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v4}, Lo/cyj;->v(Lo/cyj;)I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " mCommandID = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v4}, Lo/cyj;->y(Lo/cyj;)I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2249
    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->j(Lo/cyj;)I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_f

    .line 2251
    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-virtual {v7}, Lo/cye;->c()[B

    move-result-object v1

    invoke-virtual {v7}, Lo/cye;->f()I

    move-result v2

    invoke-static {v0, v1, v2}, Lo/cyj;->b(Lo/cyj;[BI)[B

    move-result-object v8

    goto/16 :goto_c

    .line 2254
    :cond_f
    invoke-virtual {v7}, Lo/cye;->i()Z

    move-result v0

    if-eqz v0, :cond_11

    .line 2255
    const/4 v0, 0x0

    aget-byte v0, v9, v0

    const/4 v1, 0x7

    if-ne v1, v0, :cond_10

    const/4 v0, 0x1

    aget-byte v0, v9, v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_10

    .line 2256
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Need change command ID for set userInfo."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2257
    const/16 v0, 0x9

    const/4 v1, 0x1

    aput-byte v0, v9, v1

    .line 2258
    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    const/16 v1, 0x9

    invoke-static {v0, v1}, Lo/cyj;->c(Lo/cyj;I)I

    goto :goto_9

    .line 2259
    :cond_10
    const/4 v0, 0x0

    aget-byte v0, v9, v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_11

    const/4 v0, 0x1

    aget-byte v0, v9, v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_11

    .line 2260
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Need change command ID for send message."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2261
    const/4 v0, 0x3

    const/4 v1, 0x1

    aput-byte v0, v9, v1

    .line 2262
    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    const/4 v1, 0x3

    invoke-static {v0, v1}, Lo/cyj;->c(Lo/cyj;I)I

    .line 2266
    :cond_11
    :goto_9
    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-virtual {v0, v9}, Lo/cyj;->b([B)[B

    move-result-object v8

    goto :goto_c

    .line 2271
    :cond_12
    const-wide/16 v0, 0x5

    :try_start_2
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 2274
    goto :goto_a

    .line 2272
    :catch_0
    move-exception v10

    .line 2273
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Exception is :"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v10}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2277
    :goto_a
    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    const/4 v1, 0x0

    aget-byte v1, v9, v1

    invoke-static {v0, v1}, Lo/cyj;->b(Lo/cyj;I)I

    .line 2279
    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    const/4 v1, 0x1

    aget-byte v1, v9, v1

    invoke-static {v0, v1}, Lo/cyj;->c(Lo/cyj;I)I

    .line 2281
    invoke-virtual {v7}, Lo/cye;->a()I

    move-result v0

    add-int/lit8 v10, v0, -0x2

    .line 2282
    new-array v11, v10, [B

    .line 2283
    const/4 v12, 0x0

    :goto_b
    if-ge v12, v10, :cond_13

    .line 2284
    add-int/lit8 v0, v12, 0x2

    aget-byte v0, v9, v0

    aput-byte v0, v11, v12

    .line 2283
    add-int/lit8 v12, v12, 0x1

    goto :goto_b

    .line 2286
    :cond_13
    move-object v8, v11

    .line 2289
    :goto_c
    const/4 v0, 0x0

    if-eq v0, v8, :cond_1a

    .line 2291
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Is command need encrypt ?: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v7}, Lo/cye;->i()Z

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2292
    invoke-virtual {v7}, Lo/cye;->i()Z

    move-result v0

    if-eqz v0, :cond_15

    .line 2294
    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->a(Lo/cyj;)Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_14

    .line 2295
    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->x(Lo/cyj;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v1}, Lo/cyj;->a(Lo/cyj;)Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v8, v1}, Lo/cxo;->e(Landroid/content/Context;[BLjava/lang/String;)[B

    move-result-object v8

    goto :goto_d

    .line 2297
    :cond_14
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "mBTDevice is null."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2300
    :cond_15
    :goto_d
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "After encryptTLVs & transferV2ToV1, btV1Command = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {v8}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2302
    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->B(Lo/cyj;)Lo/cye;

    move-result-object v0

    invoke-virtual {v7}, Lo/cye;->d()Z

    move-result v1

    invoke-virtual {v0, v1}, Lo/cye;->b(Z)V

    .line 2303
    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->B(Lo/cyj;)Lo/cye;

    move-result-object v0

    invoke-virtual {v7}, Lo/cye;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cye;->a(Ljava/lang/String;)V

    .line 2304
    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->B(Lo/cyj;)Lo/cye;

    move-result-object v0

    invoke-virtual {v7}, Lo/cye;->k()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/cye;->d(I)V

    .line 2305
    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->B(Lo/cyj;)Lo/cye;

    move-result-object v0

    invoke-virtual {v7}, Lo/cye;->e()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/cye;->b(I)V

    .line 2306
    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->B(Lo/cyj;)Lo/cye;

    move-result-object v0

    invoke-virtual {v0, v8}, Lo/cye;->a([B)V

    .line 2307
    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->B(Lo/cyj;)Lo/cye;

    move-result-object v0

    array-length v1, v8

    invoke-virtual {v0, v1}, Lo/cye;->a(I)V

    .line 2308
    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->B(Lo/cyj;)Lo/cye;

    move-result-object v0

    invoke-virtual {v7}, Lo/cye;->f()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/cye;->e(I)V

    .line 2309
    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->B(Lo/cyj;)Lo/cye;

    move-result-object v0

    invoke-virtual {v7}, Lo/cye;->i()Z

    move-result v1

    invoke-virtual {v0, v1}, Lo/cye;->d(Z)V

    .line 2310
    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->B(Lo/cyj;)Lo/cye;

    move-result-object v0

    invoke-virtual {v7}, Lo/cye;->g()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/cye;->c(I)V

    .line 2311
    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->B(Lo/cyj;)Lo/cye;

    move-result-object v0

    invoke-virtual {v7}, Lo/cye;->h()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/cye;->f(I)V

    .line 2314
    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/cyj;->d(Lo/cyj;I)I

    .line 2317
    :cond_16
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Send V1 Command timeout with ReSendTime = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v4}, Lo/cyj;->D(Lo/cyj;)I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2318
    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->D(Lo/cyj;)I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_17

    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->v(Lo/cyj;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_17

    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->y(Lo/cyj;)I

    move-result v0

    const/4 v1, 0x5

    if-ne v1, v0, :cond_17

    .line 2320
    invoke-static {}, Lo/cxo;->c()Lo/cye;

    move-result-object v10

    .line 2321
    invoke-virtual {v10}, Lo/cye;->c()[B

    move-result-object v11

    .line 2322
    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-virtual {v0, v11}, Lo/cyj;->b([B)[B

    move-result-object v12

    .line 2323
    const/4 v0, 0x0

    if-eq v0, v12, :cond_17

    .line 2324
    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->B(Lo/cyj;)Lo/cye;

    move-result-object v0

    invoke-virtual {v0, v12}, Lo/cye;->a([B)V

    .line 2325
    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->B(Lo/cyj;)Lo/cye;

    move-result-object v0

    array-length v1, v12

    invoke-virtual {v0, v1}, Lo/cye;->a(I)V

    .line 2328
    :cond_17
    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    iget-object v1, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v1}, Lo/cyj;->B(Lo/cyj;)Lo/cye;

    move-result-object v1

    invoke-static {v0, v1}, Lo/cyj;->e(Lo/cyj;Lo/cye;)Z

    .line 2329
    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->D(Lo/cyj;)I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_18

    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->k(Lo/cyj;)I

    move-result v0

    iget-object v1, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v1}, Lo/cyj;->D(Lo/cyj;)I

    move-result v1

    if-gt v0, v1, :cond_16

    .line 2332
    :cond_18
    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->f(Lo/cyj;)Ljava/lang/Object;

    move-result-object v10

    monitor-enter v10

    .line 2334
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    :try_start_3
    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Remove V1 Command from list, iCommandIndex = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2335
    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->c(Lo/cyj;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_19

    if-ltz v6, :cond_19

    .line 2336
    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->c(Lo/cyj;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v6}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    goto :goto_e

    .line 2338
    :cond_19
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Remove fail for index is not in rang, mBTDeviceCommandList.size() = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v4}, Lo/cyj;->c(Lo/cyj;)Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 2340
    :goto_e
    monitor-exit v10

    goto :goto_f

    :catchall_2
    move-exception v13

    monitor-exit v10

    throw v13

    .line 2345
    :cond_1a
    :goto_f
    goto :goto_10

    .line 2346
    :cond_1b
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "mBTDeviceCommandList has no command."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2348
    goto :goto_10

    .line 2350
    :sswitch_1
    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->l(Lo/cyj;)Lo/cyn;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1c

    .line 2351
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Receive CONNECT_TIMEOUT_COMMAND Message."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2353
    const-string v0, "DEVMGR_SETTING"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BTDeviceSendCommandUtil"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " Start to disconnect service."

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2354
    const v0, 0x1eab91

    invoke-static {v0}, Lo/cyc;->e(I)V

    .line 2355
    iget-object v0, p0, Lo/cyj$e;->d:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->l(Lo/cyj;)Lo/cyn;

    move-result-object v0

    invoke-interface {v0}, Lo/cyn;->a()V

    .line 2361
    :cond_1c
    :goto_10
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch
.end method
