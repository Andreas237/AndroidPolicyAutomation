.class public Lorg/apache/sanselan/formats/jpeg/JpegUtils;
.super Lorg/apache/sanselan/common/BinaryFileParser;
.source "JpegUtils.java"

# interfaces
.implements Lorg/apache/sanselan/formats/jpeg/JpegConstants;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/sanselan/formats/jpeg/JpegUtils$Visitor;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 31
    invoke-direct {p0}, Lorg/apache/sanselan/common/BinaryFileParser;-><init>()V

    const/16 v0, 0x4d

    .line 32
    invoke-virtual {p0, v0}, Lorg/apache/sanselan/formats/jpeg/JpegUtils;->setByteOrder(I)V

    return-void
.end method

.method public static getMarkerName(I)Ljava/lang/String;
    .locals 1

    const v0, 0xffda

    if-eq p0, v0, :cond_0

    packed-switch p0, :pswitch_data_0

    packed-switch p0, :pswitch_data_1

    packed-switch p0, :pswitch_data_2

    const-string p0, "Unknown"

    return-object p0

    :pswitch_0
    const-string p0, "JPEG_APP15_Marker"

    return-object p0

    :pswitch_1
    const-string p0, "JPEG_APP14_Marker"

    return-object p0

    :pswitch_2
    const-string p0, "JPEG_APP13_Marker"

    return-object p0

    :pswitch_3
    const-string p0, "JPEG_APP2_Marker"

    return-object p0

    :pswitch_4
    const-string p0, "JPEG_APP1_Marker"

    return-object p0

    :pswitch_5
    const-string p0, "JFIFMarker"

    return-object p0

    :pswitch_6
    const-string p0, "SOF15Marker"

    return-object p0

    :pswitch_7
    const-string p0, "SOF14Marker"

    return-object p0

    :pswitch_8
    const-string p0, "SOF13Marker"

    return-object p0

    :pswitch_9
    const-string p0, "SOF12Marker"

    return-object p0

    :pswitch_a
    const-string p0, "SOF11Marker"

    return-object p0

    :pswitch_b
    const-string p0, "SOF10Marker"

    return-object p0

    :pswitch_c
    const-string p0, "SOF9Marker"

    return-object p0

    :pswitch_d
    const-string p0, "SOF8Marker"

    return-object p0

    :pswitch_e
    const-string p0, "SOF7Marker"

    return-object p0

    :pswitch_f
    const-string p0, "SOF6Marker"

    return-object p0

    :pswitch_10
    const-string p0, "SOF5Marker"

    return-object p0

    :pswitch_11
    const-string p0, "SOF4Marker"

    return-object p0

    :pswitch_12
    const-string p0, "SOF3Marker"

    return-object p0

    :pswitch_13
    const-string p0, "SOF2Marker"

    return-object p0

    :pswitch_14
    const-string p0, "SOF1Marker"

    return-object p0

    :pswitch_15
    const-string p0, "SOF0Marker"

    return-object p0

    :cond_0
    const-string p0, "SOS_Marker"

    return-object p0

    :pswitch_data_0
    .packed-switch 0xffc0
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0xffe0
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0xffed
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public dumpJFIF(Lorg/apache/sanselan/common/byteSources/ByteSource;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;,
            Lorg/apache/sanselan/ImageWriteException;
        }
    .end annotation

    .line 185
    new-instance v0, Lorg/apache/sanselan/formats/jpeg/JpegUtils$1;

    invoke-direct {v0, p0}, Lorg/apache/sanselan/formats/jpeg/JpegUtils$1;-><init>(Lorg/apache/sanselan/formats/jpeg/JpegUtils;)V

    .line 216
    invoke-virtual {p0, p1, v0}, Lorg/apache/sanselan/formats/jpeg/JpegUtils;->traverseJFIF(Lorg/apache/sanselan/common/byteSources/ByteSource;Lorg/apache/sanselan/formats/jpeg/JpegUtils$Visitor;)V

    return-void
.end method

