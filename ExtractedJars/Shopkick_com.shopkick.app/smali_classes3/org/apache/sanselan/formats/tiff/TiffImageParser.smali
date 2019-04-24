.class public Lorg/apache/sanselan/formats/tiff/TiffImageParser;
.super Lorg/apache/sanselan/ImageParser;
.source "TiffImageParser.java"

# interfaces
.implements Lorg/apache/sanselan/formats/tiff/constants/TiffConstants;


# static fields
.field private static final ACCEPTED_EXTENSIONS:[Ljava/lang/String;

.field private static final DEFAULT_EXTENSION:Ljava/lang/String; = ".tif"


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, ".tif"

    const-string v1, ".tiff"

    .line 57
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/apache/sanselan/formats/tiff/TiffImageParser;->ACCEPTED_EXTENSIONS:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 41
    invoke-direct {p0}, Lorg/apache/sanselan/ImageParser;-><init>()V

    return-void
.end method


# virtual methods
.method public collectRawImageData(Lorg/apache/sanselan/common/byteSources/ByteSource;Ljava/util/Map;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 400
    invoke-static {}, Lorg/apache/sanselan/FormatCompliance;->getDefault()Lorg/apache/sanselan/FormatCompliance;

    move-result-object v0

    .line 401
    new-instance v1, Lorg/apache/sanselan/formats/tiff/TiffReader;

    invoke-static {p2}, Lorg/apache/sanselan/formats/tiff/TiffImageParser;->isStrict(Ljava/util/Map;)Z

    move-result p2

    invoke-direct {v1, p2}, Lorg/apache/sanselan/formats/tiff/TiffReader;-><init>(Z)V

    const/4 p2, 0x1

    .line 402
    invoke-virtual {v1, p1, p2, v0}, Lorg/apache/sanselan/formats/tiff/TiffReader;->readDirectories(Lorg/apache/sanselan/common/byteSources/ByteSource;ZLorg/apache/sanselan/FormatCompliance;)Lorg/apache/sanselan/formats/tiff/TiffContents;

    move-result-object p2

    .line 404
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    move v2, v1

    .line 405
    :goto_0
    iget-object v3, p2, Lorg/apache/sanselan/formats/tiff/TiffContents;->directories:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_1

    .line 407
    iget-object v3, p2, Lorg/apache/sanselan/formats/tiff/TiffContents;->directories:Ljava/util/ArrayList;

    .line 408
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/apache/sanselan/formats/tiff/TiffDirectory;

    .line 409
    invoke-virtual {v3}, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->getTiffRawImageDataElements()Ljava/util/ArrayList;

    move-result-object v3

    move v4, v1

    .line 410
    :goto_1
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v5

    if-ge v4, v5, :cond_0

    .line 413
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lorg/apache/sanselan/formats/tiff/TiffDirectory$ImageDataElement;

    .line 414
    iget v6, v5, Lorg/apache/sanselan/formats/tiff/TiffDirectory$ImageDataElement;->offset:I

    iget v5, v5, Lorg/apache/sanselan/formats/tiff/TiffDirectory$ImageDataElement;->length:I

    invoke-virtual {p1, v6, v5}, Lorg/apache/sanselan/common/byteSources/ByteSource;->getBlock(II)[B

    move-result-object v5

    .line 416
    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public dumpImageFile(Ljava/io/PrintWriter;Lorg/apache/sanselan/common/byteSources/ByteSource;)Z
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    :try_start_0
    const-string v0, "tiff.dumpImageFile"

    .line 326
    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 329
    invoke-virtual {p0, p2}, Lorg/apache/sanselan/formats/tiff/TiffImageParser;->getImageInfo(Lorg/apache/sanselan/common/byteSources/ByteSource;)Lorg/apache/sanselan/ImageInfo;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    :goto_0
    const-string p2, ""

    .line 383
    invoke-virtual {p1, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    return v1

    :cond_0
    :try_start_1
    const-string v2, ""

    .line 333
    invoke-virtual {v0, p1, v2}, Lorg/apache/sanselan/ImageInfo;->toString(Ljava/io/PrintWriter;Ljava/lang/String;)V

    const-string v0, ""

    .line 336
    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 341
    invoke-static {}, Lorg/apache/sanselan/FormatCompliance;->getDefault()Lorg/apache/sanselan/FormatCompliance;

    move-result-object v0

    const/4 v2, 0x0

    .line 343
    new-instance v3, Lorg/apache/sanselan/formats/tiff/TiffReader;

    const/4 v4, 0x1

    invoke-direct {v3, v4}, Lorg/apache/sanselan/formats/tiff/TiffReader;-><init>(Z)V

    invoke-virtual {v3, p2, v2, v0}, Lorg/apache/sanselan/formats/tiff/TiffReader;->readContents(Lorg/apache/sanselan/common/byteSources/ByteSource;Ljava/util/Map;Lorg/apache/sanselan/FormatCompliance;)Lorg/apache/sanselan/formats/tiff/TiffContents;

    move-result-object p2

    .line 346
    iget-object p2, p2, Lorg/apache/sanselan/formats/tiff/TiffContents;->directories:Ljava/util/ArrayList;

    if-nez p2, :cond_1

    goto :goto_0

    :cond_1
    move v0, v1

    .line 351
    :goto_1
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_4

    .line 354
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/apache/sanselan/formats/tiff/TiffDirectory;

    .line 356
    iget-object v2, v2, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->entries:Ljava/util/ArrayList;

    if-nez v2, :cond_2

    goto :goto_0

    :cond_2
    move v3, v1

    .line 363
    :goto_2
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ge v3, v5, :cond_3

    .line 365
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lorg/apache/sanselan/formats/tiff/TiffField;

    .line 367
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, ""

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, p1, v6}, Lorg/apache/sanselan/formats/tiff/TiffField;->dump(Ljava/io/PrintWriter;Ljava/lang/String;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_4
    const-string p2, ""

    .line 371
    invoke-virtual {p1, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string p2, ""

    .line 383
    invoke-virtual {p1, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    return v4

    :catchall_0
    move-exception p2

    const-string v0, ""

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    throw p2
.end method

.method public embedICCProfile(Ljava/io/File;Ljava/io/File;[B)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public embedICCProfile([B[B)[B
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method protected getAcceptedExtensions()[Ljava/lang/String;
    .locals 1

    .line 61
    sget-object v0, Lorg/apache/sanselan/formats/tiff/TiffImageParser;->ACCEPTED_EXTENSIONS:[Ljava/lang/String;

    return-object v0
.end method

.method protected getAcceptedTypes()[Lorg/apache/sanselan/ImageFormat;
    .locals 3

    const/4 v0, 0x1

    .line 66
    new-array v0, v0, [Lorg/apache/sanselan/ImageFormat;

    sget-object v1, Lorg/apache/sanselan/ImageFormat;->IMAGE_FORMAT_TIFF:Lorg/apache/sanselan/ImageFormat;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    return-object v0
.end method

.method public getDefaultExtension()Ljava/lang/String;
    .locals 1

    const-string v0, ".tif"

    return-object v0
.end method

.method public getFormatCompliance(Lorg/apache/sanselan/common/byteSources/ByteSource;)Lorg/apache/sanselan/FormatCompliance;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 390
    invoke-static {}, Lorg/apache/sanselan/FormatCompliance;->getDefault()Lorg/apache/sanselan/FormatCompliance;

    move-result-object v0

    .line 392
    new-instance v1, Lorg/apache/sanselan/formats/tiff/TiffReader;

    const/4 v2, 0x0

    invoke-static {v2}, Lorg/apache/sanselan/formats/tiff/TiffImageParser;->isStrict(Ljava/util/Map;)Z

    move-result v3

    invoke-direct {v1, v3}, Lorg/apache/sanselan/formats/tiff/TiffReader;-><init>(Z)V

    invoke-virtual {v1, p1, v2, v0}, Lorg/apache/sanselan/formats/tiff/TiffReader;->readContents(Lorg/apache/sanselan/common/byteSources/ByteSource;Ljava/util/Map;Lorg/apache/sanselan/FormatCompliance;)Lorg/apache/sanselan/formats/tiff/TiffContents;

    return-object v0
.end method

.method public getICCProfileBytes(Lorg/apache/sanselan/common/byteSources/ByteSource;Ljava/util/Map;)[B
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 73
    invoke-static {}, Lorg/apache/sanselan/FormatCompliance;->getDefault()Lorg/apache/sanselan/FormatCompliance;

    move-result-object v0

    .line 74
    new-instance v1, Lorg/apache/sanselan/formats/tiff/TiffReader;

    invoke-static {p2}, Lorg/apache/sanselan/formats/tiff/TiffImageParser;->isStrict(Ljava/util/Map;)Z

    move-result v2

    invoke-direct {v1, v2}, Lorg/apache/sanselan/formats/tiff/TiffReader;-><init>(Z)V

    const/4 v2, 0x0

    .line 75
    invoke-virtual {v1, p1, p2, v2, v0}, Lorg/apache/sanselan/formats/tiff/TiffReader;->readFirstDirectory(Lorg/apache/sanselan/common/byteSources/ByteSource;Ljava/util/Map;ZLorg/apache/sanselan/FormatCompliance;)Lorg/apache/sanselan/formats/tiff/TiffContents;

    move-result-object p1

    .line 76
    iget-object p1, p1, Lorg/apache/sanselan/formats/tiff/TiffContents;->directories:Ljava/util/ArrayList;

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/apache/sanselan/formats/tiff/TiffDirectory;

    .line 78
    sget-object p2, Lorg/apache/sanselan/formats/tiff/TiffImageParser;->EXIF_TAG_ICC_PROFILE:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    invoke-virtual {p1, p2}, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->findField(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;)Lorg/apache/sanselan/formats/tiff/TiffField;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 81
    :cond_0
    iget-object p1, p1, Lorg/apache/sanselan/formats/tiff/TiffField;->oversizeValue:[B

    return-object p1
.end method

.method public getImageInfo(Lorg/apache/sanselan/common/byteSources/ByteSource;Ljava/util/Map;)Lorg/apache/sanselan/ImageInfo;
    .locals 25
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 143
    invoke-static {}, Lorg/apache/sanselan/FormatCompliance;->getDefault()Lorg/apache/sanselan/FormatCompliance;

    move-result-object v0

    .line 144
    new-instance v1, Lorg/apache/sanselan/formats/tiff/TiffReader;

    invoke-static/range {p2 .. p2}, Lorg/apache/sanselan/formats/tiff/TiffImageParser;->isStrict(Ljava/util/Map;)Z

    move-result v2

    invoke-direct {v1, v2}, Lorg/apache/sanselan/formats/tiff/TiffReader;-><init>(Z)V

    const/4 v2, 0x0

    move-object/from16 v3, p1

    .line 145
    invoke-virtual {v1, v3, v2, v0}, Lorg/apache/sanselan/formats/tiff/TiffReader;->readDirectories(Lorg/apache/sanselan/common/byteSources/ByteSource;ZLorg/apache/sanselan/FormatCompliance;)Lorg/apache/sanselan/formats/tiff/TiffContents;

    move-result-object v0

    .line 146
    iget-object v1, v0, Lorg/apache/sanselan/formats/tiff/TiffContents;->directories:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/apache/sanselan/formats/tiff/TiffDirectory;

    .line 148
    sget-object v3, Lorg/apache/sanselan/formats/tiff/TiffImageParser;->TIFF_TAG_IMAGE_WIDTH:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    const/4 v4, 0x1

    invoke-virtual {v1, v3, v4}, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->findField(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;Z)Lorg/apache/sanselan/formats/tiff/TiffField;

    move-result-object v3

    .line 149
    sget-object v5, Lorg/apache/sanselan/formats/tiff/TiffImageParser;->TIFF_TAG_IMAGE_LENGTH:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    .line 150
    invoke-virtual {v1, v5, v4}, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->findField(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;Z)Lorg/apache/sanselan/formats/tiff/TiffField;

    move-result-object v5

    if-eqz v3, :cond_a

    if-eqz v5, :cond_a

    .line 155
    invoke-virtual {v5}, Lorg/apache/sanselan/formats/tiff/TiffField;->getIntValue()I

    move-result v12

    .line 156
    invoke-virtual {v3}, Lorg/apache/sanselan/formats/tiff/TiffField;->getIntValue()I

    move-result v3

    .line 160
    sget-object v5, Lorg/apache/sanselan/formats/tiff/TiffImageParser;->TIFF_TAG_RESOLUTION_UNIT:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    .line 161
    invoke-virtual {v1, v5}, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->findField(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;)Lorg/apache/sanselan/formats/tiff/TiffField;

    move-result-object v5

    const/4 v6, 0x2

    if-eqz v5, :cond_0

    .line 164
    invoke-virtual {v5}, Lorg/apache/sanselan/formats/tiff/TiffField;->getValue()Ljava/lang/Object;

    move-result-object v7

    if-eqz v7, :cond_0

    .line 165
    invoke-virtual {v5}, Lorg/apache/sanselan/formats/tiff/TiffField;->getIntValue()I

    move-result v6

    :cond_0
    const-wide/high16 v7, -0x4010000000000000L    # -1.0

    packed-switch v6, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const-wide v7, 0x3f9a027525460aa6L    # 0.0254

    goto :goto_0

    :pswitch_1
    const-wide/high16 v7, 0x3ff0000000000000L    # 1.0

    .line 182
    :goto_0
    :pswitch_2
    sget-object v5, Lorg/apache/sanselan/formats/tiff/TiffImageParser;->TIFF_TAG_XRESOLUTION:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    invoke-virtual {v1, v5}, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->findField(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;)Lorg/apache/sanselan/formats/tiff/TiffField;

    move-result-object v5

    .line 183
    sget-object v6, Lorg/apache/sanselan/formats/tiff/TiffImageParser;->TIFF_TAG_YRESOLUTION:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    invoke-virtual {v1, v6}, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->findField(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;)Lorg/apache/sanselan/formats/tiff/TiffField;

    move-result-object v6

    const-wide/16 v9, 0x0

    cmpl-double v9, v7, v9

    if-lez v9, :cond_4

    if-eqz v5, :cond_1

    .line 193
    invoke-virtual {v5}, Lorg/apache/sanselan/formats/tiff/TiffField;->getValue()Ljava/lang/Object;

    move-result-object v9

    if-eqz v9, :cond_1

    .line 196
    invoke-virtual {v5}, Lorg/apache/sanselan/formats/tiff/TiffField;->getDoubleValue()D

    move-result-wide v13

    div-double v4, v13, v7

    double-to-int v4, v4

    int-to-double v10, v3

    mul-double/2addr v13, v7

    div-double/2addr v10, v13

    double-to-float v10, v10

    goto :goto_1

    :cond_1
    const/4 v4, -0x1

    const/high16 v10, -0x40800000    # -1.0f

    :goto_1
    if-eqz v6, :cond_3

    .line 201
    invoke-virtual {v6}, Lorg/apache/sanselan/formats/tiff/TiffField;->getValue()Ljava/lang/Object;

    move-result-object v9

    if-eqz v9, :cond_2

    .line 204
    invoke-virtual {v6}, Lorg/apache/sanselan/formats/tiff/TiffField;->getDoubleValue()D

    move-result-wide v13

    div-double v5, v13, v7

    double-to-int v5, v5

    move v6, v10

    int-to-double v9, v12

    mul-double/2addr v13, v7

    div-double/2addr v9, v13

    double-to-float v7, v9

    move/from16 v17, v4

    move v15, v5

    move/from16 v18, v6

    move/from16 v16, v7

    goto :goto_3

    :cond_2
    move v6, v10

    goto :goto_2

    :cond_3
    move v6, v10

    :goto_2
    move/from16 v17, v4

    move/from16 v18, v6

    const/4 v15, -0x1

    const/high16 v16, -0x40800000    # -1.0f

    goto :goto_3

    :cond_4
    const/4 v15, -0x1

    const/high16 v16, -0x40800000    # -1.0f

    const/16 v17, -0x1

    const/high16 v18, -0x40800000    # -1.0f

    .line 212
    :goto_3
    sget-object v4, Lorg/apache/sanselan/formats/tiff/TiffImageParser;->TIFF_TAG_BITS_PER_SAMPLE:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    .line 213
    invoke-virtual {v1, v4}, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->findField(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;)Lorg/apache/sanselan/formats/tiff/TiffField;

    move-result-object v4

    if-eqz v4, :cond_5

    .line 217
    invoke-virtual {v4}, Lorg/apache/sanselan/formats/tiff/TiffField;->getValue()Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_5

    .line 218
    invoke-virtual {v4}, Lorg/apache/sanselan/formats/tiff/TiffField;->getIntValueOrArraySum()I

    move-result v4

    move v8, v4

    goto :goto_4

    :cond_5
    const/4 v8, -0x1

    .line 225
    :goto_4
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 226
    iget-object v4, v1, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->entries:Ljava/util/ArrayList;

    move v5, v2

    .line 227
    :goto_5
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-ge v5, v6, :cond_6

    .line 229
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lorg/apache/sanselan/formats/tiff/TiffField;

    .line 230
    invoke-virtual {v6}, Lorg/apache/sanselan/formats/tiff/TiffField;->toString()Ljava/lang/String;

    move-result-object v6

    .line 231
    invoke-virtual {v9, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_5

    .line 234
    :cond_6
    sget-object v10, Lorg/apache/sanselan/ImageFormat;->IMAGE_FORMAT_TIFF:Lorg/apache/sanselan/ImageFormat;

    const-string v11, "TIFF Tag-based Image File Format"

    const-string v13, "image/tiff"

    .line 237
    iget-object v4, v0, Lorg/apache/sanselan/formats/tiff/TiffContents;->directories:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v14

    const/16 v20, 0x0

    .line 242
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Tiff v."

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, v0, Lorg/apache/sanselan/formats/tiff/TiffContents;->header:Lorg/apache/sanselan/formats/tiff/TiffHeader;

    iget v0, v0, Lorg/apache/sanselan/formats/tiff/TiffHeader;->tiffVersion:I

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    const/16 v21, 0x0

    .line 246
    sget-object v0, Lorg/apache/sanselan/formats/tiff/TiffImageParser;->TIFF_TAG_COLOR_MAP:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    invoke-virtual {v1, v0}, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->findField(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;)Lorg/apache/sanselan/formats/tiff/TiffField;

    move-result-object v0

    if-eqz v0, :cond_7

    const/16 v22, 0x1

    goto :goto_6

    :cond_7
    move/from16 v22, v2

    :goto_6
    const/16 v23, 0x2

    .line 252
    sget-object v0, Lorg/apache/sanselan/formats/tiff/TiffImageParser;->TIFF_TAG_COMPRESSION:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    invoke-virtual {v1, v0}, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->findField(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;)Lorg/apache/sanselan/formats/tiff/TiffField;

    move-result-object v0

    .line 253
    invoke-virtual {v0}, Lorg/apache/sanselan/formats/tiff/TiffField;->getIntValue()I

    move-result v0

    const v1, 0x8003

    if-eq v0, v1, :cond_9

    const v1, 0x8005

    if-eq v0, v1, :cond_8

    packed-switch v0, :pswitch_data_1

    const-string v0, "Unknown"

    move-object/from16 v24, v0

    goto :goto_7

    :pswitch_3
    const-string v0, "JPEG"

    move-object/from16 v24, v0

    goto :goto_7

    :pswitch_4
    const-string v0, "LZW"

    move-object/from16 v24, v0

    goto :goto_7

    :pswitch_5
    const-string v0, "CCITT Group 4"

    move-object/from16 v24, v0

    goto :goto_7

    :pswitch_6
    const-string v0, "CCITT Group 3 1-Dimensional Modified Huffman run-length encoding."

    move-object/from16 v24, v0

    goto :goto_7

    :pswitch_7
    const-string v0, "CCITT 1D"

    move-object/from16 v24, v0

    goto :goto_7

    :pswitch_8
    const-string v0, "None"

    move-object/from16 v24, v0

    goto :goto_7

    :cond_8
    const-string v0, "PackBits"

    move-object/from16 v24, v0

    goto :goto_7

    :cond_9
    const-string v0, "None"

    move-object/from16 v24, v0

    .line 287
    :goto_7
    new-instance v0, Lorg/apache/sanselan/ImageInfo;

    move-object v6, v0

    move/from16 v19, v3

    invoke-direct/range {v6 .. v24}, Lorg/apache/sanselan/ImageInfo;-><init>(Ljava/lang/String;ILjava/util/ArrayList;Lorg/apache/sanselan/ImageFormat;Ljava/lang/String;ILjava/lang/String;IIFIFIZZZILjava/lang/String;)V

    return-object v0

    .line 153
    :cond_a
    new-instance v0, Lorg/apache/sanselan/ImageReadException;

    const-string v1, "TIFF image missing size info."

    invoke-direct {v0, v1}, Lorg/apache/sanselan/ImageReadException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch
.end method

.method public getImageSize(Lorg/apache/sanselan/common/byteSources/ByteSource;Ljava/util/Map;)[I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 87
    invoke-static {}, Lorg/apache/sanselan/FormatCompliance;->getDefault()Lorg/apache/sanselan/FormatCompliance;

    move-result-object v0

    .line 88
    new-instance v1, Lorg/apache/sanselan/formats/tiff/TiffReader;

    invoke-static {p2}, Lorg/apache/sanselan/formats/tiff/TiffImageParser;->isStrict(Ljava/util/Map;)Z

    move-result v2

    invoke-direct {v1, v2}, Lorg/apache/sanselan/formats/tiff/TiffReader;-><init>(Z)V

    const/4 v2, 0x0

    .line 89
    invoke-virtual {v1, p1, p2, v2, v0}, Lorg/apache/sanselan/formats/tiff/TiffReader;->readFirstDirectory(Lorg/apache/sanselan/common/byteSources/ByteSource;Ljava/util/Map;ZLorg/apache/sanselan/FormatCompliance;)Lorg/apache/sanselan/formats/tiff/TiffContents;

    move-result-object p1

    .line 90
    iget-object p1, p1, Lorg/apache/sanselan/formats/tiff/TiffContents;->directories:Ljava/util/ArrayList;

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/apache/sanselan/formats/tiff/TiffDirectory;

    .line 92
    sget-object p2, Lorg/apache/sanselan/formats/tiff/TiffImageParser;->TIFF_TAG_IMAGE_WIDTH:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    invoke-virtual {p1, p2}, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->findField(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;)Lorg/apache/sanselan/formats/tiff/TiffField;

    move-result-object p2

    invoke-virtual {p2}, Lorg/apache/sanselan/formats/tiff/TiffField;->getIntValue()I

    move-result p2

    .line 93
    sget-object v0, Lorg/apache/sanselan/formats/tiff/TiffImageParser;->TIFF_TAG_IMAGE_LENGTH:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    invoke-virtual {p1, v0}, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->findField(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;)Lorg/apache/sanselan/formats/tiff/TiffField;

    move-result-object p1

    invoke-virtual {p1}, Lorg/apache/sanselan/formats/tiff/TiffField;->getIntValue()I

    move-result p1

    const/4 v0, 0x2

    .line 95
    new-array v0, v0, [I

    aput p2, v0, v2

    const/4 p2, 0x1

    aput p1, v0, p2

    return-object v0
.end method

.method public getMetadata(Lorg/apache/sanselan/common/byteSources/ByteSource;Ljava/util/Map;)Lorg/apache/sanselan/common/IImageMetadata;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 111
    invoke-static {}, Lorg/apache/sanselan/FormatCompliance;->getDefault()Lorg/apache/sanselan/FormatCompliance;

    move-result-object v0

    .line 112
    new-instance v1, Lorg/apache/sanselan/formats/tiff/TiffReader;

    invoke-static {p2}, Lorg/apache/sanselan/formats/tiff/TiffImageParser;->isStrict(Ljava/util/Map;)Z

    move-result v2

    invoke-direct {v1, v2}, Lorg/apache/sanselan/formats/tiff/TiffReader;-><init>(Z)V

    invoke-virtual {v1, p1, p2, v0}, Lorg/apache/sanselan/formats/tiff/TiffReader;->readContents(Lorg/apache/sanselan/common/byteSources/ByteSource;Ljava/util/Map;Lorg/apache/sanselan/FormatCompliance;)Lorg/apache/sanselan/formats/tiff/TiffContents;

    move-result-object p1

    .line 115
    iget-object p2, p1, Lorg/apache/sanselan/formats/tiff/TiffContents;->directories:Ljava/util/ArrayList;

    .line 117
    new-instance v0, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata;

    invoke-direct {v0, p1}, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata;-><init>(Lorg/apache/sanselan/formats/tiff/TiffContents;)V

    const/4 p1, 0x0

    move v1, p1

    .line 119
    :goto_0
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 121
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/apache/sanselan/formats/tiff/TiffDirectory;

    .line 123
    new-instance v3, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata$Directory;

    invoke-direct {v3, v2}, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata$Directory;-><init>(Lorg/apache/sanselan/formats/tiff/TiffDirectory;)V

    .line 126
    invoke-virtual {v2}, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->getDirectoryEntrys()Ljava/util/ArrayList;

    move-result-object v2

    move v4, p1

    .line 128
    :goto_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ge v4, v5, :cond_0

    .line 130
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lorg/apache/sanselan/formats/tiff/TiffField;

    .line 131
    invoke-virtual {v3, v5}, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata$Directory;->add(Lorg/apache/sanselan/formats/tiff/TiffField;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 134
    :cond_0
    invoke-virtual {v0, v3}, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata;->add(Lorg/apache/sanselan/common/IImageMetadata$IImageMetadataItem;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    const-string v0, "Tiff-Custom"

    return-object v0
.end method

.method public getXmpXml(Lorg/apache/sanselan/common/byteSources/ByteSource;Ljava/util/Map;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 299
    invoke-static {}, Lorg/apache/sanselan/FormatCompliance;->getDefault()Lorg/apache/sanselan/FormatCompliance;

    move-result-object v0

    .line 300
    new-instance v1, Lorg/apache/sanselan/formats/tiff/TiffReader;

    invoke-static {p2}, Lorg/apache/sanselan/formats/tiff/TiffImageParser;->isStrict(Ljava/util/Map;)Z

    move-result p2

    invoke-direct {v1, p2}, Lorg/apache/sanselan/formats/tiff/TiffReader;-><init>(Z)V

    const/4 p2, 0x0

    .line 301
    invoke-virtual {v1, p1, p2, v0}, Lorg/apache/sanselan/formats/tiff/TiffReader;->readDirectories(Lorg/apache/sanselan/common/byteSources/ByteSource;ZLorg/apache/sanselan/FormatCompliance;)Lorg/apache/sanselan/formats/tiff/TiffContents;

    move-result-object p1

    .line 302
    iget-object p1, p1, Lorg/apache/sanselan/formats/tiff/TiffContents;->directories:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/apache/sanselan/formats/tiff/TiffDirectory;

    .line 304
    sget-object v0, Lorg/apache/sanselan/formats/tiff/TiffImageParser;->TIFF_TAG_XMP:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    invoke-virtual {p1, v0, p2}, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->findField(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;Z)Lorg/apache/sanselan/formats/tiff/TiffField;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 308
    :cond_0
    invoke-virtual {p1}, Lorg/apache/sanselan/formats/tiff/TiffField;->getByteArrayValue()[B

    move-result-object p1

    .line 313
    :try_start_0
    new-instance p2, Ljava/lang/String;

    const-string v0, "utf-8"

    invoke-direct {p2, p1, v0}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p2

    .line 317
    :catch_0
    new-instance p1, Lorg/apache/sanselan/ImageReadException;

    const-string p2, "Invalid JPEG XMP Segment."

    invoke-direct {p1, p2}, Lorg/apache/sanselan/ImageReadException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
