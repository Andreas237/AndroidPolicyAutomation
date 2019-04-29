.class final Lcom/google/protobuf/Utf8$UnsafeProcessor;
.super Lcom/google/protobuf/Utf8$Processor;
.source "Utf8.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/Utf8;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "UnsafeProcessor"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 990
    invoke-direct {p0}, Lcom/google/protobuf/Utf8$Processor;-><init>()V

    return-void
.end method

.method static isAvailable()Z
    .locals 1

    .line 995
    invoke-static {}, Lcom/google/protobuf/UnsafeUtil;->hasUnsafeArrayOperations()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/protobuf/UnsafeUtil;->hasUnsafeByteBufferOperations()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private static partialIsValidUtf8(JI)I
    .locals 8

    .line 1459
    invoke-static {p0, p1, p2}, Lcom/google/protobuf/Utf8$UnsafeProcessor;->unsafeEstimateConsecutiveAscii(JI)I

    move-result v0

    int-to-long v1, v0

    add-long v3, p0, v1

    sub-int/2addr p2, v0

    :cond_0
    :goto_0
    const/4 p0, 0x0

    move p1, p0

    :goto_1
    const-wide/16 v0, 0x1

    if-lez p2, :cond_2

    add-long v5, v3, v0

    .line 1468
    invoke-static {v3, v4}, Lcom/google/protobuf/UnsafeUtil;->getByte(J)B

    move-result p1

    if-ltz p1, :cond_1

    add-int/lit8 p2, p2, -0x1

    move-wide v3, v5

    goto :goto_1

    :cond_1
    move-wide v3, v5

    :cond_2
    if-nez p2, :cond_3

    return p0

    :cond_3
    add-int/lit8 p2, p2, -0x1

    const/16 p0, -0x20

    const/16 v2, -0x41

    const/4 v5, -0x1

    if-ge p1, p0, :cond_7

    if-nez p2, :cond_4

    return p1

    :cond_4
    add-int/lit8 p2, p2, -0x1

    const/16 p0, -0x3e

    if-lt p1, p0, :cond_6

    add-long p0, v3, v0

    .line 1486
    invoke-static {v3, v4}, Lcom/google/protobuf/UnsafeUtil;->getByte(J)B

    move-result v0

    if-le v0, v2, :cond_5

    goto :goto_2

    :cond_5
    move-wide v3, p0

    goto :goto_0

    :cond_6
    :goto_2
    return v5

    :cond_7
    const/16 v6, -0x10

    if-ge p1, v6, :cond_c

    const/4 v6, 0x2

    if-ge p2, v6, :cond_8

    .line 1494
    invoke-static {v3, v4, p1, p2}, Lcom/google/protobuf/Utf8$UnsafeProcessor;->unsafeIncompleteStateFor(JII)I

    move-result p0

    return p0

    :cond_8
    add-int/lit8 p2, p2, -0x2

    add-long v6, v3, v0

    .line 1498
    invoke-static {v3, v4}, Lcom/google/protobuf/UnsafeUtil;->getByte(J)B

    move-result v3

    if-gt v3, v2, :cond_b

    const/16 v4, -0x60

    if-ne p1, p0, :cond_9

    if-lt v3, v4, :cond_b

    :cond_9
    const/16 p0, -0x13

    if-ne p1, p0, :cond_a

    if-ge v3, v4, :cond_b

    :cond_a
    add-long p0, v6, v0

    .line 1505
    invoke-static {v6, v7}, Lcom/google/protobuf/UnsafeUtil;->getByte(J)B

    move-result v0

    if-le v0, v2, :cond_5

    :cond_b
    return v5

    :cond_c
    const/4 p0, 0x3

    if-ge p2, p0, :cond_d

    .line 1513
    invoke-static {v3, v4, p1, p2}, Lcom/google/protobuf/Utf8$UnsafeProcessor;->unsafeIncompleteStateFor(JII)I

    move-result p0

    return p0

    :cond_d
    add-int/lit8 p2, p2, -0x3

    add-long v6, v3, v0

    .line 1517
    invoke-static {v3, v4}, Lcom/google/protobuf/UnsafeUtil;->getByte(J)B

    move-result p0

    if-gt p0, v2, :cond_e

    shl-int/lit8 p1, p1, 0x1c

    add-int/lit8 p0, p0, 0x70

    add-int/2addr p1, p0

    shr-int/lit8 p0, p1, 0x1e

    if-nez p0, :cond_e

    add-long p0, v6, v0

    .line 1525
    invoke-static {v6, v7}, Lcom/google/protobuf/UnsafeUtil;->getByte(J)B

    move-result v3

    if-gt v3, v2, :cond_e

    add-long v3, p0, v0

    .line 1527
    invoke-static {p0, p1}, Lcom/google/protobuf/UnsafeUtil;->getByte(J)B

    move-result p0

    if-le p0, v2, :cond_0

    :cond_e
    return v5
.end method

