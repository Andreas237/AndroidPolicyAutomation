.class public Lorg/apache/sanselan/ImageInfo;
.super Ljava/lang/Object;
.source "ImageInfo.java"


# static fields
.field public static final COLOR_TYPE_BW:I = 0x0

.field public static final COLOR_TYPE_CMYK:I = 0x3

.field public static final COLOR_TYPE_GRAYSCALE:I = 0x1

.field public static final COLOR_TYPE_OTHER:I = -0x1

.field public static final COLOR_TYPE_RGB:I = 0x2

.field public static final COLOR_TYPE_UNKNOWN:I = -0x2

.field public static final COMPRESSION_ALGORITHM_CCITT_1D:Ljava/lang/String; = "CCITT 1D"

.field public static final COMPRESSION_ALGORITHM_CCITT_GROUP_3:Ljava/lang/String; = "CCITT Group 3 1-Dimensional Modified Huffman run-length encoding."

.field public static final COMPRESSION_ALGORITHM_CCITT_GROUP_4:Ljava/lang/String; = "CCITT Group 4"

.field public static final COMPRESSION_ALGORITHM_JPEG:Ljava/lang/String; = "JPEG"

.field public static final COMPRESSION_ALGORITHM_LZW:Ljava/lang/String; = "LZW"

.field public static final COMPRESSION_ALGORITHM_NONE:Ljava/lang/String; = "None"

.field public static final COMPRESSION_ALGORITHM_PACKBITS:Ljava/lang/String; = "PackBits"

.field public static final COMPRESSION_ALGORITHM_PNG_FILTER:Ljava/lang/String; = "PNG Filter"

.field public static final COMPRESSION_ALGORITHM_PSD:Ljava/lang/String; = "Photoshop"

.field public static final COMPRESSION_ALGORITHM_RLE:Ljava/lang/String; = "RLE: Run-Length Encoding"

.field public static final COMPRESSION_ALGORITHM_UNKNOWN:Ljava/lang/String; = "Unknown"


# instance fields
.field private final bitsPerPixel:I

.field private final colorType:I

.field private final comments:Ljava/util/ArrayList;

.field private final compressionAlgorithm:Ljava/lang/String;

.field private final format:Lorg/apache/sanselan/ImageFormat;

.field private final formatDetails:Ljava/lang/String;

.field private final formatName:Ljava/lang/String;

.field private final height:I

.field private final isProgressive:Z

.field private final isTransparent:Z

.field private final mimeType:Ljava/lang/String;

.field private final numberOfImages:I

.field private final physicalHeightDpi:I

.field private final physicalHeightInch:F

.field private final physicalWidthDpi:I

.field private final physicalWidthInch:F

.field private final usesPalette:Z

.field private final width:I


