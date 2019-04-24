.class public Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless;
.super Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterBase;
.source "TiffImageWriterLossless.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless$BufferOutputStream;
    }
.end annotation


# static fields
.field private static final ELEMENT_SIZE_COMPARATOR:Ljava/util/Comparator;

.field private static final ITEM_SIZE_COMPARATOR:Ljava/util/Comparator;


# instance fields
.field private final exifBytes:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 250
    new-instance v0, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless$1;

    invoke-direct {v0}, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless$1;-><init>()V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless;->ELEMENT_SIZE_COMPARATOR:Ljava/util/Comparator;

    .line 260
    new-instance v0, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless$2;

    invoke-direct {v0}, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless$2;-><init>()V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless;->ITEM_SIZE_COMPARATOR:Ljava/util/Comparator;

    return-void
.end method

.method public constructor <init>(I[B)V
    .locals 0

    .line 54
    invoke-direct {p0, p1}, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterBase;-><init>(I)V

    .line 55
    iput-object p2, p0, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless;->exifBytes:[B

    return-void
.end method

.method public constructor <init>([B)V
    .locals 0

    .line 48
    invoke-direct {p0}, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterBase;-><init>()V

    .line 49
    iput-object p1, p0, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless;->exifBytes:[B

    return-void
.end method

.method private analyzeOldTiff()Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageWriteException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 126
    :try_start_0
    new-instance v0, Lorg/apache/sanselan/common/byteSources/ByteSourceArray;

    iget-object v1, p0, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless;->exifBytes:[B

    invoke-direct {v0, v1}, Lorg/apache/sanselan/common/byteSources/ByteSourceArray;-><init>([B)V

    .line 128
    invoke-static {}, Lorg/apache/sanselan/FormatCompliance;->getDefault()Lorg/apache/sanselan/FormatCompliance;

    move-result-object v1

    .line 129
    new-instance v2, Lorg/apache/sanselan/formats/tiff/TiffReader;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Lorg/apache/sanselan/formats/tiff/TiffReader;-><init>(Z)V

    const/4 v4, 0x0

    invoke-virtual {v2, v0, v4, v1}, Lorg/apache/sanselan/formats/tiff/TiffReader;->readContents(Lorg/apache/sanselan/common/byteSources/ByteSource;Ljava/util/Map;Lorg/apache/sanselan/FormatCompliance;)Lorg/apache/sanselan/formats/tiff/TiffContents;

    move-result-object v0

    .line 132
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 135
    iget-object v0, v0, Lorg/apache/sanselan/formats/tiff/TiffContents;->directories:Ljava/util/ArrayList;

    move v2, v3

    .line 136
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v5

    if-ge v2, v5, :cond_3

    .line 138
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lorg/apache/sanselan/formats/tiff/TiffDirectory;

    .line 139
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 141
    invoke-virtual {v5}, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->getDirectoryEntrys()Ljava/util/ArrayList;

    move-result-object v6

    move v7, v3

    .line 142
    :goto_1
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v8

    if-ge v7, v8, :cond_1

    .line 144
    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lorg/apache/sanselan/formats/tiff/TiffField;

    .line 145
    invoke-virtual {v8}, Lorg/apache/sanselan/formats/tiff/TiffField;->getOversizeValueElement()Lorg/apache/sanselan/formats/tiff/TiffElement;

    move-result-object v8

    if-eqz v8, :cond_0

    .line 147
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 151
    :cond_1
    invoke-virtual {v5}, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->getJpegImageData()Lorg/apache/sanselan/formats/tiff/JpegImageData;

    move-result-object v5

    if-eqz v5, :cond_2

    .line 153
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 165
    :cond_3
    sget-object v0, Lorg/apache/sanselan/formats/tiff/TiffElement;->COMPARATOR:Ljava/util/Comparator;

    invoke-static {v1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 169
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, -0x1

    .line 175
    :goto_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ge v3, v5, :cond_6

    .line 177
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lorg/apache/sanselan/formats/tiff/TiffElement;

    .line 178
    iget v6, v5, Lorg/apache/sanselan/formats/tiff/TiffElement;->offset:I

    iget v7, v5, Lorg/apache/sanselan/formats/tiff/TiffElement;->length:I

    add-int/2addr v6, v7

    if-nez v4, :cond_4

    goto :goto_3

    .line 184
    :cond_4
    iget v7, v5, Lorg/apache/sanselan/formats/tiff/TiffElement;->offset:I

    sub-int/2addr v7, v2

    const/4 v8, 0x3

    if-le v7, v8, :cond_5

    .line 186
    new-instance v7, Lorg/apache/sanselan/formats/tiff/TiffElement$Stub;

    iget v8, v4, Lorg/apache/sanselan/formats/tiff/TiffElement;->offset:I

    iget v4, v4, Lorg/apache/sanselan/formats/tiff/TiffElement;->offset:I

    sub-int/2addr v2, v4

    invoke-direct {v7, v8, v2}, Lorg/apache/sanselan/formats/tiff/TiffElement$Stub;-><init>(II)V

    invoke-interface {v0, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_3
    move-object v4, v5

    :cond_5
    add-int/lit8 v3, v3, 0x1

    move v2, v6

    goto :goto_2

    :cond_6
    if-eqz v4, :cond_7

    .line 197
    new-instance v1, Lorg/apache/sanselan/formats/tiff/TiffElement$Stub;

    iget v3, v4, Lorg/apache/sanselan/formats/tiff/TiffElement;->offset:I

    iget v4, v4, Lorg/apache/sanselan/formats/tiff/TiffElement;->offset:I

    sub-int/2addr v2, v4

    invoke-direct {v1, v3, v2}, Lorg/apache/sanselan/formats/tiff/TiffElement$Stub;-><init>(II)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/apache/sanselan/ImageReadException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_7
    return-object v0

    :catch_0
    move-exception v0

    .line 207
    new-instance v1, Lorg/apache/sanselan/ImageWriteException;

    invoke-virtual {v0}, Lorg/apache/sanselan/ImageReadException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lorg/apache/sanselan/ImageWriteException;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v1
.end method

.method private dumpElements(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 74
    new-instance v0, Lorg/apache/sanselan/common/byteSources/ByteSourceArray;

    iget-object v1, p0, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless;->exifBytes:[B

    invoke-direct {v0, v1}, Lorg/apache/sanselan/common/byteSources/ByteSourceArray;-><init>([B)V

    .line 76
    invoke-direct {p0, v0, p1}, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless;->dumpElements(Lorg/apache/sanselan/common/byteSources/ByteSource;Ljava/util/List;)V

    return-void
.end method

.method private dumpElements(Lorg/apache/sanselan/common/byteSources/ByteSource;Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, 0x8

    const/4 v1, 0x0

    .line 88
    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_3

    .line 90
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/apache/sanselan/formats/tiff/TiffElement;

    .line 91
    iget v3, v2, Lorg/apache/sanselan/formats/tiff/TiffElement;->offset:I

    if-le v3, v0, :cond_1

    .line 94
    iget v3, v2, Lorg/apache/sanselan/formats/tiff/TiffElement;->offset:I

    sub-int/2addr v3, v0

    .line 95
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "gap of "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, " bytes."

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lorg/apache/sanselan/util/Debug;->debug(Ljava/lang/String;)V

    .line 96
    invoke-virtual {p1, v0, v3}, Lorg/apache/sanselan/common/byteSources/ByteSource;->getBlock(II)[B

    move-result-object v0

    .line 97
    array-length v3, v0

    const/16 v4, 0x40

    if-le v3, v4, :cond_0

    const-string v3, "\thead"

    const/16 v4, 0x20

    .line 99
    invoke-static {v0, v4}, Lorg/apache/sanselan/common/BinaryFileFunctions;->head([BI)[B

    move-result-object v5

    invoke-static {v3, v5}, Lorg/apache/sanselan/util/Debug;->debug(Ljava/lang/String;[B)V

    const-string v3, "\ttail"

    .line 101
    invoke-static {v0, v4}, Lorg/apache/sanselan/common/BinaryFileFunctions;->tail([BI)[B

    move-result-object v0

    invoke-static {v3, v0}, Lorg/apache/sanselan/util/Debug;->debug(Ljava/lang/String;[B)V

    goto :goto_1

    :cond_0
    const-string v3, "\tbytes"

    .line 105
    invoke-static {v3, v0}, Lorg/apache/sanselan/util/Debug;->debug(Ljava/lang/String;[B)V

    .line 108
    :cond_1
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "element["

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "]:"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lorg/apache/sanselan/formats/tiff/TiffElement;->getElementDescription()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " ("

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, v2, Lorg/apache/sanselan/formats/tiff/TiffElement;->offset:I

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " + "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, v2, Lorg/apache/sanselan/formats/tiff/TiffElement;->length:I

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " = "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, v2, Lorg/apache/sanselan/formats/tiff/TiffElement;->offset:I

    iget v4, v2, Lorg/apache/sanselan/formats/tiff/TiffElement;->length:I

    add-int/2addr v3, v4

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ")"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lorg/apache/sanselan/util/Debug;->debug(Ljava/lang/String;)V

    .line 111
    instance-of v0, v2, Lorg/apache/sanselan/formats/tiff/TiffDirectory;

    if-eqz v0, :cond_2

    .line 113
    move-object v0, v2

    check-cast v0, Lorg/apache/sanselan/formats/tiff/TiffDirectory;

    .line 114
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "\tnext Directory Offset: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, v0, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->nextDirectoryOffset:I

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lorg/apache/sanselan/util/Debug;->debug(Ljava/lang/String;)V

    .line 117
    :cond_2
    iget v0, v2, Lorg/apache/sanselan/formats/tiff/TiffElement;->offset:I

    iget v2, v2, Lorg/apache/sanselan/formats/tiff/TiffElement;->length:I

    add-int/2addr v0, v2

    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    .line 119
    :cond_3
    invoke-static {}, Lorg/apache/sanselan/util/Debug;->debug()V

    return-void
.end method

.method private updateOffsetsStep(Ljava/util/List;Ljava/util/List;)I
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/apache/sanselan/ImageWriteException;
        }
    .end annotation

    .line 274
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless;->exifBytes:[B

    array-length v0, v0

    .line 277
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 280
    sget-object p1, Lorg/apache/sanselan/formats/tiff/TiffElement;->COMPARATOR:Ljava/util/Comparator;

    invoke-static {v1, p1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 281
    invoke-static {v1}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 283
    :goto_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result p1

    const/4 v2, 0x0

    if-lez p1, :cond_0

    .line 285
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/apache/sanselan/formats/tiff/TiffElement;

    .line 286
    iget v3, p1, Lorg/apache/sanselan/formats/tiff/TiffElement;->offset:I

    iget v4, p1, Lorg/apache/sanselan/formats/tiff/TiffElement;->length:I

    add-int/2addr v3, v4

    if-ne v3, v0, :cond_0

    .line 290
    iget p1, p1, Lorg/apache/sanselan/formats/tiff/TiffElement;->length:I

    sub-int/2addr v0, p1

    .line 291
    invoke-interface {v1, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    goto :goto_0

    .line 297
    :cond_0
    sget-object p1, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless;->ELEMENT_SIZE_COMPARATOR:Ljava/util/Comparator;

    invoke-static {v1, p1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 298
    invoke-static {v1}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 304
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 305
    sget-object p2, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless;->ITEM_SIZE_COMPARATOR:Ljava/util/Comparator;

    invoke-static {p1, p2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 306
    invoke-static {p1}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 308
    :cond_1
    :goto_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p2

    if-lez p2, :cond_4

    .line 312
    invoke-interface {p1, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;

    .line 313
    invoke-virtual {p2}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;->getItemLength()I

    move-result v3

    const/4 v4, 0x0

    move-object v5, v4

    move v4, v2

    .line 320
    :goto_2
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v6

    if-ge v4, v6, :cond_2

    .line 322
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lorg/apache/sanselan/formats/tiff/TiffElement;

    .line 323
    iget v7, v6, Lorg/apache/sanselan/formats/tiff/TiffElement;->length:I

    if-lt v7, v3, :cond_2

    add-int/lit8 v4, v4, 0x1

    move-object v5, v6

    goto :goto_2

    :cond_2
    if-nez v5, :cond_3

    .line 331
    invoke-virtual {p2, v0}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;->setOffset(I)V

    add-int/2addr v0, v3

    goto :goto_1

    .line 336
    :cond_3
    iget v4, v5, Lorg/apache/sanselan/formats/tiff/TiffElement;->offset:I

    invoke-virtual {p2, v4}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;->setOffset(I)V

    .line 337
    invoke-interface {v1, v5}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 339
    iget p2, v5, Lorg/apache/sanselan/formats/tiff/TiffElement;->length:I

    if-le p2, v3, :cond_1

    .line 342
    iget p2, v5, Lorg/apache/sanselan/formats/tiff/TiffElement;->offset:I

    add-int/2addr p2, v3

    .line 343
    iget v4, v5, Lorg/apache/sanselan/formats/tiff/TiffElement;->length:I

    sub-int/2addr v4, v3

    .line 344
    new-instance v3, Lorg/apache/sanselan/formats/tiff/TiffElement$Stub;

    invoke-direct {v3, p2, v4}, Lorg/apache/sanselan/formats/tiff/TiffElement$Stub;-><init>(II)V

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 347
    sget-object p2, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless;->ELEMENT_SIZE_COMPARATOR:Ljava/util/Comparator;

    invoke-static {v1, p2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 348
    invoke-static {v1}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    goto :goto_1

    :cond_4
    return v0
.end method

.method private writeStep(Ljava/io/OutputStream;Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;Ljava/util/List;Ljava/util/List;I)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/apache/sanselan/ImageWriteException;
        }
    .end annotation

    .line 405
    invoke-virtual {p2}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->getRootDirectory()Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;

    move-result-object p2

    .line 407
    new-array p5, p5, [B

    .line 410
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless;->exifBytes:[B

    array-length v1, v0

    array-length v2, p5

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    const/4 v2, 0x0

    invoke-static {v0, v2, p5, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 417
    new-instance v0, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless$BufferOutputStream;

    invoke-direct {v0, p5, v2}, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless$BufferOutputStream;-><init>([BI)V

    .line 418
    new-instance v1, Lorg/apache/sanselan/common/BinaryOutputStream;

    iget v3, p0, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless;->byteOrder:I

    invoke-direct {v1, v0, v3}, Lorg/apache/sanselan/common/BinaryOutputStream;-><init>(Ljava/io/OutputStream;I)V

    .line 419
    invoke-virtual {p2}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->getOffset()I

    move-result p2

    invoke-virtual {p0, v1, p2}, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless;->writeImageFileHeader(Lorg/apache/sanselan/common/BinaryOutputStream;I)V

    move p2, v2

    .line 423
    :goto_0
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v0

    if-ge p2, v0, :cond_2

    .line 425
    invoke-interface {p3, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/sanselan/formats/tiff/TiffElement;

    move v1, v2

    .line 426
    :goto_1
    iget v3, v0, Lorg/apache/sanselan/formats/tiff/TiffElement;->length:I

    if-ge v1, v3, :cond_1

    .line 428
    iget v3, v0, Lorg/apache/sanselan/formats/tiff/TiffElement;->offset:I

    add-int/2addr v3, v1

    .line 429
    array-length v4, p5

    if-ge v3, v4, :cond_0

    .line 430
    aput-byte v2, p5, v3

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 435
    :cond_2
    :goto_2
    invoke-interface {p4}, Ljava/util/List;->size()I

    move-result p2

    if-ge v2, p2, :cond_3

    .line 437
    invoke-interface {p4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;

    .line 439
    new-instance p3, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless$BufferOutputStream;

    .line 440
    invoke-virtual {p2}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;->getOffset()I

    move-result v0

    invoke-direct {p3, p5, v0}, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless$BufferOutputStream;-><init>([BI)V

    .line 441
    new-instance v0, Lorg/apache/sanselan/common/BinaryOutputStream;

    iget v1, p0, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless;->byteOrder:I

    invoke-direct {v0, p3, v1}, Lorg/apache/sanselan/common/BinaryOutputStream;-><init>(Ljava/io/OutputStream;I)V

    .line 442
    invoke-virtual {p2, v0}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;->writeItem(Lorg/apache/sanselan/common/BinaryOutputStream;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 445
    :cond_3
    invoke-virtual {p1, p5}, Ljava/io/OutputStream;->write([B)V

    return-void
.end method


# virtual methods
.method public write(Ljava/io/OutputStream;Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/apache/sanselan/ImageWriteException;
        }
    .end annotation

    .line 214
    invoke-direct {p0}, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless;->analyzeOldTiff()Ljava/util/List;

    move-result-object v3

    .line 215
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless;->exifBytes:[B

    array-length v0, v0

    .line 216
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    if-lt v1, v2, :cond_1

    .line 218
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v1

    if-ne v1, v2, :cond_0

    const/4 v1, 0x0

    .line 220
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/apache/sanselan/formats/tiff/TiffElement;

    .line 222
    iget v2, v1, Lorg/apache/sanselan/formats/tiff/TiffElement;->offset:I

    const/16 v4, 0x8

    if-ne v2, v4, :cond_0

    iget v2, v1, Lorg/apache/sanselan/formats/tiff/TiffElement;->offset:I

    iget v1, v1, Lorg/apache/sanselan/formats/tiff/TiffElement;->length:I

    add-int/2addr v2, v1

    add-int/2addr v2, v4

    if-ne v2, v0, :cond_0

    .line 227
    new-instance v0, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossy;

    iget v1, p0, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless;->byteOrder:I

    invoke-direct {v0, v1}, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossy;-><init>(I)V

    invoke-virtual {v0, p1, p2}, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossy;->write(Ljava/io/OutputStream;Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;)V

    return-void

    .line 237
    :cond_0
    invoke-virtual {p0, p2}, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless;->validateDirectories(Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;)Lorg/apache/sanselan/formats/tiff/write/TiffOutputSummary;

    move-result-object v0

    .line 239
    invoke-virtual {p2, v0}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->getOutputItems(Lorg/apache/sanselan/formats/tiff/write/TiffOutputSummary;)Ljava/util/List;

    move-result-object v4

    .line 241
    invoke-direct {p0, v3, v4}, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless;->updateOffsetsStep(Ljava/util/List;Ljava/util/List;)I

    move-result v5

    .line 244
    iget v1, p0, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless;->byteOrder:I

    invoke-virtual {v0, v1}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSummary;->updateOffsets(I)V

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    .line 246
    invoke-direct/range {v0 .. v5}, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless;->writeStep(Ljava/io/OutputStream;Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;Ljava/util/List;Ljava/util/List;I)V

    return-void

    .line 217
    :cond_1
    new-instance p1, Lorg/apache/sanselan/ImageWriteException;

    const-string p2, "Couldn\'t analyze old tiff data."

    invoke-direct {p1, p2}, Lorg/apache/sanselan/ImageWriteException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
