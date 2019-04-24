.class public Lo/acg;
.super Lo/acp;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/acg$c;,
        Lo/acg$a;,
        Lo/acg$k;,
        Lo/acg$b;,
        Lo/acg$d;,
        Lo/acg$g;,
        Lo/acg$e;
    }
.end annotation


# instance fields
.field private a:Landroid/bluetooth/BluetoothGattCallback;

.field private b:Z

.field protected c:Landroid/bluetooth/BluetoothDevice;

.field private d:Landroid/bluetooth/BluetoothGattCallback;

.field private e:Landroid/bluetooth/BluetoothGatt;

.field private f:Landroid/os/HandlerThread;

.field private h:I

.field private i:Landroid/os/Handler;

.field private k:I


# direct methods
.method private constructor <init>(Landroid/bluetooth/BluetoothDevice;)V
    .locals 4

    .line 79
    invoke-direct {p0}, Lo/acp;-><init>()V

    .line 29
    const/4 v0, 0x0

    iput-object v0, p0, Lo/acg;->c:Landroid/bluetooth/BluetoothDevice;

    .line 33
    new-instance v0, Lo/acg$c;

    invoke-direct {v0, p0, p0}, Lo/acg$c;-><init>(Lo/acg;Lo/acg;)V

    iput-object v0, p0, Lo/acg;->d:Landroid/bluetooth/BluetoothGattCallback;

    .line 35
    const/4 v0, 0x0

    iput-object v0, p0, Lo/acg;->a:Landroid/bluetooth/BluetoothGattCallback;

    .line 37
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/acg;->b:Z

    .line 39
    const/4 v0, 0x0

    iput-object v0, p0, Lo/acg;->f:Landroid/os/HandlerThread;

    .line 40
    const/4 v0, 0x0

    iput-object v0, p0, Lo/acg;->i:Landroid/os/Handler;

    .line 43
    const/4 v0, 0x0

    iput v0, p0, Lo/acg;->k:I

    .line 45
    const/4 v0, 0x2

    iput v0, p0, Lo/acg;->h:I

    .line 81
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " BleDevice is constructed"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 83
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/bluetooth/BluetoothAdapter;->getRemoteDevice(Ljava/lang/String;)Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    iput-object v0, p0, Lo/acg;->c:Landroid/bluetooth/BluetoothDevice;

    .line 85
    iget-object v0, p0, Lo/acg;->c:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-super {p0, v0}, Lo/acp;->b(Ljava/lang/String;)V

    .line 86
    return-void
.end method

.method static synthetic a(Lo/acg;)Landroid/os/Handler;
    .locals 1

    .line 27
    iget-object v0, p0, Lo/acg;->i:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic b(Lo/acg;)I
    .locals 2

    .line 27
    iget v0, p0, Lo/acg;->k:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lo/acg;->k:I

    return v0
.end method

.method static synthetic c(Lo/acg;)I
    .locals 1

    .line 27
    iget v0, p0, Lo/acg;->k:I

    return v0
.end method

.method public static c(Landroid/bluetooth/BluetoothDevice;)Lo/acg;
    .locals 1

    .line 73
    if-eqz p0, :cond_0

    .line 74
    new-instance v0, Lo/acg;

    invoke-direct {v0, p0}, Lo/acg;-><init>(Landroid/bluetooth/BluetoothDevice;)V

    return-object v0

    .line 76
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method static synthetic c(Lo/acg;Z)Z
    .locals 0

    .line 27
    iput-boolean p1, p0, Lo/acg;->b:Z

    return p1
.end method

.method static synthetic d(Lo/acg;)I
    .locals 1

    .line 27
    iget v0, p0, Lo/acg;->h:I

    return v0
.end method

.method static synthetic e(Lo/acg;)Landroid/bluetooth/BluetoothGattCallback;
    .locals 1

    .line 27
    iget-object v0, p0, Lo/acg;->a:Landroid/bluetooth/BluetoothGattCallback;

    return-object v0
.end method

.method private g()V
    .locals 2

    .line 126
    invoke-virtual {p0}, Lo/acg;->f()V

    .line 129
    iget-object v0, p0, Lo/acg;->i:Landroid/os/Handler;

    if-nez v0, :cond_2

    .line 130
    iget-object v0, p0, Lo/acg;->f:Landroid/os/HandlerThread;

    if-nez v0, :cond_0

    .line 131
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "ble"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lo/acg;->f:Landroid/os/HandlerThread;

    .line 134
    :cond_0
    iget-object v0, p0, Lo/acg;->f:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->isAlive()Z

    move-result v0

    if-nez v0, :cond_1

    .line 135
    iget-object v0, p0, Lo/acg;->f:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 138
    :cond_1
    new-instance v0, Landroid/os/Handler;

    iget-object v1, p0, Lo/acg;->f:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lo/acg;->i:Landroid/os/Handler;

    .line 140
    :cond_2
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 69
    iget-object v0, p0, Lo/acg;->c:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public a(Lo/abx;)Z
    .locals 4

    .line 145
    iget-object v0, p0, Lo/acg;->c:Landroid/bluetooth/BluetoothDevice;

    if-eqz v0, :cond_1

    .line 147
    invoke-direct {p0}, Lo/acg;->g()V

    .line 149
    iget-object v0, p0, Lo/acg;->c:Landroid/bluetooth/BluetoothDevice;

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lo/acg;->d:Landroid/bluetooth/BluetoothGattCallback;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3, v2}, Landroid/bluetooth/BluetoothDevice;->connectGatt(Landroid/content/Context;ZLandroid/bluetooth/BluetoothGattCallback;)Landroid/bluetooth/BluetoothGatt;

    move-result-object v0

    iput-object v0, p0, Lo/acg;->e:Landroid/bluetooth/BluetoothGatt;

    .line 151
    iget-object v0, p0, Lo/acg;->e:Landroid/bluetooth/BluetoothGatt;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 153
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public a(Lo/aby;)Z
    .locals 1

    .line 90
    const/4 v0, 0x7

    invoke-interface {p1, v0}, Lo/aby;->onStateChanged(I)V

    .line 91
    const/4 v0, 0x1

    return v0
