.class public Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter;
.super Lorg/apache/sanselan/common/BinaryFileParser;
.source "ExifRewriter.java"

# interfaces
.implements Lorg/apache/sanselan/formats/jpeg/JpegConstants;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$ExifOverflowException;,
        Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$JFIFPieceImageData;,
        Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$JFIFPieceSegmentExif;,
        Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$JFIFPieceSegment;,
        Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$JFIFPiece;,
        Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$JFIFPieces;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 56
    invoke-direct {p0}, Lorg/apache/sanselan/common/BinaryFileParser;-><init>()V

    const/16 v0, 0x4d

    .line 57
    invoke-virtual {p0, v0}, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter;->setByteOrder(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 68
    invoke-direct {p0}, Lorg/apache/sanselan/common/BinaryFileParser;-><init>()V

    .line 69
    invoke-virtual {p0, p1}, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter;->setByteOrder(I)V

    return-void
.end method

.method private analyzeJFIF(Lorg/apache/sanselan/common/byteSources/ByteSource;)Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$JFIFPieces;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 172
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 173
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 175
    new-instance v2, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$1;

    invoke-direct {v2, p0, v0, v1}, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$1;-><init>(Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter;Ljava/util/ArrayList;Ljava/util/List;)V

    .line 229
    new-instance v3, Lorg/apache/sanselan/formats/jpeg/JpegUtils;

    invoke-direct {v3}, Lorg/apache/sanselan/formats/jpeg/JpegUtils;-><init>()V

    invoke-virtual {v3, p1, v2}, Lorg/apache/sanselan/formats/jpeg/JpegUtils;->traverseJFIF(Lorg/apache/sanselan/common/byteSources/ByteSource;Lorg/apache/sanselan/formats/jpeg/JpegUtils$Visitor;)V

    .line 238
    new-instance p1, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$JFIFPieces;

    invoke-direct {p1, v0, v1}, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$JFIFPieces;-><init>(Ljava/util/List;Ljava/util/List;)V

    return-object p1
.end method

.method private writeExifSegment(Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterBase;Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;Z)[B
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/apache/sanselan/ImageWriteException;
        }
    .end annotation

    .line 594
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    if-eqz p3, :cond_0

    .line 598
    sget-object p3, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter;->EXIF_IDENTIFIER_CODE:[B

    invoke-virtual {v0, p3}, Ljava/io/ByteArrayOutputStream;->write([B)V

    const/4 p3, 0x0

    .line 599
    invoke-virtual {v0, p3}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 600
    invoke-virtual {v0, p3}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 603
    :cond_0
    invoke-virtual {p1, v0, p2}, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterBase;->write(Ljava/io/OutputStream;Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;)V

    .line 605
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p1

    return-object p1
.end method

.method private writeSegmentsReplacingExif(Ljava/io/OutputStream;Ljava/util/List;[B)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageWriteException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 500
    invoke-virtual {p0}, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter;->getByteOrder()I

    move-result v0

    .line 504
    :try_start_0
    sget-object v1, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter;->SOI:[B

    invoke-virtual {p1, v1}, Ljava/io/OutputStream;->write([B)V

    const/4 v1, 0x0

    move v2, v1

    move v3, v2

    .line 508
    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v4

    const/4 v5, 0x1

    if-ge v2, v4, :cond_1

    .line 510
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$JFIFPiece;

    .line 511
    instance-of v4, v4, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$JFIFPieceSegmentExif;

    if-eqz v4, :cond_0

    move v3, v5

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const v2, 0xffff

    const v4, 0xffe1

    if-nez v3, :cond_3

    if-eqz p3, :cond_3

    .line 517
    invoke-virtual {p0, v4, v0}, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter;->convertShortToByteArray(II)[B

    move-result-object v3

    .line 519
    array-length v6, p3

    if-gt v6, v2, :cond_2

    .line 522
    array-length v6, p3

    add-int/lit8 v6, v6, 0x2

    .line 523
    invoke-virtual {p0, v6, v0}, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter;->convertShortToByteArray(II)[B

    move-result-object v6

    .line 528
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$JFIFPieceSegment;

    .line 529
    iget v7, v7, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$JFIFPieceSegment;->marker:I

    const v8, 0xffe0

    .line 531
    new-instance v7, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$JFIFPieceSegmentExif;

    invoke-direct {v7, v4, v3, v6, p3}, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$JFIFPieceSegmentExif;-><init>(I[B[B[B)V

    invoke-interface {p2, v1, v7}, Ljava/util/List;->add(ILjava/lang/Object;)V

    goto :goto_1

    .line 520
    :cond_2
    new-instance p2, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$ExifOverflowException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "APP1 Segment is too long: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length p3, p3

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3}, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$ExifOverflowException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_3
    :goto_1
    move v3, v1

    .line 537
    :goto_2
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v6

    if-ge v1, v6, :cond_8

    .line 539
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$JFIFPiece;

    .line 540
    instance-of v7, v6, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$JFIFPieceSegmentExif;

    if-eqz v7, :cond_7

    if-eqz v3, :cond_4

    goto :goto_4

    :cond_4
    if-nez p3, :cond_5

    goto :goto_3

    .line 550
    :cond_5
    invoke-virtual {p0, v4, v0}, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter;->convertShortToByteArray(II)[B

    move-result-object v3

    .line 552
    array-length v6, p3

    if-gt v6, v2, :cond_6

    .line 555
    array-length v6, p3

    add-int/lit8 v6, v6, 0x2

    .line 556
    invoke-virtual {p0, v6, v0}, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter;->convertShortToByteArray(II)[B

    move-result-object v6

    .line 559
    invoke-virtual {p1, v3}, Ljava/io/OutputStream;->write([B)V

    .line 560
    invoke-virtual {p1, v6}, Ljava/io/OutputStream;->write([B)V

    .line 561
    invoke-virtual {p1, p3}, Ljava/io/OutputStream;->write([B)V

    :goto_3
    move v3, v5

    goto :goto_4

    .line 553
    :cond_6
    new-instance p2, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$ExifOverflowException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "APP1 Segment is too long: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length p3, p3

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3}, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$ExifOverflowException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 565
    :cond_7
    invoke-virtual {v6, p1}, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$JFIFPiece;->write(Ljava/io/OutputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 573
    :cond_8
    :try_start_1
    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_5

    :catch_0
    move-exception p1

    .line 577
    invoke-static {p1}, Lorg/apache/sanselan/util/Debug;->debug(Ljava/lang/Throwable;)V

    :goto_5
    return-void

    :catchall_0
    move-exception p2

    .line 573
    :try_start_2
    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_6

    :catch_1
    move-exception p1

    .line 577
    invoke-static {p1}, Lorg/apache/sanselan/util/Debug;->debug(Ljava/lang/Throwable;)V

    .line 578
    :goto_6
    throw p2
.end method


# virtual methods
.method public removeExifMetadata(Ljava/io/File;Ljava/io/OutputStream;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;,
            Lorg/apache/sanselan/ImageWriteException;
        }
    .end annotation

    .line 256
    new-instance v0, Lorg/apache/sanselan/common/byteSources/ByteSourceFile;

    invoke-direct {v0, p1}, Lorg/apache/sanselan/common/byteSources/ByteSourceFile;-><init>(Ljava/io/File;)V

    .line 257
    invoke-virtual {p0, v0, p2}, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter;->removeExifMetadata(Lorg/apache/sanselan/common/byteSources/ByteSource;Ljava/io/OutputStream;)V

    return-void
.end method

.method public removeExifMetadata(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;,
            Lorg/apache/sanselan/ImageWriteException;
        }
    .end annotation

    .line 284
    new-instance v0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 285
    invoke-virtual {p0, v0, p2}, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter;->removeExifMetadata(Lorg/apache/sanselan/common/byteSources/ByteSource;Ljava/io/OutputStream;)V

    return-void
.end method

.method public removeExifMetadata(Lorg/apache/sanselan/common/byteSources/ByteSource;Ljava/io/OutputStream;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;,
            Lorg/apache/sanselan/ImageWriteException;
        }
    .end annotation

    .line 298
    invoke-direct {p0, p1}, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter;->analyzeJFIF(Lorg/apache/sanselan/common/byteSources/ByteSource;)Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$JFIFPieces;

    move-result-object p1

    .line 299
    iget-object p1, p1, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$JFIFPieces;->pieces:Ljava/util/List;

    const/4 v0, 0x0

    .line 307
    invoke-direct {p0, p2, p1, v0}, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter;->writeSegmentsReplacingExif(Ljava/io/OutputStream;Ljava/util/List;[B)V

    return-void
.end method

.method public removeExifMetadata([BLjava/io/OutputStream;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;,
            Lorg/apache/sanselan/ImageWriteException;
        }
    .end annotation

    .line 270
    new-instance v0, Lorg/apache/sanselan/common/byteSources/ByteSourceArray;

    invoke-direct {v0, p1}, Lorg/apache/sanselan/common/byteSources/ByteSourceArray;-><init>([B)V

    .line 271
    invoke-virtual {p0, v0, p2}, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter;->removeExifMetadata(Lorg/apache/sanselan/common/byteSources/ByteSource;Ljava/io/OutputStream;)V

    return-void
.end method

.method public updateExifMetadataLossless(Ljava/io/File;Ljava/io/OutputStream;Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;,
            Lorg/apache/sanselan/ImageWriteException;
        }
    .end annotation

    .line 327
    new-instance v0, Lorg/apache/sanselan/common/byteSources/ByteSourceFile;

    invoke-direct {v0, p1}, Lorg/apache/sanselan/common/byteSources/ByteSourceFile;-><init>(Ljava/io/File;)V

    .line 328
    invoke-virtual {p0, v0, p2, p3}, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter;->updateExifMetadataLossless(Lorg/apache/sanselan/common/byteSources/ByteSource;Ljava/io/OutputStream;Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;)V

    return-void
.end method

.method public updateExifMetadataLossless(Ljava/io/InputStream;Ljava/io/OutputStream;Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;,
            Lorg/apache/sanselan/ImageWriteException;
        }
    .end annotation

    .line 369
    new-instance v0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 370
    invoke-virtual {p0, v0, p2, p3}, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter;->updateExifMetadataLossless(Lorg/apache/sanselan/common/byteSources/ByteSource;Ljava/io/OutputStream;Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;)V

    return-void
.end method

.method public updateExifMetadataLossless(Lorg/apache/sanselan/common/byteSources/ByteSource;Ljava/io/OutputStream;Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;,
            Lorg/apache/sanselan/ImageWriteException;
        }
    .end annotation

    .line 391
    invoke-direct {p0, p1}, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter;->analyzeJFIF(Lorg/apache/sanselan/common/byteSources/ByteSource;)Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$JFIFPieces;

    move-result-object p1

    .line 392
    iget-object v0, p1, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$JFIFPieces;->pieces:Ljava/util/List;

    .line 397
    iget-object v1, p1, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$JFIFPieces;->exifPieces:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_0

    .line 400
    iget-object p1, p1, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$JFIFPieces;->exifPieces:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$JFIFPieceSegment;

    .line 402
    iget-object p1, p1, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$JFIFPieceSegment;->segmentData:[B

    const-string v1, "trimmed exif bytes"

    const/4 v2, 0x6

    .line 403
    invoke-virtual {p0, v1, p1, v2}, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter;->getByteArrayTail(Ljava/lang/String;[BI)[B

    move-result-object p1

    .line 405
    new-instance v1, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless;

    iget v2, p3, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->byteOrder:I

    invoke-direct {v1, v2, p1}, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless;-><init>(I[B)V

    goto :goto_0

    .line 409
    :cond_0
    new-instance v1, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossy;

    iget p1, p3, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->byteOrder:I

    invoke-direct {v1, p1}, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossy;-><init>(I)V

    :goto_0
    const/4 p1, 0x1

    .line 412
    invoke-direct {p0, v1, p3, p1}, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter;->writeExifSegment(Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterBase;Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;Z)[B

    move-result-object p1

    .line 414
    invoke-direct {p0, p2, v0, p1}, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter;->writeSegmentsReplacingExif(Ljava/io/OutputStream;Ljava/util/List;[B)V

    return-void
.end method

.method public updateExifMetadataLossless([BLjava/io/OutputStream;Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;,
            Lorg/apache/sanselan/ImageWriteException;
        }
    .end annotation

    .line 348
    new-instance v0, Lorg/apache/sanselan/common/byteSources/ByteSourceArray;

    invoke-direct {v0, p1}, Lorg/apache/sanselan/common/byteSources/ByteSourceArray;-><init>([B)V

    .line 349
    invoke-virtual {p0, v0, p2, p3}, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter;->updateExifMetadataLossless(Lorg/apache/sanselan/common/byteSources/ByteSource;Ljava/io/OutputStream;Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;)V

    return-void
.end method

.method public updateExifMetadataLossy(Ljava/io/File;Ljava/io/OutputStream;Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;,
            Lorg/apache/sanselan/ImageWriteException;
        }
    .end annotation

    .line 467
    new-instance v0, Lorg/apache/sanselan/common/byteSources/ByteSourceFile;

    invoke-direct {v0, p1}, Lorg/apache/sanselan/common/byteSources/ByteSourceFile;-><init>(Ljava/io/File;)V

    .line 468
    invoke-virtual {p0, v0, p2, p3}, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter;->updateExifMetadataLossy(Lorg/apache/sanselan/common/byteSources/ByteSource;Ljava/io/OutputStream;Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;)V

    return-void
.end method

.method public updateExifMetadataLossy(Ljava/io/InputStream;Ljava/io/OutputStream;Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;,
            Lorg/apache/sanselan/ImageWriteException;
        }
    .end annotation

    .line 449
    new-instance v0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 450
    invoke-virtual {p0, v0, p2, p3}, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter;->updateExifMetadataLossy(Lorg/apache/sanselan/common/byteSources/ByteSource;Ljava/io/OutputStream;Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;)V

    return-void
.end method

.method public updateExifMetadataLossy(Lorg/apache/sanselan/common/byteSources/ByteSource;Ljava/io/OutputStream;Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;,
            Lorg/apache/sanselan/ImageWriteException;
        }
    .end annotation

    .line 485
    invoke-direct {p0, p1}, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter;->analyzeJFIF(Lorg/apache/sanselan/common/byteSources/ByteSource;)Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$JFIFPieces;

    move-result-object p1

    .line 486
    iget-object p1, p1, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$JFIFPieces;->pieces:Ljava/util/List;

    .line 488
    new-instance v0, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossy;

    iget v1, p3, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->byteOrder:I

    invoke-direct {v0, v1}, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossy;-><init>(I)V

    const/4 v1, 0x1

    .line 492
    invoke-direct {p0, v0, p3, v1}, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter;->writeExifSegment(Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterBase;Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;Z)[B

    move-result-object p3

    .line 494
    invoke-direct {p0, p2, p1, p3}, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter;->writeSegmentsReplacingExif(Ljava/io/OutputStream;Ljava/util/List;[B)V

    return-void
.end method

.method public updateExifMetadataLossy([BLjava/io/OutputStream;Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;,
            Lorg/apache/sanselan/ImageWriteException;
        }
    .end annotation

    .line 431
    new-instance v0, Lorg/apache/sanselan/common/byteSources/ByteSourceArray;

    invoke-direct {v0, p1}, Lorg/apache/sanselan/common/byteSources/ByteSourceArray;-><init>([B)V

    .line 432
    invoke-virtual {p0, v0, p2, p3}, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter;->updateExifMetadataLossy(Lorg/apache/sanselan/common/byteSources/ByteSource;Ljava/io/OutputStream;Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;)V

    return-void
.end method
