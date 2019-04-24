.class public Lo/adg;
.super Lo/afu;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/adg$e;
    }
.end annotation


# instance fields
.field private a:Landroid/bluetooth/BluetoothGatt;

.field private c:Landroid/os/HandlerThread;

.field private d:Lo/abx;

.field private e:Lo/adi;

.field private f:I

.field private g:Z

.field private h:Z

.field private i:I

.field private k:Lo/adg$e;

.field private m:Landroid/bluetooth/BluetoothGattCallback;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 81
    invoke-direct {p0}, Lo/afu;-><init>()V

    .line 49
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "PluginDevice_PluginDevice"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lo/adg;->c:Landroid/os/HandlerThread;

    .line 50
    const/4 v0, 0x0

    iput-object v0, p0, Lo/adg;->k:Lo/adg$e;

    .line 64
    const/4 v0, 0x0

    iput v0, p0, Lo/adg;->f:I

    .line 70
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/adg;->g:Z

    .line 71
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/adg;->h:Z

    .line 245
    new-instance v0, Lo/adg$4;

    invoke-direct {v0, p0}, Lo/adg$4;-><init>(Lo/adg;)V

    iput-object v0, p0, Lo/adg;->m:Landroid/bluetooth/BluetoothGattCallback;

    .line 82
    new-instance v0, Lo/adi;

    invoke-direct {v0}, Lo/adi;-><init>()V

    iput-object v0, p0, Lo/adg;->e:Lo/adi;

    .line 83
    invoke-direct {p0}, Lo/adg;->a()V

    .line 84
    return-void
.end method

.method static synthetic a(Lo/adg;)I
    .locals 1

    .line 29
    iget v0, p0, Lo/adg;->f:I

    return v0
.end method

.method private a()V
    .locals 2

    .line 87
    iget-object v0, p0, Lo/adg;->c:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 88
    new-instance v0, Lo/adg$e;

    iget-object v1, p0, Lo/adg;->c:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lo/adg$e;-><init>(Lo/adg;Landroid/os/Looper;)V

    iput-object v0, p0, Lo/adg;->k:Lo/adg$e;

    .line 89
    return-void
.end method

.method private a(Landroid/bluetooth/BluetoothGatt;Lo/adg$e;)V
    .locals 4

    .line 233
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 234
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start to close gatt..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 235
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->close()V

    .line 236
    const/4 p1, 0x0

    .line 238
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Lo/adg$e;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 239
    return-void
.end method

.method static synthetic b(Lo/adg;)I
    .locals 2

    .line 29
    iget v0, p0, Lo/adg;->f:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lo/adg;->f:I

    return v0
.end method

.method static synthetic b(Lo/adg;Landroid/bluetooth/BluetoothGatt;)Landroid/bluetooth/BluetoothGatt;
    .locals 0

    .line 29
    iput-object p1, p0, Lo/adg;->a:Landroid/bluetooth/BluetoothGatt;

    return-object p1
.end method

.method static synthetic b(Lo/adg;Landroid/bluetooth/BluetoothGatt;Lo/adg$e;)V
    .locals 0

    .line 29
    invoke-direct {p0, p1, p2}, Lo/adg;->a(Landroid/bluetooth/BluetoothGatt;Lo/adg$e;)V

    return-void
.end method

