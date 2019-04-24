.class public Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossy;
.super Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterBase;
.source "TiffImageWriterLossy.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 30
    invoke-direct {p0}, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterBase;-><init>()V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 35
    invoke-direct {p0, p1}, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterBase;-><init>(I)V

    return-void
.end method

.method private updateOffsetsStep(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/apache/sanselan/ImageWriteException;
        }
    .end annotation

    const/16 v0, 0x8

    const/4 v1, 0x0

    .line 59
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    .line 61
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;

    .line 63
    invoke-virtual {v2, v0}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;->setOffset(I)V

    .line 64
    invoke-virtual {v2}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;->getItemLength()I

    move-result v2

    add-int/2addr v0, v2

    .line 67
    invoke-static {v2}, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossy;->imageDataPaddingLength(I)I

    move-result v2

    add-int/2addr v0, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private writeStep(Lorg/apache/sanselan/common/BinaryOutputStream;Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/apache/sanselan/ImageWriteException;
        }
    .end annotation

    .line 75
    invoke-virtual {p0, p1}, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossy;->writeImageFileHeader(Lorg/apache/sanselan/common/BinaryOutputStream;)V

    const/4 v0, 0x0

    move v1, v0

    .line 77
    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 79
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;

    .line 81
    invoke-virtual {v2, p1}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;->writeItem(Lorg/apache/sanselan/common/BinaryOutputStream;)V

    .line 83
    invoke-virtual {v2}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;->getItemLength()I

    move-result v2

    .line 85
    invoke-static {v2}, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossy;->imageDataPaddingLength(I)I

    move-result v2

    move v3, v0

    :goto_1
    if-ge v3, v2, :cond_0

    .line 87
    invoke-virtual {p1, v0}, Lorg/apache/sanselan/common/BinaryOutputStream;->write(I)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public write(Ljava/io/OutputStream;Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/apache/sanselan/ImageWriteException;
        }
    .end annotation

    .line 41
    invoke-virtual {p0, p2}, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossy;->validateDirectories(Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;)Lorg/apache/sanselan/formats/tiff/write/TiffOutputSummary;

    move-result-object v0

    .line 43
    invoke-virtual {p2, v0}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->getOutputItems(Lorg/apache/sanselan/formats/tiff/write/TiffOutputSummary;)Ljava/util/List;

    move-result-object p2

    .line 45
    invoke-direct {p0, p2}, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossy;->updateOffsetsStep(Ljava/util/List;)V

    .line 47
    iget v1, p0, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossy;->byteOrder:I

    invoke-virtual {v0, v1}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSummary;->updateOffsets(I)V

    .line 49
    new-instance v0, Lorg/apache/sanselan/common/BinaryOutputStream;

    iget v1, p0, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossy;->byteOrder:I

    invoke-direct {v0, p1, v1}, Lorg/apache/sanselan/common/BinaryOutputStream;-><init>(Ljava/io/OutputStream;I)V

    .line 51
    invoke-direct {p0, v0, p2}, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossy;->writeStep(Lorg/apache/sanselan/common/BinaryOutputStream;Ljava/util/List;)V

    return-void
.end method
