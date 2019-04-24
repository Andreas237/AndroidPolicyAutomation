.class public Lorg/apache/sanselan/common/BinaryFileFunctions;
.super Ljava/lang/Object;
.source "BinaryFileFunctions.java"

# interfaces
.implements Lorg/apache/sanselan/common/BinaryConstants;


# instance fields
.field protected debug:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 31
    iput-boolean v0, p0, Lorg/apache/sanselan/common/BinaryFileFunctions;->debug:Z

    return-void
.end method

.method public static final CharsToQuad(CCCC)I
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

.method public static final compareBytes([BI[BII)Z
    .locals 4

    .line 635
    array-length v0, p0

    add-int v1, p1, p4

    const/4 v2, 0x0

    if-ge v0, v1, :cond_0

    return v2

    .line 637
    :cond_0
    array-length v0, p2

    add-int v1, p3, p4

    if-ge v0, v1, :cond_1

    return v2

    :cond_1
    move v0, v2

    :goto_0
    if-ge v0, p4, :cond_3

    add-int v1, p1, v0

    .line 642
    aget-byte v1, p0, v1

    add-int v3, p3, v0

    aget-byte v3, p2, v3

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    const/4 p0, 0x1

    return p0
.end method

.method public static final compareBytes([B[B)Z
    .locals 3

    .line 626
    array-length v0, p0

    array-length v1, p1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    return v2

    .line 629
    :cond_0
    array-length v0, p0

    invoke-static {p0, v2, p1, v2, v0}, Lorg/apache/sanselan/common/BinaryFileFunctions;->compareBytes([BI[BII)Z

    move-result p0

    return p0
.end method

.method public static final head([BI)[B
    .locals 1

    .line 587
    array-length v0, p0

    if-le p1, v0, :cond_0

    .line 588
    array-length p1, p0

    :cond_0
    const/4 v0, 0x0

    .line 589
    invoke-static {p0, v0, p1}, Lorg/apache/sanselan/common/BinaryFileFunctions;->slice([BII)[B

    move-result-object p0

    return-object p0
.end method

.method protected static final int2ToByteArray(II)[B
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/16 v3, 0x4d

    if-ne p1, v3, :cond_0

    .line 326
    new-array p1, v1, [B

    shr-int/lit8 v1, p0, 0x8

    int-to-byte v1, v1

    aput-byte v1, p1, v2

    shr-int/2addr p0, v2

    int-to-byte p0, p0

    aput-byte p0, p1, v0

    return-object p1

    .line 328
    :cond_0
    new-array p1, v1, [B

    shr-int/lit8 v1, p0, 0x0

    int-to-byte v1, v1

    aput-byte v1, p1, v2

    shr-int/lit8 p0, p0, 0x8

    int-to-byte p0, p0

    aput-byte p0, p1, v0

    return-object p1
.end method

.method public static final slice([BII)[B
    .locals 2

    .line 569
    array-length v0, p0

    add-int v1, p1, p2

    if-ge v0, v1, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 572
    :cond_0
    new-array v0, p2, [B

    const/4 v1, 0x0

    .line 573
    invoke-static {p0, p1, v0, v1, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0
.end method

.method public static final tail([BI)[B
    .locals 1

    .line 580
    array-length v0, p0

    if-le p1, v0, :cond_0

    .line 581
    array-length p1, p0

    .line 582
    :cond_0
    array-length v0, p0

    sub-int/2addr v0, p1

    invoke-static {p0, v0, p1}, Lorg/apache/sanselan/common/BinaryFileFunctions;->slice([BII)[B

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final compareByteArrays([BI[BII)Z
    .locals 4

    .line 603
    array-length v0, p1

    add-int v1, p2, p5

    const/4 v2, 0x0

    if-ge v0, v1, :cond_0

    return v2

    .line 607
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

    .line 612
    aget-byte v1, p1, v1

    add-int v3, p4, v0

    aget-byte v3, p3, v3

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    const/4 p1, 0x1

    return p1
.end method

.method public final compareByteArrays([B[B)Z
    .locals 6

    .line 594
    array-length v0, p1

    array-length v1, p2

    if-eq v0, v1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 v2, 0x0

    const/4 v4, 0x0

    .line 597
    array-length v5, p1

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    invoke-virtual/range {v0 .. v5}, Lorg/apache/sanselan/common/BinaryFileFunctions;->compareByteArrays([BI[BII)Z

    move-result p1

    return p1
.end method

.method protected final convertByteArrayToDouble(Ljava/lang/String;[BI)D
    .locals 1

    const/4 v0, 0x0

    .line 981
    invoke-virtual {p0, p1, p2, v0, p3}, Lorg/apache/sanselan/common/BinaryFileFunctions;->convertByteArrayToDouble(Ljava/lang/String;[BII)D

    move-result-wide p1

    return-wide p1
.end method

.method protected final convertByteArrayToDouble(Ljava/lang/String;[BII)D
    .locals 6

    add-int/lit8 p1, p3, 0x0

    .line 989
    aget-byte p1, p2, p1

    add-int/lit8 v0, p3, 0x1

    .line 990
    aget-byte v0, p2, v0

    add-int/lit8 v1, p3, 0x2

    .line 991
    aget-byte v1, p2, v1

    add-int/lit8 v2, p3, 0x3

    .line 992
    aget-byte v2, p2, v2

    add-int/lit8 v3, p3, 0x4

    .line 993
    aget-byte v3, p2, v3

    add-int/lit8 v4, p3, 0x5

    .line 994
    aget-byte v4, p2, v4

    add-int/lit8 v5, p3, 0x6

    .line 995
    aget-byte v5, p2, v5

    add-int/lit8 p3, p3, 0x7

    .line 996
    aget-byte p2, p2, p3

    const/16 p3, 0x4d

    if-ne p4, p3, :cond_0

    and-int/lit16 p1, p1, 0xff

    shl-int/lit8 p1, p1, 0x38

    and-int/lit16 p3, v0, 0xff

    shl-int/lit8 p3, p3, 0x30

    or-int/2addr p1, p3

    and-int/lit16 p3, v1, 0xff

    shl-int/lit8 p3, p3, 0x28

    or-int/2addr p1, p3

    and-int/lit16 p3, v2, 0xff

    shl-int/lit8 p3, p3, 0x20

    or-int/2addr p1, p3

    and-int/lit16 p3, v3, 0xff

    shl-int/lit8 p3, p3, 0x18

    or-int/2addr p1, p3

    and-int/lit16 p3, v4, 0xff

    shl-int/lit8 p3, p3, 0x10

    or-int/2addr p1, p3

    and-int/lit16 p3, v5, 0xff

    shl-int/lit8 p3, p3, 0x8

    or-int/2addr p1, p3

    and-int/lit16 p2, p2, 0xff

    shl-int/lit8 p2, p2, 0x0

    or-int/2addr p1, p2

    int-to-long p1, p1

    goto :goto_0

    :cond_0
    and-int/lit16 p2, p2, 0xff

    shl-int/lit8 p2, p2, 0x38

    and-int/lit16 p3, v5, 0xff

    shl-int/lit8 p3, p3, 0x30

    or-int/2addr p2, p3

    and-int/lit16 p3, v4, 0xff

    shl-int/lit8 p3, p3, 0x28

    or-int/2addr p2, p3

    and-int/lit16 p3, v3, 0xff

    shl-int/lit8 p3, p3, 0x20

    or-int/2addr p2, p3

    and-int/lit16 p3, v2, 0xff

    shl-int/lit8 p3, p3, 0x18

    or-int/2addr p2, p3

    and-int/lit16 p3, v1, 0xff

    shl-int/lit8 p3, p3, 0x10

    or-int/2addr p2, p3

    and-int/lit16 p3, v0, 0xff

    shl-int/lit8 p3, p3, 0x8

    or-int/2addr p2, p3

    and-int/lit16 p1, p1, 0xff

    shl-int/lit8 p1, p1, 0x0

    or-int/2addr p1, p2

    int-to-long p1, p1

    .line 1016
    :goto_0
    invoke-static {p1, p2}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide p1

    return-wide p1
.end method

.method protected final convertByteArrayToDoubleArray(Ljava/lang/String;[BIII)[D
    .locals 4

    mul-int/lit8 v0, p4, 0x8

    add-int/2addr v0, p3

    .line 1068
    array-length v1, p2

    if-ge v1, v0, :cond_0

    .line 1070
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

    .line 1075
    :cond_0
    new-array v0, p4, [D

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p4, :cond_1

    mul-int/lit8 v2, v1, 0x8

    add-int/2addr v2, p3

    .line 1079
    invoke-virtual {p0, p1, p2, v2, p5}, Lorg/apache/sanselan/common/BinaryFileFunctions;->convertByteArrayToDouble(Ljava/lang/String;[BII)D

    move-result-wide v2

    aput-wide v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method protected final convertByteArrayToFloat(Ljava/lang/String;[BI)F
    .locals 1

    const/4 v0, 0x0

    .line 801
    invoke-virtual {p0, p1, p2, v0, p3}, Lorg/apache/sanselan/common/BinaryFileFunctions;->convertByteArrayToFloat(Ljava/lang/String;[BII)F

    move-result p1

    return p1
.end method

.method protected final convertByteArrayToFloat(Ljava/lang/String;[BII)F
    .locals 2

    add-int/lit8 p1, p3, 0x0

    .line 809
    aget-byte p1, p2, p1

    add-int/lit8 v0, p3, 0x1

    .line 810
    aget-byte v0, p2, v0

    add-int/lit8 v1, p3, 0x2

    .line 811
    aget-byte v1, p2, v1

    add-int/lit8 p3, p3, 0x3

    .line 812
    aget-byte p2, p2, p3

    const/16 p3, 0x4d

    if-ne p4, p3, :cond_0

    and-int/lit16 p1, p1, 0xff

    shl-int/lit8 p1, p1, 0x18

    and-int/lit16 p3, v0, 0xff

    shl-int/lit8 p3, p3, 0x10

    or-int/2addr p1, p3

    and-int/lit16 p3, v1, 0xff

    shl-int/lit8 p3, p3, 0x8

    or-int/2addr p1, p3

    and-int/lit16 p2, p2, 0xff

    shl-int/lit8 p2, p2, 0x0

    or-int/2addr p1, p2

    goto :goto_0

    :cond_0
    and-int/lit16 p2, p2, 0xff

    shl-int/lit8 p2, p2, 0x18

    and-int/lit16 p3, v1, 0xff

    shl-int/lit8 p3, p3, 0x10

    or-int/2addr p2, p3

    and-int/lit16 p3, v0, 0xff

    shl-int/lit8 p3, p3, 0x8

    or-int/2addr p2, p3

    and-int/lit16 p1, p1, 0xff

    shl-int/lit8 p1, p1, 0x0

    or-int/2addr p1, p2

    .line 827
    :goto_0
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    return p1
.end method

.method protected final convertByteArrayToFloatArray(Ljava/lang/String;[BIII)[F
    .locals 3

    mul-int/lit8 v0, p4, 0x4

    add-int/2addr v0, p3

    .line 840
    array-length v1, p2

    if-ge v1, v0, :cond_0

    .line 842
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

    .line 847
    :cond_0
    new-array v0, p4, [F

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p4, :cond_1

    mul-int/lit8 v2, v1, 0x4

    add-int/2addr v2, p3

    .line 851
    invoke-virtual {p0, p1, p2, v2, p5}, Lorg/apache/sanselan/common/BinaryFileFunctions;->convertByteArrayToFloat(Ljava/lang/String;[BII)F

    move-result v2

    aput v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method protected final convertByteArrayToInt(Ljava/lang/String;[BI)I
    .locals 1

    const/4 v0, 0x0

    .line 252
    invoke-virtual {p0, p1, p2, v0, p3}, Lorg/apache/sanselan/common/BinaryFileFunctions;->convertByteArrayToInt(Ljava/lang/String;[BII)I

    move-result p1

    return p1
.end method

.method protected final convertByteArrayToInt(Ljava/lang/String;[BII)I
    .locals 3

    add-int/lit8 v0, p3, 0x0

    .line 258
    aget-byte v0, p2, v0

    add-int/lit8 v1, p3, 0x1

    .line 259
    aget-byte v1, p2, v1

    add-int/lit8 v2, p3, 0x2

    .line 260
    aget-byte v2, p2, v2

    add-int/lit8 p3, p3, 0x3

    .line 261
    aget-byte p2, p2, p3

    const/16 p3, 0x4d

    if-ne p4, p3, :cond_0

    and-int/lit16 p3, v0, 0xff

    shl-int/lit8 p3, p3, 0x18

    and-int/lit16 p4, v1, 0xff

    shl-int/lit8 p4, p4, 0x10

    or-int/2addr p3, p4

    and-int/lit16 p4, v2, 0xff

    shl-int/lit8 p4, p4, 0x8

    or-int/2addr p3, p4

    and-int/lit16 p2, p2, 0xff

    shl-int/lit8 p2, p2, 0x0

    or-int/2addr p2, p3

    goto :goto_0

    :cond_0
    and-int/lit16 p2, p2, 0xff

    shl-int/lit8 p2, p2, 0x18

    and-int/lit16 p3, v2, 0xff

    shl-int/lit8 p3, p3, 0x10

    or-int/2addr p2, p3

    and-int/lit16 p3, v1, 0xff

    shl-int/lit8 p3, p3, 0x8

    or-int/2addr p2, p3

    and-int/lit16 p3, v0, 0xff

    shl-int/lit8 p3, p3, 0x0

    or-int/2addr p2, p3

    .line 276
    :goto_0
    iget-boolean p3, p0, Lorg/apache/sanselan/common/BinaryFileFunctions;->debug:Z

    if-eqz p3, :cond_1

    const/4 p3, 0x4

    .line 277
    invoke-virtual {p0, p1, p2, p3}, Lorg/apache/sanselan/common/BinaryFileFunctions;->debugNumber(Ljava/lang/String;II)V

    :cond_1
    return p2
.end method

.method protected final convertByteArrayToIntArray(Ljava/lang/String;[BIII)[I
    .locals 3

    mul-int/lit8 v0, p4, 0x4

    add-int/2addr v0, p3

    .line 287
    array-length v1, p2

    if-ge v1, v0, :cond_0

    .line 289
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

    .line 294
    :cond_0
    new-array v0, p4, [I

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p4, :cond_1

    mul-int/lit8 v2, v1, 0x4

    add-int/2addr v2, p3

    .line 298
    invoke-virtual {p0, p1, p2, v2, p5}, Lorg/apache/sanselan/common/BinaryFileFunctions;->convertByteArrayToInt(Ljava/lang/String;[BII)I

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

    .line 237
    invoke-virtual {p0, p1, p2, v0, p3}, Lorg/apache/sanselan/common/BinaryFileFunctions;->convertByteArrayToRational(Ljava/lang/String;[BII)Lorg/apache/sanselan/common/RationalNumber;

    move-result-object p1

    return-object p1
.end method

.method protected final convertByteArrayToRational(Ljava/lang/String;[BII)Lorg/apache/sanselan/common/RationalNumber;
    .locals 1

    add-int/lit8 v0, p3, 0x0

    .line 243
    invoke-virtual {p0, p1, p2, v0, p4}, Lorg/apache/sanselan/common/BinaryFileFunctions;->convertByteArrayToInt(Ljava/lang/String;[BII)I

    move-result v0

    add-int/lit8 p3, p3, 0x4

    .line 244
    invoke-virtual {p0, p1, p2, p3, p4}, Lorg/apache/sanselan/common/BinaryFileFunctions;->convertByteArrayToInt(Ljava/lang/String;[BII)I

    move-result p1

    .line 246
    new-instance p2, Lorg/apache/sanselan/common/RationalNumber;

    invoke-direct {p2, v0, p1}, Lorg/apache/sanselan/common/RationalNumber;-><init>(II)V

    return-object p2
.end method

.method protected final convertByteArrayToRationalArray(Ljava/lang/String;[BIII)[Lorg/apache/sanselan/common/RationalNumber;
    .locals 3

    mul-int/lit8 v0, p4, 0x8

    add-int/2addr v0, p3

    .line 216
    array-length v1, p2

    if-ge v1, v0, :cond_0

    .line 218
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

    .line 223
    :cond_0
    new-array v0, p4, [Lorg/apache/sanselan/common/RationalNumber;

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p4, :cond_1

    mul-int/lit8 v2, v1, 0x8

    add-int/2addr v2, p3

    .line 227
    invoke-virtual {p0, p1, p2, v2, p5}, Lorg/apache/sanselan/common/BinaryFileFunctions;->convertByteArrayToRational(Ljava/lang/String;[BII)Lorg/apache/sanselan/common/RationalNumber;

    move-result-object v2

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method protected final convertByteArrayToShort(Ljava/lang/String;I[BI)I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;
        }
    .end annotation

    add-int/lit8 v0, p2, 0x1

    .line 440
    array-length v1, p3

    if-ge v0, v1, :cond_2

    add-int/lit8 p2, p2, 0x0

    .line 444
    aget-byte p2, p3, p2

    and-int/lit16 p2, p2, 0xff

    .line 445
    aget-byte p3, p3, v0

    and-int/lit16 p3, p3, 0xff

    const/16 v0, 0x4d

    if-ne p4, v0, :cond_0

    shl-int/lit8 p2, p2, 0x8

    or-int/2addr p2, p3

    goto :goto_0

    :cond_0
    shl-int/lit8 p3, p3, 0x8

    or-int/2addr p2, p3

    .line 455
    :goto_0
    iget-boolean p3, p0, Lorg/apache/sanselan/common/BinaryFileFunctions;->debug:Z

    if-eqz p3, :cond_1

    const/4 p3, 0x2

    .line 456
    invoke-virtual {p0, p1, p2, p3}, Lorg/apache/sanselan/common/BinaryFileFunctions;->debugNumber(Ljava/lang/String;II)V

    :cond_1
    return p2

    .line 441
    :cond_2
    new-instance p1, Lorg/apache/sanselan/ImageReadException;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Index out of bounds. Array size: "

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length p3, p3

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, ", index: "

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lorg/apache/sanselan/ImageReadException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method protected final convertByteArrayToShort(Ljava/lang/String;[BI)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 434
    invoke-virtual {p0, p1, v0, p2, p3}, Lorg/apache/sanselan/common/BinaryFileFunctions;->convertByteArrayToShort(Ljava/lang/String;I[BI)I

    move-result p1

    return p1
.end method

.method protected final convertByteArrayToShortArray(Ljava/lang/String;[BIII)[I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;
        }
    .end annotation

    mul-int/lit8 v0, p4, 0x2

    add-int/2addr v0, p3

    .line 468
    array-length v1, p2

    if-ge v1, v0, :cond_0

    .line 470
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

    .line 475
    :cond_0
    new-array v0, p4, [I

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p4, :cond_1

    mul-int/lit8 v2, v1, 0x2

    add-int/2addr v2, p3

    .line 479
    invoke-virtual {p0, p1, v2, p2, p5}, Lorg/apache/sanselan/common/BinaryFileFunctions;->convertByteArrayToShort(Ljava/lang/String;I[BI)I

    move-result v2

    aput v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method protected final convertDoubleArrayToByteArray([DI)[B
    .locals 19

    move-object/from16 v0, p1

    .line 946
    array-length v1, v0

    const/16 v2, 0x8

    mul-int/2addr v1, v2

    new-array v1, v1, [B

    const/4 v3, 0x0

    move v4, v3

    .line 947
    :goto_0
    array-length v5, v0

    if-ge v4, v5, :cond_1

    .line 949
    aget-wide v5, v0, v4

    .line 950
    invoke-static {v5, v6}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide v5

    mul-int/lit8 v7, v4, 0x8

    const/16 v8, 0x4d

    const/16 v12, 0x18

    const/16 v13, 0x10

    const-wide/16 v14, 0xff

    move/from16 v9, p2

    if-ne v9, v8, :cond_0

    add-int/lit8 v8, v7, 0x0

    shr-long v16, v5, v3

    move/from16 v18, v4

    and-long v3, v16, v14

    long-to-int v3, v3

    int-to-byte v3, v3

    .line 955
    aput-byte v3, v1, v8

    add-int/lit8 v3, v7, 0x1

    shr-long v16, v5, v2

    and-long v10, v16, v14

    long-to-int v10, v10

    int-to-byte v10, v10

    .line 956
    aput-byte v10, v1, v3

    add-int/lit8 v3, v7, 0x2

    shr-long v10, v5, v13

    and-long/2addr v10, v14

    long-to-int v10, v10

    int-to-byte v10, v10

    .line 957
    aput-byte v10, v1, v3

    add-int/lit8 v3, v7, 0x3

    shr-long v10, v5, v12

    and-long/2addr v10, v14

    long-to-int v10, v10

    int-to-byte v10, v10

    .line 958
    aput-byte v10, v1, v3

    add-int/lit8 v3, v7, 0x4

    const/16 v8, 0x20

    shr-long v10, v5, v8

    and-long/2addr v10, v14

    long-to-int v8, v10

    int-to-byte v8, v8

    .line 959
    aput-byte v8, v1, v3

    add-int/lit8 v3, v7, 0x5

    const/16 v4, 0x28

    shr-long v10, v5, v4

    and-long/2addr v10, v14

    long-to-int v4, v10

    int-to-byte v4, v4

    .line 960
    aput-byte v4, v1, v3

    add-int/lit8 v3, v7, 0x6

    const/16 v4, 0x30

    shr-long v10, v5, v4

    and-long/2addr v10, v14

    long-to-int v4, v10

    int-to-byte v4, v4

    .line 961
    aput-byte v4, v1, v3

    add-int/lit8 v7, v7, 0x7

    const/16 v3, 0x38

    shr-long v3, v5, v3

    and-long/2addr v3, v14

    long-to-int v3, v3

    int-to-byte v3, v3

    .line 962
    aput-byte v3, v1, v7

    const/4 v10, 0x0

    goto :goto_1

    :cond_0
    move/from16 v18, v4

    add-int/lit8 v3, v7, 0x7

    const/4 v10, 0x0

    shr-long v16, v5, v10

    and-long v8, v16, v14

    long-to-int v8, v8

    int-to-byte v8, v8

    .line 965
    aput-byte v8, v1, v3

    add-int/lit8 v3, v7, 0x6

    shr-long v8, v5, v2

    and-long/2addr v8, v14

    long-to-int v8, v8

    int-to-byte v8, v8

    .line 966
    aput-byte v8, v1, v3

    add-int/lit8 v3, v7, 0x5

    shr-long v8, v5, v13

    and-long/2addr v8, v14

    long-to-int v8, v8

    int-to-byte v8, v8

    .line 967
    aput-byte v8, v1, v3

    add-int/lit8 v3, v7, 0x4

    shr-long v8, v5, v12

    and-long/2addr v8, v14

    long-to-int v8, v8

    int-to-byte v8, v8

    .line 968
    aput-byte v8, v1, v3

    add-int/lit8 v3, v7, 0x3

    const/16 v8, 0x20

    shr-long v8, v5, v8

    and-long/2addr v8, v14

    long-to-int v8, v8

    int-to-byte v8, v8

    .line 969
    aput-byte v8, v1, v3

    add-int/lit8 v3, v7, 0x2

    const/16 v4, 0x28

    shr-long v8, v5, v4

    and-long/2addr v8, v14

    long-to-int v4, v8

    int-to-byte v4, v4

    .line 970
    aput-byte v4, v1, v3

    add-int/lit8 v3, v7, 0x1

    const/16 v4, 0x30

    shr-long v8, v5, v4

    and-long/2addr v8, v14

    long-to-int v4, v8

    int-to-byte v4, v4

    .line 971
    aput-byte v4, v1, v3

    add-int/lit8 v7, v7, 0x0

    const/16 v3, 0x38

    shr-long v3, v5, v3

    and-long/2addr v3, v14

    long-to-int v3, v3

    int-to-byte v3, v3

    .line 972
    aput-byte v3, v1, v7

    :goto_1
    add-int/lit8 v4, v18, 0x1

    move v3, v10

    goto/16 :goto_0

    :cond_1
    return-object v1
.end method

.method protected final convertDoubleToByteArray(DI)[B
    .locals 21

    const/16 v0, 0x8

    .line 913
    new-array v1, v0, [B

    .line 915
    invoke-static/range {p1 .. p2}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide v2

    const/16 v4, 0x30

    const/4 v5, 0x1

    const/16 v6, 0x28

    const/4 v7, 0x2

    const/16 v8, 0x20

    const/4 v9, 0x3

    const/16 v10, 0x18

    const/4 v11, 0x4

    const/16 v12, 0x10

    const/4 v13, 0x5

    const/16 v16, 0x0

    const-wide/16 v17, 0xff

    const/16 v15, 0x4d

    move/from16 v14, p3

    if-ne v14, v15, :cond_0

    shr-long v14, v2, v16

    and-long v14, v14, v17

    long-to-int v14, v14

    int-to-byte v14, v14

    aput-byte v14, v1, v16

    shr-long v14, v2, v0

    and-long v14, v14, v17

    long-to-int v0, v14

    int-to-byte v0, v0

    aput-byte v0, v1, v5

    shr-long v14, v2, v12

    and-long v14, v14, v17

    long-to-int v0, v14

    int-to-byte v0, v0

    aput-byte v0, v1, v7

    shr-long v14, v2, v10

    and-long v14, v14, v17

    long-to-int v0, v14

    int-to-byte v0, v0

    aput-byte v0, v1, v9

    shr-long v7, v2, v8

    and-long v7, v7, v17

    long-to-int v0, v7

    int-to-byte v0, v0

    aput-byte v0, v1, v11

    shr-long v5, v2, v6

    and-long v5, v5, v17

    long-to-int v0, v5

    int-to-byte v0, v0

    aput-byte v0, v1, v13

    shr-long v4, v2, v4

    and-long v4, v4, v17

    long-to-int v0, v4

    int-to-byte v0, v0

    const/4 v4, 0x6

    aput-byte v0, v1, v4

    const/16 v0, 0x38

    shr-long/2addr v2, v0

    and-long v2, v2, v17

    long-to-int v0, v2

    int-to-byte v0, v0

    const/4 v14, 0x7

    aput-byte v0, v1, v14

    goto :goto_0

    :cond_0
    const/4 v14, 0x7

    shr-long v19, v2, v16

    and-long v4, v19, v17

    long-to-int v4, v4

    int-to-byte v4, v4

    aput-byte v4, v1, v14

    shr-long v4, v2, v0

    and-long v4, v4, v17

    long-to-int v0, v4

    int-to-byte v0, v0

    const/4 v4, 0x6

    aput-byte v0, v1, v4

    shr-long v4, v2, v12

    and-long v4, v4, v17

    long-to-int v0, v4

    int-to-byte v0, v0

    aput-byte v0, v1, v13

    shr-long v4, v2, v10

    and-long v4, v4, v17

    long-to-int v0, v4

    int-to-byte v0, v0

    aput-byte v0, v1, v11

    shr-long v4, v2, v8

    and-long v4, v4, v17

    long-to-int v0, v4

    int-to-byte v0, v0

    aput-byte v0, v1, v9

    shr-long v4, v2, v6

    and-long v4, v4, v17

    long-to-int v0, v4

    int-to-byte v0, v0

    aput-byte v0, v1, v7

    const/16 v0, 0x30

    shr-long v4, v2, v0

    and-long v4, v4, v17

    long-to-int v0, v4

    int-to-byte v0, v0

    const/4 v4, 0x1

    aput-byte v0, v1, v4

    const/16 v0, 0x38

    shr-long/2addr v2, v0

    and-long v2, v2, v17

    long-to-int v0, v2

    int-to-byte v0, v0

    aput-byte v0, v1, v16

    :goto_0
    return-object v1
.end method

.method protected final convertFloatArrayToByteArray([FI)[B
    .locals 6

    .line 886
    array-length v0, p1

    mul-int/lit8 v0, v0, 0x4

    new-array v0, v0, [B

    const/4 v1, 0x0

    .line 887
    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_1

    .line 889
    aget v2, p1, v1

    .line 890
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    mul-int/lit8 v3, v1, 0x4

    const/16 v4, 0x4d

    if-ne p2, v4, :cond_0

    add-int/lit8 v4, v3, 0x0

    shr-int/lit8 v5, v2, 0x0

    and-int/lit16 v5, v5, 0xff

    int-to-byte v5, v5

    .line 895
    aput-byte v5, v0, v4

    add-int/lit8 v4, v3, 0x1

    shr-int/lit8 v5, v2, 0x8

    and-int/lit16 v5, v5, 0xff

    int-to-byte v5, v5

    .line 896
    aput-byte v5, v0, v4

    add-int/lit8 v4, v3, 0x2

    shr-int/lit8 v5, v2, 0x10

    and-int/lit16 v5, v5, 0xff

    int-to-byte v5, v5

    .line 897
    aput-byte v5, v0, v4

    add-int/lit8 v3, v3, 0x3

    shr-int/lit8 v2, v2, 0x18

    and-int/lit16 v2, v2, 0xff

    int-to-byte v2, v2

    .line 898
    aput-byte v2, v0, v3

    goto :goto_1

    :cond_0
    add-int/lit8 v4, v3, 0x3

    shr-int/lit8 v5, v2, 0x0

    and-int/lit16 v5, v5, 0xff

    int-to-byte v5, v5

    .line 901
    aput-byte v5, v0, v4

    add-int/lit8 v4, v3, 0x2

    shr-int/lit8 v5, v2, 0x8

    and-int/lit16 v5, v5, 0xff

    int-to-byte v5, v5

    .line 902
    aput-byte v5, v0, v4

    add-int/lit8 v4, v3, 0x1

    shr-int/lit8 v5, v2, 0x10

    and-int/lit16 v5, v5, 0xff

    int-to-byte v5, v5

    .line 903
    aput-byte v5, v0, v4

    add-int/lit8 v3, v3, 0x0

    shr-int/lit8 v2, v2, 0x18

    and-int/lit16 v2, v2, 0xff

    int-to-byte v2, v2

    .line 904
    aput-byte v2, v0, v3

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method protected final convertFloatToByteArray(FI)[B
    .locals 6

    const/4 v0, 0x4

    .line 861
    new-array v0, v0, [B

    .line 863
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    const/4 v1, 0x1

    const/4 v2, 0x2

    const/4 v3, 0x3

    const/4 v4, 0x0

    const/16 v5, 0x4d

    if-ne p2, v5, :cond_0

    shr-int/lit8 p2, p1, 0x0

    and-int/lit16 p2, p2, 0xff

    int-to-byte p2, p2

    aput-byte p2, v0, v4

    shr-int/lit8 p2, p1, 0x8

    and-int/lit16 p2, p2, 0xff

    int-to-byte p2, p2

    aput-byte p2, v0, v1

    shr-int/lit8 p2, p1, 0x10

    and-int/lit16 p2, p2, 0xff

    int-to-byte p2, p2

    aput-byte p2, v0, v2

    shr-int/lit8 p1, p1, 0x18

    and-int/lit16 p1, p1, 0xff

    int-to-byte p1, p1

    aput-byte p1, v0, v3

    goto :goto_0

    :cond_0
    shr-int/lit8 p2, p1, 0x0

    and-int/lit16 p2, p2, 0xff

    int-to-byte p2, p2

    aput-byte p2, v0, v3

    shr-int/lit8 p2, p1, 0x8

    and-int/lit16 p2, p2, 0xff

    int-to-byte p2, p2

    aput-byte p2, v0, v2

    shr-int/lit8 p2, p1, 0x10

    and-int/lit16 p2, p2, 0xff

    int-to-byte p2, p2

    aput-byte p2, v0, v1

    shr-int/lit8 p1, p1, 0x18

    and-int/lit16 p1, p1, 0xff

    int-to-byte p1, p1

    aput-byte p1, v0, v4

    :goto_0
    return-object v0
.end method

.method protected final convertIntArrayToByteArray([II)[B
    .locals 4

    .line 334
    array-length v0, p1

    mul-int/lit8 v0, v0, 0x4

    new-array v0, v0, [B

    const/4 v1, 0x0

    .line 336
    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_0

    .line 338
    aget v2, p1, v1

    mul-int/lit8 v3, v1, 0x4

    invoke-virtual {p0, v2, v0, v3, p2}, Lorg/apache/sanselan/common/BinaryFileFunctions;->writeIntInToByteArray(I[BII)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method protected final convertIntArrayToRationalArray([I[II)[B
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageWriteException;
        }
    .end annotation

    .line 387
    array-length v0, p1

    array-length v1, p2

    if-ne v0, v1, :cond_1

    .line 392
    array-length v0, p1

    mul-int/lit8 v0, v0, 0x8

    new-array v0, v0, [B

    const/4 v1, 0x0

    .line 394
    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_0

    .line 396
    aget v2, p1, v1

    mul-int/lit8 v3, v1, 0x8

    invoke-virtual {p0, v2, v0, v3, p3}, Lorg/apache/sanselan/common/BinaryFileFunctions;->writeIntInToByteArray(I[BII)V

    .line 397
    aget v2, p2, v1

    add-int/lit8 v3, v3, 0x4

    invoke-virtual {p0, v2, v0, v3, p3}, Lorg/apache/sanselan/common/BinaryFileFunctions;->writeIntInToByteArray(I[BII)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0

    .line 388
    :cond_1
    new-instance p3, Lorg/apache/sanselan/ImageWriteException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "numerators.length ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length p1, p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " != denominators.length ("

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length p1, p2

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p1}, Lorg/apache/sanselan/ImageWriteException;-><init>(Ljava/lang/String;)V

    throw p3
.end method

.method protected final convertRationalArrayToByteArray([Lorg/apache/sanselan/common/RationalNumber;I)[B
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageWriteException;
        }
    .end annotation

    .line 407
    array-length v0, p1

    mul-int/lit8 v0, v0, 0x8

    new-array v0, v0, [B

    const/4 v1, 0x0

    .line 409
    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_0

    .line 411
    aget-object v2, p1, v1

    iget v2, v2, Lorg/apache/sanselan/common/RationalNumber;->numerator:I

    mul-int/lit8 v3, v1, 0x8

    invoke-virtual {p0, v2, v0, v3, p2}, Lorg/apache/sanselan/common/BinaryFileFunctions;->writeIntInToByteArray(I[BII)V

    .line 413
    aget-object v2, p1, v1

    iget v2, v2, Lorg/apache/sanselan/common/RationalNumber;->divisor:I

    add-int/lit8 v3, v3, 0x4

    invoke-virtual {p0, v2, v0, v3, p2}, Lorg/apache/sanselan/common/BinaryFileFunctions;->writeIntInToByteArray(I[BII)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method protected final convertRationalToByteArray(Lorg/apache/sanselan/common/RationalNumber;I)[B
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageWriteException;
        }
    .end annotation

    const/16 v0, 0x8

    .line 423
    new-array v0, v0, [B

    .line 425
    iget v1, p1, Lorg/apache/sanselan/common/RationalNumber;->numerator:I

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v0, v2, p2}, Lorg/apache/sanselan/common/BinaryFileFunctions;->writeIntInToByteArray(I[BII)V

    .line 426
    iget p1, p1, Lorg/apache/sanselan/common/RationalNumber;->divisor:I

    const/4 v1, 0x4

    invoke-virtual {p0, p1, v0, v1, p2}, Lorg/apache/sanselan/common/BinaryFileFunctions;->writeIntInToByteArray(I[BII)V

    return-object v0
.end method

.method protected final convertShortArrayToByteArray([II)[B
    .locals 7

    .line 347
    array-length v0, p1

    mul-int/lit8 v0, v0, 0x2

    new-array v0, v0, [B

    const/4 v1, 0x0

    move v2, v1

    .line 349
    :goto_0
    array-length v3, p1

    if-ge v2, v3, :cond_1

    .line 351
    aget v3, p1, v2

    const/16 v4, 0x4d

    if-ne p2, v4, :cond_0

    mul-int/lit8 v4, v2, 0x2

    add-int/lit8 v5, v4, 0x0

    shr-int/lit8 v6, v3, 0x8

    int-to-byte v6, v6

    .line 355
    aput-byte v6, v0, v5

    add-int/lit8 v4, v4, 0x1

    shr-int/lit8 v3, v3, 0x0

    int-to-byte v3, v3

    .line 356
    aput-byte v3, v0, v4

    goto :goto_1

    :cond_0
    mul-int/lit8 v4, v2, 0x2

    add-int/lit8 v5, v4, 0x1

    shr-int/lit8 v6, v3, 0x8

    int-to-byte v6, v6

    .line 359
    aput-byte v6, v0, v5

    add-int/2addr v4, v1

    shr-int/lit8 v3, v3, 0x0

    int-to-byte v3, v3

    .line 360
    aput-byte v3, v0, v4

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method protected final convertShortToByteArray(II)[B
    .locals 4

    const/4 v0, 0x2

    .line 369
    new-array v0, v0, [B

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/16 v3, 0x4d

    if-ne p2, v3, :cond_0

    shr-int/lit8 p2, p1, 0x8

    int-to-byte p2, p2

    aput-byte p2, v0, v2

    shr-int/2addr p1, v2

    int-to-byte p1, p1

    aput-byte p1, v0, v1

    goto :goto_0

    :cond_0
    shr-int/lit8 p2, p1, 0x8

    int-to-byte p2, p2

    aput-byte p2, v0, v1

    shr-int/2addr p1, v2

    int-to-byte p1, p1

    aput-byte p1, v0, v2

    :goto_0
    return-object v0
.end method

.method public final copyStreamToStream(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, 0x400

    .line 1094
    new-array v0, v0, [B

    .line 1096
    :goto_0
    invoke-virtual {p1, v0}, Ljava/io/InputStream;->read([B)I

    move-result v1

    if-lez v1, :cond_0

    const/4 v2, 0x0

    .line 1098
    invoke-virtual {p2, v0, v2, v1}, Ljava/io/OutputStream;->write([BII)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final debugByteArray(Ljava/lang/String;[B)V
    .locals 2

    .line 521
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length p1, p2

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    const/4 p1, 0x0

    .line 523
    :goto_0
    array-length v0, p2

    if-ge p1, v0, :cond_0

    const/16 v0, 0x32

    if-ge p1, v0, :cond_0

    .line 525
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\t ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    aget-byte v1, p2, p1

    and-int/lit16 v1, v1, 0xff

    invoke-virtual {p0, v0, v1}, Lorg/apache/sanselan/common/BinaryFileFunctions;->debugNumber(Ljava/lang/String;I)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final debugNumber(Ljava/io/PrintWriter;Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x1

    .line 69
    invoke-virtual {p0, p1, p2, p3, v0}, Lorg/apache/sanselan/common/BinaryFileFunctions;->debugNumber(Ljava/io/PrintWriter;Ljava/lang/String;II)V

    return-void
.end method

.method public final debugNumber(Ljava/io/PrintWriter;Ljava/lang/String;II)V
    .locals 4

    .line 75
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ": "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " ("

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const/4 p2, 0x0

    move v0, p3

    :goto_0
    if-ge p2, p4, :cond_1

    if-lez p2, :cond_0

    const-string v1, ","

    .line 80
    invoke-virtual {p1, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    :cond_0
    and-int/lit16 v1, v0, 0xff

    .line 82
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    int-to-char v3, v1

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v3, " ["

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    shr-int/lit8 v0, v0, 0x8

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 85
    :cond_1
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, ") [0x"

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, ", "

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    invoke-static {p3}, Ljava/lang/Integer;->toBinaryString(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "]"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 85
    invoke-virtual {p1, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 87
    invoke-virtual {p1}, Ljava/io/PrintWriter;->flush()V

    return-void
.end method

.method public final debugNumber(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x1

    .line 55
    invoke-virtual {p0, p1, p2, v0}, Lorg/apache/sanselan/common/BinaryFileFunctions;->debugNumber(Ljava/lang/String;II)V

    return-void
.end method

.method public final debugNumber(Ljava/lang/String;II)V
    .locals 2

    .line 60
    new-instance v0, Ljava/io/PrintWriter;

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-direct {v0, v1}, Ljava/io/PrintWriter;-><init>(Ljava/io/OutputStream;)V

    .line 61
    invoke-virtual {p0, v0, p1, p2, p3}, Lorg/apache/sanselan/common/BinaryFileFunctions;->debugNumber(Ljava/io/PrintWriter;Ljava/lang/String;II)V

    .line 63
    invoke-virtual {v0}, Ljava/io/PrintWriter;->flush()V

    return-void
.end method

.method protected final debugNumberArray(Ljava/lang/String;[II)V
    .locals 3

    .line 531
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

    .line 533
    :goto_0
    array-length v1, p2

    if-ge v0, v1, :cond_0

    const/16 v1, 0x32

    if-ge v0, v1, :cond_0

    .line 535
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

    invoke-virtual {p0, v1, v2, p3}, Lorg/apache/sanselan/common/BinaryFileFunctions;->debugNumber(Ljava/lang/String;II)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final findNull([B)I
    .locals 1

    const/4 v0, 0x0

    .line 757
    invoke-virtual {p0, p1, v0}, Lorg/apache/sanselan/common/BinaryFileFunctions;->findNull([BI)I

    move-result p1

    return p1
.end method

.method public final findNull([BI)I
    .locals 1

    .line 762
    :goto_0
    array-length v0, p1

    if-ge p2, v0, :cond_1

    .line 764
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

.method protected final getByteArrayTail(Ljava/lang/String;[BI)[B
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;
        }
    .end annotation

    .line 559
    array-length v0, p2

    sub-int/2addr v0, p3

    invoke-virtual {p0, p1, p2, p3, v0}, Lorg/apache/sanselan/common/BinaryFileFunctions;->readBytearray(Ljava/lang/String;[BII)[B

    move-result-object p1

    return-object p1
.end method

.method protected final getBytearrayHead(Ljava/lang/String;[BI)[B
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;
        }
    .end annotation

    .line 564
    array-length v0, p2

    sub-int/2addr v0, p3

    const/4 p3, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, Lorg/apache/sanselan/common/BinaryFileFunctions;->readBytearray(Ljava/lang/String;[BII)[B

    move-result-object p1

    return-object p1
.end method

.method public final getDebug()Z
    .locals 1

    .line 40
    iget-boolean v0, p0, Lorg/apache/sanselan/common/BinaryFileFunctions;->debug:Z

    return v0
.end method

.method protected final getRAFBytes(Ljava/io/RandomAccessFile;JILjava/lang/String;)[B
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 774
    iget-boolean v0, p0, Lorg/apache/sanselan/common/BinaryFileFunctions;->debug:Z

    if-eqz v0, :cond_0

    .line 776
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getRAFBytes pos: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 777
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getRAFBytes length: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 780
    :cond_0
    new-array v0, p4, [B

    .line 782
    invoke-virtual {p1, p2, p3}, Ljava/io/RandomAccessFile;->seek(J)V

    const/4 p2, 0x0

    :goto_0
    if-ge p2, p4, :cond_2

    sub-int p3, p4, p2

    .line 787
    invoke-virtual {p1, v0, p2, p3}, Ljava/io/RandomAccessFile;->read([BII)I

    move-result p3

    const/4 v1, 0x1

    if-lt p3, v1, :cond_1

    add-int/2addr p2, p3

    goto :goto_0

    .line 789
    :cond_1
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, p5}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    return-object v0
.end method

.method public final getStreamBytes(Ljava/io/InputStream;)[B
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1104
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 1105
    invoke-virtual {p0, p1, v0}, Lorg/apache/sanselan/common/BinaryFileFunctions;->copyStreamToStream(Ljava/io/InputStream;Ljava/io/OutputStream;)V

    .line 1106
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p1

    return-object p1
.end method

.method protected final printByteBits(Ljava/lang/String;B)V
    .locals 2

    .line 747
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

.method protected final printCharQuad(Ljava/io/PrintWriter;Ljava/lang/String;I)V
    .locals 1

    .line 739
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ": \'"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    shr-int/lit8 p2, p3, 0x18

    and-int/lit16 p2, p2, 0xff

    int-to-char p2, p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    shr-int/lit8 p2, p3, 0x10

    and-int/lit16 p2, p2, 0xff

    int-to-char p2, p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    shr-int/lit8 p2, p3, 0x8

    and-int/lit16 p2, p2, 0xff

    int-to-char p2, p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    shr-int/lit8 p2, p3, 0x0

    and-int/lit16 p2, p2, 0xff

    int-to-char p2, p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string p2, "\'"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    return-void
.end method

.method protected final printCharQuad(Ljava/lang/String;I)V
    .locals 2

    .line 731
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

.method protected final read2Bytes(Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;I)I
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x2

    .line 714
    new-array v1, v0, [B

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    rsub-int/lit8 v3, v2, 0x2

    .line 719
    invoke-virtual {p2, v1, v2, v3}, Ljava/io/InputStream;->read([BII)I

    move-result v3

    const/4 v4, 0x1

    if-lt v3, v4, :cond_0

    add-int/2addr v2, v3

    goto :goto_0

    .line 721
    :cond_0
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, p3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 726
    :cond_1
    invoke-virtual {p0, p1, v1, p4}, Lorg/apache/sanselan/common/BinaryFileFunctions;->convertByteArrayToShort(Ljava/lang/String;[BI)I

    move-result p1

    return p1
.end method

.method protected final read3Bytes(Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;I)I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 673
    invoke-virtual {p2}, Ljava/io/InputStream;->read()I

    move-result p3

    int-to-byte p3, p3

    .line 674
    invoke-virtual {p2}, Ljava/io/InputStream;->read()I

    move-result v0

    int-to-byte v0, v0

    .line 675
    invoke-virtual {p2}, Ljava/io/InputStream;->read()I

    move-result p2

    int-to-byte p2, p2

    const/16 v1, 0x4d

    if-ne p4, v1, :cond_0

    and-int/lit16 p3, p3, 0xff

    shl-int/lit8 p3, p3, 0x10

    and-int/lit16 p4, v0, 0xff

    shl-int/lit8 p4, p4, 0x8

    or-int/2addr p3, p4

    and-int/lit16 p2, p2, 0xff

    shl-int/lit8 p2, p2, 0x0

    or-int/2addr p2, p3

    goto :goto_0

    :cond_0
    and-int/lit16 p2, p2, 0xff

    shl-int/lit8 p2, p2, 0x10

    and-int/lit16 p4, v0, 0xff

    shl-int/lit8 p4, p4, 0x8

    or-int/2addr p2, p4

    and-int/lit16 p3, p3, 0xff

    shl-int/lit8 p3, p3, 0x0

    or-int/2addr p2, p3

    .line 687
    :goto_0
    iget-boolean p3, p0, Lorg/apache/sanselan/common/BinaryFileFunctions;->debug:Z

    if-eqz p3, :cond_1

    const/4 p3, 0x3

    .line 688
    invoke-virtual {p0, p1, p2, p3}, Lorg/apache/sanselan/common/BinaryFileFunctions;->debugNumber(Ljava/lang/String;II)V

    :cond_1
    return p2
.end method

.method protected final read4Bytes(Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;I)I
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x4

    .line 654
    new-array v1, v0, [B

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    rsub-int/lit8 v3, v2, 0x4

    .line 659
    invoke-virtual {p2, v1, v2, v3}, Ljava/io/InputStream;->read([BII)I

    move-result v3

    const/4 v4, 0x1

    if-lt v3, v4, :cond_0

    add-int/2addr v2, v3

    goto :goto_0

    .line 661
    :cond_0
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, p3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 666
    :cond_1
    invoke-virtual {p0, p1, v1, p4}, Lorg/apache/sanselan/common/BinaryFileFunctions;->convertByteArrayToInt(Ljava/lang/String;[BI)I

    move-result p1

    return p1
.end method

.method public final readAndVerifyBytes(Ljava/io/InputStream;[BLjava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 123
    :goto_0
    array-length v1, p2

    if-ge v0, v1, :cond_2

    .line 125
    invoke-virtual {p1}, Ljava/io/InputStream;->read()I

    move-result v1

    and-int/lit16 v2, v1, 0xff

    int-to-byte v2, v2

    if-ltz v1, :cond_1

    .line 131
    aget-byte v1, p2, v0

    if-ne v2, v1, :cond_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 139
    :cond_0
    new-instance p1, Lorg/apache/sanselan/ImageReadException;

    invoke-direct {p1, p3}, Lorg/apache/sanselan/ImageReadException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 129
    :cond_1
    new-instance p1, Lorg/apache/sanselan/ImageReadException;

    const-string p2, "Unexpected EOF."

    invoke-direct {p1, p2}, Lorg/apache/sanselan/ImageReadException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    return-void
.end method

.method protected final readAndVerifyBytes(Ljava/lang/String;Ljava/io/InputStream;[BLjava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 148
    array-length v0, p3

    invoke-virtual {p0, p1, v0, p2, p4}, Lorg/apache/sanselan/common/BinaryFileFunctions;->readByteArray(Ljava/lang/String;ILjava/io/InputStream;Ljava/lang/String;)[B

    move-result-object p1

    const/4 p2, 0x0

    .line 150
    :goto_0
    array-length v0, p3

    if-ge p2, v0, :cond_1

    .line 152
    aget-byte v0, p1, p2

    aget-byte v1, p3, p2

    if-ne v0, v1, :cond_0

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 158
    :cond_0
    new-instance p1, Lorg/apache/sanselan/ImageReadException;

    invoke-direct {p1, p4}, Lorg/apache/sanselan/ImageReadException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    return-void
.end method

.method public final readByte(Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;)B
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 197
    invoke-virtual {p2}, Ljava/io/InputStream;->read()I

    move-result p2

    if-ltz p2, :cond_1

    .line 205
    iget-boolean p3, p0, Lorg/apache/sanselan/common/BinaryFileFunctions;->debug:Z

    if-eqz p3, :cond_0

    .line 206
    invoke-virtual {p0, p1, p2}, Lorg/apache/sanselan/common/BinaryFileFunctions;->debugNumber(Ljava/lang/String;I)V

    :cond_0
    and-int/lit16 p1, p2, 0xff

    int-to-byte p1, p1

    return p1

    .line 201
    :cond_1
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 202
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, p3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final readByteArray(Ljava/lang/String;ILjava/io/InputStream;)[B
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 489
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " could not be read."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 490
    invoke-virtual {p0, p1, p2, p3, v0}, Lorg/apache/sanselan/common/BinaryFileFunctions;->readByteArray(Ljava/lang/String;ILjava/io/InputStream;Ljava/lang/String;)[B

    move-result-object p1

    return-object p1
.end method

.method public final readByteArray(Ljava/lang/String;ILjava/io/InputStream;Ljava/lang/String;)[B
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 496
    new-array v0, p2, [B

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, p2, :cond_1

    sub-int v3, p2, v2

    .line 501
    invoke-virtual {p3, v0, v2, v3}, Ljava/io/InputStream;->read([BII)I

    move-result v3

    const/4 v4, 0x1

    if-lt v3, v4, :cond_0

    add-int/2addr v2, v3

    goto :goto_0

    .line 504
    :cond_0
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, p4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 509
    :cond_1
    iget-boolean p3, p0, Lorg/apache/sanselan/common/BinaryFileFunctions;->debug:Z

    if-eqz p3, :cond_2

    :goto_1
    if-ge v1, p2, :cond_2

    const/16 p3, 0x32

    if-ge v1, p3, :cond_2

    .line 513
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, " ("

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p4, ")"

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    aget-byte p4, v0, v1

    and-int/lit16 p4, p4, 0xff

    invoke-virtual {p0, p3, p4}, Lorg/apache/sanselan/common/BinaryFileFunctions;->debugNumber(Ljava/lang/String;I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    return-object v0
.end method

.method public final readBytearray(Ljava/lang/String;[BII)[B
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;
        }
    .end annotation

    .line 542
    array-length v0, p2

    add-int v1, p3, p4

    if-lt v0, v1, :cond_1

    .line 548
    new-array v0, p4, [B

    const/4 v1, 0x0

    .line 549
    invoke-static {p2, p3, v0, v1, p4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 551
    iget-boolean p2, p0, Lorg/apache/sanselan/common/BinaryFileFunctions;->debug:Z

    if-eqz p2, :cond_0

    .line 552
    invoke-virtual {p0, p1, v0}, Lorg/apache/sanselan/common/BinaryFileFunctions;->debugByteArray(Ljava/lang/String;[B)V

    :cond_0
    return-object v0

    .line 544
    :cond_1
    new-instance p1, Lorg/apache/sanselan/ImageReadException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid read. bytes.length: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length p2, p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ", start: "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ", count: "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lorg/apache/sanselan/ImageReadException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final readBytes(Ljava/io/InputStream;I)[B
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 111
    new-array v0, p2, [B

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p2, :cond_0

    .line 114
    invoke-virtual {p1}, Ljava/io/InputStream;->read()I

    move-result v2

    int-to-byte v2, v2

    .line 115
    aput-byte v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method protected final readRandomBytes(Ljava/io/InputStream;)V
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

    .line 49
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Random Data"

    invoke-virtual {p0, v1, p1, v2}, Lorg/apache/sanselan/common/BinaryFileFunctions;->readByte(Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;)B

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method protected final scanForByte(Ljava/io/InputStream;B)V
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

    .line 183
    invoke-virtual {p1}, Ljava/io/InputStream;->read()I

    move-result v2

    if-gez v2, :cond_0

    return-void

    :cond_0
    and-int/lit16 v2, v2, 0xff

    if-ne v2, p2, :cond_1

    .line 188
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

.method public final setDebug(Z)V
    .locals 0

    .line 35
    iput-boolean p1, p0, Lorg/apache/sanselan/common/BinaryFileFunctions;->debug:Z

    return-void
.end method

.method protected skipBytes(Ljava/io/InputStream;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "Couldn\'t skip bytes"

    .line 1088
    invoke-virtual {p0, p1, p2, v0}, Lorg/apache/sanselan/common/BinaryFileFunctions;->skipBytes(Ljava/io/InputStream;ILjava/lang/String;)V

    return-void
.end method

.method public final skipBytes(Ljava/io/InputStream;ILjava/lang/String;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-wide/16 v0, 0x0

    :goto_0
    int-to-long v2, p2

    cmp-long v4, v2, v0

    if-eqz v4, :cond_1

    sub-long/2addr v2, v0

    .line 169
    invoke-virtual {p1, v2, v3}, Ljava/io/InputStream;->skip(J)J

    move-result-wide v2

    const-wide/16 v4, 0x1

    cmp-long v4, v2, v4

    if-ltz v4, :cond_0

    add-long/2addr v0, v2

    goto :goto_0

    .line 171
    :cond_0
    new-instance p1, Ljava/io/IOException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, " ("

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p3, ")"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    return-void
.end method

.method public final startsWith([B[B)Z
    .locals 4

    const/4 v0, 0x0

    if-nez p2, :cond_0

    return v0

    :cond_0
    if-nez p1, :cond_1

    return v0

    .line 96
    :cond_1
    array-length v1, p2

    array-length v2, p1

    if-le v1, v2, :cond_2

    return v0

    :cond_2
    move v1, v0

    .line 99
    :goto_0
    array-length v2, p2

    if-ge v1, v2, :cond_4

    .line 101
    aget-byte v2, p2, v1

    aget-byte v3, p1, v1

    if-eq v2, v3, :cond_3

    return v0

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    const/4 p1, 0x1

    return p1
.end method

.method protected final writeIntInToByteArray(I[BII)V
    .locals 1

    const/16 v0, 0x4d

    if-ne p4, v0, :cond_0

    add-int/lit8 p4, p3, 0x0

    shr-int/lit8 v0, p1, 0x18

    int-to-byte v0, v0

    .line 310
    aput-byte v0, p2, p4

    add-int/lit8 p4, p3, 0x1

    shr-int/lit8 v0, p1, 0x10

    int-to-byte v0, v0

    .line 311
    aput-byte v0, p2, p4

    add-int/lit8 p4, p3, 0x2

    shr-int/lit8 v0, p1, 0x8

    int-to-byte v0, v0

    .line 312
    aput-byte v0, p2, p4

    add-int/lit8 p3, p3, 0x3

    shr-int/lit8 p1, p1, 0x0

    int-to-byte p1, p1

    .line 313
    aput-byte p1, p2, p3

    goto :goto_0

    :cond_0
    add-int/lit8 p4, p3, 0x3

    shr-int/lit8 v0, p1, 0x18

    int-to-byte v0, v0

    .line 316
    aput-byte v0, p2, p4

    add-int/lit8 p4, p3, 0x2

    shr-int/lit8 v0, p1, 0x10

    int-to-byte v0, v0

    .line 317
    aput-byte v0, p2, p4

    add-int/lit8 p4, p3, 0x1

    shr-int/lit8 v0, p1, 0x8

    int-to-byte v0, v0

    .line 318
    aput-byte v0, p2, p4

    add-int/lit8 p3, p3, 0x0

    shr-int/lit8 p1, p1, 0x0

    int-to-byte p1, p1

    .line 319
    aput-byte p1, p2, p3

    :goto_0
    return-void
.end method
