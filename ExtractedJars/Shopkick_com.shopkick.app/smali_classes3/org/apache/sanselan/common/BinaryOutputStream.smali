.class public Lorg/apache/sanselan/common/BinaryOutputStream;
.super Ljava/io/OutputStream;
.source "BinaryOutputStream.java"

# interfaces
.implements Lorg/apache/sanselan/common/BinaryConstants;


# instance fields
.field private byteOrder:I

.field private count:I

.field protected debug:Z

.field private final os:Ljava/io/OutputStream;


# direct methods
.method public constructor <init>(Ljava/io/OutputStream;)V
    .locals 1

    .line 48
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    const/4 v0, 0x0

    .line 26
    iput-boolean v0, p0, Lorg/apache/sanselan/common/BinaryOutputStream;->debug:Z

    .line 27
    iput v0, p0, Lorg/apache/sanselan/common/BinaryOutputStream;->count:I

    const/16 v0, 0x4d

    .line 53
    iput v0, p0, Lorg/apache/sanselan/common/BinaryOutputStream;->byteOrder:I

    .line 49
    iput-object p1, p0, Lorg/apache/sanselan/common/BinaryOutputStream;->os:Ljava/io/OutputStream;

    return-void
.end method

.method public constructor <init>(Ljava/io/OutputStream;I)V
    .locals 1

    .line 42
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    const/4 v0, 0x0

    .line 26
    iput-boolean v0, p0, Lorg/apache/sanselan/common/BinaryOutputStream;->debug:Z

    .line 27
    iput v0, p0, Lorg/apache/sanselan/common/BinaryOutputStream;->count:I

    const/16 v0, 0x4d

    .line 53
    iput v0, p0, Lorg/apache/sanselan/common/BinaryOutputStream;->byteOrder:I

    .line 43
    iput p2, p0, Lorg/apache/sanselan/common/BinaryOutputStream;->byteOrder:I

    .line 44
    iput-object p1, p0, Lorg/apache/sanselan/common/BinaryOutputStream;->os:Ljava/io/OutputStream;

    return-void
.end method

