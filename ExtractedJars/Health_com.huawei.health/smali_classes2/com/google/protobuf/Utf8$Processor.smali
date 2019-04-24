.class abstract Lcom/google/protobuf/Utf8$Processor;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/Utf8;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "Processor"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 372
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static partialIsValidUtf8(Ljava/nio/ByteBuffer;II)I
    .locals 4

    .line 542
    invoke-static {p0, p1, p2}, Lcom/google/protobuf/Utf8;->access$200(Ljava/nio/ByteBuffer;II)I

    move-result v0

    add-int/2addr p1, v0

    .line 550
    :cond_0
    :goto_0
    if-lt p1, p2, :cond_1

    .line 551
    const/4 v0, 0x0

    return v0

    .line 553
    :cond_1
    move v0, p1

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    move v2, v0

    if-gez v0, :cond_0

    .line 556
    const/16 v0, -0x20

    if-ge v2, v0, :cond_5

    .line 558
    if-lt p1, p2, :cond_2

    .line 560
    return v2

    .line 565
    :cond_2
    const/16 v0, -0x3e

    if-lt v2, v0, :cond_3

    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    const/16 v1, -0x41

    if-le v0, v1, :cond_4

    .line 566
    :cond_3
    const/4 v0, -0x1

    return v0

    .line 568
    :cond_4
    add-int/lit8 p1, p1, 0x1

    goto/16 :goto_1

    .line 569
    :cond_5
    const/16 v0, -0x10

    if-ge v2, v0, :cond_b

    .line 571
    add-int/lit8 v0, p2, -0x1

    if-lt p1, v0, :cond_6

    .line 573
    sub-int v0, p2, p1

    invoke-static {p0, v2, p1, v0}, Lcom/google/protobuf/Utf8;->access$300(Ljava/nio/ByteBuffer;III)I

    move-result v0

    return v0

    .line 576
    :cond_6
    move v0, p1

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v3

    .line 577
    const/16 v0, -0x41

    if-gt v3, v0, :cond_9

    const/16 v0, -0x20

    if-ne v2, v0, :cond_7

    const/16 v0, -0x60

    if-lt v3, v0, :cond_9

    :cond_7
    const/16 v0, -0x13

    if-ne v2, v0, :cond_8

    const/16 v0, -0x60

    if-ge v3, v0, :cond_9

    .line 583
    :cond_8
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    const/16 v1, -0x41

    if-le v0, v1, :cond_a

    .line 584
    :cond_9
    const/4 v0, -0x1

    return v0

    .line 586
    :cond_a
    add-int/lit8 p1, p1, 0x1

    .line 587
    goto :goto_1

    .line 589
    :cond_b
    add-int/lit8 v0, p2, -0x2

    if-lt p1, v0, :cond_c

    .line 591
    sub-int v0, p2, p1

    invoke-static {p0, v2, p1, v0}, Lcom/google/protobuf/Utf8;->access$300(Ljava/nio/ByteBuffer;III)I

    move-result v0

    return v0

    .line 595
    :cond_c
    move v0, p1

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v3

    .line 596
    const/16 v0, -0x41

    if-gt v3, v0, :cond_d

    shl-int/lit8 v0, v2, 0x1c

    add-int/lit8 v1, v3, 0x70

    add-int/2addr v0, v1

    shr-int/lit8 v0, v0, 0x1e

    if-nez v0, :cond_d

    move v0, p1

    add-int/lit8 p1, p1, 0x1

    .line 603
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    const/16 v1, -0x41

    if-gt v0, v1, :cond_d

    move v0, p1

    add-int/lit8 p1, p1, 0x1

    .line 605
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    const/16 v1, -0x41

    if-le v0, v1, :cond_e

    .line 606
    :cond_d
    const/4 v0, -0x1

    return v0

    .line 609
    :cond_e
    :goto_1
    goto/16 :goto_0
.end method


