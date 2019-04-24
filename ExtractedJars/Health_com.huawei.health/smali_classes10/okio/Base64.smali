.class final Lokio/Base64;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final MAP:[B

.field private static final URL_MAP:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 110
    const/16 v0, 0x40

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Lokio/Base64;->MAP:[B

    .line 117
    const/16 v0, 0x40

    new-array v0, v0, [B

    fill-array-data v0, :array_1

    sput-object v0, Lokio/Base64;->URL_MAP:[B

    return-void

    nop

    :array_0
    .array-data 1
        0x41t
        0x42t
        0x43t
        0x44t
        0x45t
        0x46t
        0x47t
        0x48t
        0x49t
        0x4at
        0x4bt
        0x4ct
        0x4dt
        0x4et
        0x4ft
        0x50t
        0x51t
        0x52t
        0x53t
        0x54t
        0x55t
        0x56t
        0x57t
        0x58t
        0x59t
        0x5at
        0x61t
        0x62t
        0x63t
        0x64t
        0x65t
        0x66t
        0x67t
        0x68t
        0x69t
        0x6at
        0x6bt
        0x6ct
        0x6dt
        0x6et
        0x6ft
        0x70t
        0x71t
        0x72t
        0x73t
        0x74t
        0x75t
        0x76t
        0x77t
        0x78t
        0x79t
        0x7at
        0x30t
        0x31t
        0x32t
        0x33t
        0x34t
        0x35t
        0x36t
        0x37t
        0x38t
        0x39t
        0x2bt
        0x2ft
    .end array-data

    :array_1
    .array-data 1
        0x41t
        0x42t
        0x43t
        0x44t
        0x45t
        0x46t
        0x47t
        0x48t
        0x49t
        0x4at
        0x4bt
        0x4ct
        0x4dt
        0x4et
        0x4ft
        0x50t
        0x51t
        0x52t
        0x53t
        0x54t
        0x55t
        0x56t
        0x57t
        0x58t
        0x59t
        0x5at
        0x61t
        0x62t
        0x63t
        0x64t
        0x65t
        0x66t
        0x67t
        0x68t
        0x69t
        0x6at
        0x6bt
        0x6ct
        0x6dt
        0x6et
        0x6ft
        0x70t
        0x71t
        0x72t
        0x73t
        0x74t
        0x75t
        0x76t
        0x77t
        0x78t
        0x79t
        0x7at
        0x30t
        0x31t
        0x32t
        0x33t
        0x34t
        0x35t
        0x36t
        0x37t
        0x38t
        0x39t
        0x2dt
        0x5ft
    .end array-data
.end method

.method private constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    return-void
.end method

.method public static decode(Ljava/lang/String;)[B
    .locals 12

    .line 31
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    .line 32
    :goto_0
    if-lez v4, :cond_1

    .line 33
    add-int/lit8 v0, v4, -0x1

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v5

    .line 34
    const/16 v0, 0x3d

    if-eq v5, v0, :cond_0

    const/16 v0, 0xa

    if-eq v5, v0, :cond_0

    const/16 v0, 0xd

    if-eq v5, v0, :cond_0

    const/16 v0, 0x20

    if-eq v5, v0, :cond_0

    const/16 v0, 0x9

    if-eq v5, v0, :cond_0

    .line 35
    goto :goto_1

    .line 32
    :cond_0
    add-int/lit8 v4, v4, -0x1

    goto :goto_0

    .line 40
    :cond_1
    :goto_1
    int-to-long v0, v4

    const-wide/16 v2, 0x6

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x8

    div-long/2addr v0, v2

    long-to-int v0, v0

    new-array v5, v0, [B

    .line 41
    const/4 v6, 0x0

    .line 42
    const/4 v7, 0x0

    .line 44
    const/4 v8, 0x0

    .line 45
    const/4 v9, 0x0

    :goto_2
    if-ge v9, v4, :cond_b

    .line 46
    invoke-virtual {p0, v9}, Ljava/lang/String;->charAt(I)C

    move-result v10

    .line 49
    const/16 v0, 0x41

    if-lt v10, v0, :cond_2

    const/16 v0, 0x5a

    if-gt v10, v0, :cond_2

    .line 53
    add-int/lit8 v11, v10, -0x41

    goto :goto_3

    .line 54
    :cond_2
    const/16 v0, 0x61

    if-lt v10, v0, :cond_3

    const/16 v0, 0x7a

    if-gt v10, v0, :cond_3

    .line 58
    add-int/lit8 v11, v10, -0x47

    goto :goto_3

    .line 59
    :cond_3
    const/16 v0, 0x30

    if-lt v10, v0, :cond_4

    const/16 v0, 0x39

    if-gt v10, v0, :cond_4

    .line 63
    add-int/lit8 v11, v10, 0x4

    goto :goto_3

    .line 64
    :cond_4
    const/16 v0, 0x2b

    if-eq v10, v0, :cond_5

    const/16 v0, 0x2d

    if-ne v10, v0, :cond_6

    .line 65
    :cond_5
    const/16 v11, 0x3e

    goto :goto_3

    .line 66
    :cond_6
    const/16 v0, 0x2f

    if-eq v10, v0, :cond_7

    const/16 v0, 0x5f

    if-ne v10, v0, :cond_8

    .line 67
    :cond_7
    const/16 v11, 0x3f

    goto :goto_3

    .line 68
    :cond_8
    const/16 v0, 0xa

    if-eq v10, v0, :cond_a

    const/16 v0, 0xd

    if-eq v10, v0, :cond_a

    const/16 v0, 0x20

    if-eq v10, v0, :cond_a

    const/16 v0, 0x9

    if-ne v10, v0, :cond_9

    .line 69
    goto :goto_4

    .line 71
    :cond_9
    const/4 v0, 0x0

    return-object v0

    .line 75
    :goto_3
    shl-int/lit8 v0, v8, 0x6

    int-to-byte v1, v11

    or-int v8, v0, v1

    .line 78
    add-int/lit8 v7, v7, 0x1

    .line 79
    rem-int/lit8 v0, v7, 0x4

    if-nez v0, :cond_a

    .line 80
    move v0, v6

    add-int/lit8 v6, v6, 0x1

    shr-int/lit8 v1, v8, 0x10

    int-to-byte v1, v1

    aput-byte v1, v5, v0

    .line 81
    move v0, v6

    add-int/lit8 v6, v6, 0x1

    shr-int/lit8 v1, v8, 0x8

    int-to-byte v1, v1

    aput-byte v1, v5, v0

    .line 82
    move v0, v6

    add-int/lit8 v6, v6, 0x1

    int-to-byte v1, v8

    aput-byte v1, v5, v0

    .line 45
    :cond_a
    :goto_4
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_2

    .line 86
    :cond_b
    rem-int/lit8 v9, v7, 0x4

    .line 87
    const/4 v0, 0x1

    if-ne v9, v0, :cond_c

    .line 89
    const/4 v0, 0x0

    return-object v0

    .line 90
    :cond_c
    const/4 v0, 0x2

    if-ne v9, v0, :cond_d

    .line 92
    shl-int/lit8 v8, v8, 0xc

    .line 93
    move v0, v6

    add-int/lit8 v6, v6, 0x1

    shr-int/lit8 v1, v8, 0x10

    int-to-byte v1, v1

    aput-byte v1, v5, v0

    goto :goto_5

    .line 94
    :cond_d
    const/4 v0, 0x3

    if-ne v9, v0, :cond_e

    .line 96
    shl-int/lit8 v8, v8, 0x6

    .line 97
    move v0, v6

    add-int/lit8 v6, v6, 0x1

    shr-int/lit8 v1, v8, 0x10

    int-to-byte v1, v1

    aput-byte v1, v5, v0

    .line 98
    move v0, v6

    add-int/lit8 v6, v6, 0x1

    shr-int/lit8 v1, v8, 0x8

    int-to-byte v1, v1

    aput-byte v1, v5, v0

    .line 102
    :cond_e
    :goto_5
    array-length v0, v5

    if-ne v6, v0, :cond_f

    return-object v5

    .line 105
    :cond_f
    new-array v10, v6, [B

    .line 106
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {v5, v0, v10, v1, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 107
    return-object v10
.end method

.method public static encode([B)Ljava/lang/String;
    .locals 1

    .line 125
    sget-object v0, Lokio/Base64;->MAP:[B

    invoke-static {p0, v0}, Lokio/Base64;->encode([B[B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static encode([B[B)Ljava/lang/String;
    .locals 9

    .line 133
    array-length v0, p0

    add-int/lit8 v0, v0, 0x2

    mul-int/lit8 v0, v0, 0x4

    div-int/lit8 v4, v0, 0x3

    .line 134
    new-array v5, v4, [B

    .line 135
    const/4 v6, 0x0

    array-length v0, p0

    array-length v1, p0

    rem-int/lit8 v1, v1, 0x3

    sub-int v7, v0, v1

    .line 136
    const/4 v8, 0x0

    :goto_0
    if-ge v8, v7, :cond_0

    .line 137
    move v0, v6

    add-int/lit8 v6, v6, 0x1

    aget-byte v1, p0, v8

    and-int/lit16 v1, v1, 0xff

    shr-int/lit8 v1, v1, 0x2

    aget-byte v1, p1, v1

    aput-byte v1, v5, v0

    .line 138
    move v0, v6

    add-int/lit8 v6, v6, 0x1

    aget-byte v1, p0, v8

    and-int/lit8 v1, v1, 0x3

    shl-int/lit8 v1, v1, 0x4

    add-int/lit8 v2, v8, 0x1

    aget-byte v2, p0, v2

    and-int/lit16 v2, v2, 0xff

    shr-int/lit8 v2, v2, 0x4

    or-int/2addr v1, v2

    aget-byte v1, p1, v1

    aput-byte v1, v5, v0

    .line 139
    move v0, v6

    add-int/lit8 v6, v6, 0x1

    add-int/lit8 v1, v8, 0x1

    aget-byte v1, p0, v1

    and-int/lit8 v1, v1, 0xf

    shl-int/lit8 v1, v1, 0x2

    add-int/lit8 v2, v8, 0x2

    aget-byte v2, p0, v2

    and-int/lit16 v2, v2, 0xff

    shr-int/lit8 v2, v2, 0x6

    or-int/2addr v1, v2

    aget-byte v1, p1, v1

    aput-byte v1, v5, v0

    .line 140
    move v0, v6

    add-int/lit8 v6, v6, 0x1

    add-int/lit8 v1, v8, 0x2

    aget-byte v1, p0, v1

    and-int/lit8 v1, v1, 0x3f

    aget-byte v1, p1, v1

    aput-byte v1, v5, v0

    .line 136
    add-int/lit8 v8, v8, 0x3

    goto :goto_0

    .line 142
    :cond_0
    array-length v0, p0

    rem-int/lit8 v0, v0, 0x3

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_1

    .line 144
    :sswitch_0
    move v0, v6

    add-int/lit8 v6, v6, 0x1

    aget-byte v1, p0, v7

    and-int/lit16 v1, v1, 0xff

    shr-int/lit8 v1, v1, 0x2

    aget-byte v1, p1, v1

    aput-byte v1, v5, v0

    .line 145
    move v0, v6

    add-int/lit8 v6, v6, 0x1

    aget-byte v1, p0, v7

    and-int/lit8 v1, v1, 0x3

    shl-int/lit8 v1, v1, 0x4

    aget-byte v1, p1, v1

    aput-byte v1, v5, v0

    .line 146
    move v0, v6

    add-int/lit8 v6, v6, 0x1

    const/16 v1, 0x3d

    aput-byte v1, v5, v0

    .line 147
    move v0, v6

    add-int/lit8 v6, v6, 0x1

    const/16 v1, 0x3d

    aput-byte v1, v5, v0

    .line 148
    goto :goto_1

    .line 150
    :sswitch_1
    move v0, v6

    add-int/lit8 v6, v6, 0x1

    aget-byte v1, p0, v7

    and-int/lit16 v1, v1, 0xff

    shr-int/lit8 v1, v1, 0x2

    aget-byte v1, p1, v1

    aput-byte v1, v5, v0

    .line 151
    move v0, v6

    add-int/lit8 v6, v6, 0x1

    aget-byte v1, p0, v7

    and-int/lit8 v1, v1, 0x3

    shl-int/lit8 v1, v1, 0x4

    add-int/lit8 v2, v7, 0x1

    aget-byte v2, p0, v2

    and-int/lit16 v2, v2, 0xff

    shr-int/lit8 v2, v2, 0x4

    or-int/2addr v1, v2

    aget-byte v1, p1, v1

    aput-byte v1, v5, v0

    .line 152
    move v0, v6

    add-int/lit8 v6, v6, 0x1

    add-int/lit8 v1, v7, 0x1

    aget-byte v1, p0, v1

    and-int/lit8 v1, v1, 0xf

    shl-int/lit8 v1, v1, 0x2

    aget-byte v1, p1, v1

    aput-byte v1, v5, v0

    .line 153
    move v0, v6

    add-int/lit8 v6, v6, 0x1

    const/16 v1, 0x3d

    aput-byte v1, v5, v0

    .line 157
    :goto_1
    :try_start_0
    new-instance v0, Ljava/lang/String;

    const-string v1, "US-ASCII"

    const/4 v2, 0x0

    invoke-direct {v0, v5, v2, v6, v1}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 158
    :catch_0
    move-exception v8

    .line 159
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0, v8}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch
.end method

.method public static encodeUrl([B)Ljava/lang/String;
    .locals 1

    .line 129
    sget-object v0, Lokio/Base64;->URL_MAP:[B

    invoke-static {p0, v0}, Lokio/Base64;->encode([B[B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
