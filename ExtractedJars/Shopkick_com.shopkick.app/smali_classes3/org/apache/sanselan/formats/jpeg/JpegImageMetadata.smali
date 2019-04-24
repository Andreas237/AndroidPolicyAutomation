.class public Lorg/apache/sanselan/formats/jpeg/JpegImageMetadata;
.super Ljava/lang/Object;
.source "JpegImageMetadata.java"

# interfaces
.implements Lorg/apache/sanselan/common/IImageMetadata;


# static fields
.field private static final newline:Ljava/lang/String;


# instance fields
.field private final exif:Lorg/apache/sanselan/formats/tiff/TiffImageMetadata;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "line.separator"

    .line 106
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/apache/sanselan/formats/jpeg/JpegImageMetadata;->newline:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Lorg/apache/sanselan/formats/tiff/TiffImageMetadata;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p2, p0, Lorg/apache/sanselan/formats/jpeg/JpegImageMetadata;->exif:Lorg/apache/sanselan/formats/tiff/TiffImageMetadata;

    return-void
.end method


# virtual methods
.method public dump()V
    .locals 1

    .line 143
    invoke-virtual {p0}, Lorg/apache/sanselan/formats/jpeg/JpegImageMetadata;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lorg/apache/sanselan/util/Debug;->debug(Ljava/lang/String;)V

    return-void
.end method

.method public findEXIFValue(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;)Lorg/apache/sanselan/formats/tiff/TiffField;
    .locals 5

    .line 50
    invoke-virtual {p0}, Lorg/apache/sanselan/formats/jpeg/JpegImageMetadata;->getItems()Ljava/util/ArrayList;

    move-result-object v0

    const/4 v1, 0x0

    .line 51
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    .line 52
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    .line 53
    instance-of v3, v2, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata$Item;

    if-nez v3, :cond_0

    goto :goto_1

    .line 56
    :cond_0
    check-cast v2, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata$Item;

    .line 57
    invoke-virtual {v2}, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata$Item;->getTiffField()Lorg/apache/sanselan/formats/tiff/TiffField;

    move-result-object v2

    .line 58
    iget v3, v2, Lorg/apache/sanselan/formats/tiff/TiffField;->tag:I

    iget v4, p1, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->tag:I

    if-ne v3, v4, :cond_1

    return-object v2

    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public getEXIFThumbnail()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public getExif()Lorg/apache/sanselan/formats/tiff/TiffImageMetadata;
    .locals 1

    .line 42
    iget-object v0, p0, Lorg/apache/sanselan/formats/jpeg/JpegImageMetadata;->exif:Lorg/apache/sanselan/formats/tiff/TiffImageMetadata;

    return-object v0
.end method

.method public getItems()Ljava/util/ArrayList;
    .locals 2

    .line 95
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 97
    iget-object v1, p0, Lorg/apache/sanselan/formats/jpeg/JpegImageMetadata;->exif:Lorg/apache/sanselan/formats/tiff/TiffImageMetadata;

    if-eqz v1, :cond_0

    .line 98
    invoke-virtual {v1}, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata;->getItems()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    :cond_0
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    .line 109
    invoke-virtual {p0, v0}, Lorg/apache/sanselan/formats/jpeg/JpegImageMetadata;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    if-nez p1, :cond_0

    const-string p1, ""

    .line 116
    :cond_0
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 118
    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 119
    iget-object v1, p0, Lorg/apache/sanselan/formats/jpeg/JpegImageMetadata;->exif:Lorg/apache/sanselan/formats/tiff/TiffImageMetadata;

    if-nez v1, :cond_1

    const-string v1, "No Exif metadata."

    .line 120
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_0

    :cond_1
    const-string v1, "Exif metadata:"

    .line 122
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 123
    sget-object v1, Lorg/apache/sanselan/formats/jpeg/JpegImageMetadata;->newline:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 124
    iget-object v1, p0, Lorg/apache/sanselan/formats/jpeg/JpegImageMetadata;->exif:Lorg/apache/sanselan/formats/tiff/TiffImageMetadata;

    const-string v2, "\t"

    invoke-virtual {v1, v2}, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 128
    :goto_0
    sget-object v1, Lorg/apache/sanselan/formats/jpeg/JpegImageMetadata;->newline:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 130
    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string p1, "No Photoshop (IPTC) metadata."

    .line 132
    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 139
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
