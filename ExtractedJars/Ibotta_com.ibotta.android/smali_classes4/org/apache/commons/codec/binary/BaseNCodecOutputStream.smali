.class public Lorg/apache/commons/codec/binary/BaseNCodecOutputStream;
.super Ljava/io/FilterOutputStream;
.source "BaseNCodecOutputStream.java"


# instance fields
.field private final baseNCodec:Lorg/apache/commons/codec/binary/BaseNCodec;

.field private final doEncode:Z

.field private final singleByte:[B


# direct methods
.method public constructor <init>(Ljava/io/OutputStream;Lorg/apache/commons/codec/binary/BaseNCodec;Z)V
    .locals 0

    .line 38
    invoke-direct {p0, p1}, Ljava/io/FilterOutputStream;-><init>(Ljava/io/OutputStream;)V

    const/4 p1, 0x1

    .line 35
    new-array p1, p1, [B

    iput-object p1, p0, Lorg/apache/commons/codec/binary/BaseNCodecOutputStream;->singleByte:[B

    .line 39
    iput-object p2, p0, Lorg/apache/commons/codec/binary/BaseNCodecOutputStream;->baseNCodec:Lorg/apache/commons/codec/binary/BaseNCodec;

    .line 40
    iput-boolean p3, p0, Lorg/apache/commons/codec/binary/BaseNCodecOutputStream;->doEncode:Z

    return-void
.end method

.method private flush(Z)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 103
    iget-object v0, p0, Lorg/apache/commons/codec/binary/BaseNCodecOutputStream;->baseNCodec:Lorg/apache/commons/codec/binary/BaseNCodec;

    invoke-virtual {v0}, Lorg/apache/commons/codec/binary/BaseNCodec;->available()I

    move-result v0

    if-lez v0, :cond_0

    .line 105
    new-array v1, v0, [B

    .line 106
    iget-object v2, p0, Lorg/apache/commons/codec/binary/BaseNCodecOutputStream;->baseNCodec:Lorg/apache/commons/codec/binary/BaseNCodec;

    const/4 v3, 0x0

    invoke-virtual {v2, v1, v3, v0}, Lorg/apache/commons/codec/binary/BaseNCodec;->readResults([BII)I

    move-result v0

    if-lez v0, :cond_0

    .line 108
    iget-object v2, p0, Lorg/apache/commons/codec/binary/BaseNCodecOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v2, v1, v3, v0}, Ljava/io/OutputStream;->write([BII)V

    :cond_0
    if-eqz p1, :cond_1

    .line 112
    iget-object p1, p0, Lorg/apache/commons/codec/binary/BaseNCodecOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V

    :cond_1
    return-void
.end method


# virtual methods
.method public close()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 136
    iget-boolean v0, p0, Lorg/apache/commons/codec/binary/BaseNCodecOutputStream;->doEncode:Z

    const/4 v1, -0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    .line 137
    iget-object v0, p0, Lorg/apache/commons/codec/binary/BaseNCodecOutputStream;->baseNCodec:Lorg/apache/commons/codec/binary/BaseNCodec;

    iget-object v3, p0, Lorg/apache/commons/codec/binary/BaseNCodecOutputStream;->singleByte:[B

    invoke-virtual {v0, v3, v2, v1}, Lorg/apache/commons/codec/binary/BaseNCodec;->encode([BII)V

    goto :goto_0

    .line 139
    :cond_0
    iget-object v0, p0, Lorg/apache/commons/codec/binary/BaseNCodecOutputStream;->baseNCodec:Lorg/apache/commons/codec/binary/BaseNCodec;

    iget-object v3, p0, Lorg/apache/commons/codec/binary/BaseNCodecOutputStream;->singleByte:[B

    invoke-virtual {v0, v3, v2, v1}, Lorg/apache/commons/codec/binary/BaseNCodec;->decode([BII)V

    .line 141
    :goto_0
    invoke-virtual {p0}, Lorg/apache/commons/codec/binary/BaseNCodecOutputStream;->flush()V

    .line 142
    iget-object v0, p0, Lorg/apache/commons/codec/binary/BaseNCodecOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    return-void
.end method

.method public flush()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    .line 124
    invoke-direct {p0, v0}, Lorg/apache/commons/codec/binary/BaseNCodecOutputStream;->flush(Z)V

    return-void
.end method

.method public write(I)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 53
    iget-object v0, p0, Lorg/apache/commons/codec/binary/BaseNCodecOutputStream;->singleByte:[B

    int-to-byte p1, p1

    const/4 v1, 0x0

    aput-byte p1, v0, v1

    const/4 p1, 0x1

    .line 54
    invoke-virtual {p0, v0, v1, p1}, Lorg/apache/commons/codec/binary/BaseNCodecOutputStream;->write([BII)V

    return-void
.end method

.method public write([BII)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-eqz p1, :cond_4

    if-ltz p2, :cond_3

    if-ltz p3, :cond_3

    .line 81
    array-length v0, p1

    if-gt p2, v0, :cond_2

    add-int v0, p2, p3

    array-length v1, p1

    if-gt v0, v1, :cond_2

    if-lez p3, :cond_1

    .line 84
    iget-boolean v0, p0, Lorg/apache/commons/codec/binary/BaseNCodecOutputStream;->doEncode:Z

    if-eqz v0, :cond_0

    .line 85
    iget-object v0, p0, Lorg/apache/commons/codec/binary/BaseNCodecOutputStream;->baseNCodec:Lorg/apache/commons/codec/binary/BaseNCodec;

    invoke-virtual {v0, p1, p2, p3}, Lorg/apache/commons/codec/binary/BaseNCodec;->encode([BII)V

    goto :goto_0

    .line 87
    :cond_0
    iget-object v0, p0, Lorg/apache/commons/codec/binary/BaseNCodecOutputStream;->baseNCodec:Lorg/apache/commons/codec/binary/BaseNCodec;

    invoke-virtual {v0, p1, p2, p3}, Lorg/apache/commons/codec/binary/BaseNCodec;->decode([BII)V

    :goto_0
    const/4 p1, 0x0

    .line 89
    invoke-direct {p0, p1}, Lorg/apache/commons/codec/binary/BaseNCodecOutputStream;->flush(Z)V

    :cond_1
    return-void

    .line 82
    :cond_2
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1

    .line 80
    :cond_3
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1

    .line 78
    :cond_4
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1}, Ljava/lang/NullPointerException;-><init>()V

    throw p1
.end method
