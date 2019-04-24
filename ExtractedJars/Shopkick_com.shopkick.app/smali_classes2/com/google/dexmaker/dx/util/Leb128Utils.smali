.class public final Lcom/google/dexmaker/dx/util/Leb128Utils;
.super Ljava/lang/Object;
.source "Leb128Utils.java"


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static readSignedLeb128(Lcom/google/dexmaker/dx/util/ByteInput;)I
    .locals 6

    const/4 v0, 0x0

    const/4 v1, -0x1

    move v2, v1

    move v1, v0

    .line 89
    :cond_0
    invoke-interface {p0}, Lcom/google/dexmaker/dx/util/ByteInput;->readByte()B

    move-result v3

    and-int/lit16 v3, v3, 0xff

    and-int/lit8 v4, v3, 0x7f

    mul-int/lit8 v5, v1, 0x7

    shl-int/2addr v4, v5

    or-int/2addr v0, v4

    shl-int/lit8 v2, v2, 0x7

    add-int/lit8 v1, v1, 0x1

    const/16 v4, 0x80

    and-int/2addr v3, v4

    if-ne v3, v4, :cond_1

    const/4 v5, 0x5

    if-lt v1, v5, :cond_0

    :cond_1
    if-eq v3, v4, :cond_3

    shr-int/lit8 p0, v2, 0x1

    and-int/2addr p0, v0

    if-eqz p0, :cond_2

    or-int/2addr v0, v2

    :cond_2
    return v0

    .line 96
    :cond_3
    new-instance p0, Lcom/google/dexmaker/dx/util/DexException;

    const-string v0, "invalid LEB128 sequence"

    invoke-direct {p0, v0}, Lcom/google/dexmaker/dx/util/DexException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static readUnsignedLeb128(Lcom/google/dexmaker/dx/util/ByteInput;)I
    .locals 5

    const/4 v0, 0x0

    move v1, v0

    .line 116
    :cond_0
    invoke-interface {p0}, Lcom/google/dexmaker/dx/util/ByteInput;->readByte()B

    move-result v2

    and-int/lit16 v2, v2, 0xff

    and-int/lit8 v3, v2, 0x7f

    mul-int/lit8 v4, v1, 0x7

    shl-int/2addr v3, v4

    or-int/2addr v0, v3

    add-int/lit8 v1, v1, 0x1

    const/16 v3, 0x80

    and-int/2addr v2, v3

    if-ne v2, v3, :cond_1

    const/4 v4, 0x5

    if-lt v1, v4, :cond_0

    :cond_1
    if-eq v2, v3, :cond_2

    return v0

    .line 122
    :cond_2
    new-instance p0, Lcom/google/dexmaker/dx/util/DexException;

    const-string v0, "invalid LEB128 sequence"

    invoke-direct {p0, v0}, Lcom/google/dexmaker/dx/util/DexException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static signedLeb128Size(I)I
    .locals 7

    shr-int/lit8 v0, p0, 0x7

    const/high16 v1, -0x80000000

    and-int/2addr v1, p0

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    const/4 v1, -0x1

    :goto_0
    const/4 v3, 0x1

    move v5, p0

    move v4, v0

    move v0, v2

    move p0, v3

    :goto_1
    if-eqz p0, :cond_3

    if-ne v4, v1, :cond_2

    and-int/lit8 p0, v4, 0x1

    shr-int/lit8 v5, v5, 0x6

    and-int/2addr v5, v3

    if-eq p0, v5, :cond_1

    goto :goto_2

    :cond_1
    move p0, v2

    goto :goto_3

    :cond_2
    :goto_2
    move p0, v3

    :goto_3
    shr-int/lit8 v5, v4, 0x7

    add-int/lit8 v0, v0, 0x1

    move v6, v5

    move v5, v4

    move v4, v6

    goto :goto_1

    :cond_3
    return v0
.end method

.method public static unsignedLeb128Size(I)I
    .locals 1

    shr-int/lit8 p0, p0, 0x7

    const/4 v0, 0x0

    :goto_0
    if-eqz p0, :cond_0

    shr-int/lit8 p0, p0, 0x7

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public static writeSignedLeb128(Lcom/google/dexmaker/dx/util/ByteOutput;I)V
    .locals 7

    shr-int/lit8 v0, p1, 0x7

    const/high16 v1, -0x80000000

    and-int/2addr v1, p1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    const/4 v1, -0x1

    :goto_0
    const/4 v3, 0x1

    move v4, p1

    move p1, v3

    :goto_1
    if-eqz p1, :cond_4

    if-ne v0, v1, :cond_2

    and-int/lit8 p1, v0, 0x1

    shr-int/lit8 v5, v4, 0x6

    and-int/2addr v5, v3

    if-eq p1, v5, :cond_1

    goto :goto_2

    :cond_1
    move p1, v2

    goto :goto_3

    :cond_2
    :goto_2
    move p1, v3

    :goto_3
    and-int/lit8 v4, v4, 0x7f

    if-eqz p1, :cond_3

    const/16 v5, 0x80

    goto :goto_4

    :cond_3
    move v5, v2

    :goto_4
    or-int/2addr v4, v5

    int-to-byte v4, v4

    .line 157
    invoke-interface {p0, v4}, Lcom/google/dexmaker/dx/util/ByteOutput;->writeByte(I)V

    shr-int/lit8 v4, v0, 0x7

    move v6, v4

    move v4, v0

    move v0, v6

    goto :goto_1

    :cond_4
    return-void
.end method

.method public static writeUnsignedLeb128(Lcom/google/dexmaker/dx/util/ByteOutput;I)V
    .locals 2

    ushr-int/lit8 v0, p1, 0x7

    move v1, v0

    move v0, p1

    move p1, v1

    :goto_0
    if-eqz p1, :cond_0

    and-int/lit8 v0, v0, 0x7f

    or-int/lit16 v0, v0, 0x80

    int-to-byte v0, v0

    .line 136
    invoke-interface {p0, v0}, Lcom/google/dexmaker/dx/util/ByteOutput;->writeByte(I)V

    ushr-int/lit8 v0, p1, 0x7

    move v1, v0

    move v0, p1

    move p1, v1

    goto :goto_0

    :cond_0
    and-int/lit8 p1, v0, 0x7f

    int-to-byte p1, p1

    .line 141
    invoke-interface {p0, p1}, Lcom/google/dexmaker/dx/util/ByteOutput;->writeByte(I)V

    return-void
.end method
