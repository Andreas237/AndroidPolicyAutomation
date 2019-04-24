.class public Lorg/apache/sanselan/formats/jpeg/JpegImageParser;
.super Lorg/apache/sanselan/ImageParser;
.source "JpegImageParser.java"

# interfaces
.implements Lorg/apache/sanselan/formats/jpeg/JpegConstants;
.implements Lorg/apache/sanselan/formats/tiff/constants/TiffTagConstants;


# static fields
.field public static final AcceptedExtensions:[Ljava/lang/String;

.field private static final DEFAULT_EXTENSION:Ljava/lang/String; = ".jpg"

.field public static final permissive:Z = true


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, ".jpg"

    const-string v1, ".jpeg"

    .line 81
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/apache/sanselan/formats/jpeg/JpegImageParser;->AcceptedExtensions:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 58
    invoke-direct {p0}, Lorg/apache/sanselan/ImageParser;-><init>()V

    const/16 v0, 0x4d

    .line 59
    invoke-virtual {p0, v0}, Lorg/apache/sanselan/formats/jpeg/JpegImageParser;->setByteOrder(I)V

    return-void
.end method

.method static synthetic access$000(Lorg/apache/sanselan/formats/jpeg/JpegImageParser;I[I)Z
    .locals 0

    .line 54
    invoke-direct {p0, p1, p2}, Lorg/apache/sanselan/formats/jpeg/JpegImageParser;->keepMarker(I[I)Z

    move-result p0

    return p0
.end method

.method private assembleSegments(Ljava/util/ArrayList;)[B
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 187
    :try_start_0
    invoke-direct {p0, p1, v0}, Lorg/apache/sanselan/formats/jpeg/JpegImageParser;->assembleSegments(Ljava/util/ArrayList;Z)[B

    move-result-object p1
    :try_end_0
    .catch Lorg/apache/sanselan/ImageReadException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    const/4 v0, 0x1

    .line 190
    invoke-direct {p0, p1, v0}, Lorg/apache/sanselan/formats/jpeg/JpegImageParser;->assembleSegments(Ljava/util/ArrayList;Z)[B

    move-result-object p1

    return-object p1
.end method

.method private assembleSegments(Ljava/util/ArrayList;Z)[B
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 197
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-lt v0, v1, :cond_5

    const/4 v0, 0x0

    .line 200
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/apache/sanselan/formats/jpeg/segments/App2Segment;

    iget v2, v2, Lorg/apache/sanselan/formats/jpeg/segments/App2Segment;->num_markers:I

    .line 205
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ne v3, v2, :cond_4

    .line 209
    invoke-static {p1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    xor-int/2addr p2, v1

    move v1, v0

    move v3, v1

    .line 214
    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v1, v4, :cond_2

    .line 216
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lorg/apache/sanselan/formats/jpeg/segments/App2Segment;

    add-int v5, v1, p2

    .line 218
    iget v6, v4, Lorg/apache/sanselan/formats/jpeg/segments/App2Segment;->cur_marker:I

    if-ne v5, v6, :cond_1

    .line 227
    iget v5, v4, Lorg/apache/sanselan/formats/jpeg/segments/App2Segment;->num_markers:I

    if-ne v2, v5, :cond_0

    .line 236
    iget-object v4, v4, Lorg/apache/sanselan/formats/jpeg/segments/App2Segment;->icc_bytes:[B

    array-length v4, v4

    add-int/2addr v3, v4

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 229
    :cond_0
    invoke-direct {p0, p1}, Lorg/apache/sanselan/formats/jpeg/JpegImageParser;->dumpSegments(Ljava/util/ArrayList;)V

    .line 230
    new-instance p1, Lorg/apache/sanselan/ImageReadException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Inconsistent App2 Segment Count info.  markerCount: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", segment["

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "].num_markers: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, v4, Lorg/apache/sanselan/formats/jpeg/segments/App2Segment;->num_markers:I

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "."

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lorg/apache/sanselan/ImageReadException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 220
    :cond_1
    invoke-direct {p0, p1}, Lorg/apache/sanselan/formats/jpeg/JpegImageParser;->dumpSegments(Ljava/util/ArrayList;)V

    .line 221
    new-instance p1, Lorg/apache/sanselan/ImageReadException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Incoherent App2 Segment Ordering.  i: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", segment["

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "].cur_marker: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, v4, Lorg/apache/sanselan/formats/jpeg/segments/App2Segment;->cur_marker:I

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "."

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lorg/apache/sanselan/ImageReadException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 239
    :cond_2
    new-array p2, v3, [B

    move v1, v0

    move v2, v1

    .line 242
    :goto_1
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v1, v3, :cond_3

    .line 244
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/apache/sanselan/formats/jpeg/segments/App2Segment;

    .line 246
    iget-object v4, v3, Lorg/apache/sanselan/formats/jpeg/segments/App2Segment;->icc_bytes:[B

    iget-object v5, v3, Lorg/apache/sanselan/formats/jpeg/segments/App2Segment;->icc_bytes:[B

    array-length v5, v5

    invoke-static {v4, v0, p2, v2, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 248
    iget-object v3, v3, Lorg/apache/sanselan/formats/jpeg/segments/App2Segment;->icc_bytes:[B

    array-length v3, v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    return-object p2

    .line 206
    :cond_4
    new-instance p2, Lorg/apache/sanselan/ImageReadException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "App2 Segments Missing.  Found: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 207
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", Expected: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lorg/apache/sanselan/ImageReadException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 198
    :cond_5
    new-instance p1, Lorg/apache/sanselan/ImageReadException;

    const-string p2, "No App2 Segments Found."

    invoke-direct {p1, p2}, Lorg/apache/sanselan/ImageReadException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private dumpSegments(Ljava/util/ArrayList;)V
    .locals 4

    .line 256
    invoke-static {}, Lorg/apache/sanselan/util/Debug;->debug()V

    const-string v0, "dumpSegments"

    .line 257
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-static {v0, v1}, Lorg/apache/sanselan/util/Debug;->debug(Ljava/lang/String;I)V

    const/4 v0, 0x0

    .line 259
    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 261
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/apache/sanselan/formats/jpeg/segments/App2Segment;

    .line 263
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ": "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, v1, Lorg/apache/sanselan/formats/jpeg/segments/App2Segment;->cur_marker:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " / "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, v1, Lorg/apache/sanselan/formats/jpeg/segments/App2Segment;->num_markers:I

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lorg/apache/sanselan/util/Debug;->debug(Ljava/lang/String;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 266
    :cond_0
    invoke-static {}, Lorg/apache/sanselan/util/Debug;->debug()V

    return-void
.end method

.method private filterAPP1Segments(Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 4

    .line 332
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    .line 334
    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 336
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/apache/sanselan/formats/jpeg/segments/GenericSegment;

    .line 337
    invoke-static {v2}, Lorg/apache/sanselan/formats/jpeg/JpegImageParser;->isExifAPP1Segment(Lorg/apache/sanselan/formats/jpeg/segments/GenericSegment;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 338
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private filterSegments(Ljava/util/ArrayList;Ljava/util/List;)Ljava/util/ArrayList;
    .locals 5

    .line 346
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    .line 348
    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 350
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/apache/sanselan/formats/jpeg/segments/Segment;

    .line 351
    new-instance v3, Ljava/lang/Integer;

    iget v4, v2, Lorg/apache/sanselan/formats/jpeg/segments/Segment;->marker:I

    invoke-direct {v3, v4}, Ljava/lang/Integer;-><init>(I)V

    .line 352
    invoke-interface {p2, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 353
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public static isExifAPP1Segment(Lorg/apache/sanselan/formats/jpeg/segments/GenericSegment;)Z
    .locals 1

    .line 327
    iget-object p0, p0, Lorg/apache/sanselan/formats/jpeg/segments/GenericSegment;->bytes:[B

    sget-object v0, Lorg/apache/sanselan/formats/jpeg/JpegImageParser;->EXIF_IDENTIFIER_CODE:[B

    invoke-static {p0, v0}, Lorg/apache/sanselan/formats/jpeg/JpegImageParser;->byteArrayHasPrefix([B[B)Z

    move-result p0

    return p0
.end method

.method private keepMarker(I[I)Z
    .locals 4

    const/4 v0, 0x1

    if-nez p2, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    move v2, v1

    .line 100
    :goto_0
    array-length v3, p2

    if-ge v2, v3, :cond_2

    .line 102
    aget v3, p2, v2

    if-ne v3, p1, :cond_1

    return v0

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return v1
.end method


# virtual methods
.method public dumpImageFile(Ljava/io/PrintWriter;Lorg/apache/sanselan/common/byteSources/ByteSource;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "tiff.dumpImageFile"

    .line 1023
    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 1026
    invoke-virtual {p0, p2}, Lorg/apache/sanselan/formats/jpeg/JpegImageParser;->getImageInfo(Lorg/apache/sanselan/common/byteSources/ByteSource;)Lorg/apache/sanselan/ImageInfo;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    const-string v2, ""

    .line 1030
    invoke-virtual {v0, p1, v2}, Lorg/apache/sanselan/ImageInfo;->toString(Ljava/io/PrintWriter;Ljava/lang/String;)V

    const-string v0, ""

    .line 1033
    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 1036
    invoke-virtual {p0, p2, v0, v1}, Lorg/apache/sanselan/formats/jpeg/JpegImageParser;->readSegments(Lorg/apache/sanselan/common/byteSources/ByteSource;[IZ)Ljava/util/ArrayList;

    move-result-object p2

    if-eqz p2, :cond_2

    .line 1041
    :goto_0
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 1044
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/sanselan/formats/jpeg/segments/Segment;

    .line 1046
    invoke-static {}, Ljava/text/NumberFormat;->getIntegerInstance()Ljava/text/NumberFormat;

    move-result-object v2

    .line 1048
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ": marker: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, v0, Lorg/apache/sanselan/formats/jpeg/segments/Segment;->marker:I

    .line 1049
    invoke-static {v4}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ", "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1050
    invoke-virtual {v0}, Lorg/apache/sanselan/formats/jpeg/segments/Segment;->getDescription()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " (length: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, v0, Lorg/apache/sanselan/formats/jpeg/segments/Segment;->length:I

    int-to-long v4, v4

    .line 1051
    invoke-virtual {v2, v4, v5}, Ljava/text/NumberFormat;->format(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ")"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 1048
    invoke-virtual {p1, v2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 1052
    invoke-virtual {v0, p1}, Lorg/apache/sanselan/formats/jpeg/segments/Segment;->dump(Ljava/io/PrintWriter;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const-string p2, ""

    .line 1055
    invoke-virtual {p1, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1

    .line 1039
    :cond_2
    new-instance p1, Lorg/apache/sanselan/ImageReadException;

    const-string p2, "No Segments Found."

    invoke-direct {p1, p2}, Lorg/apache/sanselan/ImageReadException;-><init>(Ljava/lang/String;)V

    throw p1
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

    .line 85
    sget-object v0, Lorg/apache/sanselan/formats/jpeg/JpegImageParser;->AcceptedExtensions:[Ljava/lang/String;

    return-object v0
.end method

.method protected getAcceptedTypes()[Lorg/apache/sanselan/ImageFormat;
    .locals 3

    const/4 v0, 0x1

    .line 65
    new-array v0, v0, [Lorg/apache/sanselan/ImageFormat;

    sget-object v1, Lorg/apache/sanselan/ImageFormat;->IMAGE_FORMAT_JPEG:Lorg/apache/sanselan/ImageFormat;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    return-object v0
.end method

.method public getDefaultExtension()Ljava/lang/String;
    .locals 1

    const-string v0, ".jpg"

    return-object v0
.end method

.method public getExifMetadata(Lorg/apache/sanselan/common/byteSources/ByteSource;Ljava/util/Map;)Lorg/apache/sanselan/formats/tiff/TiffImageMetadata;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 362
    invoke-virtual {p0, p1}, Lorg/apache/sanselan/formats/jpeg/JpegImageParser;->getExifRawData(Lorg/apache/sanselan/common/byteSources/ByteSource;)[B

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    if-nez p2, :cond_1

    .line 367
    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    :cond_1
    const-string v0, "READ_THUMBNAILS"

    .line 368
    invoke-interface {p2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "READ_THUMBNAILS"

    .line 369
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 371
    :cond_2
    new-instance v0, Lorg/apache/sanselan/formats/tiff/TiffImageParser;

    invoke-direct {v0}, Lorg/apache/sanselan/formats/tiff/TiffImageParser;-><init>()V

    invoke-virtual {v0, p1, p2}, Lorg/apache/sanselan/formats/tiff/TiffImageParser;->getMetadata([BLjava/util/Map;)Lorg/apache/sanselan/common/IImageMetadata;

    move-result-object p1

    check-cast p1, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata;

    return-object p1
.end method

.method public getExifRawData(Lorg/apache/sanselan/common/byteSources/ByteSource;)[B
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    .line 378
    new-array v1, v0, [I

    const/4 v2, 0x0

    const v3, 0xffe1

    aput v3, v1, v2

    invoke-virtual {p0, p1, v1, v2}, Lorg/apache/sanselan/formats/jpeg/JpegImageParser;->readSegments(Lorg/apache/sanselan/common/byteSources/ByteSource;[IZ)Ljava/util/ArrayList;

    move-result-object p1

    const/4 v1, 0x0

    if-eqz p1, :cond_4

    .line 381
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v3, v0, :cond_0

    goto :goto_0

    .line 384
    :cond_0
    invoke-direct {p0, p1}, Lorg/apache/sanselan/formats/jpeg/JpegImageParser;->filterAPP1Segments(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object p1

    .line 385
    iget-boolean v3, p0, Lorg/apache/sanselan/formats/jpeg/JpegImageParser;->debug:Z

    if-eqz v3, :cond_1

    .line 386
    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "exif_segments.size: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 387
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 386
    invoke-virtual {v3, v4}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 393
    :cond_1
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v3, v0, :cond_2

    return-object v1

    .line 395
    :cond_2
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-gt v1, v0, :cond_3

    .line 400
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/apache/sanselan/formats/jpeg/segments/GenericSegment;

    .line 401
    iget-object p1, p1, Lorg/apache/sanselan/formats/jpeg/segments/GenericSegment;->bytes:[B

    const-string v0, "trimmed exif bytes"

    const/4 v1, 0x6

    .line 407
    invoke-virtual {p0, v0, p1, v1}, Lorg/apache/sanselan/formats/jpeg/JpegImageParser;->getByteArrayTail(Ljava/lang/String;[BI)[B

    move-result-object p1

    return-object p1

    .line 396
    :cond_3
    new-instance p1, Lorg/apache/sanselan/ImageReadException;

    const-string v0, "Sanselan currently can\'t parse EXIF metadata split across multiple APP1 segments.  Please send this image to the Sanselan project."

    invoke-direct {p1, v0}, Lorg/apache/sanselan/ImageReadException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    :goto_0
    return-object v1
.end method

.method public getICCProfileBytes(Lorg/apache/sanselan/common/byteSources/ByteSource;Ljava/util/Map;)[B
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    const/4 p2, 0x1

    .line 278
    new-array v0, p2, [I

    const/4 v1, 0x0

    const v2, 0xffe2

    aput v2, v0, v1

    invoke-virtual {p0, p1, v0, v1}, Lorg/apache/sanselan/formats/jpeg/JpegImageParser;->readSegments(Lorg/apache/sanselan/common/byteSources/ByteSource;[IZ)Ljava/util/ArrayList;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 284
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 285
    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 287
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/apache/sanselan/formats/jpeg/segments/App2Segment;

    .line 288
    iget-object v3, v2, Lorg/apache/sanselan/formats/jpeg/segments/App2Segment;->icc_bytes:[B

    if-eqz v3, :cond_0

    .line 289
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    move-object p1, v0

    :cond_2
    const/4 v0, 0x0

    if-eqz p1, :cond_7

    .line 294
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v1, p2, :cond_3

    goto :goto_2

    .line 297
    :cond_3
    invoke-direct {p0, p1}, Lorg/apache/sanselan/formats/jpeg/JpegImageParser;->assembleSegments(Ljava/util/ArrayList;)[B

    move-result-object p1

    .line 299
    iget-boolean p2, p0, Lorg/apache/sanselan/formats/jpeg/JpegImageParser;->debug:Z

    if-eqz p2, :cond_5

    .line 300
    sget-object p2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "bytes: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez p1, :cond_4

    goto :goto_1

    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length v2, p1

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 303
    :cond_5
    iget-boolean p2, p0, Lorg/apache/sanselan/formats/jpeg/JpegImageParser;->debug:Z

    if-eqz p2, :cond_6

    .line 304
    sget-object p2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v0, ""

    invoke-virtual {p2, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :cond_6
    return-object p1

    :cond_7
    :goto_2
    return-object v0
.end method

.method public getImageInfo(Lorg/apache/sanselan/common/byteSources/ByteSource;Ljava/util/Map;)Lorg/apache/sanselan/ImageInfo;
    .locals 25
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/16 v2, 0xd

    .line 681
    new-array v2, v2, [I

    fill-array-data v2, :array_0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lorg/apache/sanselan/formats/jpeg/JpegImageParser;->readSegments(Lorg/apache/sanselan/common/byteSources/ByteSource;[IZ)Ljava/util/ArrayList;

    move-result-object v2

    if-eqz v2, :cond_c

    const/4 v4, 0x1

    .line 697
    new-array v5, v4, [I

    const v6, 0xffe0

    aput v6, v5, v3

    invoke-virtual {v0, v1, v5, v4}, Lorg/apache/sanselan/formats/jpeg/JpegImageParser;->readSegments(Lorg/apache/sanselan/common/byteSources/ByteSource;[IZ)Ljava/util/ArrayList;

    move-result-object v5

    .line 700
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/apache/sanselan/formats/jpeg/segments/SOFNSegment;

    if-eqz v2, :cond_b

    .line 707
    iget v15, v2, Lorg/apache/sanselan/formats/jpeg/segments/SOFNSegment;->width:I

    .line 708
    iget v12, v2, Lorg/apache/sanselan/formats/jpeg/segments/SOFNSegment;->height:I

    const/4 v6, 0x0

    if-eqz v5, :cond_0

    .line 712
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-lez v7, :cond_0

    .line 713
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lorg/apache/sanselan/formats/jpeg/segments/JFIFSegment;

    :cond_0
    const-wide/high16 v13, -0x4010000000000000L    # -1.0

    if-eqz v6, :cond_1

    .line 727
    iget v1, v6, Lorg/apache/sanselan/formats/jpeg/segments/JFIFSegment;->xDensity:I

    int-to-double v7, v1

    .line 728
    iget v1, v6, Lorg/apache/sanselan/formats/jpeg/segments/JFIFSegment;->yDensity:I

    int-to-double v9, v1

    .line 729
    iget v1, v6, Lorg/apache/sanselan/formats/jpeg/segments/JFIFSegment;->densityUnits:I

    .line 733
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "Jpeg/JFIF v."

    invoke-virtual {v5, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v11, v6, Lorg/apache/sanselan/formats/jpeg/segments/JFIFSegment;->jfifMajorVersion:I

    invoke-virtual {v5, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v11, "."

    invoke-virtual {v5, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v6, v6, Lorg/apache/sanselan/formats/jpeg/segments/JFIFSegment;->jfifMinorVersion:I

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    packed-switch v1, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const-wide v13, 0x400451eb851eb852L    # 2.54

    goto :goto_0

    :pswitch_1
    const-wide/high16 v13, 0x3ff0000000000000L    # 1.0

    :goto_0
    :pswitch_2
    move-object v1, v5

    goto/16 :goto_5

    .line 751
    :cond_1
    invoke-virtual/range {p0 .. p2}, Lorg/apache/sanselan/formats/jpeg/JpegImageParser;->getMetadata(Lorg/apache/sanselan/common/byteSources/ByteSource;Ljava/util/Map;)Lorg/apache/sanselan/common/IImageMetadata;

    move-result-object v1

    check-cast v1, Lorg/apache/sanselan/formats/jpeg/JpegImageMetadata;

    if-eqz v1, :cond_5

    .line 757
    sget-object v5, Lorg/apache/sanselan/formats/jpeg/JpegImageParser;->TIFF_TAG_XRESOLUTION:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    .line 758
    invoke-virtual {v1, v5}, Lorg/apache/sanselan/formats/jpeg/JpegImageMetadata;->findEXIFValue(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;)Lorg/apache/sanselan/formats/tiff/TiffField;

    move-result-object v5

    if-eqz v5, :cond_2

    .line 760
    invoke-virtual {v5}, Lorg/apache/sanselan/formats/tiff/TiffField;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v5

    goto :goto_1

    :cond_2
    move-wide v5, v13

    .line 763
    :goto_1
    sget-object v7, Lorg/apache/sanselan/formats/jpeg/JpegImageParser;->TIFF_TAG_YRESOLUTION:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    .line 764
    invoke-virtual {v1, v7}, Lorg/apache/sanselan/formats/jpeg/JpegImageMetadata;->findEXIFValue(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;)Lorg/apache/sanselan/formats/tiff/TiffField;

    move-result-object v7

    if-eqz v7, :cond_3

    .line 766
    invoke-virtual {v7}, Lorg/apache/sanselan/formats/tiff/TiffField;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v7

    goto :goto_2

    :cond_3
    move-wide v7, v13

    .line 769
    :goto_2
    sget-object v9, Lorg/apache/sanselan/formats/jpeg/JpegImageParser;->TIFF_TAG_RESOLUTION_UNIT:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    .line 770
    invoke-virtual {v1, v9}, Lorg/apache/sanselan/formats/jpeg/JpegImageMetadata;->findEXIFValue(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;)Lorg/apache/sanselan/formats/tiff/TiffField;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 773
    invoke-virtual {v1}, Lorg/apache/sanselan/formats/tiff/TiffField;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    .line 774
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    packed-switch v1, :pswitch_data_1

    goto :goto_3

    :pswitch_3
    move-wide v9, v7

    const-wide v13, 0x400451eb851eb852L    # 2.54

    move-wide v7, v5

    goto :goto_4

    :pswitch_4
    move-wide v9, v7

    const-wide/high16 v13, 0x3ff0000000000000L    # 1.0

    move-wide v7, v5

    goto :goto_4

    :cond_4
    :goto_3
    :pswitch_5
    move-wide v9, v7

    move-wide v7, v5

    goto :goto_4

    :cond_5
    move-wide v7, v13

    move-wide v9, v7

    :goto_4
    const-string v1, "Jpeg/DCM"

    :goto_5
    const-wide/16 v5, 0x0

    cmpl-double v5, v13, v5

    const/high16 v6, -0x40800000    # -1.0f

    const/4 v11, -0x1

    if-lez v5, :cond_6

    div-double v5, v7, v13

    .line 805
    invoke-static {v5, v6}, Ljava/lang/Math;->round(D)J

    move-result-wide v5

    long-to-int v5, v5

    int-to-double v3, v15

    mul-double/2addr v7, v13

    div-double/2addr v3, v7

    double-to-float v3, v3

    mul-double/2addr v9, v13

    .line 808
    invoke-static {v9, v10}, Ljava/lang/Math;->round(D)J

    move-result-wide v6

    long-to-int v4, v6

    int-to-double v6, v12

    div-double/2addr v6, v9

    double-to-float v6, v6

    move/from16 v18, v3

    move v3, v6

    goto :goto_6

    :cond_6
    move v3, v6

    move/from16 v18, v3

    move v4, v11

    move v5, v4

    .line 813
    :goto_6
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 816
    iget v6, v2, Lorg/apache/sanselan/formats/jpeg/segments/SOFNSegment;->numberOfComponents:I

    .line 817
    iget v7, v2, Lorg/apache/sanselan/formats/jpeg/segments/SOFNSegment;->precision:I

    mul-int v8, v6, v7

    .line 820
    sget-object v10, Lorg/apache/sanselan/ImageFormat;->IMAGE_FORMAT_JPEG:Lorg/apache/sanselan/ImageFormat;

    const-string v11, "JPEG (Joint Photographic Experts Group) Format"

    const-string v13, "image/jpeg"

    const/4 v14, 0x1

    .line 826
    iget v2, v2, Lorg/apache/sanselan/formats/jpeg/segments/SOFNSegment;->marker:I

    const v7, 0xffc2

    if-ne v2, v7, :cond_7

    const/16 v20, 0x1

    goto :goto_7

    :cond_7
    const/16 v20, 0x0

    :goto_7
    const/16 v21, 0x0

    const/16 v22, 0x0

    const/4 v2, 0x3

    const/4 v7, 0x1

    if-ne v6, v7, :cond_8

    const/16 v23, 0x0

    goto :goto_8

    :cond_8
    if-ne v6, v2, :cond_9

    const/4 v2, 0x2

    move/from16 v23, v2

    goto :goto_8

    :cond_9
    const/4 v7, 0x4

    if-ne v6, v7, :cond_a

    move/from16 v23, v2

    goto :goto_8

    :cond_a
    const/4 v2, -0x2

    move/from16 v23, v2

    :goto_8
    const-string v24, "JPEG"

    .line 842
    new-instance v2, Lorg/apache/sanselan/ImageInfo;

    move-object v6, v2

    move-object v7, v1

    move v1, v15

    move v15, v4

    move/from16 v16, v3

    move/from16 v17, v5

    move/from16 v19, v1

    invoke-direct/range {v6 .. v24}, Lorg/apache/sanselan/ImageInfo;-><init>(Ljava/lang/String;ILjava/util/ArrayList;Lorg/apache/sanselan/ImageFormat;Ljava/lang/String;ILjava/lang/String;IIFIFIZZZILjava/lang/String;)V

    return-object v2

    .line 705
    :cond_b
    new-instance v1, Lorg/apache/sanselan/ImageReadException;

    const-string v2, "No SOFN Data Found."

    invoke-direct {v1, v2}, Lorg/apache/sanselan/ImageReadException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 691
    :cond_c
    new-instance v1, Lorg/apache/sanselan/ImageReadException;

    const-string v2, "No SOFN Data Found."

    invoke-direct {v1, v2}, Lorg/apache/sanselan/ImageReadException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch

    :array_0
    .array-data 4
        0xffc0
        0xffc1
        0xffc2
        0xffc3
        0xffc5
        0xffc6
        0xffc7
        0xffc9
        0xffca
        0xffcb
        0xffcd
        0xffce
        0xffcf
    .end array-data
.end method

.method public getImageSize(Lorg/apache/sanselan/common/byteSources/ByteSource;Ljava/util/Map;)[I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    const/16 p2, 0xd

    .line 645
    new-array p2, p2, [I

    fill-array-data p2, :array_0

    const/4 v0, 0x1

    invoke-virtual {p0, p1, p2, v0}, Lorg/apache/sanselan/formats/jpeg/JpegImageParser;->readSegments(Lorg/apache/sanselan/common/byteSources/ByteSource;[IZ)Ljava/util/ArrayList;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 655
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-lt p2, v0, :cond_1

    .line 658
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-gt p2, v0, :cond_0

    const/4 p2, 0x0

    .line 661
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/apache/sanselan/formats/jpeg/segments/SOFNSegment;

    const/4 v1, 0x2

    .line 663
    new-array v1, v1, [I

    iget v2, p1, Lorg/apache/sanselan/formats/jpeg/segments/SOFNSegment;->width:I

    aput v2, v1, p2

    iget p1, p1, Lorg/apache/sanselan/formats/jpeg/segments/SOFNSegment;->height:I

    aput p1, v1, v0

    return-object v1

    .line 659
    :cond_0
    new-instance p1, Lorg/apache/sanselan/ImageReadException;

    const-string p2, "Redundant JFIF Data Found."

    invoke-direct {p1, p2}, Lorg/apache/sanselan/ImageReadException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 656
    :cond_1
    new-instance p1, Lorg/apache/sanselan/ImageReadException;

    const-string p2, "No JFIF Data Found."

    invoke-direct {p1, p2}, Lorg/apache/sanselan/ImageReadException;-><init>(Ljava/lang/String;)V

    throw p1

    nop

    :array_0
    .array-data 4
        0xffc0
        0xffc1
        0xffc2
        0xffc3
        0xffc5
        0xffc6
        0xffc7
        0xffc9
        0xffca
        0xffcb
        0xffcd
        0xffce
        0xffcf
    .end array-data
.end method

.method public getMetadata(Lorg/apache/sanselan/common/byteSources/ByteSource;Ljava/util/Map;)Lorg/apache/sanselan/common/IImageMetadata;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 312
    invoke-virtual {p0, p1, p2}, Lorg/apache/sanselan/formats/jpeg/JpegImageParser;->getExifMetadata(Lorg/apache/sanselan/common/byteSources/ByteSource;Ljava/util/Map;)Lorg/apache/sanselan/formats/tiff/TiffImageMetadata;

    move-result-object p1

    const/4 p2, 0x0

    if-nez p1, :cond_0

    return-object p2

    .line 320
    :cond_0
    new-instance v0, Lorg/apache/sanselan/formats/jpeg/JpegImageMetadata;

    invoke-direct {v0, p2, p1}, Lorg/apache/sanselan/formats/jpeg/JpegImageMetadata;-><init>(Ljava/lang/Object;Lorg/apache/sanselan/formats/tiff/TiffImageMetadata;)V

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    const-string v0, "Jpeg-Custom"

    return-object v0
.end method

.method public getPhotoshopMetadata(Lorg/apache/sanselan/common/byteSources/ByteSource;Ljava/util/Map;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    const/4 p1, 0x0

    return-object p1
.end method

.method public getXmpXml(Lorg/apache/sanselan/common/byteSources/ByteSource;Ljava/util/Map;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    const/4 p1, 0x0

    return-object p1
.end method

.method public hasExifSegment(Lorg/apache/sanselan/common/byteSources/ByteSource;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    .line 413
    new-array v0, v0, [Z

    const/4 v1, 0x0

    aput-boolean v1, v0, v1

    .line 415
    new-instance v2, Lorg/apache/sanselan/formats/jpeg/JpegImageParser$2;

    invoke-direct {v2, p0, v0}, Lorg/apache/sanselan/formats/jpeg/JpegImageParser$2;-><init>(Lorg/apache/sanselan/formats/jpeg/JpegImageParser;[Z)V

    .line 452
    new-instance v3, Lorg/apache/sanselan/formats/jpeg/JpegUtils;

    invoke-direct {v3}, Lorg/apache/sanselan/formats/jpeg/JpegUtils;-><init>()V

    invoke-virtual {v3, p1, v2}, Lorg/apache/sanselan/formats/jpeg/JpegUtils;->traverseJFIF(Lorg/apache/sanselan/common/byteSources/ByteSource;Lorg/apache/sanselan/formats/jpeg/JpegUtils$Visitor;)V

    .line 454
    aget-boolean p1, v0, v1

    return p1
.end method

.method public hasIptcSegment(Lorg/apache/sanselan/common/byteSources/ByteSource;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    const/4 p1, 0x1

    .line 460
    new-array p1, p1, [Z

    const/4 v0, 0x0

    aput-boolean v0, p1, v0

    .line 501
    aget-boolean p1, p1, v0

    return p1
.end method

.method public hasXmpSegment(Lorg/apache/sanselan/common/byteSources/ByteSource;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    const/4 p1, 0x1

    .line 507
    new-array p1, p1, [Z

    const/4 v0, 0x0

    aput-boolean v0, p1, v0

    .line 547
    aget-boolean p1, p1, v0

    return p1
.end method

.method public readSegments(Lorg/apache/sanselan/common/byteSources/ByteSource;[IZ)Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 272
    invoke-virtual {p0, p1, p2, p3, v0}, Lorg/apache/sanselan/formats/jpeg/JpegImageParser;->readSegments(Lorg/apache/sanselan/common/byteSources/ByteSource;[IZZ)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1
.end method

.method public readSegments(Lorg/apache/sanselan/common/byteSources/ByteSource;[IZZ)Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 113
    new-instance p4, Ljava/util/ArrayList;

    invoke-direct {p4}, Ljava/util/ArrayList;-><init>()V

    .line 116
    new-instance v0, Lorg/apache/sanselan/formats/jpeg/JpegImageParser$1;

    invoke-direct {v0, p0, p2, p4, p3}, Lorg/apache/sanselan/formats/jpeg/JpegImageParser$1;-><init>(Lorg/apache/sanselan/formats/jpeg/JpegImageParser;[ILjava/util/ArrayList;Z)V

    .line 175
    new-instance p2, Lorg/apache/sanselan/formats/jpeg/JpegUtils;

    invoke-direct {p2}, Lorg/apache/sanselan/formats/jpeg/JpegUtils;-><init>()V

    invoke-virtual {p2, p1, v0}, Lorg/apache/sanselan/formats/jpeg/JpegUtils;->traverseJFIF(Lorg/apache/sanselan/common/byteSources/ByteSource;Lorg/apache/sanselan/formats/jpeg/JpegUtils$Visitor;)V

    return-object p4
.end method
