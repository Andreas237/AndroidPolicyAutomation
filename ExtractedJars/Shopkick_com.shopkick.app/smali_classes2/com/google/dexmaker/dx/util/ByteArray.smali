.class public final Lcom/google/dexmaker/dx/util/ByteArray;
.super Ljava/lang/Object;
.source "ByteArray.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/dexmaker/dx/util/ByteArray$MyDataInputStream;,
        Lcom/google/dexmaker/dx/util/ByteArray$MyInputStream;,
        Lcom/google/dexmaker/dx/util/ByteArray$GetCursor;
    }
.end annotation


# instance fields
.field private final bytes:[B

.field private final size:I

.field private final start:I


# direct methods
.method public constructor <init>([B)V
    .locals 2

    .line 76
    array-length v0, p1

    const/4 v1, 0x0

    invoke-direct {p0, p1, v1, v0}, Lcom/google/dexmaker/dx/util/ByteArray;-><init>([BII)V

    return-void
.end method

.method public constructor <init>([BII)V
    .locals 1

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_3

    if-ltz p2, :cond_2

    if-lt p3, p2, :cond_1

    .line 61
    array-length v0, p1

    if-gt p3, v0, :cond_0

    .line 65
    iput-object p1, p0, Lcom/google/dexmaker/dx/util/ByteArray;->bytes:[B

    .line 66
    iput p2, p0, Lcom/google/dexmaker/dx/util/ByteArray;->start:I

    sub-int/2addr p3, p2

    .line 67
    iput p3, p0, Lcom/google/dexmaker/dx/util/ByteArray;->size:I

    return-void

    .line 62
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "end > bytes.length"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 58
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "end < start"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 54
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string/jumbo p2, "start < 0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 50
    :cond_3
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "bytes == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method static synthetic access$000(Lcom/google/dexmaker/dx/util/ByteArray;)I
    .locals 0

    .line 29
    iget p0, p0, Lcom/google/dexmaker/dx/util/ByteArray;->size:I

    return p0
.end method

.method static synthetic access$100(Lcom/google/dexmaker/dx/util/ByteArray;I)I
    .locals 0

    .line 29
    invoke-direct {p0, p1}, Lcom/google/dexmaker/dx/util/ByteArray;->getUnsignedByte0(I)I

    move-result p0

    return p0
.end method

.method static synthetic access$200(Lcom/google/dexmaker/dx/util/ByteArray;)[B
    .locals 0

    .line 29
    iget-object p0, p0, Lcom/google/dexmaker/dx/util/ByteArray;->bytes:[B

    return-object p0
.end method

.method static synthetic access$300(Lcom/google/dexmaker/dx/util/ByteArray;)I
    .locals 0

    .line 29
    iget p0, p0, Lcom/google/dexmaker/dx/util/ByteArray;->start:I

    return p0
.end method

.method private checkOffsets(II)V
    .locals 3

    if-ltz p1, :cond_0

    if-lt p2, p1, :cond_0

    .line 222
    iget v0, p0, Lcom/google/dexmaker/dx/util/ByteArray;->size:I

    if-gt p2, v0, :cond_0

    return-void

    .line 223
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "bad range: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ".."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "; actual size "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, p0, Lcom/google/dexmaker/dx/util/ByteArray;->size:I

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private getByte0(I)I
    .locals 2

    .line 236
    iget-object v0, p0, Lcom/google/dexmaker/dx/util/ByteArray;->bytes:[B

    iget v1, p0, Lcom/google/dexmaker/dx/util/ByteArray;->start:I

    add-int/2addr v1, p1

    aget-byte p1, v0, v1

    return p1
.end method

.method private getUnsignedByte0(I)I
    .locals 2

    .line 247
    iget-object v0, p0, Lcom/google/dexmaker/dx/util/ByteArray;->bytes:[B

    iget v1, p0, Lcom/google/dexmaker/dx/util/ByteArray;->start:I

    add-int/2addr v1, p1

    aget-byte p1, v0, v1

    and-int/lit16 p1, p1, 0xff

    return p1
.end method


# virtual methods
.method public getByte(I)I
    .locals 1

    add-int/lit8 v0, p1, 0x1

    .line 126
    invoke-direct {p0, p1, v0}, Lcom/google/dexmaker/dx/util/ByteArray;->checkOffsets(II)V

    .line 127
    invoke-direct {p0, p1}, Lcom/google/dexmaker/dx/util/ByteArray;->getByte0(I)I

    move-result p1

    return p1
.end method

.method public getBytes([BI)V
    .locals 3

    .line 207
    array-length v0, p1

    sub-int/2addr v0, p2

    iget v1, p0, Lcom/google/dexmaker/dx/util/ByteArray;->size:I

    if-lt v0, v1, :cond_0

    .line 212
    iget-object v0, p0, Lcom/google/dexmaker/dx/util/ByteArray;->bytes:[B

    iget v2, p0, Lcom/google/dexmaker/dx/util/ByteArray;->start:I

    invoke-static {v0, v2, p1, p2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void

    .line 208
    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string p2, "(out.length - offset) < size()"

    invoke-direct {p1, p2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getInt(I)I
    .locals 2

    add-int/lit8 v0, p1, 0x4

    .line 148
    invoke-direct {p0, p1, v0}, Lcom/google/dexmaker/dx/util/ByteArray;->checkOffsets(II)V

    .line 149
    invoke-direct {p0, p1}, Lcom/google/dexmaker/dx/util/ByteArray;->getByte0(I)I

    move-result v0

    shl-int/lit8 v0, v0, 0x18

    add-int/lit8 v1, p1, 0x1

    invoke-direct {p0, v1}, Lcom/google/dexmaker/dx/util/ByteArray;->getUnsignedByte0(I)I

    move-result v1

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    add-int/lit8 v1, p1, 0x2

    invoke-direct {p0, v1}, Lcom/google/dexmaker/dx/util/ByteArray;->getUnsignedByte0(I)I

    move-result v1

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    add-int/lit8 p1, p1, 0x3

    invoke-direct {p0, p1}, Lcom/google/dexmaker/dx/util/ByteArray;->getUnsignedByte0(I)I

    move-result p1

    or-int/2addr p1, v0

    return p1
.end method

.method public getLong(I)J
    .locals 5

    add-int/lit8 v0, p1, 0x8

    .line 162
    invoke-direct {p0, p1, v0}, Lcom/google/dexmaker/dx/util/ByteArray;->checkOffsets(II)V

    .line 163
    invoke-direct {p0, p1}, Lcom/google/dexmaker/dx/util/ByteArray;->getByte0(I)I

    move-result v0

    shl-int/lit8 v0, v0, 0x18

    add-int/lit8 v1, p1, 0x1

    invoke-direct {p0, v1}, Lcom/google/dexmaker/dx/util/ByteArray;->getUnsignedByte0(I)I

    move-result v1

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    add-int/lit8 v1, p1, 0x2

    invoke-direct {p0, v1}, Lcom/google/dexmaker/dx/util/ByteArray;->getUnsignedByte0(I)I

    move-result v1

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    add-int/lit8 v1, p1, 0x3

    invoke-direct {p0, v1}, Lcom/google/dexmaker/dx/util/ByteArray;->getUnsignedByte0(I)I

    move-result v1

    or-int/2addr v0, v1

    add-int/lit8 v1, p1, 0x4

    .line 167
    invoke-direct {p0, v1}, Lcom/google/dexmaker/dx/util/ByteArray;->getByte0(I)I

    move-result v1

    shl-int/lit8 v1, v1, 0x18

    add-int/lit8 v2, p1, 0x5

    invoke-direct {p0, v2}, Lcom/google/dexmaker/dx/util/ByteArray;->getUnsignedByte0(I)I

    move-result v2

    shl-int/lit8 v2, v2, 0x10

    or-int/2addr v1, v2

    add-int/lit8 v2, p1, 0x6

    invoke-direct {p0, v2}, Lcom/google/dexmaker/dx/util/ByteArray;->getUnsignedByte0(I)I

    move-result v2

    shl-int/lit8 v2, v2, 0x8

    or-int/2addr v1, v2

    add-int/lit8 p1, p1, 0x7

    invoke-direct {p0, p1}, Lcom/google/dexmaker/dx/util/ByteArray;->getUnsignedByte0(I)I

    move-result p1

    or-int/2addr p1, v1

    int-to-long v1, p1

    const-wide v3, 0xffffffffL

    and-long/2addr v1, v3

    int-to-long v3, v0

    const/16 p1, 0x20

    shl-long/2addr v3, p1

    or-long v0, v1, v3

    return-wide v0
.end method

.method public getShort(I)I
    .locals 1

    add-int/lit8 v0, p1, 0x2

    .line 137
    invoke-direct {p0, p1, v0}, Lcom/google/dexmaker/dx/util/ByteArray;->checkOffsets(II)V

    .line 138
    invoke-direct {p0, p1}, Lcom/google/dexmaker/dx/util/ByteArray;->getByte0(I)I

    move-result v0

    shl-int/lit8 v0, v0, 0x8

    add-int/lit8 p1, p1, 0x1

    invoke-direct {p0, p1}, Lcom/google/dexmaker/dx/util/ByteArray;->getUnsignedByte0(I)I

    move-result p1

    or-int/2addr p1, v0

    return p1
.end method

.method public getUnsignedByte(I)I
    .locals 1

    add-int/lit8 v0, p1, 0x1

    .line 182
    invoke-direct {p0, p1, v0}, Lcom/google/dexmaker/dx/util/ByteArray;->checkOffsets(II)V

    .line 183
    invoke-direct {p0, p1}, Lcom/google/dexmaker/dx/util/ByteArray;->getUnsignedByte0(I)I

    move-result p1

    return p1
.end method

.method public getUnsignedShort(I)I
    .locals 1

    add-int/lit8 v0, p1, 0x2

    .line 193
    invoke-direct {p0, p1, v0}, Lcom/google/dexmaker/dx/util/ByteArray;->checkOffsets(II)V

    .line 194
    invoke-direct {p0, p1}, Lcom/google/dexmaker/dx/util/ByteArray;->getUnsignedByte0(I)I

    move-result v0

    shl-int/lit8 v0, v0, 0x8

    add-int/lit8 p1, p1, 0x1

    invoke-direct {p0, p1}, Lcom/google/dexmaker/dx/util/ByteArray;->getUnsignedByte0(I)I

    move-result p1

    or-int/2addr p1, v0

    return p1
.end method

.method public makeDataInputStream()Lcom/google/dexmaker/dx/util/ByteArray$MyDataInputStream;
    .locals 2

    .line 260
    new-instance v0, Lcom/google/dexmaker/dx/util/ByteArray$MyDataInputStream;

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/util/ByteArray;->makeInputStream()Lcom/google/dexmaker/dx/util/ByteArray$MyInputStream;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/dexmaker/dx/util/ByteArray$MyDataInputStream;-><init>(Lcom/google/dexmaker/dx/util/ByteArray$MyInputStream;)V

    return-object v0
.end method

.method public makeInputStream()Lcom/google/dexmaker/dx/util/ByteArray$MyInputStream;
    .locals 1

    .line 273
    new-instance v0, Lcom/google/dexmaker/dx/util/ByteArray$MyInputStream;

    invoke-direct {v0, p0}, Lcom/google/dexmaker/dx/util/ByteArray$MyInputStream;-><init>(Lcom/google/dexmaker/dx/util/ByteArray;)V

    return-object v0
.end method

.method public size()I
    .locals 1

    .line 85
    iget v0, p0, Lcom/google/dexmaker/dx/util/ByteArray;->size:I

    return v0
.end method

.method public slice(II)Lcom/google/dexmaker/dx/util/ByteArray;
    .locals 3

    .line 97
    invoke-direct {p0, p1, p2}, Lcom/google/dexmaker/dx/util/ByteArray;->checkOffsets(II)V

    .line 98
    new-instance v0, Lcom/google/dexmaker/dx/util/ByteArray;

    iget-object v1, p0, Lcom/google/dexmaker/dx/util/ByteArray;->bytes:[B

    iget v2, p0, Lcom/google/dexmaker/dx/util/ByteArray;->start:I

    add-int/2addr p1, v2

    add-int/2addr p2, v2

    invoke-direct {v0, v1, p1, p2}, Lcom/google/dexmaker/dx/util/ByteArray;-><init>([BII)V

    return-object v0
.end method

.method public underlyingOffset(I[B)I
    .locals 1

    .line 112
    iget-object v0, p0, Lcom/google/dexmaker/dx/util/ByteArray;->bytes:[B

    if-ne p2, v0, :cond_0

    .line 116
    iget p2, p0, Lcom/google/dexmaker/dx/util/ByteArray;->start:I

    add-int/2addr p2, p1

    return p2

    .line 113
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string/jumbo p2, "wrong bytes"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
