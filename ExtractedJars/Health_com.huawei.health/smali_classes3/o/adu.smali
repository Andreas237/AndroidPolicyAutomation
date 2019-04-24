.class public Lo/adu;
.super Lo/afu;
.source "SourceFile"


# static fields
.field private static c:Z

.field private static d:J


# instance fields
.field private a:I

.field private e:Landroid/content/Context;

.field private f:Landroid/bluetooth/BluetoothGattService;

.field private g:Landroid/bluetooth/BluetoothGatt;

.field private h:Landroid/bluetooth/BluetoothGattCharacteristic;

.field private i:Landroid/bluetooth/BluetoothAdapter;

.field private k:Landroid/bluetooth/BluetoothManager;

.field private l:Lo/abx;

.field private final m:Landroid/bluetooth/BluetoothGattCallback;

.field private n:Landroid/bluetooth/BluetoothGattDescriptor;

.field private o:Landroid/bluetooth/BluetoothGattCharacteristic;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 31
    const-wide/16 v0, 0x1388

    sput-wide v0, Lo/adu;->d:J

    .line 32
    const/4 v0, 0x1

    sput-boolean v0, Lo/adu;->c:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 54
    invoke-direct {p0}, Lo/afu;-><init>()V

    .line 33
    const/4 v0, 0x0

    iput v0, p0, Lo/adu;->a:I

    .line 44
    const/4 v0, 0x0

    iput-object v0, p0, Lo/adu;->l:Lo/abx;

    .line 123
    new-instance v0, Lo/adu$1;

    invoke-direct {v0, p0}, Lo/adu$1;-><init>(Lo/adu;)V

    iput-object v0, p0, Lo/adu;->m:Landroid/bluetooth/BluetoothGattCallback;

    .line 55
    return-void
.end method

.method static synthetic a(Lo/adu;I)I
    .locals 0

    .line 28
    iput p1, p0, Lo/adu;->a:I

    return p1
.end method

.method static synthetic a(Lo/adu;Landroid/bluetooth/BluetoothGatt;)Landroid/bluetooth/BluetoothGatt;
    .locals 0

    .line 28
    iput-object p1, p0, Lo/adu;->g:Landroid/bluetooth/BluetoothGatt;

    return-object p1
.end method

.method static synthetic a(Lo/adu;)Landroid/bluetooth/BluetoothGattService;
    .locals 1

    .line 28
    iget-object v0, p0, Lo/adu;->f:Landroid/bluetooth/BluetoothGattService;

    return-object v0
.end method

.method static synthetic a()Z
    .locals 1

    .line 28
    sget-boolean v0, Lo/adu;->c:Z

    return v0
.end method

.method static synthetic a(Z)Z
    .locals 0

    .line 28
    sput-boolean p0, Lo/adu;->c:Z

    return p0
.end method

.method static synthetic b(Lo/adu;)Landroid/bluetooth/BluetoothGatt;
    .locals 1

    .line 28
    iget-object v0, p0, Lo/adu;->g:Landroid/bluetooth/BluetoothGatt;

    return-object v0
.end method

.method static synthetic b(Lo/adu;Landroid/bluetooth/BluetoothGattDescriptor;)Landroid/bluetooth/BluetoothGattDescriptor;
    .locals 0

    .line 28
    iput-object p1, p0, Lo/adu;->n:Landroid/bluetooth/BluetoothGattDescriptor;

    return-object p1
.end method

