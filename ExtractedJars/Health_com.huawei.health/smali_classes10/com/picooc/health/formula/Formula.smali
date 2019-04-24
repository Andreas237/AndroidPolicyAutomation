.class public Lcom/picooc/health/formula/Formula;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 7
    const-string v0, "dataFormula"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a([BFII)Lo/fkd;
    .locals 10

    .line 59
    new-instance v3, Lo/fkd;

    invoke-direct {v3}, Lo/fkd;-><init>()V

    .line 61
    const/4 v0, 0x0

    aget-byte v0, p0, v0

    const/16 v1, 0x30

    if-eq v0, v1, :cond_2

    .line 62
    const/4 v0, 0x0

    aget-byte v0, p0, v0

    const/16 v1, 0x35

    if-eq v0, v1, :cond_2

    .line 63
    const/4 v0, 0x0

    aget-byte v0, p0, v0

    const/16 v1, 0x36

    if-ne v0, v1, :cond_0

    .line 65
    const/4 v0, 0x2

    aget-byte v0, p0, v0

    shl-int/lit8 v0, v0, 0x18

    const/high16 v1, -0x1000000

    and-int/2addr v0, v1

    const/4 v1, 0x3

    aget-byte v1, p0, v1

    shl-int/lit8 v1, v1, 0x10

    const/high16 v2, 0xff0000

    and-int/2addr v1, v2

    add-int/2addr v0, v1

    const/4 v1, 0x4

    aget-byte v1, p0, v1

    shl-int/lit8 v1, v1, 0x8

    const v2, 0xff00

    and-int/2addr v1, v2

    add-int/2addr v0, v1

    const/4 v1, 0x5

    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    add-int/2addr v0, v1

    int-to-long v4, v0

    .line 67
    const/4 v0, 0x6

    aget-byte v0, p0, v0

    shl-int/lit8 v0, v0, 0x8

    const v1, 0xff00

    and-int/2addr v0, v1

    const/4 v1, 0x7

    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    add-int/2addr v0, v1

    int-to-float v0, v0

    const/high16 v1, 0x41a00000    # 20.0f

    div-float v6, v0, v1

    .line 68
    const/high16 v0, 0x41200000    # 10.0f

    mul-float/2addr v0, v6

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x41200000    # 10.0f

    div-float v6, v0, v1

    .line 71
    const/16 v0, 0x8

    aget-byte v0, p0, v0

    shl-int/lit8 v0, v0, 0x8

    const v1, 0xff00

    and-int/2addr v0, v1

    const/16 v1, 0x9

    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    add-int/2addr v0, v1

    div-int/lit8 v7, v0, 0xa

    .line 73
    invoke-static {p2, p1, p3, v6, v7}, Lcom/picooc/health/formula/Formula;->calculateBasicDataByImpedanceOldVersion2(IFIFI)[F

    move-result-object v8

    .line 75
    const/4 v0, 0x2

    invoke-virtual {v3, v0}, Lo/fkd;->a(I)V

    .line 76
    invoke-virtual {v3, v6}, Lo/fkd;->d(F)V

    .line 77
    const/4 v0, 0x1

    aget v0, v8, v0

    invoke-virtual {v3, v0}, Lo/fkd;->e(F)V

    .line 78
    const/4 v0, 0x2

    aget v0, v8, v0

    invoke-virtual {v3, v0}, Lo/fkd;->c(F)V

    .line 79
    const-wide/16 v0, 0x3e8

    mul-long/2addr v0, v4

    invoke-virtual {v3, v0, v1}, Lo/fkd;->a(J)V

    .line 80
    goto/16 :goto_0

    :cond_0
    const/4 v0, 0x0

    aget-byte v0, p0, v0

    const/16 v1, 0x37

    if-ne v0, v1, :cond_1

    .line 81
    const/4 v0, 0x3

    invoke-virtual {v3, v0}, Lo/fkd;->a(I)V

    .line 82
    goto/16 :goto_0

    :cond_1
    const/4 v0, 0x0

    aget-byte v0, p0, v0

    const/16 v1, 0x39

    if-ne v0, v1, :cond_2

    .line 84
    const/4 v0, 0x2

    aget-byte v0, p0, v0

    shl-int/lit8 v0, v0, 0x18

    const/high16 v1, -0x1000000

    and-int/2addr v0, v1

    const/4 v1, 0x3

    aget-byte v1, p0, v1

    shl-int/lit8 v1, v1, 0x10

    const/high16 v2, 0xff0000

    and-int/2addr v1, v2

    add-int/2addr v0, v1

    const/4 v1, 0x4

    aget-byte v1, p0, v1

    shl-int/lit8 v1, v1, 0x8

    const v2, 0xff00

    and-int/2addr v1, v2

    add-int/2addr v0, v1

    const/4 v1, 0x5

    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    add-int/2addr v0, v1

    int-to-long v4, v0

    .line 86
    const/4 v0, 0x6

    aget-byte v0, p0, v0

    shl-int/lit8 v0, v0, 0x8

    const v1, 0xff00

    and-int/2addr v0, v1

    const/4 v1, 0x7

    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    add-int/2addr v0, v1

    int-to-float v0, v0

    const/high16 v1, 0x41a00000    # 20.0f

    div-float v6, v0, v1

    .line 87
    const/high16 v0, 0x41200000    # 10.0f

    mul-float/2addr v0, v6

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x41200000    # 10.0f

    div-float v6, v0, v1

    .line 88
    const/4 v0, 0x0

    cmpl-float v0, v6, v0

    if-lez v0, :cond_2

    .line 90
    const/16 v0, 0x8

    aget-byte v0, p0, v0

    shl-int/lit8 v0, v0, 0x8

    const v1, 0xff00

    and-int/2addr v0, v1

    const/16 v1, 0x9

    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    add-int v7, v0, v1

    .line 91
    int-to-float v0, v7

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Lcom/picooc/health/formula/Formula;->c(F)I

    move-result v0

    mul-int/lit8 v8, v0, 0xa

    .line 94
    invoke-static {p2, p1, p3, v6, v8}, Lcom/picooc/health/formula/Formula;->calculateBasicDataByImpedanceOldVersion2(IFIFI)[F

    move-result-object v9

    .line 96
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lo/fkd;->a(I)V

    .line 97
    invoke-virtual {v3, v6}, Lo/fkd;->d(F)V

    .line 98
    const/4 v0, 0x1

    aget v0, v9, v0

    invoke-virtual {v3, v0}, Lo/fkd;->e(F)V

    .line 99
    const/4 v0, 0x2

    aget v0, v9, v0

    invoke-virtual {v3, v0}, Lo/fkd;->c(F)V

    .line 100
    const-wide/16 v0, 0x3e8

    mul-long/2addr v0, v4

    invoke-virtual {v3, v0, v1}, Lo/fkd;->a(J)V

    .line 103
    :cond_2
    :goto_0
    return-object v3
.end method

.method private static c(F)I
    .locals 3

    .line 109
    new-instance v0, Ljava/math/BigDecimal;

    float-to-double v1, p0

    invoke-direct {v0, v1, v2}, Ljava/math/BigDecimal;-><init>(D)V

    const/4 v1, 0x0

    const/4 v2, 0x4

    invoke-virtual {v0, v1, v2}, Ljava/math/BigDecimal;->setScale(II)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigDecimal;->intValue()I

    move-result v0

    return v0
.end method

.method protected static native calculateBasicDataByImpedanceOldVersion2(IFIFI)[F
.end method

.method public static d([B)[B
    .locals 11

    .line 20
    const/4 v0, 0x0

    aget-byte v0, p0, v0

    const/16 v1, 0x30

    if-ne v0, v1, :cond_0

    .line 22
    const/4 v0, 0x3

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    return-object v0

    .line 24
    :cond_0
    const/4 v0, 0x0

    aget-byte v0, p0, v0

    const/16 v1, 0x35

    if-ne v0, v1, :cond_1

    .line 26
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long v4, v0, v2

    .line 27
    const-wide v0, 0xff000000L

    and-long/2addr v0, v4

    const/16 v2, 0x18

    shr-long/2addr v0, v2

    long-to-int v0, v0

    int-to-byte v6, v0

    .line 28
    const-wide/32 v0, 0xff0000

    and-long/2addr v0, v4

    const/16 v2, 0x10

    shr-long/2addr v0, v2

    long-to-int v0, v0

    int-to-byte v7, v0

    .line 29
    const-wide/32 v0, 0xff00

    and-long/2addr v0, v4

    const/16 v2, 0x8

    shr-long/2addr v0, v2

    long-to-int v0, v0

    int-to-byte v8, v0

    .line 30
    const-wide/16 v0, 0xff

    and-long/2addr v0, v4

    long-to-int v0, v0

    int-to-byte v9, v0

    .line 32
    const/16 v0, 0x8

    new-array v10, v0, [B

    const/16 v0, -0xf

    const/4 v1, 0x0

    aput-byte v0, v10, v1

    const/16 v0, 0x8

    const/4 v1, 0x1

    aput-byte v0, v10, v1

    const/16 v0, 0x35

    const/4 v1, 0x2

    aput-byte v0, v10, v1

    const/4 v0, 0x3

    aput-byte v6, v10, v0

    const/4 v0, 0x4

    aput-byte v7, v10, v0

    const/4 v0, 0x5

    aput-byte v8, v10, v0

    const/4 v0, 0x6

    aput-byte v9, v10, v0

    .line 33
    return-object v10

    .line 34
    :cond_1
    const/4 v0, 0x0

    aget-byte v0, p0, v0

    const/16 v1, 0x36

    if-ne v0, v1, :cond_2

    .line 36
    const/4 v4, 0x3

    new-array v4, v4, [B

    fill-array-data v4, :array_1

    .line 37
    return-object v4

    .line 38
    :cond_2
    const/4 v0, 0x0

    aget-byte v0, p0, v0

    const/16 v1, 0x37

    if-ne v0, v1, :cond_3

    .line 40
    const/4 v4, 0x3

    new-array v4, v4, [B

    fill-array-data v4, :array_2

    .line 41
    return-object v4

    .line 42
    :cond_3
    const/4 v0, 0x0

    aget-byte v0, p0, v0

    const/16 v1, 0x39

    if-ne v0, v1, :cond_4

    .line 44
    const/4 v4, 0x3

    new-array v4, v4, [B

    fill-array-data v4, :array_3

    .line 45
    return-object v4

    .line 47
    :cond_4
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0

    nop

    :array_0
    .array-data 1
        -0xft
        0x3t
        0x30t
    .end array-data

    :array_1
    .array-data 1
        -0xft
        0x3t
        0x36t
    .end array-data

    :array_2
    .array-data 1
        -0xft
        0x3t
        0x37t
    .end array-data

    :array_3
    .array-data 1
        -0xft
        0x3t
        0x39t
    .end array-data
.end method
