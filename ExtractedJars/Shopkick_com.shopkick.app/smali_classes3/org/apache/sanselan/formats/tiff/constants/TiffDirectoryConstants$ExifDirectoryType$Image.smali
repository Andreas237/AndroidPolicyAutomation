.class public Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType$Image;
.super Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;
.source "TiffDirectoryConstants.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Image"
.end annotation


# direct methods
.method public constructor <init>(ILjava/lang/String;)V
    .locals 0

    .line 57
    invoke-direct {p0, p1, p2}, Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;-><init>(ILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public isImageDirectory()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