.method private static partialIsValidUtf8([BJI)I
    .locals 8

    .line 1383
    invoke-static {p0, p1, p2, p3}, Lcom/google/protobuf/Utf8$UnsafeProcessor;->unsafeEstimateConsecutiveAscii([BJI)I

    move-result v0

    sub-int/2addr p3, v0

    int-to-long v0, v0

    add-long v2, p1, v0

    :cond_0
    :goto_0
    const/4 p1, 0x0

    move p2, p1

    :goto_1
    const-wide/16 v0, 0x1

    if-lez p3, :cond_2

    add-long v4, v2, v0

    .line 1392
    invoke-static {p0, v2, v3}, Lcom/google/protobuf/UnsafeUtil;->getByte([BJ)B

    move-result p2

    if-ltz p2, :cond_1

    add-int/lit8 p3, p3, -0x1

    move-wide v2, v4

    goto :goto_1

    :cond_1
    move-wide v2, v4

    :cond_2
    if-nez p3, :cond_3

    return p1

    :cond_3
    add-int/lit8 p3, p3, -0x1

    const/16 p1, -0x20

    const/16 v4, -0x41

    const/4 v5, -0x1

    if-ge p2, p1, :cond_7

    if-nez p3, :cond_4

    return p2

    :cond_4
    add-int/lit8 p3, p3, -0x1

    const/16 p1, -0x3e

    if-lt p2, p1, :cond_6

    add-long p1, v2, v0

    .line 1411
    invoke-static {p0, v2, v3}, Lcom/google/protobuf/UnsafeUtil;->getByte([BJ)B

    move-result v0

    if-le v0, v4, :cond_5

    goto :goto_2

    :cond_5
    move-wide v2, p1

    goto :goto_0

    :cond_6
    :goto_2
    return v5

    :cond_7
    const/16 v6, -0x10

    if-ge p2, v6, :cond_c

    const/4 v6, 0x2

    if-ge p3, v6, :cond_8

    .line 1418
    invoke-static {p0, p2, v2, v3, p3}, Lcom/google/protobuf/Utf8$UnsafeProcessor;->unsafeIncompleteStateFor([BIJI)I

    move-result p0

    return p0

    :cond_8
    add-int/lit8 p3, p3, -0x2

    add-long v6, v2, v0

    .line 1423
    invoke-static {p0, v2, v3}, Lcom/google/protobuf/UnsafeUtil;->getByte([BJ)B

    move-result v2

    if-gt v2, v4, :cond_b

    const/16 v3, -0x60

    if-ne p2, p1, :cond_9

    if-lt v2, v3, :cond_b

    :cond_9
    const/16 p1, -0x13

    if-ne p2, p1, :cond_a

    if-ge v2, v3, :cond_b

    :cond_a
    add-long p1, v6, v0

    .line 1429
    invoke-static {p0, v6, v7}, Lcom/google/protobuf/UnsafeUtil;->getByte([BJ)B

    move-result v0

    if-le v0, v4, :cond_5

    :cond_b
    return v5

    :cond_c
    const/4 p1, 0x3

    if-ge p3, p1, :cond_d

    .line 1436
    invoke-static {p0, p2, v2, v3, p3}, Lcom/google/protobuf/Utf8$UnsafeProcessor;->unsafeIncompleteStateFor([BIJI)I

    move-result p0

    return p0

    :cond_d
    add-int/lit8 p3, p3, -0x3

    add-long v6, v2, v0

    .line 1441
    invoke-static {p0, v2, v3}, Lcom/google/protobuf/UnsafeUtil;->getByte([BJ)B

    move-result p1

    if-gt p1, v4, :cond_e

    shl-int/lit8 p2, p2, 0x1c

    add-int/lit8 p1, p1, 0x70

    add-int/2addr p2, p1

    shr-int/lit8 p1, p2, 0x1e

    if-nez p1, :cond_e

    add-long p1, v6, v0

    .line 1448
    invoke-static {p0, v6, v7}, Lcom/google/protobuf/UnsafeUtil;->getByte([BJ)B

    move-result v2

    if-gt v2, v4, :cond_e

    add-long v2, p1, v0

    .line 1450
    invoke-static {p0, p1, p2}, Lcom/google/protobuf/UnsafeUtil;->getByte([BJ)B

    move-result p1

    if-le p1, v4, :cond_0

    :cond_e
    return v5
.end method

.method private static unsafeEstimateConsecutiveAscii(JI)I
    .locals 9

    const/16 v0, 0x10

    if-ge p2, v0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    long-to-int v0, p0

    and-int/lit8 v0, v0, 0x7

    move-wide v1, p0

    move p0, v0

    :goto_0
    if-lez p0, :cond_2

    const-wide/16 v3, 0x1

    add-long v5, v1, v3

    .line 1367
    invoke-static {v1, v2}, Lcom/google/protobuf/UnsafeUtil;->getByte(J)B

    move-result p1

    if-gez p1, :cond_1

    sub-int/2addr v0, p0

    return v0

    :cond_1
    add-int/lit8 p0, p0, -0x1

    move-wide v1, v5

    goto :goto_0

    :cond_2
    sub-int p0, p2, v0

    :goto_1
    const/16 p1, 0x8

    if-lt p0, p1, :cond_3

    .line 1376
    invoke-static {v1, v2}, Lcom/google/protobuf/UnsafeUtil;->getLong(J)J

    move-result-wide v3

    const-wide v5, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v7, v3, v5

    const-wide/16 v3, 0x0

    cmp-long p1, v7, v3

    if-nez p1, :cond_3

    const-wide/16 v3, 0x8

    add-long v5, v1, v3

    add-int/lit8 p0, p0, -0x8

    move-wide v1, v5

    goto :goto_1

    :cond_3
    sub-int/2addr p2, p0

    return p2
.end method

.method private static unsafeEstimateConsecutiveAscii([BJI)I
    .locals 9

    const/16 v0, 0x10

    if-ge p3, v0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    long-to-int v0, p1

    and-int/lit8 v0, v0, 0x7

    move-wide v1, p1

    move p1, v0

    :goto_0
    if-lez p1, :cond_2

    const-wide/16 v3, 0x1

    add-long v5, v1, v3

    .line 1337
    invoke-static {p0, v1, v2}, Lcom/google/protobuf/UnsafeUtil;->getByte([BJ)B

    move-result p2

    if-gez p2, :cond_1

    sub-int/2addr v0, p1

    return v0

    :cond_1
    add-int/lit8 p1, p1, -0x1

    move-wide v1, v5

    goto :goto_0

    :cond_2
    sub-int p1, p3, v0

    :goto_1
    const/16 p2, 0x8

    if-lt p1, p2, :cond_3

    .line 1346
    invoke-static {p0, v1, v2}, Lcom/google/protobuf/UnsafeUtil;->getLong([BJ)J

    move-result-wide v3

    const-wide v5, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v7, v3, v5

    const-wide/16 v3, 0x0

    cmp-long p2, v7, v3

    if-nez p2, :cond_3

    const-wide/16 v3, 0x8

    add-long v5, v1, v3

    add-int/lit8 p1, p1, -0x8

    move-wide v1, v5

    goto :goto_1

    :cond_3
    sub-int/2addr p3, p1

    return p3
.end method

.method private static unsafeIncompleteStateFor(JII)I
    .locals 4

    packed-switch p3, :pswitch_data_0

    .line 1566
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0

    .line 1562
    :pswitch_0
    invoke-static {p0, p1}, Lcom/google/protobuf/UnsafeUtil;->getByte(J)B

    move-result p3

    const-wide/16 v0, 0x1

    add-long v2, p0, v0

    .line 1563
    invoke-static {v2, v3}, Lcom/google/protobuf/UnsafeUtil;->getByte(J)B

    move-result p0

    .line 1562
    invoke-static {p2, p3, p0}, Lcom/google/protobuf/Utf8;->access$100(III)I

    move-result p0

    return p0

    .line 1559
    :pswitch_1
    invoke-static {p0, p1}, Lcom/google/protobuf/UnsafeUtil;->getByte(J)B

    move-result p0

    invoke-static {p2, p0}, Lcom/google/protobuf/Utf8;->access$000(II)I

    move-result p0

    return p0

    .line 1556
    :pswitch_2
    invoke-static {p2}, Lcom/google/protobuf/Utf8;->access$500(I)I

    move-result p0

    return p0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static unsafeIncompleteStateFor([BIJI)I
    .locals 4

    packed-switch p4, :pswitch_data_0

    .line 1548
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0

    .line 1544
    :pswitch_0
    invoke-static {p0, p2, p3}, Lcom/google/protobuf/UnsafeUtil;->getByte([BJ)B

    move-result p4

    const-wide/16 v0, 0x1

    add-long v2, p2, v0

    .line 1545
    invoke-static {p0, v2, v3}, Lcom/google/protobuf/UnsafeUtil;->getByte([BJ)B

    move-result p0

    .line 1544
    invoke-static {p1, p4, p0}, Lcom/google/protobuf/Utf8;->access$100(III)I

    move-result p0

    return p0

    .line 1541
    :pswitch_1
    invoke-static {p0, p2, p3}, Lcom/google/protobuf/UnsafeUtil;->getByte([BJ)B

    move-result p0

    invoke-static {p1, p0}, Lcom/google/protobuf/Utf8;->access$000(II)I

    move-result p0

    return p0

    .line 1538
    :pswitch_2
    invoke-static {p1}, Lcom/google/protobuf/Utf8;->access$500(I)I

    move-result p0

    return p0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method encodeUtf8(Ljava/lang/CharSequence;[BII)I
    .locals 19

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move/from16 v2, p3

    move/from16 v3, p4

    .line 1190
    invoke-static {}, Lcom/google/protobuf/UnsafeUtil;->getArrayBaseOffset()J

    move-result-wide v4

    int-to-long v6, v2

    add-long v8, v4, v6

    int-to-long v4, v3

    add-long v6, v8, v4

    .line 1192
    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-gt v4, v3, :cond_d

    .line 1193
    array-length v5, v1

    sub-int/2addr v5, v3

    if-ge v5, v2, :cond_0

    goto/16 :goto_4

    :cond_0
    const/4 v2, 0x0

    :goto_0
    const/16 v3, 0x80

    const-wide/16 v10, 0x1

    if-ge v2, v4, :cond_1

    .line 1202
    invoke-interface {v0, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    if-ge v5, v3, :cond_1

    add-long v12, v8, v10

    int-to-byte v3, v5

    .line 1203
    invoke-static {v1, v8, v9, v3}, Lcom/google/protobuf/UnsafeUtil;->putByte([BJB)V

    add-int/lit8 v2, v2, 0x1

    move-wide v8, v12

    goto :goto_0

    :cond_1
    if-ne v2, v4, :cond_2

    .line 1207
    invoke-static {}, Lcom/google/protobuf/UnsafeUtil;->getArrayBaseOffset()J

    move-result-wide v0

    sub-long v2, v8, v0

    long-to-int v0, v2

    return v0

    :cond_2
    :goto_1
    if-ge v2, v4, :cond_c

    .line 1211
    invoke-interface {v0, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    if-ge v5, v3, :cond_3

    cmp-long v12, v8, v6

    if-gez v12, :cond_3

    add-long v12, v8, v10

    int-to-byte v5, v5

    .line 1213
    invoke-static {v1, v8, v9, v5}, Lcom/google/protobuf/UnsafeUtil;->putByte([BJB)V

    move-wide v8, v12

    goto/16 :goto_2

    :cond_3
    const/16 v12, 0x800

    const/16 v13, 0x3f

    if-ge v5, v12, :cond_4

    const-wide/16 v14, 0x2

    sub-long v16, v6, v14

    cmp-long v12, v8, v16

    if-gtz v12, :cond_4

    add-long v14, v8, v10

    const/16 v12, 0x3c0

    ushr-int/lit8 v16, v5, 0x6

    or-int v12, v12, v16

    int-to-byte v12, v12

    .line 1215
    invoke-static {v1, v8, v9, v12}, Lcom/google/protobuf/UnsafeUtil;->putByte([BJB)V

    add-long v8, v14, v10

    and-int/2addr v5, v13

    or-int/2addr v5, v3

    int-to-byte v5, v5

    .line 1216
    invoke-static {v1, v14, v15, v5}, Lcom/google/protobuf/UnsafeUtil;->putByte([BJB)V

    goto/16 :goto_2

    :cond_4
    const v12, 0xdfff

    const v14, 0xd800

    if-lt v5, v14, :cond_5

    if-ge v12, v5, :cond_6

    :cond_5
    const-wide/16 v15, 0x3

    sub-long v17, v6, v15

    cmp-long v15, v8, v17

    if-gtz v15, :cond_6

    add-long v14, v8, v10

    const/16 v12, 0x1e0

    ushr-int/lit8 v16, v5, 0xc

    or-int v12, v12, v16

    int-to-byte v12, v12

    .line 1219
    invoke-static {v1, v8, v9, v12}, Lcom/google/protobuf/UnsafeUtil;->putByte([BJB)V

    add-long v8, v14, v10

    ushr-int/lit8 v12, v5, 0x6

    and-int/2addr v12, v13

    or-int/2addr v12, v3

    int-to-byte v12, v12

    .line 1220
    invoke-static {v1, v14, v15, v12}, Lcom/google/protobuf/UnsafeUtil;->putByte([BJB)V

    add-long v14, v8, v10

    and-int/2addr v5, v13

    or-int/2addr v5, v3

    int-to-byte v5, v5

    .line 1221
    invoke-static {v1, v8, v9, v5}, Lcom/google/protobuf/UnsafeUtil;->putByte([BJB)V

    move-wide v8, v14

    goto :goto_2

    :cond_6
    const-wide/16 v15, 0x4

    sub-long v17, v6, v15

    cmp-long v15, v8, v17

    if-gtz v15, :cond_9

    add-int/lit8 v12, v2, 0x1

    if-eq v12, v4, :cond_8

    .line 1226
    invoke-interface {v0, v12}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    invoke-static {v5, v2}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    move-result v14

    if-nez v14, :cond_7

    goto :goto_3

    .line 1229
    :cond_7
    invoke-static {v5, v2}, Ljava/lang/Character;->toCodePoint(CC)I

    move-result v2

    add-long v14, v8, v10

    const/16 v5, 0xf0

    ushr-int/lit8 v16, v2, 0x12

    or-int v5, v5, v16

    int-to-byte v5, v5

    .line 1230
    invoke-static {v1, v8, v9, v5}, Lcom/google/protobuf/UnsafeUtil;->putByte([BJB)V

    add-long v8, v14, v10

    ushr-int/lit8 v5, v2, 0xc

    and-int/2addr v5, v13

    or-int/2addr v5, v3

    int-to-byte v5, v5

    .line 1231
    invoke-static {v1, v14, v15, v5}, Lcom/google/protobuf/UnsafeUtil;->putByte([BJB)V

    add-long v14, v8, v10

    ushr-int/lit8 v5, v2, 0x6

    and-int/2addr v5, v13

    or-int/2addr v5, v3

    int-to-byte v5, v5

    .line 1232
    invoke-static {v1, v8, v9, v5}, Lcom/google/protobuf/UnsafeUtil;->putByte([BJB)V

    add-long v8, v14, v10

    and-int/2addr v2, v13

    or-int/2addr v2, v3

    int-to-byte v2, v2

    .line 1233
    invoke-static {v1, v14, v15, v2}, Lcom/google/protobuf/UnsafeUtil;->putByte([BJB)V

    move v2, v12

    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_1

    :cond_8
    move v12, v2

    .line 1227
    :goto_3
    new-instance v0, Lcom/google/protobuf/Utf8$UnpairedSurrogateException;

    add-int/lit8 v12, v12, -0x1

    invoke-direct {v0, v12, v4}, Lcom/google/protobuf/Utf8$UnpairedSurrogateException;-><init>(II)V

    throw v0

    :cond_9
    if-gt v14, v5, :cond_b

    if-gt v5, v12, :cond_b

    add-int/lit8 v1, v2, 0x1

    if-eq v1, v4, :cond_a

    .line 1236
    invoke-interface {v0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    invoke-static {v5, v0}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    move-result v0

    if-nez v0, :cond_b

    .line 1238
    :cond_a
    new-instance v0, Lcom/google/protobuf/Utf8$UnpairedSurrogateException;

    invoke-direct {v0, v2, v4}, Lcom/google/protobuf/Utf8$UnpairedSurrogateException;-><init>(II)V

    throw v0

    .line 1241
    :cond_b
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed writing "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, " at index "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1246
    :cond_c
    invoke-static {}, Lcom/google/protobuf/UnsafeUtil;->getArrayBaseOffset()J

    move-result-wide v0

    sub-long v2, v8, v0

    long-to-int v0, v2

    return v0

    .line 1195
    :cond_d
    :goto_4
    new-instance v1, Ljava/lang/ArrayIndexOutOfBoundsException;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Failed writing "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v4, v4, -0x1

    .line 1196
    invoke-interface {v0, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v0, " at index "

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int v0, v2, v3

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method encodeUtf8Direct(Ljava/lang/CharSequence;Ljava/nio/ByteBuffer;)V
    .locals 22

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    .line 1251
    invoke-static/range {p2 .. p2}, Lcom/google/protobuf/UnsafeUtil;->addressOffset(Ljava/nio/ByteBuffer;)J

    move-result-wide v2

    .line 1252
    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->position()I

    move-result v4

    int-to-long v4, v4

    add-long v6, v2, v4

    .line 1253
    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->limit()I

    move-result v4

    int-to-long v4, v4

    add-long v8, v2, v4

    .line 1254
    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->length()I

    move-result v4

    int-to-long v10, v4

    sub-long v12, v8, v6

    cmp-long v5, v10, v12

    if-lez v5, :cond_0

    .line 1257
    new-instance v2, Ljava/lang/ArrayIndexOutOfBoundsException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Failed writing "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v4, v4, -0x1

    .line 1258
    invoke-interface {v0, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v0, " at index "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->limit()I

    move-result v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_0
    const/4 v5, 0x0

    :goto_0
    const/16 v10, 0x80

    const-wide/16 v11, 0x1

    if-ge v5, v4, :cond_1

    .line 1264
    invoke-interface {v0, v5}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v13

    if-ge v13, v10, :cond_1

    add-long v14, v6, v11

    int-to-byte v10, v13

    .line 1265
    invoke-static {v6, v7, v10}, Lcom/google/protobuf/UnsafeUtil;->putByte(JB)V

    add-int/lit8 v5, v5, 0x1

    move-wide v6, v14

    goto :goto_0

    :cond_1
    if-ne v5, v4, :cond_2

    sub-long v4, v6, v2

    long-to-int v0, v4

    .line 1269
    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    return-void

    :cond_2
    :goto_1
    if-ge v5, v4, :cond_c

    .line 1274
    invoke-interface {v0, v5}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v13

    if-ge v13, v10, :cond_3

    cmp-long v14, v6, v8

    if-gez v14, :cond_3

    add-long v14, v6, v11

    int-to-byte v13, v13

    .line 1276
    invoke-static {v6, v7, v13}, Lcom/google/protobuf/UnsafeUtil;->putByte(JB)V

    move-wide/from16 v20, v2

    move-wide v6, v14

    goto/16 :goto_2

    :cond_3
    const/16 v14, 0x800

    const/16 v15, 0x3f

    if-ge v13, v14, :cond_4

    const-wide/16 v16, 0x2

    sub-long v18, v8, v16

    cmp-long v14, v6, v18

    if-gtz v14, :cond_4

    move-wide/from16 v20, v2

    add-long v1, v6, v11

    const/16 v3, 0x3c0

    ushr-int/lit8 v14, v13, 0x6

    or-int/2addr v3, v14

    int-to-byte v3, v3

    .line 1278
    invoke-static {v6, v7, v3}, Lcom/google/protobuf/UnsafeUtil;->putByte(JB)V

    add-long v6, v1, v11

    and-int v3, v15, v13

    or-int/2addr v3, v10

    int-to-byte v3, v3

    .line 1279
    invoke-static {v1, v2, v3}, Lcom/google/protobuf/UnsafeUtil;->putByte(JB)V

    goto/16 :goto_2

    :cond_4
    move-wide/from16 v20, v2

    const v1, 0xdfff

    const v2, 0xd800

    if-lt v13, v2, :cond_5

    if-ge v1, v13, :cond_6

    :cond_5
    const-wide/16 v16, 0x3

    sub-long v18, v8, v16

    cmp-long v3, v6, v18

    if-gtz v3, :cond_6

    add-long v1, v6, v11

    const/16 v3, 0x1e0

    ushr-int/lit8 v14, v13, 0xc

    or-int/2addr v3, v14

    int-to-byte v3, v3

    .line 1282
    invoke-static {v6, v7, v3}, Lcom/google/protobuf/UnsafeUtil;->putByte(JB)V

    add-long v6, v1, v11

    ushr-int/lit8 v3, v13, 0x6

    and-int/2addr v3, v15

    or-int/2addr v3, v10

    int-to-byte v3, v3

    .line 1283
    invoke-static {v1, v2, v3}, Lcom/google/protobuf/UnsafeUtil;->putByte(JB)V

    add-long v1, v6, v11

    and-int v3, v15, v13

    or-int/2addr v3, v10

    int-to-byte v3, v3

    .line 1284
    invoke-static {v6, v7, v3}, Lcom/google/protobuf/UnsafeUtil;->putByte(JB)V

    move-wide v6, v1

    goto :goto_2

    :cond_6
    const-wide/16 v16, 0x4

    sub-long v18, v8, v16

    cmp-long v3, v6, v18

    if-gtz v3, :cond_9

    add-int/lit8 v1, v5, 0x1

    if-eq v1, v4, :cond_8

    .line 1289
    invoke-interface {v0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    invoke-static {v13, v2}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    move-result v3

    if-nez v3, :cond_7

    goto :goto_3

    .line 1292
    :cond_7
    invoke-static {v13, v2}, Ljava/lang/Character;->toCodePoint(CC)I

    move-result v2

    add-long v13, v6, v11

    const/16 v3, 0xf0

    ushr-int/lit8 v5, v2, 0x12

    or-int/2addr v3, v5

    int-to-byte v3, v3

    .line 1293
    invoke-static {v6, v7, v3}, Lcom/google/protobuf/UnsafeUtil;->putByte(JB)V

    add-long v5, v13, v11

    ushr-int/lit8 v3, v2, 0xc

    and-int/2addr v3, v15

    or-int/2addr v3, v10

    int-to-byte v3, v3

    .line 1294
    invoke-static {v13, v14, v3}, Lcom/google/protobuf/UnsafeUtil;->putByte(JB)V

    add-long v13, v5, v11

    ushr-int/lit8 v3, v2, 0x6

    and-int/2addr v3, v15

    or-int/2addr v3, v10

    int-to-byte v3, v3

    .line 1295
    invoke-static {v5, v6, v3}, Lcom/google/protobuf/UnsafeUtil;->putByte(JB)V

    add-long v5, v13, v11

    and-int/2addr v2, v15

    or-int/2addr v2, v10

    int-to-byte v2, v2

    .line 1296
    invoke-static {v13, v14, v2}, Lcom/google/protobuf/UnsafeUtil;->putByte(JB)V

    move-wide v6, v5

    move v5, v1

    :goto_2
    add-int/lit8 v5, v5, 0x1

    move-wide/from16 v2, v20

    move-object/from16 v1, p2

    goto/16 :goto_1

    :cond_8
    move v1, v5

    .line 1290
    :goto_3
    new-instance v0, Lcom/google/protobuf/Utf8$UnpairedSurrogateException;

    add-int/lit8 v1, v1, -0x1

    invoke-direct {v0, v1, v4}, Lcom/google/protobuf/Utf8$UnpairedSurrogateException;-><init>(II)V

    throw v0

    :cond_9
    if-gt v2, v13, :cond_b

    if-gt v13, v1, :cond_b

    add-int/lit8 v1, v5, 0x1

    if-eq v1, v4, :cond_a

    .line 1299
    invoke-interface {v0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    invoke-static {v13, v0}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    move-result v0

    if-nez v0, :cond_b

    .line 1301
    :cond_a
    new-instance v0, Lcom/google/protobuf/Utf8$UnpairedSurrogateException;

    invoke-direct {v0, v5, v4}, Lcom/google/protobuf/Utf8$UnpairedSurrogateException;-><init>(II)V

    throw v0

    .line 1304
    :cond_b
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed writing "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, " at index "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c
    move-wide/from16 v20, v2

    sub-long v0, v6, v20

    long-to-int v0, v0

    move-object/from16 v1, p2

    .line 1309
    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    return-void
.end method

.method partialIsValidUtf8(I[BII)I
    .locals 16

    move/from16 v0, p1

    move-object/from16 v1, p2

    move/from16 v2, p3

    move/from16 v3, p4

    or-int v4, v2, v3

    const/4 v5, 0x0

    .line 1000
    array-length v6, v1

    sub-int/2addr v6, v3

    or-int/2addr v4, v6

    if-gez v4, :cond_0

    .line 1001
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    const-string v4, "Array length=%d, index=%d, limit=%d"

    const/4 v6, 0x3

    new-array v6, v6, [Ljava/lang/Object;

    array-length v1, v1

    .line 1002
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v6, v5

    const/4 v1, 0x1

    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v6, v1

    const/4 v1, 0x2

    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v6, v1

    invoke-static {v4, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1004
    :cond_0
    invoke-static {}, Lcom/google/protobuf/UnsafeUtil;->getArrayBaseOffset()J

    move-result-wide v6

    int-to-long v8, v2

    add-long v10, v6, v8

    .line 1005
    invoke-static {}, Lcom/google/protobuf/UnsafeUtil;->getArrayBaseOffset()J

    move-result-wide v6

    int-to-long v2, v3

    add-long v8, v6, v2

    if-eqz v0, :cond_f

    cmp-long v2, v10, v8

    if-ltz v2, :cond_1

    return v0

    :cond_1
    int-to-byte v2, v0

    const/16 v3, -0x20

    const/4 v4, -0x1

    const/16 v6, -0x41

    const-wide/16 v12, 0x1

    if-ge v2, v3, :cond_3

    const/16 v0, -0x3e

    if-lt v2, v0, :cond_2

    add-long v2, v10, v12

    .line 1026
    invoke-static {v1, v10, v11}, Lcom/google/protobuf/UnsafeUtil;->getByte([BJ)B

    move-result v0

    if-le v0, v6, :cond_10

    :cond_2
    return v4

    :cond_3
    const/16 v7, -0x10

    if-ge v2, v7, :cond_9

    shr-int/lit8 v0, v0, 0x8

    xor-int/2addr v0, v4

    int-to-byte v0, v0

    if-nez v0, :cond_5

    add-long v14, v10, v12

    .line 1035
    invoke-static {v1, v10, v11}, Lcom/google/protobuf/UnsafeUtil;->getByte([BJ)B

    move-result v0

    cmp-long v5, v14, v8

    if-ltz v5, :cond_4

    .line 1037
    invoke-static {v2, v0}, Lcom/google/protobuf/Utf8;->access$000(II)I

    move-result v0

    return v0

    :cond_4
    move-wide v10, v14

    :cond_5
    if-gt v0, v6, :cond_8

    const/16 v5, -0x60

    if-ne v2, v3, :cond_6

    if-lt v0, v5, :cond_8

    :cond_6
    const/16 v3, -0x13

    if-ne v2, v3, :cond_7

    if-ge v0, v5, :cond_8

    :cond_7
    add-long v2, v10, v12

    .line 1046
    invoke-static {v1, v10, v11}, Lcom/google/protobuf/UnsafeUtil;->getByte([BJ)B

    move-result v0

    if-le v0, v6, :cond_10

    :cond_8
    return v4

    :cond_9
    shr-int/lit8 v3, v0, 0x8

    xor-int/2addr v3, v4

    int-to-byte v3, v3

    if-nez v3, :cond_b

    add-long v14, v10, v12

    .line 1056
    invoke-static {v1, v10, v11}, Lcom/google/protobuf/UnsafeUtil;->getByte([BJ)B

    move-result v3

    cmp-long v0, v14, v8

    if-ltz v0, :cond_a

    .line 1058
    invoke-static {v2, v3}, Lcom/google/protobuf/Utf8;->access$000(II)I

    move-result v0

    return v0

    :cond_a
    move-wide v10, v14

    goto :goto_0

    :cond_b
    shr-int/lit8 v0, v0, 0x10

    int-to-byte v5, v0

    :goto_0
    if-nez v5, :cond_d

    add-long v14, v10, v12

    .line 1064
    invoke-static {v1, v10, v11}, Lcom/google/protobuf/UnsafeUtil;->getByte([BJ)B

    move-result v5

    cmp-long v0, v14, v8

    if-ltz v0, :cond_c

    .line 1066
    invoke-static {v2, v3, v5}, Lcom/google/protobuf/Utf8;->access$100(III)I

    move-result v0

    return v0

    :cond_c
    move-wide v10, v14

    :cond_d
    if-gt v3, v6, :cond_e

    shl-int/lit8 v0, v2, 0x1c

    add-int/lit8 v3, v3, 0x70

    add-int/2addr v0, v3

    shr-int/lit8 v0, v0, 0x1e

    if-nez v0, :cond_e

    if-gt v5, v6, :cond_e

    add-long v2, v10, v12

    .line 1083
    invoke-static {v1, v10, v11}, Lcom/google/protobuf/UnsafeUtil;->getByte([BJ)B

    move-result v0

    if-le v0, v6, :cond_10

    :cond_e
    return v4

    :cond_f
    move-wide v2, v10

    :cond_10
    sub-long v4, v8, v2

    long-to-int v0, v4

    .line 1089
    invoke-static {v1, v2, v3, v0}, Lcom/google/protobuf/Utf8$UnsafeProcessor;->partialIsValidUtf8([BJI)I

    move-result v0

    return v0
.end method

.method partialIsValidUtf8Direct(ILjava/nio/ByteBuffer;II)I
    .locals 10

    or-int v0, p3, p4

    .line 1095
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->limit()I

    move-result v1

    sub-int/2addr v1, p4

    or-int/2addr v0, v1

    const/4 v1, 0x0

    if-gez v0, :cond_0

    .line 1096
    new-instance p1, Ljava/lang/ArrayIndexOutOfBoundsException;

    const-string v0, "buffer limit=%d, index=%d, limit=%d"

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    .line 1097
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->limit()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, v2, v1

    const/4 p2, 0x1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    aput-object p3, v2, p2

    const/4 p2, 0x2

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    aput-object p3, v2, p2

    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 1099
    :cond_0
    invoke-static {p2}, Lcom/google/protobuf/UnsafeUtil;->addressOffset(Ljava/nio/ByteBuffer;)J

    move-result-wide v2

    int-to-long v4, p3

    add-long v6, v2, v4

    sub-int/2addr p4, p3

    int-to-long p2, p4

    add-long v2, v6, p2

    if-eqz p1, :cond_f

    cmp-long p2, v6, v2

    if-ltz p2, :cond_1

    return p1

    :cond_1
    int-to-byte p2, p1

    const/16 p3, -0x20

    const/4 p4, -0x1

    const/16 v0, -0x41

    const-wide/16 v4, 0x1

    if-ge p2, p3, :cond_3

    const/16 p1, -0x3e

    if-lt p2, p1, :cond_2

    add-long p1, v6, v4

    .line 1122
    invoke-static {v6, v7}, Lcom/google/protobuf/UnsafeUtil;->getByte(J)B

    move-result p3

    if-le p3, v0, :cond_10

    :cond_2
    return p4

    :cond_3
    const/16 v8, -0x10

    if-ge p2, v8, :cond_9

    shr-int/lit8 p1, p1, 0x8

    xor-int/2addr p1, p4

    int-to-byte p1, p1

    if-nez p1, :cond_5

    add-long v8, v6, v4

    .line 1131
    invoke-static {v6, v7}, Lcom/google/protobuf/UnsafeUtil;->getByte(J)B

    move-result p1

    cmp-long v1, v8, v2

    if-ltz v1, :cond_4

    .line 1133
    invoke-static {p2, p1}, Lcom/google/protobuf/Utf8;->access$000(II)I

    move-result p1

    return p1

    :cond_4
    move-wide v6, v8

    :cond_5
    if-gt p1, v0, :cond_8

    const/16 v1, -0x60

    if-ne p2, p3, :cond_6

    if-lt p1, v1, :cond_8

    :cond_6
    const/16 p3, -0x13

    if-ne p2, p3, :cond_7

    if-ge p1, v1, :cond_8

    :cond_7
    add-long p1, v6, v4

    .line 1142
    invoke-static {v6, v7}, Lcom/google/protobuf/UnsafeUtil;->getByte(J)B

    move-result p3

    if-le p3, v0, :cond_10

    :cond_8
    return p4

    :cond_9
    shr-int/lit8 p3, p1, 0x8

    xor-int/2addr p3, p4

    int-to-byte p3, p3

    if-nez p3, :cond_b

    add-long v8, v6, v4

    .line 1152
    invoke-static {v6, v7}, Lcom/google/protobuf/UnsafeUtil;->getByte(J)B

    move-result p3

    cmp-long p1, v8, v2

    if-ltz p1, :cond_a

    .line 1154
    invoke-static {p2, p3}, Lcom/google/protobuf/Utf8;->access$000(II)I

    move-result p1

    return p1

    :cond_a
    move-wide v6, v8

    goto :goto_0

    :cond_b
    shr-int/lit8 p1, p1, 0x10

    int-to-byte v1, p1

    :goto_0
    if-nez v1, :cond_d

    add-long v8, v6, v4

    .line 1160
    invoke-static {v6, v7}, Lcom/google/protobuf/UnsafeUtil;->getByte(J)B

    move-result v1

    cmp-long p1, v8, v2

    if-ltz p1, :cond_c

    .line 1162
    invoke-static {p2, p3, v1}, Lcom/google/protobuf/Utf8;->access$100(III)I

    move-result p1

    return p1

    :cond_c
    move-wide v6, v8

    :cond_d
    if-gt p3, v0, :cond_e

    shl-int/lit8 p1, p2, 0x1c

    add-int/lit8 p3, p3, 0x70

    add-int/2addr p1, p3

    shr-int/lit8 p1, p1, 0x1e

    if-nez p1, :cond_e

    if-gt v1, v0, :cond_e

    add-long p1, v6, v4

    .line 1179
    invoke-static {v6, v7}, Lcom/google/protobuf/UnsafeUtil;->getByte(J)B

    move-result p3

    if-le p3, v0, :cond_10

    :cond_e
    return p4

    :cond_f
    move-wide p1, v6

    :cond_10
    sub-long p3, v2, p1

    long-to-int p3, p3

    .line 1185
    invoke-static {p1, p2, p3}, Lcom/google/protobuf/Utf8$UnsafeProcessor;->partialIsValidUtf8(JI)I

    move-result p1

    return p1
.end method