.end method

.method public b()Ljava/lang/String;
    .locals 4

    .line 60
    iget-object v0, p0, Lo/acg;->c:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 61
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "BleDevice name:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/acg;->c:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v3}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 62
    iget-object v0, p0, Lo/acg;->c:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 64
    :cond_0
    invoke-super {p0}, Lo/acp;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public b(I)Z
    .locals 6

    .line 160
    if-gtz p1, :cond_0

    .line 161
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "invalid parameter of second "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 164
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/acg;->a(Lo/abx;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 165
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    int-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v3

    .line 166
    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v0, v3, v0

    if-lez v0, :cond_2

    .line 168
    const-wide/16 v0, 0xc8

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V

    .line 169
    const-wide/16 v0, 0xc8

    sub-long v0, v3, v0

    move-wide v3, v0

    .line 170
    iget-boolean v0, p0, Lo/acg;->b:Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v0, :cond_1

    .line 171
    goto :goto_1

    .line 175
    :cond_1
    goto :goto_0

    .line 173
    :catch_0
    move-exception v5

    .line 174
    invoke-virtual {v5}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 175
    goto :goto_0

    .line 179
    :cond_2
    :goto_1
    iget-boolean v0, p0, Lo/acg;->b:Z

    return v0
.end method

.method public c(Landroid/bluetooth/BluetoothGattCallback;)V
    .locals 0

    .line 198
    iput-object p1, p0, Lo/acg;->a:Landroid/bluetooth/BluetoothGattCallback;

    .line 199
    return-void
.end method

.method public c()Z
    .locals 6

    .line 96
    iget-object v0, p0, Lo/acg;->c:Landroid/bluetooth/BluetoothDevice;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/acg;->c:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothDevice;->getBondState()I

    move-result v0

    const/16 v1, 0xc

    if-ne v0, v1, :cond_0

    .line 98
    const/4 v4, 0x0

    .line 100
    :try_start_0
    const-class v0, Landroid/bluetooth/BluetoothDevice;

    const-string v1, "removeBond"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    .line 101
    iget-object v0, p0, Lo/acg;->c:Landroid/bluetooth/BluetoothDevice;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4, v0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_2

    move-result v0

    return v0

    .line 102
    :catch_0
    move-exception v5

    .line 103
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/IllegalAccessException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 108
    goto :goto_0

    .line 104
    :catch_1
    move-exception v5

    .line 105
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/NoSuchMethodException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 108
    goto :goto_0

    .line 106
    :catch_2
    move-exception v5

    .line 107
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/reflect/InvocationTargetException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 110
    :cond_0
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public d()Z
    .locals 4

    .line 115
    iget-object v0, p0, Lo/acg;->c:Landroid/bluetooth/BluetoothDevice;

    if-eqz v0, :cond_1

    .line 116
    invoke-direct {p0}, Lo/acg;->g()V

    .line 118
    iget-object v0, p0, Lo/acg;->c:Landroid/bluetooth/BluetoothDevice;

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lo/acg;->d:Landroid/bluetooth/BluetoothGattCallback;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Landroid/bluetooth/BluetoothDevice;->connectGatt(Landroid/content/Context;ZLandroid/bluetooth/BluetoothGattCallback;)Landroid/bluetooth/BluetoothGatt;

    move-result-object v0

    iput-object v0, p0, Lo/acg;->e:Landroid/bluetooth/BluetoothGatt;

    .line 120
    iget-object v0, p0, Lo/acg;->e:Landroid/bluetooth/BluetoothGatt;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 122
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 55
    invoke-virtual {p0}, Lo/acg;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public f()V
    .locals 5

    .line 184
    iget-object v0, p0, Lo/acg;->e:Landroid/bluetooth/BluetoothGatt;

    if-eqz v0, :cond_0

    .line 185
    iget-object v0, p0, Lo/acg;->e:Landroid/bluetooth/BluetoothGatt;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothGatt;->disconnect()V

    .line 187
    const-wide/16 v0, 0xc8

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V

    .line 188
    iget-object v0, p0, Lo/acg;->e:Landroid/bluetooth/BluetoothGatt;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothGatt;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 191
    goto :goto_0

    .line 189
    :catch_0
    move-exception v4

    .line 190
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "disconnect"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 192
    :goto_0
    const/4 v0, 0x0

    iput-object v0, p0, Lo/acg;->e:Landroid/bluetooth/BluetoothGatt;

    .line 194
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/acg;->b:Z

    .line 195
    return-void
.end method

.method protected finalize()V
    .locals 5

    .line 204
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lo/acg;->c:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v3}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " BleDevice is finalized"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 206
    iget-object v0, p0, Lo/acg;->f:Landroid/os/HandlerThread;

    if-eqz v0, :cond_0

    .line 207
    iget-object v0, p0, Lo/acg;->f:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z

    .line 211
    :cond_0
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->finalize()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 214
    goto :goto_0

    .line 212
    :catch_0
    move-exception v4

    .line 213
    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 216
    :goto_0
    return-void
.end method
