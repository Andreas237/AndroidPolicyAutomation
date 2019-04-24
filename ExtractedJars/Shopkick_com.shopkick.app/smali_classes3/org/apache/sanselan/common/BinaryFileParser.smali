.class public Lorg/apache/sanselan/common/BinaryFileParser;
.super Lorg/apache/sanselan/common/BinaryFileFunctions;
.source "BinaryFileParser.java"


# instance fields
.field private byteOrder:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 32
    invoke-direct {p0}, Lorg/apache/sanselan/common/BinaryFileFunctions;-><init>()V

    const/16 v0, 0x4d

    .line 37
    iput v0, p0, Lorg/apache/sanselan/common/BinaryFileParser;->byteOrder:I

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 27
    invoke-direct {p0}, Lorg/apache/sanselan/common/BinaryFileFunctions;-><init>()V

    const/16 v0, 0x4d

    .line 37
    iput v0, p0, Lorg/apache/sanselan/common/BinaryFileParser;->byteOrder:I

    .line 28
    iput p1, p0, Lorg/apache/sanselan/common/BinaryFileParser;->byteOrder:I

    return-void
.end method

.method public static byteArrayHasPrefix([B[B)Z
    .locals 4

    const/4 v0, 0x0

    if-eqz p0, :cond_3

    .line 109
    array-length v1, p0

    array-length v2, p1

    if-ge v1, v2, :cond_0

    goto :goto_1

    :cond_0
    move v1, v0

    .line 112
    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_2

    .line 113
    aget-byte v2, p0, v1

    aget-byte v3, p1, v1

    if-eq v2, v3, :cond_1

    return v0

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x1

    return p0

    :cond_3
    :goto_1
    return v0
.end method


# virtual methods
.method protected final convertByteArrayToInt(Ljava/lang/String;I[B)I
    .locals 1

    .line 69
    iget v0, p0, Lorg/apache/sanselan/common/BinaryFileParser;->byteOrder:I

    invoke-virtual {p0, p1, p3, p2, v0}, Lorg/apache/sanselan/common/BinaryFileParser;->convertByteArrayToInt(Ljava/lang/String;[BII)I

    move-result p1

    return p1
.end method

.method protected final convertByteArrayToInt(Ljava/lang/String;[B)I
    .locals 1

    .line 74
    iget v0, p0, Lorg/apache/sanselan/common/BinaryFileParser;->byteOrder:I

    invoke-virtual {p0, p1, p2, v0}, Lorg/apache/sanselan/common/BinaryFileParser;->convertByteArrayToInt(Ljava/lang/String;[BI)I

    move-result p1

    return p1
.end method

.method public final convertByteArrayToShort(Ljava/lang/String;I[B)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;
        }
    .end annotation

    .line 86
    iget v0, p0, Lorg/apache/sanselan/common/BinaryFileParser;->byteOrder:I

    invoke-virtual {p0, p1, p2, p3, v0}, Lorg/apache/sanselan/common/BinaryFileParser;->convertByteArrayToShort(Ljava/lang/String;I[BI)I

    move-result p1

    return p1
.end method

.method public final convertByteArrayToShort(Ljava/lang/String;[B)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;
        }
    .end annotation

    .line 80
    iget v0, p0, Lorg/apache/sanselan/common/BinaryFileParser;->byteOrder:I

    invoke-virtual {p0, p1, p2, v0}, Lorg/apache/sanselan/common/BinaryFileParser;->convertByteArrayToShort(Ljava/lang/String;[BI)I

    move-result p1

    return p1
.end method

.method protected getByteOrder()I
    .locals 1

    .line 63
    iget v0, p0, Lorg/apache/sanselan/common/BinaryFileParser;->byteOrder:I

    return v0
.end method

.method protected final int2ToByteArray(I)[B
    .locals 1

    .line 121
    iget v0, p0, Lorg/apache/sanselan/common/BinaryFileParser;->byteOrder:I

    invoke-static {p1, v0}, Lorg/apache/sanselan/common/BinaryFileParser;->int2ToByteArray(II)[B

    move-result-object p1

    return-object p1
.end method

.method public final read2Bytes(Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 104
    iget v0, p0, Lorg/apache/sanselan/common/BinaryFileParser;->byteOrder:I

    invoke-virtual {p0, p1, p2, p3, v0}, Lorg/apache/sanselan/common/BinaryFileParser;->read2Bytes(Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;I)I

    move-result p1

    return p1
.end method

.method public final read3Bytes(Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 98
    iget v0, p0, Lorg/apache/sanselan/common/BinaryFileParser;->byteOrder:I

    invoke-virtual {p0, p1, p2, p3, v0}, Lorg/apache/sanselan/common/BinaryFileParser;->read3Bytes(Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;I)I

    move-result p1

    return p1
.end method

.method public final read4Bytes(Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 92
    iget v0, p0, Lorg/apache/sanselan/common/BinaryFileParser;->byteOrder:I

    invoke-virtual {p0, p1, p2, p3, v0}, Lorg/apache/sanselan/common/BinaryFileParser;->read4Bytes(Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;I)I

    move-result p1

    return p1
.end method

.method protected setByteOrder(I)V
    .locals 0

    .line 58
    iput p1, p0, Lorg/apache/sanselan/common/BinaryFileParser;->byteOrder:I

    return-void
.end method

.method protected setByteOrder(II)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    if-ne p1, p2, :cond_2

    const/16 p2, 0x4d

    if-ne p1, p2, :cond_0

    .line 49
    iput p1, p0, Lorg/apache/sanselan/common/BinaryFileParser;->byteOrder:I

    goto :goto_0

    :cond_0
    const/16 p2, 0x49

    if-ne p1, p2, :cond_1

    .line 51
    iput p1, p0, Lorg/apache/sanselan/common/BinaryFileParser;->byteOrder:I

    :goto_0
    return-void

    .line 53
    :cond_1
    new-instance p2, Lorg/apache/sanselan/ImageReadException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unknown Byte Order hint: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lorg/apache/sanselan/ImageReadException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 45
    :cond_2
    new-instance v0, Lorg/apache/sanselan/ImageReadException;

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

    invoke-direct {v0, p1}, Lorg/apache/sanselan/ImageReadException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