# direct methods
.method public constructor <init>(Ljava/lang/String;ILjava/util/ArrayList;Lorg/apache/sanselan/ImageFormat;Ljava/lang/String;ILjava/lang/String;IIFIFIZZZILjava/lang/String;)V
    .locals 2

    move-object v0, p0

    .line 81
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v1, p1

    .line 82
    iput-object v1, v0, Lorg/apache/sanselan/ImageInfo;->formatDetails:Ljava/lang/String;

    move v1, p2

    .line 84
    iput v1, v0, Lorg/apache/sanselan/ImageInfo;->bitsPerPixel:I

    move-object v1, p3

    .line 85
    iput-object v1, v0, Lorg/apache/sanselan/ImageInfo;->comments:Ljava/util/ArrayList;

    move-object v1, p4

    .line 87
    iput-object v1, v0, Lorg/apache/sanselan/ImageInfo;->format:Lorg/apache/sanselan/ImageFormat;

    move-object v1, p5

    .line 88
    iput-object v1, v0, Lorg/apache/sanselan/ImageInfo;->formatName:Ljava/lang/String;

    move v1, p6

    .line 89
    iput v1, v0, Lorg/apache/sanselan/ImageInfo;->height:I

    move-object v1, p7

    .line 90
    iput-object v1, v0, Lorg/apache/sanselan/ImageInfo;->mimeType:Ljava/lang/String;

    move v1, p8

    .line 92
    iput v1, v0, Lorg/apache/sanselan/ImageInfo;->numberOfImages:I

    move v1, p9

    .line 93
    iput v1, v0, Lorg/apache/sanselan/ImageInfo;->physicalHeightDpi:I

    move v1, p10

    .line 94
    iput v1, v0, Lorg/apache/sanselan/ImageInfo;->physicalHeightInch:F

    move v1, p11

    .line 95
    iput v1, v0, Lorg/apache/sanselan/ImageInfo;->physicalWidthDpi:I

    move v1, p12

    .line 96
    iput v1, v0, Lorg/apache/sanselan/ImageInfo;->physicalWidthInch:F

    move v1, p13

    .line 97
    iput v1, v0, Lorg/apache/sanselan/ImageInfo;->width:I

    move/from16 v1, p14

    .line 98
    iput-boolean v1, v0, Lorg/apache/sanselan/ImageInfo;->isProgressive:Z

    move/from16 v1, p15

    .line 100
    iput-boolean v1, v0, Lorg/apache/sanselan/ImageInfo;->isTransparent:Z

    move/from16 v1, p16

    .line 101
    iput-boolean v1, v0, Lorg/apache/sanselan/ImageInfo;->usesPalette:Z

    move/from16 v1, p17

    .line 103
    iput v1, v0, Lorg/apache/sanselan/ImageInfo;->colorType:I

    move-object/from16 v1, p18

    .line 104
    iput-object v1, v0, Lorg/apache/sanselan/ImageInfo;->compressionAlgorithm:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public dump()V
    .locals 2

    .line 292
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {p0}, Lorg/apache/sanselan/ImageInfo;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    return-void
.end method

.method public getBitsPerPixel()I
    .locals 1

    .line 112
    iget v0, p0, Lorg/apache/sanselan/ImageInfo;->bitsPerPixel:I

    return v0
.end method

.method public getColorType()I
    .locals 1

    .line 259
    iget v0, p0, Lorg/apache/sanselan/ImageInfo;->colorType:I

    return v0
.end method

.method public getColorTypeDescription()Ljava/lang/String;
    .locals 1

    .line 269
    iget v0, p0, Lorg/apache/sanselan/ImageInfo;->colorType:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "Unknown"

    return-object v0

    :pswitch_0
    const-string v0, "CMYK"

    return-object v0

    :pswitch_1
    const-string v0, "RGB"

    return-object v0

    :pswitch_2
    const-string v0, "Grayscale"

    return-object v0

    :pswitch_3
    const-string v0, "Black and White"

    return-object v0

    :pswitch_4
    const-string v0, "Other"

    return-object v0

    :pswitch_5
    const-string v0, "Unknown"

    return-object v0

    :pswitch_data_0
    .packed-switch -0x2
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public getComments()Ljava/util/ArrayList;
    .locals 2

    .line 121
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lorg/apache/sanselan/ImageInfo;->comments:Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public getFormat()Lorg/apache/sanselan/ImageFormat;
    .locals 1

    .line 133
    iget-object v0, p0, Lorg/apache/sanselan/ImageInfo;->format:Lorg/apache/sanselan/ImageFormat;

    return-object v0
.end method

.method public getFormatName()Ljava/lang/String;
    .locals 1

    .line 143
    iget-object v0, p0, Lorg/apache/sanselan/ImageInfo;->formatName:Ljava/lang/String;

    return-object v0
.end method

.method public getHeight()I
    .locals 1

    .line 153
    iget v0, p0, Lorg/apache/sanselan/ImageInfo;->height:I

    return v0
.end method

.method public getIsProgressive()Z
    .locals 1

    .line 248
    iget-boolean v0, p0, Lorg/apache/sanselan/ImageInfo;->isProgressive:Z

    return v0
.end method

.method public getMimeType()Ljava/lang/String;
    .locals 1

    .line 163
    iget-object v0, p0, Lorg/apache/sanselan/ImageInfo;->mimeType:Ljava/lang/String;

    return-object v0
.end method

.method public getNumberOfImages()I
    .locals 1

    .line 174
    iget v0, p0, Lorg/apache/sanselan/ImageInfo;->numberOfImages:I

    return v0
