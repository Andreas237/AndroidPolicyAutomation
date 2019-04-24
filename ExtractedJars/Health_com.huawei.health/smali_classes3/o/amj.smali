.class public Lo/amj;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final i:[B

.field private static final k:[B

.field private static final l:[B

.field private static final n:[B


# instance fields
.field private a:Landroid/bluetooth/BluetoothDevice;

.field private b:Landroid/bluetooth/BluetoothHealthAppConfiguration;

.field private c:Landroid/content/Context;

.field private d:I

.field private e:Landroid/bluetooth/BluetoothHealth;

.field private f:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Landroid/os/Bundle;>;"
        }
    .end annotation
.end field

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private final m:Landroid/bluetooth/BluetoothHealthCallback;

.field private final p:Landroid/bluetooth/BluetoothProfile$ServiceListener;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 43
    const/16 v0, 0x30

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Lo/amj;->i:[B

    .line 55
    const/16 v0, 0x1a

    new-array v0, v0, [B

    fill-array-data v0, :array_1

    sput-object v0, Lo/amj;->k:[B

    .line 68
    const/16 v0, 0x16

    new-array v0, v0, [B

    fill-array-data v0, :array_2

    sput-object v0, Lo/amj;->n:[B

    .line 93
    const/4 v0, 0x6

    new-array v0, v0, [B

    fill-array-data v0, :array_3

    sput-object v0, Lo/amj;->l:[B

    return-void

    :array_0
    .array-data 1
        -0x1dt
        0x0t
        0x0t
        0x2ct
        0x0t
        0x3t
        0x50t
        0x79t
        0x0t
        0x26t
        -0x80t
        0x0t
        0x0t
        0x0t
        -0x80t
        0x0t
        -0x80t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        -0x80t
        0x0t
        0x0t
        0x0t
        0x0t
        0x8t
        0x0t
        0x22t
        0x9t
        0x22t
        0x58t
        0x36t
        0x7at
        -0x52t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
    .end array-data

    :array_1
    .array-data 1
        -0x19t
        0x0t
        0x0t
        0x12t
        0x0t
        0x10t
        0x0t
        0x1t
        0x2t
        0x1t
        0x0t
        0xat
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0xdt
        0x1ct
        0x0t
        0x4t
        0x40t
        0x0t
        0x0t
        0x0t
    .end array-data

    nop

    :array_2
    .array-data 1
        -0x19t
        0x0t
        0x0t
        0x12t
        0x0t
        0x10t
        0x0t
        0x2t
        0x2t
        0x1t
        0x0t
        0xat
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0xdt
        0x1ft
        0x0t
        0x0t
    .end array-data

    nop

    :array_3
    .array-data 1
        -0x1bt
        0x0t
        0x0t
        0x2t
        0x0t
        0x0t
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 114
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    const/4 v0, 0x0

    iput-object v0, p0, Lo/amj;->a:Landroid/bluetooth/BluetoothDevice;

    .line 35
    const/4 v0, 0x0

    iput-object v0, p0, Lo/amj;->e:Landroid/bluetooth/BluetoothHealth;

    .line 36
    const/4 v0, 0x0

    iput-object v0, p0, Lo/amj;->b:Landroid/bluetooth/BluetoothHealthAppConfiguration;

    .line 37
    const/4 v0, 0x0

    iput v0, p0, Lo/amj;->d:I

    .line 41
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/amj;->f:Ljava/util/ArrayList;

    .line 160
    new-instance v0, Lo/amj$1;

    invoke-direct {v0, p0}, Lo/amj$1;-><init>(Lo/amj;)V

    iput-object v0, p0, Lo/amj;->p:Landroid/bluetooth/BluetoothProfile$ServiceListener;

    .line 176
    new-instance v0, Lo/amj$3;

    invoke-direct {v0, p0}, Lo/amj$3;-><init>(Lo/amj;)V

    iput-object v0, p0, Lo/amj;->m:Landroid/bluetooth/BluetoothHealthCallback;

    .line 115
    iput-object p1, p0, Lo/amj;->c:Landroid/content/Context;

    .line 116
    return-void
.end method

.method private a([B)J
    .locals 10

    .line 336
    const-wide/16 v7, 0x0

    .line 337
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v9

    .line 338
    move-object v0, v9

    const/16 v1, 0x32

    aget-byte v1, p1, v1

    invoke-direct {p0, v1}, Lo/amj;->b(B)I

    move-result v1

    mul-int/lit8 v1, v1, 0x64

    const/16 v2, 0x33

    aget-byte v2, p1, v2

    invoke-direct {p0, v2}, Lo/amj;->b(B)I

    move-result v2

    add-int/2addr v1, v2

    const/16 v2, 0x34

    aget-byte v2, p1, v2

    .line 339
    invoke-direct {p0, v2}, Lo/amj;->b(B)I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    const/16 v3, 0x35

    aget-byte v3, p1, v3

    invoke-direct {p0, v3}, Lo/amj;->b(B)I

    move-result v3

    const/16 v4, 0x36

    aget-byte v4, p1, v4

    .line 340
    invoke-direct {p0, v4}, Lo/amj;->b(B)I

    move-result v4

    const/16 v5, 0x37

    aget-byte v5, p1, v5

    invoke-direct {p0, v5}, Lo/amj;->b(B)I

    move-result v5

    const/16 v6, 0x38

    aget-byte v6, p1, v6

    invoke-direct {p0, v6}, Lo/amj;->b(B)I

    move-result v6

    .line 338
    invoke-virtual/range {v0 .. v6}, Ljava/util/Calendar;->set(IIIIII)V

    .line 341
    invoke-virtual {v9}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v7

    .line 342
    const-wide v0, 0x86988603638L

    sub-long v0, v7, v0

    const-wide/16 v2, 0x3e8

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    const-wide v0, 0x86988603638L

    sub-long v0, v7, v0

    const-wide/16 v2, -0x3e8

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 344
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    .line 346
    :cond_0
    const-string v0, "BloodPressureController"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getTime() time = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 347
    return-wide v7
.end method

.method static synthetic a(Lo/amj;)Landroid/bluetooth/BluetoothHealth;
    .locals 1

    .line 25
    iget-object v0, p0, Lo/amj;->e:Landroid/bluetooth/BluetoothHealth;

    return-object v0
.end method

.method private b(B)I
    .locals 7

    .line 352
    const/4 v4, 0x0

    .line 353
    and-int/lit16 v0, p1, 0xff

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v5

    .line 356
    :try_start_0
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v4, v0

    .line 361
    goto :goto_0

    .line 358
    :catch_0
    move-exception v6

    .line 360
    const-string v0, "BloodPressureController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "hexadecimalToDecimal data = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 362
    :goto_0
    return v4
.end method

.method static synthetic b(Lo/amj;I)I
    .locals 0

    .line 25
    iput p1, p0, Lo/amj;->d:I

    return p1
.end method

.method private b(Landroid/os/ParcelFileDescriptor;)V
    .locals 11

    .line 202
    const/4 v4, 0x0

    .line 203
    const/4 v5, 0x0

    .line 204
    const/16 v0, 0x400

    new-array v6, v0, [B

    .line 205
    const/4 v7, 0x1

    .line 207
    :try_start_0
    new-instance v0, Ljava/io/FileInputStream;

    invoke-virtual {p1}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V

    move-object v4, v0

    .line 208
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-virtual {p1}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/FileDescriptor;)V

    move-object v5, v0

    .line 209
    :goto_0
    invoke-virtual {v4, v6}, Ljava/io/FileInputStream;->read([B)I

    move-result v0

    const/4 v1, -0x1

    if-le v0, v1, :cond_5

    .line 210
    const/4 v0, 0x0

    aget-byte v0, v6, v0

    const/16 v1, -0x1e

    if-ne v0, v1, :cond_0

    .line 212
    const-string v0, "BloodPressureController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fos.write RESPONSE_2_2_3"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 213
    sget-object v0, Lo/amj;->i:[B

    invoke-virtual {v5, v0}, Ljava/io/FileOutputStream;->write([B)V

    goto/16 :goto_1

    .line 214
    :cond_0
    const/4 v0, 0x0

    aget-byte v0, v6, v0

    const/16 v1, -0x19

    if-ne v0, v1, :cond_1

    const/16 v0, 0x12

    aget-byte v0, v6, v0

    const/16 v1, 0xd

    if-ne v0, v1, :cond_1

    const/16 v0, 0x13

    aget-byte v0, v6, v0

    const/16 v1, 0x1c

    if-ne v0, v1, :cond_1

    .line 217
    const-string v0, "BloodPressureController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fos.write(RESPONSE_3_2_3)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 218
    sget-object v0, Lo/amj;->k:[B

    invoke-virtual {v5, v0}, Ljava/io/FileOutputStream;->write([B)V

    goto/16 :goto_1

    .line 220
    :cond_1
    const/4 v0, 0x0

    aget-byte v0, v6, v0

    const/16 v1, -0x19

    if-ne v0, v1, :cond_2

    const/16 v0, 0x12

    aget-byte v0, v6, v0

    const/16 v1, 0xd

    if-ne v0, v1, :cond_2

    const/16 v0, 0x13

    aget-byte v0, v6, v0

    const/16 v1, 0x1f

    if-ne v0, v1, :cond_2

    .line 224
    const-string v0, "BloodPressureController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "receive data"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 225
    invoke-virtual {p0, v6}, Lo/amj;->b([B)Landroid/os/Bundle;

    move-result-object v8

    .line 226
    iget-object v0, p0, Lo/amj;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 228
    add-int/lit8 v7, v7, 0x1

    .line 229
    sget-object v0, Lo/amj;->n:[B

    int-to-byte v1, v7

    const/4 v2, 0x7

    aput-byte v1, v0, v2

    .line 230
    sget-object v0, Lo/amj;->n:[B

    invoke-virtual {v5, v0}, Ljava/io/FileOutputStream;->write([B)V

    .line 232
    goto/16 :goto_1

    :cond_2
    const/4 v0, 0x0

    aget-byte v0, v6, v0

    const/16 v1, -0x1a

    if-ne v0, v1, :cond_3

    .line 233
    const-string v0, "BloodPressureController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ABORT_APDU"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 234
    const/4 v7, 0x1

    .line 236
    iget-object v0, p0, Lo/amj;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_4

    .line 237
    new-instance v8, Landroid/content/Intent;

    const-string v0, "com.huawei.health.action.DEVICE_CONNECTED"

    invoke-direct {v8, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 238
    iget-object v0, p0, Lo/amj;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 239
    const-string v0, "productId"

    iget-object v1, p0, Lo/amj;->h:Ljava/lang/String;

    invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 240
    const-string v0, "kind"

    iget-object v1, p0, Lo/amj;->g:Ljava/lang/String;

    invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 241
    const-string v0, "address"

    iget-object v1, p0, Lo/amj;->a:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 242
    const-string v0, "bloodPressureDataList"

    iget-object v1, p0, Lo/amj;->f:Ljava/util/ArrayList;

    invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->putParcelableArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    .line 243
    const-string v0, "BloodPressureController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "productId is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/amj;->h:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 244
    iget-object v0, p0, Lo/amj;->c:Landroid/content/Context;

    invoke-virtual {v0, v8}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 245
    goto/16 :goto_1

    .line 247
    :cond_3
    const/4 v0, 0x0

    aget-byte v0, v6, v0

    const/16 v1, -0x1c

    if-ne v0, v1, :cond_4

    .line 248
    const-string v0, "BloodPressureController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fos.write(RESPONSE_6_2)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 249
    const/4 v7, 0x1

    .line 250
    sget-object v0, Lo/amj;->l:[B

    invoke-virtual {v5, v0}, Ljava/io/FileOutputStream;->write([B)V

    .line 252
    iget-object v0, p0, Lo/amj;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_4

    .line 253
    const-string v0, "BloodPressureController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "arrayList size is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/amj;->f:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 254
    new-instance v8, Landroid/content/Intent;

    const-string v0, "com.huawei.health.action.DEVICE_CONNECTED"

    invoke-direct {v8, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 255
    iget-object v0, p0, Lo/amj;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 256
    const-string v0, "productId"

    iget-object v1, p0, Lo/amj;->h:Ljava/lang/String;

    invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 257
    const-string v0, "kind"

    iget-object v1, p0, Lo/amj;->g:Ljava/lang/String;

    invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 258
    const-string v0, "address"

    iget-object v1, p0, Lo/amj;->a:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 259
    const-string v0, "bloodPressureDataList"

    iget-object v1, p0, Lo/amj;->f:Ljava/util/ArrayList;

    invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->putParcelableArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    .line 260
    const-string v0, "BloodPressureController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "productId is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/amj;->h:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 261
    iget-object v0, p0, Lo/amj;->c:Landroid/content/Context;

    invoke-virtual {v0, v8}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 264
    :cond_4
    :goto_1
    const/16 v0, 0x400

    new-array v6, v0, [B

    .line 265
    invoke-virtual {v5}, Ljava/io/FileOutputStream;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    .line 271
    :cond_5
    if-eqz p1, :cond_6

    .line 273
    :try_start_1
    invoke-virtual {p1}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 276
    goto :goto_2

    .line 274
    :catch_0
    move-exception v8

    .line 275
    const-string v0, "BloodPressureController"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HandleHealthChannelStateChange IOException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 279
    :cond_6
    :goto_2
    if-eqz v4, :cond_7

    .line 281
    :try_start_2
    invoke-virtual {v4}, Ljava/io/FileInputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 284
    goto :goto_3

    .line 282
    :catch_1
    move-exception v8

    .line 283
    const-string v0, "BloodPressureController"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fis close IOException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 287
    :cond_7
    :goto_3
    if-eqz v5, :cond_d

    .line 289
    :try_start_3
    invoke-virtual {v5}, Ljava/io/FileOutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 292
    goto/16 :goto_9

    .line 290
    :catch_2
    move-exception v8

    .line 291
    const-string v0, "BloodPressureController"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fos close IOException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 292
    goto/16 :goto_9

    .line 267
    :catch_3
    move-exception v8

    .line 268
    const-string v0, "BloodPressureController"

    const/4 v1, 0x2

    :try_start_4
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HandleHealthChannelStateChange error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 271
    if-eqz p1, :cond_8

    .line 273
    :try_start_5
    invoke-virtual {p1}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    .line 276
    goto :goto_4

    .line 274
    :catch_4
    move-exception v8

    .line 275
    const-string v0, "BloodPressureController"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HandleHealthChannelStateChange IOException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 279
    :cond_8
    :goto_4
    if-eqz v4, :cond_9

    .line 281
    :try_start_6
    invoke-virtual {v4}, Ljava/io/FileInputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_5

    .line 284
    goto :goto_5

    .line 282
    :catch_5
    move-exception v8

    .line 283
    const-string v0, "BloodPressureController"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fis close IOException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 287
    :cond_9
    :goto_5
    if-eqz v5, :cond_d

    .line 289
    :try_start_7
    invoke-virtual {v5}, Ljava/io/FileOutputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_6

    .line 292
    goto/16 :goto_9

    .line 290
    :catch_6
    move-exception v8

    .line 291
    const-string v0, "BloodPressureController"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fos close IOException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 292
    goto :goto_9

    .line 271
    :catchall_0
    move-exception v9

    if-eqz p1, :cond_a

    .line 273
    :try_start_8
    invoke-virtual {p1}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_7

    .line 276
    goto :goto_6

    .line 274
    :catch_7
    move-exception v10

    .line 275
    const-string v0, "BloodPressureController"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HandleHealthChannelStateChange IOException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v10}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 279
    :cond_a
    :goto_6
    if-eqz v4, :cond_b

    .line 281
    :try_start_9
    invoke-virtual {v4}, Ljava/io/FileInputStream;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_8

    .line 284
    goto :goto_7

    .line 282
    :catch_8
    move-exception v10

    .line 283
    const-string v0, "BloodPressureController"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fis close IOException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v10}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 287
    :cond_b
    :goto_7
    if-eqz v5, :cond_c

    .line 289
    :try_start_a
    invoke-virtual {v5}, Ljava/io/FileOutputStream;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_9

    .line 292
    goto :goto_8

    .line 290
    :catch_9
    move-exception v10

    .line 291
    const-string v0, "BloodPressureController"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fos close IOException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v10}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 295
    :cond_c
    :goto_8
    throw v9

    .line 296
    :cond_d
    :goto_9
    return-void
.end method

.method static synthetic c(Lo/amj;Landroid/bluetooth/BluetoothHealth;)Landroid/bluetooth/BluetoothHealth;
    .locals 0

    .line 25
    iput-object p1, p0, Lo/amj;->e:Landroid/bluetooth/BluetoothHealth;

    return-object p1
.end method

.method static synthetic c(Lo/amj;Landroid/bluetooth/BluetoothHealthAppConfiguration;)Landroid/bluetooth/BluetoothHealthAppConfiguration;
    .locals 0

    .line 25
    iput-object p1, p0, Lo/amj;->b:Landroid/bluetooth/BluetoothHealthAppConfiguration;

    return-object p1
.end method

.method static synthetic c(Lo/amj;)Landroid/bluetooth/BluetoothHealthCallback;
    .locals 1

    .line 25
    iget-object v0, p0, Lo/amj;->m:Landroid/bluetooth/BluetoothHealthCallback;

    return-object v0
.end method

.method static synthetic d(Lo/amj;Landroid/os/ParcelFileDescriptor;)V
    .locals 0

    .line 25
    invoke-direct {p0, p1}, Lo/amj;->b(Landroid/os/ParcelFileDescriptor;)V

    return-void
.end method

.method static synthetic e(Lo/amj;)Landroid/bluetooth/BluetoothHealthAppConfiguration;
    .locals 1

    .line 25
    iget-object v0, p0, Lo/amj;->b:Landroid/bluetooth/BluetoothHealthAppConfiguration;

    return-object v0
.end method


# virtual methods
.method public b([B)Landroid/os/Bundle;
    .locals 10

    .line 300
    const-string v0, "BloodPressureController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBloodPressureData()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 301
    const/16 v0, 0x2d

    aget-byte v0, p1, v0

    and-int/lit16 v0, v0, 0xff

    int-to-short v4, v0

    .line 302
    const/16 v0, 0x2f

    aget-byte v0, p1, v0

    and-int/lit16 v0, v0, 0xff

    int-to-short v5, v0

    .line 303
    const/16 v0, 0x3f

    aget-byte v0, p1, v0

    and-int/lit16 v0, v0, 0xff

    int-to-short v6, v0

    .line 304
    invoke-direct {p0, p1}, Lo/amj;->a([B)J

    move-result-wide v7

    .line 305
    const/16 v0, 0x7fff

    if-ge v4, v0, :cond_0

    if-lez v4, :cond_0

    goto :goto_0

    .line 308
    :cond_0
    const-string v0, "BloodPressureController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBloodPressureData() systolic invalid"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 309
    const/4 v4, 0x0

    .line 311
    :goto_0
    const/16 v0, 0x7fff

    if-ge v5, v0, :cond_1

    if-lez v5, :cond_1

    goto :goto_1

    .line 314
    :cond_1
    const-string v0, "BloodPressureController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBloodPressureData() diastolic invalid"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 315
    const/4 v5, 0x0

    .line 317
    :goto_1
    const/16 v0, 0x7fff

    if-ge v6, v0, :cond_2

    if-lez v6, :cond_2

    goto :goto_2

    .line 320
    :cond_2
    const-string v0, "BloodPressureController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBloodPressureData() heartRate invalid"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 321
    const/4 v6, 0x0

    .line 324
    :goto_2
    new-instance v9, Landroid/os/Bundle;

    invoke-direct {v9}, Landroid/os/Bundle;-><init>()V

    .line 325
    const-string v0, "systolic"

    invoke-virtual {v9, v0, v4}, Landroid/os/Bundle;->putShort(Ljava/lang/String;S)V

    .line 326
    const-string v0, "diastolic"

    invoke-virtual {v9, v0, v5}, Landroid/os/Bundle;->putShort(Ljava/lang/String;S)V

    .line 327
    const-string v0, "heartRate"

    invoke-virtual {v9, v0, v6}, Landroid/os/Bundle;->putShort(Ljava/lang/String;S)V

    .line 328
    const-string v0, "time"

    invoke-virtual {v9, v0, v7, v8}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 330
    return-object v9
.end method

.method public c()Z
    .locals 4

    .line 138
    const-string v0, "BloodPressureController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 140
    iget-object v0, p0, Lo/amj;->e:Landroid/bluetooth/BluetoothHealth;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/amj;->b:Landroid/bluetooth/BluetoothHealthAppConfiguration;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 141
    iget-object v0, p0, Lo/amj;->e:Landroid/bluetooth/BluetoothHealth;

    iget-object v1, p0, Lo/amj;->a:Landroid/bluetooth/BluetoothDevice;

    iget-object v2, p0, Lo/amj;->b:Landroid/bluetooth/BluetoothHealthAppConfiguration;

    invoke-virtual {v0, v1, v2}, Landroid/bluetooth/BluetoothHealth;->connectChannelToSource(Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothHealthAppConfiguration;)Z

    move-result v0

    return v0

    .line 143
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public c(Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 5

    .line 119
    const-string v0, "BloodPressureController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "prepare"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 120
    iput-object p1, p0, Lo/amj;->a:Landroid/bluetooth/BluetoothDevice;

    .line 121
    iput-object p2, p0, Lo/amj;->h:Ljava/lang/String;

    .line 122
    iput-object p3, p0, Lo/amj;->g:Ljava/lang/String;

    .line 124
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    iget-object v1, p0, Lo/amj;->c:Landroid/content/Context;

    iget-object v2, p0, Lo/amj;->p:Landroid/bluetooth/BluetoothProfile$ServiceListener;

    const/4 v3, 0x3

    invoke-virtual {v0, v1, v2, v3}, Landroid/bluetooth/BluetoothAdapter;->getProfileProxy(Landroid/content/Context;Landroid/bluetooth/BluetoothProfile$ServiceListener;I)Z

    .line 127
    const-wide/16 v0, 0x1f4

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 130
    goto :goto_0

    .line 128
    :catch_0
    move-exception v4

    .line 129
    const-string v0, "BloodPressureController"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "prepare InterruptedException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 131
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public d()V
    .locals 4

    .line 150
    const-string v0, "BloodPressureController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ending"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 152
    iget-object v0, p0, Lo/amj;->a:Landroid/bluetooth/BluetoothDevice;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/amj;->e:Landroid/bluetooth/BluetoothHealth;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 153
    iget-object v0, p0, Lo/amj;->e:Landroid/bluetooth/BluetoothHealth;

    iget-object v1, p0, Lo/amj;->a:Landroid/bluetooth/BluetoothDevice;

    iget-object v2, p0, Lo/amj;->b:Landroid/bluetooth/BluetoothHealthAppConfiguration;

    iget v3, p0, Lo/amj;->d:I

    invoke-virtual {v0, v1, v2, v3}, Landroid/bluetooth/BluetoothHealth;->disconnectChannel(Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothHealthAppConfiguration;I)Z

    .line 154
    iget-object v0, p0, Lo/amj;->e:Landroid/bluetooth/BluetoothHealth;

    iget-object v1, p0, Lo/amj;->b:Landroid/bluetooth/BluetoothHealthAppConfiguration;

    invoke-virtual {v0, v1}, Landroid/bluetooth/BluetoothHealth;->unregisterAppConfiguration(Landroid/bluetooth/BluetoothHealthAppConfiguration;)Z

    .line 155
    const/4 v0, 0x0

    iput-object v0, p0, Lo/amj;->e:Landroid/bluetooth/BluetoothHealth;

    .line 157
    :cond_0
    return-void
.end method
