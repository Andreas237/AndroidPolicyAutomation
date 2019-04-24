.class public Lo/add;
.super Lo/afu;
.source "SourceFile"

# interfaces
.implements Lo/aep;


# instance fields
.field a:I

.field c:Z

.field private d:Landroid/bluetooth/BluetoothGattService;

.field private e:Landroid/bluetooth/BluetoothGatt;

.field private f:Landroid/bluetooth/BluetoothGattCharacteristic;

.field private g:Landroid/bluetooth/BluetoothGattCharacteristic;

.field private h:Landroid/bluetooth/BluetoothGattCharacteristic;

.field private i:Lo/adb;

.field private k:Lo/abx;

.field private l:I

.field private m:Ljava/lang/String;

.field private n:I

.field private o:I

.field private p:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/afz;>;"
        }
    .end annotation
.end field

.field private q:Lo/aes;

.field private r:Lo/afi;

.field private s:[C

.field private t:Lo/aeo;

.field private u:Landroid/bluetooth/BluetoothGattCallback;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 85
    invoke-direct {p0}, Lo/afu;-><init>()V

    .line 78
    const/4 v0, 0x0

    iput-object v0, p0, Lo/add;->q:Lo/aes;

    .line 79
    const/4 v0, 0x0

    iput-object v0, p0, Lo/add;->t:Lo/aeo;

    .line 81
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/add;->c:Z

    .line 83
    const/4 v0, 0x0

    iput v0, p0, Lo/add;->a:I

    .line 188
    const-string v0, "0123456789ABCDEF"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    iput-object v0, p0, Lo/add;->s:[C

    .line 206
    new-instance v0, Lo/add$5;

    invoke-direct {v0, p0}, Lo/add$5;-><init>(Lo/add;)V

    iput-object v0, p0, Lo/add;->u:Landroid/bluetooth/BluetoothGattCallback;

    .line 87
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "GlucoseMeasureController constructed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 89
    new-instance v0, Lo/adb;

    invoke-direct {v0}, Lo/adb;-><init>()V

    iput-object v0, p0, Lo/add;->i:Lo/adb;

    .line 90
    new-instance v0, Lo/afi;

    const-string v1, "bloodSugar"

    invoke-direct {v0, v1}, Lo/afi;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lo/add;->r:Lo/afi;

    .line 91
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/add;->p:Ljava/util/ArrayList;

    .line 93
    new-instance v0, Lo/aeo;

    invoke-direct {v0, p0}, Lo/aeo;-><init>(Lo/aep;)V

    iput-object v0, p0, Lo/add;->t:Lo/aeo;

    .line 94
    return-void
.end method

.method static synthetic a(Lo/add;)Landroid/bluetooth/BluetoothGatt;
    .locals 1

    .line 31
    iget-object v0, p0, Lo/add;->e:Landroid/bluetooth/BluetoothGatt;

    return-object v0
.end method

.method private a([B)Ljava/lang/String;
    .locals 6

    .line 192
    array-length v0, p1

    mul-int/lit8 v0, v0, 0x2

    new-array v3, v0, [C

    .line 193
    const/4 v4, 0x0

    :goto_0
    array-length v0, p1

    if-ge v4, v0, :cond_0

    .line 195
    aget-byte v0, p1, v4

    and-int/lit16 v5, v0, 0xff

    .line 196
    mul-int/lit8 v0, v4, 0x2

    iget-object v1, p0, Lo/add;->s:[C

    ushr-int/lit8 v2, v5, 0x4

    aget-char v1, v1, v2

    aput-char v1, v3, v0

    .line 197
    mul-int/lit8 v0, v4, 0x2

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Lo/add;->s:[C

    and-int/lit8 v2, v5, 0xf

    aget-char v1, v1, v2

    aput-char v1, v3, v0

    .line 193
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 199
    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v3}, Ljava/lang/String;-><init>([C)V

    return-object v0
.end method

.method static synthetic b(Lo/add;I)I
    .locals 0

    .line 31
    iput p1, p0, Lo/add;->o:I

    return p1
.end method

.method static synthetic b(Lo/add;Landroid/bluetooth/BluetoothGattService;)Landroid/bluetooth/BluetoothGattService;
    .locals 0

    .line 31
    iput-object p1, p0, Lo/add;->d:Landroid/bluetooth/BluetoothGattService;

    return-object p1
.end method

.method static synthetic b(Lo/add;)Ljava/lang/String;
    .locals 1

    .line 31
    iget-object v0, p0, Lo/add;->m:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic b(Lo/add;[B)Ljava/lang/String;
    .locals 1

    .line 31
    invoke-direct {p0, p1}, Lo/add;->a([B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic c(Lo/add;)I
    .locals 1

    .line 31
    iget v0, p0, Lo/add;->o:I

    return v0
.end method

.method static synthetic c(Lo/add;I)I
    .locals 0

    .line 31
    iput p1, p0, Lo/add;->n:I

    return p1
.end method

.method static synthetic c(Lo/add;Landroid/bluetooth/BluetoothGatt;)Landroid/bluetooth/BluetoothGatt;
    .locals 0

    .line 31
    iput-object p1, p0, Lo/add;->e:Landroid/bluetooth/BluetoothGatt;

    return-object p1
.end method

.method private c([B)Ljava/lang/String;
    .locals 8

    .line 518
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v0, ""

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 519
    if-eqz p1, :cond_0

    array-length v0, p1

    if-gtz v0, :cond_1

    .line 520
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "GlucoseMeasureController bytesToHexString src is null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 521
    const/4 v0, 0x0

    return-object v0

    .line 523
    :cond_1
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "GlucoseMeasureController bytesToHexString start to Hex String"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 524
    const/4 v5, 0x0

    :goto_0
    array-length v0, p1

    if-ge v5, v0, :cond_3

    .line 525
    aget-byte v0, p1, v5

    and-int/lit16 v6, v0, 0xff

    .line 526
    invoke-static {v6}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v7

    .line 527
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x2

    if-ge v0, v1, :cond_2

    .line 528
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 530
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

    .line 524
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 532
    :cond_3
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private c(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;Z)V
    .locals 5

    .line 154
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "GlucoseMeasureController setCharNotification() enabled = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 156
    invoke-virtual {p1, p2, p3}, Landroid/bluetooth/BluetoothGatt;->setCharacteristicNotification(Landroid/bluetooth/BluetoothGattCharacteristic;Z)Z

    .line 157
    const-string v0, "00002902-0000-1000-8000-00805f9b34fb"

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/bluetooth/BluetoothGattCharacteristic;->getDescriptor(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattDescriptor;

    move-result-object v4

    .line 158
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 159
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "GlucoseMeasureController setCharNotification descriptor == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 161
    :cond_0
    if-eqz p3, :cond_1

    .line 162
    sget-object v0, Landroid/bluetooth/BluetoothGattDescriptor;->ENABLE_NOTIFICATION_VALUE:[B

    invoke-virtual {v4, v0}, Landroid/bluetooth/BluetoothGattDescriptor;->setValue([B)Z

    goto :goto_0

    .line 164
    :cond_1
    sget-object v0, Landroid/bluetooth/BluetoothGattDescriptor;->DISABLE_NOTIFICATION_VALUE:[B

    invoke-virtual {v4, v0}, Landroid/bluetooth/BluetoothGattDescriptor;->setValue([B)Z

    .line 166
    :goto_0
    invoke-virtual {p1, v4}, Landroid/bluetooth/BluetoothGatt;->writeDescriptor(Landroid/bluetooth/BluetoothGattDescriptor;)Z

    .line 168
    :goto_1
    return-void
.end method

.method private c(Landroid/bluetooth/BluetoothGattCharacteristic;[B)Z
    .locals 5

    .line 504
    iget-object v0, p0, Lo/add;->e:Landroid/bluetooth/BluetoothGatt;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 506
    :cond_0
    if-nez p1, :cond_1

    const/4 v0, 0x0

    return v0

    .line 508
    :cond_1
    invoke-virtual {p1, p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->setValue([B)Z

    .line 509
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/bluetooth/BluetoothGattCharacteristic;->setWriteType(I)V

    .line 510
    iget-object v0, p0, Lo/add;->e:Landroid/bluetooth/BluetoothGatt;

    invoke-virtual {v0, p1}, Landroid/bluetooth/BluetoothGatt;->writeCharacteristic(Landroid/bluetooth/BluetoothGattCharacteristic;)Z

    move-result v4

    .line 511
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "writeCharacteristic --> "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-direct {p0, p2}, Lo/add;->c([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 512
    return v4
.end method

.method static synthetic d(Lo/add;Landroid/bluetooth/BluetoothGattCharacteristic;)Landroid/bluetooth/BluetoothGattCharacteristic;
    .locals 0

    .line 31
    iput-object p1, p0, Lo/add;->f:Landroid/bluetooth/BluetoothGattCharacteristic;

    return-object p1
.end method

.method static synthetic d(Lo/add;)Ljava/util/ArrayList;
    .locals 1

    .line 31
    iget-object v0, p0, Lo/add;->p:Ljava/util/ArrayList;

    return-object v0
.end method

.method private d(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;Z)V
    .locals 5

    .line 172
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "GlucoseMeasureController setCharIndication() enabled = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 173
    invoke-virtual {p1, p2, p3}, Landroid/bluetooth/BluetoothGatt;->setCharacteristicNotification(Landroid/bluetooth/BluetoothGattCharacteristic;Z)Z

    .line 174
    const-string v0, "00002902-0000-1000-8000-00805f9b34fb"

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/bluetooth/BluetoothGattCharacteristic;->getDescriptor(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattDescriptor;

    move-result-object v4

    .line 175
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 176
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "GlucoseMeasureController setCharIndication descriptor == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 178
    :cond_0
    if-eqz p3, :cond_1

    .line 179
    sget-object v0, Landroid/bluetooth/BluetoothGattDescriptor;->ENABLE_INDICATION_VALUE:[B

    invoke-virtual {v4, v0}, Landroid/bluetooth/BluetoothGattDescriptor;->setValue([B)Z

    goto :goto_0

    .line 181
    :cond_1
    sget-object v0, Landroid/bluetooth/BluetoothGattDescriptor;->DISABLE_NOTIFICATION_VALUE:[B

    invoke-virtual {v4, v0}, Landroid/bluetooth/BluetoothGattDescriptor;->setValue([B)Z

    .line 183
    :goto_0
    iget-object v0, p0, Lo/add;->e:Landroid/bluetooth/BluetoothGatt;

    invoke-virtual {v0, v4}, Landroid/bluetooth/BluetoothGatt;->writeDescriptor(Landroid/bluetooth/BluetoothGattDescriptor;)Z

    .line 185
    :goto_1
    return-void
.end method

.method static synthetic e(Lo/add;I)I
    .locals 0

    .line 31
    iput p1, p0, Lo/add;->l:I

    return p1
.end method

.method static synthetic e(Lo/add;)Lo/afi;
    .locals 1

    .line 31
    iget-object v0, p0, Lo/add;->r:Lo/afi;

    return-object v0
.end method

.method static synthetic e(Lo/add;Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;Z)V
    .locals 0

    .line 31
    invoke-direct {p0, p1, p2, p3}, Lo/add;->d(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;Z)V

    return-void
.end method

.method static synthetic f(Lo/add;)Lo/abx;
    .locals 1

    .line 31
    iget-object v0, p0, Lo/add;->k:Lo/abx;

    return-object v0
.end method

.method static synthetic g(Lo/add;)Lo/acg;
    .locals 1

    .line 31
    iget-object v0, p0, Lo/add;->b:Lo/acg;

    return-object v0
.end method

.method static synthetic h(Lo/add;)Lo/acg;
    .locals 1

    .line 31
    iget-object v0, p0, Lo/add;->b:Lo/acg;

    return-object v0
.end method

.method static synthetic i(Lo/add;)Landroid/bluetooth/BluetoothGattService;
    .locals 1

    .line 31
    iget-object v0, p0, Lo/add;->d:Landroid/bluetooth/BluetoothGattService;

    return-object v0
.end method

.method static synthetic k(Lo/add;)I
    .locals 1

    .line 31
    iget v0, p0, Lo/add;->n:I

    return v0
.end method

.method static synthetic l(Lo/add;)Lo/aeo;
    .locals 1

    .line 31
    iget-object v0, p0, Lo/add;->t:Lo/aeo;

    return-object v0
.end method

.method static synthetic m(Lo/add;)Lo/acg;
    .locals 1

    .line 31
    iget-object v0, p0, Lo/add;->b:Lo/acg;

    return-object v0
.end method

.method static synthetic n(Lo/add;)Landroid/bluetooth/BluetoothGattCharacteristic;
    .locals 1

    .line 31
    iget-object v0, p0, Lo/add;->h:Landroid/bluetooth/BluetoothGattCharacteristic;

    return-object v0
.end method

.method static synthetic o(Lo/add;)Lo/aes;
    .locals 1

    .line 31
    iget-object v0, p0, Lo/add;->q:Lo/aes;

    return-object v0
.end method

.method static synthetic p(Lo/add;)Lo/adb;
    .locals 1

    .line 31
    iget-object v0, p0, Lo/add;->i:Lo/adb;

    return-object v0
.end method

.method static synthetic q(Lo/add;)Lo/acg;
    .locals 1

    .line 31
    iget-object v0, p0, Lo/add;->b:Lo/acg;

    return-object v0
.end method

.method static synthetic r(Lo/add;)I
    .locals 1

    .line 31
    iget v0, p0, Lo/add;->l:I

    return v0
.end method

.method static synthetic s(Lo/add;)Lo/acg;
    .locals 1

    .line 31
    iget-object v0, p0, Lo/add;->b:Lo/acg;

    return-object v0
.end method

.method static synthetic t(Lo/add;)Lo/acg;
    .locals 1

    .line 31
    iget-object v0, p0, Lo/add;->b:Lo/acg;

    return-object v0
.end method

.method static synthetic u(Lo/add;)Landroid/bluetooth/BluetoothGattCharacteristic;
    .locals 1

    .line 31
    iget-object v0, p0, Lo/add;->f:Landroid/bluetooth/BluetoothGattCharacteristic;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 14

    .line 461
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 463
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->get(I)I

    move-result v5

    .line 464
    const/4 v0, 0x2

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    add-int/lit8 v6, v0, 0x1

    .line 465
    const/4 v0, 0x5

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->get(I)I

    move-result v7

    .line 466
    const/16 v0, 0xb

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->get(I)I

    move-result v8

    .line 467
    const/16 v0, 0xc

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->get(I)I

    move-result v9

    .line 468
    const/16 v0, 0xd

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->get(I)I

    move-result v10

    .line 469
    invoke-virtual {v4}, Ljava/util/Calendar;->getFirstDayOfWeek()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v11, 0x1

    goto :goto_0

    :cond_0
    const/4 v11, 0x0

    .line 470
    :goto_0
    const/4 v0, 0x7

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->get(I)I

    move-result v12

    .line 471
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "GlucoseMeasureController syncCurrentTime data\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 472
    if-eqz v11, :cond_1

    .line 473
    add-int/lit8 v12, v12, -0x1

    .line 474
    if-nez v12, :cond_1

    .line 475
    const/4 v12, 0x7

    .line 478
    :cond_1
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "GlucoseMeasureController syncCurrentTime time\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 479
    const/16 v0, 0xa

    new-array v13, v0, [B

    .line 481
    and-int/lit16 v0, v5, 0xff

    int-to-byte v0, v0

    const/4 v1, 0x0

    aput-byte v0, v13, v1

    .line 482
    shr-int/lit8 v0, v5, 0x8

    and-int/lit16 v0, v0, 0xff

    int-to-byte v0, v0

    const/4 v1, 0x1

    aput-byte v0, v13, v1

    .line 483
    and-int/lit16 v0, v6, 0xff

    int-to-byte v0, v0

    const/4 v1, 0x2

    aput-byte v0, v13, v1

    .line 484
    and-int/lit16 v0, v7, 0xff

    int-to-byte v0, v0

    const/4 v1, 0x3

    aput-byte v0, v13, v1

    .line 486
    and-int/lit16 v0, v8, 0xff

    int-to-byte v0, v0

    const/4 v1, 0x4

    aput-byte v0, v13, v1

    .line 487
    and-int/lit16 v0, v9, 0xff

    int-to-byte v0, v0

    const/4 v1, 0x5

    aput-byte v0, v13, v1

    .line 488
    and-int/lit16 v0, v10, 0xff

    int-to-byte v0, v0

    const/4 v1, 0x6

    aput-byte v0, v13, v1

    .line 489
    and-int/lit16 v0, v12, 0xff

    int-to-byte v0, v0

    const/4 v1, 0x7

    aput-byte v0, v13, v1

    .line 490
    const/4 v0, 0x0

    const/16 v1, 0x8

    aput-byte v0, v13, v1

    .line 491
    const/4 v0, 0x0

    const/16 v1, 0x9

    aput-byte v0, v13, v1

    .line 493
    iget-object v0, p0, Lo/add;->t:Lo/aeo;

    new-instance v1, Lo/aer;

    sget-object v2, Lo/aeo$a;->c:Lo/aeo$a;

    invoke-direct {v1, v2, v13}, Lo/aer;-><init>(Lo/aeo$a;[B)V

    invoke-virtual {v0, v1}, Lo/aeo;->e(Lo/aer;)V

    .line 494
    iget-object v0, p0, Lo/add;->t:Lo/aeo;

    invoke-virtual {v0}, Lo/aeo;->c()V

    .line 495
    return-void
.end method

.method public a(Lo/acl;Lo/abx;Landroid/os/Bundle;)Z
    .locals 4

    .line 105
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "GlucoseMeasureController prepare"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 107
    invoke-virtual {p1}, Lo/acl;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/add;->m:Ljava/lang/String;

    .line 109
    invoke-super {p0, p1, p2, p3}, Lo/afu;->a(Lo/acl;Lo/abx;Landroid/os/Bundle;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 110
    iput-object p2, p0, Lo/add;->k:Lo/abx;

    .line 111
    const/4 v0, 0x1

    return v0

    .line 113
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public b(Lo/aer;Lo/aes;)V
    .locals 3

    .line 537
    iget-object v0, p0, Lo/add;->d:Landroid/bluetooth/BluetoothGattService;

    const-string v1, "00002A18-0000-1000-8000-00805f9b34fb"

    invoke-static {v1}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/bluetooth/BluetoothGattService;->getCharacteristic(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v0

    iput-object v0, p0, Lo/add;->g:Landroid/bluetooth/BluetoothGattCharacteristic;

    .line 538
    iget-object v0, p0, Lo/add;->d:Landroid/bluetooth/BluetoothGattService;

    const-string v1, "00002A52-0000-1000-8000-00805f9b34fb"

    invoke-static {v1}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/bluetooth/BluetoothGattService;->getCharacteristic(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v0

    iput-object v0, p0, Lo/add;->h:Landroid/bluetooth/BluetoothGattCharacteristic;

    .line 540
    iget-object v0, p0, Lo/add;->g:Landroid/bluetooth/BluetoothGattCharacteristic;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/add;->h:Landroid/bluetooth/BluetoothGattCharacteristic;

    if-eqz v0, :cond_0

    .line 541
    iput-object p2, p0, Lo/add;->q:Lo/aes;

    .line 542
    iget-object v0, p0, Lo/add;->e:Landroid/bluetooth/BluetoothGatt;

    iget-object v1, p0, Lo/add;->g:Landroid/bluetooth/BluetoothGattCharacteristic;

    const/4 v2, 0x1

    invoke-direct {p0, v0, v1, v2}, Lo/add;->c(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;Z)V

    .line 544
    :cond_0
    return-void
.end method

.method public b()Z
    .locals 1

    .line 118
    const/4 v0, 0x1

    return v0
.end method

.method protected c()Landroid/bluetooth/BluetoothGattCallback;
    .locals 1

    .line 98
    iget-object v0, p0, Lo/add;->u:Landroid/bluetooth/BluetoothGattCallback;

    return-object v0
.end method

.method public d()V
    .locals 4

    .line 131
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "GlucoseMeasureController cleanup"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 132
    iget-object v0, p0, Lo/add;->e:Landroid/bluetooth/BluetoothGatt;

    if-eqz v0, :cond_0

    .line 133
    iget-object v0, p0, Lo/add;->e:Landroid/bluetooth/BluetoothGatt;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothGatt;->close()V

    .line 135
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lo/add;->e:Landroid/bluetooth/BluetoothGatt;

    .line 136
    const/4 v0, 0x0

    iput-object v0, p0, Lo/add;->h:Landroid/bluetooth/BluetoothGattCharacteristic;

    .line 137
    const/4 v0, 0x0

    iput-object v0, p0, Lo/add;->d:Landroid/bluetooth/BluetoothGattService;

    .line 138
    const/4 v0, 0x0

    iput-object v0, p0, Lo/add;->g:Landroid/bluetooth/BluetoothGattCharacteristic;

    .line 139
    const/4 v0, 0x0

    iput-object v0, p0, Lo/add;->i:Lo/adb;

    .line 140
    const/4 v0, 0x0

    iput-object v0, p0, Lo/add;->k:Lo/abx;

    .line 141
    const/4 v0, 0x0

    iput v0, p0, Lo/add;->n:I

    .line 142
    return-void
.end method

.method public d(Lo/aer;Lo/aes;)V
    .locals 9

    .line 548
    const-string v0, "00001805-0000-1000-8000-00805f9b34fb"

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v4

    .line 549
    const-string v0, "00002a2b-0000-1000-8000-00805f9b34fb"

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v5

    .line 551
    const/4 v6, 0x0

    .line 552
    iget-object v0, p0, Lo/add;->e:Landroid/bluetooth/BluetoothGatt;

    invoke-virtual {v0, v4}, Landroid/bluetooth/BluetoothGatt;->getService(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattService;

    move-result-object v7

    .line 553
    if-eqz v7, :cond_1

    .line 554
    invoke-virtual {v7, v5}, Landroid/bluetooth/BluetoothGattService;->getCharacteristic(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v8

    .line 555
    if-eqz v8, :cond_0

    .line 556
    iput-object p2, p0, Lo/add;->q:Lo/aes;

    .line 557
    invoke-virtual {p1}, Lo/aer;->e()[B

    move-result-object v0

    invoke-direct {p0, v8, v0}, Lo/add;->c(Landroid/bluetooth/BluetoothGattCharacteristic;[B)Z

    move-result v6

    .line 558
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

    .line 560
    :cond_0
    goto :goto_0

    .line 561
    :cond_1
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "write BluetoothGattService is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 564
    :goto_0
    if-nez v6, :cond_2

    .line 565
    iget-object v0, p0, Lo/add;->q:Lo/aes;

    if-eqz v0, :cond_2

    .line 566
    iget-object v0, p0, Lo/add;->q:Lo/aes;

    invoke-interface {v0}, Lo/aes;->c()V

    .line 569
    :cond_2
    return-void
.end method

.method public e()V
    .locals 4

    .line 123
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "GlucoseMeasureController ending"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 124
    iget-object v0, p0, Lo/add;->e:Landroid/bluetooth/BluetoothGatt;

    if-eqz v0, :cond_0

    .line 125
    iget-object v0, p0, Lo/add;->e:Landroid/bluetooth/BluetoothGatt;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothGatt;->disconnect()V

    .line 127
    :cond_0
    return-void
.end method
