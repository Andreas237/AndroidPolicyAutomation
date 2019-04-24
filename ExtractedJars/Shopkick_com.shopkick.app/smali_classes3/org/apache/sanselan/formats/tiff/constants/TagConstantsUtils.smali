.class public Lorg/apache/sanselan/formats/tiff/constants/TagConstantsUtils;
.super Ljava/lang/Object;
.source "TagConstantsUtils.java"

# interfaces
.implements Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getExifDirectoryType(I)Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;
    .locals 2

    const/4 v0, 0x0

    .line 42
    :goto_0
    sget-object v1, Lorg/apache/sanselan/formats/tiff/constants/TagConstantsUtils;->EXIF_DIRECTORIES:[Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    array-length v1, v1

    if-ge v0, v1, :cond_1

    .line 43
    sget-object v1, Lorg/apache/sanselan/formats/tiff/constants/TagConstantsUtils;->EXIF_DIRECTORIES:[Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    aget-object v1, v1, v0

    iget v1, v1, Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;->directoryType:I

    if-ne v1, p0, :cond_0

    .line 44
    sget-object p0, Lorg/apache/sanselan/formats/tiff/constants/TagConstantsUtils;->EXIF_DIRECTORIES:[Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    aget-object p0, p0, v0

    return-object p0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 45
    :cond_1
    sget-object p0, Lorg/apache/sanselan/formats/tiff/constants/TagConstantsUtils;->EXIF_DIRECTORY_UNKNOWN:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    return-object p0
.end method

.method public static mergeTagLists([[Lorg/apache/sanselan/formats/tiff/constants/TagInfo;)[Lorg/apache/sanselan/formats/tiff/constants/TagInfo;
    .locals 6

    const/4 v0, 0x0

    move v1, v0

    move v2, v1

    .line 25
    :goto_0
    array-length v3, p0

    if-ge v1, v3, :cond_0

    .line 26
    aget-object v3, p0, v1

    array-length v3, v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 28
    :cond_0
    new-array v1, v2, [Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    move v2, v0

    move v3, v2

    .line 31
    :goto_1
    array-length v4, p0

    if-ge v2, v4, :cond_1

    .line 33
    aget-object v4, p0, v2

    aget-object v5, p0, v2

    array-length v5, v5

    invoke-static {v4, v0, v1, v3, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 34
    aget-object v4, p0, v2

    array-length v4, v4

    add-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return-object v1
.end method
