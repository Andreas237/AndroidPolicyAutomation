.class public Lo/aek;
.super Lo/afu;
.source "SourceFile"

# interfaces
.implements Lo/aep;


# static fields
.field private static final a:Ljava/util/UUID;

.field private static final c:Ljava/util/UUID;

.field private static final d:Ljava/util/UUID;

.field private static final e:Ljava/util/UUID;

.field private static final f:Ljava/util/UUID;

.field private static final g:Ljava/util/UUID;

.field private static final h:Ljava/util/UUID;

.field private static final i:Ljava/util/UUID;

.field private static final k:Ljava/util/UUID;

.field private static final l:Ljava/util/UUID;

.field private static final p:Ljava/util/UUID;


# instance fields
.field private m:Lo/aes;

.field private n:Landroid/bluetooth/BluetoothGatt;

.field private o:Lo/abx;

.field private q:Lo/aen;

.field private r:I

.field private s:Lo/aeo;

.field private t:Lo/agg;

.field private u:Z

.field private v:Landroid/bluetooth/BluetoothGattCallback;

.field private w:I

.field private x:Lo/ahi$e;

.field private y:Landroid/os/Bundle;

.field private z:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 47
    const-string v0, "0000181c-0000-1000-8000-00805f9b34fb"

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    sput-object v0, Lo/aek;->d:Ljava/util/UUID;

    .line 48
    const-string v0, "00002a80-0000-1000-8000-00805f9b34fb"

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    sput-object v0, Lo/aek;->a:Ljava/util/UUID;

    .line 49
    const-string v0, "00002a8c-0000-1000-8000-00805f9b34fb"

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    sput-object v0, Lo/aek;->c:Ljava/util/UUID;

    .line 50
    const-string v0, "00002a8e-0000-1000-8000-00805f9b34fb"

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    sput-object v0, Lo/aek;->e:Ljava/util/UUID;

    .line 52
    const-string v0, "00001805-0000-1000-8000-00805f9b34fb"

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    sput-object v0, Lo/aek;->k:Ljava/util/UUID;

    .line 53
    const-string v0, "00002a2b-0000-1000-8000-00805f9b34fb"

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    sput-object v0, Lo/aek;->g:Ljava/util/UUID;

    .line 55
    const-string v0, "0000181d-0000-1000-8000-00805f9b34fb"

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    sput-object v0, Lo/aek;->h:Ljava/util/UUID;

    .line 56
    const-string v0, "00002a9d-0000-1000-8000-00805f9b34fb"

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    sput-object v0, Lo/aek;->f:Ljava/util/UUID;

    .line 58
    const-string v0, "0000181b-0000-1000-8000-00805f9b34fb"

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    sput-object v0, Lo/aek;->i:Ljava/util/UUID;

    .line 59
    const-string v0, "00002a9c-0000-1000-8000-00805f9b34fb"

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    sput-object v0, Lo/aek;->l:Ljava/util/UUID;

    .line 61
    const-string v0, "00002902-0000-1000-8000-00805f9b34fb"

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    sput-object v0, Lo/aek;->p:Ljava/util/UUID;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 82
    invoke-direct {p0}, Lo/afu;-><init>()V

    .line 69
    const/4 v0, 0x0

    iput-object v0, p0, Lo/aek;->m:Lo/aes;

    .line 70
    const/4 v0, 0x0

    iput-object v0, p0, Lo/aek;->q:Lo/aen;

    .line 71
    const/4 v0, 0x0

    iput-object v0, p0, Lo/aek;->s:Lo/aeo;

    .line 73
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/aek;->u:Z

    .line 76
    const/4 v0, 0x0

    iput v0, p0, Lo/aek;->r:I

    .line 77
    const/4 v0, 0x0

    iput v0, p0, Lo/aek;->w:I

    .line 78
    const/4 v0, 0x0

    iput v0, p0, Lo/aek;->z:I

    .line 107
    new-instance v0, Lo/aek$3;

    invoke-direct {v0, p0}, Lo/aek$3;-><init>(Lo/aek;)V

    iput-object v0, p0, Lo/aek;->x:Lo/ahi$e;

    .line 145
    new-instance v0, Lo/aek$5;

    invoke-direct {v0, p0}, Lo/aek$5;-><init>(Lo/aek;)V

    iput-object v0, p0, Lo/aek;->v:Landroid/bluetooth/BluetoothGattCallback;

    .line 83
    new-instance v0, Lo/aen;

    invoke-direct {v0}, Lo/aen;-><init>()V

    iput-object v0, p0, Lo/aek;->q:Lo/aen;

    .line 84
    new-instance v0, Lo/agg;

    invoke-direct {v0}, Lo/agg;-><init>()V

    iput-object v0, p0, Lo/aek;->t:Lo/agg;

    .line 85
    iget-object v0, p0, Lo/aek;->t:Lo/agg;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/agg;->d(J)V

    .line 86
    new-instance v0, Lo/aeo;

    invoke-direct {v0, p0}, Lo/aeo;-><init>(Lo/aep;)V

    iput-object v0, p0, Lo/aek;->s:Lo/aeo;

    .line 87
    return-void