.method public traverseJFIF(Lorg/apache/sanselan/common/byteSources/ByteSource;Lorg/apache/sanselan/formats/jpeg/JpegUtils$Visitor;)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 60
    :try_start_0
    invoke-virtual {p1}, Lorg/apache/sanselan/common/byteSources/ByteSource;->getInputStream()Ljava/io/InputStream;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 62
    :try_start_1
    sget-object v0, Lorg/apache/sanselan/formats/jpeg/JpegUtils;->SOI:[B

    const-string v1, "Not a Valid JPEG File: doesn\'t begin with 0xffd8"

    invoke-virtual {p0, p1, v0, v1}, Lorg/apache/sanselan/formats/jpeg/JpegUtils;->readAndVerifyBytes(Ljava/io/InputStream;[BLjava/lang/String;)V

    .line 65
    invoke-virtual {p0}, Lorg/apache/sanselan/formats/jpeg/JpegUtils;->getByteOrder()I

    move-result v0

    :cond_0
    const-string v1, "markerBytes"

    const-string v2, "markerBytes"

    const/4 v3, 0x2

    .line 69
    invoke-virtual {p0, v1, v3, p1, v2}, Lorg/apache/sanselan/formats/jpeg/JpegUtils;->readByteArray(Ljava/lang/String;ILjava/io/InputStream;Ljava/lang/String;)[B

    move-result-object v6

    const-string v1, "marker"

    .line 71
    invoke-virtual {p0, v1, v6, v0}, Lorg/apache/sanselan/formats/jpeg/JpegUtils;->convertByteArrayToShort(Ljava/lang/String;[BI)I

    move-result v5

    const v1, 0xffd9

    if-eq v5, v1, :cond_3

    const v1, 0xffda

    if-ne v5, v1, :cond_1

    goto :goto_1

    :cond_1
    const-string v1, "segmentLengthBytes"

    const-string v2, "segmentLengthBytes"

    .line 91
    invoke-virtual {p0, v1, v3, p1, v2}, Lorg/apache/sanselan/formats/jpeg/JpegUtils;->readByteArray(Ljava/lang/String;ILjava/io/InputStream;Ljava/lang/String;)[B

    move-result-object v8

    const-string v1, "segmentLength"

    .line 93
    invoke-virtual {p0, v1, v8, v0}, Lorg/apache/sanselan/formats/jpeg/JpegUtils;->convertByteArrayToShort(Ljava/lang/String;[BI)I

    move-result v7

    const-string v1, "Segment Data"

    add-int/lit8 v2, v7, -0x2

    const-string v3, "Invalid Segment: insufficient data"

    .line 99
    invoke-virtual {p0, v1, v2, p1, v3}, Lorg/apache/sanselan/formats/jpeg/JpegUtils;->readByteArray(Ljava/lang/String;ILjava/io/InputStream;Ljava/lang/String;)[B

    move-result-object v9

    move-object v4, p2

    .line 105
    invoke-interface/range {v4 .. v9}, Lorg/apache/sanselan/formats/jpeg/JpegUtils$Visitor;->visitSegment(I[BI[B[B)Z

    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v1, :cond_0

    if-eqz p1, :cond_2

    .line 115
    :try_start_2
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 118
    invoke-static {p1}, Lorg/apache/sanselan/util/Debug;->debug(Ljava/lang/Throwable;)V

    :cond_2
    :goto_0
    return-void

    .line 79
    :cond_3
    :goto_1
    :try_start_3
    invoke-interface {p2}, Lorg/apache/sanselan/formats/jpeg/JpegUtils$Visitor;->beginSOS()Z

    move-result v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-nez v0, :cond_5

    if-eqz p1, :cond_4

    .line 115
    :try_start_4
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_2

    :catch_1
    move-exception p1

    .line 118
    invoke-static {p1}, Lorg/apache/sanselan/util/Debug;->debug(Ljava/lang/Throwable;)V

    :cond_4
    :goto_2
    return-void

    .line 86
    :cond_5
    :try_start_5
    invoke-interface {p2, v5, v6, p1}, Lorg/apache/sanselan/formats/jpeg/JpegUtils$Visitor;->visitSOS(I[BLjava/io/InputStream;)Z

    move-result p2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    xor-int/lit8 p2, p2, 0x1

    if-eqz p1, :cond_6

    if-eqz p2, :cond_6

    .line 115
    :try_start_6
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2

    goto :goto_3

    :catch_2
    move-exception p1

    .line 118
    invoke-static {p1}, Lorg/apache/sanselan/util/Debug;->debug(Ljava/lang/Throwable;)V

    :cond_6
    :goto_3
    return-void

    :catchall_0
    move-exception p2

    goto :goto_4

    :catchall_1
    move-exception p2

    const/4 p1, 0x0

    :goto_4
    if-eqz p1, :cond_7

    .line 115
    :try_start_7
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_3

    goto :goto_5

    :catch_3
    move-exception p1

    .line 118
    invoke-static {p1}, Lorg/apache/sanselan/util/Debug;->debug(Ljava/lang/Throwable;)V

    .line 119
    :cond_7
    :goto_5
    throw p2
.end method
