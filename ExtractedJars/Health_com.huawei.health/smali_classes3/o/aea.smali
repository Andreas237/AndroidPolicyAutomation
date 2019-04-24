.class public Lo/aea;
.super Lo/afu;
.source "SourceFile"


# static fields
.field private static c:I


# instance fields
.field private a:Z

.field private d:Landroid/bluetooth/BluetoothGatt;

.field private e:Lo/aeb;

.field private f:Lo/abx;

.field private g:Landroid/bluetooth/BluetoothGattCharacteristic;

.field private h:I

.field private i:Landroid/bluetooth/BluetoothGattService;

.field private k:Landroid/bluetooth/BluetoothGattCharacteristic;

.field private p:Landroid/bluetooth/BluetoothGattCallback;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 33
    const/16 v0, 0xfa

    sput v0, Lo/aea;->c:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 31
    invoke-direct {p0}, Lo/afu;-><init>()V

    .line 42
    new-instance v0, Lo/aeb;

    invoke-direct {v0}, Lo/aeb;-><init>()V

    iput-object v0, p0, Lo/aea;->e:Lo/aeb;

    .line 150
    new-instance v0, Lo/aea$2;

    invoke-direct {v0, p0}, Lo/aea$2;-><init>(Lo/aea;)V

    iput-object v0, p0, Lo/aea;->p:Landroid/bluetooth/BluetoothGattCallback;

    return-void
.end method

.method static synthetic a(Lo/aea;I)I
    .locals 0

    .line 31
    iput p1, p0, Lo/aea;->h:I

    return p1
.end method

.method static synthetic a(Lo/aea;)Landroid/bluetooth/BluetoothGatt;
    .locals 1

    .line 31
    iget-object v0, p0, Lo/aea;->d:Landroid/bluetooth/BluetoothGatt;

    return-object v0
.end method

