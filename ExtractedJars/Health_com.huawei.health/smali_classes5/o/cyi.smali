.class public Lo/cyi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cyi$d;
    }
.end annotation


# instance fields
.field private a:Lo/cyj;

.field private b:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

.field private c:Z

.field private d:Z

.field private e:I

.field private f:Landroid/os/Handler;

.field private g:Landroid/os/HandlerThread;

.field private i:Lo/cya;

.field private k:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    const/16 v0, 0x7d0

    iput v0, p0, Lo/cyi;->e:I

    .line 43
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/cyi;->d:Z

    .line 45
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cyi;->a:Lo/cyj;

    .line 47
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cyi;->c:Z

    .line 49
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cyi;->b:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 51
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cyi;->g:Landroid/os/HandlerThread;

    .line 53
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cyi;->f:Landroid/os/Handler;

    .line 55
    const-string v0, ""

    iput-object v0, p0, Lo/cyi;->k:Ljava/lang/String;

    .line 249
    new-instance v0, Lo/cyi$1;

    invoke-direct {v0, p0}, Lo/cyi$1;-><init>(Lo/cyi;)V

    iput-object v0, p0, Lo/cyi;->i:Lo/cya;

    .line 65
    invoke-direct {p0}, Lo/cyi;->e()V

    .line 66
    return-void
.end method

.method private a()I
    .locals 5

    .line 161
    invoke-direct {p0}, Lo/cyi;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 163
    const v0, 0x124f80

    return v0

    .line 165
    :cond_0
    iget v0, p0, Lo/cyi;->e:I

    const v1, 0x3e800

    if-ge v0, v1, :cond_1

    .line 166
    iget v0, p0, Lo/cyi;->e:I

    mul-int/lit8 v0, v0, 0x2

    iput v0, p0, Lo/cyi;->e:I

    .line 167
    const-string v0, "01"

    const-string v1, "BLEReconnectManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "getReconnectDelayMillis(): delayMillis = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget v4, p0, Lo/cyi;->e:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 168
    iget v0, p0, Lo/cyi;->e:I

    return v0

    .line 170
    :cond_1
    const-string v0, "01"

    const-string v1, "BLEReconnectManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "getReconnectDelayMillis(): delayMillis = 256000"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 171
    const v0, 0x3e800

    return v0
.end method

