.class public Lo/acv;
.super Lo/afu;
.source "SourceFile"


# static fields
.field private static final a:Ljava/util/UUID;

.field private static final c:Ljava/util/UUID;

.field private static final d:Ljava/util/UUID;

.field private static final e:Ljava/util/UUID;

.field private static final h:Ljava/util/UUID;

.field private static final i:Ljava/util/UUID;


# instance fields
.field private f:Lo/abx;

.field private g:Landroid/bluetooth/BluetoothGattCharacteristic;

.field private k:Landroid/bluetooth/BluetoothGattCharacteristic;

.field private l:Landroid/bluetooth/BluetoothGattCallback;

.field private n:Landroid/bluetooth/BluetoothGattCharacteristic;

.field private o:Lo/acz;

.field private p:Landroid/bluetooth/BluetoothGatt;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 29
    const-string v0, "00001810-0000-1000-8000-00805f9b34fb"

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    sput-object v0, Lo/acv;->a:Ljava/util/UUID;

    .line 31
    const-string v0, "00002A35-0000-1000-8000-00805f9b34fb"

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    sput-object v0, Lo/acv;->d:Ljava/util/UUID;

    .line 33
    const-string v0, "00002A08-0000-1000-8000-00805f9b34fb"

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    sput-object v0, Lo/acv;->c:Ljava/util/UUID;

    .line 35
    const-string v0, "00001805-0000-1000-8000-00805f9b34fb"

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    sput-object v0, Lo/acv;->e:Ljava/util/UUID;

    .line 37
    const-string v0, "00002A2B-0000-1000-8000-00805f9b34fb"

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    sput-object v0, Lo/acv;->h:Ljava/util/UUID;

    .line 39
    const-string v0, "00002902-0000-1000-8000-00805f9b34fb"

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    sput-object v0, Lo/acv;->i:Ljava/util/UUID;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 50
    invoke-direct {p0}, Lo/afu;-><init>()V

    .line 99
    new-instance v0, Lo/acv$1;

    invoke-direct {v0, p0}, Lo/acv$1;-><init>(Lo/acv;)V

    iput-object v0, p0, Lo/acv;->l:Landroid/bluetooth/BluetoothGattCallback;

    .line 51
    new-instance v0, Lo/acz;

    invoke-direct {v0}, Lo/acz;-><init>()V

    iput-object v0, p0, Lo/acv;->o:Lo/acz;

    .line 52
    return-void
.end method

.method static synthetic a(Lo/acv;Landroid/bluetooth/BluetoothGattCharacteristic;)Landroid/bluetooth/BluetoothGattCharacteristic;
    .locals 0

    .line 27
    iput-object p1, p0, Lo/acv;->n:Landroid/bluetooth/BluetoothGattCharacteristic;

    return-object p1
.end method

.method static synthetic a()Ljava/util/UUID;
    .locals 1

    .line 27
    sget-object v0, Lo/acv;->a:Ljava/util/UUID;

    return-object v0
.end method

.method static synthetic a(Lo/acv;)Lo/acg;
    .locals 1

    .line 27
    iget-object v0, p0, Lo/acv;->b:Lo/acg;

    return-object v0
.end method

.method static synthetic a(Lo/acv;Landroid/bluetooth/BluetoothGatt;)V
    .locals 0

    .line 27
    invoke-direct {p0, p1}, Lo/acv;->b(Landroid/bluetooth/BluetoothGatt;)V

    return-void
.end method

.method static synthetic b(Lo/acv;)Landroid/bluetooth/BluetoothGattCharacteristic;
    .locals 1

    .line 27
    iget-object v0, p0, Lo/acv;->k:Landroid/bluetooth/BluetoothGattCharacteristic;

    return-object v0
.end method

.method static synthetic b(Lo/acv;Lo/acz;)Lo/acz;
    .locals 0

    .line 27
    iput-object p1, p0, Lo/acv;->o:Lo/acz;

    return-object p1
.end method

