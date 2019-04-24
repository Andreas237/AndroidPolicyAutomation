.class public Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;
.super Ljava/io/OutputStream;
.source "MyBitOutputStream.java"

# interfaces
.implements Lorg/apache/sanselan/common/BinaryConstants;


# instance fields
.field private bitCache:I

.field private bitsInCache:I

.field private final byteOrder:I

.field private bytesWritten:I

.field private final os:Ljava/io/OutputStream;


# direct methods
.method public constructor <init>(Ljava/io/OutputStream;I)V
    .locals 1

    .line 30
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    const/4 v0, 0x0

    .line 40
    iput v0, p0, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;->bitsInCache:I

    .line 41
    iput v0, p0, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;->bitCache:I

    .line 85
    iput v0, p0, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;->bytesWritten:I

    .line 31
    iput p2, p0, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;->byteOrder:I

    .line 32
    iput-object p1, p0, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;->os:Ljava/io/OutputStream;

    return-void
.end method

.method private actualWrite(I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 89
    iget-object v0, p0, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;->os:Ljava/io/OutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write(I)V

    .line 90
    iget p1, p0, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;->bytesWritten:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;->bytesWritten:I

    return-void
.end method


# virtual methods
.method public flushCache()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 95
    iget v0, p0, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;->bitsInCache:I

    if-lez v0, :cond_1

    const/4 v1, 0x1

    shl-int v2, v1, v0

    sub-int/2addr v2, v1

    .line 98
    iget v1, p0, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;->bitCache:I

    and-int/2addr v1, v2

    .line 100
    iget v2, p0, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;->byteOrder:I

    const/16 v3, 0x4d

    if-ne v2, v3, :cond_0

    rsub-int/lit8 v0, v0, 0x8

    shl-int v0, v1, v0

    .line 103
    iget-object v1, p0, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;->os:Ljava/io/OutputStream;

    invoke-virtual {v1, v0}, Ljava/io/OutputStream;->write(I)V

    goto :goto_0

    :cond_0
    const/16 v0, 0x49

    if-ne v2, v0, :cond_1

    .line 107
    iget-object v0, p0, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;->os:Ljava/io/OutputStream;

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write(I)V

    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 111
    iput v0, p0, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;->bitsInCache:I

    .line 112
    iput v0, p0, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;->bitCache:I

    return-void
.end method

.method public getBytesWritten()I
    .locals 2

    .line 117
    iget v0, p0, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;->bytesWritten:I

    iget v1, p0, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;->bitsInCache:I

    if-lez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public write(I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, 0x8

    .line 37
    invoke-virtual {p0, p1, v0}, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;->writeBits(II)V

    return-void
.end method

.method public writeBits(II)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    shl-int v1, v0, p2

    sub-int/2addr v1, v0

    and-int/2addr p1, v1

    .line 50
    iget v1, p0, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;->byteOrder:I

    const/16 v2, 0x49

    const/16 v3, 0x4d

    if-ne v1, v3, :cond_0

    .line 52
    iget v1, p0, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;->bitCache:I

    shl-int/2addr v1, p2

    or-int/2addr p1, v1

    iput p1, p0, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;->bitCache:I

    goto :goto_0

    :cond_0
    if-ne v1, v2, :cond_4

    .line 56
    iget v1, p0, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;->bitCache:I

    iget v4, p0, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;->bitsInCache:I

    shl-int/2addr p1, v4

    or-int/2addr p1, v1

    iput p1, p0, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;->bitCache:I

    .line 60
    :goto_0
    iget p1, p0, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;->bitsInCache:I

    add-int/2addr p1, p2

    iput p1, p0, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;->bitsInCache:I

    .line 62
    :goto_1
    iget p1, p0, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;->bitsInCache:I

    const/16 p2, 0x8

    if-lt p1, p2, :cond_3

    .line 64
    iget v1, p0, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;->byteOrder:I

    if-ne v1, v3, :cond_1

    .line 66
    iget v1, p0, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;->bitCache:I

    add-int/lit8 p1, p1, -0x8

    shr-int p1, v1, p1

    and-int/lit16 p1, p1, 0xff

    .line 67
    invoke-direct {p0, p1}, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;->actualWrite(I)V

    .line 69
    iget p1, p0, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;->bitsInCache:I

    sub-int/2addr p1, p2

    iput p1, p0, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;->bitsInCache:I

    goto :goto_2

    :cond_1
    if-ne v1, v2, :cond_2

    .line 73
    iget p1, p0, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;->bitCache:I

    and-int/lit16 p1, p1, 0xff

    .line 74
    invoke-direct {p0, p1}, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;->actualWrite(I)V

    .line 76
    iget p1, p0, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;->bitCache:I

    shr-int/2addr p1, p2

    iput p1, p0, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;->bitCache:I

    .line 77
    iget p1, p0, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;->bitsInCache:I

    sub-int/2addr p1, p2

    iput p1, p0, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;->bitsInCache:I

    .line 79
    :cond_2
    :goto_2
    iget p1, p0, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;->bitsInCache:I

    shl-int p1, v0, p1

    sub-int/2addr p1, v0

    .line 80
    iget p2, p0, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;->bitCache:I

    and-int/2addr p1, p2

    iput p1, p0, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;->bitCache:I

    goto :goto_1

    :cond_3
    return-void

    .line 59
    :cond_4
    new-instance p1, Ljava/io/IOException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Unknown byte order: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;->byteOrder:I

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
