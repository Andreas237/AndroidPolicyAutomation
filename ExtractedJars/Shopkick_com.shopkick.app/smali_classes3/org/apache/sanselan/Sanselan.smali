.class public abstract Lorg/apache/sanselan/Sanselan;
.super Ljava/lang/Object;
.source "Sanselan.java"

# interfaces
.implements Lorg/apache/sanselan/SanselanConstants;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final getImageParser(Lorg/apache/sanselan/common/byteSources/ByteSource;)Lorg/apache/sanselan/ImageParser;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 595
    invoke-static {p0}, Lorg/apache/sanselan/Sanselan;->guessFormat(Lorg/apache/sanselan/common/byteSources/ByteSource;)Lorg/apache/sanselan/ImageFormat;

    move-result-object v0

    .line 596
    sget-object v1, Lorg/apache/sanselan/ImageFormat;->IMAGE_FORMAT_UNKNOWN:Lorg/apache/sanselan/ImageFormat;

    invoke-virtual {v0, v1}, Lorg/apache/sanselan/ImageFormat;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_1

    .line 598
    invoke-static {}, Lorg/apache/sanselan/ImageParser;->getAllImageParsers()[Lorg/apache/sanselan/ImageParser;

    move-result-object v1

    move v3, v2

    .line 600
    :goto_0
    array-length v4, v1

    if-ge v3, v4, :cond_1

    .line 601
    aget-object v4, v1, v3

    .line 603
    invoke-virtual {v4, v0}, Lorg/apache/sanselan/ImageParser;->canAcceptType(Lorg/apache/sanselan/ImageFormat;)Z

    move-result v5

    if-eqz v5, :cond_0

    return-object v4

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 608
    :cond_1
    invoke-virtual {p0}, Lorg/apache/sanselan/common/byteSources/ByteSource;->getFilename()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_3

    .line 610
    invoke-static {}, Lorg/apache/sanselan/ImageParser;->getAllImageParsers()[Lorg/apache/sanselan/ImageParser;

    move-result-object v0

    .line 612
    :goto_1
    array-length v1, v0

    if-ge v2, v1, :cond_3

    .line 613
    aget-object v1, v0, v2

    .line 615
    invoke-virtual {v1, p0}, Lorg/apache/sanselan/ImageParser;->canAcceptExtension(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    return-object v1

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 620
    :cond_3
    new-instance p0, Lorg/apache/sanselan/ImageReadException;

    const-string v0, "Can\'t parse this format."

    invoke-direct {p0, v0}, Lorg/apache/sanselan/ImageReadException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static getMetadata(Ljava/io/File;)Lorg/apache/sanselan/common/IImageMetadata;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 945
    invoke-static {p0, v0}, Lorg/apache/sanselan/Sanselan;->getMetadata(Ljava/io/File;Ljava/util/Map;)Lorg/apache/sanselan/common/IImageMetadata;

    move-result-object p0

    return-object p0
.end method

.method public static getMetadata(Ljava/io/File;Ljava/util/Map;)Lorg/apache/sanselan/common/IImageMetadata;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 970
    new-instance v0, Lorg/apache/sanselan/common/byteSources/ByteSourceFile;

    invoke-direct {v0, p0}, Lorg/apache/sanselan/common/byteSources/ByteSourceFile;-><init>(Ljava/io/File;)V

    invoke-static {v0, p1}, Lorg/apache/sanselan/Sanselan;->getMetadata(Lorg/apache/sanselan/common/byteSources/ByteSource;Ljava/util/Map;)Lorg/apache/sanselan/common/IImageMetadata;

    move-result-object p0

    return-object p0
.end method

.method public static getMetadata(Ljava/io/InputStream;Ljava/lang/String;)Lorg/apache/sanselan/common/IImageMetadata;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 895
    invoke-static {p0, p1, v0}, Lorg/apache/sanselan/Sanselan;->getMetadata(Ljava/io/InputStream;Ljava/lang/String;Ljava/util/Map;)Lorg/apache/sanselan/common/IImageMetadata;

    move-result-object p0

    return-object p0
.end method

.method public static getMetadata(Ljava/io/InputStream;Ljava/lang/String;Ljava/util/Map;)Lorg/apache/sanselan/common/IImageMetadata;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 922
    new-instance v0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;

    invoke-direct {v0, p0, p1}, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    invoke-static {v0, p2}, Lorg/apache/sanselan/Sanselan;->getMetadata(Lorg/apache/sanselan/common/byteSources/ByteSource;Ljava/util/Map;)Lorg/apache/sanselan/common/IImageMetadata;

    move-result-object p0

    return-object p0
.end method

.method private static getMetadata(Lorg/apache/sanselan/common/byteSources/ByteSource;Ljava/util/Map;)Lorg/apache/sanselan/common/IImageMetadata;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 975
    invoke-static {p0}, Lorg/apache/sanselan/Sanselan;->getImageParser(Lorg/apache/sanselan/common/byteSources/ByteSource;)Lorg/apache/sanselan/ImageParser;

    move-result-object v0

    .line 977
    invoke-virtual {v0, p0, p1}, Lorg/apache/sanselan/ImageParser;->getMetadata(Lorg/apache/sanselan/common/byteSources/ByteSource;Ljava/util/Map;)Lorg/apache/sanselan/common/IImageMetadata;

    move-result-object p0

    return-object p0
.end method

.method public static getMetadata([B)Lorg/apache/sanselan/common/IImageMetadata;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 845
    invoke-static {p0, v0}, Lorg/apache/sanselan/Sanselan;->getMetadata([BLjava/util/Map;)Lorg/apache/sanselan/common/IImageMetadata;

    move-result-object p0

    return-object p0
.end method

.method public static getMetadata([BLjava/util/Map;)Lorg/apache/sanselan/common/IImageMetadata;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 870
    new-instance v0, Lorg/apache/sanselan/common/byteSources/ByteSourceArray;

    invoke-direct {v0, p0}, Lorg/apache/sanselan/common/byteSources/ByteSourceArray;-><init>([B)V

    invoke-static {v0, p1}, Lorg/apache/sanselan/Sanselan;->getMetadata(Lorg/apache/sanselan/common/byteSources/ByteSource;Ljava/util/Map;)Lorg/apache/sanselan/common/IImageMetadata;

    move-result-object p0

    return-object p0
.end method

.method public static guessFormat(Lorg/apache/sanselan/common/byteSources/ByteSource;)Lorg/apache/sanselan/ImageFormat;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 141
    :try_start_0
    invoke-virtual {p0}, Lorg/apache/sanselan/common/byteSources/ByteSource;->getInputStream()Ljava/io/InputStream;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 143
    :try_start_1
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v0

    .line 144
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v1

    if-ltz v0, :cond_1e

    if-ltz v1, :cond_1e

    const/16 v2, 0xff

    and-int/2addr v0, v2

    and-int/2addr v1, v2

    const/16 v3, 0x47

    const/16 v4, 0x49

    if-ne v0, v3, :cond_1

    if-ne v1, v4, :cond_1

    .line 153
    sget-object v0, Lorg/apache/sanselan/ImageFormat;->IMAGE_FORMAT_GIF:Lorg/apache/sanselan/ImageFormat;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p0, :cond_0

    .line 204
    :try_start_2
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    .line 207
    invoke-static {p0}, Lorg/apache/sanselan/util/Debug;->debug(Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    return-object v0

    :cond_1
    const/16 v3, 0x89

    const/16 v5, 0x50

    if-ne v0, v3, :cond_3

    if-ne v1, v5, :cond_3

    .line 160
    :try_start_3
    sget-object v0, Lorg/apache/sanselan/ImageFormat;->IMAGE_FORMAT_PNG:Lorg/apache/sanselan/ImageFormat;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-eqz p0, :cond_2

    .line 204
    :try_start_4
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_1

    :catch_1
    move-exception p0

    .line 207
    invoke-static {p0}, Lorg/apache/sanselan/util/Debug;->debug(Ljava/lang/Throwable;)V

    :cond_2
    :goto_1
    return-object v0

    :cond_3
    if-ne v0, v2, :cond_5

    const/16 v3, 0xd8

    if-ne v1, v3, :cond_5

    .line 162
    :try_start_5
    sget-object v0, Lorg/apache/sanselan/ImageFormat;->IMAGE_FORMAT_JPEG:Lorg/apache/sanselan/ImageFormat;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    if-eqz p0, :cond_4

    .line 204
    :try_start_6
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2

    goto :goto_2

    :catch_2
    move-exception p0

    .line 207
    invoke-static {p0}, Lorg/apache/sanselan/util/Debug;->debug(Ljava/lang/Throwable;)V

    :cond_4
    :goto_2
    return-object v0

    :cond_5
    const/16 v3, 0x4d

    const/16 v6, 0x42

    if-ne v0, v6, :cond_7

    if-ne v1, v3, :cond_7

    .line 164
    :try_start_7
    sget-object v0, Lorg/apache/sanselan/ImageFormat;->IMAGE_FORMAT_BMP:Lorg/apache/sanselan/ImageFormat;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    if-eqz p0, :cond_6

    .line 204
    :try_start_8
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_3

    goto :goto_3

    :catch_3
    move-exception p0

    .line 207
    invoke-static {p0}, Lorg/apache/sanselan/util/Debug;->debug(Ljava/lang/Throwable;)V

    :cond_6
    :goto_3
    return-object v0

    :cond_7
    if-ne v0, v3, :cond_9

    if-ne v1, v3, :cond_9

    .line 167
    :try_start_9
    sget-object v0, Lorg/apache/sanselan/ImageFormat;->IMAGE_FORMAT_TIFF:Lorg/apache/sanselan/ImageFormat;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    if-eqz p0, :cond_8

    .line 204
    :try_start_a
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_4

    goto :goto_4

    :catch_4
    move-exception p0

    .line 207
    invoke-static {p0}, Lorg/apache/sanselan/util/Debug;->debug(Ljava/lang/Throwable;)V

    :cond_8
    :goto_4
    return-object v0

    :cond_9
    if-ne v0, v4, :cond_b

    if-ne v1, v4, :cond_b

    .line 170
    :try_start_b
    sget-object v0, Lorg/apache/sanselan/ImageFormat;->IMAGE_FORMAT_TIFF:Lorg/apache/sanselan/ImageFormat;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    if-eqz p0, :cond_a

    .line 204
    :try_start_c
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_5

    goto :goto_5

    :catch_5
    move-exception p0

    .line 207
    invoke-static {p0}, Lorg/apache/sanselan/util/Debug;->debug(Ljava/lang/Throwable;)V

    :cond_a
    :goto_5
    return-object v0

    :cond_b
    const/16 v3, 0x38

    if-ne v0, v3, :cond_d

    if-ne v1, v6, :cond_d

    .line 172
    :try_start_d
    sget-object v0, Lorg/apache/sanselan/ImageFormat;->IMAGE_FORMAT_PSD:Lorg/apache/sanselan/ImageFormat;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    if-eqz p0, :cond_c

    .line 204
    :try_start_e
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_e
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_6

    goto :goto_6

    :catch_6
    move-exception p0

    .line 207
    invoke-static {p0}, Lorg/apache/sanselan/util/Debug;->debug(Ljava/lang/Throwable;)V

    :cond_c
    :goto_6
    return-object v0

    :cond_d
    if-ne v0, v5, :cond_f

    const/16 v3, 0x31

    if-ne v1, v3, :cond_f

    .line 174
    :try_start_f
    sget-object v0, Lorg/apache/sanselan/ImageFormat;->IMAGE_FORMAT_PBM:Lorg/apache/sanselan/ImageFormat;
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    if-eqz p0, :cond_e

    .line 204
    :try_start_10
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_10
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_7

    goto :goto_7

    :catch_7
    move-exception p0

    .line 207
    invoke-static {p0}, Lorg/apache/sanselan/util/Debug;->debug(Ljava/lang/Throwable;)V

    :cond_e
    :goto_7
    return-object v0

    :cond_f
    if-ne v0, v5, :cond_11

    const/16 v3, 0x34

    if-ne v1, v3, :cond_11

    .line 176
    :try_start_11
    sget-object v0, Lorg/apache/sanselan/ImageFormat;->IMAGE_FORMAT_PBM:Lorg/apache/sanselan/ImageFormat;
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_0

    if-eqz p0, :cond_10

    .line 204
    :try_start_12
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_12
    .catch Ljava/io/IOException; {:try_start_12 .. :try_end_12} :catch_8

    goto :goto_8

    :catch_8
    move-exception p0

    .line 207
    invoke-static {p0}, Lorg/apache/sanselan/util/Debug;->debug(Ljava/lang/Throwable;)V

    :cond_10
    :goto_8
    return-object v0

    :cond_11
    const/16 v3, 0x32

    if-ne v0, v5, :cond_13

    if-ne v1, v3, :cond_13

    .line 178
    :try_start_13
    sget-object v0, Lorg/apache/sanselan/ImageFormat;->IMAGE_FORMAT_PGM:Lorg/apache/sanselan/ImageFormat;
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_0

    if-eqz p0, :cond_12

    .line 204
    :try_start_14
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_14
    .catch Ljava/io/IOException; {:try_start_14 .. :try_end_14} :catch_9

    goto :goto_9

    :catch_9
    move-exception p0

    .line 207
    invoke-static {p0}, Lorg/apache/sanselan/util/Debug;->debug(Ljava/lang/Throwable;)V

    :cond_12
    :goto_9
    return-object v0

    :cond_13
    if-ne v0, v5, :cond_15

    const/16 v4, 0x35

    if-ne v1, v4, :cond_15

    .line 180
    :try_start_15
    sget-object v0, Lorg/apache/sanselan/ImageFormat;->IMAGE_FORMAT_PGM:Lorg/apache/sanselan/ImageFormat;
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_0

    if-eqz p0, :cond_14

    .line 204
    :try_start_16
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_16
    .catch Ljava/io/IOException; {:try_start_16 .. :try_end_16} :catch_a

    goto :goto_a

    :catch_a
    move-exception p0

    .line 207
    invoke-static {p0}, Lorg/apache/sanselan/util/Debug;->debug(Ljava/lang/Throwable;)V

    :cond_14
    :goto_a
    return-object v0

    :cond_15
    if-ne v0, v5, :cond_17

    const/16 v4, 0x33

    if-ne v1, v4, :cond_17

    .line 182
    :try_start_17
    sget-object v0, Lorg/apache/sanselan/ImageFormat;->IMAGE_FORMAT_PPM:Lorg/apache/sanselan/ImageFormat;
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_0

    if-eqz p0, :cond_16

    .line 204
    :try_start_18
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_18
    .catch Ljava/io/IOException; {:try_start_18 .. :try_end_18} :catch_b

    goto :goto_b

    :catch_b
    move-exception p0

    .line 207
    invoke-static {p0}, Lorg/apache/sanselan/util/Debug;->debug(Ljava/lang/Throwable;)V

    :cond_16
    :goto_b
    return-object v0

    :cond_17
    if-ne v0, v5, :cond_19

    const/16 v4, 0x36

    if-ne v1, v4, :cond_19

    .line 184
    :try_start_19
    sget-object v0, Lorg/apache/sanselan/ImageFormat;->IMAGE_FORMAT_PPM:Lorg/apache/sanselan/ImageFormat;
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_0

    if-eqz p0, :cond_18

    .line 204
    :try_start_1a
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_1a
    .catch Ljava/io/IOException; {:try_start_1a .. :try_end_1a} :catch_c

    goto :goto_c

    :catch_c
    move-exception p0

    .line 207
    invoke-static {p0}, Lorg/apache/sanselan/util/Debug;->debug(Ljava/lang/Throwable;)V

    :cond_18
    :goto_c
    return-object v0

    :cond_19
    const/16 v4, 0x97

    if-ne v0, v4, :cond_1c

    const/16 v0, 0x4a

    if-ne v1, v0, :cond_1c

    .line 187
    :try_start_1b
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v0

    .line 188
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v1

    if-ltz v0, :cond_1b

    if-ltz v1, :cond_1b

    and-int/2addr v0, v2

    and-int/2addr v1, v2

    if-ne v0, v6, :cond_1c

    if-ne v1, v3, :cond_1c

    .line 197
    sget-object v0, Lorg/apache/sanselan/ImageFormat;->IMAGE_FORMAT_JBIG2:Lorg/apache/sanselan/ImageFormat;
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_0

    if-eqz p0, :cond_1a

    .line 204
    :try_start_1c
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_1c
    .catch Ljava/io/IOException; {:try_start_1c .. :try_end_1c} :catch_d

    goto :goto_d

    :catch_d
    move-exception p0

    .line 207
    invoke-static {p0}, Lorg/apache/sanselan/util/Debug;->debug(Ljava/lang/Throwable;)V

    :cond_1a
    :goto_d
    return-object v0

    .line 190
    :cond_1b
    :try_start_1d
    new-instance v0, Lorg/apache/sanselan/ImageReadException;

    const-string v1, "Couldn\'t read magic numbers to guess format."

    invoke-direct {v0, v1}, Lorg/apache/sanselan/ImageReadException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 200
    :cond_1c
    sget-object v0, Lorg/apache/sanselan/ImageFormat;->IMAGE_FORMAT_UNKNOWN:Lorg/apache/sanselan/ImageFormat;
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_0

    if-eqz p0, :cond_1d

    .line 204
    :try_start_1e
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_1e
    .catch Ljava/io/IOException; {:try_start_1e .. :try_end_1e} :catch_e

    goto :goto_e

    :catch_e
    move-exception p0

    .line 207
    invoke-static {p0}, Lorg/apache/sanselan/util/Debug;->debug(Ljava/lang/Throwable;)V

    :cond_1d
    :goto_e
    return-object v0

    .line 146
    :cond_1e
    :try_start_1f
    new-instance v0, Lorg/apache/sanselan/ImageReadException;

    const-string v1, "Couldn\'t read magic numbers to guess format."

    invoke-direct {v0, v1}, Lorg/apache/sanselan/ImageReadException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_0

    :catchall_0
    move-exception v0

    goto :goto_f

    :catchall_1
    move-exception v0

    const/4 p0, 0x0

    :goto_f
    if-eqz p0, :cond_1f

    .line 204
    :try_start_20
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_20
    .catch Ljava/io/IOException; {:try_start_20 .. :try_end_20} :catch_f

    goto :goto_10

    :catch_f
    move-exception p0

    .line 207
    invoke-static {p0}, Lorg/apache/sanselan/util/Debug;->debug(Ljava/lang/Throwable;)V

    .line 209
    :cond_1f
    :goto_10
    throw v0
.end method
