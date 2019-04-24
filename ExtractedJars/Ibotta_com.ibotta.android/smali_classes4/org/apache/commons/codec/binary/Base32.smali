.class public Lorg/apache/commons/codec/binary/Base32;
.super Lorg/apache/commons/codec/binary/BaseNCodec;
.source "Base32.java"


# static fields
.field private static final BITS_PER_ENCODED_BYTE:I = 0x5

.field private static final BYTES_PER_ENCODED_BLOCK:I = 0x8

.field private static final BYTES_PER_UNENCODED_BLOCK:I = 0x5

.field private static final CHUNK_SEPARATOR:[B

.field private static final DECODE_TABLE:[B

.field private static final ENCODE_TABLE:[B

.field private static final HEX_DECODE_TABLE:[B

.field private static final HEX_ENCODE_TABLE:[B

.field private static final MASK_5BITS:I = 0x1f


# instance fields
.field private bitWorkArea:J

.field private final decodeSize:I

.field private final decodeTable:[B

.field private final encodeSize:I

.field private final encodeTable:[B

.field private final lineSeparator:[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x2

    .line 60
    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Lorg/apache/commons/codec/binary/Base32;->CHUNK_SEPARATOR:[B

    const/16 v0, 0x5b

    .line 68
    new-array v0, v0, [B

    fill-array-data v0, :array_1

    sput-object v0, Lorg/apache/commons/codec/binary/Base32;->DECODE_TABLE:[B

    const/16 v0, 0x20

    .line 82
    new-array v1, v0, [B

    fill-array-data v1, :array_2

    sput-object v1, Lorg/apache/commons/codec/binary/Base32;->ENCODE_TABLE:[B

    const/16 v1, 0x58

    .line 94
    new-array v1, v1, [B

    fill-array-data v1, :array_3

    sput-object v1, Lorg/apache/commons/codec/binary/Base32;->HEX_DECODE_TABLE:[B

    .line 108
    new-array v0, v0, [B

    fill-array-data v0, :array_4

    sput-object v0, Lorg/apache/commons/codec/binary/Base32;->HEX_ENCODE_TABLE:[B

    return-void

    nop

    :array_0
    .array-data 1
        0xdt
        0xat
    .end array-data

    nop

    :array_1
    .array-data 1
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        0x3ft
        -0x1t
        -0x1t
        0x1at
        0x1bt
        0x1ct
        0x1dt
        0x1et
        0x1ft
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        0x0t
        0x1t
        0x2t
        0x3t
        0x4t
        0x5t
        0x6t
        0x7t
        0x8t
        0x9t
        0xat
        0xbt
        0xct
        0xdt
        0xet
        0xft
        0x10t
        0x11t
        0x12t
        0x13t
        0x14t
        0x15t
        0x16t
        0x17t
        0x18t
        0x19t
    .end array-data

    :array_2
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
        0x32t
        0x33t
        0x34t
        0x35t
        0x36t
        0x37t
    .end array-data

    :array_3
    .array-data 1
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        0x3ft
        0x0t
        0x1t
        0x2t
        0x3t
        0x4t
        0x5t
        0x6t
        0x7t
        0x8t
        0x9t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        0xat
        0xbt
        0xct
        0xdt
        0xet
        0xft
        0x10t
        0x11t
        0x12t
        0x13t
        0x14t
        0x15t
        0x16t
        0x17t
        0x18t
        0x19t
        0x1at
        0x1bt
        0x1ct
        0x1dt
        0x1et
        0x1ft
        0x20t
    .end array-data

    :array_4
    .array-data 1
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
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 162
    invoke-direct {p0, v0}, Lorg/apache/commons/codec/binary/Base32;-><init>(Z)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 187
    sget-object v0, Lorg/apache/commons/codec/binary/Base32;->CHUNK_SEPARATOR:[B

    invoke-direct {p0, p1, v0}, Lorg/apache/commons/codec/binary/Base32;-><init>(I[B)V

    return-void
.end method

.method public constructor <init>(I[B)V
    .locals 1

    const/4 v0, 0x0

    .line 208
    invoke-direct {p0, p1, p2, v0}, Lorg/apache/commons/codec/binary/Base32;-><init>(I[BZ)V

    return-void
.end method

.method public constructor <init>(I[BZ)V
    .locals 4

    const/4 v0, 0x0

    if-nez p2, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    .line 231
    :cond_0
    array-length v1, p2

    :goto_0
    const/16 v2, 0x8

    const/4 v3, 0x5

    invoke-direct {p0, v3, v2, p1, v1}, Lorg/apache/commons/codec/binary/BaseNCodec;-><init>(IIII)V

    if-eqz p3, :cond_1

    .line 235
    sget-object p3, Lorg/apache/commons/codec/binary/Base32;->HEX_ENCODE_TABLE:[B

    iput-object p3, p0, Lorg/apache/commons/codec/binary/Base32;->encodeTable:[B

    .line 236
    sget-object p3, Lorg/apache/commons/codec/binary/Base32;->HEX_DECODE_TABLE:[B

    iput-object p3, p0, Lorg/apache/commons/codec/binary/Base32;->decodeTable:[B

    goto :goto_1

    .line 238
    :cond_1
    sget-object p3, Lorg/apache/commons/codec/binary/Base32;->ENCODE_TABLE:[B

    iput-object p3, p0, Lorg/apache/commons/codec/binary/Base32;->encodeTable:[B

    .line 239
    sget-object p3, Lorg/apache/commons/codec/binary/Base32;->DECODE_TABLE:[B

    iput-object p3, p0, Lorg/apache/commons/codec/binary/Base32;->decodeTable:[B

    :goto_1
    if-lez p1, :cond_4

    if-eqz p2, :cond_3

    .line 246
    invoke-virtual {p0, p2}, Lorg/apache/commons/codec/binary/Base32;->containsAlphabetOrPad([B)Z

    move-result p1

    if-nez p1, :cond_2

    .line 250
    array-length p1, p2

    add-int/2addr p1, v2

    iput p1, p0, Lorg/apache/commons/codec/binary/Base32;->encodeSize:I

    .line 251
    array-length p1, p2

    new-array p1, p1, [B

    iput-object p1, p0, Lorg/apache/commons/codec/binary/Base32;->lineSeparator:[B

    .line 252
    iget-object p1, p0, Lorg/apache/commons/codec/binary/Base32;->lineSeparator:[B

    array-length p3, p2

    invoke-static {p2, v0, p1, v0, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_2

    .line 247
    :cond_2
    invoke-static {p2}, Lorg/apache/commons/codec/binary/StringUtils;->newStringUtf8([B)Ljava/lang/String;

    move-result-object p1

    .line 248
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "lineSeparator must not contain Base32 characters: ["

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "]"

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 243
    :cond_3
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "lineLength "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " > 0, but lineSeparator is null"

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 254
    :cond_4
    iput v2, p0, Lorg/apache/commons/codec/binary/Base32;->encodeSize:I

    const/4 p1, 0x0

    .line 255
    iput-object p1, p0, Lorg/apache/commons/codec/binary/Base32;->lineSeparator:[B

    .line 257
    :goto_2
    iget p1, p0, Lorg/apache/commons/codec/binary/Base32;->encodeSize:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lorg/apache/commons/codec/binary/Base32;->decodeSize:I

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 173
    invoke-direct {p0, v0, v1, p1}, Lorg/apache/commons/codec/binary/Base32;-><init>(I[BZ)V

    return-void
.end method


# virtual methods
.method decode([BII)V
    .locals 12

    .line 283
    iget-boolean v0, p0, Lorg/apache/commons/codec/binary/Base32;->eof:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    if-gez p3, :cond_1

    .line 287
    iput-boolean v0, p0, Lorg/apache/commons/codec/binary/Base32;->eof:Z

    :cond_1
    const/4 v1, 0x0

    :goto_0
    const/16 v2, 0x18

    const/16 v3, 0x10

    const/16 v4, 0x8

    const-wide/16 v5, 0xff

    if-ge v1, p3, :cond_4

    add-int/lit8 v7, p2, 0x1

    .line 290
    aget-byte p2, p1, p2

    const/16 v8, 0x3d

    if-ne p2, v8, :cond_2

    .line 293
    iput-boolean v0, p0, Lorg/apache/commons/codec/binary/Base32;->eof:Z

    goto/16 :goto_1

    .line 296
    :cond_2
    iget v8, p0, Lorg/apache/commons/codec/binary/Base32;->decodeSize:I

    invoke-virtual {p0, v8}, Lorg/apache/commons/codec/binary/Base32;->ensureBufferSize(I)V

    if-ltz p2, :cond_3

    .line 297
    iget-object v8, p0, Lorg/apache/commons/codec/binary/Base32;->decodeTable:[B

    array-length v9, v8

    if-ge p2, v9, :cond_3

    .line 298
    aget-byte p2, v8, p2

    if-ltz p2, :cond_3

    .line 300
    iget v8, p0, Lorg/apache/commons/codec/binary/Base32;->modulus:I

    add-int/2addr v8, v0

    rem-int/2addr v8, v4

    iput v8, p0, Lorg/apache/commons/codec/binary/Base32;->modulus:I

    .line 301
    iget-wide v8, p0, Lorg/apache/commons/codec/binary/Base32;->bitWorkArea:J

    const/4 v10, 0x5

    shl-long/2addr v8, v10

    int-to-long v10, p2

    add-long/2addr v8, v10

    iput-wide v8, p0, Lorg/apache/commons/codec/binary/Base32;->bitWorkArea:J

    .line 302
    iget p2, p0, Lorg/apache/commons/codec/binary/Base32;->modulus:I

    if-nez p2, :cond_3

    .line 303
    iget-object p2, p0, Lorg/apache/commons/codec/binary/Base32;->buffer:[B

    iget v8, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v9, v8, 0x1

    iput v9, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    iget-wide v9, p0, Lorg/apache/commons/codec/binary/Base32;->bitWorkArea:J

    const/16 v11, 0x20

    shr-long/2addr v9, v11

    and-long/2addr v9, v5

    long-to-int v10, v9

    int-to-byte v9, v10

    aput-byte v9, p2, v8

    .line 304
    iget-object p2, p0, Lorg/apache/commons/codec/binary/Base32;->buffer:[B

    iget v8, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v9, v8, 0x1

    iput v9, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    iget-wide v9, p0, Lorg/apache/commons/codec/binary/Base32;->bitWorkArea:J

    shr-long/2addr v9, v2

    and-long/2addr v9, v5

    long-to-int v2, v9

    int-to-byte v2, v2

    aput-byte v2, p2, v8

    .line 305
    iget-object p2, p0, Lorg/apache/commons/codec/binary/Base32;->buffer:[B

    iget v2, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v8, v2, 0x1

    iput v8, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    iget-wide v8, p0, Lorg/apache/commons/codec/binary/Base32;->bitWorkArea:J

    shr-long/2addr v8, v3

    and-long/2addr v8, v5

    long-to-int v3, v8

    int-to-byte v3, v3

    aput-byte v3, p2, v2

    .line 306
    iget-object p2, p0, Lorg/apache/commons/codec/binary/Base32;->buffer:[B

    iget v2, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    iget-wide v8, p0, Lorg/apache/commons/codec/binary/Base32;->bitWorkArea:J

    shr-long v3, v8, v4

    and-long/2addr v3, v5

    long-to-int v4, v3

    int-to-byte v3, v4

    aput-byte v3, p2, v2

    .line 307
    iget-object p2, p0, Lorg/apache/commons/codec/binary/Base32;->buffer:[B

    iget v2, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    iget-wide v3, p0, Lorg/apache/commons/codec/binary/Base32;->bitWorkArea:J

    and-long/2addr v3, v5

    long-to-int v4, v3

    int-to-byte v3, v4

    aput-byte v3, p2, v2

    :cond_3
    add-int/lit8 v1, v1, 0x1

    move p2, v7

    goto/16 :goto_0

    .line 317
    :cond_4
    :goto_1
    iget-boolean p1, p0, Lorg/apache/commons/codec/binary/Base32;->eof:Z

    if-eqz p1, :cond_5

    iget p1, p0, Lorg/apache/commons/codec/binary/Base32;->modulus:I

    const/4 p2, 0x2

    if-lt p1, p2, :cond_5

    .line 318
    iget p1, p0, Lorg/apache/commons/codec/binary/Base32;->decodeSize:I

    invoke-virtual {p0, p1}, Lorg/apache/commons/codec/binary/Base32;->ensureBufferSize(I)V

    .line 321
    iget p1, p0, Lorg/apache/commons/codec/binary/Base32;->modulus:I

    packed-switch p1, :pswitch_data_0

    goto/16 :goto_2

    .line 346
    :pswitch_0
    iget-wide p1, p0, Lorg/apache/commons/codec/binary/Base32;->bitWorkArea:J

    const/4 p3, 0x3

    shr-long/2addr p1, p3

    iput-wide p1, p0, Lorg/apache/commons/codec/binary/Base32;->bitWorkArea:J

    .line 347
    iget-object p1, p0, Lorg/apache/commons/codec/binary/Base32;->buffer:[B

    iget p2, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 p3, p2, 0x1

    iput p3, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    iget-wide v0, p0, Lorg/apache/commons/codec/binary/Base32;->bitWorkArea:J

    shr-long/2addr v0, v2

    and-long/2addr v0, v5

    long-to-int p3, v0

    int-to-byte p3, p3

    aput-byte p3, p1, p2

    .line 348
    iget-object p1, p0, Lorg/apache/commons/codec/binary/Base32;->buffer:[B

    iget p2, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 p3, p2, 0x1

    iput p3, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    iget-wide v0, p0, Lorg/apache/commons/codec/binary/Base32;->bitWorkArea:J

    shr-long/2addr v0, v3

    and-long/2addr v0, v5

    long-to-int p3, v0

    int-to-byte p3, p3

    aput-byte p3, p1, p2

    .line 349
    iget-object p1, p0, Lorg/apache/commons/codec/binary/Base32;->buffer:[B

    iget p2, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 p3, p2, 0x1

    iput p3, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    iget-wide v0, p0, Lorg/apache/commons/codec/binary/Base32;->bitWorkArea:J

    shr-long/2addr v0, v4

    and-long/2addr v0, v5

    long-to-int p3, v0

    int-to-byte p3, p3

    aput-byte p3, p1, p2

    .line 350
    iget-object p1, p0, Lorg/apache/commons/codec/binary/Base32;->buffer:[B

    iget p2, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 p3, p2, 0x1

    iput p3, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    iget-wide v0, p0, Lorg/apache/commons/codec/binary/Base32;->bitWorkArea:J

    and-long/2addr v0, v5

    long-to-int p3, v0

    int-to-byte p3, p3

    aput-byte p3, p1, p2

    goto/16 :goto_2

    .line 340
    :pswitch_1
    iget-wide p1, p0, Lorg/apache/commons/codec/binary/Base32;->bitWorkArea:J

    const/4 p3, 0x6

    shr-long/2addr p1, p3

    iput-wide p1, p0, Lorg/apache/commons/codec/binary/Base32;->bitWorkArea:J

    .line 341
    iget-object p1, p0, Lorg/apache/commons/codec/binary/Base32;->buffer:[B

    iget p2, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 p3, p2, 0x1

    iput p3, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    iget-wide v0, p0, Lorg/apache/commons/codec/binary/Base32;->bitWorkArea:J

    shr-long/2addr v0, v3

    and-long/2addr v0, v5

    long-to-int p3, v0

    int-to-byte p3, p3

    aput-byte p3, p1, p2

    .line 342
    iget-object p1, p0, Lorg/apache/commons/codec/binary/Base32;->buffer:[B

    iget p2, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 p3, p2, 0x1

    iput p3, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    iget-wide v0, p0, Lorg/apache/commons/codec/binary/Base32;->bitWorkArea:J

    shr-long/2addr v0, v4

    and-long/2addr v0, v5

    long-to-int p3, v0

    int-to-byte p3, p3

    aput-byte p3, p1, p2

    .line 343
    iget-object p1, p0, Lorg/apache/commons/codec/binary/Base32;->buffer:[B

    iget p2, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 p3, p2, 0x1

    iput p3, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    iget-wide v0, p0, Lorg/apache/commons/codec/binary/Base32;->bitWorkArea:J

    and-long/2addr v0, v5

    long-to-int p3, v0

    int-to-byte p3, p3

    aput-byte p3, p1, p2

    goto/16 :goto_2

    .line 334
    :pswitch_2
    iget-wide p1, p0, Lorg/apache/commons/codec/binary/Base32;->bitWorkArea:J

    shr-long/2addr p1, v0

    iput-wide p1, p0, Lorg/apache/commons/codec/binary/Base32;->bitWorkArea:J

    .line 335
    iget-object p1, p0, Lorg/apache/commons/codec/binary/Base32;->buffer:[B

    iget p2, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 p3, p2, 0x1

    iput p3, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    iget-wide v0, p0, Lorg/apache/commons/codec/binary/Base32;->bitWorkArea:J

    shr-long/2addr v0, v3

    and-long/2addr v0, v5

    long-to-int p3, v0

    int-to-byte p3, p3

    aput-byte p3, p1, p2

    .line 336
    iget-object p1, p0, Lorg/apache/commons/codec/binary/Base32;->buffer:[B

    iget p2, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 p3, p2, 0x1

    iput p3, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    iget-wide v0, p0, Lorg/apache/commons/codec/binary/Base32;->bitWorkArea:J

    shr-long/2addr v0, v4

    and-long/2addr v0, v5

    long-to-int p3, v0

    int-to-byte p3, p3

    aput-byte p3, p1, p2

    .line 337
    iget-object p1, p0, Lorg/apache/commons/codec/binary/Base32;->buffer:[B

    iget p2, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 p3, p2, 0x1

    iput p3, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    iget-wide v0, p0, Lorg/apache/commons/codec/binary/Base32;->bitWorkArea:J

    and-long/2addr v0, v5

    long-to-int p3, v0

    int-to-byte p3, p3

    aput-byte p3, p1, p2

    goto :goto_2

    .line 329
    :pswitch_3
    iget-wide p1, p0, Lorg/apache/commons/codec/binary/Base32;->bitWorkArea:J

    const/4 p3, 0x4

    shr-long/2addr p1, p3

    iput-wide p1, p0, Lorg/apache/commons/codec/binary/Base32;->bitWorkArea:J

    .line 330
    iget-object p1, p0, Lorg/apache/commons/codec/binary/Base32;->buffer:[B

    iget p2, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 p3, p2, 0x1

    iput p3, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    iget-wide v0, p0, Lorg/apache/commons/codec/binary/Base32;->bitWorkArea:J

    shr-long/2addr v0, v4

    and-long/2addr v0, v5

    long-to-int p3, v0

    int-to-byte p3, p3

    aput-byte p3, p1, p2

    .line 331
    iget-object p1, p0, Lorg/apache/commons/codec/binary/Base32;->buffer:[B

    iget p2, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 p3, p2, 0x1

    iput p3, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    iget-wide v0, p0, Lorg/apache/commons/codec/binary/Base32;->bitWorkArea:J

    and-long/2addr v0, v5

    long-to-int p3, v0

    int-to-byte p3, p3

    aput-byte p3, p1, p2

    goto :goto_2

    .line 326
    :pswitch_4
    iget-object p1, p0, Lorg/apache/commons/codec/binary/Base32;->buffer:[B

    iget p2, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 p3, p2, 0x1

    iput p3, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    iget-wide v0, p0, Lorg/apache/commons/codec/binary/Base32;->bitWorkArea:J

    const/4 p3, 0x7

    shr-long/2addr v0, p3

    and-long/2addr v0, v5

    long-to-int p3, v0

    int-to-byte p3, p3

    aput-byte p3, p1, p2

    goto :goto_2

    .line 323
    :pswitch_5
    iget-object p1, p0, Lorg/apache/commons/codec/binary/Base32;->buffer:[B

    iget p3, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v0, p3, 0x1

    iput v0, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    iget-wide v0, p0, Lorg/apache/commons/codec/binary/Base32;->bitWorkArea:J

    shr-long/2addr v0, p2

    and-long/2addr v0, v5

    long-to-int p2, v0

    int-to-byte p2, p2

    aput-byte p2, p1, p3

    :cond_5
    :goto_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method encode([BII)V
    .locals 11

    .line 372
    iget-boolean v0, p0, Lorg/apache/commons/codec/binary/Base32;->eof:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x1

    if-gez p3, :cond_2

    .line 378
    iput-boolean v1, p0, Lorg/apache/commons/codec/binary/Base32;->eof:Z

    .line 379
    iget p1, p0, Lorg/apache/commons/codec/binary/Base32;->modulus:I

    if-nez p1, :cond_1

    iget p1, p0, Lorg/apache/commons/codec/binary/Base32;->lineLength:I

    if-nez p1, :cond_1

    return-void

    .line 382
    :cond_1
    iget p1, p0, Lorg/apache/commons/codec/binary/Base32;->encodeSize:I

    invoke-virtual {p0, p1}, Lorg/apache/commons/codec/binary/Base32;->ensureBufferSize(I)V

    .line 383
    iget p1, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    .line 384
    iget p2, p0, Lorg/apache/commons/codec/binary/Base32;->modulus:I

    const/4 p3, 0x4

    const/4 v2, 0x2

    const/4 v3, 0x3

    const/16 v4, 0x3d

    packed-switch p2, :pswitch_data_0

    goto/16 :goto_0

    .line 417
    :pswitch_0
    iget-object p2, p0, Lorg/apache/commons/codec/binary/Base32;->buffer:[B

    iget p3, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v1, p3, 0x1

    iput v1, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    iget-object v1, p0, Lorg/apache/commons/codec/binary/Base32;->encodeTable:[B

    iget-wide v5, p0, Lorg/apache/commons/codec/binary/Base32;->bitWorkArea:J

    const/16 v7, 0x1b

    shr-long/2addr v5, v7

    long-to-int v6, v5

    and-int/lit8 v5, v6, 0x1f

    aget-byte v1, v1, v5

    aput-byte v1, p2, p3

    .line 418
    iget-object p2, p0, Lorg/apache/commons/codec/binary/Base32;->buffer:[B

    iget p3, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v1, p3, 0x1

    iput v1, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    iget-object v1, p0, Lorg/apache/commons/codec/binary/Base32;->encodeTable:[B

    iget-wide v5, p0, Lorg/apache/commons/codec/binary/Base32;->bitWorkArea:J

    const/16 v7, 0x16

    shr-long/2addr v5, v7

    long-to-int v6, v5

    and-int/lit8 v5, v6, 0x1f

    aget-byte v1, v1, v5

    aput-byte v1, p2, p3

    .line 419
    iget-object p2, p0, Lorg/apache/commons/codec/binary/Base32;->buffer:[B

    iget p3, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v1, p3, 0x1

    iput v1, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    iget-object v1, p0, Lorg/apache/commons/codec/binary/Base32;->encodeTable:[B

    iget-wide v5, p0, Lorg/apache/commons/codec/binary/Base32;->bitWorkArea:J

    const/16 v7, 0x11

    shr-long/2addr v5, v7

    long-to-int v6, v5

    and-int/lit8 v5, v6, 0x1f

    aget-byte v1, v1, v5

    aput-byte v1, p2, p3

    .line 420
    iget-object p2, p0, Lorg/apache/commons/codec/binary/Base32;->buffer:[B

    iget p3, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v1, p3, 0x1

    iput v1, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    iget-object v1, p0, Lorg/apache/commons/codec/binary/Base32;->encodeTable:[B

    iget-wide v5, p0, Lorg/apache/commons/codec/binary/Base32;->bitWorkArea:J

    const/16 v7, 0xc

    shr-long/2addr v5, v7

    long-to-int v6, v5

    and-int/lit8 v5, v6, 0x1f

    aget-byte v1, v1, v5

    aput-byte v1, p2, p3

    .line 421
    iget-object p2, p0, Lorg/apache/commons/codec/binary/Base32;->buffer:[B

    iget p3, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v1, p3, 0x1

    iput v1, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    iget-object v1, p0, Lorg/apache/commons/codec/binary/Base32;->encodeTable:[B

    iget-wide v5, p0, Lorg/apache/commons/codec/binary/Base32;->bitWorkArea:J

    const/4 v7, 0x7

    shr-long/2addr v5, v7

    long-to-int v6, v5

    and-int/lit8 v5, v6, 0x1f

    aget-byte v1, v1, v5

    aput-byte v1, p2, p3

    .line 422
    iget-object p2, p0, Lorg/apache/commons/codec/binary/Base32;->buffer:[B

    iget p3, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v1, p3, 0x1

    iput v1, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    iget-object v1, p0, Lorg/apache/commons/codec/binary/Base32;->encodeTable:[B

    iget-wide v5, p0, Lorg/apache/commons/codec/binary/Base32;->bitWorkArea:J

    shr-long/2addr v5, v2

    long-to-int v2, v5

    and-int/lit8 v2, v2, 0x1f

    aget-byte v1, v1, v2

    aput-byte v1, p2, p3

    .line 423
    iget-object p2, p0, Lorg/apache/commons/codec/binary/Base32;->buffer:[B

    iget p3, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v1, p3, 0x1

    iput v1, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    iget-object v1, p0, Lorg/apache/commons/codec/binary/Base32;->encodeTable:[B

    iget-wide v5, p0, Lorg/apache/commons/codec/binary/Base32;->bitWorkArea:J

    shl-long v2, v5, v3

    long-to-int v3, v2

    and-int/lit8 v2, v3, 0x1f

    aget-byte v1, v1, v2

    aput-byte v1, p2, p3

    .line 424
    iget-object p2, p0, Lorg/apache/commons/codec/binary/Base32;->buffer:[B

    iget p3, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v1, p3, 0x1

    iput v1, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    aput-byte v4, p2, p3

    goto/16 :goto_0

    .line 407
    :pswitch_1
    iget-object p2, p0, Lorg/apache/commons/codec/binary/Base32;->buffer:[B

    iget v2, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    iget-object v3, p0, Lorg/apache/commons/codec/binary/Base32;->encodeTable:[B

    iget-wide v5, p0, Lorg/apache/commons/codec/binary/Base32;->bitWorkArea:J

    const/16 v7, 0x13

    shr-long/2addr v5, v7

    long-to-int v6, v5

    and-int/lit8 v5, v6, 0x1f

    aget-byte v3, v3, v5

    aput-byte v3, p2, v2

    .line 408
    iget-object p2, p0, Lorg/apache/commons/codec/binary/Base32;->buffer:[B

    iget v2, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    iget-object v3, p0, Lorg/apache/commons/codec/binary/Base32;->encodeTable:[B

    iget-wide v5, p0, Lorg/apache/commons/codec/binary/Base32;->bitWorkArea:J

    const/16 v7, 0xe

    shr-long/2addr v5, v7

    long-to-int v6, v5

    and-int/lit8 v5, v6, 0x1f

    aget-byte v3, v3, v5

    aput-byte v3, p2, v2

    .line 409
    iget-object p2, p0, Lorg/apache/commons/codec/binary/Base32;->buffer:[B

    iget v2, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    iget-object v3, p0, Lorg/apache/commons/codec/binary/Base32;->encodeTable:[B

    iget-wide v5, p0, Lorg/apache/commons/codec/binary/Base32;->bitWorkArea:J

    const/16 v7, 0x9

    shr-long/2addr v5, v7

    long-to-int v6, v5

    and-int/lit8 v5, v6, 0x1f

    aget-byte v3, v3, v5

    aput-byte v3, p2, v2

    .line 410
    iget-object p2, p0, Lorg/apache/commons/codec/binary/Base32;->buffer:[B

    iget v2, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    iget-object v3, p0, Lorg/apache/commons/codec/binary/Base32;->encodeTable:[B

    iget-wide v5, p0, Lorg/apache/commons/codec/binary/Base32;->bitWorkArea:J

    shr-long/2addr v5, p3

    long-to-int p3, v5

    and-int/lit8 p3, p3, 0x1f

    aget-byte p3, v3, p3

    aput-byte p3, p2, v2

    .line 411
    iget-object p2, p0, Lorg/apache/commons/codec/binary/Base32;->buffer:[B

    iget p3, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v2, p3, 0x1

    iput v2, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    iget-object v2, p0, Lorg/apache/commons/codec/binary/Base32;->encodeTable:[B

    iget-wide v5, p0, Lorg/apache/commons/codec/binary/Base32;->bitWorkArea:J

    shl-long/2addr v5, v1

    long-to-int v1, v5

    and-int/lit8 v1, v1, 0x1f

    aget-byte v1, v2, v1

    aput-byte v1, p2, p3

    .line 412
    iget-object p2, p0, Lorg/apache/commons/codec/binary/Base32;->buffer:[B

    iget p3, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v1, p3, 0x1

    iput v1, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    aput-byte v4, p2, p3

    .line 413
    iget-object p2, p0, Lorg/apache/commons/codec/binary/Base32;->buffer:[B

    iget p3, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v1, p3, 0x1

    iput v1, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    aput-byte v4, p2, p3

    .line 414
    iget-object p2, p0, Lorg/apache/commons/codec/binary/Base32;->buffer:[B

    iget p3, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v1, p3, 0x1

    iput v1, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    aput-byte v4, p2, p3

    goto/16 :goto_0

    .line 397
    :pswitch_2
    iget-object p2, p0, Lorg/apache/commons/codec/binary/Base32;->buffer:[B

    iget v2, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    iget-object v3, p0, Lorg/apache/commons/codec/binary/Base32;->encodeTable:[B

    iget-wide v5, p0, Lorg/apache/commons/codec/binary/Base32;->bitWorkArea:J

    const/16 v7, 0xb

    shr-long/2addr v5, v7

    long-to-int v6, v5

    and-int/lit8 v5, v6, 0x1f

    aget-byte v3, v3, v5

    aput-byte v3, p2, v2

    .line 398
    iget-object p2, p0, Lorg/apache/commons/codec/binary/Base32;->buffer:[B

    iget v2, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    iget-object v3, p0, Lorg/apache/commons/codec/binary/Base32;->encodeTable:[B

    iget-wide v5, p0, Lorg/apache/commons/codec/binary/Base32;->bitWorkArea:J

    const/4 v7, 0x6

    shr-long/2addr v5, v7

    long-to-int v6, v5

    and-int/lit8 v5, v6, 0x1f

    aget-byte v3, v3, v5

    aput-byte v3, p2, v2

    .line 399
    iget-object p2, p0, Lorg/apache/commons/codec/binary/Base32;->buffer:[B

    iget v2, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    iget-object v3, p0, Lorg/apache/commons/codec/binary/Base32;->encodeTable:[B

    iget-wide v5, p0, Lorg/apache/commons/codec/binary/Base32;->bitWorkArea:J

    shr-long/2addr v5, v1

    long-to-int v1, v5

    and-int/lit8 v1, v1, 0x1f

    aget-byte v1, v3, v1

    aput-byte v1, p2, v2

    .line 400
    iget-object p2, p0, Lorg/apache/commons/codec/binary/Base32;->buffer:[B

    iget v1, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    iget-object v2, p0, Lorg/apache/commons/codec/binary/Base32;->encodeTable:[B

    iget-wide v5, p0, Lorg/apache/commons/codec/binary/Base32;->bitWorkArea:J

    shl-long/2addr v5, p3

    long-to-int p3, v5

    and-int/lit8 p3, p3, 0x1f

    aget-byte p3, v2, p3

    aput-byte p3, p2, v1

    .line 401
    iget-object p2, p0, Lorg/apache/commons/codec/binary/Base32;->buffer:[B

    iget p3, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v1, p3, 0x1

    iput v1, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    aput-byte v4, p2, p3

    .line 402
    iget-object p2, p0, Lorg/apache/commons/codec/binary/Base32;->buffer:[B

    iget p3, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v1, p3, 0x1

    iput v1, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    aput-byte v4, p2, p3

    .line 403
    iget-object p2, p0, Lorg/apache/commons/codec/binary/Base32;->buffer:[B

    iget p3, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v1, p3, 0x1

    iput v1, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    aput-byte v4, p2, p3

    .line 404
    iget-object p2, p0, Lorg/apache/commons/codec/binary/Base32;->buffer:[B

    iget p3, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v1, p3, 0x1

    iput v1, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    aput-byte v4, p2, p3

    goto :goto_0

    .line 386
    :pswitch_3
    iget-object p2, p0, Lorg/apache/commons/codec/binary/Base32;->buffer:[B

    iget p3, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v1, p3, 0x1

    iput v1, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    iget-object v1, p0, Lorg/apache/commons/codec/binary/Base32;->encodeTable:[B

    iget-wide v5, p0, Lorg/apache/commons/codec/binary/Base32;->bitWorkArea:J

    shr-long/2addr v5, v3

    long-to-int v3, v5

    and-int/lit8 v3, v3, 0x1f

    aget-byte v1, v1, v3

    aput-byte v1, p2, p3

    .line 387
    iget-object p2, p0, Lorg/apache/commons/codec/binary/Base32;->buffer:[B

    iget p3, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v1, p3, 0x1

    iput v1, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    iget-object v1, p0, Lorg/apache/commons/codec/binary/Base32;->encodeTable:[B

    iget-wide v5, p0, Lorg/apache/commons/codec/binary/Base32;->bitWorkArea:J

    shl-long v2, v5, v2

    long-to-int v3, v2

    and-int/lit8 v2, v3, 0x1f

    aget-byte v1, v1, v2

    aput-byte v1, p2, p3

    .line 388
    iget-object p2, p0, Lorg/apache/commons/codec/binary/Base32;->buffer:[B

    iget p3, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v1, p3, 0x1

    iput v1, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    aput-byte v4, p2, p3

    .line 389
    iget-object p2, p0, Lorg/apache/commons/codec/binary/Base32;->buffer:[B

    iget p3, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v1, p3, 0x1

    iput v1, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    aput-byte v4, p2, p3

    .line 390
    iget-object p2, p0, Lorg/apache/commons/codec/binary/Base32;->buffer:[B

    iget p3, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v1, p3, 0x1

    iput v1, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    aput-byte v4, p2, p3

    .line 391
    iget-object p2, p0, Lorg/apache/commons/codec/binary/Base32;->buffer:[B

    iget p3, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v1, p3, 0x1

    iput v1, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    aput-byte v4, p2, p3

    .line 392
    iget-object p2, p0, Lorg/apache/commons/codec/binary/Base32;->buffer:[B

    iget p3, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v1, p3, 0x1

    iput v1, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    aput-byte v4, p2, p3

    .line 393
    iget-object p2, p0, Lorg/apache/commons/codec/binary/Base32;->buffer:[B

    iget p3, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v1, p3, 0x1

    iput v1, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    aput-byte v4, p2, p3

    .line 427
    :goto_0
    iget p2, p0, Lorg/apache/commons/codec/binary/Base32;->currentLinePos:I

    iget p3, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    sub-int/2addr p3, p1

    add-int/2addr p2, p3

    iput p2, p0, Lorg/apache/commons/codec/binary/Base32;->currentLinePos:I

    .line 429
    iget p1, p0, Lorg/apache/commons/codec/binary/Base32;->lineLength:I

    if-lez p1, :cond_5

    iget p1, p0, Lorg/apache/commons/codec/binary/Base32;->currentLinePos:I

    if-lez p1, :cond_5

    .line 430
    iget-object p1, p0, Lorg/apache/commons/codec/binary/Base32;->lineSeparator:[B

    iget-object p2, p0, Lorg/apache/commons/codec/binary/Base32;->buffer:[B

    iget p3, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    iget-object v1, p0, Lorg/apache/commons/codec/binary/Base32;->lineSeparator:[B

    array-length v1, v1

    invoke-static {p1, v0, p2, p3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 431
    iget p1, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    iget-object p2, p0, Lorg/apache/commons/codec/binary/Base32;->lineSeparator:[B

    array-length p2, p2

    add-int/2addr p1, p2

    iput p1, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    goto/16 :goto_2

    :cond_2
    move v2, p2

    const/4 p2, 0x0

    :goto_1
    if-ge p2, p3, :cond_5

    .line 435
    iget v3, p0, Lorg/apache/commons/codec/binary/Base32;->encodeSize:I

    invoke-virtual {p0, v3}, Lorg/apache/commons/codec/binary/Base32;->ensureBufferSize(I)V

    .line 436
    iget v3, p0, Lorg/apache/commons/codec/binary/Base32;->modulus:I

    add-int/2addr v3, v1

    const/4 v4, 0x5

    rem-int/2addr v3, v4

    iput v3, p0, Lorg/apache/commons/codec/binary/Base32;->modulus:I

    add-int/lit8 v3, v2, 0x1

    .line 437
    aget-byte v2, p1, v2

    if-gez v2, :cond_3

    add-int/lit16 v2, v2, 0x100

    .line 441
    :cond_3
    iget-wide v5, p0, Lorg/apache/commons/codec/binary/Base32;->bitWorkArea:J

    const/16 v7, 0x8

    shl-long/2addr v5, v7

    int-to-long v8, v2

    add-long/2addr v5, v8

    iput-wide v5, p0, Lorg/apache/commons/codec/binary/Base32;->bitWorkArea:J

    .line 442
    iget v2, p0, Lorg/apache/commons/codec/binary/Base32;->modulus:I

    if-nez v2, :cond_4

    .line 443
    iget-object v2, p0, Lorg/apache/commons/codec/binary/Base32;->buffer:[B

    iget v5, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    iget-object v6, p0, Lorg/apache/commons/codec/binary/Base32;->encodeTable:[B

    iget-wide v8, p0, Lorg/apache/commons/codec/binary/Base32;->bitWorkArea:J

    const/16 v10, 0x23

    shr-long/2addr v8, v10

    long-to-int v9, v8

    and-int/lit8 v8, v9, 0x1f

    aget-byte v6, v6, v8

    aput-byte v6, v2, v5

    .line 444
    iget-object v2, p0, Lorg/apache/commons/codec/binary/Base32;->buffer:[B

    iget v5, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    iget-object v6, p0, Lorg/apache/commons/codec/binary/Base32;->encodeTable:[B

    iget-wide v8, p0, Lorg/apache/commons/codec/binary/Base32;->bitWorkArea:J

    const/16 v10, 0x1e

    shr-long/2addr v8, v10

    long-to-int v9, v8

    and-int/lit8 v8, v9, 0x1f

    aget-byte v6, v6, v8

    aput-byte v6, v2, v5

    .line 445
    iget-object v2, p0, Lorg/apache/commons/codec/binary/Base32;->buffer:[B

    iget v5, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    iget-object v6, p0, Lorg/apache/commons/codec/binary/Base32;->encodeTable:[B

    iget-wide v8, p0, Lorg/apache/commons/codec/binary/Base32;->bitWorkArea:J

    const/16 v10, 0x19

    shr-long/2addr v8, v10

    long-to-int v9, v8

    and-int/lit8 v8, v9, 0x1f

    aget-byte v6, v6, v8

    aput-byte v6, v2, v5

    .line 446
    iget-object v2, p0, Lorg/apache/commons/codec/binary/Base32;->buffer:[B

    iget v5, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    iget-object v6, p0, Lorg/apache/commons/codec/binary/Base32;->encodeTable:[B

    iget-wide v8, p0, Lorg/apache/commons/codec/binary/Base32;->bitWorkArea:J

    const/16 v10, 0x14

    shr-long/2addr v8, v10

    long-to-int v9, v8

    and-int/lit8 v8, v9, 0x1f

    aget-byte v6, v6, v8

    aput-byte v6, v2, v5

    .line 447
    iget-object v2, p0, Lorg/apache/commons/codec/binary/Base32;->buffer:[B

    iget v5, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    iget-object v6, p0, Lorg/apache/commons/codec/binary/Base32;->encodeTable:[B

    iget-wide v8, p0, Lorg/apache/commons/codec/binary/Base32;->bitWorkArea:J

    const/16 v10, 0xf

    shr-long/2addr v8, v10

    long-to-int v9, v8

    and-int/lit8 v8, v9, 0x1f

    aget-byte v6, v6, v8

    aput-byte v6, v2, v5

    .line 448
    iget-object v2, p0, Lorg/apache/commons/codec/binary/Base32;->buffer:[B

    iget v5, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    iget-object v6, p0, Lorg/apache/commons/codec/binary/Base32;->encodeTable:[B

    iget-wide v8, p0, Lorg/apache/commons/codec/binary/Base32;->bitWorkArea:J

    const/16 v10, 0xa

    shr-long/2addr v8, v10

    long-to-int v9, v8

    and-int/lit8 v8, v9, 0x1f

    aget-byte v6, v6, v8

    aput-byte v6, v2, v5

    .line 449
    iget-object v2, p0, Lorg/apache/commons/codec/binary/Base32;->buffer:[B

    iget v5, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    iget-object v6, p0, Lorg/apache/commons/codec/binary/Base32;->encodeTable:[B

    iget-wide v8, p0, Lorg/apache/commons/codec/binary/Base32;->bitWorkArea:J

    shr-long/2addr v8, v4

    long-to-int v4, v8

    and-int/lit8 v4, v4, 0x1f

    aget-byte v4, v6, v4

    aput-byte v4, v2, v5

    .line 450
    iget-object v2, p0, Lorg/apache/commons/codec/binary/Base32;->buffer:[B

    iget v4, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v5, v4, 0x1

    iput v5, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    iget-object v5, p0, Lorg/apache/commons/codec/binary/Base32;->encodeTable:[B

    iget-wide v8, p0, Lorg/apache/commons/codec/binary/Base32;->bitWorkArea:J

    long-to-int v6, v8

    and-int/lit8 v6, v6, 0x1f

    aget-byte v5, v5, v6

    aput-byte v5, v2, v4

    .line 451
    iget v2, p0, Lorg/apache/commons/codec/binary/Base32;->currentLinePos:I

    add-int/2addr v2, v7

    iput v2, p0, Lorg/apache/commons/codec/binary/Base32;->currentLinePos:I

    .line 452
    iget v2, p0, Lorg/apache/commons/codec/binary/Base32;->lineLength:I

    if-lez v2, :cond_4

    iget v2, p0, Lorg/apache/commons/codec/binary/Base32;->lineLength:I

    iget v4, p0, Lorg/apache/commons/codec/binary/Base32;->currentLinePos:I

    if-gt v2, v4, :cond_4

    .line 453
    iget-object v2, p0, Lorg/apache/commons/codec/binary/Base32;->lineSeparator:[B

    iget-object v4, p0, Lorg/apache/commons/codec/binary/Base32;->buffer:[B

    iget v5, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    iget-object v6, p0, Lorg/apache/commons/codec/binary/Base32;->lineSeparator:[B

    array-length v6, v6

    invoke-static {v2, v0, v4, v5, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 454
    iget v2, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    iget-object v4, p0, Lorg/apache/commons/codec/binary/Base32;->lineSeparator:[B

    array-length v4, v4

    add-int/2addr v2, v4

    iput v2, p0, Lorg/apache/commons/codec/binary/Base32;->pos:I

    .line 455
    iput v0, p0, Lorg/apache/commons/codec/binary/Base32;->currentLinePos:I

    :cond_4
    add-int/lit8 p2, p2, 0x1

    move v2, v3

    goto/16 :goto_1

    :cond_5
    :goto_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public isInAlphabet(B)Z
    .locals 2

    if-ltz p1, :cond_0

    .line 471
    iget-object v0, p0, Lorg/apache/commons/codec/binary/Base32;->decodeTable:[B

    array-length v1, v0

    if-ge p1, v1, :cond_0

    aget-byte p1, v0, p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
