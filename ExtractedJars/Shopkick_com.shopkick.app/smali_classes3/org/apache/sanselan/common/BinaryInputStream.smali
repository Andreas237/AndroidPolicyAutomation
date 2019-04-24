.class public Lorg/apache/sanselan/common/BinaryInputStream;
.super Ljava/io/InputStream;
.source "BinaryInputStream.java"

# interfaces
.implements Lorg/apache/sanselan/common/BinaryConstants;


# instance fields
.field private byteOrder:I

.field protected debug:Z

.field private final is:Ljava/io/InputStream;


# direct methods
.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 1

    .line 55
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    const/4 v0, 0x0

    .line 28
    iput-boolean v0, p0, Lorg/apache/sanselan/common/BinaryInputStream;->debug:Z

    const/16 v0, 0x4d

    .line 60
    iput v0, p0, Lorg/apache/sanselan/common/BinaryInputStream;->byteOrder:I

    .line 56
    iput-object p1, p0, Lorg/apache/sanselan/common/BinaryInputStream;->is:Ljava/io/InputStream;

    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;I)V
    .locals 1

    .line 49
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    const/4 v0, 0x0

    .line 28
    iput-boolean v0, p0, Lorg/apache/sanselan/common/BinaryInputStream;->debug:Z

    const/16 v0, 0x4d

    .line 60
    iput v0, p0, Lorg/apache/sanselan/common/BinaryInputStream;->byteOrder:I

    .line 50
    iput p2, p0, Lorg/apache/sanselan/common/BinaryInputStream;->byteOrder:I

    .line 51
    iput-object p1, p0, Lorg/apache/sanselan/common/BinaryInputStream;->is:Ljava/io/InputStream;

    return-void
.end method