# virtual methods
.method abstract encodeUtf8(Ljava/lang/CharSequence;[BII)I
.end method

.method final encodeUtf8(Ljava/lang/CharSequence;Ljava/nio/ByteBuffer;)V
    .locals 5

    .line 662
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->hasArray()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 663
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result v3

    .line 664
    .line 665
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->position()I

    move-result v1

    add-int/2addr v1, v3

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v2

    invoke-static {p1, v0, v1, v2}, Lcom/google/protobuf/Utf8;->encode(Ljava/lang/CharSequence;[BII)I

    move-result v4

    .line 666
    sub-int v0, v4, v3

    invoke-virtual {p2, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 667
    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->isDirect()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 668
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/Utf8$Processor;->encodeUtf8Direct(Ljava/lang/CharSequence;Ljava/nio/ByteBuffer;)V

    goto :goto_0

    .line 670
    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/Utf8$Processor;->encodeUtf8Default(Ljava/lang/CharSequence;Ljava/nio/ByteBuffer;)V

    .line 672
    :goto_0
    return-void
.end method

.method final encodeUtf8Default(Ljava/lang/CharSequence;Ljava/nio/ByteBuffer;)V
    .locals 9

    .line 684
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v3

    .line 685
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->position()I

    move-result v4

    .line 686
    const/4 v5, 0x0

    .line 694
    :goto_0
    if-ge v5, v3, :cond_0

    :try_start_0
    invoke-interface {p1, v5}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    move v6, v0

    const/16 v1, 0x80

    if-ge v0, v1, :cond_0

    .line 695
    add-int v0, v4, v5

    int-to-byte v1, v6

    invoke-virtual {p2, v0, v1}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 694
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 697
    :cond_0
    if-ne v5, v3, :cond_1

    .line 699
    add-int v0, v4, v5

    invoke-virtual {p2, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 700
    return-void

    .line 703
    :cond_1
    add-int v0, v4, v5

    move v4, v0

    .line 704
    :goto_1
    if-ge v5, v3, :cond_8

    .line 705
    :try_start_1
    invoke-interface {p1, v5}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v6

    .line 706
    const/16 v0, 0x80

    if-ge v6, v0, :cond_2

    .line 708
    int-to-byte v0, v6

    invoke-virtual {p2, v4, v0}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    goto/16 :goto_2

    .line 709
    :cond_2
    const/16 v0, 0x800

    if-ge v6, v0, :cond_3

    .line 713
    move v0, v4

    add-int/lit8 v4, v4, 0x1

    ushr-int/lit8 v1, v6, 0x6

    or-int/lit16 v1, v1, 0xc0

    int-to-byte v1, v1

    invoke-virtual {p2, v0, v1}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 714
    and-int/lit8 v0, v6, 0x3f

    or-int/lit16 v0, v0, 0x80

    int-to-byte v0, v0

    invoke-virtual {p2, v4, v0}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    goto/16 :goto_2

    .line 715
    :cond_3
    const v0, 0xd800

    if-lt v6, v0, :cond_4

    const v0, 0xdfff

    if-ge v0, v6, :cond_5

    .line 720
    :cond_4
    move v0, v4

    add-int/lit8 v4, v4, 0x1

    ushr-int/lit8 v1, v6, 0xc

    or-int/lit16 v1, v1, 0xe0

    int-to-byte v1, v1

    invoke-virtual {p2, v0, v1}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 721
    move v0, v4

    add-int/lit8 v4, v4, 0x1

    ushr-int/lit8 v1, v6, 0x6

    and-int/lit8 v1, v1, 0x3f

    or-int/lit16 v1, v1, 0x80

    int-to-byte v1, v1

    invoke-virtual {p2, v0, v1}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 722
    and-int/lit8 v0, v6, 0x3f

    or-int/lit16 v0, v0, 0x80

    int-to-byte v0, v0

    invoke-virtual {p2, v4, v0}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    goto/16 :goto_2

    .line 729
    :cond_5
    add-int/lit8 v0, v5, 0x1

    if-eq v0, v3, :cond_6

    add-int/lit8 v5, v5, 0x1

    invoke-interface {p1, v5}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    move v7, v0

    invoke-static {v6, v0}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    move-result v0

    if-nez v0, :cond_7

    .line 730
    :cond_6
    new-instance v0, Lcom/google/protobuf/Utf8$UnpairedSurrogateException;

    invoke-direct {v0, v5, v3}, Lcom/google/protobuf/Utf8$UnpairedSurrogateException;-><init>(II)V

    throw v0

    .line 733
    :cond_7
    invoke-static {v6, v7}, Ljava/lang/Character;->toCodePoint(CC)I

    move-result v8

    .line 734
    move v0, v4

    add-int/lit8 v4, v4, 0x1

    ushr-int/lit8 v1, v8, 0x12

    or-int/lit16 v1, v1, 0xf0

    int-to-byte v1, v1

    invoke-virtual {p2, v0, v1}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 735
    move v0, v4

    add-int/lit8 v4, v4, 0x1

    ushr-int/lit8 v1, v8, 0xc

    and-int/lit8 v1, v1, 0x3f

    or-int/lit16 v1, v1, 0x80

    int-to-byte v1, v1

    invoke-virtual {p2, v0, v1}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 736
    move v0, v4

    add-int/lit8 v4, v4, 0x1

    ushr-int/lit8 v1, v8, 0x6

    and-int/lit8 v1, v1, 0x3f

    or-int/lit16 v1, v1, 0x80

    int-to-byte v1, v1

    invoke-virtual {p2, v0, v1}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 737
    and-int/lit8 v0, v8, 0x3f

    or-int/lit16 v0, v0, 0x80

    int-to-byte v0, v0

    invoke-virtual {p2, v4, v0}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 704
    :goto_2
    add-int/lit8 v5, v5, 0x1

    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_1

    .line 742
    :cond_8
    invoke-virtual {p2, v4}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;
    :try_end_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_0

    .line 751
    goto :goto_3

    .line 743
    :catch_0
    move-exception v6

    .line 748
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->position()I

    move-result v0

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->position()I

    move-result v1

    sub-int v1, v4, v1

    add-int/lit8 v1, v1, 0x1

    invoke-static {v5, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    add-int v7, v0, v1

    .line 749
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed writing "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 750
    invoke-interface {p1, v5}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " at index "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 752
    :goto_3
    return-void
.end method

.method abstract encodeUtf8Direct(Ljava/lang/CharSequence;Ljava/nio/ByteBuffer;)V
.end method

.method final isValidUtf8(Ljava/nio/ByteBuffer;II)Z
    .locals 1

    .line 416
    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1, p2, p3}, Lcom/google/protobuf/Utf8$Processor;->partialIsValidUtf8(ILjava/nio/ByteBuffer;II)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method final isValidUtf8([BII)Z
    .locals 1

    .line 383
    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1, p2, p3}, Lcom/google/protobuf/Utf8$Processor;->partialIsValidUtf8(I[BII)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method final partialIsValidUtf8(ILjava/nio/ByteBuffer;II)I
    .locals 4

    .line 427
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->hasArray()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 428
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result v3

    .line 429
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    add-int v1, v3, p3

    add-int v2, v3, p4

    invoke-virtual {p0, p1, v0, v1, v2}, Lcom/google/protobuf/Utf8$Processor;->partialIsValidUtf8(I[BII)I

    move-result v0

    return v0

    .line 430
    :cond_0
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->isDirect()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 431
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/google/protobuf/Utf8$Processor;->partialIsValidUtf8Direct(ILjava/nio/ByteBuffer;II)I

    move-result v0

    return v0

    .line 433
    :cond_1
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/google/protobuf/Utf8$Processor;->partialIsValidUtf8Default(ILjava/nio/ByteBuffer;II)I

    move-result v0

    return v0
.end method

.method abstract partialIsValidUtf8(I[BII)I
.end method

.method final partialIsValidUtf8Default(ILjava/nio/ByteBuffer;II)I
    .locals 5

    .line 449
    if-eqz p1, :cond_d

    .line 457
    if-lt p3, p4, :cond_0

    .line 458
    return p1

    .line 461
    :cond_0
    int-to-byte v2, p1

    .line 463
    const/16 v0, -0x20

    if-ge v2, v0, :cond_2

    .line 468
    const/16 v0, -0x3e

    if-lt v2, v0, :cond_1

    move v0, p3

    add-int/lit8 p3, p3, 0x1

    .line 470
    invoke-virtual {p2, v0}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    const/16 v1, -0x41

    if-le v0, v1, :cond_d

    .line 471
    :cond_1
    const/4 v0, -0x1

    return v0

    .line 473
    :cond_2
    const/16 v0, -0x10

    if-ge v2, v0, :cond_8

    .line 477
    shr-int/lit8 v0, p1, 0x8

    xor-int/lit8 v0, v0, -0x1

    int-to-byte v3, v0

    .line 478
    if-nez v3, :cond_3

    .line 479
    move v0, p3

    add-int/lit8 p3, p3, 0x1

    invoke-virtual {p2, v0}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v3

    .line 480
    if-lt p3, p4, :cond_3

    .line 481
    invoke-static {v2, v3}, Lcom/google/protobuf/Utf8;->access$000(II)I

    move-result v0

    return v0

    .line 484
    :cond_3
    const/16 v0, -0x41

    if-gt v3, v0, :cond_6

    const/16 v0, -0x20

    if-ne v2, v0, :cond_4

    const/16 v0, -0x60

    if-lt v3, v0, :cond_6

    :cond_4
    const/16 v0, -0x13

    if-ne v2, v0, :cond_5

    const/16 v0, -0x60

    if-ge v3, v0, :cond_6

    :cond_5
    move v0, p3

    add-int/lit8 p3, p3, 0x1

    .line 490
    invoke-virtual {p2, v0}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    const/16 v1, -0x41

    if-le v0, v1, :cond_7

    .line 491
    :cond_6
    const/4 v0, -0x1

    return v0

    .line 493
    :cond_7
    goto/16 :goto_0

    .line 497
    :cond_8
    shr-int/lit8 v0, p1, 0x8

    xor-int/lit8 v0, v0, -0x1

    int-to-byte v3, v0

    .line 498
    const/4 v4, 0x0

    .line 499
    if-nez v3, :cond_9

    .line 500
    move v0, p3

    add-int/lit8 p3, p3, 0x1

    invoke-virtual {p2, v0}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v3

    .line 501
    if-lt p3, p4, :cond_a

    .line 502
    invoke-static {v2, v3}, Lcom/google/protobuf/Utf8;->access$000(II)I

    move-result v0

    return v0

    .line 505
    :cond_9
    shr-int/lit8 v0, p1, 0x10

    int-to-byte v4, v0

    .line 507
    :cond_a
    if-nez v4, :cond_b

    .line 508
    move v0, p3

    add-int/lit8 p3, p3, 0x1

    invoke-virtual {p2, v0}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v4

    .line 509
    if-lt p3, p4, :cond_b

    .line 510
    invoke-static {v2, v3, v4}, Lcom/google/protobuf/Utf8;->access$100(III)I

    move-result v0

    return v0

    .line 518
    :cond_b
    const/16 v0, -0x41

    if-gt v3, v0, :cond_c

    shl-int/lit8 v0, v2, 0x1c

    add-int/lit8 v1, v3, 0x70

    add-int/2addr v0, v1

    shr-int/lit8 v0, v0, 0x1e

    if-nez v0, :cond_c

    const/16 v0, -0x41

    if-gt v4, v0, :cond_c

    move v0, p3

    add-int/lit8 p3, p3, 0x1

    .line 527
    invoke-virtual {p2, v0}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    const/16 v1, -0x41

    if-le v0, v1, :cond_d

    .line 528
    :cond_c
    const/4 v0, -0x1

    return v0

    .line 534
    :cond_d
    :goto_0
    invoke-static {p2, p3, p4}, Lcom/google/protobuf/Utf8$Processor;->partialIsValidUtf8(Ljava/nio/ByteBuffer;II)I

    move-result v0

    return v0
.end method

.method abstract partialIsValidUtf8Direct(ILjava/nio/ByteBuffer;II)I
.end method