.end method

.method public getPhysicalHeightDpi()I
    .locals 1

    .line 188
    iget v0, p0, Lorg/apache/sanselan/ImageInfo;->physicalHeightDpi:I

    return v0
.end method

.method public getPhysicalHeightInch()F
    .locals 1

    .line 202
    iget v0, p0, Lorg/apache/sanselan/ImageInfo;->physicalHeightInch:F

    return v0
.end method

.method public getPhysicalWidthDpi()I
    .locals 1

    .line 216
    iget v0, p0, Lorg/apache/sanselan/ImageInfo;->physicalWidthDpi:I

    return v0
.end method

.method public getPhysicalWidthInch()F
    .locals 1

    .line 230
    iget v0, p0, Lorg/apache/sanselan/ImageInfo;->physicalWidthInch:F

    return v0
.end method

.method public getWidth()I
    .locals 1

    .line 240
    iget v0, p0, Lorg/apache/sanselan/ImageInfo;->width:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 299
    :try_start_0
    new-instance v0, Ljava/io/StringWriter;

    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    .line 300
    new-instance v1, Ljava/io/PrintWriter;

    invoke-direct {v1, v0}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    const-string v2, ""

    .line 302
    invoke-virtual {p0, v1, v2}, Lorg/apache/sanselan/ImageInfo;->toString(Ljava/io/PrintWriter;Ljava/lang/String;)V

    .line 303
    invoke-virtual {v1}, Ljava/io/PrintWriter;->flush()V

    .line 305
    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const-string v0, "Image Data: Error"

    return-object v0
.end method

.method public toString(Ljava/io/PrintWriter;Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 315
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Format Details: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lorg/apache/sanselan/ImageInfo;->formatDetails:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 317
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Bits Per Pixel: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lorg/apache/sanselan/ImageInfo;->bitsPerPixel:I

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 318
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Comments: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lorg/apache/sanselan/ImageInfo;->comments:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    const/4 p2, 0x0

    .line 319
    :goto_0
    iget-object v0, p0, Lorg/apache/sanselan/ImageInfo;->comments:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge p2, v0, :cond_0

    .line 321
    iget-object v0, p0, Lorg/apache/sanselan/ImageInfo;->comments:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 322
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\t"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ": \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\'"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 325
    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Format: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lorg/apache/sanselan/ImageInfo;->format:Lorg/apache/sanselan/ImageFormat;

    iget-object v0, v0, Lorg/apache/sanselan/ImageFormat;->name:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 326
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Format Name: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lorg/apache/sanselan/ImageInfo;->formatName:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 327
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Compression Algorithm: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lorg/apache/sanselan/ImageInfo;->compressionAlgorithm:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 328
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Height: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lorg/apache/sanselan/ImageInfo;->height:I

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 329
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "MimeType: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lorg/apache/sanselan/ImageInfo;->mimeType:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 330
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Number Of Images: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lorg/apache/sanselan/ImageInfo;->numberOfImages:I

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 331
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Physical Height Dpi: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lorg/apache/sanselan/ImageInfo;->physicalHeightDpi:I

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 332
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Physical Height Inch: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lorg/apache/sanselan/ImageInfo;->physicalHeightInch:F

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 333
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Physical Width Dpi: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lorg/apache/sanselan/ImageInfo;->physicalWidthDpi:I

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 334
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Physical Width Inch: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lorg/apache/sanselan/ImageInfo;->physicalWidthInch:F

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 335
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Width: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lorg/apache/sanselan/ImageInfo;->width:I

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 336
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Is Progressive: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v0, p0, Lorg/apache/sanselan/ImageInfo;->isProgressive:Z

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 337
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Is Transparent: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v0, p0, Lorg/apache/sanselan/ImageInfo;->isTransparent:Z

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 339
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Color Type: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/apache/sanselan/ImageInfo;->getColorTypeDescription()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 340
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Uses Palette: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v0, p0, Lorg/apache/sanselan/ImageInfo;->usesPalette:Z

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 342
    invoke-virtual {p1}, Ljava/io/PrintWriter;->flush()V

    return-void
.end method