.method private convertValueToByteArray(II)[B
    .locals 4

    .line 149
    new-array v0, p2, [B

    .line 151
    iget v1, p0, Lorg/apache/sanselan/common/BinaryOutputStream;->byteOrder:I

    const/4 v2, 0x0

    const/16 v3, 0x4d

    if-ne v1, v3, :cond_0

    :goto_0
    if-ge v2, p2, :cond_1

    sub-int v1, p2, v2

    add-int/lit8 v1, v1, -0x1

    mul-int/lit8 v1, v1, 0x8

    shr-int v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    .line 156
    aput-byte v1, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    :goto_1
    if-ge v2, p2, :cond_1

    mul-int/lit8 v1, v2, 0x8

    shr-int v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    .line 163
    aput-byte v1, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return-object v0
.end method

.method private final writeNBytes(II)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageWriteException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 173
    invoke-direct {p0, p1, p2}, Lorg/apache/sanselan/common/BinaryOutputStream;->convertValueToByteArray(II)[B

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/apache/sanselan/common/BinaryOutputStream;->write([B)V

    return-void
.end method


# virtual methods
.method public getByteCount()I
    .locals 1

    .line 88
    iget v0, p0, Lorg/apache/sanselan/common/BinaryOutputStream;->count:I

    return v0
.end method

.method public getByteOrder()I
    .locals 1

    .line 77
    iget v0, p0, Lorg/apache/sanselan/common/BinaryOutputStream;->byteOrder:I

    return v0
.end method

.method public final getDebug()Z
    .locals 1

    .line 36
    iget-boolean v0, p0, Lorg/apache/sanselan/common/BinaryOutputStream;->debug:Z

    return v0
.end method

.method protected setByteOrder(I)V
    .locals 0

    .line 72
    iput p1, p0, Lorg/apache/sanselan/common/BinaryOutputStream;->byteOrder:I

    return-void
.end method

.method protected setByteOrder(II)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageWriteException;,
            Ljava/io/IOException;
        }
    .end annotation

    if-ne p1, p2, :cond_2

    const/16 p2, 0x4d

    if-ne p1, p2, :cond_0

    .line 63
    iput p1, p0, Lorg/apache/sanselan/common/BinaryOutputStream;->byteOrder:I

    goto :goto_0

    :cond_0
    const/16 p2, 0x49

    if-ne p1, p2, :cond_1

    .line 65
    iput p1, p0, Lorg/apache/sanselan/common/BinaryOutputStream;->byteOrder:I

    :goto_0
    return-void

    .line 67
    :cond_1
    new-instance p2, Lorg/apache/sanselan/ImageWriteException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unknown Byte Order hint: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lorg/apache/sanselan/ImageWriteException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 59
    :cond_2
    new-instance v0, Lorg/apache/sanselan/ImageWriteException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Byte Order bytes don\'t match ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ")."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lorg/apache/sanselan/ImageWriteException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final setDebug(Z)V
    .locals 0

    .line 31
    iput-boolean p1, p0, Lorg/apache/sanselan/common/BinaryOutputStream;->debug:Z

    return-void
.end method

.method public write(I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 82
    iget-object v0, p0, Lorg/apache/sanselan/common/BinaryOutputStream;->os:Ljava/io/OutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write(I)V

    .line 83
    iget p1, p0, Lorg/apache/sanselan/common/BinaryOutputStream;->count:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lorg/apache/sanselan/common/BinaryOutputStream;->count:I

    return-void
.end method

.method public final write2ByteInteger(I)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageWriteException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 130
    iget v0, p0, Lorg/apache/sanselan/common/BinaryOutputStream;->byteOrder:I

    const/16 v1, 0x4d

    if-ne v0, v1, :cond_0

    shr-int/lit8 v0, p1, 0x8

    and-int/lit16 v0, v0, 0xff

    .line 132
    invoke-virtual {p0, v0}, Lorg/apache/sanselan/common/BinaryOutputStream;->write(I)V

    and-int/lit16 p1, p1, 0xff

    .line 133
    invoke-virtual {p0, p1}, Lorg/apache/sanselan/common/BinaryOutputStream;->write(I)V

    goto :goto_0

    :cond_0
    and-int/lit16 v0, p1, 0xff

    .line 136
    invoke-virtual {p0, v0}, Lorg/apache/sanselan/common/BinaryOutputStream;->write(I)V

    shr-int/lit8 p1, p1, 0x8

    and-int/lit16 p1, p1, 0xff

    .line 137
    invoke-virtual {p0, p1}, Lorg/apache/sanselan/common/BinaryOutputStream;->write(I)V

    :goto_0
    return-void
.end method

.method public final write2Bytes(I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageWriteException;,
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x2

    .line 106
    invoke-direct {p0, p1, v0}, Lorg/apache/sanselan/common/BinaryOutputStream;->writeNBytes(II)V

    return-void
.end method

.method public final write3Bytes(I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageWriteException;,
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x3

    .line 100
    invoke-direct {p0, p1, v0}, Lorg/apache/sanselan/common/BinaryOutputStream;->writeNBytes(II)V

    return-void
.end method

.method public final write4ByteInteger(I)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageWriteException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 112
    iget v0, p0, Lorg/apache/sanselan/common/BinaryOutputStream;->byteOrder:I

    const/16 v1, 0x4d

    if-ne v0, v1, :cond_0

    shr-int/lit8 v0, p1, 0x18

    and-int/lit16 v0, v0, 0xff

    .line 114
    invoke-virtual {p0, v0}, Lorg/apache/sanselan/common/BinaryOutputStream;->write(I)V

    shr-int/lit8 v0, p1, 0x10

    and-int/lit16 v0, v0, 0xff

    .line 115
    invoke-virtual {p0, v0}, Lorg/apache/sanselan/common/BinaryOutputStream;->write(I)V

    shr-int/lit8 v0, p1, 0x8

    and-int/lit16 v0, v0, 0xff

    .line 116
    invoke-virtual {p0, v0}, Lorg/apache/sanselan/common/BinaryOutputStream;->write(I)V

    and-int/lit16 p1, p1, 0xff

    .line 117
    invoke-virtual {p0, p1}, Lorg/apache/sanselan/common/BinaryOutputStream;->write(I)V

    goto :goto_0

    :cond_0
    and-int/lit16 v0, p1, 0xff

    .line 120
    invoke-virtual {p0, v0}, Lorg/apache/sanselan/common/BinaryOutputStream;->write(I)V

    shr-int/lit8 v0, p1, 0x8

    and-int/lit16 v0, v0, 0xff

    .line 121
    invoke-virtual {p0, v0}, Lorg/apache/sanselan/common/BinaryOutputStream;->write(I)V

    shr-int/lit8 v0, p1, 0x10

    and-int/lit16 v0, v0, 0xff

    .line 122
    invoke-virtual {p0, v0}, Lorg/apache/sanselan/common/BinaryOutputStream;->write(I)V

    shr-int/lit8 p1, p1, 0x18

    and-int/lit16 p1, p1, 0xff

    .line 123
    invoke-virtual {p0, p1}, Lorg/apache/sanselan/common/BinaryOutputStream;->write(I)V

    :goto_0
    return-void
.end method

.method public final write4Bytes(I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageWriteException;,
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x4

    .line 94
    invoke-direct {p0, p1, v0}, Lorg/apache/sanselan/common/BinaryOutputStream;->writeNBytes(II)V

    return-void
.end method

.method public final writeByteArray([B)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 143
    iget-object v0, p0, Lorg/apache/sanselan/common/BinaryOutputStream;->os:Ljava/io/OutputStream;

    array-length v1, p1

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v2, v1}, Ljava/io/OutputStream;->write([BII)V

    .line 144
    iget v0, p0, Lorg/apache/sanselan/common/BinaryOutputStream;->count:I

    array-length p1, p1

    add-int/2addr v0, p1

    iput v0, p0, Lorg/apache/sanselan/common/BinaryOutputStream;->count:I

    return-void
.end method
