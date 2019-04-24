.class public Lorg/apache/sanselan/formats/jpeg/segments/JFIFSegment;
.super Lorg/apache/sanselan/formats/jpeg/segments/Segment;
.source "JFIFSegment.java"

# interfaces
.implements Lorg/apache/sanselan/formats/jpeg/JpegConstants;


# instance fields
.field public final densityUnits:I

.field public final jfifMajorVersion:I

.field public final jfifMinorVersion:I

.field public final thumbnailSize:I

.field public final xDensity:I

.field public final xThumbnail:I

.field public final yDensity:I

.field public final yThumbnail:I


# direct methods
.method public constructor <init>(IILjava/io/InputStream;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 52
    invoke-direct {p0, p1, p2}, Lorg/apache/sanselan/formats/jpeg/segments/Segment;-><init>(II)V

    .line 54
    sget-object p1, Lorg/apache/sanselan/formats/jpeg/segments/JFIFSegment;->JFIF0_SIGNATURE:[B

    array-length p1, p1

    invoke-virtual {p0, p3, p1}, Lorg/apache/sanselan/formats/jpeg/segments/JFIFSegment;->readBytes(Ljava/io/InputStream;I)[B

    move-result-object p1

    .line 55
    sget-object p2, Lorg/apache/sanselan/formats/jpeg/segments/JFIFSegment;->JFIF0_SIGNATURE:[B

    invoke-virtual {p0, p1, p2}, Lorg/apache/sanselan/formats/jpeg/segments/JFIFSegment;->compareByteArrays([B[B)Z

    move-result p2

    if-nez p2, :cond_1

    sget-object p2, Lorg/apache/sanselan/formats/jpeg/segments/JFIFSegment;->JFIF0_SIGNATURE_ALTERNATIVE:[B

    .line 56
    invoke-virtual {p0, p1, p2}, Lorg/apache/sanselan/formats/jpeg/segments/JFIFSegment;->compareByteArrays([B[B)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 57
    :cond_0
    new-instance p1, Lorg/apache/sanselan/ImageReadException;

    const-string p2, "Not a Valid JPEG File: missing JFIF string"

    invoke-direct {p1, p2}, Lorg/apache/sanselan/ImageReadException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    const-string p1, "JFIF_major_version"

    const-string p2, "Not a Valid JPEG File"

    .line 60
    invoke-virtual {p0, p1, p3, p2}, Lorg/apache/sanselan/formats/jpeg/segments/JFIFSegment;->readByte(Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;)B

    move-result p1

    iput p1, p0, Lorg/apache/sanselan/formats/jpeg/segments/JFIFSegment;->jfifMajorVersion:I

    const-string p1, "JFIF_minor_version"

    const-string p2, "Not a Valid JPEG File"

    .line 62
    invoke-virtual {p0, p1, p3, p2}, Lorg/apache/sanselan/formats/jpeg/segments/JFIFSegment;->readByte(Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;)B

    move-result p1

    iput p1, p0, Lorg/apache/sanselan/formats/jpeg/segments/JFIFSegment;->jfifMinorVersion:I

    const-string p1, "density_units"

    const-string p2, "Not a Valid JPEG File"

    .line 64
    invoke-virtual {p0, p1, p3, p2}, Lorg/apache/sanselan/formats/jpeg/segments/JFIFSegment;->readByte(Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;)B

    move-result p1

    iput p1, p0, Lorg/apache/sanselan/formats/jpeg/segments/JFIFSegment;->densityUnits:I

    const-string p1, "x_density"

    const-string p2, "Not a Valid JPEG File"

    .line 65
    invoke-virtual {p0, p1, p3, p2}, Lorg/apache/sanselan/formats/jpeg/segments/JFIFSegment;->read2Bytes(Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lorg/apache/sanselan/formats/jpeg/segments/JFIFSegment;->xDensity:I

    const-string p1, "y_density"

    const-string p2, "Not a Valid JPEG File"

    .line 66
    invoke-virtual {p0, p1, p3, p2}, Lorg/apache/sanselan/formats/jpeg/segments/JFIFSegment;->read2Bytes(Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lorg/apache/sanselan/formats/jpeg/segments/JFIFSegment;->yDensity:I

    const-string p1, "x_thumbnail"

    const-string p2, "Not a Valid JPEG File"

    .line 68
    invoke-virtual {p0, p1, p3, p2}, Lorg/apache/sanselan/formats/jpeg/segments/JFIFSegment;->readByte(Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;)B

    move-result p1

    iput p1, p0, Lorg/apache/sanselan/formats/jpeg/segments/JFIFSegment;->xThumbnail:I

    const-string p1, "y_thumbnail"

    const-string p2, "Not a Valid JPEG File"

    .line 69
    invoke-virtual {p0, p1, p3, p2}, Lorg/apache/sanselan/formats/jpeg/segments/JFIFSegment;->readByte(Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;)B

    move-result p1

    iput p1, p0, Lorg/apache/sanselan/formats/jpeg/segments/JFIFSegment;->yThumbnail:I

    .line 70
    iget p1, p0, Lorg/apache/sanselan/formats/jpeg/segments/JFIFSegment;->xThumbnail:I

    iget p2, p0, Lorg/apache/sanselan/formats/jpeg/segments/JFIFSegment;->yThumbnail:I

    mul-int/2addr p1, p2

    iput p1, p0, Lorg/apache/sanselan/formats/jpeg/segments/JFIFSegment;->thumbnailSize:I

    .line 71
    iget p1, p0, Lorg/apache/sanselan/formats/jpeg/segments/JFIFSegment;->thumbnailSize:I

    if-lez p1, :cond_2

    const-string p2, "Not a Valid JPEG File: missing thumbnail"

    .line 73
    invoke-virtual {p0, p3, p1, p2}, Lorg/apache/sanselan/formats/jpeg/segments/JFIFSegment;->skipBytes(Ljava/io/InputStream;ILjava/lang/String;)V

    .line 78
    :cond_2
    invoke-virtual {p0}, Lorg/apache/sanselan/formats/jpeg/segments/JFIFSegment;->getDebug()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 79
    sget-object p1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string p2, ""

    invoke-virtual {p1, p2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :cond_3
    return-void
.end method

.method public constructor <init>(I[B)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 46
    array-length v0, p2

    new-instance v1, Ljava/io/ByteArrayInputStream;

    invoke-direct {v1, p2}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-direct {p0, p1, v0, v1}, Lorg/apache/sanselan/formats/jpeg/segments/JFIFSegment;-><init>(IILjava/io/InputStream;)V

    return-void
.end method


# virtual methods
.method public getDescription()Ljava/lang/String;
    .locals 2

    .line 40
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "JFIF ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/apache/sanselan/formats/jpeg/segments/JFIFSegment;->getSegmentType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
