.class final Lcom/google/protobuf/Utf8$UnsafeProcessor;
.super Lcom/google/protobuf/Utf8$Processor;
.source "SourceFile"


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

    .line 989
    invoke-direct {p0}, Lcom/google/protobuf/Utf8$Processor;-><init>()V

    return-void
.end method

.method static isAvailable()Z
    .locals 1

    .line 994
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
    .locals 7

    .line 1444
    invoke-static {p0, p1, p2}, Lcom/google/protobuf/Utf8$UnsafeProcessor;->unsafeEstimateConsecutiveAscii(JI)I

    move-result v4

    .line 1445
    int-to-long v0, v4

    add-long/2addr p0, v0

    .line 1446
    sub-int/2addr p2, v4

    .line 1452
    :goto_0
    const/4 v5, 0x0

    .line 1453
    :goto_1
    if-lez p2, :cond_0

    move-wide v0, p0

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    move-wide p0, v2

    invoke-static {v0, v1}, Lcom/google/protobuf/UnsafeUtil;->getByte(J)B

    move-result v0

    move v5, v0

    if-ltz v0, :cond_0

    add-int/lit8 p2, p2, -0x1

    goto :goto_1

    .line 1455
    :cond_0
    if-nez p2, :cond_1

    .line 1456
    const/4 v0, 0x0

    return v0

    .line 1458
    :cond_1
    add-int/lit8 p2, p2, -0x1

    .line 1460
    const/16 v0, -0x20

    if-ge v5, v0, :cond_4

    .line 1463
    if-nez p2, :cond_2

    .line 1465
    return v5

    .line 1467
    :cond_2
    add-int/lit8 p2, p2, -0x1

    .line 1471
    const/16 v0, -0x3e

    if-lt v5, v0, :cond_3

    move-wide v0, p0

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    move-wide p0, v2

    invoke-static {v0, v1}, Lcom/google/protobuf/UnsafeUtil;->getByte(J)B

    move-result v0

    const/16 v1, -0x41

    if-le v0, v1, :cond_d

    .line 1472
    :cond_3
    const/4 v0, -0x1

    return v0

    .line 1474
    :cond_4
    const/16 v0, -0x10

    if-ge v5, v0, :cond_a

    .line 1477
    const/4 v0, 0x2

    if-ge p2, v0, :cond_5

    .line 1479
    invoke-static {p0, p1, v5, p2}, Lcom/google/protobuf/Utf8$UnsafeProcessor;->unsafeIncompleteStateFor(JII)I

    move-result v0

    return v0

    .line 1481
    :cond_5
    add-int/lit8 p2, p2, -0x2

    .line 1483
    move-wide v0, p0

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    move-wide p0, v2

    invoke-static {v0, v1}, Lcom/google/protobuf/UnsafeUtil;->getByte(J)B

    move-result v6

    .line 1484
    const/16 v0, -0x41

    if-gt v6, v0, :cond_8

    const/16 v0, -0x20

    if-ne v5, v0, :cond_6

    const/16 v0, -0x60

    if-lt v6, v0, :cond_8

    :cond_6
    const/16 v0, -0x13

    if-ne v5, v0, :cond_7

    const/16 v0, -0x60

    if-ge v6, v0, :cond_8

    :cond_7
    move-wide v0, p0

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    move-wide p0, v2

    .line 1490
    invoke-static {v0, v1}, Lcom/google/protobuf/UnsafeUtil;->getByte(J)B

    move-result v0

    const/16 v1, -0x41

    if-le v0, v1, :cond_9

    .line 1491
    :cond_8
    const/4 v0, -0x1

    return v0

    .line 1493
    :cond_9
    goto :goto_2

    .line 1496
    :cond_a
    const/4 v0, 0x3

    if-ge p2, v0, :cond_b

    .line 1498
    invoke-static {p0, p1, v5, p2}, Lcom/google/protobuf/Utf8$UnsafeProcessor;->unsafeIncompleteStateFor(JII)I

    move-result v0

    return v0

    .line 1500
    :cond_b
    add-int/lit8 p2, p2, -0x3

    .line 1502
    move-wide v0, p0

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    move-wide p0, v2

    invoke-static {v0, v1}, Lcom/google/protobuf/UnsafeUtil;->getByte(J)B

    move-result v6

    .line 1503
    const/16 v0, -0x41

    if-gt v6, v0, :cond_c

    shl-int/lit8 v0, v5, 0x1c

    add-int/lit8 v1, v6, 0x70

    add-int/2addr v0, v1

    shr-int/lit8 v0, v0, 0x1e

    if-nez v0, :cond_c

    move-wide v0, p0

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    move-wide p0, v2

    .line 1510
    invoke-static {v0, v1}, Lcom/google/protobuf/UnsafeUtil;->getByte(J)B

    move-result v0

    const/16 v1, -0x41

    if-gt v0, v1, :cond_c

    move-wide v0, p0

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    move-wide p0, v2

    .line 1512
    invoke-static {v0, v1}, Lcom/google/protobuf/UnsafeUtil;->getByte(J)B

    move-result v0

    const/16 v1, -0x41

    if-le v0, v1, :cond_d

    .line 1513
    :cond_c
    const/4 v0, -0x1

    return v0

    .line 1516
    :cond_d
    :goto_2
    goto/16 :goto_0
