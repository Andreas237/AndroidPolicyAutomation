.class public Lorg/apache/sanselan/common/mylzw/MyBitInputStream;
.super Ljava/io/InputStream;
.source "MyBitInputStream.java"

# interfaces
.implements Lorg/apache/sanselan/common/BinaryConstants;


# instance fields
.field private bitCache:I

.field private bitsInCache:I

.field private final byteOrder:I

.field private bytesRead:J

.field private final is:Ljava/io/InputStream;

.field private tiffLZWMode:Z


# direct methods
.method public constructor <init>(Ljava/io/InputStream;I)V
    .locals 3

    .line 31
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    const/4 v0, 0x0

    .line 28
    iput-boolean v0, p0, Lorg/apache/sanselan/common/mylzw/MyBitInputStream;->tiffLZWMode:Z

    const-wide/16 v1, 0x0

    .line 41
    iput-wide v1, p0, Lorg/apache/sanselan/common/mylzw/MyBitInputStream;->bytesRead:J

    .line 42
    iput v0, p0, Lorg/apache/sanselan/common/mylzw/MyBitInputStream;->bitsInCache:I

    .line 43
    iput v0, p0, Lorg/apache/sanselan/common/mylzw/MyBitInputStream;->bitCache:I

    .line 32
    iput p2, p0, Lorg/apache/sanselan/common/mylzw/MyBitInputStream;->byteOrder:I

    .line 33
    iput-object p1, p0, Lorg/apache/sanselan/common/mylzw/MyBitInputStream;->is:Ljava/io/InputStream;

    return-void
.end method


# virtual methods
.method public flushCache()V
    .locals 1

    const/4 v0, 0x0

    .line 105
    iput v0, p0, Lorg/apache/sanselan/common/mylzw/MyBitInputStream;->bitsInCache:I

    .line 106
    iput v0, p0, Lorg/apache/sanselan/common/mylzw/MyBitInputStream;->bitCache:I

    return-void
.end method

.method public getBytesRead()J
    .locals 2

    .line 111
    iget-wide v0, p0, Lorg/apache/sanselan/common/mylzw/MyBitInputStream;->bytesRead:J

    return-wide v0
.end method

.method public read()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, 0x8

    .line 38
    invoke-virtual {p0, v0}, Lorg/apache/sanselan/common/mylzw/MyBitInputStream;->readBits(I)I

    move-result v0

    return v0
.end method

.method public readBits(I)I
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 52
    :goto_0
    iget v0, p0, Lorg/apache/sanselan/common/mylzw/MyBitInputStream;->bitsInCache:I

    const/16 v1, 0x49

    const/16 v2, 0x4d

    if-ge v0, p1, :cond_4

    .line 54
    iget-object v0, p0, Lorg/apache/sanselan/common/mylzw/MyBitInputStream;->is:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    if-gez v0, :cond_1

    .line 58
    iget-boolean p1, p0, Lorg/apache/sanselan/common/mylzw/MyBitInputStream;->tiffLZWMode:Z

    if-eqz p1, :cond_0

    const/16 p1, 0x101

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1

    :cond_1
    and-int/lit16 v0, v0, 0xff

    .line 68
    iget v3, p0, Lorg/apache/sanselan/common/mylzw/MyBitInputStream;->byteOrder:I

    if-ne v3, v2, :cond_2

    .line 69
    iget v1, p0, Lorg/apache/sanselan/common/mylzw/MyBitInputStream;->bitCache:I

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    iput v0, p0, Lorg/apache/sanselan/common/mylzw/MyBitInputStream;->bitCache:I

    goto :goto_1

    :cond_2
    if-ne v3, v1, :cond_3

    .line 71
    iget v1, p0, Lorg/apache/sanselan/common/mylzw/MyBitInputStream;->bitsInCache:I

    shl-int/2addr v0, v1

    iget v1, p0, Lorg/apache/sanselan/common/mylzw/MyBitInputStream;->bitCache:I

    or-int/2addr v0, v1

    iput v0, p0, Lorg/apache/sanselan/common/mylzw/MyBitInputStream;->bitCache:I

    .line 75
    :goto_1
    iget-wide v0, p0, Lorg/apache/sanselan/common/mylzw/MyBitInputStream;->bytesRead:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lorg/apache/sanselan/common/mylzw/MyBitInputStream;->bytesRead:J

    .line 76
    iget v0, p0, Lorg/apache/sanselan/common/mylzw/MyBitInputStream;->bitsInCache:I

    add-int/lit8 v0, v0, 0x8

    iput v0, p0, Lorg/apache/sanselan/common/mylzw/MyBitInputStream;->bitsInCache:I

    goto :goto_0

    .line 73
    :cond_3
    new-instance p1, Ljava/io/IOException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unknown byte order: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lorg/apache/sanselan/common/mylzw/MyBitInputStream;->byteOrder:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    const/4 v3, 0x1

    shl-int v4, v3, p1

    sub-int/2addr v4, v3

    .line 82
    iget v5, p0, Lorg/apache/sanselan/common/mylzw/MyBitInputStream;->byteOrder:I

    if-ne v5, v2, :cond_5

    .line 84
    iget v1, p0, Lorg/apache/sanselan/common/mylzw/MyBitInputStream;->bitCache:I

    sub-int/2addr v0, p1

    shr-int v0, v1, v0

    and-int/2addr v0, v4

    goto :goto_2

    :cond_5
    if-ne v5, v1, :cond_6

    .line 88
    iget v0, p0, Lorg/apache/sanselan/common/mylzw/MyBitInputStream;->bitCache:I

    and-int v1, v4, v0

    shr-int/2addr v0, p1

    .line 89
    iput v0, p0, Lorg/apache/sanselan/common/mylzw/MyBitInputStream;->bitCache:I

    move v0, v1

    .line 96
    :goto_2
    iget v1, p0, Lorg/apache/sanselan/common/mylzw/MyBitInputStream;->bitsInCache:I

    sub-int/2addr v1, p1

    iput v1, p0, Lorg/apache/sanselan/common/mylzw/MyBitInputStream;->bitsInCache:I

    .line 97
    iget p1, p0, Lorg/apache/sanselan/common/mylzw/MyBitInputStream;->bitsInCache:I

    shl-int p1, v3, p1

    sub-int/2addr p1, v3

    .line 98
    iget v1, p0, Lorg/apache/sanselan/common/mylzw/MyBitInputStream;->bitCache:I

    and-int/2addr p1, v1

    iput p1, p0, Lorg/apache/sanselan/common/mylzw/MyBitInputStream;->bitCache:I

    return v0

    .line 92
    :cond_6
    new-instance p1, Ljava/io/IOException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unknown byte order: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lorg/apache/sanselan/common/mylzw/MyBitInputStream;->byteOrder:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setTiffLZWMode()V
    .locals 1

    const/4 v0, 0x1

    .line 47
    iput-boolean v0, p0, Lorg/apache/sanselan/common/mylzw/MyBitInputStream;->tiffLZWMode:Z

    return-void
.end method
