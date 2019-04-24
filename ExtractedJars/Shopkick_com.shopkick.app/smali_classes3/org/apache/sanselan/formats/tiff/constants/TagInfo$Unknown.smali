.class public final Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Unknown;
.super Lorg/apache/sanselan/formats/tiff/constants/TagInfo;
.source "TagInfo.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/sanselan/formats/tiff/constants/TagInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Unknown"
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;I[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;ILorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;)V
    .locals 0

    .line 419
    invoke-direct/range {p0 .. p5}, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;-><init>(Ljava/lang/String;I[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;ILorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;)V

    return-void
.end method


# virtual methods
.method public encodeValue(Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;Ljava/lang/Object;I)[B
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageWriteException;
        }
    .end annotation

    .line 436
    invoke-super {p0, p1, p2, p3}, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->encodeValue(Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;Ljava/lang/Object;I)[B

    move-result-object p1

    return-object p1
.end method

.method public getValue(Lorg/apache/sanselan/formats/tiff/TiffField;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;
        }
    .end annotation

    .line 443
    invoke-super {p0, p1}, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->getValue(Lorg/apache/sanselan/formats/tiff/TiffField;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public isUnknown()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
