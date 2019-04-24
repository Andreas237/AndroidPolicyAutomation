.class public Lokio/ByteString;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/io/Serializable;Ljava/lang/Comparable<Lokio/ByteString;>;"
    }
.end annotation


# static fields
.field public static final EMPTY:Lokio/ByteString;

.field static final HEX_DIGITS:[C

.field private static final serialVersionUID:J = 0x1L


# instance fields
.field final data:[B

.field transient hashCode:I

.field transient utf8:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 47
    const/16 v0, 0x10

    new-array v0, v0, [C

    fill-array-data v0, :array_0

    sput-object v0, Lokio/ByteString;->HEX_DIGITS:[C

    .line 52
    const/4 v0, 0x0

    new-array v0, v0, [B

    invoke-static {v0}, Lokio/ByteString;->of([B)Lokio/ByteString;

    move-result-object v0

    sput-object v0, Lokio/ByteString;->EMPTY:Lokio/ByteString;

    return-void

    nop

    :array_0
    .array-data 2
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x61s
        0x62s
        0x63s
        0x64s
        0x65s
        0x66s
    .end array-data
.end method

.method constructor <init>([B)V
    .locals 0

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    iput-object p1, p0, Lokio/ByteString;->data:[B

    .line 60
    return-void
.end method

.method public static decodeBase64(Ljava/lang/String;)Lokio/ByteString;
    .locals 3

    .line 138
    if-nez p0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "base64 == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 139
    :cond_0
    invoke-static {p0}, Lokio/Base64;->decode(Ljava/lang/String;)[B

    move-result-object v2

    .line 140
    if-eqz v2, :cond_1

    new-instance v0, Lokio/ByteString;

    invoke-direct {v0, v2}, Lokio/ByteString;-><init>([B)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public static decodeHex(Ljava/lang/String;)Lokio/ByteString;
    .locals 7

    .line 156
    if-nez p0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "hex == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 157
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    rem-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected hex string: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 159
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    new-array v3, v0, [B

    .line 160
    const/4 v4, 0x0

    :goto_0
    array-length v0, v3

    if-ge v4, v0, :cond_2

    .line 161
    mul-int/lit8 v0, v4, 0x2

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Lokio/ByteString;->decodeHexDigit(C)I

    move-result v0

    shl-int/lit8 v5, v0, 0x4

    .line 162
    mul-int/lit8 v0, v4, 0x2

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Lokio/ByteString;->decodeHexDigit(C)I

    move-result v6

    .line 163
    add-int v0, v5, v6

    int-to-byte v0, v0

    aput-byte v0, v3, v4

    .line 160
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 165
    :cond_2
    invoke-static {v3}, Lokio/ByteString;->of([B)Lokio/ByteString;

    move-result-object v0

    return-object v0
.end method

.method private static decodeHexDigit(C)I
    .locals 3

    .line 169
    const/16 v0, 0x30

    if-lt p0, v0, :cond_0

    const/16 v0, 0x39

    if-gt p0, v0, :cond_0

    add-int/lit8 v0, p0, -0x30

    return v0

    .line 170
    :cond_0
    const/16 v0, 0x61

    if-lt p0, v0, :cond_1

    const/16 v0, 0x66

    if-gt p0, v0, :cond_1

    add-int/lit8 v0, p0, -0x61

    add-int/lit8 v0, v0, 0xa

    return v0

    .line 171
    :cond_1
    const/16 v0, 0x41

    if-lt p0, v0, :cond_2

    const/16 v0, 0x46

    if-gt p0, v0, :cond_2

    add-int/lit8 v0, p0, -0x41

    add-int/lit8 v0, v0, 0xa

    return v0

    .line 172
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected hex digit: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private digest(Ljava/lang/String;)Lokio/ByteString;
    .locals 3

    .line 119
    :try_start_0
    invoke-static {p1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v0

    iget-object v1, p0, Lokio/ByteString;->data:[B

    invoke-virtual {v0, v1}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v0

    invoke-static {v0}, Lokio/ByteString;->of([B)Lokio/ByteString;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 120
    :catch_0
    move-exception v2

    .line 121
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0, v2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public static encodeUtf8(Ljava/lang/String;)Lokio/ByteString;
    .locals 3

    .line 85
    if-nez p0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "s == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 86
    :cond_0
    new-instance v2, Lokio/ByteString;

    sget-object v0, Lokio/Util;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    invoke-direct {v2, v0}, Lokio/ByteString;-><init>([B)V

    .line 87
    iput-object p0, v2, Lokio/ByteString;->utf8:Ljava/lang/String;

    .line 88
    return-object v2
.end method

.method public static varargs of([B)Lokio/ByteString;
    .locals 2

    .line 66
    if-nez p0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "data == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 67
    :cond_0
    new-instance v0, Lokio/ByteString;

    invoke-virtual {p0}, [B->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    invoke-direct {v0, v1}, Lokio/ByteString;-><init>([B)V

    return-object v0
.end method

.method public static of([BII)Lokio/ByteString;
    .locals 7

    .line 75
    if-nez p0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "data == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 76
    :cond_0
    array-length v0, p0

    int-to-long v0, v0

    int-to-long v2, p1

    int-to-long v4, p2

    invoke-static/range {v0 .. v5}, Lokio/Util;->checkOffsetAndCount(JJJ)V

    .line 78
    new-array v6, p2, [B

    .line 79
    const/4 v0, 0x0

    invoke-static {p0, p1, v6, v0, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 80
    new-instance v0, Lokio/ByteString;

    invoke-direct {v0, v6}, Lokio/ByteString;-><init>([B)V

    return-object v0
.end method

.method public static read(Ljava/io/InputStream;I)Lokio/ByteString;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 182
    if-nez p0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "in == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 183
    :cond_0
    if-gez p1, :cond_1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "byteCount < 0: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 185
    :cond_1
    new-array v3, p1, [B

    .line 186
    const/4 v4, 0x0

    :goto_0
    if-ge v4, p1, :cond_3

    .line 187
    sub-int v0, p1, v4

    invoke-virtual {p0, v3, v4, v0}, Ljava/io/InputStream;->read([BII)I

    move-result v5

    .line 188
    const/4 v0, -0x1

    if-ne v5, v0, :cond_2

    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    throw v0

    .line 186
    :cond_2
    add-int/2addr v4, v5

    goto :goto_0

    .line 190
    :cond_3
    new-instance v0, Lokio/ByteString;

    invoke-direct {v0, v3}, Lokio/ByteString;-><init>([B)V

    return-object v0
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 362
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v2

    .line 363
    invoke-static {p1, v2}, Lokio/ByteString;->read(Ljava/io/InputStream;I)Lokio/ByteString;

    move-result-object v3

    .line 365
    :try_start_0
    const-class v0, Lokio/ByteString;

    const-string v1, "data"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v4

    .line 366
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 367
    iget-object v0, v3, Lokio/ByteString;->data:[B

    invoke-virtual {v4, p0, v0}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1

    .line 372
    goto :goto_0

    .line 368
    :catch_0
    move-exception v4

    .line 369
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 370
    :catch_1
    move-exception v4

    .line 371
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 373
    :goto_0
    return-void
.end method

.method private writeObject(Ljava/io/ObjectOutputStream;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 376
    iget-object v0, p0, Lokio/ByteString;->data:[B

    array-length v0, v0

    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    .line 377
    iget-object v0, p0, Lokio/ByteString;->data:[B

    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->write([B)V

    .line 378
    return-void
.end method


# virtual methods
.method public base64()Ljava/lang/String;
    .locals 1

    .line 104
    iget-object v0, p0, Lokio/ByteString;->data:[B

    invoke-static {v0}, Lokio/Base64;->encode([B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public base64Url()Ljava/lang/String;
    .locals 1

    .line 130
    iget-object v0, p0, Lokio/ByteString;->data:[B

    invoke-static {v0}, Lokio/Base64;->encodeUrl([B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 46
    move-object v0, p1

    check-cast v0, Lokio/ByteString;

    invoke-virtual {p0, v0}, Lokio/ByteString;->compareTo(Lokio/ByteString;)I

    move-result v0

    return v0
.end method

.method public compareTo(Lokio/ByteString;)I
    .locals 8

    .line 337
    invoke-virtual {p0}, Lokio/ByteString;->size()I

    move-result v2

    .line 338
    invoke-virtual {p1}, Lokio/ByteString;->size()I

    move-result v3

    .line 339
    const/4 v4, 0x0

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v5

    :goto_0
    if-ge v4, v5, :cond_2

    .line 340
    invoke-virtual {p0, v4}, Lokio/ByteString;->getByte(I)B

    move-result v0

    and-int/lit16 v6, v0, 0xff

    .line 341
    invoke-virtual {p1, v4}, Lokio/ByteString;->getByte(I)B

    move-result v0

    and-int/lit16 v7, v0, 0xff

    .line 342
    if-ne v6, v7, :cond_0

    goto :goto_2

    .line 343
    :cond_0
    if-ge v6, v7, :cond_1

    const/4 v0, -0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x1

    :goto_1
    return v0

    .line 339
    :goto_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 345
    :cond_2
    if-ne v2, v3, :cond_3

    const/4 v0, 0x0

    return v0

    .line 346
    :cond_3
    if-ge v2, v3, :cond_4

    const/4 v0, -0x1

    goto :goto_3

    :cond_4
    const/4 v0, 0x1

    :goto_3
    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    .line 325
    if-ne p1, p0, :cond_0

    const/4 v0, 0x1

    return v0

    .line 326
    :cond_0
    instance-of v0, p1, Lokio/ByteString;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Lokio/ByteString;

    .line 327
    invoke-virtual {v0}, Lokio/ByteString;->size()I

    move-result v0

    iget-object v1, p0, Lokio/ByteString;->data:[B

    array-length v1, v1

    if-ne v0, v1, :cond_1

    move-object v0, p1

    check-cast v0, Lokio/ByteString;

    iget-object v1, p0, Lokio/ByteString;->data:[B

    iget-object v2, p0, Lokio/ByteString;->data:[B

    array-length v2, v2

    .line 328
    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v3, v1, v4, v2}, Lokio/ByteString;->rangeEquals(I[BII)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public getByte(I)B
    .locals 1

    .line 276
    iget-object v0, p0, Lokio/ByteString;->data:[B

    aget-byte v0, v0, p1

    return v0
.end method

.method public hashCode()I
    .locals 2

    .line 332
    iget v1, p0, Lokio/ByteString;->hashCode:I

    .line 333
    if-eqz v1, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lokio/ByteString;->data:[B

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([B)I

    move-result v0

    iput v0, p0, Lokio/ByteString;->hashCode:I

    :goto_0
    return v0
.end method

.method public hex()Ljava/lang/String;
    .locals 10

    .line 145
    iget-object v0, p0, Lokio/ByteString;->data:[B

    array-length v0, v0

    mul-int/lit8 v0, v0, 0x2

    new-array v4, v0, [C

    .line 146
    const/4 v5, 0x0

    .line 147
    iget-object v6, p0, Lokio/ByteString;->data:[B

    array-length v7, v6

    const/4 v8, 0x0

    :goto_0
    if-ge v8, v7, :cond_0

    aget-byte v9, v6, v8

    .line 148
    move v0, v5

    add-int/lit8 v5, v5, 0x1

    sget-object v1, Lokio/ByteString;->HEX_DIGITS:[C

    shr-int/lit8 v2, v9, 0x4

    and-int/lit8 v2, v2, 0xf

    aget-char v1, v1, v2

    aput-char v1, v4, v0

    .line 149
    move v0, v5

    add-int/lit8 v5, v5, 0x1

    sget-object v1, Lokio/ByteString;->HEX_DIGITS:[C

    and-int/lit8 v2, v9, 0xf

    aget-char v1, v1, v2

    aput-char v1, v4, v0

    .line 147
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 151
    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v4}, Ljava/lang/String;-><init>([C)V

    return-object v0
.end method

.method public md5()Lokio/ByteString;
    .locals 1

    .line 109
    const-string v0, "MD5"

    invoke-direct {p0, v0}, Lokio/ByteString;->digest(Ljava/lang/String;)Lokio/ByteString;

    move-result-object v0

    return-object v0
.end method

.method public rangeEquals(ILokio/ByteString;II)Z
    .locals 1

    .line 310
    iget-object v0, p0, Lokio/ByteString;->data:[B

    invoke-virtual {p2, p3, v0, p1, p4}, Lokio/ByteString;->rangeEquals(I[BII)Z

    move-result v0

    return v0
.end method

.method public rangeEquals(I[BII)Z
    .locals 1

    .line 319
    iget-object v0, p0, Lokio/ByteString;->data:[B

    array-length v0, v0

    sub-int/2addr v0, p4

    if-gt p1, v0, :cond_0

    array-length v0, p2

    sub-int/2addr v0, p4

    if-gt p3, v0, :cond_0

    iget-object v0, p0, Lokio/ByteString;->data:[B

    .line 321
    invoke-static {v0, p1, p2, p3, p4}, Lokio/Util;->arrayRangeEquals([BI[BII)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public sha256()Lokio/ByteString;
    .locals 1

    .line 114
    const-string v0, "SHA-256"

    invoke-direct {p0, v0}, Lokio/ByteString;->digest(Ljava/lang/String;)Lokio/ByteString;

    move-result-object v0

    return-object v0
.end method

.method public size()I
    .locals 1

    .line 283
    iget-object v0, p0, Lokio/ByteString;->data:[B

    array-length v0, v0

    return v0
.end method

.method public substring(I)Lokio/ByteString;
    .locals 1

    .line 248
    iget-object v0, p0, Lokio/ByteString;->data:[B

    array-length v0, v0

    invoke-virtual {p0, p1, v0}, Lokio/ByteString;->substring(II)Lokio/ByteString;

    move-result-object v0

    return-object v0
.end method

.method public substring(II)Lokio/ByteString;
    .locals 5

    .line 257
    if-gez p1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "beginIndex < 0"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 258
    :cond_0
    iget-object v0, p0, Lokio/ByteString;->data:[B

    array-length v0, v0

    if-le p2, v0, :cond_1

    .line 259
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "endIndex > length("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lokio/ByteString;->data:[B

    array-length v2, v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 262
    :cond_1
    sub-int v3, p2, p1

    .line 263
    if-gez v3, :cond_2

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "endIndex < beginIndex"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 265
    :cond_2
    if-nez p1, :cond_3

    iget-object v0, p0, Lokio/ByteString;->data:[B

    array-length v0, v0

    if-ne p2, v0, :cond_3

    .line 266
    return-object p0

    .line 269
    :cond_3
    new-array v4, v3, [B

    .line 270
    iget-object v0, p0, Lokio/ByteString;->data:[B

    const/4 v1, 0x0

    invoke-static {v0, p1, v4, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 271
    new-instance v0, Lokio/ByteString;

    invoke-direct {v0, v4}, Lokio/ByteString;-><init>([B)V

    return-object v0
.end method

.method public toAsciiLowercase()Lokio/ByteString;
    .locals 5

    .line 200
    const/4 v2, 0x0

    :goto_0
    iget-object v0, p0, Lokio/ByteString;->data:[B

    array-length v0, v0

    if-ge v2, v0, :cond_5

    .line 201
    iget-object v0, p0, Lokio/ByteString;->data:[B

    aget-byte v3, v0, v2

    .line 202
    const/16 v0, 0x41

    if-lt v3, v0, :cond_4

    const/16 v0, 0x5a

    if-le v3, v0, :cond_0

    goto :goto_3

    .line 206
    :cond_0
    iget-object v0, p0, Lokio/ByteString;->data:[B

    invoke-virtual {v0}, [B->clone()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, [B

    .line 207
    move v0, v2

    add-int/lit8 v2, v2, 0x1

    add-int/lit8 v1, v3, 0x20

    int-to-byte v1, v1

    aput-byte v1, v4, v0

    .line 208
    :goto_1
    array-length v0, v4

    if-ge v2, v0, :cond_3

    .line 209
    aget-byte v3, v4, v2

    .line 210
    const/16 v0, 0x41

    if-lt v3, v0, :cond_2

    const/16 v0, 0x5a

    if-le v3, v0, :cond_1

    goto :goto_2

    .line 211
    :cond_1
    add-int/lit8 v0, v3, 0x20

    int-to-byte v0, v0

    aput-byte v0, v4, v2

    .line 208
    :cond_2
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 213
    :cond_3
    new-instance v0, Lokio/ByteString;

    invoke-direct {v0, v4}, Lokio/ByteString;-><init>([B)V

    return-object v0

    .line 200
    :cond_4
    :goto_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 215
    :cond_5
    return-object p0
.end method

.method public toAsciiUppercase()Lokio/ByteString;
    .locals 5

    .line 225
    const/4 v2, 0x0

    :goto_0
    iget-object v0, p0, Lokio/ByteString;->data:[B

    array-length v0, v0

    if-ge v2, v0, :cond_5

    .line 226
    iget-object v0, p0, Lokio/ByteString;->data:[B

    aget-byte v3, v0, v2

    .line 227
    const/16 v0, 0x61

    if-lt v3, v0, :cond_4

    const/16 v0, 0x7a

    if-le v3, v0, :cond_0

    goto :goto_3

    .line 231
    :cond_0
    iget-object v0, p0, Lokio/ByteString;->data:[B

    invoke-virtual {v0}, [B->clone()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, [B

    .line 232
    move v0, v2

    add-int/lit8 v2, v2, 0x1

    add-int/lit8 v1, v3, -0x20

    int-to-byte v1, v1

    aput-byte v1, v4, v0

    .line 233
    :goto_1
    array-length v0, v4

    if-ge v2, v0, :cond_3

    .line 234
    aget-byte v3, v4, v2

    .line 235
    const/16 v0, 0x61

    if-lt v3, v0, :cond_2

    const/16 v0, 0x7a

    if-le v3, v0, :cond_1

    goto :goto_2

    .line 236
    :cond_1
    add-int/lit8 v0, v3, -0x20

    int-to-byte v0, v0

    aput-byte v0, v4, v2

    .line 233
    :cond_2
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 238
    :cond_3
    new-instance v0, Lokio/ByteString;

    invoke-direct {v0, v4}, Lokio/ByteString;-><init>([B)V

    return-object v0

    .line 225
    :cond_4
    :goto_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 240
    :cond_5
    return-object p0
.end method

.method public toByteArray()[B
    .locals 1

    .line 290
    iget-object v0, p0, Lokio/ByteString;->data:[B

    invoke-virtual {v0}, [B->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 350
    iget-object v0, p0, Lokio/ByteString;->data:[B

    array-length v0, v0

    if-nez v0, :cond_0

    .line 351
    const-string v0, "ByteString[size=0]"

    return-object v0

    .line 354
    :cond_0
    iget-object v0, p0, Lokio/ByteString;->data:[B

    array-length v0, v0

    const/16 v1, 0x10

    if-gt v0, v1, :cond_1

    .line 355
    const-string v0, "ByteString[size=%s data=%s]"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lokio/ByteString;->data:[B

    array-length v2, v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p0}, Lokio/ByteString;->hex()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 358
    :cond_1
    const-string v0, "ByteString[size=%s md5=%s]"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lokio/ByteString;->data:[B

    array-length v2, v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p0}, Lokio/ByteString;->md5()Lokio/ByteString;

    move-result-object v2

    invoke-virtual {v2}, Lokio/ByteString;->hex()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public utf8()Ljava/lang/String;
    .locals 4

    .line 93
    iget-object v3, p0, Lokio/ByteString;->utf8:Ljava/lang/String;

    .line 95
    if-eqz v3, :cond_0

    move-object v0, v3

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Lokio/ByteString;->data:[B

    sget-object v2, Lokio/Util;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    iput-object v0, p0, Lokio/ByteString;->utf8:Ljava/lang/String;

    :goto_0
    return-object v0
.end method

.method public write(Ljava/io/OutputStream;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 295
    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "out == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 296
    :cond_0
    iget-object v0, p0, Lokio/ByteString;->data:[B

    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V

    .line 297
    return-void
.end method

.method write(Lokio/Buffer;)V
    .locals 3

    .line 301
    iget-object v0, p0, Lokio/ByteString;->data:[B

    iget-object v1, p0, Lokio/ByteString;->data:[B

    array-length v1, v1

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v2, v1}, Lokio/Buffer;->write([BII)Lokio/Buffer;

    .line 302
    return-void
.end method
