.class public Lo/fjh;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:[I

.field private static b:[I

.field private static c:[I

.field private static d:[I

.field private static e:[I

.field private static f:Ljava/security/SecureRandom;

.field private static g:I

.field private static h:[I

.field private static i:I

.field private static k:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 54
    const/16 v0, 0x17

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lo/fjh;->a:[I

    .line 59
    const/4 v0, 0x7

    new-array v0, v0, [I

    fill-array-data v0, :array_1

    sput-object v0, Lo/fjh;->e:[I

    .line 64
    const/16 v0, 0x17

    new-array v0, v0, [I

    fill-array-data v0, :array_2

    sput-object v0, Lo/fjh;->c:[I

    .line 69
    const/4 v0, 0x7

    new-array v0, v0, [I

    fill-array-data v0, :array_3

    sput-object v0, Lo/fjh;->b:[I

    .line 74
    const/16 v0, 0x17

    new-array v0, v0, [I

    fill-array-data v0, :array_4

    sput-object v0, Lo/fjh;->d:[I

    .line 79
    const/4 v0, 0x7

    new-array v0, v0, [I

    fill-array-data v0, :array_5

    sput-object v0, Lo/fjh;->h:[I

    .line 80
    const/4 v0, 0x0

    sput v0, Lo/fjh;->g:I

    .line 81
    const/4 v0, 0x0

    sput v0, Lo/fjh;->i:I

    .line 82
    const/4 v0, 0x1

    sput v0, Lo/fjh;->k:I

    .line 83
    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    sput-object v0, Lo/fjh;->f:Ljava/security/SecureRandom;

    return-void

    :array_0
    .array-data 4
        0x1964
        0x15f4
        0x1d88
        0x22ec
        0x30d4
        0x259e
        0x129d
        0x1eb9
        0xe42
        0x26ac
        0x6248
        0x21cf
        0x1de2
        0x1ed7
        0x48da
        0x1964
        0x15f4
        0x1d88
        0x22ec
        0x30d4
        0x259e
        0x129d
        0x1eb9
    .end array-data

    :array_1
    .array-data 4
        0x3552
        0x26ac
        0x5244
        0x21cf
        0x1de2
        0x1ed7
        0x28a
    .end array-data

    :array_2
    .array-data 4
        0x11
        0x2f
        0x35
        0x22
        0x42
        0x1e
        0x1b
        0x41
        0x32
        0x14
        0x3c
        0x37
        0x32
        0x2d
        0x1e
        0x34
        0x16
        0x2a
        0x28
        0x19
        0x1e
        0x41
        0x11
    .end array-data

    :array_3
    .array-data 4
        0x1d
        0x2e
        0x1f
        0x28
        0x17
        0x10
        0xa
    .end array-data

    :array_4
    .array-data 4
        0x276
        0x96
        0x1c2
        0x21c
        0x2d0
        0x276
        0x78
        0xf0
        0x168
        0x5a
        0xd2
        0x1c2
        0x1c2
        0xf0
        0x2b2
        0x96
        0xb4
        0xf0
        0xd2
        0x1a4
        0xf0
        0x10e
        0x12c
    .end array-data

    :array_5
    .array-data 4
        0x1c2
        0x12c
        0x21c
        0xd2
        0x1a4
        0x10e
        0x78
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(D)D
    .locals 4

    .line 341
    const-wide/high16 v0, 0x4024000000000000L    # 10.0

    div-double v0, p0, v0

    const-wide/high16 v2, 0x4051000000000000L    # 68.0

    mul-double/2addr v0, v2

    const-wide v2, 0x3fa47ae147ae147bL    # 0.04

    mul-double/2addr v0, v2

    return-wide v0
.end method

.method static synthetic a()I
    .locals 1

    .line 26
    sget v0, Lo/fjh;->g:I

    return v0
.end method

.method private static a(Landroid/content/Context;)Lcom/huawei/hihealth/HiDataInsertOption;
    .locals 12

    .line 161
    new-instance v4, Lcom/huawei/hihealth/HiDataInsertOption;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiDataInsertOption;-><init>()V

    .line 162
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 163
    invoke-static {}, Lo/dbu;->c()Ljava/util/Date;

    move-result-object v6

    .line 164
    const/16 v0, -0x1d

    invoke-static {v6, v0}, Lo/dbu;->e(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v7

    .line 165
    invoke-virtual {v7}, Ljava/util/Date;->getTime()J

    move-result-wide v8

    .line 166
    const/4 v10, 0x0

    :goto_0
    const/16 v0, 0x17

    if-ge v10, v0, :cond_0

    .line 167
    int-to-long v0, v10

    const-wide/32 v2, 0x5265c00

    mul-long/2addr v0, v2

    add-long/2addr v0, v8

    const-wide/32 v2, 0xea60

    div-long/2addr v0, v2

    long-to-int v11, v0

    .line 168
    sget-object v0, Lo/fjh;->a:[I

    aget v0, v0, v10

    invoke-static {p0, v0, v11, v5}, Lo/fjh;->e(Landroid/content/Context;IILjava/util/List;)V

    .line 169
    sget-object v0, Lo/fjh;->d:[I

    aget v0, v0, v10

    invoke-static {p0, v0, v11, v5}, Lo/fjh;->b(Landroid/content/Context;IILjava/util/List;)V

    .line 170
    sget-object v0, Lo/fjh;->c:[I

    aget v0, v0, v10

    invoke-static {p0, v0, v11, v5}, Lo/fjh;->c(Landroid/content/Context;IILjava/util/List;)V

    .line 166
    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    .line 172
    :cond_0
    invoke-virtual {v4, v5}, Lcom/huawei/hihealth/HiDataInsertOption;->setDatas(Ljava/util/List;)V

    .line 173
    return-object v4
.end method

.method static synthetic b()I
    .locals 1

    .line 26
    sget v0, Lo/fjh;->k:I

    return v0
.end method

.method private static b(Landroid/content/Context;IILjava/util/List;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;IILjava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)V"
        }
    .end annotation

    .line 219
    const/16 v6, 0x168

    .line 220
    const/4 v7, 0x0

    .line 221
    const/4 v8, 0x0

    .line 222
    const/4 v9, 0x0

    .line 223
    add-int/lit16 v10, p2, 0x168

    :goto_0
    int-to-long v0, v10

    int-to-long v2, p2

    const-wide/16 v4, 0x5a0

    add-long/2addr v2, v4

    cmp-long v0, v0, v2

    if-gez v0, :cond_1

    .line 224
    sget-object v0, Lo/fjh;->f:Ljava/security/SecureRandom;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Ljava/security/SecureRandom;->nextInt(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1e

    add-int/lit8 v9, v0, 0x1e

    .line 225
    add-int/2addr v7, v9

    .line 226
    move v8, v10

    .line 227
    if-le v7, p1, :cond_0

    .line 228
    goto :goto_1

    .line 230
    :cond_0
    int-to-long v0, v10

    const-wide/32 v2, 0xea60

    mul-long/2addr v0, v2

    invoke-static {p0, p3, v0, v1, v9}, Lo/fjh;->d(Landroid/content/Context;Ljava/util/List;JI)V

    .line 223
    add-int/lit8 v10, v10, 0xa

    goto :goto_0

    .line 232
    :cond_1
    :goto_1
    int-to-long v0, v8

    const-wide/32 v2, 0xea60

    mul-long/2addr v0, v2

    sub-int v2, v7, v9

    sub-int v2, p1, v2

    invoke-static {p0, p3, v0, v1, v2}, Lo/fjh;->d(Landroid/content/Context;Ljava/util/List;JI)V

    .line 233
    return-void
.end method

.method public static c(I)D
    .locals 4

    .line 319
    if-gtz p0, :cond_0

    .line 320
    const-wide/16 v0, 0x0

    return-wide v0

    .line 322
    :cond_0
    int-to-double v0, p0

    const-wide v2, 0x3fe7851eb851eb85L    # 0.735

    mul-double/2addr v0, v2

    return-wide v0
.end method

.method static synthetic c()I
    .locals 2

    .line 26
    sget v0, Lo/fjh;->i:I

    add-int/lit8 v1, v0, 0x1

    sput v1, Lo/fjh;->i:I

    return v0
.end method

.method public static c(Landroid/content/Context;)V
    .locals 5

    .line 86
    if-nez p0, :cond_0

    .line 87
    const-string v0, "StepCountDataMockUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertWeekStepDetailToDB context = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 88
    return-void

    .line 90
    :cond_0
    invoke-static {p0}, Lo/fjh;->d(Landroid/content/Context;)Lcom/huawei/hihealth/HiDataInsertOption;

    move-result-object v4

    .line 92
    if-eqz v4, :cond_1

    .line 93
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/fjh$2;

    invoke-direct {v1, p0}, Lo/fjh$2;-><init>(Landroid/content/Context;)V

    invoke-interface {v0, v4, v1}, Lo/clt;->c(Lcom/huawei/hihealth/HiDataInsertOption;Lo/cma;)V

    .line 112
    :cond_1
    return-void
.end method

.method private static c(Landroid/content/Context;IILjava/util/List;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;IILjava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)V"
        }
    .end annotation

    .line 178
    const/4 v6, 0x7

    .line 179
    add-int/lit16 v7, p2, 0x168

    .line 180
    const/4 v8, 0x0

    .line 181
    const/4 v9, 0x0

    :goto_0
    if-ge v9, p1, :cond_3

    .line 182
    new-instance v10, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {v10}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 183
    add-int v0, v7, v9

    int-to-long v0, v0

    const-wide/32 v2, 0xea60

    mul-long/2addr v0, v2

    add-int v2, v7, v9

    int-to-long v2, v2

    const-wide/32 v4, 0xea60

    mul-long/2addr v2, v4

    const-wide/32 v4, 0xea60

    add-long/2addr v2, v4

    invoke-virtual {v10, v0, v1, v2, v3}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 184
    if-lez v9, :cond_0

    const/16 v0, 0xa

    if-gt v9, v0, :cond_0

    .line 185
    const/4 v0, 0x1

    invoke-virtual {v10, v0}, Lcom/huawei/hihealth/HiHealthData;->setValue(I)V

    goto :goto_1

    .line 186
    :cond_0
    const/16 v0, 0xa

    if-le v9, v0, :cond_1

    const/16 v0, 0x1e

    if-gt v9, v0, :cond_1

    .line 187
    const/4 v0, 0x2

    invoke-virtual {v10, v0}, Lcom/huawei/hihealth/HiHealthData;->setValue(I)V

    goto :goto_1

    .line 188
    :cond_1
    const/16 v0, 0x1e

    if-le v9, v0, :cond_2

    const/16 v0, 0x2d

    if-gt v9, v0, :cond_2

    .line 189
    const/4 v0, 0x4

    invoke-virtual {v10, v0}, Lcom/huawei/hihealth/HiHealthData;->setValue(I)V

    goto :goto_1

    .line 191
    :cond_2
    const/4 v0, 0x3

    invoke-virtual {v10, v0}, Lcom/huawei/hihealth/HiHealthData;->setValue(I)V

    .line 193
    :goto_1
    invoke-virtual {v10, v6}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 194
    invoke-static {p0}, Lo/cne;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 195
    invoke-interface {p3, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 181
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_0

    .line 198
    :cond_3
    return-void
.end method

.method private static c(Landroid/content/Context;Ljava/util/List;JI)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;JI)V"
        }
    .end annotation

    .line 243
    int-to-double v0, p4

    const/4 v2, 0x2

    invoke-static {v2, v0, v1}, Lo/cno;->e(ID)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 244
    new-instance v4, Lcom/huawei/hihealth/HiHealthData;

    const/4 v0, 0x2

    invoke-direct {v4, v0}, Lcom/huawei/hihealth/HiHealthData;-><init>(I)V

    .line 245
    const-wide/32 v0, 0xea60

    add-long/2addr v0, p2

    invoke-virtual {v4, p2, p3, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 246
    invoke-virtual {v4, p4}, Lcom/huawei/hihealth/HiHealthData;->setValue(I)V

    .line 247
    invoke-static {p0}, Lo/cne;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 248
    invoke-interface {p1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 249
    const-string v0, "StepCountDataMockUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fillMinDetailData stepPointData="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 252
    :cond_0
    int-to-double v0, p4

    invoke-static {v0, v1}, Lo/fjh;->d(D)D

    move-result-wide v0

    const/4 v2, 0x4

    invoke-static {v2, v0, v1}, Lo/cno;->e(ID)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 253
    new-instance v4, Lcom/huawei/hihealth/HiHealthData;

    const/4 v0, 0x4

    invoke-direct {v4, v0}, Lcom/huawei/hihealth/HiHealthData;-><init>(I)V

    .line 254
    const-wide/32 v0, 0xea60

    add-long/2addr v0, p2

    invoke-virtual {v4, p2, p3, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 255
    int-to-double v0, p4

    invoke-static {v0, v1}, Lo/fjh;->d(D)D

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setValue(D)V

    .line 256
    invoke-static {p0}, Lo/cne;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 257
    invoke-interface {p1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 258
    const-string v0, "StepCountDataMockUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fillMinDetailData calPointData="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 261
    :cond_1
    invoke-static {p4}, Lo/fjh;->c(I)D

    move-result-wide v0

    const/4 v2, 0x3

    invoke-static {v2, v0, v1}, Lo/cno;->e(ID)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 262
    new-instance v4, Lcom/huawei/hihealth/HiHealthData;

    const/4 v0, 0x3

    invoke-direct {v4, v0}, Lcom/huawei/hihealth/HiHealthData;-><init>(I)V

    .line 263
    const-wide/32 v0, 0xea60

    add-long/2addr v0, p2

    invoke-virtual {v4, p2, p3, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 264
    invoke-static {p4}, Lo/fjh;->c(I)D

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setValue(D)V

    .line 265
    invoke-static {p0}, Lo/cne;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 266
    invoke-interface {p1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 267
    const-string v0, "StepCountDataMockUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fillMinDetailData disPointData="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 270
    :cond_2
    const/16 v0, 0x4e22

    const-wide v1, 0x40d3888000000000L    # 20002.0

    invoke-static {v0, v1, v2}, Lo/cno;->e(ID)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 271
    new-instance v4, Lcom/huawei/hihealth/HiHealthData;

    const/16 v0, 0x4e22

    invoke-direct {v4, v0}, Lcom/huawei/hihealth/HiHealthData;-><init>(I)V

    .line 272
    const-wide/32 v0, 0xea60

    add-long/2addr v0, p2

    invoke-virtual {v4, p2, p3, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 273
    const/16 v0, 0x4e22

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiHealthData;->setValue(I)V

    .line 274
    invoke-static {p0}, Lo/cne;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 275
    invoke-interface {p1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 277
    :cond_3
    return-void
.end method

.method public static d(D)D
    .locals 4

    .line 332
    const-wide/high16 v0, 0x3fe0000000000000L    # 0.5

    mul-double/2addr v0, p0

    const-wide v2, 0x3fe7851eb851eb85L    # 0.735

    mul-double/2addr v0, v2

    const-wide/high16 v2, 0x4051000000000000L    # 68.0

    mul-double/2addr v0, v2

    return-wide v0
.end method

.method static synthetic d()I
    .locals 1

    .line 26
    sget v0, Lo/fjh;->i:I

    return v0
.end method

.method private static d(Landroid/content/Context;)Lcom/huawei/hihealth/HiDataInsertOption;
    .locals 12

    .line 144
    new-instance v4, Lcom/huawei/hihealth/HiDataInsertOption;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiDataInsertOption;-><init>()V

    .line 145
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 146
    invoke-static {}, Lo/dbu;->c()Ljava/util/Date;

    move-result-object v6

    .line 147
    const/4 v0, -0x6

    invoke-static {v6, v0}, Lo/dbu;->e(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v7

    .line 148
    invoke-virtual {v7}, Ljava/util/Date;->getTime()J

    move-result-wide v8

    .line 149
    const/4 v10, 0x6

    :goto_0
    if-ltz v10, :cond_0

    .line 150
    int-to-long v0, v10

    const-wide/32 v2, 0x5265c00

    mul-long/2addr v0, v2

    add-long/2addr v0, v8

    const-wide/32 v2, 0xea60

    div-long/2addr v0, v2

    long-to-int v11, v0

    .line 151
    const-string v0, "StepCountDataMockUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getWeekStepDetailOption startMin="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " i = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 152
    sget-object v0, Lo/fjh;->e:[I

    aget v0, v0, v10

    invoke-static {p0, v0, v11, v5}, Lo/fjh;->e(Landroid/content/Context;IILjava/util/List;)V

    .line 153
    sget-object v0, Lo/fjh;->h:[I

    aget v0, v0, v10

    invoke-static {p0, v0, v11, v5}, Lo/fjh;->b(Landroid/content/Context;IILjava/util/List;)V

    .line 154
    sget-object v0, Lo/fjh;->b:[I

    aget v0, v0, v10

    invoke-static {p0, v0, v11, v5}, Lo/fjh;->c(Landroid/content/Context;IILjava/util/List;)V

    .line 149
    add-int/lit8 v10, v10, -0x1

    goto :goto_0

    .line 156
    :cond_0
    invoke-virtual {v4, v5}, Lcom/huawei/hihealth/HiDataInsertOption;->setDatas(Ljava/util/List;)V

    .line 157
    return-object v4
.end method

.method private static d(Landroid/content/Context;Ljava/util/List;JI)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;JI)V"
        }
    .end annotation

    .line 286
    int-to-double v0, p4

    const/4 v2, 0x5

    invoke-static {v2, v0, v1}, Lo/cno;->e(ID)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 287
    new-instance v4, Lcom/huawei/hihealth/HiHealthData;

    const/4 v0, 0x5

    invoke-direct {v4, v0}, Lcom/huawei/hihealth/HiHealthData;-><init>(I)V

    .line 288
    const-wide/32 v0, 0xea60

    add-long/2addr v0, p2

    invoke-virtual {v4, p2, p3, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 289
    invoke-virtual {v4, p4}, Lcom/huawei/hihealth/HiHealthData;->setValue(I)V

    .line 290
    invoke-static {p0}, Lo/cne;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 291
    invoke-interface {p1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 292
    const-string v0, "StepCountDataMockUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fillDayFloorDetail pointData="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 295
    :cond_0
    const/16 v0, 0x4e24

    const-wide v1, 0x40d3890000000000L    # 20004.0

    invoke-static {v0, v1, v2}, Lo/cno;->e(ID)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 296
    new-instance v4, Lcom/huawei/hihealth/HiHealthData;

    const/16 v0, 0x4e24

    invoke-direct {v4, v0}, Lcom/huawei/hihealth/HiHealthData;-><init>(I)V

    .line 297
    const-wide/32 v0, 0xea60

    add-long/2addr v0, p2

    invoke-virtual {v4, p2, p3, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 298
    const/16 v0, 0x4e24

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiHealthData;->setValue(I)V

    .line 299
    invoke-static {p0}, Lo/cne;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 300
    invoke-interface {p1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 303
    :cond_1
    int-to-double v0, p4

    invoke-static {v0, v1}, Lo/fjh;->a(D)D

    move-result-wide v0

    const/4 v2, 0x4

    invoke-static {v2, v0, v1}, Lo/cno;->e(ID)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 304
    new-instance v4, Lcom/huawei/hihealth/HiHealthData;

    const/4 v0, 0x4

    invoke-direct {v4, v0}, Lcom/huawei/hihealth/HiHealthData;-><init>(I)V

    .line 305
    const-wide/32 v0, 0xea60

    add-long/2addr v0, p2

    invoke-virtual {v4, p2, p3, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 306
    int-to-double v0, p4

    invoke-static {v0, v1}, Lo/fjh;->a(D)D

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setValue(D)V

    .line 307
    invoke-static {p0}, Lo/cne;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 308
    invoke-interface {p1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 309
    const-string v0, "StepCountDataMockUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fillMinDetailData calPointData="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 311
    :cond_2
    return-void
.end method

.method static synthetic e()I
    .locals 2

    .line 26
    sget v0, Lo/fjh;->g:I

    add-int/lit8 v1, v0, 0x1

    sput v1, Lo/fjh;->g:I

    return v0
.end method

.method public static e(Landroid/content/Context;)V
    .locals 5

    .line 115
    if-nez p0, :cond_0

    .line 116
    const-string v0, "StepCountDataMockUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertMonthStepDetailToDB context = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 117
    return-void

    .line 119
    :cond_0
    invoke-static {p0}, Lo/fjh;->a(Landroid/content/Context;)Lcom/huawei/hihealth/HiDataInsertOption;

    move-result-object v4

    .line 121
    if-eqz v4, :cond_1

    .line 122
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/fjh$1;

    invoke-direct {v1, p0}, Lo/fjh$1;-><init>(Landroid/content/Context;)V

    invoke-interface {v0, v4, v1}, Lo/clt;->c(Lcom/huawei/hihealth/HiDataInsertOption;Lo/cma;)V

    .line 141
    :cond_1
    return-void
.end method

.method private static e(Landroid/content/Context;IILjava/util/List;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;IILjava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)V"
        }
    .end annotation

    .line 202
    const/16 v6, 0x168

    .line 203
    const/4 v7, 0x0

    .line 204
    const/4 v8, 0x0

    .line 205
    const/4 v9, 0x0

    .line 206
    add-int/lit16 v10, p2, 0x168

    :goto_0
    int-to-long v0, v10

    int-to-long v2, p2

    const-wide/16 v4, 0x5a0

    add-long/2addr v2, v4

    cmp-long v0, v0, v2

    if-gez v0, :cond_1

    .line 207
    sget-object v0, Lo/fjh;->f:Ljava/security/SecureRandom;

    const/16 v1, 0x14

    invoke-virtual {v0, v1}, Ljava/security/SecureRandom;->nextInt(I)I

    move-result v0

    add-int/lit8 v9, v0, 0x5a

    .line 208
    add-int/2addr v7, v9

    .line 209
    move v8, v10

    .line 210
    if-le v7, p1, :cond_0

    .line 211
    goto :goto_1

    .line 213
    :cond_0
    int-to-long v0, v10

    const-wide/32 v2, 0xea60

    mul-long/2addr v0, v2

    invoke-static {p0, p3, v0, v1, v9}, Lo/fjh;->c(Landroid/content/Context;Ljava/util/List;JI)V

    .line 206
    add-int/lit8 v10, v10, 0x4

    goto :goto_0

    .line 215
    :cond_1
    :goto_1
    int-to-long v0, v8

    const-wide/32 v2, 0xea60

    mul-long/2addr v0, v2

    sub-int v2, v7, v9

    sub-int v2, p1, v2

    invoke-static {p0, p3, v0, v1, v2}, Lo/fjh;->c(Landroid/content/Context;Ljava/util/List;JI)V

    .line 216
    return-void
.end method