.method public constructor <init>([BI)V
    .locals 1

    .line 43
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    const/4 v0, 0x0

    .line 28
    iput-boolean v0, p0, Lorg/apache/sanselan/common/BinaryInputStream;->debug:Z

    const/16 v0, 0x4d

    .line 60
    iput v0, p0, Lorg/apache/sanselan/common/BinaryInputStream;->byteOrder:I

    .line 44
    iput p2, p0, Lorg/apache/sanselan/common/BinaryInputStream;->byteOrder:I

    .line 45
    new-instance p2, Ljava/io/ByteArrayInputStream;

    invoke-direct {p2, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    iput-object p2, p0, Lorg/apache/sanselan/common/BinaryInputStream;->is:Ljava/io/InputStream;

    return-void
.end method

.method protected static final CharsToQuad(CCCC)I
    .locals 0

    and-int/lit16 p0, p0, 0xff

    shl-int/lit8 p0, p0, 0x18

    and-int/lit16 p1, p1, 0xff

    shl-int/lit8 p1, p1, 0x10

    or-int/2addr p0, p1

    and-int/lit16 p1, p2, 0xff

    shl-int/lit8 p1, p1, 0x8

    or-int/2addr p0, p1

    and-int/lit16 p1, p3, 0xff

    shl-int/lit8 p1, p1, 0x0

    or-int/2addr p0, p1

    return p0
.end method


# virtual methods
.method public final compareByteArrays([BI[BII)Z
    .locals 6

    .line 501
    array-length v0, p1

    add-int v1, p2, p5

    const/4 v2, 0x0

    if-ge v0, v1, :cond_0

    return v2

    .line 503
    :cond_0
    array-length v0, p3

    add-int v1, p4, p5

    if-ge v0, v1, :cond_1

    return v2

    :cond_1
    move v0, v2

    :goto_0
    if-ge v0, p5, :cond_3

    add-int v1, p2, v0

    .line 508
    aget-byte v3, p1, v1

    add-int v4, p4, v0

    aget-byte v5, p3, v4

    if-eq v3, v5, :cond_2

    .line 510
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "a["

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p4, "]"

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    aget-byte p1, p1, v1

    invoke-virtual {p0, p2, p1}, Lorg/apache/sanselan/common/BinaryInputStream;->debugNumber(Ljava/lang/String;I)V

    .line 511
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "b["

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, "]"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    aget-byte p2, p3, v4

    invoke-virtual {p0, p1, p2}, Lorg/apache/sanselan/common/BinaryInputStream;->debugNumber(Ljava/lang/String;I)V

    return v2

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    const/4 p1, 0x1

    return p1
.end method

.method protected final convertByteArrayToInt(Ljava/lang/String;[B)I
    .locals 1

    .line 94
    iget v0, p0, Lorg/apache/sanselan/common/BinaryInputStream;->byteOrder:I

    invoke-virtual {p0, p1, p2, v0}, Lorg/apache/sanselan/common/BinaryInputStream;->convertByteArrayToInt(Ljava/lang/String;[BI)I

    move-result p1

    return p1
.end method

.method protected final convertByteArrayToInt(Ljava/lang/String;[BI)I
    .locals 6

    const/4 v3, 0x0

    const/4 v4, 0x4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p3

    .line 286
    invoke-virtual/range {v0 .. v5}, Lorg/apache/sanselan/common/BinaryInputStream;->convertByteArrayToInt(Ljava/lang/String;[BIII)I

    move-result p1

    return p1
.end method

.method protected final convertByteArrayToInt(Ljava/lang/String;[BIII)I
    .locals 5

    add-int/lit8 v0, p3, 0x0

    .line 292
    aget-byte v0, p2, v0

    add-int/lit8 v1, p3, 0x1

    .line 293
    aget-byte v1, p2, v1

    add-int/lit8 v2, p3, 0x2

    .line 294
    aget-byte v2, p2, v2

    const/4 v3, 0x4

    const/4 v4, 0x0

    if-ne p4, v3, :cond_0

    add-int/lit8 p3, p3, 0x3

    .line 297
    aget-byte p2, p2, p3

    goto :goto_0

    :cond_0
    move p2, v4

    :goto_0
    const/16 p3, 0x4d

    if-ne p5, p3, :cond_1

    and-int/lit16 p3, v0, 0xff

    shl-int/lit8 p3, p3, 0x18

    and-int/lit16 p4, v1, 0xff

    shl-int/lit8 p4, p4, 0x10

    add-int/2addr p3, p4

    and-int/lit16 p4, v2, 0xff

    shl-int/lit8 p4, p4, 0x8

    add-int/2addr p3, p4

    and-int/lit16 p2, p2, 0xff

    shl-int/2addr p2, v4

    add-int/2addr p3, p2

    goto :goto_1

    :cond_1
    and-int/lit16 p2, p2, 0xff

    shl-int/lit8 p2, p2, 0x18

    and-int/lit16 p3, v2, 0xff

    shl-int/lit8 p3, p3, 0x10

    add-int/2addr p2, p3

    and-int/lit16 p3, v1, 0xff

    shl-int/lit8 p3, p3, 0x8

    add-int/2addr p2, p3

    and-int/lit16 p3, v0, 0xff

    shl-int/2addr p3, v4

    add-int/2addr p3, p2

    .line 316
    :goto_1
    iget-boolean p2, p0, Lorg/apache/sanselan/common/BinaryInputStream;->debug:Z

    if-eqz p2, :cond_2

    .line 317
    invoke-virtual {p0, p1, p3, v3}, Lorg/apache/sanselan/common/BinaryInputStream;->debugNumber(Ljava/lang/String;II)V

    :cond_2
    return p3
.end method

.method protected final convertByteArrayToIntArray(Ljava/lang/String;[BIII)[I
    .locals 9

    mul-int/lit8 v0, p4, 0x4

    add-int/2addr v0, p3

    .line 327
    array-length v1, p2

    if-ge v1, v0, :cond_0

    .line 329
    sget-object p3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": expected length: "

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", actual length: "

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length p1, p2

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1

    .line 334
    :cond_0
    new-array v0, p4, [I

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p4, :cond_1

    mul-int/lit8 v2, v1, 0x4

    add-int v6, p3, v2

    const/4 v7, 0x4

    move-object v3, p0

    move-object v4, p1

    move-object v5, p2

    move v8, p5

    .line 338
    invoke-virtual/range {v3 .. v8}, Lorg/apache/sanselan/common/BinaryInputStream;->convertByteArrayToInt(Ljava/lang/String;[BIII)I

    move-result v2

    aput v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method protected final convertByteArrayToRational(Ljava/lang/String;[BI)Lorg/apache/sanselan/common/RationalNumber;
    .locals 1

    const/4 v0, 0x0

    .line 269
    invoke-virtual {p0, p1, p2, v0, p3}, Lorg/apache/sanselan/common/BinaryInputStream;->convertByteArrayToRational(Ljava/lang/String;[BII)Lorg/apache/sanselan/common/RationalNumber;

    move-result-object p1

    return-object p1
.end method

.method protected final convertByteArrayToRational(Ljava/lang/String;[BII)Lorg/apache/sanselan/common/RationalNumber;
    .locals 7

    add-int/lit8 v3, p3, 0x0

    const/4 v4, 0x4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    .line 275
    invoke-virtual/range {v0 .. v5}, Lorg/apache/sanselan/common/BinaryInputStream;->convertByteArrayToInt(Ljava/lang/String;[BIII)I

    move-result v0

    add-int/lit8 v4, p3, 0x4

    const/4 v5, 0x4

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v6, p4

    .line 277
    invoke-virtual/range {v1 .. v6}, Lorg/apache/sanselan/common/BinaryInputStream;->convertByteArrayToInt(Ljava/lang/String;[BIII)I

    move-result p1

    .line 280
    new-instance p2, Lorg/apache/sanselan/common/RationalNumber;

    invoke-direct {p2, v0, p1}, Lorg/apache/sanselan/common/RationalNumber;-><init>(II)V

    return-object p2
.end method

.method protected final convertByteArrayToRationalArray(Ljava/lang/String;[BIII)[Lorg/apache/sanselan/common/RationalNumber;
    .locals 3

    mul-int/lit8 v0, p4, 0x8

    add-int/2addr v0, p3

    .line 248
    array-length v1, p2

    if-ge v1, v0, :cond_0

    .line 250
    sget-object p3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": expected length: "

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", actual length: "

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length p1, p2

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1

    .line 255
    :cond_0
    new-array v0, p4, [Lorg/apache/sanselan/common/RationalNumber;

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p4, :cond_1

    mul-int/lit8 v2, v1, 0x8

    add-int/2addr v2, p3

    .line 259
    invoke-virtual {p0, p1, p2, v2, p5}, Lorg/apache/sanselan/common/BinaryInputStream;->convertByteArrayToRational(Ljava/lang/String;[BII)Lorg/apache/sanselan/common/RationalNumber;

    move-result-object v2

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public final convertByteArrayToShort(Ljava/lang/String;I[B)I
    .locals 1

    .line 105
    iget v0, p0, Lorg/apache/sanselan/common/BinaryInputStream;->byteOrder:I

    invoke-virtual {p0, p1, p2, p3, v0}, Lorg/apache/sanselan/common/BinaryInputStream;->convertByteArrayToShort(Ljava/lang/String;I[BI)I

    move-result p1

    return p1
.end method

.method protected final convertByteArrayToShort(Ljava/lang/String;I[BI)I
    .locals 1

    add-int/lit8 v0, p2, 0x0

    .line 354
    aget-byte v0, p3, v0

    add-int/lit8 p2, p2, 0x1

    .line 355
    aget-byte p2, p3, p2

    const/16 p3, 0x4d

    if-ne p4, p3, :cond_0

    and-int/lit16 p3, v0, 0xff

    shl-int/lit8 p3, p3, 0x8

    and-int/lit16 p2, p2, 0xff

    shl-int/lit8 p2, p2, 0x0

    add-int/2addr p3, p2

    goto :goto_0

    :cond_0
    and-int/lit16 p2, p2, 0xff

    shl-int/lit8 p2, p2, 0x8

    and-int/lit16 p3, v0, 0xff

    shl-int/lit8 p3, p3, 0x0

    add-int/2addr p3, p2

    .line 367
    :goto_0
    iget-boolean p2, p0, Lorg/apache/sanselan/common/BinaryInputStream;->debug:Z

    if-eqz p2, :cond_1

    const/4 p2, 0x2

    .line 368
    invoke-virtual {p0, p1, p3, p2}, Lorg/apache/sanselan/common/BinaryInputStream;->debugNumber(Ljava/lang/String;II)V

    :cond_1
    return p3
.end method

.method public final convertByteArrayToShort(Ljava/lang/String;[B)I
    .locals 1

    .line 99
    iget v0, p0, Lorg/apache/sanselan/common/BinaryInputStream;->byteOrder:I

    invoke-virtual {p0, p1, p2, v0}, Lorg/apache/sanselan/common/BinaryInputStream;->convertByteArrayToShort(Ljava/lang/String;[BI)I

    move-result p1

    return p1
.end method

.method protected final convertByteArrayToShort(Ljava/lang/String;[BI)I
    .locals 1

    const/4 v0, 0x0

    .line 348
    invoke-virtual {p0, p1, v0, p2, p3}, Lorg/apache/sanselan/common/BinaryInputStream;->convertByteArrayToShort(Ljava/lang/String;I[BI)I

    move-result p1

    return p1
.end method

.method protected final convertByteArrayToShortArray(Ljava/lang/String;[BIII)[I
    .locals 3

    mul-int/lit8 v0, p4, 0x2

    add-int/2addr v0, p3

    .line 378
    array-length v1, p2

    if-ge v1, v0, :cond_0

    .line 380
    sget-object p3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": expected length: "

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", actual length: "

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length p1, p2

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1

    .line 385
    :cond_0
    new-array v0, p4, [I

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p4, :cond_1

    mul-int/lit8 v2, v1, 0x2

    add-int/2addr v2, p3

    .line 389
    invoke-virtual {p0, p1, v2, p2, p5}, Lorg/apache/sanselan/common/BinaryInputStream;->convertByteArrayToShort(Ljava/lang/String;I[BI)I

    move-result v2

    aput v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method protected final debugByteArray(Ljava/lang/String;[B)V
    .locals 3

    .line 427
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ": "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length v2, p2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 429
    :goto_0
    array-length v1, p2

    if-ge v0, v1, :cond_0

    const/16 v1, 0x32

    if-ge v0, v1, :cond_0

    .line 431
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    aget-byte v2, p2, v0

    invoke-virtual {p0, v1, v2}, Lorg/apache/sanselan/common/BinaryInputStream;->debugNumber(Ljava/lang/String;I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final debugNumber(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x1

    .line 138
    invoke-virtual {p0, p1, p2, v0}, Lorg/apache/sanselan/common/BinaryInputStream;->debugNumber(Ljava/lang/String;II)V

    return-void
.end method

.method public final debugNumber(Ljava/lang/String;II)V
    .locals 5

    .line 143
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " ("

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    const/4 p1, 0x0

    move v0, p2

    :goto_0
    if-ge p1, p3, :cond_1

    if-lez p1, :cond_0

    .line 148
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v2, ","

    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    :cond_0
    and-int/lit16 v1, v0, 0xff

    .line 150
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    int-to-char v4, v1

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v4, " ["

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    shr-int/lit8 v0, v0, 0x8

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 153
    :cond_1
    sget-object p1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, ") [0x"

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    invoke-static {p2}, Ljava/lang/Integer;->toBinaryString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "]"

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 153
    invoke-virtual {p1, p2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    return-void
.end method

.method protected final debugNumberArray(Ljava/lang/String;[II)V
    .locals 3

    .line 437
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ": "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length v2, p2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 439
    :goto_0
    array-length v1, p2

    if-ge v0, v1, :cond_0

    const/16 v1, 0x32

    if-ge v0, v1, :cond_0

    .line 441
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    aget v2, p2, v0

    invoke-virtual {p0, v1, v2, p3}, Lorg/apache/sanselan/common/BinaryInputStream;->debugNumber(Ljava/lang/String;II)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final findNull([B)I
    .locals 1

    const/4 v0, 0x0

    .line 642
    invoke-virtual {p0, p1, v0}, Lorg/apache/sanselan/common/BinaryInputStream;->findNull([BI)I

    move-result p1

    return p1
.end method

.method public final findNull([BI)I
    .locals 1

    .line 647
    :goto_0
    array-length v0, p1

    if-ge p2, v0, :cond_1

    .line 649
    aget-byte v0, p1, p2

    if-nez v0, :cond_0

    return p2

    :cond_0
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    return p1
.end method

.method protected getByteOrder()I
    .locals 1

    .line 84
    iget v0, p0, Lorg/apache/sanselan/common/BinaryInputStream;->byteOrder:I

    return v0
.end method

.method protected final getBytearrayHead(Ljava/lang/String;[BI)[B
    .locals 1

    .line 495
    array-length v0, p2

    sub-int/2addr v0, p3

    const/4 p3, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, Lorg/apache/sanselan/common/BinaryInputStream;->readBytearray(Ljava/lang/String;[BII)[B

    move-result-object p1

    return-object p1
.end method

.method protected final getBytearrayTail(Ljava/lang/String;[BI)[B
    .locals 1

    .line 490
    array-length v0, p2

    sub-int/2addr v0, p3

    invoke-virtual {p0, p1, p2, p3, v0}, Lorg/apache/sanselan/common/BinaryInputStream;->readBytearray(Ljava/lang/String;[BII)[B

    move-result-object p1

    return-object p1
.end method

.method public final getDebug()Z
    .locals 1

    .line 37
    iget-boolean v0, p0, Lorg/apache/sanselan/common/BinaryInputStream;->debug:Z

    return v0
.end method

.method protected final getRAFBytes(Ljava/io/RandomAccessFile;JILjava/lang/String;)[B
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 659
    new-array v0, p4, [B

    .line 661
    iget-boolean v1, p0, Lorg/apache/sanselan/common/BinaryInputStream;->debug:Z

    if-eqz v1, :cond_0

    .line 663
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getRAFBytes pos: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 664
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getRAFBytes length: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 667
    :cond_0
    invoke-virtual {p1, p2, p3}, Ljava/io/RandomAccessFile;->seek(J)V

    const/4 p2, 0x0

    :goto_0
    if-ge p2, p4, :cond_2

    sub-int p3, p4, p2

    .line 672
    invoke-virtual {p1, v0, p2, p3}, Ljava/io/RandomAccessFile;->read([BII)I

    move-result p3

    const/4 v1, 0x1

    if-lt p3, v1, :cond_1

    add-int/2addr p2, p3

    goto :goto_0

    .line 674
    :cond_1
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, p5}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    return-object v0
.end method

.method protected final printByteBits(Ljava/lang/String;B)V
    .locals 2

    .line 632
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": \'"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    and-int/lit16 p1, p2, 0xff

    invoke-static {p1}, Ljava/lang/Integer;->toBinaryString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    return-void
.end method

.method protected final printCharQuad(Ljava/lang/String;I)V
    .locals 2

    .line 624
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": \'"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    shr-int/lit8 p1, p2, 0x18

    and-int/lit16 p1, p1, 0xff

    int-to-char p1, p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    shr-int/lit8 p1, p2, 0x10

    and-int/lit16 p1, p1, 0xff

    int-to-char p1, p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    shr-int/lit8 p1, p2, 0x8

    and-int/lit16 p1, p1, 0xff

    int-to-char p1, p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    shr-int/lit8 p1, p2, 0x0

    and-int/lit16 p1, p1, 0xff

    int-to-char p1, p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string p1, "\'"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    return-void
.end method

.method public read()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 89
    iget-object v0, p0, Lorg/apache/sanselan/common/BinaryInputStream;->is:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    return v0
.end method

.method public final read1ByteInteger(Ljava/lang/String;)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 581
    iget-object v0, p0, Lorg/apache/sanselan/common/BinaryInputStream;->is:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    if-ltz v0, :cond_0

    and-int/lit16 p1, v0, 0xff

    return p1

    .line 583
    :cond_0
    new-instance v0, Lorg/apache/sanselan/ImageReadException;

    invoke-direct {v0, p1}, Lorg/apache/sanselan/ImageReadException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final read2ByteInteger(Ljava/lang/String;)I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 591
    iget-object v0, p0, Lorg/apache/sanselan/common/BinaryInputStream;->is:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    .line 592
    iget-object v1, p0, Lorg/apache/sanselan/common/BinaryInputStream;->is:Ljava/io/InputStream;

    invoke-virtual {v1}, Ljava/io/InputStream;->read()I

    move-result v1

    if-ltz v0, :cond_1

    if-ltz v1, :cond_1

    .line 596
    iget p1, p0, Lorg/apache/sanselan/common/BinaryInputStream;->byteOrder:I

    const/16 v2, 0x4d

    if-ne p1, v2, :cond_0

    and-int/lit16 p1, v0, 0xff

    shl-int/lit8 p1, p1, 0x8

    and-int/lit16 v0, v1, 0xff

    shl-int/lit8 v0, v0, 0x0

    add-int/2addr p1, v0

    return p1

    :cond_0
    and-int/lit16 p1, v1, 0xff

    shl-int/lit8 p1, p1, 0x8

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x0

    add-int/2addr p1, v0

    return p1

    .line 594
    :cond_1
    new-instance v0, Lorg/apache/sanselan/ImageReadException;

    invoke-direct {v0, p1}, Lorg/apache/sanselan/ImageReadException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final read2Bytes(Ljava/lang/String;Ljava/lang/String;)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 123
    iget v0, p0, Lorg/apache/sanselan/common/BinaryInputStream;->byteOrder:I

    invoke-virtual {p0, p1, p2, v0}, Lorg/apache/sanselan/common/BinaryInputStream;->read2Bytes(Ljava/lang/String;Ljava/lang/String;I)I

    move-result p1

    return p1
.end method

.method protected final read2Bytes(Ljava/lang/String;Ljava/lang/String;I)I
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x2

    .line 563
    new-array v1, v0, [B

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    .line 568
    iget-object v3, p0, Lorg/apache/sanselan/common/BinaryInputStream;->is:Ljava/io/InputStream;

    rsub-int/lit8 v4, v2, 0x2

    invoke-virtual {v3, v1, v2, v4}, Ljava/io/InputStream;->read([BII)I

    move-result v3

    const/4 v4, 0x1

    if-lt v3, v4, :cond_0

    add-int/2addr v2, v3

    goto :goto_0

    .line 570
    :cond_0
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 575
    :cond_1
    invoke-virtual {p0, p1, v1, p3}, Lorg/apache/sanselan/common/BinaryInputStream;->convertByteArrayToShort(Ljava/lang/String;[BI)I

    move-result p1

    return p1
.end method

.method public final read3Bytes(Ljava/lang/String;Ljava/lang/String;)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 117
    iget v0, p0, Lorg/apache/sanselan/common/BinaryInputStream;->byteOrder:I

    invoke-virtual {p0, p1, p2, v0}, Lorg/apache/sanselan/common/BinaryInputStream;->read3Bytes(Ljava/lang/String;Ljava/lang/String;I)I

    move-result p1

    return p1
.end method

.method protected final read3Bytes(Ljava/lang/String;Ljava/lang/String;I)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x3

    .line 543
    new-array v3, v0, [B

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 548
    iget-object v2, p0, Lorg/apache/sanselan/common/BinaryInputStream;->is:Ljava/io/InputStream;

    rsub-int/lit8 v4, v1, 0x3

    invoke-virtual {v2, v3, v1, v4}, Ljava/io/InputStream;->read([BII)I

    move-result v2

    const/4 v4, 0x1

    if-lt v2, v4, :cond_0

    add-int/2addr v1, v2

    goto :goto_0

    .line 550
    :cond_0
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    const/4 v4, 0x0

    const/4 v5, 0x3

    move-object v1, p0

    move-object v2, p1

    move v6, p3

    .line 555
    invoke-virtual/range {v1 .. v6}, Lorg/apache/sanselan/common/BinaryInputStream;->convertByteArrayToInt(Ljava/lang/String;[BIII)I

    move-result p1

    return p1
.end method

.method public final read4ByteInteger(Ljava/lang/String;)I
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 606
    iget-object v0, p0, Lorg/apache/sanselan/common/BinaryInputStream;->is:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    .line 607
    iget-object v1, p0, Lorg/apache/sanselan/common/BinaryInputStream;->is:Ljava/io/InputStream;

    invoke-virtual {v1}, Ljava/io/InputStream;->read()I

    move-result v1

    .line 608
    iget-object v2, p0, Lorg/apache/sanselan/common/BinaryInputStream;->is:Ljava/io/InputStream;

    invoke-virtual {v2}, Ljava/io/InputStream;->read()I

    move-result v2

    .line 609
    iget-object v3, p0, Lorg/apache/sanselan/common/BinaryInputStream;->is:Ljava/io/InputStream;

    invoke-virtual {v3}, Ljava/io/InputStream;->read()I

    move-result v3

    if-ltz v0, :cond_1

    if-ltz v1, :cond_1

    if-ltz v2, :cond_1

    if-ltz v3, :cond_1

    .line 613
    iget p1, p0, Lorg/apache/sanselan/common/BinaryInputStream;->byteOrder:I

    const/16 v4, 0x4d

    if-ne p1, v4, :cond_0

    and-int/lit16 p1, v0, 0xff

    shl-int/lit8 p1, p1, 0x18

    and-int/lit16 v0, v1, 0xff

    shl-int/lit8 v0, v0, 0x10

    add-int/2addr p1, v0

    and-int/lit16 v0, v2, 0xff

    shl-int/lit8 v0, v0, 0x8

    add-int/2addr p1, v0

    and-int/lit16 v0, v3, 0xff

    shl-int/lit8 v0, v0, 0x0

    add-int/2addr p1, v0

    return p1

    :cond_0
    and-int/lit16 p1, v3, 0xff

    shl-int/lit8 p1, p1, 0x18

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x10

    add-int/2addr p1, v2

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    add-int/2addr p1, v1

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x0

    add-int/2addr p1, v0

    return p1

    .line 611
    :cond_1
    new-instance v0, Lorg/apache/sanselan/ImageReadException;

    invoke-direct {v0, p1}, Lorg/apache/sanselan/ImageReadException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final read4Bytes(Ljava/lang/String;Ljava/lang/String;)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 111
    iget v0, p0, Lorg/apache/sanselan/common/BinaryInputStream;->byteOrder:I

    invoke-virtual {p0, p1, p2, v0}, Lorg/apache/sanselan/common/BinaryInputStream;->read4Bytes(Ljava/lang/String;Ljava/lang/String;I)I

    move-result p1

    return p1
.end method

.method protected final read4Bytes(Ljava/lang/String;Ljava/lang/String;I)I
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x4

    .line 524
    new-array v1, v0, [B

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    .line 529
    iget-object v3, p0, Lorg/apache/sanselan/common/BinaryInputStream;->is:Ljava/io/InputStream;

    rsub-int/lit8 v4, v2, 0x4

    invoke-virtual {v3, v1, v2, v4}, Ljava/io/InputStream;->read([BII)I

    move-result v3

    const/4 v4, 0x1

    if-lt v3, v4, :cond_0

    add-int/2addr v2, v3

    goto :goto_0

    .line 531
    :cond_0
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 536
    :cond_1
    invoke-virtual {p0, p1, v1, p3}, Lorg/apache/sanselan/common/BinaryInputStream;->convertByteArrayToInt(Ljava/lang/String;[BI)I

    move-result p1

    return p1
.end method

.method protected final readAndVerifyBytes(Ljava/lang/String;[BLjava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 181
    array-length v0, p2

    invoke-virtual {p0, p1, v0, p3}, Lorg/apache/sanselan/common/BinaryInputStream;->readByteArray(Ljava/lang/String;ILjava/lang/String;)[B

    move-result-object p1

    const/4 v0, 0x0

    .line 183
    :goto_0
    array-length v1, p2

    if-ge v0, v1, :cond_1

    .line 185
    aget-byte v1, p1, v0

    aget-byte v2, p2, v0

    if-ne v1, v2, :cond_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 187
    :cond_0
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "i: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 188
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "bytes["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "]"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    aget-byte p1, p1, v0

    invoke-virtual {p0, v1, p1}, Lorg/apache/sanselan/common/BinaryInputStream;->debugNumber(Ljava/lang/String;I)V

    .line 189
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "expected["

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    aget-byte p2, p2, v0

    invoke-virtual {p0, p1, p2}, Lorg/apache/sanselan/common/BinaryInputStream;->debugNumber(Ljava/lang/String;I)V

    .line 191
    new-instance p1, Lorg/apache/sanselan/ImageReadException;

    invoke-direct {p1, p3}, Lorg/apache/sanselan/ImageReadException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    return-void
.end method

.method public final readAndVerifyBytes([BLjava/lang/String;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 160
    :goto_0
    array-length v1, p1

    if-ge v0, v1, :cond_1

    .line 162
    iget-object v1, p0, Lorg/apache/sanselan/common/BinaryInputStream;->is:Ljava/io/InputStream;

    invoke-virtual {v1}, Ljava/io/InputStream;->read()I

    move-result v1

    and-int/lit16 v2, v1, 0xff

    int-to-byte v2, v2

    if-ltz v1, :cond_0

    .line 165
    aget-byte v1, p1, v0

    if-ne v2, v1, :cond_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 167
    :cond_0
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "i: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    const-string v1, "expected"

    .line 169
    invoke-virtual {p0, v1, p1}, Lorg/apache/sanselan/common/BinaryInputStream;->debugByteArray(Ljava/lang/String;[B)V

    .line 170
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "data["

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "]"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, v2}, Lorg/apache/sanselan/common/BinaryInputStream;->debugNumber(Ljava/lang/String;I)V

    .line 173
    new-instance p1, Lorg/apache/sanselan/ImageReadException;

    invoke-direct {p1, p2}, Lorg/apache/sanselan/ImageReadException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    return-void
.end method

.method public final readByte(Ljava/lang/String;Ljava/lang/String;)B
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 229
    iget-object v0, p0, Lorg/apache/sanselan/common/BinaryInputStream;->is:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    if-ltz v0, :cond_1

    .line 237
    iget-boolean p2, p0, Lorg/apache/sanselan/common/BinaryInputStream;->debug:Z

    if-eqz p2, :cond_0

    .line 238
    invoke-virtual {p0, p1, v0}, Lorg/apache/sanselan/common/BinaryInputStream;->debugNumber(Ljava/lang/String;I)V

    :cond_0
    and-int/lit16 p1, v0, 0xff

    int-to-byte p1, p1

    return p1

    .line 233
    :cond_1
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 234
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final readByteArray(ILjava/lang/String;)[B
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 465
    invoke-virtual {p0, p1, p2, v0, v1}, Lorg/apache/sanselan/common/BinaryInputStream;->readByteArray(ILjava/lang/String;ZZ)[B

    move-result-object p1

    return-object p1
.end method

.method public final readByteArray(ILjava/lang/String;ZZ)[B
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 472
    new-array v0, p1, [B

    const/4 v1, 0x0

    :goto_0
    sub-int v2, p1, v1

    .line 475
    invoke-virtual {p0, v0, v1, v2}, Lorg/apache/sanselan/common/BinaryInputStream;->read([BII)I

    move-result v2

    if-lez v2, :cond_0

    add-int/2addr v1, v2

    goto :goto_0

    :cond_0
    if-ge v1, p1, :cond_3

    if-nez p4, :cond_2

    if-eqz p3, :cond_1

    .line 482
    sget-object p1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {p1, p2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :cond_1
    const/4 p1, 0x0

    return-object p1

    .line 480
    :cond_2
    new-instance p1, Lorg/apache/sanselan/ImageReadException;

    invoke-direct {p1, p2}, Lorg/apache/sanselan/ImageReadException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    return-object v0
.end method

.method public final readByteArray(Ljava/lang/String;ILjava/lang/String;)[B
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 403
    new-array v0, p2, [B

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, p2, :cond_1

    .line 408
    iget-object v3, p0, Lorg/apache/sanselan/common/BinaryInputStream;->is:Ljava/io/InputStream;

    sub-int v4, p2, v2

    invoke-virtual {v3, v0, v2, v4}, Ljava/io/InputStream;->read([BII)I

    move-result v3

    const/4 v4, 0x1

    if-lt v3, v4, :cond_0

    add-int/2addr v2, v3

    goto :goto_0

    .line 410
    :cond_0
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, p3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 415
    :cond_1
    iget-boolean p3, p0, Lorg/apache/sanselan/common/BinaryInputStream;->debug:Z

    if-eqz p3, :cond_2

    :goto_1
    if-ge v1, p2, :cond_2

    const/16 p3, 0x96

    if-ge v1, p3, :cond_2

    .line 419
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " ("

    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ")"

    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    aget-byte v2, v0, v1

    and-int/lit16 v2, v2, 0xff

    invoke-virtual {p0, p3, v2}, Lorg/apache/sanselan/common/BinaryInputStream;->debugNumber(Ljava/lang/String;I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    return-object v0
.end method

.method public final readBytearray(Ljava/lang/String;[BII)[B
    .locals 2

    .line 448
    array-length v0, p2

    add-int v1, p3, p4

    if-ge v0, v1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 451
    :cond_0
    new-array v0, p4, [B

    const/4 v1, 0x0

    .line 452
    invoke-static {p2, p3, v0, v1, p4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 454
    iget-boolean p2, p0, Lorg/apache/sanselan/common/BinaryInputStream;->debug:Z

    if-eqz p2, :cond_1

    .line 455
    invoke-virtual {p0, p1, v0}, Lorg/apache/sanselan/common/BinaryInputStream;->debugByteArray(Ljava/lang/String;[B)V

    :cond_1
    return-object v0
.end method

.method protected final readRandomBytes()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    :goto_0
    const/16 v1, 0x64

    if-ge v0, v1, :cond_0

    .line 132
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Random Data"

    invoke-virtual {p0, v1, v2}, Lorg/apache/sanselan/common/BinaryInputStream;->readByte(Ljava/lang/String;Ljava/lang/String;)B

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method protected final scanForByte(B)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    const/4 v2, 0x3

    if-ge v0, v2, :cond_2

    .line 215
    iget-object v2, p0, Lorg/apache/sanselan/common/BinaryInputStream;->is:Ljava/io/InputStream;

    invoke-virtual {v2}, Ljava/io/InputStream;->read()I

    move-result v2

    if-gez v2, :cond_0

    return-void

    :cond_0
    and-int/lit16 v2, v2, 0xff

    if-ne v2, p1, :cond_1

    .line 220
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "\t"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ": match."

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    add-int/lit8 v0, v0, 0x1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method protected setByteOrder(I)V
    .locals 0

    .line 79
    iput p1, p0, Lorg/apache/sanselan/common/BinaryInputStream;->byteOrder:I

    return-void
.end method

.method protected setByteOrder(II)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    if-ne p1, p2, :cond_2

    const/16 p2, 0x4d

    if-ne p1, p2, :cond_0

    .line 70
    iput p1, p0, Lorg/apache/sanselan/common/BinaryInputStream;->byteOrder:I

    goto :goto_0

    :cond_0
    const/16 p2, 0x49

    if-ne p1, p2, :cond_1

    .line 72
    iput p1, p0, Lorg/apache/sanselan/common/BinaryInputStream;->byteOrder:I

    :goto_0
    return-void

    .line 74
    :cond_1
    new-instance p2, Lorg/apache/sanselan/ImageReadException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unknown Byte Order hint: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lorg/apache/sanselan/ImageReadException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 66
    :cond_2
    new-instance v0, Lorg/apache/sanselan/ImageReadException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Byte Order bytes don\'t match ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ")."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lorg/apache/sanselan/ImageReadException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final setDebug(Z)V
    .locals 0

    .line 32
    iput-boolean p1, p0, Lorg/apache/sanselan/common/BinaryInputStream;->debug:Z

    return-void
.end method

.method protected skipBytes(I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "Couldn\'t skip bytes"

    .line 685
    invoke-virtual {p0, p1, v0}, Lorg/apache/sanselan/common/BinaryInputStream;->skipBytes(ILjava/lang/String;)V

    return-void
.end method

.method public final skipBytes(ILjava/lang/String;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-wide/16 v0, 0x0

    :goto_0
    int-to-long v2, p1

    cmp-long v4, v2, v0

    if-eqz v4, :cond_1

    .line 202
    iget-object v4, p0, Lorg/apache/sanselan/common/BinaryInputStream;->is:Ljava/io/InputStream;

    sub-long/2addr v2, v0

    invoke-virtual {v4, v2, v3}, Ljava/io/InputStream;->skip(J)J

    move-result-wide v2

    const-wide/16 v4, 0x1

    cmp-long v4, v2, v4

    if-ltz v4, :cond_0

    add-long/2addr v0, v2

    goto :goto_0

    .line 204
    :cond_0
    new-instance p1, Ljava/io/IOException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " ("

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p2, ")"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    return-void
.end method
