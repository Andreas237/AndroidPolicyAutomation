.class public Lorg/apache/sanselan/formats/tiff/TiffImageMetadata;
.super Lorg/apache/sanselan/common/ImageMetadata;
.source "TiffImageMetadata.java"

# interfaces
.implements Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/sanselan/formats/tiff/TiffImageMetadata$GPSInfo;,
        Lorg/apache/sanselan/formats/tiff/TiffImageMetadata$Item;,
        Lorg/apache/sanselan/formats/tiff/TiffImageMetadata$Directory;
    }
.end annotation


# instance fields
.field public final contents:Lorg/apache/sanselan/formats/tiff/TiffContents;


# direct methods
.method public constructor <init>(Lorg/apache/sanselan/formats/tiff/TiffContents;)V
    .locals 0

    .line 43
    invoke-direct {p0}, Lorg/apache/sanselan/common/ImageMetadata;-><init>()V

    .line 44
    iput-object p1, p0, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata;->contents:Lorg/apache/sanselan/formats/tiff/TiffContents;

    return-void
.end method


# virtual methods
.method public findDirectory(I)Lorg/apache/sanselan/formats/tiff/TiffDirectory;
    .locals 4

    .line 246
    invoke-virtual {p0}, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata;->getDirectories()Ljava/util/ArrayList;

    move-result-object v0

    const/4 v1, 0x0

    .line 247
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 249
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata$Directory;

    .line 250
    iget v3, v2, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata$Directory;->type:I

    if-ne v3, p1, :cond_0

    .line 251
    invoke-static {v2}, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata$Directory;->access$000(Lorg/apache/sanselan/formats/tiff/TiffImageMetadata$Directory;)Lorg/apache/sanselan/formats/tiff/TiffDirectory;

    move-result-object p1

    return-object p1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public findField(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;)Lorg/apache/sanselan/formats/tiff/TiffField;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;
        }
    .end annotation

    .line 233
    invoke-virtual {p0}, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata;->getDirectories()Ljava/util/ArrayList;

    move-result-object v0

    const/4 v1, 0x0

    .line 234
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 236
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata$Directory;

    .line 237
    invoke-virtual {v2, p1}, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata$Directory;->findField(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;)Lorg/apache/sanselan/formats/tiff/TiffField;

    move-result-object v2

    if-eqz v2, :cond_0

    return-object v2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public getAllFields()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;
        }
    .end annotation

    .line 258
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 259
    invoke-virtual {p0}, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata;->getDirectories()Ljava/util/ArrayList;

    move-result-object v1

    const/4 v2, 0x0

    .line 260
    :goto_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_0

    .line 262
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata$Directory;

    .line 263
    invoke-virtual {v3}, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata$Directory;->getAllFields()Ljava/util/List;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public getDirectories()Ljava/util/ArrayList;
    .locals 1

    .line 169
    invoke-super {p0}, Lorg/apache/sanselan/common/ImageMetadata;->getItems()Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public getGPS()Lorg/apache/sanselan/formats/tiff/TiffImageMetadata$GPSInfo;
    .locals 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;
        }
    .end annotation

    const/4 v0, -0x3

    .line 270
    invoke-virtual {p0, v0}, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata;->findDirectory(I)Lorg/apache/sanselan/formats/tiff/TiffDirectory;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 275
    :cond_0
    sget-object v2, Lorg/apache/sanselan/formats/tiff/constants/TiffConstants;->GPS_TAG_GPS_LATITUDE_REF:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    .line 276
    invoke-virtual {v0, v2}, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->findField(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;)Lorg/apache/sanselan/formats/tiff/TiffField;

    move-result-object v2

    .line 277
    sget-object v3, Lorg/apache/sanselan/formats/tiff/constants/TiffConstants;->GPS_TAG_GPS_LATITUDE:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    .line 278
    invoke-virtual {v0, v3}, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->findField(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;)Lorg/apache/sanselan/formats/tiff/TiffField;

    move-result-object v3

    .line 279
    sget-object v4, Lorg/apache/sanselan/formats/tiff/constants/TiffConstants;->GPS_TAG_GPS_LONGITUDE_REF:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    .line 280
    invoke-virtual {v0, v4}, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->findField(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;)Lorg/apache/sanselan/formats/tiff/TiffField;

    move-result-object v4

    .line 281
    sget-object v5, Lorg/apache/sanselan/formats/tiff/constants/TiffConstants;->GPS_TAG_GPS_LONGITUDE:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    .line 282
    invoke-virtual {v0, v5}, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->findField(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;)Lorg/apache/sanselan/formats/tiff/TiffField;

    move-result-object v0

    if-eqz v2, :cond_3

    if-eqz v3, :cond_3

    if-eqz v4, :cond_3

    if-nez v0, :cond_1

    goto :goto_0

    .line 289
    :cond_1
    invoke-virtual {v2}, Lorg/apache/sanselan/formats/tiff/TiffField;->getStringValue()Ljava/lang/String;

    move-result-object v6

    .line 290
    invoke-virtual {v3}, Lorg/apache/sanselan/formats/tiff/TiffField;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lorg/apache/sanselan/common/RationalNumber;

    .line 291
    invoke-virtual {v4}, Lorg/apache/sanselan/formats/tiff/TiffField;->getStringValue()Ljava/lang/String;

    move-result-object v7

    .line 293
    invoke-virtual {v0}, Lorg/apache/sanselan/formats/tiff/TiffField;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/apache/sanselan/common/RationalNumber;

    .line 295
    array-length v2, v1

    const/4 v3, 0x3

    if-ne v2, v3, :cond_2

    array-length v2, v0

    if-ne v2, v3, :cond_2

    const/4 v2, 0x0

    .line 299
    aget-object v8, v1, v2

    const/4 v3, 0x1

    .line 300
    aget-object v9, v1, v3

    const/4 v4, 0x2

    .line 301
    aget-object v10, v1, v4

    .line 303
    aget-object v11, v0, v2

    .line 304
    aget-object v12, v0, v3

    .line 305
    aget-object v13, v0, v4

    .line 307
    new-instance v0, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata$GPSInfo;

    move-object v5, v0

    invoke-direct/range {v5 .. v13}, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata$GPSInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Lorg/apache/sanselan/common/RationalNumber;Lorg/apache/sanselan/common/RationalNumber;Lorg/apache/sanselan/common/RationalNumber;Lorg/apache/sanselan/common/RationalNumber;Lorg/apache/sanselan/common/RationalNumber;Lorg/apache/sanselan/common/RationalNumber;)V

    return-object v0

    .line 296
    :cond_2
    new-instance v0, Lorg/apache/sanselan/ImageReadException;

    const-string v1, "Expected three values for latitude and longitude."

    invoke-direct {v0, v1}, Lorg/apache/sanselan/ImageReadException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_0
    return-object v1
