.class public Lio/streamroot/dna/core/binary/hash/HashFunction;
.super Ljava/lang/Object;
.source "HashFunction.java"


# static fields
.field static final FAILED_HASH_VALUE:Ljava/lang/String; = ""


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static computeHash([Ljava/nio/ByteBuffer;I)Ljava/lang/String;
    .locals 11

    if-eqz p0, :cond_5

    .line 9
    array-length v0, p0

    if-nez v0, :cond_0

    goto/16 :goto_3

    :cond_0
    const/4 v0, 0x0

    .line 18
    aget-object v1, p0, v0

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v1

    new-array v1, v1, [B

    .line 21
    array-length v2, p0

    move v3, v0

    move v4, v3

    move v5, v4

    :goto_0
    const v6, 0x1b873593

    const v7, -0x3361d2af    # -8.2930312E7f

    if-ge v3, v2, :cond_3

    aget-object v5, p0, v3

    if-nez v5, :cond_1

    const-string p0, ""

    return-object p0

    .line 26
    :cond_1
    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->asReadOnlyBuffer()Ljava/nio/ByteBuffer;

    move-result-object v5

    .line 27
    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 28
    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->limit()I

    move-result v8

    invoke-virtual {v5, v1, v0, v8}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 29
    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->limit()I

    move-result v5

    and-int/lit8 v5, v5, -0x4

    move v8, v4

    move v4, v0

    :goto_1
    if-ge v4, v5, :cond_2

    .line 32
    aget-byte v9, v1, v4

    and-int/lit16 v9, v9, 0xff

    add-int/lit8 v10, v4, 0x1

    aget-byte v10, v1, v10

    and-int/lit16 v10, v10, 0xff

    shl-int/lit8 v10, v10, 0x8

    or-int/2addr v9, v10

    add-int/lit8 v10, v4, 0x2

    aget-byte v10, v1, v10

    and-int/lit16 v10, v10, 0xff

    shl-int/lit8 v10, v10, 0x10

    or-int/2addr v9, v10

    add-int/lit8 v10, v4, 0x3

    aget-byte v10, v1, v10

    shl-int/lit8 v10, v10, 0x18

    or-int/2addr v9, v10

    mul-int/2addr v9, v7

    shl-int/lit8 v10, v9, 0xf

    ushr-int/lit8 v9, v9, 0x11

    or-int/2addr v9, v10

    mul-int/2addr v9, v6

    xor-int/2addr v8, v9

    shl-int/lit8 v9, v8, 0xd

    ushr-int/lit8 v8, v8, 0x13

    or-int/2addr v8, v9

    mul-int/lit8 v8, v8, 0x5

    const v9, -0x19ab949c

    add-int/2addr v8, v9

    add-int/lit8 v4, v4, 0x4

    goto :goto_1

    :cond_2
    add-int/lit8 v3, v3, 0x1

    move v4, v8

    goto :goto_0

    :cond_3
    and-int/lit8 p0, p1, 0x3

    if-lez p0, :cond_4

    packed-switch p0, :pswitch_data_0

    goto :goto_2

    :pswitch_0
    add-int/lit8 p0, v5, 0x2

    .line 49
    aget-byte p0, v1, p0

    and-int/lit16 p0, p0, 0xff

    shl-int/lit8 v0, p0, 0x10

    :pswitch_1
    add-int/lit8 p0, v5, 0x1

    .line 52
    aget-byte p0, v1, p0

    and-int/lit16 p0, p0, 0xff

    shl-int/lit8 p0, p0, 0x8

    or-int/2addr v0, p0

    .line 55
    :pswitch_2
    aget-byte p0, v1, v5

    and-int/lit16 p0, p0, 0xff

    or-int/2addr p0, v0

    mul-int/2addr p0, v7

    shl-int/lit8 v0, p0, 0xf

    ushr-int/lit8 p0, p0, 0x11

    or-int/2addr p0, v0

    mul-int/2addr p0, v6

    xor-int/2addr v4, p0

    :cond_4
    :goto_2
    xor-int p0, v4, p1

    ushr-int/lit8 p1, p0, 0x10

    xor-int/2addr p0, p1

    const p1, -0x7a143595

    mul-int/2addr p0, p1

    ushr-int/lit8 p1, p0, 0xd

    xor-int/2addr p0, p1

    const p1, -0x3d4d51cb

    mul-int/2addr p0, p1

    ushr-int/lit8 p1, p0, 0x10

    xor-int/2addr p0, p1

    .line 73
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_5
    :goto_3
    const-string p0, ""

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
