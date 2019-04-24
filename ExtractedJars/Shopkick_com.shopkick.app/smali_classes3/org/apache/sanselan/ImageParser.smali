.class public abstract Lorg/apache/sanselan/ImageParser;
.super Lorg/apache/sanselan/common/BinaryFileParser;
.source "ImageParser.java"

# interfaces
.implements Lorg/apache/sanselan/SanselanConstants;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 41
    invoke-direct {p0}, Lorg/apache/sanselan/common/BinaryFileParser;-><init>()V

    return-void
.end method

.method public static final getAllImageParsers()[Lorg/apache/sanselan/ImageParser;
    .locals 3

    const/4 v0, 0x2

    .line 47
    new-array v0, v0, [Lorg/apache/sanselan/ImageParser;

    new-instance v1, Lorg/apache/sanselan/formats/jpeg/JpegImageParser;

    invoke-direct {v1}, Lorg/apache/sanselan/formats/jpeg/JpegImageParser;-><init>()V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    new-instance v1, Lorg/apache/sanselan/formats/tiff/TiffImageParser;

    invoke-direct {v1}, Lorg/apache/sanselan/formats/tiff/TiffImageParser;-><init>()V

    const/4 v2, 0x1

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static final isStrict(Ljava/util/Map;)Z
    .locals 1

    if-eqz p0, :cond_1

    const-string v0, "STRICT"

    .line 410
    invoke-interface {p0, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "STRICT"

    .line 412
    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method protected final canAcceptExtension(Ljava/io/File;)Z
    .locals 0

    .line 372
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/apache/sanselan/ImageParser;->canAcceptExtension(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method protected final canAcceptExtension(Ljava/lang/String;)Z
    .locals 5

    .line 377
    invoke-virtual {p0}, Lorg/apache/sanselan/ImageParser;->getAcceptedExtensions()[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    const/16 v2, 0x2e

    .line 381
    invoke-virtual {p1, v2}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v2

    const/4 v3, 0x0

    if-ltz v2, :cond_2

    .line 384
    invoke-virtual {p1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    .line 385
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    move v2, v3

    .line 387
    :goto_0
    array-length v4, v0

    if-ge v2, v4, :cond_2

    .line 388
    aget-object v4, v0, v2

    invoke-virtual {v4}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    return v1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return v3
.end method

.method public canAcceptType(Lorg/apache/sanselan/ImageFormat;)Z
    .locals 4

    .line 362
    invoke-virtual {p0}, Lorg/apache/sanselan/ImageParser;->getAcceptedTypes()[Lorg/apache/sanselan/ImageFormat;

    move-result-object v0

    const/4 v1, 0x0

    move v2, v1

    .line 364
    :goto_0
    array-length v3, v0

    if-ge v2, v3, :cond_1

    .line 365
    aget-object v3, v0, v2

    invoke-virtual {v3, p1}, Lorg/apache/sanselan/ImageFormat;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public final dumpImageFile(Ljava/io/File;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 322
    invoke-virtual {p0, p1}, Lorg/apache/sanselan/ImageParser;->canAcceptExtension(Ljava/io/File;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 325
    :cond_0
    iget-boolean v0, p0, Lorg/apache/sanselan/ImageParser;->debug:Z

    if-eqz v0, :cond_1

    .line 326
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lorg/apache/sanselan/ImageParser;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ": "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 328
    :cond_1
    new-instance v0, Lorg/apache/sanselan/common/byteSources/ByteSourceFile;

    invoke-direct {v0, p1}, Lorg/apache/sanselan/common/byteSources/ByteSourceFile;-><init>(Ljava/io/File;)V

    invoke-virtual {p0, v0}, Lorg/apache/sanselan/ImageParser;->dumpImageFile(Lorg/apache/sanselan/common/byteSources/ByteSource;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final dumpImageFile(Lorg/apache/sanselan/common/byteSources/ByteSource;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 334
    new-instance v0, Ljava/io/StringWriter;

    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    .line 335
    new-instance v1, Ljava/io/PrintWriter;

    invoke-direct {v1, v0}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 337
    invoke-virtual {p0, v1, p1}, Lorg/apache/sanselan/ImageParser;->dumpImageFile(Ljava/io/PrintWriter;Lorg/apache/sanselan/common/byteSources/ByteSource;)Z

    .line 339
    invoke-virtual {v1}, Ljava/io/PrintWriter;->flush()V

    .line 341
    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final dumpImageFile([B)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 316
    new-instance v0, Lorg/apache/sanselan/common/byteSources/ByteSourceArray;

    invoke-direct {v0, p1}, Lorg/apache/sanselan/common/byteSources/ByteSourceArray;-><init>([B)V

    invoke-virtual {p0, v0}, Lorg/apache/sanselan/ImageParser;->dumpImageFile(Lorg/apache/sanselan/common/byteSources/ByteSource;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public dumpImageFile(Ljava/io/PrintWriter;Lorg/apache/sanselan/common/byteSources/ByteSource;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    const/4 p1, 0x0

    return p1
.end method

.method public abstract embedICCProfile(Ljava/io/File;Ljava/io/File;[B)Z
.end method

.method protected abstract getAcceptedExtensions()[Ljava/lang/String;
.end method

.method protected abstract getAcceptedTypes()[Lorg/apache/sanselan/ImageFormat;
.end method

.method public abstract getDefaultExtension()Ljava/lang/String;
.end method

.method public final getFormatCompliance(Ljava/io/File;)Lorg/apache/sanselan/FormatCompliance;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 138
    invoke-virtual {p0, p1}, Lorg/apache/sanselan/ImageParser;->canAcceptExtension(Ljava/io/File;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 141
    :cond_0
    new-instance v0, Lorg/apache/sanselan/common/byteSources/ByteSourceFile;

    invoke-direct {v0, p1}, Lorg/apache/sanselan/common/byteSources/ByteSourceFile;-><init>(Ljava/io/File;)V

    invoke-virtual {p0, v0}, Lorg/apache/sanselan/ImageParser;->getFormatCompliance(Lorg/apache/sanselan/common/byteSources/ByteSource;)Lorg/apache/sanselan/FormatCompliance;

    move-result-object p1

    return-object p1
.end method

.method public getFormatCompliance(Lorg/apache/sanselan/common/byteSources/ByteSource;)Lorg/apache/sanselan/FormatCompliance;
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

.method public final getFormatCompliance([B)Lorg/apache/sanselan/FormatCompliance;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 132
    new-instance v0, Lorg/apache/sanselan/common/byteSources/ByteSourceArray;

    invoke-direct {v0, p1}, Lorg/apache/sanselan/common/byteSources/ByteSourceArray;-><init>([B)V

    invoke-virtual {p0, v0}, Lorg/apache/sanselan/ImageParser;->getFormatCompliance(Lorg/apache/sanselan/common/byteSources/ByteSource;)Lorg/apache/sanselan/FormatCompliance;

    move-result-object p1

    return-object p1
.end method

.method public final getICCProfileBytes(Ljava/io/File;)[B
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 295
    invoke-virtual {p0, p1, v0}, Lorg/apache/sanselan/ImageParser;->getICCProfileBytes(Ljava/io/File;Ljava/util/Map;)[B

    move-result-object p1

    return-object p1
.end method

.method public final getICCProfileBytes(Ljava/io/File;Ljava/util/Map;)[B
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 301
    invoke-virtual {p0, p1}, Lorg/apache/sanselan/ImageParser;->canAcceptExtension(Ljava/io/File;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 304
    :cond_0
    iget-boolean v0, p0, Lorg/apache/sanselan/ImageParser;->debug:Z

    if-eqz v0, :cond_1

    .line 305
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lorg/apache/sanselan/ImageParser;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ": "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 307
    :cond_1
    new-instance v0, Lorg/apache/sanselan/common/byteSources/ByteSourceFile;

    invoke-direct {v0, p1}, Lorg/apache/sanselan/common/byteSources/ByteSourceFile;-><init>(Ljava/io/File;)V

    invoke-virtual {p0, v0, p2}, Lorg/apache/sanselan/ImageParser;->getICCProfileBytes(Lorg/apache/sanselan/common/byteSources/ByteSource;Ljava/util/Map;)[B

    move-result-object p1

    return-object p1
.end method

.method public abstract getICCProfileBytes(Lorg/apache/sanselan/common/byteSources/ByteSource;Ljava/util/Map;)[B
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public final getICCProfileBytes([B)[B
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 283
    invoke-virtual {p0, p1, v0}, Lorg/apache/sanselan/ImageParser;->getICCProfileBytes([BLjava/util/Map;)[B

    move-result-object p1

    return-object p1
.end method

.method public final getICCProfileBytes([BLjava/util/Map;)[B
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 289
    new-instance v0, Lorg/apache/sanselan/common/byteSources/ByteSourceArray;

    invoke-direct {v0, p1}, Lorg/apache/sanselan/common/byteSources/ByteSourceArray;-><init>([B)V

    invoke-virtual {p0, v0, p2}, Lorg/apache/sanselan/ImageParser;->getICCProfileBytes(Lorg/apache/sanselan/common/byteSources/ByteSource;Ljava/util/Map;)[B

    move-result-object p1

    return-object p1
.end method

.method public final getImageInfo(Ljava/io/File;Ljava/util/Map;)Lorg/apache/sanselan/ImageInfo;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 117
    invoke-virtual {p0, p1}, Lorg/apache/sanselan/ImageParser;->canAcceptExtension(Ljava/io/File;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 120
    :cond_0
    new-instance v0, Lorg/apache/sanselan/common/byteSources/ByteSourceFile;

    invoke-direct {v0, p1}, Lorg/apache/sanselan/common/byteSources/ByteSourceFile;-><init>(Ljava/io/File;)V

    invoke-virtual {p0, v0, p2}, Lorg/apache/sanselan/ImageParser;->getImageInfo(Lorg/apache/sanselan/common/byteSources/ByteSource;Ljava/util/Map;)Lorg/apache/sanselan/ImageInfo;

    move-result-object p1

    return-object p1
.end method

.method public final getImageInfo(Lorg/apache/sanselan/common/byteSources/ByteSource;)Lorg/apache/sanselan/ImageInfo;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 105
    invoke-virtual {p0, p1, v0}, Lorg/apache/sanselan/ImageParser;->getImageInfo(Lorg/apache/sanselan/common/byteSources/ByteSource;Ljava/util/Map;)Lorg/apache/sanselan/ImageInfo;

    move-result-object p1

    return-object p1
.end method

.method public abstract getImageInfo(Lorg/apache/sanselan/common/byteSources/ByteSource;Ljava/util/Map;)Lorg/apache/sanselan/ImageInfo;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public final getImageInfo([BLjava/util/Map;)Lorg/apache/sanselan/ImageInfo;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 111
    new-instance v0, Lorg/apache/sanselan/common/byteSources/ByteSourceArray;

    invoke-direct {v0, p1}, Lorg/apache/sanselan/common/byteSources/ByteSourceArray;-><init>([B)V

    invoke-virtual {p0, v0, p2}, Lorg/apache/sanselan/ImageParser;->getImageInfo(Lorg/apache/sanselan/common/byteSources/ByteSource;Ljava/util/Map;)Lorg/apache/sanselan/ImageInfo;

    move-result-object p1

    return-object p1
.end method

.method public final getMetadata(Ljava/io/File;)Lorg/apache/sanselan/common/IImageMetadata;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 83
    invoke-virtual {p0, p1, v0}, Lorg/apache/sanselan/ImageParser;->getMetadata(Ljava/io/File;Ljava/util/Map;)Lorg/apache/sanselan/common/IImageMetadata;

    move-result-object p1

    return-object p1
.end method

.method public final getMetadata(Ljava/io/File;Ljava/util/Map;)Lorg/apache/sanselan/common/IImageMetadata;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 89
    iget-boolean v0, p0, Lorg/apache/sanselan/ImageParser;->debug:Z

    if-eqz v0, :cond_0

    .line 90
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lorg/apache/sanselan/ImageParser;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ".getMetadata"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ": "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 90
    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 93
    :cond_0
    invoke-virtual {p0, p1}, Lorg/apache/sanselan/ImageParser;->canAcceptExtension(Ljava/io/File;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return-object p1

    .line 96
    :cond_1
    new-instance v0, Lorg/apache/sanselan/common/byteSources/ByteSourceFile;

    invoke-direct {v0, p1}, Lorg/apache/sanselan/common/byteSources/ByteSourceFile;-><init>(Ljava/io/File;)V

    invoke-virtual {p0, v0, p2}, Lorg/apache/sanselan/ImageParser;->getMetadata(Lorg/apache/sanselan/common/byteSources/ByteSource;Ljava/util/Map;)Lorg/apache/sanselan/common/IImageMetadata;

    move-result-object p1

    return-object p1
.end method

.method public final getMetadata(Lorg/apache/sanselan/common/byteSources/ByteSource;)Lorg/apache/sanselan/common/IImageMetadata;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 62
    invoke-virtual {p0, p1, v0}, Lorg/apache/sanselan/ImageParser;->getMetadata(Lorg/apache/sanselan/common/byteSources/ByteSource;Ljava/util/Map;)Lorg/apache/sanselan/common/IImageMetadata;

    move-result-object p1

    return-object p1
.end method

.method public abstract getMetadata(Lorg/apache/sanselan/common/byteSources/ByteSource;Ljava/util/Map;)Lorg/apache/sanselan/common/IImageMetadata;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public final getMetadata([B)Lorg/apache/sanselan/common/IImageMetadata;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 71
    invoke-virtual {p0, p1}, Lorg/apache/sanselan/ImageParser;->getMetadata([B)Lorg/apache/sanselan/common/IImageMetadata;

    move-result-object p1

    return-object p1
.end method

.method public final getMetadata([BLjava/util/Map;)Lorg/apache/sanselan/common/IImageMetadata;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 77
    new-instance v0, Lorg/apache/sanselan/common/byteSources/ByteSourceArray;

    invoke-direct {v0, p1}, Lorg/apache/sanselan/common/byteSources/ByteSourceArray;-><init>([B)V

    invoke-virtual {p0, v0, p2}, Lorg/apache/sanselan/ImageParser;->getMetadata(Lorg/apache/sanselan/common/byteSources/ByteSource;Ljava/util/Map;)Lorg/apache/sanselan/common/IImageMetadata;

    move-result-object p1

    return-object p1
.end method

.method public abstract getName()Ljava/lang/String;
.end method

.method public abstract getXmpXml(Lorg/apache/sanselan/common/byteSources/ByteSource;Ljava/util/Map;)Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation
.end method
