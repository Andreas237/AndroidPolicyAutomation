.class Lnet/hockeyapp/android/utils/Base64$Encoder;
.super Lnet/hockeyapp/android/utils/Base64$Coder;
.source "Base64.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/hockeyapp/android/utils/Base64;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "Encoder"
.end annotation


# static fields
.field private static final ENCODE:[B

.field private static final ENCODE_WEBSAFE:[B


# instance fields
.field private final alphabet:[B

.field private count:I

.field public final do_cr:Z

.field public final do_newline:Z

.field public final do_padding:Z

.field private final tail:[B

.field tailLen:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x40

    .line 548
    new-array v1, v0, [B

    fill-array-data v1, :array_0

    sput-object v1, Lnet/hockeyapp/android/utils/Base64$Encoder;->ENCODE:[B

    .line 559
    new-array v0, v0, [B

    fill-array-data v0, :array_1

    sput-object v0, Lnet/hockeyapp/android/utils/Base64$Encoder;->ENCODE_WEBSAFE:[B

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

.method public constructor <init>(I[B)V
    .locals 2

    .line 575
    invoke-direct {p0}, Lnet/hockeyapp/android/utils/Base64$Coder;-><init>()V

    .line 576
    iput-object p2, p0, Lnet/hockeyapp/android/utils/Base64$Encoder;->output:[B

    and-int/lit8 p2, p1, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-nez p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 578
    :goto_0
    iput-boolean p2, p0, Lnet/hockeyapp/android/utils/Base64$Encoder;->do_padding:Z

    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    const/4 p2, 0x1

    goto :goto_1

    :cond_1
    const/4 p2, 0x0

    .line 579
    :goto_1
    iput-boolean p2, p0, Lnet/hockeyapp/android/utils/Base64$Encoder;->do_newline:Z

    and-int/lit8 p2, p1, 0x4

    if-eqz p2, :cond_2

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    .line 580
    :goto_2
    iput-boolean v1, p0, Lnet/hockeyapp/android/utils/Base64$Encoder;->do_cr:Z

    and-int/lit8 p1, p1, 0x8

    if-nez p1, :cond_3

    .line 581
    sget-object p1, Lnet/hockeyapp/android/utils/Base64$Encoder;->ENCODE:[B

    goto :goto_3

    :cond_3
    sget-object p1, Lnet/hockeyapp/android/utils/Base64$Encoder;->ENCODE_WEBSAFE:[B

    :goto_3
    iput-object p1, p0, Lnet/hockeyapp/android/utils/Base64$Encoder;->alphabet:[B

    const/4 p1, 0x2

    .line 583
    new-array p1, p1, [B

    iput-object p1, p0, Lnet/hockeyapp/android/utils/Base64$Encoder;->tail:[B

    .line 584
    iput v0, p0, Lnet/hockeyapp/android/utils/Base64$Encoder;->tailLen:I

    .line 586
    iget-boolean p1, p0, Lnet/hockeyapp/android/utils/Base64$Encoder;->do_newline:Z

    if-eqz p1, :cond_4

    const/16 p1, 0x13

    goto :goto_4

    :cond_4
    const/4 p1, -0x1

    :goto_4
    iput p1, p0, Lnet/hockeyapp/android/utils/Base64$Encoder;->count:I

    return-void
.end method


# virtual methods
.method public process([BIIZ)Z
    .locals 17

    move-object/from16 v0, p0

    .line 599
    iget-object v1, v0, Lnet/hockeyapp/android/utils/Base64$Encoder;->alphabet:[B

    .line 600
    iget-object v2, v0, Lnet/hockeyapp/android/utils/Base64$Encoder;->output:[B

    .line 602
    iget v3, v0, Lnet/hockeyapp/android/utils/Base64$Encoder;->count:I

    add-int v4, p3, p2

    .line 612
    iget v5, v0, Lnet/hockeyapp/android/utils/Base64$Encoder;->tailLen:I

    const/4 v6, -0x1

    const/4 v7, 0x0

    const/4 v8, 0x1

    packed-switch v5, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    add-int/lit8 v5, p2, 0x1

    if-gt v5, v4, :cond_0

    .line 631
    iget-object v9, v0, Lnet/hockeyapp/android/utils/Base64$Encoder;->tail:[B

    aget-byte v10, v9, v7

    and-int/lit16 v10, v10, 0xff

    shl-int/lit8 v10, v10, 0x10

    aget-byte v9, v9, v8

    and-int/lit16 v9, v9, 0xff

    shl-int/lit8 v9, v9, 0x8

    or-int/2addr v9, v10

    aget-byte v10, p1, p2

    and-int/lit16 v10, v10, 0xff

    or-int/2addr v9, v10

    .line 634
    iput v7, v0, Lnet/hockeyapp/android/utils/Base64$Encoder;->tailLen:I

    move v10, v5

    move v5, v9

    goto :goto_1

    :pswitch_1
    add-int/lit8 v5, p2, 0x2

    if-gt v5, v4, :cond_0

    .line 621
    iget-object v5, v0, Lnet/hockeyapp/android/utils/Base64$Encoder;->tail:[B

    aget-byte v5, v5, v7

    and-int/lit16 v5, v5, 0xff

    shl-int/lit8 v5, v5, 0x10

    add-int/lit8 v9, p2, 0x1

    aget-byte v10, p1, p2

    and-int/lit16 v10, v10, 0xff

    shl-int/lit8 v10, v10, 0x8

    or-int/2addr v5, v10

    add-int/lit8 v10, v9, 0x1

    aget-byte v9, p1, v9

    and-int/lit16 v9, v9, 0xff

    or-int/2addr v5, v9

    .line 624
    iput v7, v0, Lnet/hockeyapp/android/utils/Base64$Encoder;->tailLen:I

    goto :goto_1

    :cond_0
    :goto_0
    :pswitch_2
    move/from16 v10, p2

    const/4 v5, -0x1

    :goto_1
    const/4 v11, 0x4

    const/16 v12, 0xd

    const/16 v13, 0xa

    const/4 v14, 0x2

    if-eq v5, v6, :cond_3

    shr-int/lit8 v6, v5, 0x12

    and-int/lit8 v6, v6, 0x3f

    .line 640
    aget-byte v6, v1, v6

    aput-byte v6, v2, v7

    shr-int/lit8 v6, v5, 0xc

    and-int/lit8 v6, v6, 0x3f

    .line 641
    aget-byte v6, v1, v6

    aput-byte v6, v2, v8

    shr-int/lit8 v6, v5, 0x6

    and-int/lit8 v6, v6, 0x3f

    .line 642
    aget-byte v6, v1, v6

    aput-byte v6, v2, v14

    and-int/lit8 v5, v5, 0x3f

    .line 643
    aget-byte v5, v1, v5

    const/4 v6, 0x3

    aput-byte v5, v2, v6

    add-int/lit8 v3, v3, -0x1

    if-nez v3, :cond_2

    .line 645
    iget-boolean v3, v0, Lnet/hockeyapp/android/utils/Base64$Encoder;->do_cr:Z

    if-eqz v3, :cond_1

    const/4 v3, 0x5

    aput-byte v12, v2, v11

    goto :goto_2

    :cond_1
    const/4 v3, 0x4

    :goto_2
    add-int/lit8 v5, v3, 0x1

    .line 646
    aput-byte v13, v2, v3

    const/16 v3, 0x13

    goto :goto_3

    :cond_2
    const/4 v5, 0x4

    goto :goto_3

    :cond_3
    const/4 v5, 0x0

    :goto_3
    add-int/lit8 v6, v10, 0x3

    if-gt v6, v4, :cond_6

    .line 657
    aget-byte v15, p1, v10

    and-int/lit16 v15, v15, 0xff

    shl-int/lit8 v15, v15, 0x10

    add-int/lit8 v16, v10, 0x1

    aget-byte v9, p1, v16

    and-int/lit16 v9, v9, 0xff

    shl-int/lit8 v9, v9, 0x8

    or-int/2addr v9, v15

    add-int/lit8 v10, v10, 0x2

    aget-byte v10, p1, v10

    and-int/lit16 v10, v10, 0xff

    or-int/2addr v9, v10

    shr-int/lit8 v10, v9, 0x12

    and-int/lit8 v10, v10, 0x3f

    .line 660
    aget-byte v10, v1, v10

    aput-byte v10, v2, v5

    add-int/lit8 v10, v5, 0x1

    shr-int/lit8 v15, v9, 0xc

    and-int/lit8 v15, v15, 0x3f

    .line 661
    aget-byte v15, v1, v15

    aput-byte v15, v2, v10

    add-int/lit8 v10, v5, 0x2

    shr-int/lit8 v15, v9, 0x6

    and-int/lit8 v15, v15, 0x3f

    .line 662
    aget-byte v15, v1, v15

    aput-byte v15, v2, v10

    add-int/lit8 v10, v5, 0x3

    and-int/lit8 v9, v9, 0x3f

    .line 663
    aget-byte v9, v1, v9

    aput-byte v9, v2, v10

    add-int/lit8 v5, v5, 0x4

    add-int/lit8 v3, v3, -0x1

    if-nez v3, :cond_5

    .line 667
    iget-boolean v3, v0, Lnet/hockeyapp/android/utils/Base64$Encoder;->do_cr:Z

    if-eqz v3, :cond_4

    add-int/lit8 v3, v5, 0x1

    aput-byte v12, v2, v5

    goto :goto_4

    :cond_4
    move v3, v5

    :goto_4
    add-int/lit8 v5, v3, 0x1

    .line 668
    aput-byte v13, v2, v3

    move v10, v6

    const/16 v3, 0x13

    goto :goto_3

    :cond_5
    move v10, v6

    goto :goto_3

    :cond_6
    if-eqz p4, :cond_14

    .line 679
    iget v6, v0, Lnet/hockeyapp/android/utils/Base64$Encoder;->tailLen:I

    sub-int v9, v10, v6

    add-int/lit8 v15, v4, -0x1

    if-ne v9, v15, :cond_a

    if-lez v6, :cond_7

    .line 681
    iget-object v6, v0, Lnet/hockeyapp/android/utils/Base64$Encoder;->tail:[B

    aget-byte v6, v6, v7

    const/4 v7, 0x1

    goto :goto_5

    :cond_7
    add-int/lit8 v6, v10, 0x1

    aget-byte v9, p1, v10

    move v10, v6

    move v6, v9

    :goto_5
    and-int/lit16 v6, v6, 0xff

    shl-int/2addr v6, v11

    .line 682
    iget v9, v0, Lnet/hockeyapp/android/utils/Base64$Encoder;->tailLen:I

    sub-int/2addr v9, v7

    iput v9, v0, Lnet/hockeyapp/android/utils/Base64$Encoder;->tailLen:I

    add-int/lit8 v7, v5, 0x1

    shr-int/lit8 v9, v6, 0x6

    and-int/lit8 v9, v9, 0x3f

    .line 683
    aget-byte v9, v1, v9

    aput-byte v9, v2, v5

    add-int/lit8 v5, v7, 0x1

    and-int/lit8 v6, v6, 0x3f

    .line 684
    aget-byte v1, v1, v6

    aput-byte v1, v2, v7

    .line 685
    iget-boolean v1, v0, Lnet/hockeyapp/android/utils/Base64$Encoder;->do_padding:Z

    if-eqz v1, :cond_8

    add-int/lit8 v1, v5, 0x1

    const/16 v6, 0x3d

    .line 686
    aput-byte v6, v2, v5

    add-int/lit8 v5, v1, 0x1

    .line 687
    aput-byte v6, v2, v1

    .line 689
    :cond_8
    iget-boolean v1, v0, Lnet/hockeyapp/android/utils/Base64$Encoder;->do_newline:Z

    if-eqz v1, :cond_12

    .line 690
    iget-boolean v1, v0, Lnet/hockeyapp/android/utils/Base64$Encoder;->do_cr:Z

    if-eqz v1, :cond_9

    add-int/lit8 v1, v5, 0x1

    aput-byte v12, v2, v5

    goto :goto_6

    :cond_9
    move v1, v5

    :goto_6
    add-int/lit8 v5, v1, 0x1

    .line 691
    aput-byte v13, v2, v1

    goto/16 :goto_b

    :cond_a
    sub-int v9, v10, v6

    add-int/lit8 v11, v4, -0x2

    if-ne v9, v11, :cond_10

    if-le v6, v8, :cond_b

    .line 695
    iget-object v6, v0, Lnet/hockeyapp/android/utils/Base64$Encoder;->tail:[B

    aget-byte v6, v6, v7

    const/4 v7, 0x1

    goto :goto_7

    :cond_b
    add-int/lit8 v6, v10, 0x1

    aget-byte v9, p1, v10

    move v10, v6

    move v6, v9

    :goto_7
    and-int/lit16 v6, v6, 0xff

    shl-int/2addr v6, v13

    iget v9, v0, Lnet/hockeyapp/android/utils/Base64$Encoder;->tailLen:I

    if-lez v9, :cond_c

    iget-object v9, v0, Lnet/hockeyapp/android/utils/Base64$Encoder;->tail:[B

    add-int/lit8 v11, v7, 0x1

    aget-byte v7, v9, v7

    goto :goto_8

    :cond_c
    add-int/lit8 v9, v10, 0x1

    aget-byte v10, p1, v10

    move v11, v7

    move v7, v10

    move v10, v9

    :goto_8
    and-int/lit16 v7, v7, 0xff

    shl-int/2addr v7, v14

    or-int/2addr v6, v7

    .line 697
    iget v7, v0, Lnet/hockeyapp/android/utils/Base64$Encoder;->tailLen:I

    sub-int/2addr v7, v11

    iput v7, v0, Lnet/hockeyapp/android/utils/Base64$Encoder;->tailLen:I

    add-int/lit8 v7, v5, 0x1

    shr-int/lit8 v9, v6, 0xc

    and-int/lit8 v9, v9, 0x3f

    .line 698
    aget-byte v9, v1, v9

    aput-byte v9, v2, v5

    add-int/lit8 v5, v7, 0x1

    shr-int/lit8 v9, v6, 0x6

    and-int/lit8 v9, v9, 0x3f

    .line 699
    aget-byte v9, v1, v9

    aput-byte v9, v2, v7

    add-int/lit8 v7, v5, 0x1

    and-int/lit8 v6, v6, 0x3f

    .line 700
    aget-byte v1, v1, v6

    aput-byte v1, v2, v5

    .line 701
    iget-boolean v1, v0, Lnet/hockeyapp/android/utils/Base64$Encoder;->do_padding:Z

    if-eqz v1, :cond_d

    add-int/lit8 v1, v7, 0x1

    const/16 v5, 0x3d

    .line 702
    aput-byte v5, v2, v7

    goto :goto_9

    :cond_d
    move v1, v7

    .line 704
    :goto_9
    iget-boolean v5, v0, Lnet/hockeyapp/android/utils/Base64$Encoder;->do_newline:Z

    if-eqz v5, :cond_f

    .line 705
    iget-boolean v5, v0, Lnet/hockeyapp/android/utils/Base64$Encoder;->do_cr:Z

    if-eqz v5, :cond_e

    add-int/lit8 v5, v1, 0x1

    aput-byte v12, v2, v1

    move v1, v5

    :cond_e
    add-int/lit8 v5, v1, 0x1

    .line 706
    aput-byte v13, v2, v1

    move v1, v5

    :cond_f
    move v5, v1

    goto :goto_b

    .line 708
    :cond_10
    iget-boolean v1, v0, Lnet/hockeyapp/android/utils/Base64$Encoder;->do_newline:Z

    if-eqz v1, :cond_12

    if-lez v5, :cond_12

    const/16 v1, 0x13

    if-eq v3, v1, :cond_12

    .line 709
    iget-boolean v1, v0, Lnet/hockeyapp/android/utils/Base64$Encoder;->do_cr:Z

    if-eqz v1, :cond_11

    add-int/lit8 v1, v5, 0x1

    aput-byte v12, v2, v5

    goto :goto_a

    :cond_11
    move v1, v5

    :goto_a
    add-int/lit8 v5, v1, 0x1

    .line 710
    aput-byte v13, v2, v1

    .line 713
    :cond_12
    :goto_b
    iget v1, v0, Lnet/hockeyapp/android/utils/Base64$Encoder;->tailLen:I

    if-eqz v1, :cond_13

    const-string v1, "BASE64"

    const-string v2, "Error during encoding"

    .line 714
    invoke-static {v1, v2}, Lnet/hockeyapp/android/utils/HockeyLog;->error(Ljava/lang/String;Ljava/lang/String;)V

    :cond_13
    if-eq v10, v4, :cond_16

    const-string v1, "BASE64"

    const-string v2, "Error during encoding"

    .line 718
    invoke-static {v1, v2}, Lnet/hockeyapp/android/utils/HockeyLog;->error(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_c

    :cond_14
    add-int/lit8 v1, v4, -0x1

    if-ne v10, v1, :cond_15

    .line 726
    iget-object v1, v0, Lnet/hockeyapp/android/utils/Base64$Encoder;->tail:[B

    iget v2, v0, Lnet/hockeyapp/android/utils/Base64$Encoder;->tailLen:I

    add-int/lit8 v4, v2, 0x1

    iput v4, v0, Lnet/hockeyapp/android/utils/Base64$Encoder;->tailLen:I

    aget-byte v4, p1, v10

    aput-byte v4, v1, v2

    goto :goto_c

    :cond_15
    sub-int/2addr v4, v14

    if-ne v10, v4, :cond_16

    .line 728
    iget-object v1, v0, Lnet/hockeyapp/android/utils/Base64$Encoder;->tail:[B

    iget v2, v0, Lnet/hockeyapp/android/utils/Base64$Encoder;->tailLen:I

    add-int/lit8 v4, v2, 0x1

    iput v4, v0, Lnet/hockeyapp/android/utils/Base64$Encoder;->tailLen:I

    aget-byte v4, p1, v10

    aput-byte v4, v1, v2

    .line 729
    iget v2, v0, Lnet/hockeyapp/android/utils/Base64$Encoder;->tailLen:I

    add-int/lit8 v4, v2, 0x1

    iput v4, v0, Lnet/hockeyapp/android/utils/Base64$Encoder;->tailLen:I

    add-int/2addr v10, v8

    aget-byte v4, p1, v10

    aput-byte v4, v1, v2

    .line 733
    :cond_16
    :goto_c
    iput v5, v0, Lnet/hockeyapp/android/utils/Base64$Encoder;->op:I

    .line 734
    iput v3, v0, Lnet/hockeyapp/android/utils/Base64$Encoder;->count:I

    return v8

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