.end method

.method static synthetic a(Lo/aek;)Lo/abx;
    .locals 1

    .line 45
    iget-object v0, p0, Lo/aek;->o:Lo/abx;

    return-object v0
.end method

.method static synthetic a(Lo/aek;Lo/aen;)Lo/aen;
    .locals 0

    .line 45
    iput-object p1, p0, Lo/aek;->q:Lo/aen;

    return-object p1
.end method

.method static synthetic b(Lo/aek;Landroid/bluetooth/BluetoothGatt;)Landroid/bluetooth/BluetoothGatt;
    .locals 0

    .line 45
    iput-object p1, p0, Lo/aek;->n:Landroid/bluetooth/BluetoothGatt;

    return-object p1
.end method

.method static synthetic b(Lo/aek;)Lo/acg;
    .locals 1

    .line 45
    iget-object v0, p0, Lo/aek;->b:Lo/acg;

    return-object v0
.end method

.method private b(Landroid/bluetooth/BluetoothGattCharacteristic;[B)Z
    .locals 5

    .line 338
    iget-object v0, p0, Lo/aek;->n:Landroid/bluetooth/BluetoothGatt;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 340
    :cond_0
    if-nez p1, :cond_1

    const/4 v0, 0x0

    return v0

    .line 342
    :cond_1
    invoke-virtual {p1, p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->setValue([B)Z

    .line 343
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/bluetooth/BluetoothGattCharacteristic;->setWriteType(I)V

    .line 344
    iget-object v0, p0, Lo/aek;->n:Landroid/bluetooth/BluetoothGatt;

    invoke-virtual {v0, p1}, Landroid/bluetooth/BluetoothGatt;->writeCharacteristic(Landroid/bluetooth/BluetoothGattCharacteristic;)Z

    move-result v4

    .line 345
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "writeCharacteristic --> "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-direct {p0, p2}, Lo/aek;->e([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 346
    return v4
.end method

.method static synthetic c(Lo/aek;[B)Ljava/lang/String;
    .locals 1

    .line 45
    invoke-direct {p0, p1}, Lo/aek;->e([B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic c(Lo/aek;)Lo/acg;
    .locals 1

    .line 45
    iget-object v0, p0, Lo/aek;->b:Lo/acg;

    return-object v0
.end method

.method static synthetic c(Lo/aek;Landroid/os/Bundle;)V
    .locals 0

    .line 45
    invoke-direct {p0, p1}, Lo/aek;->d(Landroid/os/Bundle;)V

    return-void
.end method

.method static synthetic d(Lo/aek;)Lo/aes;
    .locals 1

    .line 45
    iget-object v0, p0, Lo/aek;->m:Lo/aes;

    return-object v0
.end method

.method private d(Landroid/os/Bundle;)V
    .locals 7

    .line 283
    iget-object v0, p0, Lo/aek;->n:Landroid/bluetooth/BluetoothGatt;

    if-nez v0, :cond_0

    .line 284
    return-void

    .line 286
    :cond_0
    const-string v0, "height"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v4

    .line 287
    const-string v0, "sex"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v5

    .line 288
    const-string v0, "age"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v6

    .line 289
    iput v4, p0, Lo/aek;->r:I

    .line 290
    const/4 v0, 0x1

    if-ne v5, v0, :cond_1

    .line 291
    const/4 v0, 0x0

    iput v0, p0, Lo/aek;->z:I

    goto :goto_0

    .line 292
    :cond_1
    if-nez v5, :cond_2

    .line 293
    const/4 v0, 0x1

    iput v0, p0, Lo/aek;->z:I

    .line 295
    :cond_2
    :goto_0
    iput v6, p0, Lo/aek;->w:I

    .line 296
    iget v0, p0, Lo/aek;->w:I

    int-to-byte v0, v0

    iget v1, p0, Lo/aek;->z:I

    int-to-byte v1, v1

    iget v2, p0, Lo/aek;->r:I

    int-to-byte v2, v2

    invoke-virtual {p0, v0, v1, v2}, Lo/aek;->a(BBB)V

    .line 297
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WspMeasureController getUserInfo form HiHealthAPI, height = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/aek;->r:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",sex = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/aek;->z:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",age = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/aek;->w:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 298
    return-void
.end method

.method static synthetic d(Lo/aek;Z)Z
    .locals 0

    .line 45
    iput-boolean p1, p0, Lo/aek;->u:Z

    return p1
.end method

.method private e([B)Ljava/lang/String;
    .locals 8

    .line 473
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v0, ""

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 474
    if-eqz p1, :cond_0

    array-length v0, p1

    if-gtz v0, :cond_1

    .line 475
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WspMeasureController bytesToHexString src is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 476
    const/4 v0, 0x0

    return-object v0

    .line 479
    :cond_1
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WspMeasureController bytesToHexString start to Hex String"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 480
    const/4 v5, 0x0

    :goto_0
    array-length v0, p1

    if-ge v5, v0, :cond_3

    .line 481
    aget-byte v0, p1, v5

    and-int/lit16 v6, v0, 0xff

    .line 482
    invoke-static {v6}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v7

    .line 483
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x2

    if-ge v0, v1, :cond_2

    .line 484
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 486
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 480
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 488
    :cond_3
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic e(Lo/aek;)Lo/acg;
    .locals 1

    .line 45
    iget-object v0, p0, Lo/aek;->b:Lo/acg;

    return-object v0
.end method

.method private e(Landroid/bluetooth/BluetoothGattCharacteristic;Z)Z
    .locals 6

    .line 313
    iget-object v0, p0, Lo/aek;->n:Landroid/bluetooth/BluetoothGatt;

    if-nez v0, :cond_0

    .line 314
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enableCharacteristicNotification mBluetoothGatt is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 315
    const/4 v0, 0x0

    return v0

    .line 318
    :cond_0
    const/4 v4, 0x0

    .line 319
    iget-object v0, p0, Lo/aek;->n:Landroid/bluetooth/BluetoothGatt;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Landroid/bluetooth/BluetoothGatt;->setCharacteristicNotification(Landroid/bluetooth/BluetoothGattCharacteristic;Z)Z

    .line 320
    sget-object v0, Lo/aek;->p:Ljava/util/UUID;

    invoke-virtual {p1, v0}, Landroid/bluetooth/BluetoothGattCharacteristic;->getDescriptor(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattDescriptor;

    move-result-object v5

    .line 321
    if-eqz v5, :cond_1

    .line 322
    sget-object v0, Landroid/bluetooth/BluetoothGattDescriptor;->ENABLE_NOTIFICATION_VALUE:[B

    invoke-virtual {v5, v0}, Landroid/bluetooth/BluetoothGattDescriptor;->setValue([B)Z

    .line 323
    sget-object v0, Landroid/bluetooth/BluetoothGattDescriptor;->ENABLE_INDICATION_VALUE:[B

    invoke-virtual {v5, v0}, Landroid/bluetooth/BluetoothGattDescriptor;->setValue([B)Z

    .line 324
    iget-object v0, p0, Lo/aek;->n:Landroid/bluetooth/BluetoothGatt;

    invoke-virtual {v0, v5}, Landroid/bluetooth/BluetoothGatt;->writeDescriptor(Landroid/bluetooth/BluetoothGattDescriptor;)Z

    move-result v4

    .line 326
    :cond_1
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "enableCharacteristicNotification bRet = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 327
    return v4
.end method

.method static synthetic f(Lo/aek;)Z
    .locals 1

    .line 45
    iget-boolean v0, p0, Lo/aek;->u:Z

    return v0
.end method

.method static synthetic g(Lo/aek;)Lo/aen;
    .locals 1

    .line 45
    iget-object v0, p0, Lo/aek;->q:Lo/aen;

    return-object v0
.end method

.method static synthetic h()Ljava/util/UUID;
    .locals 1

    .line 45
    sget-object v0, Lo/aek;->l:Ljava/util/UUID;

    return-object v0
.end method

.method static synthetic h(Lo/aek;)Lo/acg;
    .locals 1

    .line 45
    iget-object v0, p0, Lo/aek;->b:Lo/acg;

    return-object v0
.end method

.method static synthetic i()Ljava/util/UUID;
    .locals 1

    .line 45
    sget-object v0, Lo/aek;->f:Ljava/util/UUID;

    return-object v0
.end method

.method static synthetic i(Lo/aek;)Lo/aeo;
    .locals 1

    .line 45
    iget-object v0, p0, Lo/aek;->s:Lo/aeo;

    return-object v0
.end method

.method static synthetic k(Lo/aek;)Lo/agg;
    .locals 1

    .line 45
    iget-object v0, p0, Lo/aek;->t:Lo/agg;

    return-object v0
.end method

.method static synthetic l(Lo/aek;)Lo/acg;
    .locals 1

    .line 45
    iget-object v0, p0, Lo/aek;->b:Lo/acg;

    return-object v0
.end method

.method static synthetic p(Lo/aek;)Landroid/os/Bundle;
    .locals 1

    .line 45
    iget-object v0, p0, Lo/aek;->y:Landroid/os/Bundle;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 14

    .line 368
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 370
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->get(I)I

    move-result v5

    .line 371
    const/4 v0, 0x2

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    add-int/lit8 v6, v0, 0x1

    .line 372
    const/4 v0, 0x5

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->get(I)I

    move-result v7

    .line 373
    const/16 v0, 0xb

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->get(I)I

    move-result v8

    .line 374
    const/16 v0, 0xc

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->get(I)I

    move-result v9

    .line 375
    const/16 v0, 0xd

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->get(I)I

    move-result v10

    .line 376
    invoke-virtual {v4}, Ljava/util/Calendar;->getFirstDayOfWeek()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v11, 0x1

    goto :goto_0

    :cond_0
    const/4 v11, 0x0

    .line 377
    :goto_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WspMeasureController syncCurrentTime isFirstSunday:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 378
    const/4 v0, 0x7

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->get(I)I

    move-result v12

    .line 379
    if-eqz v11, :cond_1

    .line 380
    add-int/lit8 v12, v12, -0x1

    .line 381
    if-nez v12, :cond_1

    .line 382
    const/4 v12, 0x7

    .line 385
    :cond_1
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WspMeasureController syncCurrentTime weekDay:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 386
    const/16 v0, 0xa

    new-array v13, v0, [B

    .line 387
    and-int/lit16 v0, v5, 0xff

    int-to-byte v0, v0

    const/4 v1, 0x0

    aput-byte v0, v13, v1

    .line 388
    shr-int/lit8 v0, v5, 0x8

    and-int/lit16 v0, v0, 0xff

    int-to-byte v0, v0

    const/4 v1, 0x1

    aput-byte v0, v13, v1

    .line 389
    and-int/lit16 v0, v6, 0xff

    int-to-byte v0, v0

    const/4 v1, 0x2

    aput-byte v0, v13, v1

    .line 390
    and-int/lit16 v0, v7, 0xff

    int-to-byte v0, v0

    const/4 v1, 0x3

    aput-byte v0, v13, v1

    .line 391
    and-int/lit16 v0, v8, 0xff

    int-to-byte v0, v0

    const/4 v1, 0x4

    aput-byte v0, v13, v1

    .line 392
    and-int/lit16 v0, v9, 0xff

    int-to-byte v0, v0

    const/4 v1, 0x5

    aput-byte v0, v13, v1

    .line 393
    and-int/lit16 v0, v10, 0xff

    int-to-byte v0, v0

    const/4 v1, 0x6

    aput-byte v0, v13, v1

    .line 394
    and-int/lit16 v0, v12, 0xff

    int-to-byte v0, v0

    const/4 v1, 0x7

    aput-byte v0, v13, v1

    .line 395
    const/4 v0, 0x0

    const/16 v1, 0x8

    aput-byte v0, v13, v1

    .line 396
    const/4 v0, 0x0

    const/16 v1, 0x9

    aput-byte v0, v13, v1

    .line 397
    iget-object v0, p0, Lo/aek;->s:Lo/aeo;

    new-instance v1, Lo/aer;

    sget-object v2, Lo/aeo$a;->c:Lo/aeo$a;

    invoke-direct {v1, v2, v13}, Lo/aer;-><init>(Lo/aeo$a;[B)V

    invoke-virtual {v0, v1}, Lo/aeo;->e(Lo/aer;)V

    .line 398
    iget-object v0, p0, Lo/aek;->s:Lo/aeo;

    invoke-virtual {v0}, Lo/aeo;->c()V

    .line 399
    return-void
.end method

.method public a(BBB)V
    .locals 6

    .line 356
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "synCurrentUser is Begining..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 358
    iget-object v0, p0, Lo/aek;->s:Lo/aeo;

    new-instance v1, Lo/aer;

    sget-object v2, Lo/aeo$a;->d:Lo/aeo$a;

    const/4 v3, 0x1

    new-array v3, v3, [B

    const/4 v4, 0x0

    aput-byte p1, v3, v4

    invoke-direct {v1, v2, v3}, Lo/aer;-><init>(Lo/aeo$a;[B)V

    invoke-virtual {v0, v1}, Lo/aeo;->e(Lo/aer;)V

    .line 359
    iget-object v0, p0, Lo/aek;->s:Lo/aeo;

    new-instance v1, Lo/aer;

    sget-object v2, Lo/aeo$a;->a:Lo/aeo$a;

    const/4 v3, 0x1

    new-array v3, v3, [B

    const/4 v4, 0x0

    aput-byte p2, v3, v4

    invoke-direct {v1, v2, v3}, Lo/aer;-><init>(Lo/aeo$a;[B)V

    invoke-virtual {v0, v1}, Lo/aeo;->e(Lo/aer;)V

    .line 360
    iget-object v0, p0, Lo/aek;->s:Lo/aeo;

    new-instance v1, Lo/aer;

    sget-object v2, Lo/aeo$a;->e:Lo/aeo$a;

    const/4 v3, 0x2

    new-array v3, v3, [B

    const/4 v4, 0x0

    aput-byte p3, v3, v4

    const/4 v4, 0x0

    const/4 v5, 0x1

    aput-byte v4, v3, v5

    invoke-direct {v1, v2, v3}, Lo/aer;-><init>(Lo/aeo$a;[B)V

    invoke-virtual {v0, v1}, Lo/aeo;->e(Lo/aer;)V

    .line 361
    iget-object v0, p0, Lo/aek;->s:Lo/aeo;

    invoke-virtual {v0}, Lo/aeo;->c()V

    .line 362
    return-void
.end method

.method public a(Lo/acl;Lo/abx;Landroid/os/Bundle;)Z
    .locals 4

    .line 91
    iget-object v0, p0, Lo/aek;->x:Lo/ahi$e;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "weight_measure_set_user"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lo/ahi;->d(Lo/ahi$e;I[Ljava/lang/String;)V

    .line 92
    invoke-super {p0, p1, p2, p3}, Lo/afu;->a(Lo/acl;Lo/abx;Landroid/os/Bundle;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 93
    iput-object p2, p0, Lo/aek;->o:Lo/abx;

    .line 94
    const/4 v0, 0x0

    if-eq v0, p3, :cond_0

    .line 95
    iput-object p3, p0, Lo/aek;->y:Landroid/os/Bundle;

    .line 97
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 99
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public b(Lo/aer;Lo/aes;)V
    .locals 9

    .line 442
    sget-object v4, Lo/aek;->i:Ljava/util/UUID;

    .line 443
    sget-object v5, Lo/aek;->l:Ljava/util/UUID;

    .line 445
    invoke-virtual {p1}, Lo/aer;->b()Lo/aeo$a;

    move-result-object v0

    sget-object v1, Lo/aeo$a;->b:Lo/aeo$a;

    if-ne v0, v1, :cond_0

    .line 446
    sget-object v4, Lo/aek;->h:Ljava/util/UUID;

    .line 447
    sget-object v5, Lo/aek;->f:Ljava/util/UUID;

    .line 450
    :cond_0
    const/4 v6, 0x0

    .line 451
    iget-object v0, p0, Lo/aek;->n:Landroid/bluetooth/BluetoothGatt;

    invoke-virtual {v0, v4}, Landroid/bluetooth/BluetoothGatt;->getService(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattService;

    move-result-object v7

    .line 452
    if-eqz v7, :cond_2

    .line 453
    invoke-virtual {v7, v5}, Landroid/bluetooth/BluetoothGattService;->getCharacteristic(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v8

    .line 454
    if-eqz v8, :cond_1

    .line 455
    iput-object p2, p0, Lo/aek;->m:Lo/aes;

    .line 456
    const/4 v0, 0x1

    invoke-direct {p0, v8, v0}, Lo/aek;->e(Landroid/bluetooth/BluetoothGattCharacteristic;Z)Z

    move-result v6

    .line 458
    :cond_1
    goto :goto_0

    .line 459
    :cond_2
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enable BluetoothGattService is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 462
    :goto_0
    if-nez v6, :cond_3

    .line 463
    iget-object v0, p0, Lo/aek;->m:Lo/aes;

    if-eqz v0, :cond_3

    .line 464
    iget-object v0, p0, Lo/aek;->m:Lo/aes;

    invoke-interface {v0}, Lo/aes;->c()V

    .line 467
    :cond_3
    return-void
.end method

.method public b()Z
    .locals 1

    .line 104
    const/4 v0, 0x1

    return v0
.end method

.method protected c()Landroid/bluetooth/BluetoothGattCallback;
    .locals 1

    .line 302
    iget-object v0, p0, Lo/aek;->v:Landroid/bluetooth/BluetoothGattCallback;

    return-object v0
.end method

.method public d()V
    .locals 4

    .line 121
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WspMeasureController cleanup..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 122
    iget-object v0, p0, Lo/aek;->n:Landroid/bluetooth/BluetoothGatt;

    if-eqz v0, :cond_0

    .line 123
    iget-object v0, p0, Lo/aek;->n:Landroid/bluetooth/BluetoothGatt;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothGatt;->close()V

    .line 125
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lo/aek;->n:Landroid/bluetooth/BluetoothGatt;

    .line 126
    iget-object v0, p0, Lo/aek;->s:Lo/aeo;

    invoke-virtual {v0}, Lo/aeo;->b()V

    .line 127
    const/4 v0, 0x0

    iput-object v0, p0, Lo/aek;->o:Lo/abx;

    .line 128
    const/4 v0, 0x0

    iput-object v0, p0, Lo/aek;->q:Lo/aen;

    .line 129
    const/4 v0, 0x0

    iput-object v0, p0, Lo/aek;->y:Landroid/os/Bundle;

    .line 130
    return-void
.end method

.method public d(Lo/aer;Lo/aes;)V
    .locals 9

    .line 403
    sget-object v4, Lo/aek;->k:Ljava/util/UUID;

    .line 404
    sget-object v5, Lo/aek;->g:Ljava/util/UUID;

    .line 406
    invoke-virtual {p1}, Lo/aer;->b()Lo/aeo$a;

    move-result-object v0

    sget-object v1, Lo/aeo$a;->d:Lo/aeo$a;

    if-ne v0, v1, :cond_0

    .line 407
    sget-object v4, Lo/aek;->d:Ljava/util/UUID;

    .line 408
    sget-object v5, Lo/aek;->a:Ljava/util/UUID;

    goto :goto_0

    .line 409
    :cond_0
    invoke-virtual {p1}, Lo/aer;->b()Lo/aeo$a;

    move-result-object v0

    sget-object v1, Lo/aeo$a;->a:Lo/aeo$a;

    if-ne v0, v1, :cond_1

    .line 410
    sget-object v4, Lo/aek;->d:Ljava/util/UUID;

    .line 411
    sget-object v5, Lo/aek;->c:Ljava/util/UUID;

    goto :goto_0

    .line 412
    :cond_1
    invoke-virtual {p1}, Lo/aer;->b()Lo/aeo$a;

    move-result-object v0

    sget-object v1, Lo/aeo$a;->e:Lo/aeo$a;

    if-ne v0, v1, :cond_2

    .line 413
    sget-object v4, Lo/aek;->d:Ljava/util/UUID;

    .line 414
    sget-object v5, Lo/aek;->e:Ljava/util/UUID;

    .line 417
    :cond_2
    :goto_0
    const/4 v6, 0x0

    .line 418
    iget-object v0, p0, Lo/aek;->n:Landroid/bluetooth/BluetoothGatt;

    invoke-virtual {v0, v4}, Landroid/bluetooth/BluetoothGatt;->getService(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattService;

    move-result-object v7

    .line 419
    if-eqz v7, :cond_4

    .line 420
    invoke-virtual {v7, v5}, Landroid/bluetooth/BluetoothGattService;->getCharacteristic(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v8

    .line 421
    if-eqz v8, :cond_3

    .line 422
    iput-object p2, p0, Lo/aek;->m:Lo/aes;

    .line 423
    invoke-virtual {p1}, Lo/aer;->e()[B

    move-result-object v0

    invoke-direct {p0, v8, v0}, Lo/aek;->b(Landroid/bluetooth/BluetoothGattCharacteristic;[B)Z

    move-result v6

    .line 424
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Write key:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lo/aer;->b()Lo/aeo$a;

    move-result-object v3

    invoke-virtual {v3}, Lo/aeo$a;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " isSuccess:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 426
    :cond_3
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WspMeasureController gattCharacteristic is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 428
    :goto_1
    goto :goto_2

    .line 429
    :cond_4
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WspMeasureController write BluetoothGattService is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 432
    :goto_2
    if-nez v6, :cond_5

    .line 433
    iget-object v0, p0, Lo/aek;->m:Lo/aes;

    if-eqz v0, :cond_5

    .line 434
    iget-object v0, p0, Lo/aek;->m:Lo/aes;

    invoke-interface {v0}, Lo/aes;->c()V

    .line 438
    :cond_5
    return-void
.end method

.method public e()V
    .locals 4

    .line 137
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WspMeasureController ending..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 138
    iget-object v0, p0, Lo/aek;->n:Landroid/bluetooth/BluetoothGatt;

    if-eqz v0, :cond_0

    .line 139
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WspMeasureController disconnect"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 140
    iget-object v0, p0, Lo/aek;->n:Landroid/bluetooth/BluetoothGatt;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothGatt;->disconnect()V

    .line 142
    :cond_0
    iget-object v0, p0, Lo/aek;->x:Lo/ahi$e;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "weight_measure_set_user"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/ahi;->a(Lo/ahi$e;[Ljava/lang/String;)V

    .line 143
    return-void
.end method