.method private a(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V
    .locals 6

    .line 206
    const-string v0, "01"

    const-string v1, "BLEReconnectManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter tryConnectBleDevice()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 207
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 208
    const-string v0, "0xA0200005"

    const-string v1, "01"

    const-string v2, "BLEReconnectManager"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "device is null."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 209
    return-void

    .line 212
    :cond_0
    const-string v0, "01"

    const-string v1, "BLEReconnectManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Device identify = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v4

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 213
    iget-object v0, p0, Lo/cyi;->a:Lo/cyj;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 215
    iget-object v0, p0, Lo/cyi;->a:Lo/cyj;

    invoke-virtual {v0}, Lo/cyj;->e()I

    move-result v0

    const/4 v1, 0x2

    if-eq v1, v0, :cond_2

    iget-object v0, p0, Lo/cyi;->a:Lo/cyj;

    .line 216
    invoke-virtual {v0}, Lo/cyj;->e()I

    move-result v0

    const/4 v1, 0x1

    if-eq v1, v0, :cond_2

    .line 218
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cyi;->c:Z

    .line 220
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/cyi;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 221
    const-string v0, "01"

    const-string v1, "BLEReconnectManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "User do not disable current device, so start to discover ble device."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 222
    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v0

    iget-object v1, p0, Lo/cyi;->i:Lo/cya;

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-virtual {v0, v2, v3, v1}, Lo/cxk;->a(Ljava/util/List;ILo/cya;)V

    goto :goto_0

    .line 224
    :cond_1
    const-string v0, "01"

    const-string v1, "BLEReconnectManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "User disabled current device, so do not need to connect wanted device."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 227
    :cond_2
    const-string v0, "01"

    const-string v1, "BLEReconnectManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "do not need reconnect with status = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lo/cyi;->a:Lo/cyj;

    invoke-virtual {v4}, Lo/cyj;->e()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 230
    :cond_3
    const-string v0, "01"

    const-string v1, "BLEReconnectManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "mSendCommandUtil is null."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 232
    :goto_0
    return-void
.end method

.method static synthetic a(Lo/cyi;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Lo/cyi;->i()V

    return-void
.end method

.method static synthetic a(Lo/cyi;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V
    .locals 0

    .line 29
    invoke-direct {p0, p1}, Lo/cyi;->c(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    return-void
.end method

.method static synthetic b(Lo/cyi;)I
    .locals 1

    .line 29
    invoke-direct {p0}, Lo/cyi;->a()I

    move-result v0

    return v0
.end method

.method private b(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V
    .locals 8

    .line 110
    const-string v0, "01"

    const-string v1, "BLEReconnectManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter reconnectBLEDevice()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 112
    iget-object v0, p0, Lo/cyi;->f:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 114
    iget-object v0, p0, Lo/cyi;->f:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v5

    .line 117
    invoke-direct {p0}, Lo/cyi;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 119
    iget-object v0, p0, Lo/cyi;->f:Landroid/os/Handler;

    const-wide/16 v1, 0xfa0

    invoke-virtual {v0, v5, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    goto :goto_0

    .line 122
    :cond_0
    invoke-direct {p0}, Lo/cyi;->a()I

    move-result v0

    int-to-long v6, v0

    .line 123
    const-string v0, "01"

    const-string v1, "BLEReconnectManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Delay Time is: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "ms"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 125
    iget-object v0, p0, Lo/cyi;->f:Landroid/os/Handler;

    invoke-virtual {v0, v5, v6, v7}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 128
    :goto_0
    return-void
.end method

.method static synthetic c(Lo/cyi;)Landroid/os/Handler;
    .locals 1

    .line 29
    iget-object v0, p0, Lo/cyi;->f:Landroid/os/Handler;

    return-object v0
.end method

.method private c(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V
    .locals 6

    .line 182
    const-string v0, "01"

    const-string v1, "BLEReconnectManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Enter reconnectBLEDeviceDelay()  with mIsCancel = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-boolean v4, p0, Lo/cyi;->d:Z

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 184
    iget-boolean v0, p0, Lo/cyi;->d:Z

    if-eqz v0, :cond_0

    .line 185
    const-string v0, "01"

    const-string v1, "BLEReconnectManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "device already connected so stop reconnect."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 186
    invoke-virtual {p0}, Lo/cyi;->d()V

    .line 187
    return-void

    .line 190
    :cond_0
    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v0

    invoke-virtual {v0}, Lo/cxk;->b()I

    move-result v5

    .line 191
    const/4 v0, 0x3

    if-ne v0, v5, :cond_1

    .line 192
    const-string v0, "01"

    const-string v1, "BLEReconnectManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "BT switch is on."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 193
    invoke-direct {p0, p1}, Lo/cyi;->a(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    goto :goto_0

    .line 196
    :cond_1
    const-string v0, "01"

    const-string v1, "BLEReconnectManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "BT switch is not on."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 197
    invoke-virtual {p0}, Lo/cyi;->d()V

    .line 199
    :goto_0
    return-void
.end method

.method static synthetic c(Lo/cyi;Ljava/lang/String;)Z
    .locals 1

    .line 29
    invoke-direct {p0, p1}, Lo/cyi;->d(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method private d(Ljava/lang/String;Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;)V
    .locals 6

    .line 310
    iget-boolean v0, p0, Lo/cyi;->c:Z

    if-eqz v0, :cond_0

    .line 311
    return-void

    .line 314
    :cond_0
    invoke-static {p3, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v5

    .line 315
    if-eqz v5, :cond_2

    .line 316
    const-string v0, "01"

    const-string v1, "BLEReconnectManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Find the wanted device."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 317
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/cyi;->c:Z

    .line 318
    const-string v0, "01"

    const-string v1, "BLEReconnectManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter verifySearchDestDeviceToReconnect()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->a(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 319
    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v0

    invoke-virtual {v0}, Lo/cxk;->e()V

    .line 320
    invoke-direct {p0, p3}, Lo/cyi;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 321
    const-string v0, "01"

    const-string v1, "BLEReconnectManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "User do not disable current device, so start to connect wanted device."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 322
    invoke-direct {p0}, Lo/cyi;->i()V

    goto :goto_0

    .line 324
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

    goto :goto_0

    .line 327
    :cond_2
    const-string v0, "01"

    const-string v1, "BLEReconnectManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "verifySearchDestDeviceToReconnect(): find different device."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 329
    :goto_0
    return-void
.end method

.method private d(Ljava/lang/String;)Z
    .locals 5

    .line 367
    const-string v0, "01"

    const-string v1, "BLEReconnectManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "isWantedReconnectDeviceExist with identify = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v4

    invoke-virtual {v4, p1}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 368
    iget-object v0, p0, Lo/cyi;->k:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method static synthetic d(Lo/cyi;)Z
    .locals 1

    .line 29
    iget-boolean v0, p0, Lo/cyi;->d:Z

    return v0
.end method

.method static synthetic e(Lo/cyi;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;
    .locals 1

    .line 29
    iget-object v0, p0, Lo/cyi;->b:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    return-object v0
.end method

.method private e()V
    .locals 2

    .line 73
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "BLEReconnectManager"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lo/cyi;->g:Landroid/os/HandlerThread;

    .line 74
    iget-object v0, p0, Lo/cyi;->g:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 75
    new-instance v0, Lo/cyi$d;

    iget-object v1, p0, Lo/cyi;->g:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lo/cyi$d;-><init>(Lo/cyi;Landroid/os/Looper;)V

    iput-object v0, p0, Lo/cyi;->f:Landroid/os/Handler;

    .line 76
    return-void
.end method

.method static synthetic e(Lo/cyi;Ljava/lang/String;Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;)V
    .locals 0

    .line 29
    invoke-direct {p0, p1, p2, p3}, Lo/cyi;->d(Ljava/lang/String;Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;)V

    return-void
.end method

.method private h()Z
    .locals 8

    .line 377
    :try_start_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v1, "com.huawei.iconnect"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    .line 378
    const-string v0, "01"

    const-string v1, "BLEReconnectManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "iconnect pkg exist."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 379
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v5

    .line 380
    const-string v0, "com.huawei.iconnect"

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v6

    .line 381
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    .line 382
    iget v7, v6, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 383
    const-string v0, "01"

    const-string v1, "BLEReconnectManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "iconnect code:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 384
    const/4 v0, 0x1

    if-le v7, v0, :cond_0

    .line 385
    const/4 v0, 0x1

    return v0

    .line 388
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 389
    :catch_0
    move-exception v5

    .line 390
    const-string v0, "01"

    const-string v1, "BLEReconnectManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "iconnect pkg do not exist."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 391
    const/4 v0, 0x0

    return v0
.end method

.method private i()V
    .locals 5

    .line 238
    const-string v0, "01"

    const-string v1, "BLEReconnectManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter doConnectBleDevice()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 239
    iget-object v0, p0, Lo/cyi;->a:Lo/cyj;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 240
    iget-object v0, p0, Lo/cyi;->a:Lo/cyj;

    invoke-virtual {v0}, Lo/cyj;->b()V

    goto :goto_0

    .line 242
    :cond_0
    const-string v0, "01"

    const-string v1, "BLEReconnectManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "mSendCommandUtil is null."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 244
    :goto_0
    return-void
.end method


# virtual methods
.method public b()Lo/cyj;
    .locals 5

    .line 349
    const-string v0, "01"

    const-string v1, "BLEReconnectManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter getSendCommandUtilInfo()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 350
    iget-object v0, p0, Lo/cyi;->a:Lo/cyj;

    return-object v0
.end method

.method public b(Ljava/lang/String;)V
    .locals 5

    .line 362
    const-string v0, "01"

    const-string v1, "BLEReconnectManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "set identify = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v4

    invoke-virtual {v4, p1}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 363
    iput-object p1, p0, Lo/cyi;->k:Ljava/lang/String;

    .line 364
    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 6

    .line 357
    const-string v0, "01"

    const-string v1, "BLEReconnectManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "get identify = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v4

    iget-object v5, p0, Lo/cyi;->k:Ljava/lang/String;

    invoke-virtual {v4, v5}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 358
    iget-object v0, p0, Lo/cyi;->k:Ljava/lang/String;

    return-object v0
.end method

.method public d()V
    .locals 5

    .line 99
    const-string v0, "01"

    const-string v1, "BLEReconnectManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter stopReconnectBLE()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 100
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/cyi;->d:Z

    .line 101
    const/16 v0, 0x7d0

    iput v0, p0, Lo/cyi;->e:I

    .line 102
    iget-object v0, p0, Lo/cyi;->f:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 103
    return-void
.end method

.method public d(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V
    .locals 6

    .line 83
    const-string v0, "01"

    const-string v1, "BLEReconnectManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter tryToReconnectBLE()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 84
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 85
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v5

    .line 86
    iput-object p1, p0, Lo/cyi;->b:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 87
    invoke-direct {p0, v5}, Lo/cyi;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 88
    const-string v0, "01"

    const-string v1, "BLEReconnectManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "User do not disconnect device so start to find device."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 89
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cyi;->d:Z

    .line 90
    invoke-direct {p0, p1}, Lo/cyi;->b(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    .line 93
    :cond_0
    return-void
.end method

.method public e(Lo/cyj;)V
    .locals 6

    .line 336
    const-string v0, "01"

    const-string v1, "BLEReconnectManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter setSendCommandUtilInfo()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 337
    iput-object p1, p0, Lo/cyi;->a:Lo/cyj;

    .line 338
    iget-object v0, p0, Lo/cyi;->a:Lo/cyj;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/cyi;->a:Lo/cyj;

    invoke-virtual {v0}, Lo/cyj;->k()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 339
    iget-object v0, p0, Lo/cyi;->a:Lo/cyj;

    invoke-virtual {v0}, Lo/cyj;->k()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v5

    .line 340
    const-string v0, "01"

    const-string v1, "BLEReconnectManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "set identify = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v4

    invoke-virtual {v4, v5}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 342
    :cond_0
    return-void
.end method
