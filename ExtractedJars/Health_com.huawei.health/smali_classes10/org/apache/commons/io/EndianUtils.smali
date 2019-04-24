.class public Lorg/apache/commons/io/EndianUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    return-void
.end method

.method private static read(Ljava/io/InputStream;)I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 473
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v2

    .line 475
    const/4 v0, -0x1

    if-ne v0, v2, :cond_0

    .line 476
    new-instance v0, Ljava/io/EOFException;

    const-string v1, "Unexpected EOF reached"

    invoke-direct {v0, v1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 479
    :cond_0
    return v2
.end method

.method public static readSwappedDouble(Ljava/io/InputStream;)D
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 461
    invoke-static {p0}, Lorg/apache/commons/io/EndianUtils;->readSwappedLong(Ljava/io/InputStream;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v0

    return-wide v0
.end method

.method public static readSwappedDouble([BI)D
    .locals 2

    .line 266
    invoke-static {p0, p1}, Lorg/apache/commons/io/EndianUtils;->readSwappedLong([BI)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v0

    return-wide v0
.end method

.method public static readSwappedFloat(Ljava/io/InputStream;)F
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 435
    invoke-static {p0}, Lorg/apache/commons/io/EndianUtils;->readSwappedInteger(Ljava/io/InputStream;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    return v0
.end method

.method public static readSwappedFloat([BI)F
    .locals 1

    .line 244
    invoke-static {p0, p1}, Lorg/apache/commons/io/EndianUtils;->readSwappedInteger([BI)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    return v0
.end method

.method public static readSwappedInteger(Ljava/io/InputStream;)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 340
    invoke-static {p0}, Lorg/apache/commons/io/EndianUtils;->read(Ljava/io/InputStream;)I

    move-result v3

    .line 341
    invoke-static {p0}, Lorg/apache/commons/io/EndianUtils;->read(Ljava/io/InputStream;)I

    move-result v4

    .line 342
    invoke-static {p0}, Lorg/apache/commons/io/EndianUtils;->read(Ljava/io/InputStream;)I

    move-result v5

    .line 343
    invoke-static {p0}, Lorg/apache/commons/io/EndianUtils;->read(Ljava/io/InputStream;)I

    move-result v6

    .line 345
    and-int/lit16 v0, v3, 0xff

    shl-int/lit8 v0, v0, 0x0

    and-int/lit16 v1, v4, 0xff

    shl-int/lit8 v1, v1, 0x8

    add-int/2addr v0, v1

    and-int/lit16 v1, v5, 0xff

    shl-int/lit8 v1, v1, 0x10

    add-int/2addr v0, v1

    and-int/lit16 v1, v6, 0xff

    shl-int/lit8 v1, v1, 0x18

    add-int/2addr v0, v1

    return v0
.end method

.method public static readSwappedInteger([BI)I
    .locals 3

    .line 170
    add-int/lit8 v0, p1, 0x0

    aget-byte v0, p0, v0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x0

    add-int/lit8 v1, p1, 0x1

    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    add-int/2addr v0, v1

    add-int/lit8 v1, p1, 0x2

    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x10

    add-int/2addr v0, v1

    add-int/lit8 v1, p1, 0x3

    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x18

    add-int/2addr v0, v1

    return v0
.end method

.method public static readSwappedLong(Ljava/io/InputStream;)J
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 405
    const/16 v0, 0x8

    new-array v2, v0, [B

    .line 406
    const/4 v3, 0x0

    :goto_0
    const/16 v0, 0x8

    if-ge v3, v0, :cond_0

    .line 407
    invoke-static {p0}, Lorg/apache/commons/io/EndianUtils;->read(Ljava/io/InputStream;)I

    move-result v0

    int-to-byte v0, v0

    aput-byte v0, v2, v3

    .line 406
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 409
    :cond_0
    const/4 v0, 0x0

    invoke-static {v2, v0}, Lorg/apache/commons/io/EndianUtils;->readSwappedLong([BI)J

    move-result-wide v0

    return-wide v0
.end method

.method public static readSwappedLong([BI)J
    .locals 8

    .line 220
    invoke-static {p0, p1}, Lorg/apache/commons/io/EndianUtils;->readSwappedInteger([BI)I

    move-result v0

    int-to-long v4, v0

    .line 221
    add-int/lit8 v0, p1, 0x4

    invoke-static {p0, v0}, Lorg/apache/commons/io/EndianUtils;->readSwappedInteger([BI)I

    move-result v0

    int-to-long v6, v0

    .line 222
    const/16 v0, 0x20

    shl-long v0, v6, v0

    const-wide v2, 0xffffffffL

    and-long/2addr v2, v4

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public static readSwappedShort(Ljava/io/InputStream;)S
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 293
    invoke-static {p0}, Lorg/apache/commons/io/EndianUtils;->read(Ljava/io/InputStream;)I

    move-result v0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x0

    .line 294
    invoke-static {p0}, Lorg/apache/commons/io/EndianUtils;->read(Ljava/io/InputStream;)I

    move-result v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    add-int/2addr v0, v1

    int-to-short v0, v0

    .line 293
    return v0
.end method

.method public static readSwappedShort([BI)S
    .locals 3

    .line 131
    add-int/lit8 v0, p1, 0x0

    aget-byte v0, p0, v0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x0

    add-int/lit8 v1, p1, 0x1

    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    add-int/2addr v0, v1

    int-to-short v0, v0

    return v0
.end method

.method public static readSwappedUnsignedInteger(Ljava/io/InputStream;)J
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 361
    invoke-static {p0}, Lorg/apache/commons/io/EndianUtils;->read(Ljava/io/InputStream;)I

    move-result v4

    .line 362
    invoke-static {p0}, Lorg/apache/commons/io/EndianUtils;->read(Ljava/io/InputStream;)I

    move-result v5

    .line 363
    invoke-static {p0}, Lorg/apache/commons/io/EndianUtils;->read(Ljava/io/InputStream;)I

    move-result v6

    .line 364
    invoke-static {p0}, Lorg/apache/commons/io/EndianUtils;->read(Ljava/io/InputStream;)I

    move-result v7

    .line 366
    and-int/lit16 v0, v4, 0xff

    shl-int/lit8 v0, v0, 0x0

    and-int/lit16 v1, v5, 0xff

    shl-int/lit8 v1, v1, 0x8

    add-int/2addr v0, v1

    and-int/lit16 v1, v6, 0xff

    shl-int/lit8 v1, v1, 0x10

    add-int/2addr v0, v1

    int-to-long v8, v0

    .line 370
    and-int/lit16 v0, v7, 0xff

    int-to-long v10, v0

    .line 372
    const/16 v0, 0x18

    shl-long v0, v10, v0

    const-wide v2, 0xffffffffL

    and-long/2addr v2, v8

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public static readSwappedUnsignedInteger([BI)J
    .locals 8

    .line 185
    add-int/lit8 v0, p1, 0x0

    aget-byte v0, p0, v0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x0

    add-int/lit8 v1, p1, 0x1

    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    add-int/2addr v0, v1

    add-int/lit8 v1, p1, 0x2

    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x10

    add-int/2addr v0, v1

    int-to-long v4, v0

    .line 189
    add-int/lit8 v0, p1, 0x3

    aget-byte v0, p0, v0

    and-int/lit16 v0, v0, 0xff

    int-to-long v6, v0

    .line 191
    const/16 v0, 0x18

    shl-long v0, v6, v0

    const-wide v2, 0xffffffffL

    and-long/2addr v2, v4

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public static readSwappedUnsignedShort(Ljava/io/InputStream;)I
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 307
    invoke-static {p0}, Lorg/apache/commons/io/EndianUtils;->read(Ljava/io/InputStream;)I

    move-result v3

    .line 308
    invoke-static {p0}, Lorg/apache/commons/io/EndianUtils;->read(Ljava/io/InputStream;)I

    move-result v4

    .line 310
    and-int/lit16 v0, v3, 0xff

    shl-int/lit8 v0, v0, 0x0

    and-int/lit16 v1, v4, 0xff

    shl-int/lit8 v1, v1, 0x8

    add-int/2addr v0, v1

    return v0
.end method

.method public static readSwappedUnsignedShort([BI)I
    .locals 3

    .line 144
    add-int/lit8 v0, p1, 0x0

    aget-byte v0, p0, v0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x0

    add-int/lit8 v1, p1, 0x1

    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    add-int/2addr v0, v1

    return v0
.end method

.method public static swapDouble(D)D
    .locals 2

    .line 106
    invoke-static {p0, p1}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v0

    invoke-static {v0, v1}, Lorg/apache/commons/io/EndianUtils;->swapLong(J)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v0

    return-wide v0
.end method

.method public static swapFloat(F)F
    .locals 1

    .line 97
    invoke-static {p0}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v0

    invoke-static {v0}, Lorg/apache/commons/io/EndianUtils;->swapInteger(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    return v0
.end method

.method public static swapInteger(I)I
    .locals 3

    .line 67
    shr-int/lit8 v0, p0, 0x0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x18

    shr-int/lit8 v1, p0, 0x8

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x10

    add-int/2addr v0, v1

    shr-int/lit8 v1, p0, 0x10

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    add-int/2addr v0, v1

    shr-int/lit8 v1, p0, 0x18

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x0

    add-int/2addr v0, v1

    return v0
.end method

.method public static swapLong(J)J
    .locals 6

    .line 80
    const/4 v0, 0x0

    shr-long v0, p0, v0

    const-wide/16 v2, 0xff

    and-long/2addr v0, v2

    const/16 v2, 0x38

    shl-long/2addr v0, v2

    const/16 v2, 0x8

    shr-long v2, p0, v2

    const-wide/16 v4, 0xff

    and-long/2addr v2, v4

    const/16 v4, 0x30

    shl-long/2addr v2, v4

    add-long/2addr v0, v2

    const/16 v2, 0x10

    shr-long v2, p0, v2

    const-wide/16 v4, 0xff

    and-long/2addr v2, v4

    const/16 v4, 0x28

    shl-long/2addr v2, v4

    add-long/2addr v0, v2

    const/16 v2, 0x18

    shr-long v2, p0, v2

    const-wide/16 v4, 0xff

    and-long/2addr v2, v4

    const/16 v4, 0x20

    shl-long/2addr v2, v4

    add-long/2addr v0, v2

    const/16 v2, 0x20

    shr-long v2, p0, v2

    const-wide/16 v4, 0xff

    and-long/2addr v2, v4

    const/16 v4, 0x18

    shl-long/2addr v2, v4

    add-long/2addr v0, v2

    const/16 v2, 0x28

    shr-long v2, p0, v2

    const-wide/16 v4, 0xff

    and-long/2addr v2, v4

    const/16 v4, 0x10

    shl-long/2addr v2, v4

    add-long/2addr v0, v2

    const/16 v2, 0x30

    shr-long v2, p0, v2

    const-wide/16 v4, 0xff

    and-long/2addr v2, v4

    const/16 v4, 0x8

    shl-long/2addr v2, v4

    add-long/2addr v0, v2

    const/16 v2, 0x38

    shr-long v2, p0, v2

    const-wide/16 v4, 0xff

    and-long/2addr v2, v4

    const/4 v4, 0x0

    shl-long/2addr v2, v4

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public static swapShort(S)S
    .locals 3

    .line 57
    shr-int/lit8 v0, p0, 0x0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x8

    shr-int/lit8 v1, p0, 0x8

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x0

    add-int/2addr v0, v1

    int-to-short v0, v0

    return v0
.end method

.method public static writeSwappedDouble(Ljava/io/OutputStream;D)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 448
    invoke-static {p1, p2}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v0

    invoke-static {p0, v0, v1}, Lorg/apache/commons/io/EndianUtils;->writeSwappedLong(Ljava/io/OutputStream;J)V

    .line 449
    return-void
.end method

.method public static writeSwappedDouble([BID)V
    .locals 2

    .line 255
    invoke-static {p2, p3}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v0

    invoke-static {p0, p1, v0, v1}, Lorg/apache/commons/io/EndianUtils;->writeSwappedLong([BIJ)V

    .line 256
    return-void
.end method

.method public static writeSwappedFloat(Ljava/io/OutputStream;F)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 422
    invoke-static {p1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v0

    invoke-static {p0, v0}, Lorg/apache/commons/io/EndianUtils;->writeSwappedInteger(Ljava/io/OutputStream;I)V

    .line 423
    return-void
.end method

.method public static writeSwappedFloat([BIF)V
    .locals 1

    .line 233
    invoke-static {p2}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v0

    invoke-static {p0, p1, v0}, Lorg/apache/commons/io/EndianUtils;->writeSwappedInteger([BII)V

    .line 234
    return-void
.end method

.method public static writeSwappedInteger(Ljava/io/OutputStream;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 324
    shr-int/lit8 v0, p1, 0x0

    and-int/lit16 v0, v0, 0xff

    int-to-byte v0, v0

    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V

    .line 325
    shr-int/lit8 v0, p1, 0x8

    and-int/lit16 v0, v0, 0xff

    int-to-byte v0, v0

    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V

    .line 326
    shr-int/lit8 v0, p1, 0x10

    and-int/lit16 v0, v0, 0xff

    int-to-byte v0, v0

    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V

    .line 327
    shr-int/lit8 v0, p1, 0x18

    and-int/lit16 v0, v0, 0xff

    int-to-byte v0, v0

    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V

    .line 328
    return-void
.end method

.method public static writeSwappedInteger([BII)V
    .locals 3

    .line 156
    add-int/lit8 v0, p1, 0x0

    shr-int/lit8 v1, p2, 0x0

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    aput-byte v1, p0, v0

    .line 157
    add-int/lit8 v0, p1, 0x1

    shr-int/lit8 v1, p2, 0x8

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    aput-byte v1, p0, v0

    .line 158
    add-int/lit8 v0, p1, 0x2

    shr-int/lit8 v1, p2, 0x10

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    aput-byte v1, p0, v0

    .line 159
    add-int/lit8 v0, p1, 0x3

    shr-int/lit8 v1, p2, 0x18

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    aput-byte v1, p0, v0

    .line 160
    return-void
.end method

.method public static writeSwappedLong(Ljava/io/OutputStream;J)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 385
    const/4 v0, 0x0

    shr-long v0, p1, v0

    const-wide/16 v2, 0xff

    and-long/2addr v0, v2

    long-to-int v0, v0

    int-to-byte v0, v0

    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V

    .line 386
    const/16 v0, 0x8

    shr-long v0, p1, v0

    const-wide/16 v2, 0xff

    and-long/2addr v0, v2

    long-to-int v0, v0

    int-to-byte v0, v0

    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V

    .line 387
    const/16 v0, 0x10

    shr-long v0, p1, v0

    const-wide/16 v2, 0xff

    and-long/2addr v0, v2

    long-to-int v0, v0

    int-to-byte v0, v0

    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V

    .line 388
    const/16 v0, 0x18

    shr-long v0, p1, v0

    const-wide/16 v2, 0xff

    and-long/2addr v0, v2

    long-to-int v0, v0

    int-to-byte v0, v0

    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V

    .line 389
    const/16 v0, 0x20

    shr-long v0, p1, v0

    const-wide/16 v2, 0xff

    and-long/2addr v0, v2

    long-to-int v0, v0

    int-to-byte v0, v0

    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V

    .line 390
    const/16 v0, 0x28

    shr-long v0, p1, v0

    const-wide/16 v2, 0xff

    and-long/2addr v0, v2

    long-to-int v0, v0

    int-to-byte v0, v0

    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V

    .line 391
    const/16 v0, 0x30

    shr-long v0, p1, v0

    const-wide/16 v2, 0xff

    and-long/2addr v0, v2

    long-to-int v0, v0

    int-to-byte v0, v0

    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V

    .line 392
    const/16 v0, 0x38

    shr-long v0, p1, v0

    const-wide/16 v2, 0xff

    and-long/2addr v0, v2

    long-to-int v0, v0

    int-to-byte v0, v0

    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V

    .line 393
    return-void
.end method

.method public static writeSwappedLong([BIJ)V
    .locals 5

    .line 202
    add-int/lit8 v0, p1, 0x0

    const/4 v1, 0x0

    shr-long v1, p2, v1

    const-wide/16 v3, 0xff

    and-long/2addr v1, v3

    long-to-int v1, v1

    int-to-byte v1, v1

    aput-byte v1, p0, v0

    .line 203
    add-int/lit8 v0, p1, 0x1

    const/16 v1, 0x8

    shr-long v1, p2, v1

    const-wide/16 v3, 0xff

    and-long/2addr v1, v3

    long-to-int v1, v1

    int-to-byte v1, v1

    aput-byte v1, p0, v0

    .line 204
    add-int/lit8 v0, p1, 0x2

    const/16 v1, 0x10

    shr-long v1, p2, v1

    const-wide/16 v3, 0xff

    and-long/2addr v1, v3

    long-to-int v1, v1

    int-to-byte v1, v1

    aput-byte v1, p0, v0

    .line 205
    add-int/lit8 v0, p1, 0x3

    const/16 v1, 0x18

    shr-long v1, p2, v1

    const-wide/16 v3, 0xff

    and-long/2addr v1, v3

    long-to-int v1, v1

    int-to-byte v1, v1

    aput-byte v1, p0, v0

    .line 206
    add-int/lit8 v0, p1, 0x4

    const/16 v1, 0x20

    shr-long v1, p2, v1

    const-wide/16 v3, 0xff

    and-long/2addr v1, v3

    long-to-int v1, v1

    int-to-byte v1, v1

    aput-byte v1, p0, v0

    .line 207
    add-int/lit8 v0, p1, 0x5

    const/16 v1, 0x28

    shr-long v1, p2, v1

    const-wide/16 v3, 0xff

    and-long/2addr v1, v3

    long-to-int v1, v1

    int-to-byte v1, v1

    aput-byte v1, p0, v0

    .line 208
    add-int/lit8 v0, p1, 0x6

    const/16 v1, 0x30

    shr-long v1, p2, v1

    const-wide/16 v3, 0xff

    and-long/2addr v1, v3

    long-to-int v1, v1

    int-to-byte v1, v1

    aput-byte v1, p0, v0

    .line 209
    add-int/lit8 v0, p1, 0x7

    const/16 v1, 0x38

    shr-long v1, p2, v1

    const-wide/16 v3, 0xff

    and-long/2addr v1, v3

    long-to-int v1, v1

    int-to-byte v1, v1

    aput-byte v1, p0, v0

    .line 210
    return-void
.end method

.method public static writeSwappedShort(Ljava/io/OutputStream;S)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 279
    shr-int/lit8 v0, p1, 0x0

    and-int/lit16 v0, v0, 0xff

    int-to-byte v0, v0

    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V

    .line 280
    shr-int/lit8 v0, p1, 0x8

    and-int/lit16 v0, v0, 0xff

    int-to-byte v0, v0

    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V

    .line 281
    return-void
.end method

.method public static writeSwappedShort([BIS)V
    .locals 3

    .line 119
    add-int/lit8 v0, p1, 0x0

    shr-int/lit8 v1, p2, 0x0

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    aput-byte v1, p0, v0

    .line 120
    add-int/lit8 v0, p1, 0x1

    shr-int/lit8 v1, p2, 0x8

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    aput-byte v1, p0, v0

    .line 121
    return-void
.end method