.method private b(Landroid/bluetooth/BluetoothGatt;)V
    .locals 14

    .line 220
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BloodPressureMeasureController setDateTime"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 221
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 222
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->get(I)I

    move-result v5

    .line 223
    const/4 v0, 0x2

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    add-int/lit8 v6, v0, 0x1

    .line 224
    const/4 v0, 0x5

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->get(I)I

    move-result v7

    .line 225
    const/16 v0, 0xb

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->get(I)I

    move-result v8

    .line 226
    const/16 v0, 0xc

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->get(I)I

    move-result v9

    .line 227
    const/16 v0, 0xd

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->get(I)I

    move-result v10

    .line 229
    const/4 v11, 0x0

    .line 230
    const/4 v12, 0x0

    .line 232
    iget-object v0, p0, Lo/acv;->g:Landroid/bluetooth/BluetoothGattCharacteristic;

    if-eqz v0, :cond_0

    .line 233
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setDateTime mDateTimeCharacteristic != null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 234
    iget-object v11, p0, Lo/acv;->g:Landroid/bluetooth/BluetoothGattCharacteristic;

    .line 235
    const/4 v12, 0x7

    .line 237
    :cond_0
    iget-object v0, p0, Lo/acv;->n:Landroid/bluetooth/BluetoothGattCharacteristic;

    if-eqz v0, :cond_1

    .line 238
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setDateTime mCurrentTimeCharacteristic != null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 239
    iget-object v11, p0, Lo/acv;->n:Landroid/bluetooth/BluetoothGattCharacteristic;

    .line 240
    const/16 v12, 0xa

    .line 243
    :cond_1
    new-array v13, v12, [B

    .line 244
    and-int/lit16 v0, v5, 0xff

    int-to-byte v0, v0

    const/4 v1, 0x0

    aput-byte v0, v13, v1

    .line 245
    shr-int/lit8 v0, v5, 0x8

    and-int/lit16 v0, v0, 0xff

    int-to-byte v0, v0

    const/4 v1, 0x1

    aput-byte v0, v13, v1

    .line 246
    and-int/lit16 v0, v6, 0xff

    int-to-byte v0, v0

    const/4 v1, 0x2

    aput-byte v0, v13, v1

    .line 247
    and-int/lit16 v0, v7, 0xff

    int-to-byte v0, v0

    const/4 v1, 0x3

    aput-byte v0, v13, v1

    .line 248
    and-int/lit16 v0, v8, 0xff

    int-to-byte v0, v0

    const/4 v1, 0x4

    aput-byte v0, v13, v1

    .line 249
    and-int/lit16 v0, v9, 0xff

    int-to-byte v0, v0

    const/4 v1, 0x5

    aput-byte v0, v13, v1

    .line 250
    and-int/lit16 v0, v10, 0xff

    int-to-byte v0, v0

    const/4 v1, 0x6

    aput-byte v0, v13, v1

    .line 252
    if-eqz v11, :cond_2

    .line 253
    invoke-virtual {v11, v13}, Landroid/bluetooth/BluetoothGattCharacteristic;->setValue([B)Z

    .line 254
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setDateTime array = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v13}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 255
    invoke-virtual {p1, v11}, Landroid/bluetooth/BluetoothGatt;->writeCharacteristic(Landroid/bluetooth/BluetoothGattCharacteristic;)Z

    .line 257
    :cond_2
    return-void
.end method

.method private b(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)Z
    .locals 6

    .line 198
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BloodPressureMeasureController enableIndications"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 199
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 200
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 203
    :cond_1
    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getProperties()I

    move-result v4

    .line 204
    and-int/lit8 v0, v4, 0x20

    if-nez v0, :cond_2

    .line 205
    const/4 v0, 0x0

    return v0

    .line 207
    :cond_2
    const/4 v0, 0x1

    invoke-virtual {p1, p2, v0}, Landroid/bluetooth/BluetoothGatt;->setCharacteristicNotification(Landroid/bluetooth/BluetoothGattCharacteristic;Z)Z

    .line 208
    sget-object v0, Lo/acv;->i:Ljava/util/UUID;

    invoke-virtual {p2, v0}, Landroid/bluetooth/BluetoothGattCharacteristic;->getDescriptor(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattDescriptor;

    move-result-object v5

    .line 209
    if-eqz v5, :cond_3

    .line 210
    sget-object v0, Landroid/bluetooth/BluetoothGattDescriptor;->ENABLE_INDICATION_VALUE:[B

    invoke-virtual {v5, v0}, Landroid/bluetooth/BluetoothGattDescriptor;->setValue([B)Z

    .line 211
    invoke-virtual {p1, v5}, Landroid/bluetooth/BluetoothGatt;->writeDescriptor(Landroid/bluetooth/BluetoothGattDescriptor;)Z

    move-result v0

    return v0

    .line 213
    :cond_3
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic c(Lo/acv;Landroid/bluetooth/BluetoothGattCharacteristic;)Landroid/bluetooth/BluetoothGattCharacteristic;
    .locals 0

    .line 27
    iput-object p1, p0, Lo/acv;->g:Landroid/bluetooth/BluetoothGattCharacteristic;

    return-object p1
.end method

.method static synthetic c(Lo/acv;)Lo/abx;
    .locals 1

    .line 27
    iget-object v0, p0, Lo/acv;->f:Lo/abx;

    return-object v0
.end method

.method static synthetic c(Lo/acv;Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)Z
    .locals 1

    .line 27
    invoke-direct {p0, p1, p2}, Lo/acv;->b(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)Z

    move-result v0

    return v0
.end method

.method static synthetic d(Lo/acv;)Lo/acg;
    .locals 1

    .line 27
    iget-object v0, p0, Lo/acv;->b:Lo/acg;

    return-object v0
.end method

.method static synthetic e(Lo/acv;)Landroid/bluetooth/BluetoothGatt;
    .locals 1

    .line 27
    iget-object v0, p0, Lo/acv;->p:Landroid/bluetooth/BluetoothGatt;

    return-object v0
.end method

.method static synthetic e(Lo/acv;Landroid/bluetooth/BluetoothGatt;)Landroid/bluetooth/BluetoothGatt;
    .locals 0

    .line 27
    iput-object p1, p0, Lo/acv;->p:Landroid/bluetooth/BluetoothGatt;

    return-object p1
.end method

.method static synthetic e(Lo/acv;Landroid/bluetooth/BluetoothGattCharacteristic;)Landroid/bluetooth/BluetoothGattCharacteristic;
    .locals 0

    .line 27
    iput-object p1, p0, Lo/acv;->k:Landroid/bluetooth/BluetoothGattCharacteristic;

    return-object p1
.end method

.method static synthetic f()Ljava/util/UUID;
    .locals 1

    .line 27
    sget-object v0, Lo/acv;->e:Ljava/util/UUID;

    return-object v0
.end method

.method static synthetic f(Lo/acv;)Lo/acg;
    .locals 1

    .line 27
    iget-object v0, p0, Lo/acv;->b:Lo/acg;

    return-object v0
.end method

.method static synthetic g()Ljava/util/UUID;
    .locals 1

    .line 27
    sget-object v0, Lo/acv;->i:Ljava/util/UUID;

    return-object v0
.end method

.method static synthetic h(Lo/acv;)Landroid/bluetooth/BluetoothGattCharacteristic;
    .locals 1

    .line 27
    iget-object v0, p0, Lo/acv;->n:Landroid/bluetooth/BluetoothGattCharacteristic;

    return-object v0
.end method

.method static synthetic h()Ljava/util/UUID;
    .locals 1

    .line 27
    sget-object v0, Lo/acv;->d:Ljava/util/UUID;

    return-object v0
.end method

.method static synthetic i(Lo/acv;)Landroid/bluetooth/BluetoothGattCharacteristic;
    .locals 1

    .line 27
    iget-object v0, p0, Lo/acv;->g:Landroid/bluetooth/BluetoothGattCharacteristic;

    return-object v0
.end method

.method static synthetic i()Ljava/util/UUID;
    .locals 1

    .line 27
    sget-object v0, Lo/acv;->h:Ljava/util/UUID;

    return-object v0
.end method

.method static synthetic k()Ljava/util/UUID;
    .locals 1

    .line 27
    sget-object v0, Lo/acv;->c:Ljava/util/UUID;

    return-object v0
.end method

.method static synthetic k(Lo/acv;)Lo/acz;
    .locals 1

    .line 27
    iget-object v0, p0, Lo/acv;->o:Lo/acz;

    return-object v0
.end method


# virtual methods
.method public a(Lo/acl;Lo/abx;Landroid/os/Bundle;)Z
    .locals 4

    .line 61
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BloodPressureMeasureController prepare"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 62
    invoke-super {p0, p1, p2, p3}, Lo/afu;->a(Lo/acl;Lo/abx;Landroid/os/Bundle;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 63
    iput-object p2, p0, Lo/acv;->f:Lo/abx;

    .line 64
    const/4 v0, 0x1

    return v0

    .line 66
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public b()Z
    .locals 4

    .line 71
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BloodPressureMeasureController start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    const/4 v0, 0x1

    return v0
.end method

.method protected c()Landroid/bluetooth/BluetoothGattCallback;
    .locals 1

    .line 56
    iget-object v0, p0, Lo/acv;->l:Landroid/bluetooth/BluetoothGattCallback;

    return-object v0
.end method

.method public d()V
    .locals 4

    .line 86
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BloodPressureMeasureController cleanup"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 87
    iget-object v0, p0, Lo/acv;->p:Landroid/bluetooth/BluetoothGatt;

    if-eqz v0, :cond_0

    .line 88
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BloodPressureMeasureController close"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 89
    iget-object v0, p0, Lo/acv;->p:Landroid/bluetooth/BluetoothGatt;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothGatt;->close()V

    .line 91
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lo/acv;->k:Landroid/bluetooth/BluetoothGattCharacteristic;

    .line 92
    const/4 v0, 0x0

    iput-object v0, p0, Lo/acv;->g:Landroid/bluetooth/BluetoothGattCharacteristic;

    .line 93
    const/4 v0, 0x0

    iput-object v0, p0, Lo/acv;->n:Landroid/bluetooth/BluetoothGattCharacteristic;

    .line 94
    const/4 v0, 0x0

    iput-object v0, p0, Lo/acv;->f:Lo/abx;

    .line 95
    const/4 v0, 0x0

    iput-object v0, p0, Lo/acv;->o:Lo/acz;

    .line 97
    return-void
.end method

.method public e()V
    .locals 4

    .line 77
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BloodPressureMeasureController ending"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 78
    iget-object v0, p0, Lo/acv;->p:Landroid/bluetooth/BluetoothGatt;

    if-eqz v0, :cond_0

    .line 79
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BloodPressureMeasureController disconnect"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 80
    iget-object v0, p0, Lo/acv;->p:Landroid/bluetooth/BluetoothGatt;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothGatt;->disconnect()V

    .line 82
    :cond_0
    return-void
.end method