.end method

.method private static partialIsValidUtf8([BJI)I
    .locals 7

    .line 1368
    invoke-static {p0, p1, p2, p3}, Lcom/google/protobuf/Utf8$UnsafeProcessor;->unsafeEstimateConsecutiveAscii([BJI)I

    move-result v4

    .line 1369
    sub-int/2addr p3, v4

    .line 1370
    int-to-long v0, v4

    add-long/2addr p1, v0

    .line 1376
    :goto_0
    const/4 v5, 0x0

    .line 1377
    :goto_1
    if-lez p3, :cond_0

    move-wide v0, p1

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    move-wide p1, v2

    invoke-static {p0, v0, v1}, Lcom/google/protobuf/UnsafeUtil;->getByte([BJ)B

    move-result v0

    move v5, v0

    if-ltz v0, :cond_0

    add-int/lit8 p3, p3, -0x1

    goto :goto_1

    .line 1379
    :cond_0
    if-nez p3, :cond_1

    .line 1380
    const/4 v0, 0x0

    return v0

    .line 1382
    :cond_1
    add-int/lit8 p3, p3, -0x1

    .line 1385
    const/16 v0, -0x20

    if-ge v5, v0, :cond_4

    .line 1387
    if-nez p3, :cond_2

    .line 1389
    return v5

    .line 1391
    :cond_2
    add-int/lit8 p3, p3, -0x1

    .line 1395
    const/16 v0, -0x3e

    if-lt v5, v0, :cond_3

    move-wide v0, p1

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    move-wide p1, v2

    .line 1396
    invoke-static {p0, v0, v1}, Lcom/google/protobuf/UnsafeUtil;->getByte([BJ)B

    move-result v0

    const/16 v1, -0x41

    if-le v0, v1, :cond_d

    .line 1397
    :cond_3
    const/4 v0, -0x1

    return v0

    .line 1399
    :cond_4
    const/16 v0, -0x10

    if-ge v5, v0, :cond_a

    .line 1401
    const/4 v0, 0x2

    if-ge p3, v0, :cond_5

    .line 1403
    invoke-static {p0, v5, p1, p2, p3}, Lcom/google/protobuf/Utf8$UnsafeProcessor;->unsafeIncompleteStateFor([BIJI)I

    move-result v0

    return v0

    .line 1405
    :cond_5
    add-int/lit8 p3, p3, -0x2

    .line 1408
    move-wide v0, p1

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    move-wide p1, v2

    invoke-static {p0, v0, v1}, Lcom/google/protobuf/UnsafeUtil;->getByte([BJ)B

    move-result v0

    move v6, v0

    const/16 v1, -0x41

    if-gt v0, v1, :cond_8

    const/16 v0, -0x20

    if-ne v5, v0, :cond_6

    const/16 v0, -0x60

    if-lt v6, v0, :cond_8

    :cond_6
    const/16 v0, -0x13

    if-ne v5, v0, :cond_7

    const/16 v0, -0x60

    if-ge v6, v0, :cond_8

    :cond_7
    move-wide v0, p1

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    move-wide p1, v2

    .line 1414
    invoke-static {p0, v0, v1}, Lcom/google/protobuf/UnsafeUtil;->getByte([BJ)B

    move-result v0

    const/16 v1, -0x41

    if-le v0, v1, :cond_9

    .line 1415
    :cond_8
    const/4 v0, -0x1

    return v0

    .line 1417
    :cond_9
    goto :goto_2

    .line 1419
    :cond_a
    const/4 v0, 0x3

    if-ge p3, v0, :cond_b

    .line 1421
    invoke-static {p0, v5, p1, p2, p3}, Lcom/google/protobuf/Utf8$UnsafeProcessor;->unsafeIncompleteStateFor([BIJI)I

    move-result v0

    return v0

    .line 1423
    :cond_b
    add-int/lit8 p3, p3, -0x3

    .line 1426
    move-wide v0, p1

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    move-wide p1, v2

    invoke-static {p0, v0, v1}, Lcom/google/protobuf/UnsafeUtil;->getByte([BJ)B

    move-result v0

    move v6, v0

    const/16 v1, -0x41

    if-gt v0, v1, :cond_c

    shl-int/lit8 v0, v5, 0x1c

    add-int/lit8 v1, v6, 0x70

    add-int/2addr v0, v1

    shr-int/lit8 v0, v0, 0x1e

    if-nez v0, :cond_c

    move-wide v0, p1

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    move-wide p1, v2

    .line 1433
    invoke-static {p0, v0, v1}, Lcom/google/protobuf/UnsafeUtil;->getByte([BJ)B

    move-result v0

    const/16 v1, -0x41

    if-gt v0, v1, :cond_c

    move-wide v0, p1

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    move-wide p1, v2

    .line 1435
    invoke-static {p0, v0, v1}, Lcom/google/protobuf/UnsafeUtil;->getByte([BJ)B

    move-result v0

    const/16 v1, -0x41

    if-le v0, v1, :cond_d

    .line 1436
    :cond_c
    const/4 v0, -0x1

    return v0

    .line 1439
    :cond_d
    :goto_2
    goto/16 :goto_0
.end method

.method private static unsafeEstimateConsecutiveAscii(JI)I
    .locals 7

    .line 1341
    move v4, p2

    .line 1342
    const/16 v0, 0x10

    if-ge v4, v0, :cond_0

    .line 1344
    const/4 v0, 0x0

    return v0

    .line 1350
    :cond_0
    long-to-int v0, p0

    and-int/lit8 v0, v0, 0x7

    rsub-int/lit8 v5, v0, 0x8

    .line 1351
    move v6, v5

    :goto_0
    if-lez v6, :cond_2

    .line 1352
    move-wide v0, p0

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    move-wide p0, v2

    invoke-static {v0, v1}, Lcom/google/protobuf/UnsafeUtil;->getByte(J)B

    move-result v0

    if-gez v0, :cond_1

    .line 1353
    sub-int v0, v5, v6

    return v0

    .line 1351
    :cond_1
    add-int/lit8 v6, v6, -0x1

    goto :goto_0

    .line 1360
    :cond_2
    sub-int/2addr v4, v5

    .line 1361
    :goto_1
    const/16 v0, 0x8

    if-lt v4, v0, :cond_3

    invoke-static {p0, p1}, Lcom/google/protobuf/UnsafeUtil;->getLong(J)J

    move-result-wide v0

    const-wide v2, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_3

    .line 1362
    const-wide/16 v0, 0x8

    add-long/2addr p0, v0

    add-int/lit8 v4, v4, -0x8

    goto :goto_1

    .line 1363
    :cond_3
    sub-int v0, p2, v4

    return v0
.end method

.method private static unsafeEstimateConsecutiveAscii([BJI)I
    .locals 5

    .line 1323
    const/16 v0, 0x10

    if-ge p3, v0, :cond_0

    .line 1325
    const/4 v0, 0x0

    return v0

    .line 1328
    :cond_0
    const/4 v4, 0x0

    :goto_0
    if-ge v4, p3, :cond_2

    .line 1329
    move-wide v0, p1

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    move-wide p1, v2

    invoke-static {p0, v0, v1}, Lcom/google/protobuf/UnsafeUtil;->getByte([BJ)B

    move-result v0

    if-gez v0, :cond_1

    .line 1330
    return v4

    .line 1328
    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 1333
    :cond_2
    return p3
.end method

.method private static unsafeIncompleteStateFor(JII)I
    .locals 3

    .line 1539
    packed-switch p3, :pswitch_data_0

    goto :goto_0

    .line 1541
    :pswitch_0
    invoke-static {p2}, Lcom/google/protobuf/Utf8;->access$500(I)I

    move-result v0

    return v0

    .line 1544
    :pswitch_1
    invoke-static {p0, p1}, Lcom/google/protobuf/UnsafeUtil;->getByte(J)B

    move-result v0

    invoke-static {p2, v0}, Lcom/google/protobuf/Utf8;->access$000(II)I

    move-result v0

    return v0

    .line 1547
    :pswitch_2
    invoke-static {p0, p1}, Lcom/google/protobuf/UnsafeUtil;->getByte(J)B

    move-result v0

    const-wide/16 v1, 0x1

    add-long/2addr v1, p0

    .line 1548
    invoke-static {v1, v2}, Lcom/google/protobuf/UnsafeUtil;->getByte(J)B

    move-result v1

    .line 1547
    invoke-static {p2, v0, v1}, Lcom/google/protobuf/Utf8;->access$100(III)I

    move-result v0

    return v0

    .line 1551
    :goto_0
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private static unsafeIncompleteStateFor([BIJI)I
    .locals 3

    .line 1521
    packed-switch p4, :pswitch_data_0

    goto :goto_0

    .line 1523
    :pswitch_0
    invoke-static {p1}, Lcom/google/protobuf/Utf8;->access$500(I)I

    move-result v0

    return v0

    .line 1526
    :pswitch_1
    invoke-static {p0, p2, p3}, Lcom/google/protobuf/UnsafeUtil;->getByte([BJ)B

    move-result v0

    invoke-static {p1, v0}, Lcom/google/protobuf/Utf8;->access$000(II)I

    move-result v0

    return v0

    .line 1529
    :pswitch_2
    invoke-static {p0, p2, p3}, Lcom/google/protobuf/UnsafeUtil;->getByte([BJ)B

    move-result v0

    const-wide/16 v1, 0x1

    add-long/2addr v1, p2

    .line 1530
    invoke-static {p0, v1, v2}, Lcom/google/protobuf/UnsafeUtil;->getByte([BJ)B

    move-result v1

    .line 1529
    invoke-static {p1, v0, v1}, Lcom/google/protobuf/Utf8;->access$100(III)I

    move-result v0

    return v0

    .line 1533
    :goto_0
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method


# virtual methods
.method encodeUtf8(Ljava/lang/CharSequence;[BII)I
    .locals 13

    .line 1189
    move/from16 v0, p3

    int-to-long v4, v0

    .line 1190
    move/from16 v0, p4

    int-to-long v0, v0

    add-long v6, v4, v0

    .line 1191
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v8

    .line 1192
    move/from16 v0, p4

    if-gt v8, v0, :cond_0

    array-length v0, p2

    sub-int v0, v0, p4

    move/from16 v1, p3

    if-ge v0, v1, :cond_1

    .line 1194
    :cond_0
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed writing "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    add-int/lit8 v2, v8, -0x1

    .line 1195
    invoke-interface {p1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " at index "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    add-int v2, p3, p4

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1200
    :cond_1
    const/4 v9, 0x0

    .line 1201
    :goto_0
    if-ge v9, v8, :cond_2

    invoke-interface {p1, v9}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    move v10, v0

    const/16 v1, 0x80

    if-ge v0, v1, :cond_2

    .line 1202
    move-wide v0, v4

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    move-wide v4, v2

    int-to-byte v2, v10

    invoke-static {p2, v0, v1, v2}, Lcom/google/protobuf/UnsafeUtil;->putByte([BJB)V

    .line 1201
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 1204
    :cond_2
    if-ne v9, v8, :cond_3

    .line 1206
    long-to-int v0, v4

    return v0

    .line 1209
    :cond_3
    :goto_1
    if-ge v9, v8, :cond_d

    .line 1210
    invoke-interface {p1, v9}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v10

    .line 1211
    const/16 v0, 0x80

    if-ge v10, v0, :cond_4

    cmp-long v0, v4, v6

    if-gez v0, :cond_4

    .line 1212
    move-wide v0, v4

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    move-wide v4, v2

    int-to-byte v2, v10

    invoke-static {p2, v0, v1, v2}, Lcom/google/protobuf/UnsafeUtil;->putByte([BJB)V

    goto/16 :goto_2

    .line 1213
    :cond_4
    const/16 v0, 0x800

    if-ge v10, v0, :cond_5

    const-wide/16 v0, 0x2

    sub-long v0, v6, v0

    cmp-long v0, v4, v0

    if-gtz v0, :cond_5

    .line 1214
    move-wide v0, v4

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    move-wide v4, v2

    ushr-int/lit8 v2, v10, 0x6

    or-int/lit16 v2, v2, 0x3c0

    int-to-byte v2, v2

    invoke-static {p2, v0, v1, v2}, Lcom/google/protobuf/UnsafeUtil;->putByte([BJB)V

    .line 1215
    move-wide v0, v4

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    move-wide v4, v2

    and-int/lit8 v2, v10, 0x3f

    or-int/lit16 v2, v2, 0x80

    int-to-byte v2, v2

    invoke-static {p2, v0, v1, v2}, Lcom/google/protobuf/UnsafeUtil;->putByte([BJB)V

    goto/16 :goto_2

    .line 1216
    :cond_5
    const v0, 0xd800

    if-lt v10, v0, :cond_6

    const v0, 0xdfff

    if-ge v0, v10, :cond_7

    :cond_6
    const-wide/16 v0, 0x3

    sub-long v0, v6, v0

    cmp-long v0, v4, v0

    if-gtz v0, :cond_7

    .line 1218
    move-wide v0, v4

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    move-wide v4, v2

    ushr-int/lit8 v2, v10, 0xc

    or-int/lit16 v2, v2, 0x1e0

    int-to-byte v2, v2

    invoke-static {p2, v0, v1, v2}, Lcom/google/protobuf/UnsafeUtil;->putByte([BJB)V

    .line 1219
    move-wide v0, v4

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    move-wide v4, v2

    ushr-int/lit8 v2, v10, 0x6

    and-int/lit8 v2, v2, 0x3f

    or-int/lit16 v2, v2, 0x80

    int-to-byte v2, v2

    invoke-static {p2, v0, v1, v2}, Lcom/google/protobuf/UnsafeUtil;->putByte([BJB)V

    .line 1220
    move-wide v0, v4

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    move-wide v4, v2

    and-int/lit8 v2, v10, 0x3f

    or-int/lit16 v2, v2, 0x80

    int-to-byte v2, v2

    invoke-static {p2, v0, v1, v2}, Lcom/google/protobuf/UnsafeUtil;->putByte([BJB)V

    goto/16 :goto_2

    .line 1221
    :cond_7
    const-wide/16 v0, 0x4

    sub-long v0, v6, v0

    cmp-long v0, v4, v0

    if-gtz v0, :cond_a

    .line 1225
    add-int/lit8 v0, v9, 0x1

    if-eq v0, v8, :cond_8

    add-int/lit8 v9, v9, 0x1

    invoke-interface {p1, v9}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    move v11, v0

    invoke-static {v10, v0}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    move-result v0

    if-nez v0, :cond_9

    .line 1226
    :cond_8
    new-instance v0, Lcom/google/protobuf/Utf8$UnpairedSurrogateException;

    add-int/lit8 v1, v9, -0x1

    invoke-direct {v0, v1, v8}, Lcom/google/protobuf/Utf8$UnpairedSurrogateException;-><init>(II)V

    throw v0

    .line 1228
    :cond_9
    invoke-static {v10, v11}, Ljava/lang/Character;->toCodePoint(CC)I

    move-result v12

    .line 1229
    move-wide v0, v4

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    move-wide v4, v2

    ushr-int/lit8 v2, v12, 0x12

    or-int/lit16 v2, v2, 0xf0

    int-to-byte v2, v2

    invoke-static {p2, v0, v1, v2}, Lcom/google/protobuf/UnsafeUtil;->putByte([BJB)V

    .line 1230
    move-wide v0, v4

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    move-wide v4, v2

    ushr-int/lit8 v2, v12, 0xc

    and-int/lit8 v2, v2, 0x3f

    or-int/lit16 v2, v2, 0x80

    int-to-byte v2, v2

    invoke-static {p2, v0, v1, v2}, Lcom/google/protobuf/UnsafeUtil;->putByte([BJB)V

    .line 1231
    move-wide v0, v4

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    move-wide v4, v2

    ushr-int/lit8 v2, v12, 0x6

    and-int/lit8 v2, v2, 0x3f

    or-int/lit16 v2, v2, 0x80

    int-to-byte v2, v2

    invoke-static {p2, v0, v1, v2}, Lcom/google/protobuf/UnsafeUtil;->putByte([BJB)V

    .line 1232
    move-wide v0, v4

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    move-wide v4, v2

    and-int/lit8 v2, v12, 0x3f

    or-int/lit16 v2, v2, 0x80

    int-to-byte v2, v2

    invoke-static {p2, v0, v1, v2}, Lcom/google/protobuf/UnsafeUtil;->putByte([BJB)V

    .line 1233
    goto :goto_2

    .line 1234
    :cond_a
    const v0, 0xd800

    if-gt v0, v10, :cond_c

    const v0, 0xdfff

    if-gt v10, v0, :cond_c

    add-int/lit8 v0, v9, 0x1

    if-eq v0, v8, :cond_b

    add-int/lit8 v0, v9, 0x1

    .line 1235
    invoke-interface {p1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    invoke-static {v10, v0}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    move-result v0

    if-nez v0, :cond_c

    .line 1237
    :cond_b
    new-instance v0, Lcom/google/protobuf/Utf8$UnpairedSurrogateException;

    invoke-direct {v0, v9, v8}, Lcom/google/protobuf/Utf8$UnpairedSurrogateException;-><init>(II)V

    throw v0

    .line 1240
    :cond_c
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed writing "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " at index "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1209
    :goto_2
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_1

    .line 1245
    :cond_d
    long-to-int v0, v4

    return v0
.end method

.method encodeUtf8Direct(Ljava/lang/CharSequence;Ljava/nio/ByteBuffer;)V
    .locals 15

    .line 1250
    invoke-static/range {p2 .. p2}, Lcom/google/protobuf/UnsafeUtil;->addressOffset(Ljava/nio/ByteBuffer;)J

    move-result-wide v4

    .line 1251
    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->position()I

    move-result v0

    int-to-long v0, v0

    add-long v6, v4, v0

    .line 1252
    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->limit()I

    move-result v0

    int-to-long v0, v0

    add-long v8, v4, v0

    .line 1253
    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->length()I

    move-result v10

    .line 1254
    int-to-long v0, v10

    sub-long v2, v8, v6

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 1256
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed writing "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    add-int/lit8 v2, v10, -0x1

    .line 1257
    move-object/from16 v3, p1

    invoke-interface {v3, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " at index "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->limit()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1262
    :cond_0
    const/4 v11, 0x0

    .line 1263
    :goto_0
    if-ge v11, v10, :cond_1

    move-object/from16 v0, p1

    invoke-interface {v0, v11}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    move v12, v0

    const/16 v1, 0x80

    if-ge v0, v1, :cond_1

    .line 1264
    move-wide v0, v6

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    move-wide v6, v2

    int-to-byte v2, v12

    invoke-static {v0, v1, v2}, Lcom/google/protobuf/UnsafeUtil;->putByte(JB)V

    .line 1263
    add-int/lit8 v11, v11, 0x1

    goto :goto_0

    .line 1266
    :cond_1
    if-ne v11, v10, :cond_2

    .line 1268
    sub-long v0, v6, v4

    long-to-int v0, v0

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 1269
    return-void

    .line 1272
    :cond_2
    :goto_1
    if-ge v11, v10, :cond_c

    .line 1273
    move-object/from16 v0, p1

    invoke-interface {v0, v11}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v12

    .line 1274
    const/16 v0, 0x80

    if-ge v12, v0, :cond_3

    cmp-long v0, v6, v8

    if-gez v0, :cond_3

    .line 1275
    move-wide v0, v6

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    move-wide v6, v2

    int-to-byte v2, v12

    invoke-static {v0, v1, v2}, Lcom/google/protobuf/UnsafeUtil;->putByte(JB)V

    goto/16 :goto_2

    .line 1276
    :cond_3
    const/16 v0, 0x800

    if-ge v12, v0, :cond_4

    const-wide/16 v0, 0x2

    sub-long v0, v8, v0

    cmp-long v0, v6, v0

    if-gtz v0, :cond_4

    .line 1277
    move-wide v0, v6

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    move-wide v6, v2

    ushr-int/lit8 v2, v12, 0x6

    or-int/lit16 v2, v2, 0x3c0

    int-to-byte v2, v2

    invoke-static {v0, v1, v2}, Lcom/google/protobuf/UnsafeUtil;->putByte(JB)V

    .line 1278
    move-wide v0, v6

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    move-wide v6, v2

    and-int/lit8 v2, v12, 0x3f

    or-int/lit16 v2, v2, 0x80

    int-to-byte v2, v2

    invoke-static {v0, v1, v2}, Lcom/google/protobuf/UnsafeUtil;->putByte(JB)V

    goto/16 :goto_2

    .line 1279
    :cond_4
    const v0, 0xd800

    if-lt v12, v0, :cond_5

    const v0, 0xdfff

    if-ge v0, v12, :cond_6

    :cond_5
    const-wide/16 v0, 0x3

    sub-long v0, v8, v0

    cmp-long v0, v6, v0

    if-gtz v0, :cond_6

    .line 1281
    move-wide v0, v6

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    move-wide v6, v2

    ushr-int/lit8 v2, v12, 0xc

    or-int/lit16 v2, v2, 0x1e0

    int-to-byte v2, v2

    invoke-static {v0, v1, v2}, Lcom/google/protobuf/UnsafeUtil;->putByte(JB)V

    .line 1282
    move-wide v0, v6

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    move-wide v6, v2

    ushr-int/lit8 v2, v12, 0x6

    and-int/lit8 v2, v2, 0x3f

    or-int/lit16 v2, v2, 0x80

    int-to-byte v2, v2

    invoke-static {v0, v1, v2}, Lcom/google/protobuf/UnsafeUtil;->putByte(JB)V

    .line 1283
    move-wide v0, v6

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    move-wide v6, v2

    and-int/lit8 v2, v12, 0x3f

    or-int/lit16 v2, v2, 0x80

    int-to-byte v2, v2

    invoke-static {v0, v1, v2}, Lcom/google/protobuf/UnsafeUtil;->putByte(JB)V

    goto/16 :goto_2

    .line 1284
    :cond_6
    const-wide/16 v0, 0x4

    sub-long v0, v8, v0

    cmp-long v0, v6, v0

    if-gtz v0, :cond_9

    .line 1288
    add-int/lit8 v0, v11, 0x1

    if-eq v0, v10, :cond_7

    add-int/lit8 v11, v11, 0x1

    move-object/from16 v0, p1

    invoke-interface {v0, v11}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    move v13, v0

    invoke-static {v12, v0}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    move-result v0

    if-nez v0, :cond_8

    .line 1289
    :cond_7
    new-instance v0, Lcom/google/protobuf/Utf8$UnpairedSurrogateException;

    add-int/lit8 v1, v11, -0x1

    invoke-direct {v0, v1, v10}, Lcom/google/protobuf/Utf8$UnpairedSurrogateException;-><init>(II)V

    throw v0

    .line 1291
    :cond_8
    invoke-static {v12, v13}, Ljava/lang/Character;->toCodePoint(CC)I

    move-result v14

    .line 1292
    move-wide v0, v6

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    move-wide v6, v2

    ushr-int/lit8 v2, v14, 0x12

    or-int/lit16 v2, v2, 0xf0

    int-to-byte v2, v2

    invoke-static {v0, v1, v2}, Lcom/google/protobuf/UnsafeUtil;->putByte(JB)V

    .line 1293
    move-wide v0, v6

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    move-wide v6, v2

    ushr-int/lit8 v2, v14, 0xc

    and-int/lit8 v2, v2, 0x3f

    or-int/lit16 v2, v2, 0x80

    int-to-byte v2, v2

    invoke-static {v0, v1, v2}, Lcom/google/protobuf/UnsafeUtil;->putByte(JB)V

    .line 1294
    move-wide v0, v6

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    move-wide v6, v2

    ushr-int/lit8 v2, v14, 0x6

    and-int/lit8 v2, v2, 0x3f

    or-int/lit16 v2, v2, 0x80

    int-to-byte v2, v2

    invoke-static {v0, v1, v2}, Lcom/google/protobuf/UnsafeUtil;->putByte(JB)V

    .line 1295
    move-wide v0, v6

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    move-wide v6, v2

    and-int/lit8 v2, v14, 0x3f

    or-int/lit16 v2, v2, 0x80

    int-to-byte v2, v2

    invoke-static {v0, v1, v2}, Lcom/google/protobuf/UnsafeUtil;->putByte(JB)V

    .line 1296
    goto :goto_2

    .line 1297
    :cond_9
    const v0, 0xd800

    if-gt v0, v12, :cond_b

    const v0, 0xdfff

    if-gt v12, v0, :cond_b

    add-int/lit8 v0, v11, 0x1

    if-eq v0, v10, :cond_a

    add-int/lit8 v0, v11, 0x1

    .line 1298
    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    invoke-static {v12, v0}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    move-result v0

    if-nez v0, :cond_b

    .line 1300
    :cond_a
    new-instance v0, Lcom/google/protobuf/Utf8$UnpairedSurrogateException;

    invoke-direct {v0, v11, v10}, Lcom/google/protobuf/Utf8$UnpairedSurrogateException;-><init>(II)V

    throw v0

    .line 1303
    :cond_b
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed writing "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " at index "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1272
    :goto_2
    add-int/lit8 v11, v11, 0x1

    goto/16 :goto_1

    .line 1308
    :cond_c
    sub-long v0, v6, v4

    long-to-int v0, v0

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 1309
    return-void
.end method

.method partialIsValidUtf8(I[BII)I
    .locals 12

    .line 999
    or-int v0, p3, p4

    array-length v1, p2

    sub-int v1, v1, p4

    or-int/2addr v0, v1

    if-gez v0, :cond_0

    .line 1000
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    const-string v1, "Array length=%d, index=%d, limit=%d"

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    array-length v3, p2

    .line 1001
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x2

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1003
    :cond_0
    int-to-long v5, p3

    .line 1004
    move/from16 v0, p4

    int-to-long v7, v0

    .line 1005
    if-eqz p1, :cond_e

    .line 1013
    cmp-long v0, v5, v7

    if-ltz v0, :cond_1

    .line 1014
    return p1

    .line 1016
    :cond_1
    int-to-byte v9, p1

    .line 1018
    const/16 v0, -0x20

    if-ge v9, v0, :cond_3

    .line 1023
    const/16 v0, -0x3e

    if-lt v9, v0, :cond_2

    move-wide v0, v5

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    move-wide v5, v2

    .line 1025
    invoke-static {p2, v0, v1}, Lcom/google/protobuf/UnsafeUtil;->getByte([BJ)B

    move-result v0

    const/16 v1, -0x41

    if-le v0, v1, :cond_e

    .line 1026
    :cond_2
    const/4 v0, -0x1

    return v0

    .line 1028
    :cond_3
    const/16 v0, -0x10

    if-ge v9, v0, :cond_9

    .line 1032
    shr-int/lit8 v0, p1, 0x8

    xor-int/lit8 v0, v0, -0x1

    int-to-byte v10, v0

    .line 1033
    if-nez v10, :cond_4

    .line 1034
    move-wide v0, v5

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    move-wide v5, v2

    invoke-static {p2, v0, v1}, Lcom/google/protobuf/UnsafeUtil;->getByte([BJ)B

    move-result v10

    .line 1035
    cmp-long v0, v5, v7

    if-ltz v0, :cond_4

    .line 1036
    invoke-static {v9, v10}, Lcom/google/protobuf/Utf8;->access$000(II)I

    move-result v0

    return v0

    .line 1039
    :cond_4
    const/16 v0, -0x41

    if-gt v10, v0, :cond_7

    const/16 v0, -0x20

    if-ne v9, v0, :cond_5

    const/16 v0, -0x60

    if-lt v10, v0, :cond_7

    :cond_5
    const/16 v0, -0x13

    if-ne v9, v0, :cond_6

    const/16 v0, -0x60

    if-ge v10, v0, :cond_7

    :cond_6
    move-wide v0, v5

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    move-wide v5, v2

    .line 1045
    invoke-static {p2, v0, v1}, Lcom/google/protobuf/UnsafeUtil;->getByte([BJ)B

    move-result v0

    const/16 v1, -0x41

    if-le v0, v1, :cond_8

    .line 1046
    :cond_7
    const/4 v0, -0x1

    return v0

    .line 1048
    :cond_8
    goto/16 :goto_0

    .line 1052
    :cond_9
    shr-int/lit8 v0, p1, 0x8

    xor-int/lit8 v0, v0, -0x1

    int-to-byte v10, v0

    .line 1053
    const/4 v11, 0x0

    .line 1054
    if-nez v10, :cond_a

    .line 1055
    move-wide v0, v5

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    move-wide v5, v2

    invoke-static {p2, v0, v1}, Lcom/google/protobuf/UnsafeUtil;->getByte([BJ)B

    move-result v10

    .line 1056
    cmp-long v0, v5, v7

    if-ltz v0, :cond_b

    .line 1057
    invoke-static {v9, v10}, Lcom/google/protobuf/Utf8;->access$000(II)I

    move-result v0

    return v0

    .line 1060
    :cond_a
    shr-int/lit8 v0, p1, 0x10

    int-to-byte v11, v0

    .line 1062
    :cond_b
    if-nez v11, :cond_c

    .line 1063
    move-wide v0, v5

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    move-wide v5, v2

    invoke-static {p2, v0, v1}, Lcom/google/protobuf/UnsafeUtil;->getByte([BJ)B

    move-result v11

    .line 1064
    cmp-long v0, v5, v7

    if-ltz v0, :cond_c

    .line 1065
    invoke-static {v9, v10, v11}, Lcom/google/protobuf/Utf8;->access$100(III)I

    move-result v0

    return v0

    .line 1073
    :cond_c
    const/16 v0, -0x41

    if-gt v10, v0, :cond_d

    shl-int/lit8 v0, v9, 0x1c

    add-int/lit8 v1, v10, 0x70

    add-int/2addr v0, v1

    shr-int/lit8 v0, v0, 0x1e

    if-nez v0, :cond_d

    const/16 v0, -0x41

    if-gt v11, v0, :cond_d

    move-wide v0, v5

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    move-wide v5, v2

    .line 1082
    invoke-static {p2, v0, v1}, Lcom/google/protobuf/UnsafeUtil;->getByte([BJ)B

    move-result v0

    const/16 v1, -0x41

    if-le v0, v1, :cond_e

    .line 1083
    :cond_d
    const/4 v0, -0x1

    return v0

    .line 1088
    :cond_e
    :goto_0
    sub-long v0, v7, v5

    long-to-int v0, v0

    invoke-static {p2, v5, v6, v0}, Lcom/google/protobuf/Utf8$UnsafeProcessor;->partialIsValidUtf8([BJI)I

    move-result v0

    return v0
.end method

.method partialIsValidUtf8Direct(ILjava/nio/ByteBuffer;II)I
    .locals 12

    .line 1094
    or-int v0, p3, p4

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->limit()I

    move-result v1

    sub-int v1, v1, p4

    or-int/2addr v0, v1

    if-gez v0, :cond_0

    .line 1095
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    const-string v1, "buffer limit=%d, index=%d, limit=%d"

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    .line 1096
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->limit()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x2

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1098
    :cond_0
    invoke-static {p2}, Lcom/google/protobuf/UnsafeUtil;->addressOffset(Ljava/nio/ByteBuffer;)J

    move-result-wide v0

    int-to-long v2, p3

    add-long v5, v0, v2

    .line 1099
    sub-int v0, p4, p3

    int-to-long v0, v0

    add-long v7, v5, v0

    .line 1100
    if-eqz p1, :cond_e

    .line 1108
    cmp-long v0, v5, v7

    if-ltz v0, :cond_1

    .line 1109
    return p1

    .line 1112
    :cond_1
    int-to-byte v9, p1

    .line 1114
    const/16 v0, -0x20

    if-ge v9, v0, :cond_3

    .line 1119
    const/16 v0, -0x3e

    if-lt v9, v0, :cond_2

    move-wide v0, v5

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    move-wide v5, v2

    .line 1121
    invoke-static {v0, v1}, Lcom/google/protobuf/UnsafeUtil;->getByte(J)B

    move-result v0

    const/16 v1, -0x41

    if-le v0, v1, :cond_e

    .line 1122
    :cond_2
    const/4 v0, -0x1

    return v0

    .line 1124
    :cond_3
    const/16 v0, -0x10

    if-ge v9, v0, :cond_9

    .line 1128
    shr-int/lit8 v0, p1, 0x8

    xor-int/lit8 v0, v0, -0x1

    int-to-byte v10, v0

    .line 1129
    if-nez v10, :cond_4

    .line 1130
    move-wide v0, v5

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    move-wide v5, v2

    invoke-static {v0, v1}, Lcom/google/protobuf/UnsafeUtil;->getByte(J)B

    move-result v10

    .line 1131
    cmp-long v0, v5, v7

    if-ltz v0, :cond_4

    .line 1132
    invoke-static {v9, v10}, Lcom/google/protobuf/Utf8;->access$000(II)I

    move-result v0

    return v0

    .line 1135
    :cond_4
    const/16 v0, -0x41

    if-gt v10, v0, :cond_7

    const/16 v0, -0x20

    if-ne v9, v0, :cond_5

    const/16 v0, -0x60

    if-lt v10, v0, :cond_7

    :cond_5
    const/16 v0, -0x13

    if-ne v9, v0, :cond_6

    const/16 v0, -0x60

    if-ge v10, v0, :cond_7

    :cond_6
    move-wide v0, v5

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    move-wide v5, v2

    .line 1141
    invoke-static {v0, v1}, Lcom/google/protobuf/UnsafeUtil;->getByte(J)B

    move-result v0

    const/16 v1, -0x41

    if-le v0, v1, :cond_8

    .line 1142
    :cond_7
    const/4 v0, -0x1

    return v0

    .line 1144
    :cond_8
    goto/16 :goto_0

    .line 1148
    :cond_9
    shr-int/lit8 v0, p1, 0x8

    xor-int/lit8 v0, v0, -0x1

    int-to-byte v10, v0

    .line 1149
    const/4 v11, 0x0

    .line 1150
    if-nez v10, :cond_a

    .line 1151
    move-wide v0, v5

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    move-wide v5, v2

    invoke-static {v0, v1}, Lcom/google/protobuf/UnsafeUtil;->getByte(J)B

    move-result v10

    .line 1152
    cmp-long v0, v5, v7

    if-ltz v0, :cond_b

    .line 1153
    invoke-static {v9, v10}, Lcom/google/protobuf/Utf8;->access$000(II)I

    move-result v0

    return v0

    .line 1156
    :cond_a
    shr-int/lit8 v0, p1, 0x10

    int-to-byte v11, v0

    .line 1158
    :cond_b
    if-nez v11, :cond_c

    .line 1159
    move-wide v0, v5

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    move-wide v5, v2

    invoke-static {v0, v1}, Lcom/google/protobuf/UnsafeUtil;->getByte(J)B

    move-result v11

    .line 1160
    cmp-long v0, v5, v7

    if-ltz v0, :cond_c

    .line 1161
    invoke-static {v9, v10, v11}, Lcom/google/protobuf/Utf8;->access$100(III)I

    move-result v0

    return v0

    .line 1169
    :cond_c
    const/16 v0, -0x41

    if-gt v10, v0, :cond_d

    shl-int/lit8 v0, v9, 0x1c

    add-int/lit8 v1, v10, 0x70

    add-int/2addr v0, v1

    shr-int/lit8 v0, v0, 0x1e

    if-nez v0, :cond_d

    const/16 v0, -0x41

    if-gt v11, v0, :cond_d

    move-wide v0, v5

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    move-wide v5, v2

    .line 1178
    invoke-static {v0, v1}, Lcom/google/protobuf/UnsafeUtil;->getByte(J)B

    move-result v0

    const/16 v1, -0x41

    if-le v0, v1, :cond_e

    .line 1179
    :cond_d
    const/4 v0, -0x1

    return v0

    .line 1184
    :cond_e
    :goto_0
    sub-long v0, v7, v5

    long-to-int v0, v0

    invoke-static {v5, v6, v0}, Lcom/google/protobuf/Utf8$UnsafeProcessor;->partialIsValidUtf8(JI)I

    move-result v0

    return v0
.end method