.end method

.method public getItems()Ljava/util/ArrayList;
    .locals 4

    .line 174
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 176
    invoke-super {p0}, Lorg/apache/sanselan/common/ImageMetadata;->getItems()Ljava/util/ArrayList;

    move-result-object v1

    const/4 v2, 0x0

    .line 177
    :goto_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_0

    .line 179
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata$Directory;

    .line 180
    invoke-virtual {v3}, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata$Directory;->getItems()Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public getOutputSet()Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageWriteException;
        }
    .end annotation

    .line 206
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata;->contents:Lorg/apache/sanselan/formats/tiff/TiffContents;

    iget-object v0, v0, Lorg/apache/sanselan/formats/tiff/TiffContents;->header:Lorg/apache/sanselan/formats/tiff/TiffHeader;

    iget v0, v0, Lorg/apache/sanselan/formats/tiff/TiffHeader;->byteOrder:I

    .line 207
    new-instance v1, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;

    invoke-direct {v1, v0}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;-><init>(I)V

    .line 209
    invoke-virtual {p0}, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata;->getDirectories()Ljava/util/ArrayList;

    move-result-object v2

    const/4 v3, 0x0

    .line 210
    :goto_0
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v3, v4, :cond_1

    .line 213
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata$Directory;

    .line 215
    iget v5, v4, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata$Directory;->type:I

    invoke-virtual {v1, v5}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->findDirectory(I)Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;

    move-result-object v5

    if-eqz v5, :cond_0

    goto :goto_1

    .line 224
    :cond_0
    invoke-virtual {v4, v0}, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata$Directory;->getOutputDirectory(I)Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;

    move-result-object v4

    .line 225
    invoke-virtual {v1, v4}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->addDirectory(Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;)V

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return-object v1
.end method
