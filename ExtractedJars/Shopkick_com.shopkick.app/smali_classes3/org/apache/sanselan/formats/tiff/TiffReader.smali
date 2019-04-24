.class public Lorg/apache/sanselan/formats/tiff/TiffReader;
.super Lorg/apache/sanselan/common/BinaryFileParser;
.source "TiffReader.java"

# interfaces
.implements Lorg/apache/sanselan/formats/tiff/constants/TiffConstants;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/sanselan/formats/tiff/TiffReader$DirectoryCollector;,
        Lorg/apache/sanselan/formats/tiff/TiffReader$FirstDirectoryCollector;,
        Lorg/apache/sanselan/formats/tiff/TiffReader$Collector;,
        Lorg/apache/sanselan/formats/tiff/TiffReader$Listener;
    }
.end annotation


# instance fields
.field private final strict:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    .line 39
    invoke-direct {p0}, Lorg/apache/sanselan/common/BinaryFileParser;-><init>()V

    .line 40
    iput-boolean p1, p0, Lorg/apache/sanselan/formats/tiff/TiffReader;->strict:Z

    return-void
.end method

.method private getJpegRawImageData(Lorg/apache/sanselan/common/byteSources/ByteSource;Lorg/apache/sanselan/formats/tiff/TiffDirectory;)Lorg/apache/sanselan/formats/tiff/JpegImageData;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 495
    invoke-virtual {p2}, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->getJpegRawImageDataElement()Lorg/apache/sanselan/formats/tiff/TiffDirectory$ImageDataElement;

    move-result-object p2

    .line 496
    iget v0, p2, Lorg/apache/sanselan/formats/tiff/TiffDirectory$ImageDataElement;->offset:I

    .line 497
    iget p2, p2, Lorg/apache/sanselan/formats/tiff/TiffDirectory$ImageDataElement;->length:I

    add-int v1, v0, p2

    int-to-long v1, v1

    .line 499
    invoke-virtual {p1}, Lorg/apache/sanselan/common/byteSources/ByteSource;->getLength()J

    move-result-wide v3

    const-wide/16 v5, 0x1

    add-long/2addr v3, v5

    cmp-long v1, v1, v3

    if-nez v1, :cond_0

    add-int/lit8 p2, p2, -0x1

    .line 501
    :cond_0
    invoke-virtual {p1, v0, p2}, Lorg/apache/sanselan/common/byteSources/ByteSource;->getBlock(II)[B

    move-result-object p1

    .line 502
    new-instance v1, Lorg/apache/sanselan/formats/tiff/JpegImageData;

    invoke-direct {v1, v0, p2, p1}, Lorg/apache/sanselan/formats/tiff/JpegImageData;-><init>(II[B)V

    return-object v1
.end method

.method private readDirectories(Lorg/apache/sanselan/common/byteSources/ByteSource;Lorg/apache/sanselan/FormatCompliance;Lorg/apache/sanselan/formats/tiff/TiffReader$Listener;)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 93
    invoke-direct {p0, p1, p2}, Lorg/apache/sanselan/formats/tiff/TiffReader;->readTiffHeader(Lorg/apache/sanselan/common/byteSources/ByteSource;Lorg/apache/sanselan/FormatCompliance;)Lorg/apache/sanselan/formats/tiff/TiffHeader;

    move-result-object v0

    .line 94
    invoke-interface {p3, v0}, Lorg/apache/sanselan/formats/tiff/TiffReader$Listener;->setTiffHeader(Lorg/apache/sanselan/formats/tiff/TiffHeader;)Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    .line 97
    :cond_0
    iget v4, v0, Lorg/apache/sanselan/formats/tiff/TiffHeader;->offsetToFirstIFD:I

    const/4 v5, 0x0

    .line 100
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    move-object v2, p0

    move-object v3, p1

    move-object v6, p2

    move-object v7, p3

    .line 101
    invoke-direct/range {v2 .. v8}, Lorg/apache/sanselan/formats/tiff/TiffReader;->readDirectory(Lorg/apache/sanselan/common/byteSources/ByteSource;IILorg/apache/sanselan/FormatCompliance;Lorg/apache/sanselan/formats/tiff/TiffReader$Listener;Ljava/util/List;)Z

    return-void
.end method

.method private readDirectory(Lorg/apache/sanselan/common/byteSources/ByteSource;IILorg/apache/sanselan/FormatCompliance;Lorg/apache/sanselan/formats/tiff/TiffReader$Listener;Ljava/util/List;)Z
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v7, p6

    .line 110
    invoke-direct/range {v0 .. v7}, Lorg/apache/sanselan/formats/tiff/TiffReader;->readDirectory(Lorg/apache/sanselan/common/byteSources/ByteSource;IILorg/apache/sanselan/FormatCompliance;Lorg/apache/sanselan/formats/tiff/TiffReader$Listener;ZLjava/util/List;)Z

    move-result p1

    return p1
.end method

.method private readDirectory(Lorg/apache/sanselan/common/byteSources/ByteSource;IILorg/apache/sanselan/FormatCompliance;Lorg/apache/sanselan/formats/tiff/TiffReader$Listener;ZLjava/util/List;)Z
    .locals 20
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    move-object/from16 v9, p0

    move-object/from16 v0, p1

    move/from16 v1, p2

    move/from16 v8, p3

    move-object/from16 v7, p5

    move-object/from16 v6, p7

    .line 119
    new-instance v2, Ljava/lang/Integer;

    invoke-direct {v2, v1}, Ljava/lang/Integer;-><init>(I)V

    .line 130
    invoke-interface {v6, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    return v4

    .line 132
    :cond_0
    invoke-interface {v6, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v2, 0x0

    .line 137
    :try_start_0
    invoke-virtual/range {p1 .. p1}, Lorg/apache/sanselan/common/byteSources/ByteSource;->getInputStream()Ljava/io/InputStream;

    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    if-lez v1, :cond_1

    int-to-long v2, v1

    .line 139
    :try_start_1
    invoke-virtual {v5, v2, v3}, Ljava/io/InputStream;->skip(J)J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object v1, v0

    move-object/from16 v16, v5

    goto/16 :goto_e

    .line 141
    :cond_1
    :goto_0
    :try_start_2
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    int-to-long v10, v1

    .line 143
    invoke-virtual/range {p1 .. p1}, Lorg/apache/sanselan/common/byteSources/ByteSource;->getLength()J

    move-result-wide v12
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    cmp-long v2, v10, v12

    const/16 v18, 0x1

    if-ltz v2, :cond_3

    if-eqz v5, :cond_2

    .line 288
    :try_start_3
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    move-object v1, v0

    .line 291
    invoke-static {v1}, Lorg/apache/sanselan/util/Debug;->debug(Ljava/lang/Throwable;)V

    :cond_2
    :goto_1
    return v18

    :cond_3
    :try_start_4
    const-string v2, "DirectoryEntryCount"

    const-string v10, "Not a Valid TIFF File"

    .line 152
    invoke-virtual {v9, v2, v5, v10}, Lorg/apache/sanselan/formats/tiff/TiffReader;->read2Bytes(Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;)I

    move-result v2
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    move v15, v4

    :goto_2
    if-ge v15, v2, :cond_7

    :try_start_5
    const-string v10, "Tag"

    const-string v11, "Not a Valid TIFF File"

    .line 166
    invoke-virtual {v9, v10, v5, v11}, Lorg/apache/sanselan/formats/tiff/TiffReader;->read2Bytes(Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;)I

    move-result v11

    const-string v10, "Type"

    const-string v12, "Not a Valid TIFF File"

    .line 167
    invoke-virtual {v9, v10, v5, v12}, Lorg/apache/sanselan/formats/tiff/TiffReader;->read2Bytes(Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;)I

    move-result v13

    const-string v10, "Length"

    const-string v12, "Not a Valid TIFF File"

    .line 168
    invoke-virtual {v9, v10, v5, v12}, Lorg/apache/sanselan/formats/tiff/TiffReader;->read4Bytes(Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;)I

    move-result v14

    const-string v10, "ValueOffset"

    const/4 v12, 0x4

    const-string v4, "Not a Valid TIFF File"

    .line 173
    invoke-virtual {v9, v10, v12, v5, v4}, Lorg/apache/sanselan/formats/tiff/TiffReader;->readByteArray(Ljava/lang/String;ILjava/io/InputStream;Ljava/lang/String;)[B

    move-result-object v4

    const-string v10, "ValueOffset"

    .line 175
    invoke-virtual {v9, v10, v4}, Lorg/apache/sanselan/formats/tiff/TiffReader;->convertByteArrayToInt(Ljava/lang/String;[B)I

    move-result v16

    if-nez v11, :cond_4

    move/from16 v19, v2

    move v6, v15

    goto :goto_4

    .line 189
    :cond_4
    new-instance v12, Lorg/apache/sanselan/formats/tiff/TiffField;

    .line 190
    invoke-virtual/range {p0 .. p0}, Lorg/apache/sanselan/formats/tiff/TiffReader;->getByteOrder()I

    move-result v17

    move-object v10, v12

    move/from16 v19, v2

    move-object v2, v12

    move/from16 v12, p3

    move v6, v15

    move/from16 v15, v16

    move-object/from16 v16, v4

    invoke-direct/range {v10 .. v17}, Lorg/apache/sanselan/formats/tiff/TiffField;-><init>(IIIII[BI)V

    .line 191
    invoke-virtual {v2, v6}, Lorg/apache/sanselan/formats/tiff/TiffField;->setSortHint(I)V

    .line 195
    invoke-virtual {v2, v0}, Lorg/apache/sanselan/formats/tiff/TiffField;->fillInValue(Lorg/apache/sanselan/common/byteSources/ByteSource;)V

    .line 199
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 201
    invoke-interface {v7, v2}, Lorg/apache/sanselan/formats/tiff/TiffReader$Listener;->addField(Lorg/apache/sanselan/formats/tiff/TiffField;)Z

    move-result v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    if-nez v2, :cond_6

    if-eqz v5, :cond_5

    .line 288
    :try_start_6
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    goto :goto_3

    :catch_1
    move-exception v0

    move-object v1, v0

    .line 291
    invoke-static {v1}, Lorg/apache/sanselan/util/Debug;->debug(Ljava/lang/Throwable;)V

    :cond_5
    :goto_3
    return v18

    :cond_6
    :goto_4
    add-int/lit8 v15, v6, 0x1

    move/from16 v2, v19

    const/4 v4, 0x0

    move-object/from16 v6, p7

    goto :goto_2

    :cond_7
    :try_start_7
    const-string v2, "nextDirectoryOffset"

    const-string v4, "Not a Valid TIFF File"

    .line 205
    invoke-virtual {v9, v2, v5, v4}, Lorg/apache/sanselan/formats/tiff/TiffReader;->read4Bytes(Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;)I

    move-result v2

    .line 209
    new-instance v10, Lorg/apache/sanselan/formats/tiff/TiffDirectory;

    invoke-direct {v10, v8, v3, v1, v2}, Lorg/apache/sanselan/formats/tiff/TiffDirectory;-><init>(ILjava/util/ArrayList;II)V

    .line 212
    invoke-interface/range {p5 .. p5}, Lorg/apache/sanselan/formats/tiff/TiffReader$Listener;->readImageData()Z

    move-result v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    if-eqz v1, :cond_8

    .line 220
    :try_start_8
    invoke-virtual {v10}, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->hasJpegImageData()Z

    move-result v1

    if-eqz v1, :cond_8

    .line 222
    invoke-direct {v9, v0, v10}, Lorg/apache/sanselan/formats/tiff/TiffReader;->getJpegRawImageData(Lorg/apache/sanselan/common/byteSources/ByteSource;Lorg/apache/sanselan/formats/tiff/TiffDirectory;)Lorg/apache/sanselan/formats/tiff/JpegImageData;

    move-result-object v1

    .line 224
    invoke-virtual {v10, v1}, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->setJpegImageData(Lorg/apache/sanselan/formats/tiff/JpegImageData;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 228
    :cond_8
    :try_start_9
    invoke-interface {v7, v10}, Lorg/apache/sanselan/formats/tiff/TiffReader$Listener;->addDirectory(Lorg/apache/sanselan/formats/tiff/TiffDirectory;)Z

    move-result v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    if-nez v1, :cond_a

    if-eqz v5, :cond_9

    .line 288
    :try_start_a
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_2

    goto :goto_5

    :catch_2
    move-exception v0

    move-object v1, v0

    .line 291
    invoke-static {v1}, Lorg/apache/sanselan/util/Debug;->debug(Ljava/lang/Throwable;)V

    :cond_9
    :goto_5
    return v18

    .line 231
    :cond_a
    :try_start_b
    invoke-interface/range {p5 .. p5}, Lorg/apache/sanselan/formats/tiff/TiffReader$Listener;->readOffsetDirectories()Z

    move-result v1

    if-eqz v1, :cond_12

    .line 233
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    const/4 v12, 0x0

    .line 234
    :goto_6
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v12, v1, :cond_11

    .line 236
    invoke-virtual {v3, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v13, v1

    check-cast v13, Lorg/apache/sanselan/formats/tiff/TiffField;

    .line 238
    iget v1, v13, Lorg/apache/sanselan/formats/tiff/TiffField;->tag:I

    sget-object v2, Lorg/apache/sanselan/formats/tiff/constants/TiffConstants;->EXIF_TAG_EXIF_OFFSET:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    iget v2, v2, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->tag:I
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    if-eq v1, v2, :cond_c

    :try_start_c
    iget v1, v13, Lorg/apache/sanselan/formats/tiff/TiffField;->tag:I

    sget-object v2, Lorg/apache/sanselan/formats/tiff/constants/TiffConstants;->EXIF_TAG_GPSINFO:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    iget v2, v2, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->tag:I

    if-eq v1, v2, :cond_c

    iget v1, v13, Lorg/apache/sanselan/formats/tiff/TiffField;->tag:I

    sget-object v2, Lorg/apache/sanselan/formats/tiff/constants/TiffConstants;->EXIF_TAG_INTEROP_OFFSET:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    iget v2, v2, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->tag:I
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    if-ne v1, v2, :cond_b

    goto :goto_7

    :cond_b
    move-object v15, v3

    move-object/from16 v16, v5

    goto :goto_9

    .line 245
    :cond_c
    :goto_7
    :try_start_d
    invoke-virtual {v13}, Lorg/apache/sanselan/formats/tiff/TiffField;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    .line 246
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v4

    .line 248
    iget v1, v13, Lorg/apache/sanselan/formats/tiff/TiffField;->tag:I

    sget-object v2, Lorg/apache/sanselan/formats/tiff/constants/TiffConstants;->EXIF_TAG_EXIF_OFFSET:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    iget v2, v2, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->tag:I

    if-ne v1, v2, :cond_d

    const/4 v1, -0x2

    move v6, v1

    goto :goto_8

    .line 250
    :cond_d
    iget v1, v13, Lorg/apache/sanselan/formats/tiff/TiffField;->tag:I

    sget-object v2, Lorg/apache/sanselan/formats/tiff/constants/TiffConstants;->EXIF_TAG_GPSINFO:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    iget v2, v2, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->tag:I

    if-ne v1, v2, :cond_e

    const/4 v1, -0x3

    move v6, v1

    goto :goto_8

    .line 252
    :cond_e
    iget v1, v13, Lorg/apache/sanselan/formats/tiff/TiffField;->tag:I

    sget-object v2, Lorg/apache/sanselan/formats/tiff/constants/TiffConstants;->EXIF_TAG_INTEROP_OFFSET:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    iget v2, v2, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->tag:I
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    if-ne v1, v2, :cond_10

    const/4 v1, -0x4

    move v6, v1

    :goto_8
    const/4 v14, 0x1

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object v15, v3

    move v3, v4

    move v4, v6

    move-object/from16 v16, v5

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move v7, v14

    move-object/from16 v8, p7

    .line 259
    :try_start_e
    invoke-direct/range {v1 .. v8}, Lorg/apache/sanselan/formats/tiff/TiffReader;->readDirectory(Lorg/apache/sanselan/common/byteSources/ByteSource;IILorg/apache/sanselan/FormatCompliance;Lorg/apache/sanselan/formats/tiff/TiffReader$Listener;ZLjava/util/List;)Z

    move-result v1

    if-nez v1, :cond_f

    .line 268
    invoke-interface {v11, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_f
    :goto_9
    add-int/lit8 v12, v12, 0x1

    move/from16 v8, p3

    move-object/from16 v7, p5

    move-object v3, v15

    move-object/from16 v5, v16

    goto :goto_6

    :cond_10
    move-object/from16 v16, v5

    .line 255
    new-instance v0, Lorg/apache/sanselan/ImageReadException;

    const-string v1, "Unknown subdirectory type."

    invoke-direct {v0, v1}, Lorg/apache/sanselan/ImageReadException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_11
    move-object v15, v3

    move-object/from16 v16, v5

    .line 272
    invoke-virtual {v15, v11}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    goto :goto_a

    :cond_12
    move-object/from16 v16, v5

    :goto_a
    if-nez p6, :cond_13

    .line 275
    iget v1, v10, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->nextDirectoryOffset:I

    if-lez v1, :cond_13

    .line 278
    iget v3, v10, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->nextDirectoryOffset:I

    add-int/lit8 v4, p3, 0x1

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p7

    invoke-direct/range {v1 .. v7}, Lorg/apache/sanselan/formats/tiff/TiffReader;->readDirectory(Lorg/apache/sanselan/common/byteSources/ByteSource;IILorg/apache/sanselan/FormatCompliance;Lorg/apache/sanselan/formats/tiff/TiffReader$Listener;Ljava/util/List;)Z
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_1

    :cond_13
    if-eqz v16, :cond_14

    .line 288
    :try_start_f
    invoke-virtual/range {v16 .. v16}, Ljava/io/InputStream;->close()V
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_3

    goto :goto_b

    :catch_3
    move-exception v0

    move-object v1, v0

    .line 291
    invoke-static {v1}, Lorg/apache/sanselan/util/Debug;->debug(Ljava/lang/Throwable;)V

    :cond_14
    :goto_b
    return v18

    :catch_4
    move-exception v0

    move-object/from16 v16, v5

    .line 156
    :try_start_10
    iget-boolean v1, v9, Lorg/apache/sanselan/formats/tiff/TiffReader;->strict:Z
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_1

    if-nez v1, :cond_16

    if-eqz v16, :cond_15

    .line 288
    :try_start_11
    invoke-virtual/range {v16 .. v16}, Ljava/io/InputStream;->close()V
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_5

    goto :goto_c

    :catch_5
    move-exception v0

    move-object v1, v0

    .line 291
    invoke-static {v1}, Lorg/apache/sanselan/util/Debug;->debug(Ljava/lang/Throwable;)V

    :cond_15
    :goto_c
    return v18

    .line 157
    :cond_16
    :try_start_12
    throw v0
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_1

    :catchall_1
    move-exception v0

    goto :goto_d

    :catchall_2
    move-exception v0

    move-object/from16 v16, v5

    :goto_d
    move-object v1, v0

    goto :goto_e

    :catchall_3
    move-exception v0

    move-object v1, v0

    move-object/from16 v16, v2

    :goto_e
    if-eqz v16, :cond_17

    .line 288
    :try_start_13
    invoke-virtual/range {v16 .. v16}, Ljava/io/InputStream;->close()V
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_6

    goto :goto_f

    :catch_6
    move-exception v0

    move-object v2, v0

    .line 291
    invoke-static {v2}, Lorg/apache/sanselan/util/Debug;->debug(Ljava/lang/Throwable;)V

    .line 292
    :cond_17
    :goto_f
    throw v1
.end method

.method private readTiffHeader(Ljava/io/InputStream;Lorg/apache/sanselan/FormatCompliance;)Lorg/apache/sanselan/formats/tiff/TiffHeader;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    const-string p2, "BYTE_ORDER_1"

    const-string v0, "Not a Valid TIFF File"

    .line 69
    invoke-virtual {p0, p2, p1, v0}, Lorg/apache/sanselan/formats/tiff/TiffReader;->readByte(Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;)B

    move-result p2

    const-string v0, "BYTE_ORDER_2"

    const-string v1, "Not a Valid TIFF File"

    .line 70
    invoke-virtual {p0, v0, p1, v1}, Lorg/apache/sanselan/formats/tiff/TiffReader;->readByte(Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;)B

    move-result v0

    .line 71
    invoke-virtual {p0, p2, v0}, Lorg/apache/sanselan/formats/tiff/TiffReader;->setByteOrder(II)V

    const-string v0, "tiffVersion"

    const-string v1, "Not a Valid TIFF File"

    .line 73
    invoke-virtual {p0, v0, p1, v1}, Lorg/apache/sanselan/formats/tiff/TiffReader;->read2Bytes(Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0x2a

    if-ne v0, v1, :cond_1

    const-string v1, "offsetToFirstIFD"

    const-string v2, "Not a Valid TIFF File"

    .line 77
    invoke-virtual {p0, v1, p1, v2}, Lorg/apache/sanselan/formats/tiff/TiffReader;->read4Bytes(Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;)I

    move-result v1

    add-int/lit8 v2, v1, -0x8

    const-string v3, "Not a Valid TIFF File: couldn\'t find IFDs"

    .line 80
    invoke-virtual {p0, p1, v2, v3}, Lorg/apache/sanselan/formats/tiff/TiffReader;->skipBytes(Ljava/io/InputStream;ILjava/lang/String;)V

    .line 83
    iget-boolean p1, p0, Lorg/apache/sanselan/formats/tiff/TiffReader;->debug:Z

    if-eqz p1, :cond_0

    .line 84
    sget-object p1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v2, ""

    invoke-virtual {p1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 86
    :cond_0
    new-instance p1, Lorg/apache/sanselan/formats/tiff/TiffHeader;

    invoke-direct {p1, p2, v0, v1}, Lorg/apache/sanselan/formats/tiff/TiffHeader;-><init>(III)V

    return-object p1

    .line 75
    :cond_1
    new-instance p1, Lorg/apache/sanselan/ImageReadException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unknown Tiff Version: "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lorg/apache/sanselan/ImageReadException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private readTiffHeader(Lorg/apache/sanselan/common/byteSources/ByteSource;Lorg/apache/sanselan/FormatCompliance;)Lorg/apache/sanselan/formats/tiff/TiffHeader;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 50
    :try_start_0
    invoke-virtual {p1}, Lorg/apache/sanselan/common/byteSources/ByteSource;->getInputStream()Ljava/io/InputStream;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 51
    :try_start_1
    invoke-direct {p0, p1, p2}, Lorg/apache/sanselan/formats/tiff/TiffReader;->readTiffHeader(Ljava/io/InputStream;Lorg/apache/sanselan/FormatCompliance;)Lorg/apache/sanselan/formats/tiff/TiffHeader;

    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p1, :cond_0

    .line 57
    :try_start_2
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 60
    invoke-static {p1}, Lorg/apache/sanselan/util/Debug;->debug(Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    return-object p2

    :catchall_0
    move-exception p2

    goto :goto_1

    :catchall_1
    move-exception p2

    const/4 p1, 0x0

    :goto_1
    if-eqz p1, :cond_1

    .line 57
    :try_start_3
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_2

    :catch_1
    move-exception p1

    .line 60
    invoke-static {p1}, Lorg/apache/sanselan/util/Debug;->debug(Ljava/lang/Throwable;)V

    .line 61
    :cond_1
    :goto_2
    throw p2
.end method


# virtual methods
.method public read(Lorg/apache/sanselan/common/byteSources/ByteSource;Ljava/util/Map;Lorg/apache/sanselan/FormatCompliance;Lorg/apache/sanselan/formats/tiff/TiffReader$Listener;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 448
    invoke-direct {p0, p1, p3, p4}, Lorg/apache/sanselan/formats/tiff/TiffReader;->readDirectories(Lorg/apache/sanselan/common/byteSources/ByteSource;Lorg/apache/sanselan/FormatCompliance;Lorg/apache/sanselan/formats/tiff/TiffReader$Listener;)V

    return-void
.end method

.method public readContents(Lorg/apache/sanselan/common/byteSources/ByteSource;Ljava/util/Map;Lorg/apache/sanselan/FormatCompliance;)Lorg/apache/sanselan/formats/tiff/TiffContents;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 437
    new-instance v0, Lorg/apache/sanselan/formats/tiff/TiffReader$Collector;

    invoke-direct {v0, p2}, Lorg/apache/sanselan/formats/tiff/TiffReader$Collector;-><init>(Ljava/util/Map;)V

    .line 438
    invoke-virtual {p0, p1, p2, p3, v0}, Lorg/apache/sanselan/formats/tiff/TiffReader;->read(Lorg/apache/sanselan/common/byteSources/ByteSource;Ljava/util/Map;Lorg/apache/sanselan/FormatCompliance;Lorg/apache/sanselan/formats/tiff/TiffReader$Listener;)V

    .line 439
    invoke-virtual {v0}, Lorg/apache/sanselan/formats/tiff/TiffReader$Collector;->getContents()Lorg/apache/sanselan/formats/tiff/TiffContents;

    move-result-object p1

    return-object p1
.end method

.method public readDirectories(Lorg/apache/sanselan/common/byteSources/ByteSource;ZLorg/apache/sanselan/FormatCompliance;)Lorg/apache/sanselan/formats/tiff/TiffContents;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 423
    new-instance v0, Lorg/apache/sanselan/formats/tiff/TiffReader$FirstDirectoryCollector;

    invoke-direct {v0, p2}, Lorg/apache/sanselan/formats/tiff/TiffReader$FirstDirectoryCollector;-><init>(Z)V

    .line 424
    invoke-direct {p0, p1, p3, v0}, Lorg/apache/sanselan/formats/tiff/TiffReader;->readDirectories(Lorg/apache/sanselan/common/byteSources/ByteSource;Lorg/apache/sanselan/FormatCompliance;Lorg/apache/sanselan/formats/tiff/TiffReader$Listener;)V

    .line 425
    invoke-virtual {v0}, Lorg/apache/sanselan/formats/tiff/TiffReader$Collector;->getContents()Lorg/apache/sanselan/formats/tiff/TiffContents;

    move-result-object p1

    .line 426
    iget-object p2, p1, Lorg/apache/sanselan/formats/tiff/TiffContents;->directories:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    const/4 p3, 0x1

    if-lt p2, p3, :cond_0

    return-object p1

    .line 427
    :cond_0
    new-instance p1, Lorg/apache/sanselan/ImageReadException;

    const-string p2, "Image did not contain any directories."

    invoke-direct {p1, p2}, Lorg/apache/sanselan/ImageReadException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public readFirstDirectory(Lorg/apache/sanselan/common/byteSources/ByteSource;Ljava/util/Map;ZLorg/apache/sanselan/FormatCompliance;)Lorg/apache/sanselan/formats/tiff/TiffContents;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 410
    new-instance v0, Lorg/apache/sanselan/formats/tiff/TiffReader$FirstDirectoryCollector;

    invoke-direct {v0, p3}, Lorg/apache/sanselan/formats/tiff/TiffReader$FirstDirectoryCollector;-><init>(Z)V

    .line 411
    invoke-virtual {p0, p1, p2, p4, v0}, Lorg/apache/sanselan/formats/tiff/TiffReader;->read(Lorg/apache/sanselan/common/byteSources/ByteSource;Ljava/util/Map;Lorg/apache/sanselan/FormatCompliance;Lorg/apache/sanselan/formats/tiff/TiffReader$Listener;)V

    .line 412
    invoke-virtual {v0}, Lorg/apache/sanselan/formats/tiff/TiffReader$Collector;->getContents()Lorg/apache/sanselan/formats/tiff/TiffContents;

    move-result-object p1

    .line 413
    iget-object p2, p1, Lorg/apache/sanselan/formats/tiff/TiffContents;->directories:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    const/4 p3, 0x1

    if-lt p2, p3, :cond_0

    return-object p1

    .line 414
    :cond_0
    new-instance p1, Lorg/apache/sanselan/ImageReadException;

    const-string p2, "Image did not contain any directories."

    invoke-direct {p1, p2}, Lorg/apache/sanselan/ImageReadException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