.method private declared-synchronized b(I)V
    .locals 2

    monitor-enter p0

    .line 117
    :try_start_0
    iput p1, p0, Lo/adu;->a:I

    .line 118
    iget-object v0, p0, Lo/adu;->l:Lo/abx;

    if-eqz v0, :cond_0

    .line 119
    iget-object v0, p0, Lo/adu;->l:Lo/abx;

    iget-object v1, p0, Lo/adu;->b:Lo/acg;

    invoke-interface {v0, v1, p1}, Lo/abx;->onStatusChanged(Lo/acl;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 121
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method static synthetic c(Lo/adu;)Landroid/bluetooth/BluetoothGattCharacteristic;
    .locals 1

    .line 28
    iget-object v0, p0, Lo/adu;->h:Landroid/bluetooth/BluetoothGattCharacteristic;

    return-object v0
.end method

.method static synthetic c(Lo/adu;Landroid/bluetooth/BluetoothGattService;)Landroid/bluetooth/BluetoothGattService;
    .locals 0

    .line 28
    iput-object p1, p0, Lo/adu;->f:Landroid/bluetooth/BluetoothGattService;

    return-object p1
.end method

.method static synthetic c(Lo/adu;I)V
    .locals 0

    .line 28
    invoke-direct {p0, p1}, Lo/adu;->b(I)V

    return-void
.end method

.method static synthetic d(Lo/adu;)Landroid/bluetooth/BluetoothGattCharacteristic;
    .locals 1

    .line 28
    iget-object v0, p0, Lo/adu;->o:Landroid/bluetooth/BluetoothGattCharacteristic;

    return-object v0
.end method

.method static synthetic d(Lo/adu;Landroid/bluetooth/BluetoothGattCharacteristic;)Landroid/bluetooth/BluetoothGattCharacteristic;
    .locals 0

    .line 28
    iput-object p1, p0, Lo/adu;->h:Landroid/bluetooth/BluetoothGattCharacteristic;

    return-object p1
.end method

.method static synthetic e(Lo/adu;Landroid/bluetooth/BluetoothGattCharacteristic;)Landroid/bluetooth/BluetoothGattCharacteristic;
    .locals 0

    .line 28
    iput-object p1, p0, Lo/adu;->o:Landroid/bluetooth/BluetoothGattCharacteristic;

    return-object p1
.end method

.method static synthetic e(Lo/adu;)Landroid/bluetooth/BluetoothGattDescriptor;
    .locals 1

    .line 28
    iget-object v0, p0, Lo/adu;->n:Landroid/bluetooth/BluetoothGattDescriptor;

    return-object v0
.end method

.method static synthetic f(Lo/adu;)Lo/acg;
    .locals 1

    .line 28
    iget-object v0, p0, Lo/adu;->b:Lo/acg;

    return-object v0
.end method

.method private f()V
    .locals 4

    .line 307
    iget v0, p0, Lo/adu;->a:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 308
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "KangKangMeasureController startBPMeasurement  state connecting  "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 310
    :cond_0
    iget v0, p0, Lo/adu;->a:I

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/adu;->g:Landroid/bluetooth/BluetoothGatt;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/adu;->h:Landroid/bluetooth/BluetoothGattCharacteristic;

    if-eqz v0, :cond_1

    .line 311
    invoke-direct {p0}, Lo/adu;->i()V

    goto :goto_0

    .line 313
    :cond_1
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "KangKangMeasureController startBPMeasurement, state none "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 315
    invoke-direct {p0}, Lo/adu;->h()V

    .line 317
    :goto_0
    return-void
.end method

.method static synthetic g(Lo/adu;)Lo/acg;
    .locals 1

    .line 28
    iget-object v0, p0, Lo/adu;->b:Lo/acg;

    return-object v0
.end method

.method static synthetic h(Lo/adu;)Lo/abx;
    .locals 1

    .line 28
    iget-object v0, p0, Lo/adu;->l:Lo/abx;

    return-object v0
.end method

.method private h()V
    .locals 5

    .line 320
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/adu;->b(I)V

    .line 321
    iget-object v0, p0, Lo/adu;->i:Landroid/bluetooth/BluetoothAdapter;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/adu;->i:Landroid/bluetooth/BluetoothAdapter;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_1

    .line 322
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "KangKangMeasureController BT not enabled ,start BT "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 324
    iget-object v0, p0, Lo/adu;->i:Landroid/bluetooth/BluetoothAdapter;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->enable()Z

    .line 325
    iget-object v0, p0, Lo/adu;->e:Landroid/content/Context;

    if-nez v0, :cond_3

    .line 327
    :try_start_0
    sget-wide v0, Lo/adu;->d:J

    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 330
    goto :goto_0

    .line 328
    :catch_0
    move-exception v4

    .line 329
    invoke-virtual {v4}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 332
    :goto_0
    iget-object v0, p0, Lo/adu;->i:Landroid/bluetooth/BluetoothAdapter;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 333
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "KangKangMeasureController bluetooth enabled,findBleDevice "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 335
    :cond_0
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/adu;->b(I)V

    goto :goto_1

    .line 338
    :cond_1
    iget-object v0, p0, Lo/adu;->g:Landroid/bluetooth/BluetoothGatt;

    if-eqz v0, :cond_2

    .line 339
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "KangKangMeasureController mBluetoothGatt isnt null, Gatt.connect()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 340
    const/4 v0, 0x1

    sput-boolean v0, Lo/adu;->c:Z

    goto :goto_1

    .line 342
    :cond_2
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "KangKangMeasureController mBluetoothGatt is null, findBleDevice"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 343
    const/4 v0, 0x1

    sput-boolean v0, Lo/adu;->c:Z

    .line 345
    :cond_3
    :goto_1
    return-void
.end method

.method private i()V
    .locals 6

    .line 348
    iget v0, p0, Lo/adu;->a:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 350
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "KangKangMeasureController startBPMeasurement  state connected,send 40 cmd"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 352
    move-object v4, p0

    :try_start_0
    monitor-enter v4
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_1

    .line 353
    :try_start_1
    iget-object v0, p0, Lo/adu;->l:Lo/abx;

    iget-object v1, p0, Lo/adu;->b:Lo/acg;

    iget v2, p0, Lo/adu;->a:I

    invoke-interface {v0, v1, v2}, Lo/abx;->onStatusChanged(Lo/acl;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 354
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    :try_start_2
    throw v5

    .line 355
    :goto_0
    const/4 v0, 0x1

    sput-boolean v0, Lo/adu;->c:Z

    .line 356
    iget-object v0, p0, Lo/adu;->h:Landroid/bluetooth/BluetoothGattCharacteristic;

    const-string v1, "B"

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    const/16 v2, 0x11

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/bluetooth/BluetoothGattCharacteristic;->setValue(III)Z

    .line 357
    iget-object v0, p0, Lo/adu;->g:Landroid/bluetooth/BluetoothGatt;

    iget-object v1, p0, Lo/adu;->h:Landroid/bluetooth/BluetoothGattCharacteristic;

    invoke-virtual {v0, v1}, Landroid/bluetooth/BluetoothGatt;->writeCharacteristic(Landroid/bluetooth/BluetoothGattCharacteristic;)Z
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_1

    .line 360
    const-wide/16 v0, 0xc8

    :try_start_3
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_1

    .line 363
    goto :goto_1

    .line 361
    :catch_0
    move-exception v4

    .line 362
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    :try_start_4
    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/NumberFormatException; {:try_start_4 .. :try_end_4} :catch_1

    .line 367
    :goto_1
    goto :goto_2

    .line 364
    :catch_1
    move-exception v4

    .line 365
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 366
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/adu;->b(I)V

    .line 369
    :cond_0
    :goto_2
    return-void
.end method

.method static synthetic k(Lo/adu;)I
    .locals 1

    .line 28
    iget v0, p0, Lo/adu;->a:I

    return v0
.end method

.method private k()Z
    .locals 5

    .line 282
    iget-object v0, p0, Lo/adu;->k:Landroid/bluetooth/BluetoothManager;

    if-nez v0, :cond_0

    .line 283
    iget-object v0, p0, Lo/adu;->e:Landroid/content/Context;

    const-string v1, "bluetooth"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/bluetooth/BluetoothManager;

    iput-object v0, p0, Lo/adu;->k:Landroid/bluetooth/BluetoothManager;

    .line 284
    iget-object v0, p0, Lo/adu;->k:Landroid/bluetooth/BluetoothManager;

    if-nez v0, :cond_0

    .line 285
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "KangKangMeasureController Unable to initialize BluetoothManager."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 286
    const/4 v0, 0x0

    return v0

    .line 290
    :cond_0
    iget-object v0, p0, Lo/adu;->k:Landroid/bluetooth/BluetoothManager;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothManager;->getAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    iput-object v0, p0, Lo/adu;->i:Landroid/bluetooth/BluetoothAdapter;

    .line 291
    iget-object v0, p0, Lo/adu;->i:Landroid/bluetooth/BluetoothAdapter;

    if-nez v0, :cond_1

    .line 292
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "KangKangMeasureController Unable to obtain a BluetoothAdapter."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 293
    const/4 v0, 0x0

    return v0

    .line 297
    :cond_1
    const-wide/16 v0, 0x5dc

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 300
    goto :goto_0

    .line 298
    :catch_0
    move-exception v4

    .line 299
    invoke-virtual {v4}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 302
    :goto_0
    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public a(Lo/acl;Lo/abx;Landroid/os/Bundle;)Z
    .locals 1

    .line 63
    invoke-super {p0, p1, p2, p3}, Lo/afu;->a(Lo/acl;Lo/abx;Landroid/os/Bundle;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 64
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/adu;->e:Landroid/content/Context;

    .line 65
    invoke-direct {p0}, Lo/adu;->k()Z

    .line 66
    invoke-virtual {p0, p2}, Lo/adu;->d(Lo/abx;)V

    .line 67
    const/4 v0, 0x1

    return v0

    .line 69
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public b()Z
    .locals 1

    .line 78
    invoke-direct {p0}, Lo/adu;->f()V

    .line 79
    const/4 v0, 0x1

    return v0
.end method

.method protected c()Landroid/bluetooth/BluetoothGattCallback;
    .locals 1

    .line 113
    iget-object v0, p0, Lo/adu;->m:Landroid/bluetooth/BluetoothGattCallback;

    return-object v0
.end method

.method public d()V
    .locals 3

    .line 97
    move-object v1, p0

    monitor-enter v1

    .line 98
    const/4 v0, 0x0

    :try_start_0
    iput-object v0, p0, Lo/adu;->l:Lo/abx;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 99
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 100
    :goto_0
    iget-object v0, p0, Lo/adu;->g:Landroid/bluetooth/BluetoothGatt;

    if-eqz v0, :cond_0

    .line 101
    iget-object v0, p0, Lo/adu;->g:Landroid/bluetooth/BluetoothGatt;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothGatt;->close()V

    .line 103
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lo/adu;->g:Landroid/bluetooth/BluetoothGatt;

    .line 105
    const/4 v0, 0x0

    iput-object v0, p0, Lo/adu;->f:Landroid/bluetooth/BluetoothGattService;

    .line 106
    return-void
.end method

.method public declared-synchronized d(Lo/abx;)V
    .locals 0

    monitor-enter p0

    .line 51
    :try_start_0
    iput-object p1, p0, Lo/adu;->l:Lo/abx;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public e()V
    .locals 1

    .line 87
    iget-object v0, p0, Lo/adu;->g:Landroid/bluetooth/BluetoothGatt;

    if-eqz v0, :cond_0

    .line 88
    iget-object v0, p0, Lo/adu;->g:Landroid/bluetooth/BluetoothGatt;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothGatt;->disconnect()V

    .line 90
    :cond_0
    return-void
.end method