.method private a([B)V
    .locals 3

    .line 339
    const/4 v0, 0x2

    aget-byte v1, p1, v0

    .line 340
    const/4 v0, 0x3

    aget-byte v2, p1, v0

    .line 342
    if-nez v1, :cond_0

    .line 343
    const/4 v0, 0x7

    invoke-static {v2, v0}, Lo/aef;->e(BI)Z

    move-result v0

    iput-boolean v0, p0, Lo/aea;->a:Z

    goto :goto_1

    .line 345
    :cond_0
    const/4 v0, 0x7

    invoke-static {v2, v0}, Lo/aef;->e(BI)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lo/aea;->a:Z

    .line 347
    :goto_1
    return-void
.end method

.method static synthetic b(Lo/aea;)Z
    .locals 1

    .line 31
    iget-boolean v0, p0, Lo/aea;->a:Z

    return v0
.end method

.method static synthetic b(Lo/aea;Z)Z
    .locals 0

    .line 31
    iput-boolean p1, p0, Lo/aea;->a:Z

    return p1
.end method

.method static synthetic c(Lo/aea;Landroid/bluetooth/BluetoothGatt;)Landroid/bluetooth/BluetoothGatt;
    .locals 0

    .line 31
    iput-object p1, p0, Lo/aea;->d:Landroid/bluetooth/BluetoothGatt;

    return-object p1
.end method

.method static synthetic c(Lo/aea;)Landroid/bluetooth/BluetoothGattCharacteristic;
    .locals 1

    .line 31
    iget-object v0, p0, Lo/aea;->g:Landroid/bluetooth/BluetoothGattCharacteristic;

    return-object v0
.end method

.method static synthetic d(Lo/aea;)Lo/aeb;
    .locals 1

    .line 31
    iget-object v0, p0, Lo/aea;->e:Lo/aeb;

    return-object v0
.end method

.method static synthetic d(Lo/aea;[B)V
    .locals 0

    .line 31
    invoke-direct {p0, p1}, Lo/aea;->a([B)V

    return-void
.end method

.method static synthetic e(Lo/aea;)I
    .locals 1

    .line 31
    iget v0, p0, Lo/aea;->h:I

    return v0
.end method

.method static synthetic f()I
    .locals 1

    .line 31
    sget v0, Lo/aea;->c:I

    return v0
.end method

.method static synthetic f(Lo/aea;)Landroid/bluetooth/BluetoothGattCharacteristic;
    .locals 1

    .line 31
    iget-object v0, p0, Lo/aea;->k:Landroid/bluetooth/BluetoothGattCharacteristic;

    return-object v0
.end method

.method static synthetic g(Lo/aea;)Lo/abx;
    .locals 1

    .line 31
    iget-object v0, p0, Lo/aea;->f:Lo/abx;

    return-object v0
.end method

.method private g()Z
    .locals 2

    .line 328
    iget-object v0, p0, Lo/aea;->f:Lo/abx;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 329
    const/4 v0, 0x0

    return v0

    .line 331
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method static synthetic h(Lo/aea;)Z
    .locals 1

    .line 31
    invoke-direct {p0}, Lo/aea;->g()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 94
    iget-object v0, p0, Lo/aea;->i:Landroid/bluetooth/BluetoothGattService;

    if-eqz v0, :cond_0

    .line 95
    iget-object v0, p0, Lo/aea;->g:Landroid/bluetooth/BluetoothGattCharacteristic;

    iget-object v1, p0, Lo/aea;->e:Lo/aeb;

    invoke-virtual {v1}, Lo/aeb;->e()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/bluetooth/BluetoothGattCharacteristic;->setValue([B)Z

    .line 96
    iget-object v0, p0, Lo/aea;->d:Landroid/bluetooth/BluetoothGatt;

    iget-object v1, p0, Lo/aea;->g:Landroid/bluetooth/BluetoothGattCharacteristic;

    invoke-virtual {v0, v1}, Landroid/bluetooth/BluetoothGatt;->writeCharacteristic(Landroid/bluetooth/BluetoothGattCharacteristic;)Z

    .line 97
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/aea;->a:Z

    .line 99
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lo/aea$3;

    invoke-direct {v1, p0}, Lo/aea$3;-><init>(Lo/aea;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 115
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 117
    :cond_0
    return-void
.end method

.method public a(Landroid/bluetooth/BluetoothGatt;)V
    .locals 4

    .line 70
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MumuMeasureController initService"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 71
    iput-object p1, p0, Lo/aea;->d:Landroid/bluetooth/BluetoothGatt;

    .line 73
    iget-object v0, p0, Lo/aea;->i:Landroid/bluetooth/BluetoothGattService;

    if-eqz v0, :cond_0

    .line 74
    invoke-virtual {p0}, Lo/aea;->a()V

    .line 75
    return-void

    .line 78
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/aea;->a:Z

    .line 79
    iget-object v0, p0, Lo/aea;->d:Landroid/bluetooth/BluetoothGatt;

    const-string v1, "00001810-0000-1000-8000-00805f9b34fb"

    invoke-static {v1}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/bluetooth/BluetoothGatt;->getService(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattService;

    move-result-object v0

    iput-object v0, p0, Lo/aea;->i:Landroid/bluetooth/BluetoothGattService;

    .line 81
    iget-object v0, p0, Lo/aea;->i:Landroid/bluetooth/BluetoothGattService;

    if-eqz v0, :cond_1

    .line 82
    iget-object v0, p0, Lo/aea;->i:Landroid/bluetooth/BluetoothGattService;

    const-string v1, "00002a51-0000-1000-8000-00805f9b34fb"

    invoke-static {v1}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/bluetooth/BluetoothGattService;->getCharacteristic(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v0

    iput-object v0, p0, Lo/aea;->k:Landroid/bluetooth/BluetoothGattCharacteristic;

    .line 83
    iget-object v0, p0, Lo/aea;->i:Landroid/bluetooth/BluetoothGattService;

    const-string v1, "00002a50-0000-1000-8000-00805f9b34fb"

    invoke-static {v1}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/bluetooth/BluetoothGattService;->getCharacteristic(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v0

    iput-object v0, p0, Lo/aea;->g:Landroid/bluetooth/BluetoothGattCharacteristic;

    .line 85
    invoke-virtual {p0}, Lo/aea;->a()V

    .line 88
    :cond_1
    return-void
.end method

.method public a(Lo/acl;Lo/abx;Landroid/os/Bundle;)Z
    .locals 1

    .line 57
    invoke-super {p0, p1, p2, p3}, Lo/afu;->a(Lo/acl;Lo/abx;Landroid/os/Bundle;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 58
    iput-object p2, p0, Lo/aea;->f:Lo/abx;

    .line 59
    const/4 v0, 0x1

    return v0

    .line 61
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public b()Z
    .locals 1

    .line 377
    const/4 v0, 0x1

    return v0
.end method

.method protected c()Landroid/bluetooth/BluetoothGattCallback;
    .locals 1

    .line 351
    iget-object v0, p0, Lo/aea;->p:Landroid/bluetooth/BluetoothGattCallback;

    return-object v0
.end method

.method public d()V
    .locals 1

    .line 356
    iget-object v0, p0, Lo/aea;->d:Landroid/bluetooth/BluetoothGatt;

    if-eqz v0, :cond_0

    .line 357
    iget-object v0, p0, Lo/aea;->d:Landroid/bluetooth/BluetoothGatt;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothGatt;->close()V

    .line 359
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lo/aea;->d:Landroid/bluetooth/BluetoothGatt;

    .line 360
    const/4 v0, 0x0

    iput-object v0, p0, Lo/aea;->i:Landroid/bluetooth/BluetoothGattService;

    .line 361
    const/4 v0, 0x0

    iput-object v0, p0, Lo/aea;->g:Landroid/bluetooth/BluetoothGattCharacteristic;

    .line 362
    const/4 v0, 0x0

    iput-object v0, p0, Lo/aea;->k:Landroid/bluetooth/BluetoothGattCharacteristic;

    .line 363
    const/4 v0, 0x0

    iput-object v0, p0, Lo/aea;->f:Lo/abx;

    .line 364
    const/4 v0, 0x0

    iput v0, p0, Lo/aea;->h:I

    .line 365
    return-void
.end method

.method public e()V
    .locals 1

    .line 370
    iget-object v0, p0, Lo/aea;->d:Landroid/bluetooth/BluetoothGatt;

    if-eqz v0, :cond_0

    .line 371
    iget-object v0, p0, Lo/aea;->d:Landroid/bluetooth/BluetoothGatt;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothGatt;->disconnect()V

    .line 373
    :cond_0
    return-void
.end method
