.class final Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless$2;
.super Ljava/lang/Object;
.source "TiffImageWriterLossless.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 261
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 264
    check-cast p1, Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;

    .line 265
    check-cast p2, Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;

    .line 266
    invoke-virtual {p1}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;->getItemLength()I

    move-result p1

    invoke-virtual {p2}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;->getItemLength()I

    move-result p2

    sub-int/2addr p1, p2

    return p1
.end method
