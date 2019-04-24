.class public Lorg/bouncycastle/util/encoders/HexEncoder;
.super Ljava/lang/Object;
.source "HexEncoder.java"

# interfaces
.implements Lorg/bouncycastle/util/encoders/Encoder;


# instance fields
.field protected final decodingTable:[B

.field protected final encodingTable:[B


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x10

    .line 27
    new-array v0, v0, [B

    fill-array-data v0, :array_0

    iput-object v0, p0, Lorg/bouncycastle/util/encoders/HexEncoder;->encodingTable:[B

    const/16 v0, 0x80

    .line 34
    new-array v0, v0, [B

    iput-object v0, p0, Lorg/bouncycastle/util/encoders/HexEncoder;->decodingTable:[B

    .line 50
    invoke-virtual {p0}, Lorg/bouncycastle/util/encoders/HexEncoder;->initialiseDecodingTable()V

    return-void

    :array_0
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
        0x61t
        0x62t
        0x63t
        0x64t
        0x65t
        0x66t
    .end array-data
.end method

.method private ignore(C)Z
    .locals 1

    const/16 v0, 0xa

    if-eq p1, v0, :cond_1

    const/16 v0, 0xd

    if-eq p1, v0, :cond_1

    const/16 v0, 0x9

    if-eq p1, v0, :cond_1

    const/16 v0, 0x20

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method


# virtual methods
.method public decode(Ljava/lang/String;Ljava/io/OutputStream;)I
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 123
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    :goto_0
    if-lez v0, :cond_1

    add-int/lit8 v1, v0, -0x1

    .line 126
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-direct {p0, v1}, Lorg/bouncycastle/util/encoders/HexEncoder;->ignore(C)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    :goto_1
    const/4 v1, 0x0

    move v2, v1

    :goto_2
    if-ge v1, v0, :cond_4

    :goto_3
    if-ge v1, v0, :cond_2

    .line 135
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-direct {p0, v3}, Lorg/bouncycastle/util/encoders/HexEncoder;->ignore(C)Z

    move-result v3

    if-eqz v3, :cond_2

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    .line 139
    :cond_2
    iget-object v3, p0, Lorg/bouncycastle/util/encoders/HexEncoder;->decodingTable:[B

    add-int/lit8 v4, v1, 0x1

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    aget-byte v1, v3, v1

    :goto_4
    if-ge v4, v0, :cond_3

    .line 141
    invoke-virtual {p1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-direct {p0, v3}, Lorg/bouncycastle/util/encoders/HexEncoder;->ignore(C)Z

    move-result v3

    if-eqz v3, :cond_3

    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    .line 145
    :cond_3
    iget-object v3, p0, Lorg/bouncycastle/util/encoders/HexEncoder;->decodingTable:[B

    add-int/lit8 v5, v4, 0x1

    invoke-virtual {p1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    aget-byte v3, v3, v4

    shl-int/lit8 v1, v1, 0x4

    or-int/2addr v1, v3

    .line 147
    invoke-virtual {p2, v1}, Ljava/io/OutputStream;->write(I)V

    add-int/lit8 v2, v2, 0x1

    move v1, v5

    goto :goto_2

    :cond_4
    return v2
.end method

.method public decode([BIILjava/io/OutputStream;)I
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    add-int/2addr p3, p2

    :goto_0
    if-le p3, p2, :cond_1

    add-int/lit8 v0, p3, -0x1

    .line 85
    aget-byte v0, p1, v0

    int-to-char v0, v0

    invoke-direct {p0, v0}, Lorg/bouncycastle/util/encoders/HexEncoder;->ignore(C)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 p3, p3, -0x1

    goto :goto_0

    :cond_1
    :goto_1
    const/4 v0, 0x0

    :goto_2
    if-ge p2, p3, :cond_4

    :goto_3
    if-ge p2, p3, :cond_2

    .line 94
    aget-byte v1, p1, p2

    int-to-char v1, v1

    invoke-direct {p0, v1}, Lorg/bouncycastle/util/encoders/HexEncoder;->ignore(C)Z

    move-result v1

    if-eqz v1, :cond_2

    add-int/lit8 p2, p2, 0x1

    goto :goto_3

    .line 98
    :cond_2
    iget-object v1, p0, Lorg/bouncycastle/util/encoders/HexEncoder;->decodingTable:[B

    add-int/lit8 v2, p2, 0x1

    aget-byte p2, p1, p2

    aget-byte p2, v1, p2

    :goto_4
    if-ge v2, p3, :cond_3

    .line 100
    aget-byte v1, p1, v2

    int-to-char v1, v1

    invoke-direct {p0, v1}, Lorg/bouncycastle/util/encoders/HexEncoder;->ignore(C)Z

    move-result v1

    if-eqz v1, :cond_3

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    .line 104
    :cond_3
    iget-object v1, p0, Lorg/bouncycastle/util/encoders/HexEncoder;->decodingTable:[B

    add-int/lit8 v3, v2, 0x1

    aget-byte v2, p1, v2

    aget-byte v1, v1, v2

    shl-int/lit8 p2, p2, 0x4

    or-int/2addr p2, v1

    .line 106
    invoke-virtual {p4, p2}, Ljava/io/OutputStream;->write(I)V

    add-int/lit8 v0, v0, 0x1

    move p2, v3

    goto :goto_2

    :cond_4
    return v0
.end method

.method public encode([BIILjava/io/OutputStream;)I
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move v0, p2

    :goto_0
    add-int v1, p2, p3

    if-ge v0, v1, :cond_0

    .line 60
    aget-byte v1, p1, v0

    and-int/lit16 v1, v1, 0xff

    .line 62
    iget-object v2, p0, Lorg/bouncycastle/util/encoders/HexEncoder;->encodingTable:[B

    ushr-int/lit8 v3, v1, 0x4

    aget-byte v2, v2, v3

    invoke-virtual {p4, v2}, Ljava/io/OutputStream;->write(I)V

    .line 63
    iget-object v2, p0, Lorg/bouncycastle/util/encoders/HexEncoder;->encodingTable:[B

    and-int/lit8 v1, v1, 0xf

    aget-byte v1, v2, v1

    invoke-virtual {p4, v1}, Ljava/io/OutputStream;->write(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    mul-int/lit8 p3, p3, 0x2

    return p3
.end method

.method protected initialiseDecodingTable()V
    .locals 4

    const/4 v0, 0x0

    .line 37
    :goto_0
    iget-object v1, p0, Lorg/bouncycastle/util/encoders/HexEncoder;->encodingTable:[B

    array-length v2, v1

    if-ge v0, v2, :cond_0

    .line 38
    iget-object v2, p0, Lorg/bouncycastle/util/encoders/HexEncoder;->decodingTable:[B

    aget-byte v1, v1, v0

    int-to-byte v3, v0

    aput-byte v3, v2, v1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 41
    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/util/encoders/HexEncoder;->decodingTable:[B

    const/16 v1, 0x41

    const/16 v2, 0x61

    aget-byte v2, v0, v2

    aput-byte v2, v0, v1

    const/16 v1, 0x42

    const/16 v2, 0x62

    .line 42
    aget-byte v2, v0, v2

    aput-byte v2, v0, v1

    const/16 v1, 0x43

    const/16 v2, 0x63

    .line 43
    aget-byte v2, v0, v2

    aput-byte v2, v0, v1

    const/16 v1, 0x44

    const/16 v2, 0x64

    .line 44
    aget-byte v2, v0, v2

    aput-byte v2, v0, v1

    const/16 v1, 0x45

    const/16 v2, 0x65

    .line 45
    aget-byte v2, v0, v2

    aput-byte v2, v0, v1

    const/16 v1, 0x46

    const/16 v2, 0x66

    .line 46
    aget-byte v2, v0, v2

    aput-byte v2, v0, v1

    return-void
.end method