.method private c(Landroid/bluetooth/BluetoothGatt;Z)V
    .locals 7

    .line 162
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HRP setCharNotification() enabled = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 164
    const-string v0, "0000180d-0000-1000-8000-00805f9b34fb"

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/bluetooth/BluetoothGatt;->getService(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattService;

    move-result-object v4

    .line 165
    if-eqz v4, :cond_2

    .line 166
    const-string v0, "00002a37-0000-1000-8000-00805f9b34fb"

    .line 167
    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/bluetooth/BluetoothGattService;->getCharacteristic(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v5

    .line 169
    if-eqz v5, :cond_2

    .line 170
    invoke-virtual {p1, v5, p2}, Landroid/bluetooth/BluetoothGatt;->setCharacteristicNotification(Landroid/bluetooth/BluetoothGattCharacteristic;Z)Z

    .line 171
    const-string v0, "00002902-0000-1000-8000-00805f9b34fb"

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/bluetooth/BluetoothGattCharacteristic;->getDescriptor(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattDescriptor;

    move-result-object v6

    .line 172
    const/4 v0, 0x0

    if-ne v0, v6, :cond_0

    .line 173
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HeartRateMeasureController setCharNotification descriptor == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 175
    :cond_0
    if-eqz p2, :cond_1

    .line 176
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HRP enable notification"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 177
    sget-object v0, Landroid/bluetooth/BluetoothGattDescriptor;->ENABLE_NOTIFICATION_VALUE:[B

    invoke-virtual {v6, v0}, Landroid/bluetooth/BluetoothGattDescriptor;->setValue([B)Z

    goto :goto_0

    .line 179
    :cond_1
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HRP disable notification"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 180
    sget-object v0, Landroid/bluetooth/BluetoothGattDescriptor;->DISABLE_NOTIFICATION_VALUE:[B

    invoke-virtual {v6, v0}, Landroid/bluetooth/BluetoothGattDescriptor;->setValue([B)Z

    .line 182
    :goto_0
    invoke-virtual {p1, v6}, Landroid/bluetooth/BluetoothGatt;->writeDescriptor(Landroid/bluetooth/BluetoothGattDescriptor;)Z

    .line 186
    :cond_2
    :goto_1
    return-void
.end method

.method static synthetic c(Lo/adg;)Z
    .locals 1

    .line 29
    iget-boolean v0, p0, Lo/adg;->h:Z

    return v0
.end method

.method static synthetic d(Lo/adg;I)I
    .locals 0

    .line 29
    iput p1, p0, Lo/adg;->i:I

    return p1
.end method

.method static synthetic d(Lo/adg;)Landroid/bluetooth/BluetoothGatt;
    .locals 1

    .line 29
    iget-object v0, p0, Lo/adg;->a:Landroid/bluetooth/BluetoothGatt;

    return-object v0
.end method

.method static synthetic e(Lo/adg;)Lo/adg$e;
    .locals 1

    .line 29
    iget-object v0, p0, Lo/adg;->k:Lo/adg$e;

    return-object v0
.end method

.method static synthetic e(Lo/adg;Lo/adi;)Lo/adi;
    .locals 0

    .line 29
    iput-object p1, p0, Lo/adg;->e:Lo/adi;

    return-object p1
.end method

.method static synthetic e(Lo/adg;Landroid/bluetooth/BluetoothGatt;Z)V
    .locals 0

    .line 29
    invoke-direct {p0, p1, p2}, Lo/adg;->c(Landroid/bluetooth/BluetoothGatt;Z)V

    return-void
.end method

.method static synthetic e(Lo/adg;Z)Z
    .locals 0

    .line 29
    iput-boolean p1, p0, Lo/adg;->h:Z

    return p1
.end method

.method static synthetic f(Lo/adg;)Z
    .locals 1

    .line 29
    iget-boolean v0, p0, Lo/adg;->g:Z

    return v0
.end method

.method static synthetic g(Lo/adg;)Lo/acg;
    .locals 1

    .line 29
    iget-object v0, p0, Lo/adg;->b:Lo/acg;

    return-object v0
.end method

.method static synthetic h(Lo/adg;)Lo/acg;
    .locals 1

    .line 29
    iget-object v0, p0, Lo/adg;->b:Lo/acg;

    return-object v0
.end method

.method static synthetic i(Lo/adg;)Lo/acg;
    .locals 1

    .line 29
    iget-object v0, p0, Lo/adg;->b:Lo/acg;

    return-object v0
.end method

.method static synthetic k(Lo/adg;)Lo/abx;
    .locals 1

    .line 29
    iget-object v0, p0, Lo/adg;->d:Lo/abx;

    return-object v0
.end method

.method static synthetic l(Lo/adg;)Lo/acg;
    .locals 1

    .line 29
    iget-object v0, p0, Lo/adg;->b:Lo/acg;

    return-object v0
.end method

.method static synthetic m(Lo/adg;)Lo/acg;
    .locals 1

    .line 29
    iget-object v0, p0, Lo/adg;->b:Lo/acg;

    return-object v0
.end method

.method static synthetic o(Lo/adg;)I
    .locals 1

    .line 29
    iget v0, p0, Lo/adg;->i:I

    return v0
.end method

.method static synthetic p(Lo/adg;)Lo/adi;
    .locals 1

    .line 29
    iget-object v0, p0, Lo/adg;->e:Lo/adi;

    return-object v0
.end method


# virtual methods
.method public a(Lo/acl;Lo/abx;Landroid/os/Bundle;)Z
    .locals 1

    .line 96
    invoke-super {p0, p1, p2, p3}, Lo/afu;->a(Lo/acl;Lo/abx;Landroid/os/Bundle;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 97
    invoke-virtual {p0, p2}, Lo/adg;->b(Lo/abx;)V

    .line 98
    const/4 v0, 0x1

    return v0

    .line 100
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public b(Lo/abx;)V
    .locals 0

    .line 78
    iput-object p1, p0, Lo/adg;->d:Lo/abx;

    .line 79
    return-void
.end method

.method public b()Z
    .locals 1

    .line 108
    const/4 v0, 0x1

    return v0
.end method

.method protected c()Landroid/bluetooth/BluetoothGattCallback;
    .locals 1

    .line 372
    iget-object v0, p0, Lo/adg;->m:Landroid/bluetooth/BluetoothGattCallback;

    return-object v0
.end method

.method public d()V
    .locals 1

    .line 145
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/adg;->g:Z

    .line 146
    const/4 v0, 0x0

    iput v0, p0, Lo/adg;->f:I

    .line 147
    iget-object v0, p0, Lo/adg;->a:Landroid/bluetooth/BluetoothGatt;

    if-eqz v0, :cond_0

    .line 148
    iget-object v0, p0, Lo/adg;->a:Landroid/bluetooth/BluetoothGatt;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothGatt;->close()V

    .line 150
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lo/adg;->a:Landroid/bluetooth/BluetoothGatt;

    .line 151
    const/4 v0, 0x0

    iput-object v0, p0, Lo/adg;->e:Lo/adi;

    .line 152
    const/4 v0, 0x0

    iput-object v0, p0, Lo/adg;->d:Lo/abx;

    .line 153
    return-void
.end method

.method public e()V
    .locals 5

    .line 117
    iget-object v0, p0, Lo/adg;->b:Lo/acg;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/acg;->c(Landroid/bluetooth/BluetoothGattCallback;)V

    .line 118
    iget-object v0, p0, Lo/adg;->a:Landroid/bluetooth/BluetoothGatt;

    if-eqz v0, :cond_0

    .line 119
    iget-object v0, p0, Lo/adg;->a:Landroid/bluetooth/BluetoothGatt;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lo/adg;->c(Landroid/bluetooth/BluetoothGatt;Z)V

    .line 121
    const-wide/16 v0, 0x12c

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 125
    goto :goto_0

    .line 123
    :catch_0
    move-exception v4

    .line 124
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 126
    :goto_0
    iget-object v0, p0, Lo/adg;->a:Landroid/bluetooth/BluetoothGatt;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothGatt;->disconnect()V

    .line 129
    :cond_0
    iget-object v0, p0, Lo/adg;->c:Landroid/os/HandlerThread;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 130
    iget-object v0, p0, Lo/adg;->k:Lo/adg$e;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 131
    iget-object v0, p0, Lo/adg;->k:Lo/adg$e;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/adg$e;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 133
    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lo/adg;->k:Lo/adg$e;

    .line 134
    iget-object v0, p0, Lo/adg;->c:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->quit()V

    .line 135
    const/4 v0, 0x0

    iput-object v0, p0, Lo/adg;->c:Landroid/os/HandlerThread;

    .line 137
    :cond_2
    return-void
.end method
