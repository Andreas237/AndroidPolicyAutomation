.class public Lorg/apache/sanselan/common/PackBits;
.super Ljava/lang/Object;
.source "PackBits.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private findNextDuplicate([BI)I
    .locals 3

    .line 84
    array-length v0, p1

    const/4 v1, -0x1

    if-lt p2, v0, :cond_0

    return v1

    .line 87
    :cond_0
    aget-byte v0, p1, p2

    add-int/lit8 p2, p2, 0x1

    .line 89
    :goto_0
    array-length v2, p1

    if-ge p2, v2, :cond_2

    .line 91
    aget-byte v2, p1, p2

    if-ne v2, v0, :cond_1

    add-int/lit8 p2, p2, -0x1

    return p2

    :cond_1
    add-int/lit8 p2, p2, 0x1

    move v0, v2

    goto :goto_0

    :cond_2
    return v1
.end method

.method private findRunLength([BI)I
    .locals 3

    .line 104
    aget-byte v0, p1, p2

    add-int/lit8 v1, p2, 0x1

    .line 108
    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_0

    aget-byte v2, p1, v1

    if-ne v2, v0, :cond_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    sub-int/2addr v1, p2

    return v1
.end method


# virtual methods
.method public compress([B)[B
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 116
    new-instance v0, Lorg/apache/sanselan/common/MyByteArrayOutputStream;

    array-length v1, p1

    mul-int/lit8 v1, v1, 0x2

    invoke-direct {v0, v1}, Lorg/apache/sanselan/common/MyByteArrayOutputStream;-><init>(I)V

    const/4 v1, 0x0

    move v2, v1

    .line 121
    :goto_0
    array-length v3, p1

    if-ge v2, v3, :cond_4

    .line 124
    invoke-direct {p0, p1, v2}, Lorg/apache/sanselan/common/PackBits;->findNextDuplicate([BI)I

    move-result v3

    const/16 v4, 0x80

    if-ne v3, v2, :cond_0

    .line 128
    invoke-direct {p0, p1, v3}, Lorg/apache/sanselan/common/PackBits;->findRunLength([BI)I

    move-result v3

    .line 129
    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v3

    add-int/lit8 v4, v3, -0x1

    neg-int v4, v4

    .line 130
    invoke-virtual {v0, v4}, Lorg/apache/sanselan/common/MyByteArrayOutputStream;->write(I)V

    .line 131
    aget-byte v4, p1, v2

    invoke-virtual {v0, v4}, Lorg/apache/sanselan/common/MyByteArrayOutputStream;->write(I)V

    add-int/2addr v2, v3

    goto :goto_0

    :cond_0
    sub-int v5, v3, v2

    if-lez v3, :cond_1

    .line 140
    invoke-direct {p0, p1, v3}, Lorg/apache/sanselan/common/PackBits;->findRunLength([BI)I

    move-result v6

    const/4 v7, 0x3

    if-ge v6, v7, :cond_1

    add-int v7, v2, v5

    add-int/2addr v7, v6

    .line 144
    invoke-direct {p0, p1, v7}, Lorg/apache/sanselan/common/PackBits;->findNextDuplicate([BI)I

    move-result v6

    if-eq v6, v7, :cond_1

    sub-int v5, v6, v2

    move v3, v6

    :cond_1
    if-gez v3, :cond_2

    .line 154
    array-length v3, p1

    sub-int v5, v3, v2

    .line 155
    :cond_2
    invoke-static {v5, v4}, Ljava/lang/Math;->min(II)I

    move-result v3

    add-int/lit8 v4, v3, -0x1

    .line 157
    invoke-virtual {v0, v4}, Lorg/apache/sanselan/common/MyByteArrayOutputStream;->write(I)V

    move v4, v2

    move v2, v1

    :goto_1
    if-ge v2, v3, :cond_3

    .line 160
    aget-byte v5, p1, v4

    invoke-virtual {v0, v5}, Lorg/apache/sanselan/common/MyByteArrayOutputStream;->write(I)V

    add-int/lit8 v4, v4, 0x1

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    move v2, v4

    goto :goto_0

    .line 165
    :cond_4
    invoke-virtual {v0}, Lorg/apache/sanselan/common/MyByteArrayOutputStream;->toByteArray()[B

    move-result-object p1

    return-object p1
.end method

.method public decompress([BI)[B
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 32
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const/4 v1, 0x0

    move v2, v1

    move v3, v2

    :goto_0
    if-ge v2, p2, :cond_6

    .line 40
    array-length v4, p1

    if-ge v3, v4, :cond_5

    add-int/lit8 v4, v3, 0x1

    .line 46
    aget-byte v3, p1, v3

    if-ltz v3, :cond_1

    const/16 v5, 0x7f

    if-gt v3, v5, :cond_1

    add-int/lit8 v3, v3, 0x1

    add-int/2addr v2, v3

    move v5, v4

    move v4, v1

    :goto_1
    if-ge v4, v3, :cond_0

    add-int/lit8 v6, v5, 0x1

    .line 55
    aget-byte v5, p1, v5

    invoke-virtual {v0, v5}, Ljava/io/ByteArrayOutputStream;->write(I)V

    add-int/lit8 v4, v4, 0x1

    move v5, v6

    goto :goto_1

    :cond_0
    move v3, v5

    goto :goto_0

    :cond_1
    const/16 v5, -0x7f

    if-lt v3, v5, :cond_3

    const/4 v5, -0x1

    if-gt v3, v5, :cond_3

    add-int/lit8 v5, v4, 0x1

    .line 61
    aget-byte v4, p1, v4

    neg-int v3, v3

    add-int/lit8 v3, v3, 0x1

    add-int/2addr v2, v3

    move v6, v1

    :goto_2
    if-ge v6, v3, :cond_2

    .line 66
    invoke-virtual {v0, v4}, Ljava/io/ByteArrayOutputStream;->write(I)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_2
    move v3, v5

    goto :goto_0

    :cond_3
    const/16 v5, -0x80

    if-eq v3, v5, :cond_4

    move v3, v4

    goto :goto_0

    .line 69
    :cond_4
    new-instance p1, Lorg/apache/sanselan/ImageReadException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Packbits: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lorg/apache/sanselan/ImageReadException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 41
    :cond_5
    new-instance p1, Lorg/apache/sanselan/ImageReadException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Tiff: Unpack bits source exhausted: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", done + "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", expected + "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lorg/apache/sanselan/ImageReadException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 75
    :cond_6
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p1

    return-object p1
.end method
