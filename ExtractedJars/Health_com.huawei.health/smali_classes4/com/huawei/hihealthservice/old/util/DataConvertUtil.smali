.class public Lcom/huawei/hihealthservice/old/util/DataConvertUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final HEX_CHARS:[C


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 26
    const/16 v0, 0x10

    new-array v0, v0, [C

    fill-array-data v0, :array_0

    sput-object v0, Lcom/huawei/hihealthservice/old/util/DataConvertUtil;->HEX_CHARS:[C

    return-void

    :array_0
    .array-data 2
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x41s
        0x42s
        0x43s
        0x44s
        0x45s
        0x46s
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final bin2hex([B)Ljava/lang/String;
    .locals 2

    .line 119
    array-length v0, p0

    const/4 v1, 0x0

    invoke-static {p0, v1, v0}, Lcom/huawei/hihealthservice/old/util/DataConvertUtil;->bin2hex([BII)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static final bin2hex([BII)Ljava/lang/String;
    .locals 6

    .line 97
    add-int v2, p1, p2

    .line 98
    new-instance v3, Ljava/lang/StringBuilder;

    shl-int/lit8 v0, p2, 0x1

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 102
    move v5, p1

    :goto_0
    if-ge v5, v2, :cond_0

    .line 104
    aget-byte v0, p0, v5

    and-int/lit16 v4, v0, 0xff

    .line 105
    sget-object v0, Lcom/huawei/hihealthservice/old/util/DataConvertUtil;->HEX_CHARS:[C

    ushr-int/lit8 v1, v4, 0x4

    aget-char v0, v0, v1

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 106
    sget-object v0, Lcom/huawei/hihealthservice/old/util/DataConvertUtil;->HEX_CHARS:[C

    and-int/lit8 v1, v4, 0xf

    aget-char v0, v0, v1

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 102
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 108
    :cond_0
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static bytesToInt([BI)I
    .locals 3

    .line 80
    aget-byte v0, p0, p1

    and-int/lit16 v0, v0, 0xff

    add-int/lit8 v1, p1, 0x1

    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    add-int/lit8 v1, p1, 0x2

    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    add-int/lit8 v1, p1, 0x3

    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x18

    or-int/2addr v0, v1

    return v0
.end method

.method public static bytesToLong([BI)J
    .locals 6

    .line 46
    aget-byte v0, p0, p1

    and-int/lit16 v0, v0, 0xff

    int-to-long v0, v0

    add-int/lit8 v2, p1, 0x1

    aget-byte v2, p0, v2

    int-to-long v2, v2

    const-wide/16 v4, 0xff

    and-long/2addr v2, v4

    const/16 v4, 0x8

    shl-long/2addr v2, v4

    or-long/2addr v0, v2

    add-int/lit8 v2, p1, 0x2

    aget-byte v2, p0, v2

    int-to-long v2, v2

    const-wide/16 v4, 0xff

    and-long/2addr v2, v4

    const/16 v4, 0x10

    shl-long/2addr v2, v4

    or-long/2addr v0, v2

    add-int/lit8 v2, p1, 0x3

    aget-byte v2, p0, v2

    int-to-long v2, v2

    const-wide/16 v4, 0xff

    and-long/2addr v2, v4

    const/16 v4, 0x18

    shl-long/2addr v2, v4

    or-long/2addr v0, v2

    add-int/lit8 v2, p1, 0x4

    aget-byte v2, p0, v2

    int-to-long v2, v2

    const-wide/16 v4, 0xff

    and-long/2addr v2, v4

    const/16 v4, 0x20

    shl-long/2addr v2, v4

    or-long/2addr v0, v2

    add-int/lit8 v2, p1, 0x5

    aget-byte v2, p0, v2

    int-to-long v2, v2

    const-wide/16 v4, 0xff

    and-long/2addr v2, v4

    const/16 v4, 0x28

    shl-long/2addr v2, v4

    or-long/2addr v0, v2

    add-int/lit8 v2, p1, 0x6

    aget-byte v2, p0, v2

    int-to-long v2, v2

    const-wide/16 v4, 0xff

    and-long/2addr v2, v4

    const/16 v4, 0x30

    shl-long/2addr v2, v4

    or-long/2addr v0, v2

    add-int/lit8 v2, p1, 0x7

    aget-byte v2, p0, v2

    int-to-long v2, v2

    const-wide/16 v4, 0xff

    and-long/2addr v2, v4

    const/16 v4, 0x38

    shl-long/2addr v2, v4

    or-long/2addr v0, v2

    return-wide v0
.end method

.method public static bytesToShort([BI)S
    .locals 3

    .line 64
    aget-byte v0, p0, p1

    and-int/lit16 v0, v0, 0xff

    add-int/lit8 v1, p1, 0x1

    aget-byte v1, p0, v1

    shl-int/lit8 v1, v1, 0x8

    const v2, 0xff00

    and-int/2addr v1, v2

    or-int/2addr v0, v1

    int-to-short v0, v0

    return v0
.end method

.method public static genUUID()Ljava/lang/String;
    .locals 4

    .line 183
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v2

    .line 184
    new-instance v3, Ljava/lang/StringBuilder;

    const/16 v0, 0x20

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 185
    invoke-virtual {v2}, Ljava/util/UUID;->getLeastSignificantBits()J

    move-result-wide v0

    invoke-static {v0, v1, v3}, Lcom/huawei/hihealthservice/old/util/DataConvertUtil;->long2hex(JLjava/lang/StringBuilder;)V

    .line 186
    invoke-virtual {v2}, Ljava/util/UUID;->getMostSignificantBits()J

    move-result-wide v0

    invoke-static {v0, v1, v3}, Lcom/huawei/hihealthservice/old/util/DataConvertUtil;->long2hex(JLjava/lang/StringBuilder;)V

    .line 187
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static final getHexCharVal(C)I
    .locals 2

    .line 161
    const/16 v0, 0x30

    if-lt p0, v0, :cond_0

    const/16 v0, 0x39

    if-gt p0, v0, :cond_0

    .line 163
    add-int/lit8 v0, p0, -0x30

    return v0

    .line 165
    :cond_0
    const/16 v0, 0x41

    if-lt p0, v0, :cond_1

    const/16 v0, 0x46

    if-gt p0, v0, :cond_1

    .line 167
    add-int/lit8 v0, p0, -0x41

    add-int/lit8 v0, v0, 0xa

    return v0

    .line 169
    :cond_1
    const/16 v0, 0x61

    if-lt p0, v0, :cond_2

    const/16 v0, 0x66

    if-gt p0, v0, :cond_2

    .line 171
    add-int/lit8 v0, p0, -0x61

    add-int/lit8 v0, v0, 0xa

    return v0

    .line 173
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public static final hex2bin(Ljava/lang/String;)[B
    .locals 7

    .line 130
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    .line 131
    shr-int/lit8 v0, v2, 0x1

    new-array v3, v0, [B

    .line 132
    const/4 v5, 0x0

    .line 134
    const/4 v6, 0x0

    :goto_0
    if-ge v6, v2, :cond_0

    .line 136
    invoke-virtual {p0, v6}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Lcom/huawei/hihealthservice/old/util/DataConvertUtil;->getHexCharVal(C)I

    move-result v4

    .line 137
    add-int/lit8 v0, v6, 0x1

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Lcom/huawei/hihealthservice/old/util/DataConvertUtil;->getHexCharVal(C)I

    move-result v0

    or-int/2addr v4, v0

    .line 138
    move v0, v5

    add-int/lit8 v5, v5, 0x1

    int-to-byte v1, v4

    aput-byte v1, v3, v0

    .line 134
    add-int/lit8 v6, v6, 0x2

    goto :goto_0

    .line 140
    :cond_0
    return-object v3
.end method

.method public static intToBytes(I[BI)V
    .locals 2

    .line 71
    int-to-byte v0, p0

    aput-byte v0, p1, p2

    .line 72
    add-int/lit8 v0, p2, 0x1

    shr-int/lit8 v1, p0, 0x8

    int-to-byte v1, v1

    aput-byte v1, p1, v0

    .line 73
    add-int/lit8 v0, p2, 0x2

    shr-int/lit8 v1, p0, 0x10

    int-to-byte v1, v1

    aput-byte v1, p1, v0

    .line 74
    add-int/lit8 v0, p2, 0x3

    ushr-int/lit8 v1, p0, 0x18

    int-to-byte v1, v1

    aput-byte v1, p1, v0

    .line 76
    return-void
.end method

.method public static final long2hex(JLjava/lang/StringBuilder;)V
    .locals 4

    .line 152
    const/4 v3, 0x0

    :goto_0
    const/16 v0, 0x8

    if-ge v3, v0, :cond_0

    .line 154
    rsub-int/lit8 v0, v3, 0x7

    mul-int/lit8 v0, v0, 0x8

    ushr-long v0, p0, v0

    long-to-int v2, v0

    .line 155
    sget-object v0, Lcom/huawei/hihealthservice/old/util/DataConvertUtil;->HEX_CHARS:[C

    aget-char v0, v0, v2

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 152
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 157
    :cond_0
    return-void
.end method

.method public static longToBytes(J[BI)V
    .locals 3

    .line 32
    long-to-int v0, p0

    int-to-byte v0, v0

    aput-byte v0, p2, p3

    .line 33
    add-int/lit8 v0, p3, 0x1

    const/16 v1, 0x8

    shr-long v1, p0, v1

    long-to-int v1, v1

    int-to-byte v1, v1

    aput-byte v1, p2, v0

    .line 34
    add-int/lit8 v0, p3, 0x2

    const/16 v1, 0x10

    shr-long v1, p0, v1

    long-to-int v1, v1

    int-to-byte v1, v1

    aput-byte v1, p2, v0

    .line 35
    add-int/lit8 v0, p3, 0x3

    const/16 v1, 0x18

    shr-long v1, p0, v1

    long-to-int v1, v1

    int-to-byte v1, v1

    aput-byte v1, p2, v0

    .line 36
    add-int/lit8 v0, p3, 0x4

    const/16 v1, 0x20

    shr-long v1, p0, v1

    long-to-int v1, v1

    int-to-byte v1, v1

    aput-byte v1, p2, v0

    .line 37
    add-int/lit8 v0, p3, 0x5

    const/16 v1, 0x28

    shr-long v1, p0, v1

    long-to-int v1, v1

    int-to-byte v1, v1

    aput-byte v1, p2, v0

    .line 38
    add-int/lit8 v0, p3, 0x6

    const/16 v1, 0x30

    shr-long v1, p0, v1

    long-to-int v1, v1

    int-to-byte v1, v1

    aput-byte v1, p2, v0

    .line 39
    add-int/lit8 v0, p3, 0x7

    const/16 v1, 0x38

    ushr-long v1, p0, v1

    long-to-int v1, v1

    int-to-byte v1, v1

    aput-byte v1, p2, v0

    .line 42
    return-void
.end method

.method public static shortToBytes(S[BI)V
    .locals 2

    .line 58
    int-to-byte v0, p0

    aput-byte v0, p1, p2

    .line 59
    add-int/lit8 v0, p2, 0x1

    shr-int/lit8 v1, p0, 0x8

    int-to-byte v1, v1

    aput-byte v1, p1, v0

    .line 60
    return-void
.end method
